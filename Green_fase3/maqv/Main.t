package maqv;
 
import maqv.msp.mspAdaptor;
import maqv.msp.types.*;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.tree.Tree;
import tom.library.utils.Viewer;
import tom.library.sl.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.net.*;

public class Main {
	%include{sl.tom}
	%include{util/HashMap.tom}
	%include{util/types/Collection.tom}
	%include{../genMaqV/maqv/msp/msp.tom}

	private Instrucoes programa;
	private Instrucoes original;
	private Stackk stack;
	private Stackk stackFuncs;
	private String actualFuncName;
	private Map<String,Integer> symbols;
	private ArrayList<Termo> heap;
	private int pc;
	private int numProg;
	private StringBuilder output;
	private static ArrayList<String> arrayEnergy;
	private static ArrayList<String> arrayAutoEnergy;
	private static EnergyThread t;
	private static Boolean iniciarEnergia;


	public static void main(String[] args) throws IOException{
		

		try {
			arrayEnergy = new ArrayList();
			arrayAutoEnergy = new ArrayList();
			iniciarEnergia = false;
			mspLexer lexer = new mspLexer(new ANTLRInputStream(new FileInputStream(args[0])));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			mspParser parser = new mspParser(tokens);
			// Parse the input expression
			Tree b = (Tree) parser.programa().getTree();
			/*System.out.println("Result = " + mspAdaptor.getTerm(b));*/ // name of the Gom module + Adaptor
			Instrucoes p = (Instrucoes) mspAdaptor.getTerm(b);
			Instrucoes original = (Instrucoes) mspAdaptor.getTerm(b);

			Main main = new Main(p, original);
			main.run(p);

			/* Export this representation to .dot file*/
			/*
			try{
				FileWriter out=new FileWriter("gram.dot");
				Viewer.toDot(p,out);
			}
			catch (IOException e){
				System.out.println("ERROR in dot file"); 
			}
			*/
			if (args.length > 1) {
				try {
					PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(args[1], true)));
        			pw.print(main.getOutput());
        			pw.flush(); pw.close();
				}
				catch (IOException e){
					System.err.println("exception: " + e);
					return;
		    	} 
			}
			else {
				System.out.println(main.getOutput());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Main(Instrucoes insts, Instrucoes orig) {
		programa = insts;
		original = orig;
		actualFuncName = "";
		stack = `Stackk();
		stackFuncs = `Stackk();
		heap = new ArrayList<Termo>();
		symbols = new HashMap<String, Integer>();
		pc = 0;
		numProg = 0;
		output = new StringBuilder();
	}
	
	public String getOutput(){
		return output.toString();
	}

	private Instrucoes getNInstr(Instrucoes prog, int progc){
		%match (prog){
			i@Instrucoes(inst,insts*) -> { 
				if (progc == 0) {
					return `i;
				}
				else { return `getNInstr(insts*,progc-1); }
			}
		}
		return `Instrucoes();
	}

	private Instrucoes getCalledFunction(Instrucoes prog, String called){
		%match (prog){
			Instrucoes(Call(id),insts*) -> {
				if(called.equals(`id)){
					return `insts;
				}else{
					return `getCalledFunction(insts*,called);
				}
			}
			Instrucoes(_,insts*) -> { return `getCalledFunction(insts*,called); }
		}
		return `Instrucoes();
	}

	private Instrucoes getNInstr(Instrucoes prog, String callerF, String called){
		%match (prog){
			Instrucoes(ALabel(id),insts*) -> {
				if(callerF.equals(`id)){
					return getCalledFunction(`insts, called);
				}else{
					return `getNInstr(insts*,callerF,called);
				}
			}
			Instrucoes(_,insts*) -> { return `getNInstr(insts*,callerF,called); }
		}
		return `Instrucoes();
	}

	private Instrucoes jmp(Instrucoes prog, String label){
		%match (prog){
			Instrucoes(ALabel(l),insts*) -> {
				if (label.equals(`l)) {
					if(`l.startsWith("f:")){
						actualFuncName = `l;
					}
					return `insts*; 
				}else{
					return `jmp(insts*,label);
				}
			}
			Instrucoes(_,insts*) -> { return `jmp(insts*,label); }
		}
		return `Instrucoes();
	}

	private void pushFuncs(Termo termo){
		%match (stackFuncs){
			Stackk(termos*) -> {
				this.stackFuncs = `Stackk(termo,termos*);
			} 
		}
	}

	private void pushStack(Termo termo){
		%match (stack){
			Stackk(termos*) -> { this.stack = `Stackk(termo,termos*); } 
		}
	}

	private void popFuncs(){
		%match (stackFuncs){
			Stackk(termo1,termos*) -> {
				this.stackFuncs = `Stackk(termos*);
			}
		}
	}

	private void popStack(){
		%match (stack){
			Stackk(termo1,termos*) -> { this.stack = `Stackk(termos*); }
		}
	}

	private Termo topFuncs(){
		%match(stackFuncs){
			Stackk(termo,termos*) -> { return `termo; }
		}
		return `Vazio();
	}

	private Termo topStack() {
		%match(stack){
			Stackk(termo,termos*) -> { return `termo; }
		}
		return `Vazio();
	}

	private void memAlloc(String symbol, int initMemAddress, int size) {
		Integer memAddress = symbols.get(symbol);
		if (memAddress == null) {
			symbols.put(symbol, initMemAddress);
			for (int i = 0; i < size; i++){
				heap.add(initMemAddress + i,`Vazio());
			}
		}
	}

	private int getMemAddress(String symbol) {
		return symbols.get(symbol);
	}

	private Termo getMem(int memAddress) {
		return heap.get(memAddress);
	}

	private void putMem(int memAddress, Termo value) {
		heap.set(memAddress,value);
	}

	private void printa(String str){
		System.out.println(str);
	}

	private void EscreveEnergias(){
		if(arrayEnergy.size()>0){
	     	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
	        Calendar cal = Calendar.getInstance();
			String hora = dateFormat.format(cal.getTime());
			PrintWriter out = null;
			try {
				out = new PrintWriter(new FileWriter("../logs/"+hora+".log"));
				for(int i =0;i<arrayEnergy.size();i++)
					out.println(arrayEnergy.get(i));
			} catch (IOException ex) {
	 				System.out.println("IOException error");
			} finally {
	            out.close();
	       	}

		}

		if(arrayAutoEnergy.size()>0){
	     	
	     	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
	        Calendar cal = Calendar.getInstance();
			String hora = dateFormat.format(cal.getTime());
			PrintWriter out = null;
			try {
				out = new PrintWriter(new FileWriter("../logs/Auto1.log",true));
				for(int i =0;i<arrayAutoEnergy.size();i++)
					out.println(arrayAutoEnergy.get(i));

			} catch (IOException ex) {
	 				System.out.println("IOException error");
			} finally {
	            out.close();
	       	}
	       	

		}

	}

	public void getEnergia(Boolean auto) throws IOException{
		if(auto){
	      	t = new EnergyThread(arrayAutoEnergy);
	      	t.start();
		}else{
	      	t = new EnergyThread(arrayEnergy);
	      	t.start();
		}
	}
	public void add(String id) {
		arrayAutoEnergy.add(id);
	}


	public String run(Instrucoes prog) throws IOException{
		pc++;
		Instrucoes orig = this.original;
		%match (prog){
			Instrucoes(inst,instrs*) -> {
				%match(inst) {
					ALabel(id) -> {
						if(`id.startsWith("f:")){
							actualFuncName=`id;
						}
						return `run(instrs*);
					}
					Call(id) -> {
						`pushFuncs(S(actualFuncName));
						`pushFuncs(S(id));
						prog = `jmp(orig,id);
						if(!iniciarEnergia){
							`add(actualFuncName);
							iniciarEnergia = true;
							getEnergia(true);
						}

						String res = `run(prog);
						return res;
					}
					Energy()->{
						getEnergia(false);
						return `run(instrs*);						  				
					}


					Ret() -> {
						Boolean acabar = false;
						Termo calledLabel = `topFuncs(); 
						`popFuncs();
						Termo callerFLabel = `topFuncs();
						`popFuncs();
						String called = "", callerF = "";
						%match(calledLabel) {
							S(id) -> {
								called = `id;
							}
							I(valor) -> { 
								pc = `valor;
								prog = `getNInstr(orig,valor);
							}
						}


						%match(callerFLabel) {
							S(id) -> {
								if(!`id.equals(called)){
									acabar = true;
								}
								actualFuncName = `id;
								callerF = `id;

							}
						}
						if(acabar){
							iniciarEnergia = false;
							getEnergia(true);
						}

						prog = `getNInstr(orig,callerF,called);
						return `run(prog);
					}
					Add() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1+`v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Sub() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1 - `v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Div() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1 / `v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Mul() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1 * `v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Mod() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								int resultado = `v1 % `v2;
								`pushStack(I(resultado));
								return `run(instrs*);
							}
						}
					}
					Inc() -> {
						Termo t = `topStack();
						`popStack();
						%match(t) {
							I(memAddress) -> { 
								Termo t2 = getMem(`memAddress);
								int valorToInc = 0;
								%match(t2) {
									I(v1) -> { valorToInc = `v1+1; }
								}
								putMem(`memAddress,`I(valorToInc));
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Dec() -> {
						Termo t = `topStack();
						`popStack();
						%match(t) {
							I(memAddress) -> { 
								Termo t2 = getMem(`memAddress);
								int valorToDec = 0;
								%match(t2) {
									I(v1) -> { valorToDec = `v1-1; }
								}
								putMem(`memAddress,`I(valorToDec));
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Eq() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 == `v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Neq() -> { 
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 == `v2) ? `False() : `True();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Gt() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 > `v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					GoEq() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 >= `v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Lt() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 < `v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					LoEq() -> {
						%match (stack){
							Stackk(I(v2),I(v1),resto*) -> { 
								stack = `resto*;
								Boool resultado = (`v1 <=`v2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Nott() -> {
						Termo t = `topStack();
						`popStack();
						%match(t) {
							i@I(v1) -> { `pushStack(i); }
							s@S(v1) -> { `pushStack(s); }
							f@F(v1) -> { `pushStack(f); }
							B(True()) -> { `pushStack(B(False())); }
							B(False()) -> { `pushStack(B(True())); }
						}
						return `run(instrs*);
					}
					Or() -> {
						%match (stack){
							Stackk(B(v2),B(v1),resto*) -> { 
								stack = `resto*;
								boolean valor1 = true, valor2 = true;
								%match (v1){
									True() -> { `valor1 = true; }
									False() -> { `valor1 = false; }
								}
								%match (v2){
									True() -> { `valor2 = true; }
									False() -> { `valor2 = false; }
								}
								Boool resultado = (valor1 || valor2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					And() -> {
						%match (stack){
							Stackk(B(v2),B(v1),resto*) -> { 
								stack = `resto*;
								boolean valor1 = true, valor2 = true;
								%match (v1){
									True() -> { `valor1 = true; }
									False() -> { `valor1 = false; }
								}
								%match (v2){
									True() -> { `valor2 = true; }
									False() -> { `valor2 = false; }
								}
								Boool resultado = (valor1 && valor2) ? `True() : `False();
								`pushStack(B(resultado));
								return `run(instrs*);
							}
						}
					}
					Halt() -> { 
						`EscreveEnergias();
						return "";
					}
					IIn(tipo) -> {
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						try{
							String iin = br.readLine();
							%match(tipo) {
								DInt() -> {
									try{
										int v1 = Integer.parseInt(iin);
										`pushStack(I(v1));
									}catch(NumberFormatException nfe){
										System.err.println("Invalid Format!");
									}
								}
								DChar() -> {
									String s = ""+iin.charAt(0);
									`pushStack(S(s));
								}
								DBoolean() -> {
									if (iin.equalsIgnoreCase("true")) { `pushStack(B(True())); }
									else if (iin.equalsIgnoreCase("false")) { `pushStack(B(False())); }
									else { System.err.println("Invalid Format!"); }
								}
								DFloat() -> {
									try{
										int v1 = Integer.parseInt(iin);
										`pushStack(I(v1));
									}catch(NumberFormatException nfe){
										System.err.println("Invalid Format!");
									}
								}
							}
				       }
				       catch (IOException e){
				    	   System.err.println("exception: " + e);
				       } 
				       return `run(instrs*);
					}
					IOut() -> {
						Termo t = `topStack();
						`popStack();
						%match(t) {
							I(v1) -> { output.append(`v1+"\n"); }
							S(v1) -> { output.append(`v1+"\n"); }
							F(v1) -> { output.append(`v1+"\n"); }
							B(True()) -> { output.append("True"+"\n"); }
							B(False()) -> { output.append("False"+"\n"); }
						}
						return `run(instrs*);
					}
					Jump(id) -> {
						prog = `jmp(orig,id);
						return `run(prog);
					}
					Jumpf(id) -> {
						Termo t = `topStack();
						`popStack();
						%match(t) {
							B(True()) -> { return `run(instrs*); }
							B(False()) -> { 
								prog = `jmp(orig,id);
								return `run(prog);
							}
						}
						return `run(instrs*);
					}
					Push(t) -> {
						`pushStack(t);
						return `run(instrs*);
					}
					Pusha(t) -> {
						%match(t) {
							S(id) -> { 
								int memAddress = getMemAddress(`id);
								`pushStack(I(memAddress));
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Load() -> {
						Termo t = `topStack();
						`popStack();
						%match(t) {
							I(memAddress) -> { 
								Termo t2 = getMem(`memAddress);
								`pushStack(t2);
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Store() -> {
						Termo t = `topStack();
						`popStack();
						Termo t2 = `topStack();
						`popStack();
						%match(t2) {
							I(memAddress) -> { 
								putMem(`memAddress,t);
								
								return `run(instrs*);
							}
						}
						return `run(instrs*);
					}
					Decl(id,initMemAddress,size) -> {
						memAlloc(`id,`initMemAddress,`size);
						return `run(instrs*);
					}
				}
			}
		}
		return "";
	}
}

class EnergyThread implements Runnable {
   private Thread t;
   private ArrayList<String> arrayEnergy = new ArrayList();

   public EnergyThread( ArrayList<String> array){
   		this.arrayEnergy = array;
   }
   public void run() {

		try{
			final Process x = Runtime.getRuntime().exec("sudo java EnergyExample");
			//x.waitFor();
			BufferedReader input = new BufferedReader(new InputStreamReader(x.getInputStream()));
         	String line = null;
            try {
            	while ((line = input.readLine()) != null){
            		arrayEnergy.add(line);                		
            	}
            } catch (IOException e) {
            } 
		} catch( IOException e) {
		}
   }
   
   public void start (){
     	if (t == null){
	        t = new Thread (this);
	        t.start ();
        	while (t.isAlive()) {
            	try {
                	t.join();
            	} catch (InterruptedException ex) {
     				System.out.println("InterruptedException error");
           		}
     		}
      	}
   	}

}
