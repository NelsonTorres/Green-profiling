// $ANTLR 3.2 Sep 23, 2009 12:02:23 gram/i.g 2016-01-19 18:17:25
 package gram; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class iParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Argumento", "ListaArgumentos", "Decl", "ListaDecl", "IntWrap", "SeqInstrucao", "Exp", "Funcao", "Return", "For", "While", "If", "Declaracao", "Atribuicao", "Vazio", "Comentario", "Comentarios", "DVoid", "DFloat", "DBoolean", "DChar", "DInt", "Dec", "Inc", "Empty", "Expressoes", "DEnergia", "Print", "Input", "Comp", "E", "Ou", "Float", "False", "True", "Char", "Int", "Condicional", "IncDepois", "IncAntes", "Call", "Nao", "Neg", "Pos", "Id", "ExpNum", "Sub", "Soma", "Div", "Mult", "Atrib", "Igual", "Dif", "MenorQ", "MaiorQ", "Menor", "Maior", "Mod", "Menos", "Divide", "Vezes", "Mais", "Parametro", "ListaParametros", "INT", "FLOAT", "CHAR", "ID", "COMENTARIO_LINHA", "COMENTARIO_LINHAS", "DIGITO", "SufixoFloat", "LETRA", "WS", "'char'", "'int'", "'boolean'", "'float'", "'void'", "';'", "','", "'='", "'('", "')'", "'if'", "'else'", "'for'", "'while'", "'return'", "'print'", "'energia'", "'input'", "'{'", "'}'", "'?'", "':'", "'||'", "'&&'", "'>'", "'<'", "'>='", "'<='", "'!='", "'=='", "'*='", "'/='", "'+='", "'-='", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'!'", "'true'", "'false'"
    };
    public static final int Funcao=17;
    public static final int Ou=41;
    public static final int False=43;
    public static final int Comp=39;
    public static final int Print=37;
    public static final int Atrib=60;
    public static final int COMENTARIO_LINHA=78;
    public static final int ID=77;
    public static final int DVoid=27;
    public static final int Sub=56;
    public static final int LETRA=82;
    public static final int DInt=31;
    public static final int Argumento=10;
    public static final int ListaDecl=13;
    public static final int Float=42;
    public static final int Pos=53;
    public static final int Soma=57;
    public static final int Id=54;
    public static final int T__126=126;
    public static final int If=21;
    public static final int T__125=125;
    public static final int T__127=127;
    public static final int E=40;
    public static final int CHAR=76;
    public static final int DEnergia=36;
    public static final int Char=45;
    public static final int Igual=61;
    public static final int ListaParametros=73;
    public static final int IntWrap=14;
    public static final int Dif=62;
    public static final int Call=50;
    public static final int DChar=30;
    public static final int IncAntes=49;
    public static final int DFloat=28;
    public static final int MenorQ=63;
    public static final int Div=58;
    public static final int Neg=52;
    public static final int Mult=59;
    public static final int Menor=65;
    public static final int Menos=68;
    public static final int Declaracao=22;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int True=44;
    public static final int Comentarios=26;
    public static final int Divide=69;
    public static final int Input=38;
    public static final int Vezes=70;
    public static final int MaiorQ=64;
    public static final int T__99=99;
    public static final int Vazio=24;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int DBoolean=29;
    public static final int For=19;
    public static final int Maior=66;
    public static final int Condicional=47;
    public static final int Inc=33;
    public static final int Expressoes=35;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__124=124;
    public static final int FLOAT=75;
    public static final int T__123=123;
    public static final int ExpNum=55;
    public static final int T__120=120;
    public static final int DIGITO=80;
    public static final int Int=46;
    public static final int INT=74;
    public static final int COMENTARIO_LINHAS=79;
    public static final int Empty=34;
    public static final int IncDepois=48;
    public static final int T__119=119;
    public static final int T__118=118;
    public static final int Atribuicao=23;
    public static final int T__115=115;
    public static final int WS=83;
    public static final int EOF=-1;
    public static final int T__114=114;
    public static final int Comentario=25;
    public static final int T__117=117;
    public static final int T__116=116;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int Dec=32;
    public static final int Return=18;
    public static final int Mod=67;
    public static final int T__112=112;
    public static final int Parametro=72;
    public static final int Decl=12;
    public static final int While=20;
    public static final int ListaArgumentos=11;
    public static final int SeqInstrucao=15;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int SufixoFloat=81;
    public static final int Mais=71;
    public static final int T__109=109;
    public static final int Exp=16;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int Nao=51;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public iParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public iParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return iParser.tokenNames; }
    public String getGrammarFileName() { return "gram/i.g"; }


    public static class idTipo_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idTipo"
    // gram/i.g:15:1: idTipo : ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) | 'void' -> ^( DVoid ) ) ;
    public final iParser.idTipo_return idTipo() throws RecognitionException {
        iParser.idTipo_return retval = new iParser.idTipo_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal1=null;
        Token string_literal2=null;
        Token string_literal3=null;
        Token string_literal4=null;
        Token string_literal5=null;

        Tree string_literal1_tree=null;
        Tree string_literal2_tree=null;
        Tree string_literal3_tree=null;
        Tree string_literal4_tree=null;
        Tree string_literal5_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");

        try {
            // gram/i.g:15:8: ( ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) | 'void' -> ^( DVoid ) ) )
            // gram/i.g:15:10: ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) | 'void' -> ^( DVoid ) )
            {
            // gram/i.g:15:10: ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) | 'void' -> ^( DVoid ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt1=1;
                }
                break;
            case 85:
                {
                alt1=2;
                }
                break;
            case 86:
                {
                alt1=3;
                }
                break;
            case 87:
                {
                alt1=4;
                }
                break;
            case 88:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // gram/i.g:15:11: 'char'
                    {
                    string_literal1=(Token)match(input,84,FOLLOW_84_in_idTipo56);  
                    stream_84.add(string_literal1);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 15:18: -> ^( DChar )
                    {
                        // gram/i.g:15:21: ^( DChar )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DChar, "DChar"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:15:32: 'int'
                    {
                    string_literal2=(Token)match(input,85,FOLLOW_85_in_idTipo66);  
                    stream_85.add(string_literal2);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 15:38: -> ^( DInt )
                    {
                        // gram/i.g:15:41: ^( DInt )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DInt, "DInt"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:15:51: 'boolean'
                    {
                    string_literal3=(Token)match(input,86,FOLLOW_86_in_idTipo76);  
                    stream_86.add(string_literal3);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 15:61: -> ^( DBoolean )
                    {
                        // gram/i.g:15:64: ^( DBoolean )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DBoolean, "DBoolean"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // gram/i.g:15:78: 'float'
                    {
                    string_literal4=(Token)match(input,87,FOLLOW_87_in_idTipo86);  
                    stream_87.add(string_literal4);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 15:86: -> ^( DFloat )
                    {
                        // gram/i.g:15:89: ^( DFloat )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DFloat, "DFloat"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // gram/i.g:15:101: 'void'
                    {
                    string_literal5=(Token)match(input,88,FOLLOW_88_in_idTipo96);  
                    stream_88.add(string_literal5);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 15:108: -> ^( DVoid )
                    {
                        // gram/i.g:15:111: ^( DVoid )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DVoid, "DVoid"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "idTipo"

    public static class tipo_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tipo"
    // gram/i.g:18:1: tipo : ( INT -> ^( Int INT ) | FLOAT -> ^( Float FLOAT ) | CHAR -> ^( Char CHAR ) | boolean_ -> boolean_ ) ;
    public final iParser.tipo_return tipo() throws RecognitionException {
        iParser.tipo_return retval = new iParser.tipo_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token INT6=null;
        Token FLOAT7=null;
        Token CHAR8=null;
        iParser.boolean__return boolean_9 = null;


        Tree INT6_tree=null;
        Tree FLOAT7_tree=null;
        Tree CHAR8_tree=null;
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_boolean_=new RewriteRuleSubtreeStream(adaptor,"rule boolean_");
        try {
            // gram/i.g:18:6: ( ( INT -> ^( Int INT ) | FLOAT -> ^( Float FLOAT ) | CHAR -> ^( Char CHAR ) | boolean_ -> boolean_ ) )
            // gram/i.g:18:8: ( INT -> ^( Int INT ) | FLOAT -> ^( Float FLOAT ) | CHAR -> ^( Char CHAR ) | boolean_ -> boolean_ )
            {
            // gram/i.g:18:8: ( INT -> ^( Int INT ) | FLOAT -> ^( Float FLOAT ) | CHAR -> ^( Char CHAR ) | boolean_ -> boolean_ )
            int alt2=4;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt2=1;
                }
                break;
            case FLOAT:
                {
                alt2=2;
                }
                break;
            case CHAR:
                {
                alt2=3;
                }
                break;
            case 126:
            case 127:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // gram/i.g:18:9: INT
                    {
                    INT6=(Token)match(input,INT,FOLLOW_INT_in_tipo117);  
                    stream_INT.add(INT6);



                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 18:13: -> ^( Int INT )
                    {
                        // gram/i.g:18:16: ^( Int INT )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Int, "Int"), root_1);

                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:18:29: FLOAT
                    {
                    FLOAT7=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_tipo129);  
                    stream_FLOAT.add(FLOAT7);



                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 18:35: -> ^( Float FLOAT )
                    {
                        // gram/i.g:18:38: ^( Float FLOAT )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Float, "Float"), root_1);

                        adaptor.addChild(root_1, stream_FLOAT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:18:55: CHAR
                    {
                    CHAR8=(Token)match(input,CHAR,FOLLOW_CHAR_in_tipo141);  
                    stream_CHAR.add(CHAR8);



                    // AST REWRITE
                    // elements: CHAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 18:60: -> ^( Char CHAR )
                    {
                        // gram/i.g:18:63: ^( Char CHAR )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Char, "Char"), root_1);

                        adaptor.addChild(root_1, stream_CHAR.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // gram/i.g:18:78: boolean_
                    {
                    pushFollow(FOLLOW_boolean__in_tipo153);
                    boolean_9=boolean_();

                    state._fsp--;

                    stream_boolean_.add(boolean_9.getTree());


                    // AST REWRITE
                    // elements: boolean_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 18:87: -> boolean_
                    {
                        adaptor.addChild(root_0, stream_boolean_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tipo"

    public static class prog_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // gram/i.g:23:1: prog : ( programa )* EOF -> ^( SeqInstrucao ( programa )* ) ;
    public final iParser.prog_return prog() throws RecognitionException {
        iParser.prog_return retval = new iParser.prog_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token EOF11=null;
        iParser.programa_return programa10 = null;


        Tree EOF11_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_programa=new RewriteRuleSubtreeStream(adaptor,"rule programa");
        try {
            // gram/i.g:23:6: ( ( programa )* EOF -> ^( SeqInstrucao ( programa )* ) )
            // gram/i.g:24:2: ( programa )* EOF
            {
            // gram/i.g:24:2: ( programa )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=COMENTARIO_LINHA && LA3_0<=COMENTARIO_LINHAS)||(LA3_0>=84 && LA3_0<=88)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // gram/i.g:24:2: programa
            	    {
            	    pushFollow(FOLLOW_programa_in_prog174);
            	    programa10=programa();

            	    state._fsp--;

            	    stream_programa.add(programa10.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            EOF11=(Token)match(input,EOF,FOLLOW_EOF_in_prog177);  
            stream_EOF.add(EOF11);



            // AST REWRITE
            // elements: programa
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 24:16: -> ^( SeqInstrucao ( programa )* )
            {
                // gram/i.g:24:19: ^( SeqInstrucao ( programa )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(SeqInstrucao, "SeqInstrucao"), root_1);

                // gram/i.g:24:34: ( programa )*
                while ( stream_programa.hasNext() ) {
                    adaptor.addChild(root_1, stream_programa.nextTree());

                }
                stream_programa.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class programa_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "programa"
    // gram/i.g:27:1: programa : ( declaracao ';' -> declaracao | funcao -> funcao ) ;
    public final iParser.programa_return programa() throws RecognitionException {
        iParser.programa_return retval = new iParser.programa_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal13=null;
        iParser.declaracao_return declaracao12 = null;

        iParser.funcao_return funcao14 = null;


        Tree char_literal13_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_funcao=new RewriteRuleSubtreeStream(adaptor,"rule funcao");
        RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
        try {
            // gram/i.g:27:10: ( ( declaracao ';' -> declaracao | funcao -> funcao ) )
            // gram/i.g:28:2: ( declaracao ';' -> declaracao | funcao -> funcao )
            {
            // gram/i.g:28:2: ( declaracao ';' -> declaracao | funcao -> funcao )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // gram/i.g:28:4: declaracao ';'
                    {
                    pushFollow(FOLLOW_declaracao_in_programa201);
                    declaracao12=declaracao();

                    state._fsp--;

                    stream_declaracao.add(declaracao12.getTree());
                    char_literal13=(Token)match(input,89,FOLLOW_89_in_programa203);  
                    stream_89.add(char_literal13);



                    // AST REWRITE
                    // elements: declaracao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 28:19: -> declaracao
                    {
                        adaptor.addChild(root_0, stream_declaracao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:29:4: funcao
                    {
                    pushFollow(FOLLOW_funcao_in_programa212);
                    funcao14=funcao();

                    state._fsp--;

                    stream_funcao.add(funcao14.getTree());


                    // AST REWRITE
                    // elements: funcao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 29:11: -> funcao
                    {
                        adaptor.addChild(root_0, stream_funcao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "programa"

    public static class declaracao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaracao"
    // gram/i.g:33:1: declaracao : c1= comentarios idTipo c2= comentarios dec_nodo (c3= comentarios ',' c4= comentarios dec_nodo )* -> ^( Declaracao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ^( ListaDecl ( dec_nodo )* ) ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ) ;
    public final iParser.declaracao_return declaracao() throws RecognitionException {
        iParser.declaracao_return retval = new iParser.declaracao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal17=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.idTipo_return idTipo15 = null;

        iParser.dec_nodo_return dec_nodo16 = null;

        iParser.dec_nodo_return dec_nodo18 = null;


        Tree char_literal17_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_dec_nodo=new RewriteRuleSubtreeStream(adaptor,"rule dec_nodo");
        RewriteRuleSubtreeStream stream_idTipo=new RewriteRuleSubtreeStream(adaptor,"rule idTipo");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:33:12: (c1= comentarios idTipo c2= comentarios dec_nodo (c3= comentarios ',' c4= comentarios dec_nodo )* -> ^( Declaracao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ^( ListaDecl ( dec_nodo )* ) ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ) )
            // gram/i.g:34:2: c1= comentarios idTipo c2= comentarios dec_nodo (c3= comentarios ',' c4= comentarios dec_nodo )*
            {
            pushFollow(FOLLOW_comentarios_in_declaracao232);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            pushFollow(FOLLOW_idTipo_in_declaracao234);
            idTipo15=idTipo();

            state._fsp--;

            stream_idTipo.add(idTipo15.getTree());
            pushFollow(FOLLOW_comentarios_in_declaracao238);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            pushFollow(FOLLOW_dec_nodo_in_declaracao240);
            dec_nodo16=dec_nodo();

            state._fsp--;

            stream_dec_nodo.add(dec_nodo16.getTree());
            // gram/i.g:34:48: (c3= comentarios ',' c4= comentarios dec_nodo )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=COMENTARIO_LINHA && LA5_0<=COMENTARIO_LINHAS)||LA5_0==90) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // gram/i.g:34:50: c3= comentarios ',' c4= comentarios dec_nodo
            	    {
            	    pushFollow(FOLLOW_comentarios_in_declaracao246);
            	    c3=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c3.getTree());
            	    char_literal17=(Token)match(input,90,FOLLOW_90_in_declaracao248);  
            	    stream_90.add(char_literal17);

            	    pushFollow(FOLLOW_comentarios_in_declaracao252);
            	    c4=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c4.getTree());
            	    pushFollow(FOLLOW_dec_nodo_in_declaracao254);
            	    dec_nodo18=dec_nodo();

            	    state._fsp--;

            	    stream_dec_nodo.add(dec_nodo18.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);



            // AST REWRITE
            // elements: c3, dec_nodo, c1, c4, idTipo, c2
            // token labels: 
            // rule labels: c3, c4, c1, retval, c2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
            RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 34:96: -> ^( Declaracao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ^( ListaDecl ( dec_nodo )* ) ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) )
            {
                // gram/i.g:34:99: ^( Declaracao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ^( ListaDecl ( dec_nodo )* ) ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Declaracao, "Declaracao"), root_1);

                // gram/i.g:34:112: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:34:126: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_idTipo.nextTree());
                // gram/i.g:34:139: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:34:153: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:34:159: ^( ListaDecl ( dec_nodo )* )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ListaDecl, "ListaDecl"), root_2);

                // gram/i.g:34:171: ( dec_nodo )*
                while ( stream_dec_nodo.hasNext() ) {
                    adaptor.addChild(root_2, stream_dec_nodo.nextTree());

                }
                stream_dec_nodo.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:34:182: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:34:196: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:34:202: ^( Comentarios ( $c4)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:34:216: ( $c4)?
                if ( stream_c4.hasNext() ) {
                    adaptor.addChild(root_2, stream_c4.nextTree());

                }
                stream_c4.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaracao"

    public static class dec_nodo_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dec_nodo"
    // gram/i.g:37:1: dec_nodo : ( ID c1= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) ) | ID c1= comentarios '=' c2= comentarios condicao c3= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) ) ) ;
    public final iParser.dec_nodo_return dec_nodo() throws RecognitionException {
        iParser.dec_nodo_return retval = new iParser.dec_nodo_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID19=null;
        Token ID20=null;
        Token char_literal21=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.condicao_return condicao22 = null;


        Tree ID19_tree=null;
        Tree ID20_tree=null;
        Tree char_literal21_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:37:10: ( ( ID c1= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) ) | ID c1= comentarios '=' c2= comentarios condicao c3= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) ) ) )
            // gram/i.g:38:2: ( ID c1= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) ) | ID c1= comentarios '=' c2= comentarios condicao c3= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) ) )
            {
            // gram/i.g:38:2: ( ID c1= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) ) | ID c1= comentarios '=' c2= comentarios condicao c3= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // gram/i.g:38:4: ID c1= comentarios
                    {
                    ID19=(Token)match(input,ID,FOLLOW_ID_in_dec_nodo317);  
                    stream_ID.add(ID19);

                    pushFollow(FOLLOW_comentarios_in_dec_nodo321);
                    c1=comentarios();

                    state._fsp--;

                    stream_comentarios.add(c1.getTree());


                    // AST REWRITE
                    // elements: c1, ID
                    // token labels: 
                    // rule labels: c1, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 38:22: -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) )
                    {
                        // gram/i.g:38:25: ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Decl, "Decl"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // gram/i.g:38:35: ^( Comentarios ( $c1)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:38:49: ( $c1)?
                        if ( stream_c1.hasNext() ) {
                            adaptor.addChild(root_2, stream_c1.nextTree());

                        }
                        stream_c1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:38:55: ^( Comentarios )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, (Tree)adaptor.create(Empty, "Empty"));
                        // gram/i.g:38:76: ^( Comentarios )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:39:4: ID c1= comentarios '=' c2= comentarios condicao c3= comentarios
                    {
                    ID20=(Token)match(input,ID,FOLLOW_ID_in_dec_nodo352);  
                    stream_ID.add(ID20);

                    pushFollow(FOLLOW_comentarios_in_dec_nodo356);
                    c1=comentarios();

                    state._fsp--;

                    stream_comentarios.add(c1.getTree());
                    char_literal21=(Token)match(input,91,FOLLOW_91_in_dec_nodo358);  
                    stream_91.add(char_literal21);

                    pushFollow(FOLLOW_comentarios_in_dec_nodo362);
                    c2=comentarios();

                    state._fsp--;

                    stream_comentarios.add(c2.getTree());
                    pushFollow(FOLLOW_condicao_in_dec_nodo364);
                    condicao22=condicao();

                    state._fsp--;

                    stream_condicao.add(condicao22.getTree());
                    pushFollow(FOLLOW_comentarios_in_dec_nodo368);
                    c3=comentarios();

                    state._fsp--;

                    stream_comentarios.add(c3.getTree());


                    // AST REWRITE
                    // elements: c2, c3, condicao, c1, ID
                    // token labels: 
                    // rule labels: c3, c1, retval, c2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
                    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 39:65: -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) )
                    {
                        // gram/i.g:39:68: ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Decl, "Decl"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // gram/i.g:39:78: ^( Comentarios ( $c1)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:39:92: ( $c1)?
                        if ( stream_c1.hasNext() ) {
                            adaptor.addChild(root_2, stream_c1.nextTree());

                        }
                        stream_c1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:39:98: ^( Comentarios ( $c2)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:39:112: ( $c2)?
                        if ( stream_c2.hasNext() ) {
                            adaptor.addChild(root_2, stream_c2.nextTree());

                        }
                        stream_c2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_condicao.nextTree());
                        // gram/i.g:39:127: ^( Comentarios ( $c3)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:39:141: ( $c3)?
                        if ( stream_c3.hasNext() ) {
                            adaptor.addChild(root_2, stream_c3.nextTree());

                        }
                        stream_c3.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dec_nodo"

    public static class funcao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcao"
    // gram/i.g:43:1: funcao : c1= comentarios idTipo c2= comentarios ID c3= comentarios '(' c4= comentarios ( argumentos )? c5= comentarios ')' c6= comentarios blocoCodigo c7= comentarios -> ^( Funcao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ^( ListaArgumentos ( argumentos )? ) ^( Comentarios ( $c5)? ) ^( Comentarios ( $c6)? ) blocoCodigo ^( Comentarios ( $c7)? ) ) ;
    public final iParser.funcao_return funcao() throws RecognitionException {
        iParser.funcao_return retval = new iParser.funcao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID24=null;
        Token char_literal25=null;
        Token char_literal27=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.comentarios_return c5 = null;

        iParser.comentarios_return c6 = null;

        iParser.comentarios_return c7 = null;

        iParser.idTipo_return idTipo23 = null;

        iParser.argumentos_return argumentos26 = null;

        iParser.blocoCodigo_return blocoCodigo28 = null;


        Tree ID24_tree=null;
        Tree char_literal25_tree=null;
        Tree char_literal27_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_argumentos=new RewriteRuleSubtreeStream(adaptor,"rule argumentos");
        RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
        RewriteRuleSubtreeStream stream_idTipo=new RewriteRuleSubtreeStream(adaptor,"rule idTipo");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:43:8: (c1= comentarios idTipo c2= comentarios ID c3= comentarios '(' c4= comentarios ( argumentos )? c5= comentarios ')' c6= comentarios blocoCodigo c7= comentarios -> ^( Funcao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ^( ListaArgumentos ( argumentos )? ) ^( Comentarios ( $c5)? ) ^( Comentarios ( $c6)? ) blocoCodigo ^( Comentarios ( $c7)? ) ) )
            // gram/i.g:44:2: c1= comentarios idTipo c2= comentarios ID c3= comentarios '(' c4= comentarios ( argumentos )? c5= comentarios ')' c6= comentarios blocoCodigo c7= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_funcao421);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            pushFollow(FOLLOW_idTipo_in_funcao423);
            idTipo23=idTipo();

            state._fsp--;

            stream_idTipo.add(idTipo23.getTree());
            pushFollow(FOLLOW_comentarios_in_funcao427);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            ID24=(Token)match(input,ID,FOLLOW_ID_in_funcao429);  
            stream_ID.add(ID24);

            pushFollow(FOLLOW_comentarios_in_funcao433);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());
            char_literal25=(Token)match(input,92,FOLLOW_92_in_funcao435);  
            stream_92.add(char_literal25);

            pushFollow(FOLLOW_comentarios_in_funcao439);
            c4=comentarios();

            state._fsp--;

            stream_comentarios.add(c4.getTree());
            // gram/i.g:44:76: ( argumentos )?
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // gram/i.g:44:76: argumentos
                    {
                    pushFollow(FOLLOW_argumentos_in_funcao441);
                    argumentos26=argumentos();

                    state._fsp--;

                    stream_argumentos.add(argumentos26.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_comentarios_in_funcao446);
            c5=comentarios();

            state._fsp--;

            stream_comentarios.add(c5.getTree());
            char_literal27=(Token)match(input,93,FOLLOW_93_in_funcao448);  
            stream_93.add(char_literal27);

            pushFollow(FOLLOW_comentarios_in_funcao452);
            c6=comentarios();

            state._fsp--;

            stream_comentarios.add(c6.getTree());
            pushFollow(FOLLOW_blocoCodigo_in_funcao454);
            blocoCodigo28=blocoCodigo();

            state._fsp--;

            stream_blocoCodigo.add(blocoCodigo28.getTree());
            pushFollow(FOLLOW_comentarios_in_funcao458);
            c7=comentarios();

            state._fsp--;

            stream_comentarios.add(c7.getTree());


            // AST REWRITE
            // elements: c4, c5, blocoCodigo, idTipo, c2, c7, c6, c3, c1, ID, argumentos
            // token labels: 
            // rule labels: c3, c4, c5, c6, c7, c1, retval, c2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
            RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
            RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.tree:null);
            RewriteRuleSubtreeStream stream_c6=new RewriteRuleSubtreeStream(adaptor,"rule c6",c6!=null?c6.tree:null);
            RewriteRuleSubtreeStream stream_c7=new RewriteRuleSubtreeStream(adaptor,"rule c7",c7!=null?c7.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 44:149: -> ^( Funcao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ^( ListaArgumentos ( argumentos )? ) ^( Comentarios ( $c5)? ) ^( Comentarios ( $c6)? ) blocoCodigo ^( Comentarios ( $c7)? ) )
            {
                // gram/i.g:44:152: ^( Funcao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ^( ListaArgumentos ( argumentos )? ) ^( Comentarios ( $c5)? ) ^( Comentarios ( $c6)? ) blocoCodigo ^( Comentarios ( $c7)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Funcao, "Funcao"), root_1);

                // gram/i.g:44:161: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:44:175: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_idTipo.nextTree());
                // gram/i.g:44:188: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:44:202: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_ID.nextNode());
                // gram/i.g:44:211: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:44:225: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:44:231: ^( Comentarios ( $c4)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:44:245: ( $c4)?
                if ( stream_c4.hasNext() ) {
                    adaptor.addChild(root_2, stream_c4.nextTree());

                }
                stream_c4.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:44:251: ^( ListaArgumentos ( argumentos )? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ListaArgumentos, "ListaArgumentos"), root_2);

                // gram/i.g:44:269: ( argumentos )?
                if ( stream_argumentos.hasNext() ) {
                    adaptor.addChild(root_2, stream_argumentos.nextTree());

                }
                stream_argumentos.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:44:282: ^( Comentarios ( $c5)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:44:296: ( $c5)?
                if ( stream_c5.hasNext() ) {
                    adaptor.addChild(root_2, stream_c5.nextTree());

                }
                stream_c5.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:44:302: ^( Comentarios ( $c6)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:44:316: ( $c6)?
                if ( stream_c6.hasNext() ) {
                    adaptor.addChild(root_2, stream_c6.nextTree());

                }
                stream_c6.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_blocoCodigo.nextTree());
                // gram/i.g:44:334: ^( Comentarios ( $c7)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:44:348: ( $c7)?
                if ( stream_c7.hasNext() ) {
                    adaptor.addChild(root_2, stream_c7.nextTree());

                }
                stream_c7.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funcao"

    public static class argumentos_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argumentos"
    // gram/i.g:47:1: argumentos : argumento ( ',' argumento )* -> ( argumento )+ ;
    public final iParser.argumentos_return argumentos() throws RecognitionException {
        iParser.argumentos_return retval = new iParser.argumentos_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal30=null;
        iParser.argumento_return argumento29 = null;

        iParser.argumento_return argumento31 = null;


        Tree char_literal30_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_argumento=new RewriteRuleSubtreeStream(adaptor,"rule argumento");
        try {
            // gram/i.g:47:12: ( argumento ( ',' argumento )* -> ( argumento )+ )
            // gram/i.g:48:2: argumento ( ',' argumento )*
            {
            pushFollow(FOLLOW_argumento_in_argumentos547);
            argumento29=argumento();

            state._fsp--;

            stream_argumento.add(argumento29.getTree());
            // gram/i.g:48:12: ( ',' argumento )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==90) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // gram/i.g:48:14: ',' argumento
            	    {
            	    char_literal30=(Token)match(input,90,FOLLOW_90_in_argumentos551);  
            	    stream_90.add(char_literal30);

            	    pushFollow(FOLLOW_argumento_in_argumentos553);
            	    argumento31=argumento();

            	    state._fsp--;

            	    stream_argumento.add(argumento31.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);



            // AST REWRITE
            // elements: argumento
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 48:31: -> ( argumento )+
            {
                if ( !(stream_argumento.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_argumento.hasNext() ) {
                    adaptor.addChild(root_0, stream_argumento.nextTree());

                }
                stream_argumento.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argumentos"

    public static class argumento_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argumento"
    // gram/i.g:51:1: argumento : c1= comentarios idTipo c2= comentarios ID c3= comentarios -> ^( Argumento ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ) ;
    public final iParser.argumento_return argumento() throws RecognitionException {
        iParser.argumento_return retval = new iParser.argumento_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID33=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.idTipo_return idTipo32 = null;


        Tree ID33_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_idTipo=new RewriteRuleSubtreeStream(adaptor,"rule idTipo");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:51:11: (c1= comentarios idTipo c2= comentarios ID c3= comentarios -> ^( Argumento ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ) )
            // gram/i.g:52:2: c1= comentarios idTipo c2= comentarios ID c3= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_argumento575);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            pushFollow(FOLLOW_idTipo_in_argumento577);
            idTipo32=idTipo();

            state._fsp--;

            stream_idTipo.add(idTipo32.getTree());
            pushFollow(FOLLOW_comentarios_in_argumento581);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            ID33=(Token)match(input,ID,FOLLOW_ID_in_argumento583);  
            stream_ID.add(ID33);

            pushFollow(FOLLOW_comentarios_in_argumento587);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());


            // AST REWRITE
            // elements: c2, c1, idTipo, ID, c3
            // token labels: 
            // rule labels: c3, c1, retval, c2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 52:57: -> ^( Argumento ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) )
            {
                // gram/i.g:52:60: ^( Argumento ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Argumento, "Argumento"), root_1);

                // gram/i.g:52:72: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:52:86: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_idTipo.nextTree());
                // gram/i.g:52:99: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:52:113: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_ID.nextNode());
                // gram/i.g:52:122: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:52:136: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argumento"

    public static class instrucao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instrucao"
    // gram/i.g:57:1: instrucao : ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ | energia_ ';' -> energia_ ) ;
    public final iParser.instrucao_return instrucao() throws RecognitionException {
        iParser.instrucao_return retval = new iParser.instrucao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal38=null;
        Token char_literal40=null;
        Token char_literal42=null;
        Token char_literal44=null;
        iParser.if__return if_34 = null;

        iParser.for__return for_35 = null;

        iParser.while__return while_36 = null;

        iParser.return__return return_37 = null;

        iParser.call_return call39 = null;

        iParser.print__return print_41 = null;

        iParser.energia__return energia_43 = null;


        Tree char_literal38_tree=null;
        Tree char_literal40_tree=null;
        Tree char_literal42_tree=null;
        Tree char_literal44_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
        RewriteRuleSubtreeStream stream_energia_=new RewriteRuleSubtreeStream(adaptor,"rule energia_");
        RewriteRuleSubtreeStream stream_if_=new RewriteRuleSubtreeStream(adaptor,"rule if_");
        RewriteRuleSubtreeStream stream_print_=new RewriteRuleSubtreeStream(adaptor,"rule print_");
        RewriteRuleSubtreeStream stream_while_=new RewriteRuleSubtreeStream(adaptor,"rule while_");
        RewriteRuleSubtreeStream stream_for_=new RewriteRuleSubtreeStream(adaptor,"rule for_");
        RewriteRuleSubtreeStream stream_return_=new RewriteRuleSubtreeStream(adaptor,"rule return_");
        try {
            // gram/i.g:57:11: ( ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ | energia_ ';' -> energia_ ) )
            // gram/i.g:58:2: ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ | energia_ ';' -> energia_ )
            {
            // gram/i.g:58:2: ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ | energia_ ';' -> energia_ )
            int alt9=7;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // gram/i.g:58:3: if_
                    {
                    pushFollow(FOLLOW_if__in_instrucao637);
                    if_34=if_();

                    state._fsp--;

                    stream_if_.add(if_34.getTree());


                    // AST REWRITE
                    // elements: if_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 58:7: -> if_
                    {
                        adaptor.addChild(root_0, stream_if_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:58:16: for_
                    {
                    pushFollow(FOLLOW_for__in_instrucao645);
                    for_35=for_();

                    state._fsp--;

                    stream_for_.add(for_35.getTree());


                    // AST REWRITE
                    // elements: for_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 58:21: -> for_
                    {
                        adaptor.addChild(root_0, stream_for_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:58:31: while_
                    {
                    pushFollow(FOLLOW_while__in_instrucao653);
                    while_36=while_();

                    state._fsp--;

                    stream_while_.add(while_36.getTree());


                    // AST REWRITE
                    // elements: while_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 58:38: -> while_
                    {
                        adaptor.addChild(root_0, stream_while_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // gram/i.g:58:50: return_ ';'
                    {
                    pushFollow(FOLLOW_return__in_instrucao661);
                    return_37=return_();

                    state._fsp--;

                    stream_return_.add(return_37.getTree());
                    char_literal38=(Token)match(input,89,FOLLOW_89_in_instrucao663);  
                    stream_89.add(char_literal38);



                    // AST REWRITE
                    // elements: return_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 58:62: -> return_
                    {
                        adaptor.addChild(root_0, stream_return_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // gram/i.g:58:75: call ';'
                    {
                    pushFollow(FOLLOW_call_in_instrucao671);
                    call39=call();

                    state._fsp--;

                    stream_call.add(call39.getTree());
                    char_literal40=(Token)match(input,89,FOLLOW_89_in_instrucao673);  
                    stream_89.add(char_literal40);



                    // AST REWRITE
                    // elements: call
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 58:84: -> ^( Exp call )
                    {
                        // gram/i.g:58:87: ^( Exp call )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Exp, "Exp"), root_1);

                        adaptor.addChild(root_1, stream_call.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // gram/i.g:58:101: print_ ';'
                    {
                    pushFollow(FOLLOW_print__in_instrucao685);
                    print_41=print_();

                    state._fsp--;

                    stream_print_.add(print_41.getTree());
                    char_literal42=(Token)match(input,89,FOLLOW_89_in_instrucao687);  
                    stream_89.add(char_literal42);



                    // AST REWRITE
                    // elements: print_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 58:112: -> print_
                    {
                        adaptor.addChild(root_0, stream_print_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // gram/i.g:58:124: energia_ ';'
                    {
                    pushFollow(FOLLOW_energia__in_instrucao695);
                    energia_43=energia_();

                    state._fsp--;

                    stream_energia_.add(energia_43.getTree());
                    char_literal44=(Token)match(input,89,FOLLOW_89_in_instrucao697);  
                    stream_89.add(char_literal44);



                    // AST REWRITE
                    // elements: energia_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 58:137: -> energia_
                    {
                        adaptor.addChild(root_0, stream_energia_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instrucao"

    public static class if__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_"
    // gram/i.g:61:1: if_ : c1= comentarios 'if' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo ( else_ -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ ) | -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) ) ) ;
    public final iParser.if__return if_() throws RecognitionException {
        iParser.if__return retval = new iParser.if__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal45=null;
        Token char_literal46=null;
        Token char_literal48=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.comentarios_return c5 = null;

        iParser.condicao_return condicao47 = null;

        iParser.blocoCodigo_return blocoCodigo49 = null;

        iParser.else__return else_50 = null;


        Tree string_literal45_tree=null;
        Tree char_literal46_tree=null;
        Tree char_literal48_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:61:6: (c1= comentarios 'if' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo ( else_ -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ ) | -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) ) ) )
            // gram/i.g:62:2: c1= comentarios 'if' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo ( else_ -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ ) | -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) ) )
            {
            pushFollow(FOLLOW_comentarios_in_if_716);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            string_literal45=(Token)match(input,94,FOLLOW_94_in_if_718);  
            stream_94.add(string_literal45);

            pushFollow(FOLLOW_comentarios_in_if_722);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            char_literal46=(Token)match(input,92,FOLLOW_92_in_if_724);  
            stream_92.add(char_literal46);

            pushFollow(FOLLOW_comentarios_in_if_728);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());
            pushFollow(FOLLOW_condicao_in_if_730);
            condicao47=condicao();

            state._fsp--;

            stream_condicao.add(condicao47.getTree());
            pushFollow(FOLLOW_comentarios_in_if_734);
            c4=comentarios();

            state._fsp--;

            stream_comentarios.add(c4.getTree());
            char_literal48=(Token)match(input,93,FOLLOW_93_in_if_736);  
            stream_93.add(char_literal48);

            pushFollow(FOLLOW_comentarios_in_if_740);
            c5=comentarios();

            state._fsp--;

            stream_comentarios.add(c5.getTree());
            pushFollow(FOLLOW_blocoCodigo_in_if_742);
            blocoCodigo49=blocoCodigo();

            state._fsp--;

            stream_blocoCodigo.add(blocoCodigo49.getTree());
            // gram/i.g:62:111: ( else_ -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ ) | -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==95) ) {
                alt10=1;
            }
            else if ( (LA10_0==EOF||(LA10_0>=INT && LA10_0<=COMENTARIO_LINHAS)||(LA10_0>=84 && LA10_0<=94)||(LA10_0>=96 && LA10_0<=127)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // gram/i.g:62:113: else_
                    {
                    pushFollow(FOLLOW_else__in_if_746);
                    else_50=else_();

                    state._fsp--;

                    stream_else_.add(else_50.getTree());


                    // AST REWRITE
                    // elements: c2, blocoCodigo, c3, condicao, c4, c1, else_, c5
                    // token labels: 
                    // rule labels: c3, c4, c5, c1, retval, c2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
                    RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
                    RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.tree:null);
                    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 62:119: -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ )
                    {
                        // gram/i.g:62:122: ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(If, "If"), root_1);

                        // gram/i.g:62:127: ^( Comentarios ( $c1)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:62:141: ( $c1)?
                        if ( stream_c1.hasNext() ) {
                            adaptor.addChild(root_2, stream_c1.nextTree());

                        }
                        stream_c1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:62:147: ^( Comentarios ( $c2)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:62:161: ( $c2)?
                        if ( stream_c2.hasNext() ) {
                            adaptor.addChild(root_2, stream_c2.nextTree());

                        }
                        stream_c2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:62:167: ^( Comentarios ( $c3)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:62:181: ( $c3)?
                        if ( stream_c3.hasNext() ) {
                            adaptor.addChild(root_2, stream_c3.nextTree());

                        }
                        stream_c3.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_condicao.nextTree());
                        // gram/i.g:62:196: ^( Comentarios ( $c4)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:62:210: ( $c4)?
                        if ( stream_c4.hasNext() ) {
                            adaptor.addChild(root_2, stream_c4.nextTree());

                        }
                        stream_c4.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:62:216: ^( Comentarios ( $c5)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:62:230: ( $c5)?
                        if ( stream_c5.hasNext() ) {
                            adaptor.addChild(root_2, stream_c5.nextTree());

                        }
                        stream_c5.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_blocoCodigo.nextTree());
                        adaptor.addChild(root_1, stream_else_.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:63:25: 
                    {

                    // AST REWRITE
                    // elements: condicao, c2, c4, blocoCodigo, c5, c1, c3
                    // token labels: 
                    // rule labels: c3, c4, c5, c1, retval, c2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
                    RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
                    RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.tree:null);
                    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 63:25: -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) )
                    {
                        // gram/i.g:63:28: ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(If, "If"), root_1);

                        // gram/i.g:63:33: ^( Comentarios ( $c1)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:63:47: ( $c1)?
                        if ( stream_c1.hasNext() ) {
                            adaptor.addChild(root_2, stream_c1.nextTree());

                        }
                        stream_c1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:63:53: ^( Comentarios ( $c2)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:63:67: ( $c2)?
                        if ( stream_c2.hasNext() ) {
                            adaptor.addChild(root_2, stream_c2.nextTree());

                        }
                        stream_c2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:63:73: ^( Comentarios ( $c3)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:63:87: ( $c3)?
                        if ( stream_c3.hasNext() ) {
                            adaptor.addChild(root_2, stream_c3.nextTree());

                        }
                        stream_c3.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_condicao.nextTree());
                        // gram/i.g:63:102: ^( Comentarios ( $c4)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:63:116: ( $c4)?
                        if ( stream_c4.hasNext() ) {
                            adaptor.addChild(root_2, stream_c4.nextTree());

                        }
                        stream_c4.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:63:122: ^( Comentarios ( $c5)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:63:136: ( $c5)?
                        if ( stream_c5.hasNext() ) {
                            adaptor.addChild(root_2, stream_c5.nextTree());

                        }
                        stream_c5.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_blocoCodigo.nextTree());
                        // gram/i.g:63:154: ^( SeqInstrucao )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(SeqInstrucao, "SeqInstrucao"), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_"

    public static class else__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "else_"
    // gram/i.g:67:1: else_ : 'else' ( blocoCodigo -> blocoCodigo | if_ -> if_ ) ;
    public final iParser.else__return else_() throws RecognitionException {
        iParser.else__return retval = new iParser.else__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal51=null;
        iParser.blocoCodigo_return blocoCodigo52 = null;

        iParser.if__return if_53 = null;


        Tree string_literal51_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleSubtreeStream stream_if_=new RewriteRuleSubtreeStream(adaptor,"rule if_");
        RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
        try {
            // gram/i.g:67:7: ( 'else' ( blocoCodigo -> blocoCodigo | if_ -> if_ ) )
            // gram/i.g:68:2: 'else' ( blocoCodigo -> blocoCodigo | if_ -> if_ )
            {
            string_literal51=(Token)match(input,95,FOLLOW_95_in_else_912);  
            stream_95.add(string_literal51);

            // gram/i.g:68:9: ( blocoCodigo -> blocoCodigo | if_ -> if_ )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==102) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=COMENTARIO_LINHA && LA11_0<=COMENTARIO_LINHAS)||LA11_0==94) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // gram/i.g:68:11: blocoCodigo
                    {
                    pushFollow(FOLLOW_blocoCodigo_in_else_916);
                    blocoCodigo52=blocoCodigo();

                    state._fsp--;

                    stream_blocoCodigo.add(blocoCodigo52.getTree());


                    // AST REWRITE
                    // elements: blocoCodigo
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 68:23: -> blocoCodigo
                    {
                        adaptor.addChild(root_0, stream_blocoCodigo.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:68:40: if_
                    {
                    pushFollow(FOLLOW_if__in_else_924);
                    if_53=if_();

                    state._fsp--;

                    stream_if_.add(if_53.getTree());


                    // AST REWRITE
                    // elements: if_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 68:44: -> if_
                    {
                        adaptor.addChild(root_0, stream_if_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "else_"

    public static class for__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_"
    // gram/i.g:71:1: for_ : c1= comentarios 'for' c2= comentarios '(' for_declaracao ';' c3= comentarios condicao c4= comentarios ';' c5= comentarios expressao c6= comentarios ')' c7= comentarios blocoCodigo c8= comentarios -> ^( For ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) for_declaracao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) expressao ^( Comentarios ( $c6)? ) ^( Comentarios ( $c7)? ) blocoCodigo ^( Comentarios ( $c8)? ) ) ;
    public final iParser.for__return for_() throws RecognitionException {
        iParser.for__return retval = new iParser.for__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal54=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token char_literal59=null;
        Token char_literal61=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.comentarios_return c5 = null;

        iParser.comentarios_return c6 = null;

        iParser.comentarios_return c7 = null;

        iParser.comentarios_return c8 = null;

        iParser.for_declaracao_return for_declaracao56 = null;

        iParser.condicao_return condicao58 = null;

        iParser.expressao_return expressao60 = null;

        iParser.blocoCodigo_return blocoCodigo62 = null;


        Tree string_literal54_tree=null;
        Tree char_literal55_tree=null;
        Tree char_literal57_tree=null;
        Tree char_literal59_tree=null;
        Tree char_literal61_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        RewriteRuleSubtreeStream stream_for_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule for_declaracao");
        RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:71:6: (c1= comentarios 'for' c2= comentarios '(' for_declaracao ';' c3= comentarios condicao c4= comentarios ';' c5= comentarios expressao c6= comentarios ')' c7= comentarios blocoCodigo c8= comentarios -> ^( For ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) for_declaracao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) expressao ^( Comentarios ( $c6)? ) ^( Comentarios ( $c7)? ) blocoCodigo ^( Comentarios ( $c8)? ) ) )
            // gram/i.g:72:2: c1= comentarios 'for' c2= comentarios '(' for_declaracao ';' c3= comentarios condicao c4= comentarios ';' c5= comentarios expressao c6= comentarios ')' c7= comentarios blocoCodigo c8= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_for_944);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            string_literal54=(Token)match(input,96,FOLLOW_96_in_for_946);  
            stream_96.add(string_literal54);

            pushFollow(FOLLOW_comentarios_in_for_950);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            char_literal55=(Token)match(input,92,FOLLOW_92_in_for_952);  
            stream_92.add(char_literal55);

            pushFollow(FOLLOW_for_declaracao_in_for_954);
            for_declaracao56=for_declaracao();

            state._fsp--;

            stream_for_declaracao.add(for_declaracao56.getTree());
            char_literal57=(Token)match(input,89,FOLLOW_89_in_for_956);  
            stream_89.add(char_literal57);

            pushFollow(FOLLOW_comentarios_in_for_960);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());
            pushFollow(FOLLOW_condicao_in_for_962);
            condicao58=condicao();

            state._fsp--;

            stream_condicao.add(condicao58.getTree());
            pushFollow(FOLLOW_comentarios_in_for_966);
            c4=comentarios();

            state._fsp--;

            stream_comentarios.add(c4.getTree());
            char_literal59=(Token)match(input,89,FOLLOW_89_in_for_968);  
            stream_89.add(char_literal59);

            pushFollow(FOLLOW_comentarios_in_for_972);
            c5=comentarios();

            state._fsp--;

            stream_comentarios.add(c5.getTree());
            pushFollow(FOLLOW_expressao_in_for_974);
            expressao60=expressao();

            state._fsp--;

            stream_expressao.add(expressao60.getTree());
            pushFollow(FOLLOW_comentarios_in_for_978);
            c6=comentarios();

            state._fsp--;

            stream_comentarios.add(c6.getTree());
            char_literal61=(Token)match(input,93,FOLLOW_93_in_for_980);  
            stream_93.add(char_literal61);

            pushFollow(FOLLOW_comentarios_in_for_984);
            c7=comentarios();

            state._fsp--;

            stream_comentarios.add(c7.getTree());
            pushFollow(FOLLOW_blocoCodigo_in_for_986);
            blocoCodigo62=blocoCodigo();

            state._fsp--;

            stream_blocoCodigo.add(blocoCodigo62.getTree());
            pushFollow(FOLLOW_comentarios_in_for_990);
            c8=comentarios();

            state._fsp--;

            stream_comentarios.add(c8.getTree());


            // AST REWRITE
            // elements: expressao, c8, c1, condicao, c6, c7, blocoCodigo, c3, c2, c5, for_declaracao, c4
            // token labels: 
            // rule labels: c3, c4, c5, c6, c7, c8, c1, retval, c2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
            RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
            RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.tree:null);
            RewriteRuleSubtreeStream stream_c6=new RewriteRuleSubtreeStream(adaptor,"rule c6",c6!=null?c6.tree:null);
            RewriteRuleSubtreeStream stream_c7=new RewriteRuleSubtreeStream(adaptor,"rule c7",c7!=null?c7.tree:null);
            RewriteRuleSubtreeStream stream_c8=new RewriteRuleSubtreeStream(adaptor,"rule c8",c8!=null?c8.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 72:190: -> ^( For ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) for_declaracao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) expressao ^( Comentarios ( $c6)? ) ^( Comentarios ( $c7)? ) blocoCodigo ^( Comentarios ( $c8)? ) )
            {
                // gram/i.g:72:193: ^( For ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) for_declaracao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) expressao ^( Comentarios ( $c6)? ) ^( Comentarios ( $c7)? ) blocoCodigo ^( Comentarios ( $c8)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(For, "For"), root_1);

                // gram/i.g:72:199: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:72:213: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:72:219: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:72:233: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_for_declaracao.nextTree());
                // gram/i.g:72:254: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:72:268: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_condicao.nextTree());
                // gram/i.g:72:283: ^( Comentarios ( $c4)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:72:297: ( $c4)?
                if ( stream_c4.hasNext() ) {
                    adaptor.addChild(root_2, stream_c4.nextTree());

                }
                stream_c4.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:72:303: ^( Comentarios ( $c5)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:72:317: ( $c5)?
                if ( stream_c5.hasNext() ) {
                    adaptor.addChild(root_2, stream_c5.nextTree());

                }
                stream_c5.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_expressao.nextTree());
                // gram/i.g:72:333: ^( Comentarios ( $c6)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:72:347: ( $c6)?
                if ( stream_c6.hasNext() ) {
                    adaptor.addChild(root_2, stream_c6.nextTree());

                }
                stream_c6.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:72:353: ^( Comentarios ( $c7)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:72:367: ( $c7)?
                if ( stream_c7.hasNext() ) {
                    adaptor.addChild(root_2, stream_c7.nextTree());

                }
                stream_c7.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_blocoCodigo.nextTree());
                // gram/i.g:72:385: ^( Comentarios ( $c8)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:72:399: ( $c8)?
                if ( stream_c8.hasNext() ) {
                    adaptor.addChild(root_2, stream_c8.nextTree());

                }
                stream_c8.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "for_"

    public static class for_declaracao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_declaracao"
    // gram/i.g:75:1: for_declaracao : ( declaracao -> declaracao | atribuicao -> atribuicao ) ;
    public final iParser.for_declaracao_return for_declaracao() throws RecognitionException {
        iParser.for_declaracao_return retval = new iParser.for_declaracao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        iParser.declaracao_return declaracao63 = null;

        iParser.atribuicao_return atribuicao64 = null;


        RewriteRuleSubtreeStream stream_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule atribuicao");
        RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
        try {
            // gram/i.g:75:16: ( ( declaracao -> declaracao | atribuicao -> atribuicao ) )
            // gram/i.g:76:2: ( declaracao -> declaracao | atribuicao -> atribuicao )
            {
            // gram/i.g:76:2: ( declaracao -> declaracao | atribuicao -> atribuicao )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // gram/i.g:76:4: declaracao
                    {
                    pushFollow(FOLLOW_declaracao_in_for_declaracao1082);
                    declaracao63=declaracao();

                    state._fsp--;

                    stream_declaracao.add(declaracao63.getTree());


                    // AST REWRITE
                    // elements: declaracao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 76:15: -> declaracao
                    {
                        adaptor.addChild(root_0, stream_declaracao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:77:4: atribuicao
                    {
                    pushFollow(FOLLOW_atribuicao_in_for_declaracao1091);
                    atribuicao64=atribuicao();

                    state._fsp--;

                    stream_atribuicao.add(atribuicao64.getTree());


                    // AST REWRITE
                    // elements: atribuicao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 77:15: -> atribuicao
                    {
                        adaptor.addChild(root_0, stream_atribuicao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "for_declaracao"

    public static class while__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_"
    // gram/i.g:81:1: while_ : c1= comentarios 'while' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo c6= comentarios -> ^( While ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( Comentarios ( $c6)? ) ) ;
    public final iParser.while__return while_() throws RecognitionException {
        iParser.while__return retval = new iParser.while__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal65=null;
        Token char_literal66=null;
        Token char_literal68=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.comentarios_return c5 = null;

        iParser.comentarios_return c6 = null;

        iParser.condicao_return condicao67 = null;

        iParser.blocoCodigo_return blocoCodigo69 = null;


        Tree string_literal65_tree=null;
        Tree char_literal66_tree=null;
        Tree char_literal68_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:81:8: (c1= comentarios 'while' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo c6= comentarios -> ^( While ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( Comentarios ( $c6)? ) ) )
            // gram/i.g:82:2: c1= comentarios 'while' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo c6= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_while_1114);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            string_literal65=(Token)match(input,97,FOLLOW_97_in_while_1116);  
            stream_97.add(string_literal65);

            pushFollow(FOLLOW_comentarios_in_while_1120);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            char_literal66=(Token)match(input,92,FOLLOW_92_in_while_1122);  
            stream_92.add(char_literal66);

            pushFollow(FOLLOW_comentarios_in_while_1126);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());
            pushFollow(FOLLOW_condicao_in_while_1128);
            condicao67=condicao();

            state._fsp--;

            stream_condicao.add(condicao67.getTree());
            pushFollow(FOLLOW_comentarios_in_while_1132);
            c4=comentarios();

            state._fsp--;

            stream_comentarios.add(c4.getTree());
            char_literal68=(Token)match(input,93,FOLLOW_93_in_while_1134);  
            stream_93.add(char_literal68);

            pushFollow(FOLLOW_comentarios_in_while_1138);
            c5=comentarios();

            state._fsp--;

            stream_comentarios.add(c5.getTree());
            pushFollow(FOLLOW_blocoCodigo_in_while_1140);
            blocoCodigo69=blocoCodigo();

            state._fsp--;

            stream_blocoCodigo.add(blocoCodigo69.getTree());
            pushFollow(FOLLOW_comentarios_in_while_1144);
            c6=comentarios();

            state._fsp--;

            stream_comentarios.add(c6.getTree());


            // AST REWRITE
            // elements: c5, blocoCodigo, c2, c3, c4, condicao, c1, c6
            // token labels: 
            // rule labels: c3, c4, c5, c6, c1, retval, c2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
            RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
            RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.tree:null);
            RewriteRuleSubtreeStream stream_c6=new RewriteRuleSubtreeStream(adaptor,"rule c6",c6!=null?c6.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 82:129: -> ^( While ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( Comentarios ( $c6)? ) )
            {
                // gram/i.g:82:132: ^( While ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( Comentarios ( $c6)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(While, "While"), root_1);

                // gram/i.g:82:140: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:82:154: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:82:160: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:82:174: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:82:180: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:82:194: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_condicao.nextTree());
                // gram/i.g:82:209: ^( Comentarios ( $c4)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:82:223: ( $c4)?
                if ( stream_c4.hasNext() ) {
                    adaptor.addChild(root_2, stream_c4.nextTree());

                }
                stream_c4.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:82:229: ^( Comentarios ( $c5)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:82:243: ( $c5)?
                if ( stream_c5.hasNext() ) {
                    adaptor.addChild(root_2, stream_c5.nextTree());

                }
                stream_c5.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_blocoCodigo.nextTree());
                // gram/i.g:82:261: ^( Comentarios ( $c6)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:82:275: ( $c6)?
                if ( stream_c6.hasNext() ) {
                    adaptor.addChild(root_2, stream_c6.nextTree());

                }
                stream_c6.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "while_"

    public static class return__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "return_"
    // gram/i.g:85:1: return_ : c1= comentarios 'return' c2= comentarios expressao c3= comentarios -> ^( Return ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ) ;
    public final iParser.return__return return_() throws RecognitionException {
        iParser.return__return retval = new iParser.return__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal70=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.expressao_return expressao71 = null;


        Tree string_literal70_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:85:10: (c1= comentarios 'return' c2= comentarios expressao c3= comentarios -> ^( Return ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ) )
            // gram/i.g:86:2: c1= comentarios 'return' c2= comentarios expressao c3= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_return_1218);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            string_literal70=(Token)match(input,98,FOLLOW_98_in_return_1220);  
            stream_98.add(string_literal70);

            pushFollow(FOLLOW_comentarios_in_return_1224);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            pushFollow(FOLLOW_expressao_in_return_1226);
            expressao71=expressao();

            state._fsp--;

            stream_expressao.add(expressao71.getTree());
            pushFollow(FOLLOW_comentarios_in_return_1230);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());


            // AST REWRITE
            // elements: expressao, c2, c1, c3
            // token labels: 
            // rule labels: c3, c1, retval, c2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 86:66: -> ^( Return ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) )
            {
                // gram/i.g:86:69: ^( Return ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Return, "Return"), root_1);

                // gram/i.g:86:78: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:86:92: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:86:98: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:86:112: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_expressao.nextTree());
                // gram/i.g:86:128: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:86:142: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "return_"

    public static class call_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // gram/i.g:89:1: call : c1= comentarios ID c2= comentarios '(' c3= comentarios ( parametros )? c4= comentarios ')' c5= comentarios -> ^( Call ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) ^( ListaParametros ( parametros )? ) ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) ;
    public final iParser.call_return call() throws RecognitionException {
        iParser.call_return retval = new iParser.call_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID72=null;
        Token char_literal73=null;
        Token char_literal75=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.comentarios_return c5 = null;

        iParser.parametros_return parametros74 = null;


        Tree ID72_tree=null;
        Tree char_literal73_tree=null;
        Tree char_literal75_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        RewriteRuleSubtreeStream stream_parametros=new RewriteRuleSubtreeStream(adaptor,"rule parametros");
        try {
            // gram/i.g:89:6: (c1= comentarios ID c2= comentarios '(' c3= comentarios ( parametros )? c4= comentarios ')' c5= comentarios -> ^( Call ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) ^( ListaParametros ( parametros )? ) ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) )
            // gram/i.g:90:2: c1= comentarios ID c2= comentarios '(' c3= comentarios ( parametros )? c4= comentarios ')' c5= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_call1278);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            ID72=(Token)match(input,ID,FOLLOW_ID_in_call1280);  
            stream_ID.add(ID72);

            pushFollow(FOLLOW_comentarios_in_call1285);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            char_literal73=(Token)match(input,92,FOLLOW_92_in_call1287);  
            stream_92.add(char_literal73);

            pushFollow(FOLLOW_comentarios_in_call1291);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());
            // gram/i.g:90:55: ( parametros )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // gram/i.g:90:55: parametros
                    {
                    pushFollow(FOLLOW_parametros_in_call1293);
                    parametros74=parametros();

                    state._fsp--;

                    stream_parametros.add(parametros74.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_comentarios_in_call1298);
            c4=comentarios();

            state._fsp--;

            stream_comentarios.add(c4.getTree());
            char_literal75=(Token)match(input,93,FOLLOW_93_in_call1300);  
            stream_93.add(char_literal75);

            pushFollow(FOLLOW_comentarios_in_call1304);
            c5=comentarios();

            state._fsp--;

            stream_comentarios.add(c5.getTree());


            // AST REWRITE
            // elements: c3, c5, ID, c4, c2, c1, parametros
            // token labels: 
            // rule labels: c3, c4, c5, c1, retval, c2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
            RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
            RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 90:101: -> ^( Call ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) ^( ListaParametros ( parametros )? ) ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) )
            {
                // gram/i.g:90:104: ^( Call ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) ^( ListaParametros ( parametros )? ) ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Call, "Call"), root_1);

                // gram/i.g:90:111: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:90:125: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_ID.nextNode());
                // gram/i.g:90:134: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:90:148: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:90:154: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:90:168: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:90:174: ^( ListaParametros ( parametros )? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ListaParametros, "ListaParametros"), root_2);

                // gram/i.g:90:192: ( parametros )?
                if ( stream_parametros.hasNext() ) {
                    adaptor.addChild(root_2, stream_parametros.nextTree());

                }
                stream_parametros.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:90:205: ^( Comentarios ( $c4)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:90:219: ( $c4)?
                if ( stream_c4.hasNext() ) {
                    adaptor.addChild(root_2, stream_c4.nextTree());

                }
                stream_c4.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:90:225: ^( Comentarios ( $c5)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:90:239: ( $c5)?
                if ( stream_c5.hasNext() ) {
                    adaptor.addChild(root_2, stream_c5.nextTree());

                }
                stream_c5.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class print__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print_"
    // gram/i.g:93:1: print_ : c1= comentarios 'print' c2= comentarios '(' c3= comentarios expressao c4= comentarios ')' c5= comentarios -> ^( Exp ^( Print ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) expressao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) ) ;
    public final iParser.print__return print_() throws RecognitionException {
        iParser.print__return retval = new iParser.print__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal76=null;
        Token char_literal77=null;
        Token char_literal79=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.comentarios_return c5 = null;

        iParser.expressao_return expressao78 = null;


        Tree string_literal76_tree=null;
        Tree char_literal77_tree=null;
        Tree char_literal79_tree=null;
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:93:8: (c1= comentarios 'print' c2= comentarios '(' c3= comentarios expressao c4= comentarios ')' c5= comentarios -> ^( Exp ^( Print ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) expressao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) ) )
            // gram/i.g:94:2: c1= comentarios 'print' c2= comentarios '(' c3= comentarios expressao c4= comentarios ')' c5= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_print_1372);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            string_literal76=(Token)match(input,99,FOLLOW_99_in_print_1374);  
            stream_99.add(string_literal76);

            pushFollow(FOLLOW_comentarios_in_print_1378);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            char_literal77=(Token)match(input,92,FOLLOW_92_in_print_1380);  
            stream_92.add(char_literal77);

            pushFollow(FOLLOW_comentarios_in_print_1384);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());
            pushFollow(FOLLOW_expressao_in_print_1386);
            expressao78=expressao();

            state._fsp--;

            stream_expressao.add(expressao78.getTree());
            pushFollow(FOLLOW_comentarios_in_print_1390);
            c4=comentarios();

            state._fsp--;

            stream_comentarios.add(c4.getTree());
            char_literal79=(Token)match(input,93,FOLLOW_93_in_print_1392);  
            stream_93.add(char_literal79);

            pushFollow(FOLLOW_comentarios_in_print_1396);
            c5=comentarios();

            state._fsp--;

            stream_comentarios.add(c5.getTree());


            // AST REWRITE
            // elements: c1, c2, expressao, c5, c4, c3
            // token labels: 
            // rule labels: c3, c4, c5, c1, retval, c2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
            RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
            RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 94:103: -> ^( Exp ^( Print ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) expressao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) )
            {
                // gram/i.g:94:106: ^( Exp ^( Print ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) expressao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Exp, "Exp"), root_1);

                // gram/i.g:94:112: ^( Print ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) expressao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Print, "Print"), root_2);

                // gram/i.g:94:120: ^( Comentarios ( $c1)? )
                {
                Tree root_3 = (Tree)adaptor.nil();
                root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);

                // gram/i.g:94:134: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_3, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_2, root_3);
                }
                // gram/i.g:94:140: ^( Comentarios ( $c2)? )
                {
                Tree root_3 = (Tree)adaptor.nil();
                root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);

                // gram/i.g:94:154: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_3, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_2, root_3);
                }
                // gram/i.g:94:160: ^( Comentarios ( $c3)? )
                {
                Tree root_3 = (Tree)adaptor.nil();
                root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);

                // gram/i.g:94:174: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_3, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, stream_expressao.nextTree());
                // gram/i.g:94:190: ^( Comentarios ( $c4)? )
                {
                Tree root_3 = (Tree)adaptor.nil();
                root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);

                // gram/i.g:94:204: ( $c4)?
                if ( stream_c4.hasNext() ) {
                    adaptor.addChild(root_3, stream_c4.nextTree());

                }
                stream_c4.reset();

                adaptor.addChild(root_2, root_3);
                }
                // gram/i.g:94:210: ^( Comentarios ( $c5)? )
                {
                Tree root_3 = (Tree)adaptor.nil();
                root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);

                // gram/i.g:94:224: ( $c5)?
                if ( stream_c5.hasNext() ) {
                    adaptor.addChild(root_3, stream_c5.nextTree());

                }
                stream_c5.reset();

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "print_"

    public static class energia__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "energia_"
    // gram/i.g:97:1: energia_ : c1= comentarios 'energia' c2= comentarios '(' c3= comentarios ')' c4= comentarios -> ^( Exp ^( DEnergia ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ) ) ;
    public final iParser.energia__return energia_() throws RecognitionException {
        iParser.energia__return retval = new iParser.energia__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal80=null;
        Token char_literal81=null;
        Token char_literal82=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;


        Tree string_literal80_tree=null;
        Tree char_literal81_tree=null;
        Tree char_literal82_tree=null;
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:97:10: (c1= comentarios 'energia' c2= comentarios '(' c3= comentarios ')' c4= comentarios -> ^( Exp ^( DEnergia ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ) ) )
            // gram/i.g:98:2: c1= comentarios 'energia' c2= comentarios '(' c3= comentarios ')' c4= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_energia_1462);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            string_literal80=(Token)match(input,100,FOLLOW_100_in_energia_1464);  
            stream_100.add(string_literal80);

            pushFollow(FOLLOW_comentarios_in_energia_1468);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            char_literal81=(Token)match(input,92,FOLLOW_92_in_energia_1470);  
            stream_92.add(char_literal81);

            pushFollow(FOLLOW_comentarios_in_energia_1474);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());
            char_literal82=(Token)match(input,93,FOLLOW_93_in_energia_1476);  
            stream_93.add(char_literal82);

            pushFollow(FOLLOW_comentarios_in_energia_1480);
            c4=comentarios();

            state._fsp--;

            stream_comentarios.add(c4.getTree());


            // AST REWRITE
            // elements: c1, c2, c4, c3
            // token labels: 
            // rule labels: c3, c4, c1, retval, c2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
            RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 98:80: -> ^( Exp ^( DEnergia ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ) )
            {
                // gram/i.g:98:83: ^( Exp ^( DEnergia ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Exp, "Exp"), root_1);

                // gram/i.g:98:89: ^( DEnergia ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DEnergia, "DEnergia"), root_2);

                // gram/i.g:98:100: ^( Comentarios ( $c1)? )
                {
                Tree root_3 = (Tree)adaptor.nil();
                root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);

                // gram/i.g:98:114: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_3, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_2, root_3);
                }
                // gram/i.g:98:120: ^( Comentarios ( $c2)? )
                {
                Tree root_3 = (Tree)adaptor.nil();
                root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);

                // gram/i.g:98:134: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_3, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_2, root_3);
                }
                // gram/i.g:98:140: ^( Comentarios ( $c3)? )
                {
                Tree root_3 = (Tree)adaptor.nil();
                root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);

                // gram/i.g:98:154: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_3, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_2, root_3);
                }
                // gram/i.g:98:160: ^( Comentarios ( $c4)? )
                {
                Tree root_3 = (Tree)adaptor.nil();
                root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);

                // gram/i.g:98:174: ( $c4)?
                if ( stream_c4.hasNext() ) {
                    adaptor.addChild(root_3, stream_c4.nextTree());

                }
                stream_c4.reset();

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "energia_"

    public static class input__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "input_"
    // gram/i.g:101:1: input_ : c1= comentarios 'input' c2= comentarios '(' c3= comentarios idTipo c4= comentarios ')' c5= comentarios -> ^( Input ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) idTipo ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) ;
    public final iParser.input__return input_() throws RecognitionException {
        iParser.input__return retval = new iParser.input__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal83=null;
        Token char_literal84=null;
        Token char_literal86=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.comentarios_return c5 = null;

        iParser.idTipo_return idTipo85 = null;


        Tree string_literal83_tree=null;
        Tree char_literal84_tree=null;
        Tree char_literal86_tree=null;
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_idTipo=new RewriteRuleSubtreeStream(adaptor,"rule idTipo");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:101:8: (c1= comentarios 'input' c2= comentarios '(' c3= comentarios idTipo c4= comentarios ')' c5= comentarios -> ^( Input ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) idTipo ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) )
            // gram/i.g:102:2: c1= comentarios 'input' c2= comentarios '(' c3= comentarios idTipo c4= comentarios ')' c5= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_input_1537);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            string_literal83=(Token)match(input,101,FOLLOW_101_in_input_1539);  
            stream_101.add(string_literal83);

            pushFollow(FOLLOW_comentarios_in_input_1543);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            char_literal84=(Token)match(input,92,FOLLOW_92_in_input_1545);  
            stream_92.add(char_literal84);

            pushFollow(FOLLOW_comentarios_in_input_1549);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());
            pushFollow(FOLLOW_idTipo_in_input_1551);
            idTipo85=idTipo();

            state._fsp--;

            stream_idTipo.add(idTipo85.getTree());
            pushFollow(FOLLOW_comentarios_in_input_1555);
            c4=comentarios();

            state._fsp--;

            stream_comentarios.add(c4.getTree());
            char_literal86=(Token)match(input,93,FOLLOW_93_in_input_1557);  
            stream_93.add(char_literal86);

            pushFollow(FOLLOW_comentarios_in_input_1561);
            c5=comentarios();

            state._fsp--;

            stream_comentarios.add(c5.getTree());


            // AST REWRITE
            // elements: c2, c5, c1, c4, idTipo, c3
            // token labels: 
            // rule labels: c3, c4, c5, c1, retval, c2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
            RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
            RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 102:100: -> ^( Input ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) idTipo ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) )
            {
                // gram/i.g:102:103: ^( Input ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) idTipo ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Input, "Input"), root_1);

                // gram/i.g:102:111: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:102:125: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:102:131: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:102:145: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:102:151: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:102:165: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_idTipo.nextTree());
                // gram/i.g:102:178: ^( Comentarios ( $c4)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:102:192: ( $c4)?
                if ( stream_c4.hasNext() ) {
                    adaptor.addChild(root_2, stream_c4.nextTree());

                }
                stream_c4.reset();

                adaptor.addChild(root_1, root_2);
                }
                // gram/i.g:102:198: ^( Comentarios ( $c5)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:102:212: ( $c5)?
                if ( stream_c5.hasNext() ) {
                    adaptor.addChild(root_2, stream_c5.nextTree());

                }
                stream_c5.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "input_"

    public static class parametros_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parametros"
    // gram/i.g:105:1: parametros : parametro ( ',' parametro )* -> ( parametro )+ ;
    public final iParser.parametros_return parametros() throws RecognitionException {
        iParser.parametros_return retval = new iParser.parametros_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal88=null;
        iParser.parametro_return parametro87 = null;

        iParser.parametro_return parametro89 = null;


        Tree char_literal88_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_parametro=new RewriteRuleSubtreeStream(adaptor,"rule parametro");
        try {
            // gram/i.g:105:12: ( parametro ( ',' parametro )* -> ( parametro )+ )
            // gram/i.g:106:2: parametro ( ',' parametro )*
            {
            pushFollow(FOLLOW_parametro_in_parametros1621);
            parametro87=parametro();

            state._fsp--;

            stream_parametro.add(parametro87.getTree());
            // gram/i.g:106:12: ( ',' parametro )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==90) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // gram/i.g:106:14: ',' parametro
            	    {
            	    char_literal88=(Token)match(input,90,FOLLOW_90_in_parametros1625);  
            	    stream_90.add(char_literal88);

            	    pushFollow(FOLLOW_parametro_in_parametros1627);
            	    parametro89=parametro();

            	    state._fsp--;

            	    stream_parametro.add(parametro89.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);



            // AST REWRITE
            // elements: parametro
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 106:30: -> ( parametro )+
            {
                if ( !(stream_parametro.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_parametro.hasNext() ) {
                    adaptor.addChild(root_0, stream_parametro.nextTree());

                }
                stream_parametro.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parametros"

    public static class parametro_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parametro"
    // gram/i.g:109:1: parametro : c1= comentarios expressao c2= comentarios -> ^( Parametro ^( Comentarios ( $c1)? ) expressao ^( Comentarios ( $c2)? ) ) ;
    public final iParser.parametro_return parametro() throws RecognitionException {
        iParser.parametro_return retval = new iParser.parametro_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.expressao_return expressao90 = null;


        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:109:11: (c1= comentarios expressao c2= comentarios -> ^( Parametro ^( Comentarios ( $c1)? ) expressao ^( Comentarios ( $c2)? ) ) )
            // gram/i.g:110:2: c1= comentarios expressao c2= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_parametro1648);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            pushFollow(FOLLOW_expressao_in_parametro1650);
            expressao90=expressao();

            state._fsp--;

            stream_expressao.add(expressao90.getTree());
            pushFollow(FOLLOW_comentarios_in_parametro1654);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());


            // AST REWRITE
            // elements: expressao, c2, c1
            // token labels: 
            // rule labels: c1, retval, c2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 110:42: -> ^( Parametro ^( Comentarios ( $c1)? ) expressao ^( Comentarios ( $c2)? ) )
            {
                // gram/i.g:110:45: ^( Parametro ^( Comentarios ( $c1)? ) expressao ^( Comentarios ( $c2)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Parametro, "Parametro"), root_1);

                // gram/i.g:110:57: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:110:71: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_expressao.nextTree());
                // gram/i.g:110:87: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:110:101: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parametro"

    public static class blocoCodigo_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blocoCodigo"
    // gram/i.g:113:1: blocoCodigo : '{' ( codigo )* '}' -> ^( SeqInstrucao ( codigo )* ) ;
    public final iParser.blocoCodigo_return blocoCodigo() throws RecognitionException {
        iParser.blocoCodigo_return retval = new iParser.blocoCodigo_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal91=null;
        Token char_literal93=null;
        iParser.codigo_return codigo92 = null;


        Tree char_literal91_tree=null;
        Tree char_literal93_tree=null;
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_codigo=new RewriteRuleSubtreeStream(adaptor,"rule codigo");
        try {
            // gram/i.g:113:13: ( '{' ( codigo )* '}' -> ^( SeqInstrucao ( codigo )* ) )
            // gram/i.g:114:2: '{' ( codigo )* '}'
            {
            char_literal91=(Token)match(input,102,FOLLOW_102_in_blocoCodigo1690);  
            stream_102.add(char_literal91);

            // gram/i.g:114:6: ( codigo )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=ID && LA15_0<=COMENTARIO_LINHAS)||(LA15_0>=84 && LA15_0<=88)||LA15_0==94||(LA15_0>=96 && LA15_0<=100)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // gram/i.g:114:6: codigo
            	    {
            	    pushFollow(FOLLOW_codigo_in_blocoCodigo1692);
            	    codigo92=codigo();

            	    state._fsp--;

            	    stream_codigo.add(codigo92.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            char_literal93=(Token)match(input,103,FOLLOW_103_in_blocoCodigo1695);  
            stream_103.add(char_literal93);



            // AST REWRITE
            // elements: codigo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 114:18: -> ^( SeqInstrucao ( codigo )* )
            {
                // gram/i.g:114:21: ^( SeqInstrucao ( codigo )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(SeqInstrucao, "SeqInstrucao"), root_1);

                // gram/i.g:114:36: ( codigo )*
                while ( stream_codigo.hasNext() ) {
                    adaptor.addChild(root_1, stream_codigo.nextTree());

                }
                stream_codigo.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "blocoCodigo"

    public static class codigo_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "codigo"
    // gram/i.g:117:1: codigo : ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao ) ;
    public final iParser.codigo_return codigo() throws RecognitionException {
        iParser.codigo_return retval = new iParser.codigo_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal95=null;
        Token char_literal97=null;
        iParser.atribuicao_return atribuicao94 = null;

        iParser.declaracao_return declaracao96 = null;

        iParser.instrucao_return instrucao98 = null;


        Tree char_literal95_tree=null;
        Tree char_literal97_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule atribuicao");
        RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
        RewriteRuleSubtreeStream stream_instrucao=new RewriteRuleSubtreeStream(adaptor,"rule instrucao");
        try {
            // gram/i.g:117:8: ( ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao ) )
            // gram/i.g:118:2: ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao )
            {
            // gram/i.g:118:2: ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // gram/i.g:118:4: atribuicao ';'
                    {
                    pushFollow(FOLLOW_atribuicao_in_codigo1717);
                    atribuicao94=atribuicao();

                    state._fsp--;

                    stream_atribuicao.add(atribuicao94.getTree());
                    char_literal95=(Token)match(input,89,FOLLOW_89_in_codigo1719);  
                    stream_89.add(char_literal95);



                    // AST REWRITE
                    // elements: atribuicao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 118:19: -> atribuicao
                    {
                        adaptor.addChild(root_0, stream_atribuicao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:119:4: declaracao ';'
                    {
                    pushFollow(FOLLOW_declaracao_in_codigo1728);
                    declaracao96=declaracao();

                    state._fsp--;

                    stream_declaracao.add(declaracao96.getTree());
                    char_literal97=(Token)match(input,89,FOLLOW_89_in_codigo1730);  
                    stream_89.add(char_literal97);



                    // AST REWRITE
                    // elements: declaracao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 119:19: -> declaracao
                    {
                        adaptor.addChild(root_0, stream_declaracao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:120:4: instrucao
                    {
                    pushFollow(FOLLOW_instrucao_in_codigo1739);
                    instrucao98=instrucao();

                    state._fsp--;

                    stream_instrucao.add(instrucao98.getTree());


                    // AST REWRITE
                    // elements: instrucao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 120:14: -> instrucao
                    {
                        adaptor.addChild(root_0, stream_instrucao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "codigo"

    public static class condicao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condicao"
    // gram/i.g:127:1: condicao : condicao_ou (c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao ) | -> condicao_ou ) ;
    public final iParser.condicao_return condicao() throws RecognitionException {
        iParser.condicao_return retval = new iParser.condicao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal100=null;
        Token char_literal102=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.condicao_ou_return condicao_ou99 = null;

        iParser.expressao_return expressao101 = null;

        iParser.condicao_return condicao103 = null;


        Tree char_literal100_tree=null;
        Tree char_literal102_tree=null;
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleSubtreeStream stream_condicao_ou=new RewriteRuleSubtreeStream(adaptor,"rule condicao_ou");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:127:11: ( condicao_ou (c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao ) | -> condicao_ou ) )
            // gram/i.g:128:2: condicao_ou (c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao ) | -> condicao_ou )
            {
            pushFollow(FOLLOW_condicao_ou_in_condicao1762);
            condicao_ou99=condicao_ou();

            state._fsp--;

            stream_condicao_ou.add(condicao_ou99.getTree());
            // gram/i.g:128:14: (c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao ) | -> condicao_ou )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // gram/i.g:128:16: c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao
                    {
                    pushFollow(FOLLOW_comentarios_in_condicao1768);
                    c1=comentarios();

                    state._fsp--;

                    stream_comentarios.add(c1.getTree());
                    char_literal100=(Token)match(input,104,FOLLOW_104_in_condicao1770);  
                    stream_104.add(char_literal100);

                    pushFollow(FOLLOW_comentarios_in_condicao1774);
                    c2=comentarios();

                    state._fsp--;

                    stream_comentarios.add(c2.getTree());
                    pushFollow(FOLLOW_expressao_in_condicao1776);
                    expressao101=expressao();

                    state._fsp--;

                    stream_expressao.add(expressao101.getTree());
                    pushFollow(FOLLOW_comentarios_in_condicao1780);
                    c3=comentarios();

                    state._fsp--;

                    stream_comentarios.add(c3.getTree());
                    char_literal102=(Token)match(input,105,FOLLOW_105_in_condicao1782);  
                    stream_105.add(char_literal102);

                    pushFollow(FOLLOW_comentarios_in_condicao1786);
                    c4=comentarios();

                    state._fsp--;

                    stream_comentarios.add(c4.getTree());
                    pushFollow(FOLLOW_condicao_in_condicao1788);
                    condicao103=condicao();

                    state._fsp--;

                    stream_condicao.add(condicao103.getTree());


                    // AST REWRITE
                    // elements: condicao_ou, expressao, c3, c1, c2, condicao, c4
                    // token labels: 
                    // rule labels: c3, c4, c1, retval, c2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
                    RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
                    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 128:103: -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao )
                    {
                        // gram/i.g:128:106: ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Condicional, "Condicional"), root_1);

                        adaptor.addChild(root_1, stream_condicao_ou.nextTree());
                        // gram/i.g:128:132: ^( Comentarios ( $c1)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:128:146: ( $c1)?
                        if ( stream_c1.hasNext() ) {
                            adaptor.addChild(root_2, stream_c1.nextTree());

                        }
                        stream_c1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:128:152: ^( Comentarios ( $c2)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:128:166: ( $c2)?
                        if ( stream_c2.hasNext() ) {
                            adaptor.addChild(root_2, stream_c2.nextTree());

                        }
                        stream_c2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_expressao.nextTree());
                        // gram/i.g:128:182: ^( Comentarios ( $c3)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:128:196: ( $c3)?
                        if ( stream_c3.hasNext() ) {
                            adaptor.addChild(root_2, stream_c3.nextTree());

                        }
                        stream_c3.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // gram/i.g:128:202: ^( Comentarios ( $c4)? )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                        // gram/i.g:128:216: ( $c4)?
                        if ( stream_c4.hasNext() ) {
                            adaptor.addChild(root_2, stream_c4.nextTree());

                        }
                        stream_c4.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_condicao.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:129:7: 
                    {

                    // AST REWRITE
                    // elements: condicao_ou
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 129:7: -> condicao_ou
                    {
                        adaptor.addChild(root_0, stream_condicao_ou.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condicao"

    public static class condicao_ou_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condicao_ou"
    // gram/i.g:133:1: condicao_ou : ( condicao_e -> condicao_e ) (c1= comentarios '||' c2= comentarios c= condicao_e -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )* ;
    public final iParser.condicao_ou_return condicao_ou() throws RecognitionException {
        iParser.condicao_ou_return retval = new iParser.condicao_ou_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal105=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.condicao_e_return c = null;

        iParser.condicao_e_return condicao_e104 = null;


        Tree string_literal105_tree=null;
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_condicao_e=new RewriteRuleSubtreeStream(adaptor,"rule condicao_e");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:133:13: ( ( condicao_e -> condicao_e ) (c1= comentarios '||' c2= comentarios c= condicao_e -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )* )
            // gram/i.g:134:2: ( condicao_e -> condicao_e ) (c1= comentarios '||' c2= comentarios c= condicao_e -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*
            {
            // gram/i.g:134:2: ( condicao_e -> condicao_e )
            // gram/i.g:134:3: condicao_e
            {
            pushFollow(FOLLOW_condicao_e_in_condicao_ou1862);
            condicao_e104=condicao_e();

            state._fsp--;

            stream_condicao_e.add(condicao_e104.getTree());


            // AST REWRITE
            // elements: condicao_e
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 134:14: -> condicao_e
            {
                adaptor.addChild(root_0, stream_condicao_e.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:134:29: (c1= comentarios '||' c2= comentarios c= condicao_e -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // gram/i.g:134:31: c1= comentarios '||' c2= comentarios c= condicao_e
            	    {
            	    pushFollow(FOLLOW_comentarios_in_condicao_ou1873);
            	    c1=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c1.getTree());
            	    string_literal105=(Token)match(input,106,FOLLOW_106_in_condicao_ou1875);  
            	    stream_106.add(string_literal105);

            	    pushFollow(FOLLOW_comentarios_in_condicao_ou1879);
            	    c2=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c2.getTree());
            	    pushFollow(FOLLOW_condicao_e_in_condicao_ou1883);
            	    c=condicao_e();

            	    state._fsp--;

            	    stream_condicao_e.add(c.getTree());


            	    // AST REWRITE
            	    // elements: condicao_ou, c1, c2, c
            	    // token labels: 
            	    // rule labels: c, c1, retval, c2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            	    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	    root_0 = (Tree)adaptor.nil();
            	    // 134:79: -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c)
            	    {
            	        // gram/i.g:134:82: ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c)
            	        {
            	        Tree root_1 = (Tree)adaptor.nil();
            	        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Ou, "Ou"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        // gram/i.g:134:100: ^( Comentarios ( $c1)? )
            	        {
            	        Tree root_2 = (Tree)adaptor.nil();
            	        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	        // gram/i.g:134:114: ( $c1)?
            	        if ( stream_c1.hasNext() ) {
            	            adaptor.addChild(root_2, stream_c1.nextTree());

            	        }
            	        stream_c1.reset();

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // gram/i.g:134:120: ^( Comentarios ( $c2)? )
            	        {
            	        Tree root_2 = (Tree)adaptor.nil();
            	        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	        // gram/i.g:134:134: ( $c2)?
            	        if ( stream_c2.hasNext() ) {
            	            adaptor.addChild(root_2, stream_c2.nextTree());

            	        }
            	        stream_c2.reset();

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        adaptor.addChild(root_1, stream_c.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condicao_ou"

    public static class condicao_e_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condicao_e"
    // gram/i.g:137:1: condicao_e : ( condicao_comparacao -> condicao_comparacao ) (c1= comentarios '&&' c2= comentarios c= condicao_comparacao -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )* ;
    public final iParser.condicao_e_return condicao_e() throws RecognitionException {
        iParser.condicao_e_return retval = new iParser.condicao_e_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal107=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.condicao_comparacao_return c = null;

        iParser.condicao_comparacao_return condicao_comparacao106 = null;


        Tree string_literal107_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleSubtreeStream stream_condicao_comparacao=new RewriteRuleSubtreeStream(adaptor,"rule condicao_comparacao");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:137:12: ( ( condicao_comparacao -> condicao_comparacao ) (c1= comentarios '&&' c2= comentarios c= condicao_comparacao -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )* )
            // gram/i.g:138:2: ( condicao_comparacao -> condicao_comparacao ) (c1= comentarios '&&' c2= comentarios c= condicao_comparacao -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*
            {
            // gram/i.g:138:2: ( condicao_comparacao -> condicao_comparacao )
            // gram/i.g:138:3: condicao_comparacao
            {
            pushFollow(FOLLOW_condicao_comparacao_in_condicao_e1928);
            condicao_comparacao106=condicao_comparacao();

            state._fsp--;

            stream_condicao_comparacao.add(condicao_comparacao106.getTree());


            // AST REWRITE
            // elements: condicao_comparacao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 138:23: -> condicao_comparacao
            {
                adaptor.addChild(root_0, stream_condicao_comparacao.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:138:47: (c1= comentarios '&&' c2= comentarios c= condicao_comparacao -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // gram/i.g:138:49: c1= comentarios '&&' c2= comentarios c= condicao_comparacao
            	    {
            	    pushFollow(FOLLOW_comentarios_in_condicao_e1939);
            	    c1=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c1.getTree());
            	    string_literal107=(Token)match(input,107,FOLLOW_107_in_condicao_e1941);  
            	    stream_107.add(string_literal107);

            	    pushFollow(FOLLOW_comentarios_in_condicao_e1945);
            	    c2=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c2.getTree());
            	    pushFollow(FOLLOW_condicao_comparacao_in_condicao_e1949);
            	    c=condicao_comparacao();

            	    state._fsp--;

            	    stream_condicao_comparacao.add(c.getTree());


            	    // AST REWRITE
            	    // elements: c1, c, c2, condicao_e
            	    // token labels: 
            	    // rule labels: c, c1, retval, c2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            	    RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	    root_0 = (Tree)adaptor.nil();
            	    // 138:106: -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c)
            	    {
            	        // gram/i.g:138:109: ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c)
            	        {
            	        Tree root_1 = (Tree)adaptor.nil();
            	        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(E, "E"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        // gram/i.g:138:125: ^( Comentarios ( $c1)? )
            	        {
            	        Tree root_2 = (Tree)adaptor.nil();
            	        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	        // gram/i.g:138:139: ( $c1)?
            	        if ( stream_c1.hasNext() ) {
            	            adaptor.addChild(root_2, stream_c1.nextTree());

            	        }
            	        stream_c1.reset();

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // gram/i.g:138:145: ^( Comentarios ( $c2)? )
            	        {
            	        Tree root_2 = (Tree)adaptor.nil();
            	        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	        // gram/i.g:138:159: ( $c2)?
            	        if ( stream_c2.hasNext() ) {
            	            adaptor.addChild(root_2, stream_c2.nextTree());

            	        }
            	        stream_c2.reset();

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        adaptor.addChild(root_1, stream_c.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condicao_e"

    public static class condicao_comparacao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condicao_comparacao"
    // gram/i.g:141:1: condicao_comparacao : ( condicao_igualdade -> condicao_igualdade ) (c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) ) )* ;
    public final iParser.condicao_comparacao_return condicao_comparacao() throws RecognitionException {
        iParser.condicao_comparacao_return retval = new iParser.condicao_comparacao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal109=null;
        Token char_literal110=null;
        Token string_literal111=null;
        Token string_literal112=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.condicao_igualdade_return c = null;

        iParser.condicao_igualdade_return condicao_igualdade108 = null;


        Tree char_literal109_tree=null;
        Tree char_literal110_tree=null;
        Tree string_literal111_tree=null;
        Tree string_literal112_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleSubtreeStream stream_condicao_igualdade=new RewriteRuleSubtreeStream(adaptor,"rule condicao_igualdade");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:141:21: ( ( condicao_igualdade -> condicao_igualdade ) (c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) ) )* )
            // gram/i.g:142:2: ( condicao_igualdade -> condicao_igualdade ) (c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) ) )*
            {
            // gram/i.g:142:2: ( condicao_igualdade -> condicao_igualdade )
            // gram/i.g:142:3: condicao_igualdade
            {
            pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao1994);
            condicao_igualdade108=condicao_igualdade();

            state._fsp--;

            stream_condicao_igualdade.add(condicao_igualdade108.getTree());


            // AST REWRITE
            // elements: condicao_igualdade
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 142:22: -> condicao_igualdade
            {
                adaptor.addChild(root_0, stream_condicao_igualdade.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:142:46: (c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) ) )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // gram/i.g:142:48: c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) )
            	    {
            	    pushFollow(FOLLOW_comentarios_in_condicao_comparacao2006);
            	    c1=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c1.getTree());
            	    // gram/i.g:142:63: ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) )
            	    int alt20=4;
            	    switch ( input.LA(1) ) {
            	    case 108:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 109:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 110:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case 111:
            	        {
            	        alt20=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // gram/i.g:142:65: '>' c2= comentarios c= condicao_igualdade
            	            {
            	            char_literal109=(Token)match(input,108,FOLLOW_108_in_condicao_comparacao2010);  
            	            stream_108.add(char_literal109);

            	            pushFollow(FOLLOW_comentarios_in_condicao_comparacao2014);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao2018);
            	            c=condicao_igualdade();

            	            state._fsp--;

            	            stream_condicao_igualdade.add(c.getTree());


            	            // AST REWRITE
            	            // elements: c1, condicao_comparacao, c, c2
            	            // token labels: 
            	            // rule labels: c, c1, retval, c2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 142:105: -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c)
            	            {
            	                // gram/i.g:142:108: ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:142:136: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:142:150: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:142:156: ^( Maior )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Maior, "Maior"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:142:165: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:142:179: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_c.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 2 :
            	            // gram/i.g:143:20: '<' c2= comentarios c= condicao_igualdade
            	            {
            	            char_literal110=(Token)match(input,109,FOLLOW_109_in_condicao_comparacao2072);  
            	            stream_109.add(char_literal110);

            	            pushFollow(FOLLOW_comentarios_in_condicao_comparacao2076);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao2080);
            	            c=condicao_igualdade();

            	            state._fsp--;

            	            stream_condicao_igualdade.add(c.getTree());


            	            // AST REWRITE
            	            // elements: condicao_comparacao, c, c2, c1
            	            // token labels: 
            	            // rule labels: c, c1, retval, c2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 143:60: -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c)
            	            {
            	                // gram/i.g:143:63: ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:143:91: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:143:105: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:143:111: ^( Menor )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Menor, "Menor"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:143:120: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:143:134: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_c.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 3 :
            	            // gram/i.g:144:20: '>=' c2= comentarios c= condicao_igualdade
            	            {
            	            string_literal111=(Token)match(input,110,FOLLOW_110_in_condicao_comparacao2134);  
            	            stream_110.add(string_literal111);

            	            pushFollow(FOLLOW_comentarios_in_condicao_comparacao2138);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao2142);
            	            c=condicao_igualdade();

            	            state._fsp--;

            	            stream_condicao_igualdade.add(c.getTree());


            	            // AST REWRITE
            	            // elements: c1, condicao_comparacao, c2, c
            	            // token labels: 
            	            // rule labels: c, c1, retval, c2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 144:61: -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c)
            	            {
            	                // gram/i.g:144:64: ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:144:92: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:144:106: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:144:112: ^( MaiorQ )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(MaiorQ, "MaiorQ"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:144:122: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:144:136: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_c.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 4 :
            	            // gram/i.g:145:20: '<=' c2= comentarios c= condicao_igualdade
            	            {
            	            string_literal112=(Token)match(input,111,FOLLOW_111_in_condicao_comparacao2196);  
            	            stream_111.add(string_literal112);

            	            pushFollow(FOLLOW_comentarios_in_condicao_comparacao2200);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao2204);
            	            c=condicao_igualdade();

            	            state._fsp--;

            	            stream_condicao_igualdade.add(c.getTree());


            	            // AST REWRITE
            	            // elements: c2, c, condicao_comparacao, c1
            	            // token labels: 
            	            // rule labels: c, c1, retval, c2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 145:61: -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c)
            	            {
            	                // gram/i.g:145:64: ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:145:92: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:145:106: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:145:112: ^( MenorQ )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(MenorQ, "MenorQ"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:145:122: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:145:136: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_c.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condicao_comparacao"

    public static class condicao_igualdade_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condicao_igualdade"
    // gram/i.g:150:1: condicao_igualdade : ( expressao -> expressao ) (c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) ) )* ;
    public final iParser.condicao_igualdade_return condicao_igualdade() throws RecognitionException {
        iParser.condicao_igualdade_return retval = new iParser.condicao_igualdade_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal114=null;
        Token string_literal115=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.expressao_return e = null;

        iParser.expressao_return expressao113 = null;


        Tree string_literal114_tree=null;
        Tree string_literal115_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:150:20: ( ( expressao -> expressao ) (c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) ) )* )
            // gram/i.g:151:2: ( expressao -> expressao ) (c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) ) )*
            {
            // gram/i.g:151:2: ( expressao -> expressao )
            // gram/i.g:151:3: expressao
            {
            pushFollow(FOLLOW_expressao_in_condicao_igualdade2284);
            expressao113=expressao();

            state._fsp--;

            stream_expressao.add(expressao113.getTree());


            // AST REWRITE
            // elements: expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 151:13: -> expressao
            {
                adaptor.addChild(root_0, stream_expressao.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:151:27: (c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) ) )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // gram/i.g:151:29: c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) )
            	    {
            	    pushFollow(FOLLOW_comentarios_in_condicao_igualdade2295);
            	    c1=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c1.getTree());
            	    // gram/i.g:151:44: ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==112) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==113) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // gram/i.g:151:46: '!=' c2= comentarios e= expressao
            	            {
            	            string_literal114=(Token)match(input,112,FOLLOW_112_in_condicao_igualdade2299);  
            	            stream_112.add(string_literal114);

            	            pushFollow(FOLLOW_comentarios_in_condicao_igualdade2303);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_expressao_in_condicao_igualdade2307);
            	            e=expressao();

            	            state._fsp--;

            	            stream_expressao.add(e.getTree());


            	            // AST REWRITE
            	            // elements: condicao_igualdade, c2, e, c1
            	            // token labels: 
            	            // rule labels: e, c1, retval, c2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 151:78: -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e)
            	            {
            	                // gram/i.g:151:81: ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:151:108: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:151:122: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:151:128: ^( Dif )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Dif, "Dif"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:151:135: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:151:149: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_e.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 2 :
            	            // gram/i.g:152:16: '==' c2= comentarios e= expressao
            	            {
            	            string_literal115=(Token)match(input,113,FOLLOW_113_in_condicao_igualdade2357);  
            	            stream_113.add(string_literal115);

            	            pushFollow(FOLLOW_comentarios_in_condicao_igualdade2361);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_expressao_in_condicao_igualdade2365);
            	            e=expressao();

            	            state._fsp--;

            	            stream_expressao.add(e.getTree());


            	            // AST REWRITE
            	            // elements: c2, e, c2, condicao_igualdade
            	            // token labels: 
            	            // rule labels: e, retval, c2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 152:48: -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e)
            	            {
            	                // gram/i.g:152:51: ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:152:78: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:152:92: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:152:98: ^( Igual )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Igual, "Igual"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:152:107: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:152:121: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_e.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condicao_igualdade"

    public static class atribuicao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atribuicao"
    // gram/i.g:160:1: atribuicao : c1= comentarios ID c2= comentarios opAtribuicao c3= comentarios condicao c4= comentarios -> ^( Atribuicao ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) opAtribuicao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ) ;
    public final iParser.atribuicao_return atribuicao() throws RecognitionException {
        iParser.atribuicao_return retval = new iParser.atribuicao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID116=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.comentarios_return c3 = null;

        iParser.comentarios_return c4 = null;

        iParser.opAtribuicao_return opAtribuicao117 = null;

        iParser.condicao_return condicao118 = null;


        Tree ID116_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        RewriteRuleSubtreeStream stream_opAtribuicao=new RewriteRuleSubtreeStream(adaptor,"rule opAtribuicao");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:160:12: (c1= comentarios ID c2= comentarios opAtribuicao c3= comentarios condicao c4= comentarios -> ^( Atribuicao ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) opAtribuicao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ) )
            // gram/i.g:161:2: c1= comentarios ID c2= comentarios opAtribuicao c3= comentarios condicao c4= comentarios
            {
            pushFollow(FOLLOW_comentarios_in_atribuicao2443);
            c1=comentarios();

            state._fsp--;

            stream_comentarios.add(c1.getTree());
            ID116=(Token)match(input,ID,FOLLOW_ID_in_atribuicao2445);  
            stream_ID.add(ID116);

            pushFollow(FOLLOW_comentarios_in_atribuicao2449);
            c2=comentarios();

            state._fsp--;

            stream_comentarios.add(c2.getTree());
            pushFollow(FOLLOW_opAtribuicao_in_atribuicao2451);
            opAtribuicao117=opAtribuicao();

            state._fsp--;

            stream_opAtribuicao.add(opAtribuicao117.getTree());
            pushFollow(FOLLOW_comentarios_in_atribuicao2455);
            c3=comentarios();

            state._fsp--;

            stream_comentarios.add(c3.getTree());
            pushFollow(FOLLOW_condicao_in_atribuicao2457);
            condicao118=condicao();

            state._fsp--;

            stream_condicao.add(condicao118.getTree());
            pushFollow(FOLLOW_comentarios_in_atribuicao2461);
            c4=comentarios();

            state._fsp--;

            stream_comentarios.add(c4.getTree());


            // AST REWRITE
            // elements: c3, c4, c2, opAtribuicao, condicao, c1, ID
            // token labels: 
            // rule labels: c3, c4, c1, retval, c2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
            RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 161:87: -> ^( Atribuicao ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) opAtribuicao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) )
            {
                // gram/i.g:161:90: ^( Atribuicao ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) opAtribuicao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Atribuicao, "Atribuicao"), root_1);

                // gram/i.g:161:103: ^( Comentarios ( $c1)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:161:117: ( $c1)?
                if ( stream_c1.hasNext() ) {
                    adaptor.addChild(root_2, stream_c1.nextTree());

                }
                stream_c1.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_ID.nextNode());
                // gram/i.g:161:126: ^( Comentarios ( $c2)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:161:140: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    adaptor.addChild(root_2, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_opAtribuicao.nextTree());
                // gram/i.g:161:159: ^( Comentarios ( $c3)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:161:173: ( $c3)?
                if ( stream_c3.hasNext() ) {
                    adaptor.addChild(root_2, stream_c3.nextTree());

                }
                stream_c3.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_condicao.nextTree());
                // gram/i.g:161:188: ^( Comentarios ( $c4)? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

                // gram/i.g:161:202: ( $c4)?
                if ( stream_c4.hasNext() ) {
                    adaptor.addChild(root_2, stream_c4.nextTree());

                }
                stream_c4.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atribuicao"

    public static class opAtribuicao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "opAtribuicao"
    // gram/i.g:164:1: opAtribuicao : ( '=' -> ^( Atrib ) | '*=' -> ^( Mult ) | '/=' -> ^( Div ) | '+=' -> ^( Soma ) | '-=' -> ^( Sub ) ) ;
    public final iParser.opAtribuicao_return opAtribuicao() throws RecognitionException {
        iParser.opAtribuicao_return retval = new iParser.opAtribuicao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal119=null;
        Token string_literal120=null;
        Token string_literal121=null;
        Token string_literal122=null;
        Token string_literal123=null;

        Tree char_literal119_tree=null;
        Tree string_literal120_tree=null;
        Tree string_literal121_tree=null;
        Tree string_literal122_tree=null;
        Tree string_literal123_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");

        try {
            // gram/i.g:164:14: ( ( '=' -> ^( Atrib ) | '*=' -> ^( Mult ) | '/=' -> ^( Div ) | '+=' -> ^( Soma ) | '-=' -> ^( Sub ) ) )
            // gram/i.g:165:2: ( '=' -> ^( Atrib ) | '*=' -> ^( Mult ) | '/=' -> ^( Div ) | '+=' -> ^( Soma ) | '-=' -> ^( Sub ) )
            {
            // gram/i.g:165:2: ( '=' -> ^( Atrib ) | '*=' -> ^( Mult ) | '/=' -> ^( Div ) | '+=' -> ^( Soma ) | '-=' -> ^( Sub ) )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt24=1;
                }
                break;
            case 114:
                {
                alt24=2;
                }
                break;
            case 115:
                {
                alt24=3;
                }
                break;
            case 116:
                {
                alt24=4;
                }
                break;
            case 117:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // gram/i.g:165:4: '='
                    {
                    char_literal119=(Token)match(input,91,FOLLOW_91_in_opAtribuicao2520);  
                    stream_91.add(char_literal119);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 165:8: -> ^( Atrib )
                    {
                        // gram/i.g:165:11: ^( Atrib )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Atrib, "Atrib"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:166:4: '*='
                    {
                    string_literal120=(Token)match(input,114,FOLLOW_114_in_opAtribuicao2531);  
                    stream_114.add(string_literal120);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 166:9: -> ^( Mult )
                    {
                        // gram/i.g:166:12: ^( Mult )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Mult, "Mult"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:167:4: '/='
                    {
                    string_literal121=(Token)match(input,115,FOLLOW_115_in_opAtribuicao2542);  
                    stream_115.add(string_literal121);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 167:9: -> ^( Div )
                    {
                        // gram/i.g:167:12: ^( Div )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Div, "Div"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // gram/i.g:168:4: '+='
                    {
                    string_literal122=(Token)match(input,116,FOLLOW_116_in_opAtribuicao2553);  
                    stream_116.add(string_literal122);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 168:9: -> ^( Soma )
                    {
                        // gram/i.g:168:12: ^( Soma )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Soma, "Soma"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // gram/i.g:169:4: '-='
                    {
                    string_literal123=(Token)match(input,117,FOLLOW_117_in_opAtribuicao2564);  
                    stream_117.add(string_literal123);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 169:9: -> ^( Sub )
                    {
                        // gram/i.g:169:12: ^( Sub )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Sub, "Sub"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "opAtribuicao"

    public static class expressao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressao"
    // gram/i.g:175:1: expressao : ( expressaoNum -> expressaoNum ) (c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) ) )* ;
    public final iParser.expressao_return expressao() throws RecognitionException {
        iParser.expressao_return retval = new iParser.expressao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal125=null;
        Token char_literal126=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.expressaoNum_return e = null;

        iParser.expressaoNum_return expressaoNum124 = null;


        Tree char_literal125_tree=null;
        Tree char_literal126_tree=null;
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_expressaoNum=new RewriteRuleSubtreeStream(adaptor,"rule expressaoNum");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:175:11: ( ( expressaoNum -> expressaoNum ) (c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) ) )* )
            // gram/i.g:176:2: ( expressaoNum -> expressaoNum ) (c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) ) )*
            {
            // gram/i.g:176:2: ( expressaoNum -> expressaoNum )
            // gram/i.g:176:3: expressaoNum
            {
            pushFollow(FOLLOW_expressaoNum_in_expressao2590);
            expressaoNum124=expressaoNum();

            state._fsp--;

            stream_expressaoNum.add(expressaoNum124.getTree());


            // AST REWRITE
            // elements: expressaoNum
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 176:16: -> expressaoNum
            {
                adaptor.addChild(root_0, stream_expressaoNum.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:176:33: (c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) ) )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // gram/i.g:176:35: c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) )
            	    {
            	    pushFollow(FOLLOW_comentarios_in_expressao2601);
            	    c1=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c1.getTree());
            	    // gram/i.g:176:50: ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==118) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==119) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // gram/i.g:176:52: '+' c2= comentarios e= expressaoNum
            	            {
            	            char_literal125=(Token)match(input,118,FOLLOW_118_in_expressao2605);  
            	            stream_118.add(char_literal125);

            	            pushFollow(FOLLOW_comentarios_in_expressao2609);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_expressaoNum_in_expressao2613);
            	            e=expressaoNum();

            	            state._fsp--;

            	            stream_expressaoNum.add(e.getTree());


            	            // AST REWRITE
            	            // elements: expressao, e, c1, c2
            	            // token labels: 
            	            // rule labels: e, c1, retval, c2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 176:86: -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e)
            	            {
            	                // gram/i.g:176:89: ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:176:109: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:176:123: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:176:129: ^( Mais )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Mais, "Mais"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:176:137: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:176:151: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_e.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 2 :
            	            // gram/i.g:177:17: '-' c2= comentarios e= expressaoNum
            	            {
            	            char_literal126=(Token)match(input,119,FOLLOW_119_in_expressao2664);  
            	            stream_119.add(char_literal126);

            	            pushFollow(FOLLOW_comentarios_in_expressao2668);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_expressaoNum_in_expressao2672);
            	            e=expressaoNum();

            	            state._fsp--;

            	            stream_expressaoNum.add(e.getTree());


            	            // AST REWRITE
            	            // elements: e, expressao, c1, c2
            	            // token labels: 
            	            // rule labels: e, c1, retval, c2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 177:51: -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e)
            	            {
            	                // gram/i.g:177:54: ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:177:74: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:177:88: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:177:94: ^( Menos )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Menos, "Menos"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:177:103: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:177:117: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_e.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressao"

    public static class expressaoNum_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressaoNum"
    // gram/i.g:182:1: expressaoNum : ( oper -> oper ) (c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) ) )* ;
    public final iParser.expressaoNum_return expressaoNum() throws RecognitionException {
        iParser.expressaoNum_return retval = new iParser.expressaoNum_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal128=null;
        Token char_literal129=null;
        Token char_literal130=null;
        iParser.comentarios_return c1 = null;

        iParser.comentarios_return c2 = null;

        iParser.oper_return o = null;

        iParser.oper_return oper127 = null;


        Tree char_literal128_tree=null;
        Tree char_literal129_tree=null;
        Tree char_literal130_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_oper=new RewriteRuleSubtreeStream(adaptor,"rule oper");
        RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
        try {
            // gram/i.g:182:14: ( ( oper -> oper ) (c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) ) )* )
            // gram/i.g:183:2: ( oper -> oper ) (c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) ) )*
            {
            // gram/i.g:183:2: ( oper -> oper )
            // gram/i.g:183:3: oper
            {
            pushFollow(FOLLOW_oper_in_expressaoNum2745);
            oper127=oper();

            state._fsp--;

            stream_oper.add(oper127.getTree());


            // AST REWRITE
            // elements: oper
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 183:8: -> oper
            {
                adaptor.addChild(root_0, stream_oper.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:183:17: (c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) ) )*
            loop28:
            do {
                int alt28=2;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // gram/i.g:183:19: c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) )
            	    {
            	    pushFollow(FOLLOW_comentarios_in_expressaoNum2756);
            	    c1=comentarios();

            	    state._fsp--;

            	    stream_comentarios.add(c1.getTree());
            	    // gram/i.g:183:34: ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) )
            	    int alt27=3;
            	    switch ( input.LA(1) ) {
            	    case 120:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 121:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 122:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt27) {
            	        case 1 :
            	            // gram/i.g:183:36: '*' c2= comentarios o= oper
            	            {
            	            char_literal128=(Token)match(input,120,FOLLOW_120_in_expressaoNum2760);  
            	            stream_120.add(char_literal128);

            	            pushFollow(FOLLOW_comentarios_in_expressaoNum2764);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_oper_in_expressaoNum2768);
            	            o=oper();

            	            state._fsp--;

            	            stream_oper.add(o.getTree());


            	            // AST REWRITE
            	            // elements: c2, o, expressaoNum, c1
            	            // token labels: 
            	            // rule labels: c1, retval, c2, o
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            	            RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 183:62: -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o)
            	            {
            	                // gram/i.g:183:65: ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:183:88: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:183:102: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:183:108: ^( Vezes )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Vezes, "Vezes"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:183:117: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:183:131: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_o.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 2 :
            	            // gram/i.g:184:12: '/' c2= comentarios o= oper
            	            {
            	            char_literal129=(Token)match(input,121,FOLLOW_121_in_expressaoNum2814);  
            	            stream_121.add(char_literal129);

            	            pushFollow(FOLLOW_comentarios_in_expressaoNum2818);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_oper_in_expressaoNum2822);
            	            o=oper();

            	            state._fsp--;

            	            stream_oper.add(o.getTree());


            	            // AST REWRITE
            	            // elements: c2, o, expressaoNum, c1
            	            // token labels: 
            	            // rule labels: c1, retval, c2, o
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            	            RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 184:38: -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o)
            	            {
            	                // gram/i.g:184:41: ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:184:64: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:184:78: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:184:84: ^( Divide )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Divide, "Divide"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:184:94: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:184:108: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_o.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 3 :
            	            // gram/i.g:185:12: '%' c2= comentarios o= oper
            	            {
            	            char_literal130=(Token)match(input,122,FOLLOW_122_in_expressaoNum2868);  
            	            stream_122.add(char_literal130);

            	            pushFollow(FOLLOW_comentarios_in_expressaoNum2872);
            	            c2=comentarios();

            	            state._fsp--;

            	            stream_comentarios.add(c2.getTree());
            	            pushFollow(FOLLOW_oper_in_expressaoNum2876);
            	            o=oper();

            	            state._fsp--;

            	            stream_oper.add(o.getTree());


            	            // AST REWRITE
            	            // elements: c1, expressaoNum, o, c2
            	            // token labels: 
            	            // rule labels: c1, retval, o, c2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);
            	            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 185:38: -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o)
            	            {
            	                // gram/i.g:185:41: ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:185:64: ^( Comentarios ( $c1)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:185:78: ( $c1)?
            	                if ( stream_c1.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c1.nextTree());

            	                }
            	                stream_c1.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:185:84: ^( Mod )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Mod, "Mod"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                // gram/i.g:185:91: ^( Comentarios ( $c2)? )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);

            	                // gram/i.g:185:105: ( $c2)?
            	                if ( stream_c2.hasNext() ) {
            	                    adaptor.addChild(root_2, stream_c2.nextTree());

            	                }
            	                stream_c2.reset();

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_o.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressaoNum"

    public static class oper_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oper"
    // gram/i.g:190:1: oper : ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ ) ;
    public final iParser.oper_return oper() throws RecognitionException {
        iParser.oper_return retval = new iParser.oper_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID132=null;
        Token ID136=null;
        Token ID138=null;
        Token ID139=null;
        iParser.opUnario_return opUnario131 = null;

        iParser.opUnario_return opUnario133 = null;

        iParser.tipo_return tipo134 = null;

        iParser.tipo_return tipo135 = null;

        iParser.incOp_return incOp137 = null;

        iParser.incOp_return incOp140 = null;

        iParser.call_return call141 = null;

        iParser.input__return input_142 = null;


        Tree ID132_tree=null;
        Tree ID136_tree=null;
        Tree ID138_tree=null;
        Tree ID139_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        RewriteRuleSubtreeStream stream_incOp=new RewriteRuleSubtreeStream(adaptor,"rule incOp");
        RewriteRuleSubtreeStream stream_opUnario=new RewriteRuleSubtreeStream(adaptor,"rule opUnario");
        RewriteRuleSubtreeStream stream_input_=new RewriteRuleSubtreeStream(adaptor,"rule input_");
        try {
            // gram/i.g:190:6: ( ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ ) )
            // gram/i.g:191:2: ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ )
            {
            // gram/i.g:191:2: ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ )
            int alt29=8;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // gram/i.g:191:4: opUnario ID
                    {
                    pushFollow(FOLLOW_opUnario_in_oper2943);
                    opUnario131=opUnario();

                    state._fsp--;

                    stream_opUnario.add(opUnario131.getTree());
                    ID132=(Token)match(input,ID,FOLLOW_ID_in_oper2945);  
                    stream_ID.add(ID132);



                    // AST REWRITE
                    // elements: opUnario, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 191:16: -> ^( opUnario ^( Id ID ) )
                    {
                        // gram/i.g:191:19: ^( opUnario ^( Id ID ) )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(stream_opUnario.nextNode(), root_1);

                        // gram/i.g:191:30: ^( Id ID )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Id, "Id"), root_2);

                        adaptor.addChild(root_2, stream_ID.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:192:4: opUnario tipo
                    {
                    pushFollow(FOLLOW_opUnario_in_oper2962);
                    opUnario133=opUnario();

                    state._fsp--;

                    stream_opUnario.add(opUnario133.getTree());
                    pushFollow(FOLLOW_tipo_in_oper2964);
                    tipo134=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo134.getTree());


                    // AST REWRITE
                    // elements: tipo, opUnario
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 192:18: -> ^( opUnario tipo )
                    {
                        // gram/i.g:192:21: ^( opUnario tipo )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(stream_opUnario.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_tipo.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:193:4: tipo
                    {
                    pushFollow(FOLLOW_tipo_in_oper2977);
                    tipo135=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo135.getTree());


                    // AST REWRITE
                    // elements: tipo
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 193:9: -> tipo
                    {
                        adaptor.addChild(root_0, stream_tipo.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // gram/i.g:194:4: ID
                    {
                    ID136=(Token)match(input,ID,FOLLOW_ID_in_oper2987);  
                    stream_ID.add(ID136);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 194:7: -> ^( Id ID )
                    {
                        // gram/i.g:194:10: ^( Id ID )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Id, "Id"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // gram/i.g:195:4: incOp ID
                    {
                    pushFollow(FOLLOW_incOp_in_oper3000);
                    incOp137=incOp();

                    state._fsp--;

                    stream_incOp.add(incOp137.getTree());
                    ID138=(Token)match(input,ID,FOLLOW_ID_in_oper3002);  
                    stream_ID.add(ID138);



                    // AST REWRITE
                    // elements: ID, incOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 195:13: -> ^( IncAntes incOp ID )
                    {
                        // gram/i.g:195:16: ^( IncAntes incOp ID )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(IncAntes, "IncAntes"), root_1);

                        adaptor.addChild(root_1, stream_incOp.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // gram/i.g:196:4: ID incOp
                    {
                    ID139=(Token)match(input,ID,FOLLOW_ID_in_oper3017);  
                    stream_ID.add(ID139);

                    pushFollow(FOLLOW_incOp_in_oper3019);
                    incOp140=incOp();

                    state._fsp--;

                    stream_incOp.add(incOp140.getTree());


                    // AST REWRITE
                    // elements: ID, incOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 196:13: -> ^( IncDepois incOp ID )
                    {
                        // gram/i.g:196:16: ^( IncDepois incOp ID )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(IncDepois, "IncDepois"), root_1);

                        adaptor.addChild(root_1, stream_incOp.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // gram/i.g:197:4: call
                    {
                    pushFollow(FOLLOW_call_in_oper3034);
                    call141=call();

                    state._fsp--;

                    stream_call.add(call141.getTree());


                    // AST REWRITE
                    // elements: call
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 197:9: -> call
                    {
                        adaptor.addChild(root_0, stream_call.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // gram/i.g:198:4: input_
                    {
                    pushFollow(FOLLOW_input__in_oper3043);
                    input_142=input_();

                    state._fsp--;

                    stream_input_.add(input_142.getTree());


                    // AST REWRITE
                    // elements: input_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 198:11: -> input_
                    {
                        adaptor.addChild(root_0, stream_input_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "oper"

    public static class incOp_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incOp"
    // gram/i.g:202:1: incOp : ( '++' -> ^( Inc ) | '--' -> ^( Dec ) ) ;
    public final iParser.incOp_return incOp() throws RecognitionException {
        iParser.incOp_return retval = new iParser.incOp_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal143=null;
        Token string_literal144=null;

        Tree string_literal143_tree=null;
        Tree string_literal144_tree=null;
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");

        try {
            // gram/i.g:202:7: ( ( '++' -> ^( Inc ) | '--' -> ^( Dec ) ) )
            // gram/i.g:203:2: ( '++' -> ^( Inc ) | '--' -> ^( Dec ) )
            {
            // gram/i.g:203:2: ( '++' -> ^( Inc ) | '--' -> ^( Dec ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==123) ) {
                alt30=1;
            }
            else if ( (LA30_0==124) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // gram/i.g:203:4: '++'
                    {
                    string_literal143=(Token)match(input,123,FOLLOW_123_in_incOp3065);  
                    stream_123.add(string_literal143);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 203:9: -> ^( Inc )
                    {
                        // gram/i.g:203:12: ^( Inc )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Inc, "Inc"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:203:21: '--'
                    {
                    string_literal144=(Token)match(input,124,FOLLOW_124_in_incOp3075);  
                    stream_124.add(string_literal144);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 203:26: -> ^( Dec )
                    {
                        // gram/i.g:203:29: ^( Dec )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Dec, "Dec"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incOp"

    public static class opUnario_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "opUnario"
    // gram/i.g:206:1: opUnario : ( '+' -> ^( Pos ) | '-' -> ^( Neg ) | '!' -> ^( Nao ) ) ;
    public final iParser.opUnario_return opUnario() throws RecognitionException {
        iParser.opUnario_return retval = new iParser.opUnario_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal145=null;
        Token char_literal146=null;
        Token char_literal147=null;

        Tree char_literal145_tree=null;
        Tree char_literal146_tree=null;
        Tree char_literal147_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");

        try {
            // gram/i.g:206:10: ( ( '+' -> ^( Pos ) | '-' -> ^( Neg ) | '!' -> ^( Nao ) ) )
            // gram/i.g:207:2: ( '+' -> ^( Pos ) | '-' -> ^( Neg ) | '!' -> ^( Nao ) )
            {
            // gram/i.g:207:2: ( '+' -> ^( Pos ) | '-' -> ^( Neg ) | '!' -> ^( Nao ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 118:
                {
                alt31=1;
                }
                break;
            case 119:
                {
                alt31=2;
                }
                break;
            case 125:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // gram/i.g:207:4: '+'
                    {
                    char_literal145=(Token)match(input,118,FOLLOW_118_in_opUnario3096);  
                    stream_118.add(char_literal145);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 207:8: -> ^( Pos )
                    {
                        // gram/i.g:207:11: ^( Pos )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Pos, "Pos"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:208:4: '-'
                    {
                    char_literal146=(Token)match(input,119,FOLLOW_119_in_opUnario3107);  
                    stream_119.add(char_literal146);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 208:8: -> ^( Neg )
                    {
                        // gram/i.g:208:11: ^( Neg )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Neg, "Neg"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:209:4: '!'
                    {
                    char_literal147=(Token)match(input,125,FOLLOW_125_in_opUnario3118);  
                    stream_125.add(char_literal147);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 209:8: -> ^( Nao )
                    {
                        // gram/i.g:209:11: ^( Nao )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Nao, "Nao"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "opUnario"

    public static class boolean__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_"
    // gram/i.g:213:1: boolean_ : ( 'true' -> ^( True ) | 'false' -> ^( False ) ) ;
    public final iParser.boolean__return boolean_() throws RecognitionException {
        iParser.boolean__return retval = new iParser.boolean__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal148=null;
        Token string_literal149=null;

        Tree string_literal148_tree=null;
        Tree string_literal149_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");

        try {
            // gram/i.g:213:10: ( ( 'true' -> ^( True ) | 'false' -> ^( False ) ) )
            // gram/i.g:213:12: ( 'true' -> ^( True ) | 'false' -> ^( False ) )
            {
            // gram/i.g:213:12: ( 'true' -> ^( True ) | 'false' -> ^( False ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==126) ) {
                alt32=1;
            }
            else if ( (LA32_0==127) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // gram/i.g:213:13: 'true'
                    {
                    string_literal148=(Token)match(input,126,FOLLOW_126_in_boolean_3139);  
                    stream_126.add(string_literal148);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 213:20: -> ^( True )
                    {
                        // gram/i.g:213:23: ^( True )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(True, "True"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:213:33: 'false'
                    {
                    string_literal149=(Token)match(input,127,FOLLOW_127_in_boolean_3149);  
                    stream_127.add(string_literal149);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 213:41: -> ^( False )
                    {
                        // gram/i.g:213:44: ^( False )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(False, "False"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "boolean_"

    public static class comentarios_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comentarios"
    // gram/i.g:217:1: comentarios : ( ( comentario )* -> ( comentario )* ) ;
    public final iParser.comentarios_return comentarios() throws RecognitionException {
        iParser.comentarios_return retval = new iParser.comentarios_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        iParser.comentario_return comentario150 = null;


        RewriteRuleSubtreeStream stream_comentario=new RewriteRuleSubtreeStream(adaptor,"rule comentario");
        try {
            // gram/i.g:217:13: ( ( ( comentario )* -> ( comentario )* ) )
            // gram/i.g:218:2: ( ( comentario )* -> ( comentario )* )
            {
            // gram/i.g:218:2: ( ( comentario )* -> ( comentario )* )
            // gram/i.g:218:4: ( comentario )*
            {
            // gram/i.g:218:4: ( comentario )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==COMENTARIO_LINHA) ) {
                    alt33=1;
                }
                else if ( (LA33_0==COMENTARIO_LINHAS) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // gram/i.g:218:4: comentario
            	    {
            	    pushFollow(FOLLOW_comentario_in_comentarios3172);
            	    comentario150=comentario();

            	    state._fsp--;

            	    stream_comentario.add(comentario150.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);



            // AST REWRITE
            // elements: comentario
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 218:16: -> ( comentario )*
            {
                // gram/i.g:218:19: ( comentario )*
                while ( stream_comentario.hasNext() ) {
                    adaptor.addChild(root_0, stream_comentario.nextTree());

                }
                stream_comentario.reset();

            }

            retval.tree = root_0;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comentarios"

    public static class comentario_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comentario"
    // gram/i.g:223:1: comentario : ( COMENTARIO_LINHA -> ^( Comentario COMENTARIO_LINHA ) | COMENTARIO_LINHAS -> ^( Comentario COMENTARIO_LINHAS ) ) ;
    public final iParser.comentario_return comentario() throws RecognitionException {
        iParser.comentario_return retval = new iParser.comentario_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token COMENTARIO_LINHA151=null;
        Token COMENTARIO_LINHAS152=null;

        Tree COMENTARIO_LINHA151_tree=null;
        Tree COMENTARIO_LINHAS152_tree=null;
        RewriteRuleTokenStream stream_COMENTARIO_LINHAS=new RewriteRuleTokenStream(adaptor,"token COMENTARIO_LINHAS");
        RewriteRuleTokenStream stream_COMENTARIO_LINHA=new RewriteRuleTokenStream(adaptor,"token COMENTARIO_LINHA");

        try {
            // gram/i.g:223:12: ( ( COMENTARIO_LINHA -> ^( Comentario COMENTARIO_LINHA ) | COMENTARIO_LINHAS -> ^( Comentario COMENTARIO_LINHAS ) ) )
            // gram/i.g:224:2: ( COMENTARIO_LINHA -> ^( Comentario COMENTARIO_LINHA ) | COMENTARIO_LINHAS -> ^( Comentario COMENTARIO_LINHAS ) )
            {
            // gram/i.g:224:2: ( COMENTARIO_LINHA -> ^( Comentario COMENTARIO_LINHA ) | COMENTARIO_LINHAS -> ^( Comentario COMENTARIO_LINHAS ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==COMENTARIO_LINHA) ) {
                alt34=1;
            }
            else if ( (LA34_0==COMENTARIO_LINHAS) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // gram/i.g:224:4: COMENTARIO_LINHA
                    {
                    COMENTARIO_LINHA151=(Token)match(input,COMENTARIO_LINHA,FOLLOW_COMENTARIO_LINHA_in_comentario3195);  
                    stream_COMENTARIO_LINHA.add(COMENTARIO_LINHA151);



                    // AST REWRITE
                    // elements: COMENTARIO_LINHA
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 224:21: -> ^( Comentario COMENTARIO_LINHA )
                    {
                        // gram/i.g:224:24: ^( Comentario COMENTARIO_LINHA )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentario, "Comentario"), root_1);

                        adaptor.addChild(root_1, stream_COMENTARIO_LINHA.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:225:4: COMENTARIO_LINHAS
                    {
                    COMENTARIO_LINHAS152=(Token)match(input,COMENTARIO_LINHAS,FOLLOW_COMENTARIO_LINHAS_in_comentario3208);  
                    stream_COMENTARIO_LINHAS.add(COMENTARIO_LINHAS152);



                    // AST REWRITE
                    // elements: COMENTARIO_LINHAS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 225:22: -> ^( Comentario COMENTARIO_LINHAS )
                    {
                        // gram/i.g:225:25: ^( Comentario COMENTARIO_LINHAS )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentario, "Comentario"), root_1);

                        adaptor.addChild(root_1, stream_COMENTARIO_LINHAS.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comentario"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA4_eotS =
        "\17\uffff";
    static final String DFA4_eofS =
        "\17\uffff";
    static final String DFA4_minS =
        "\3\116\7\115\3\116\2\uffff";
    static final String DFA4_maxS =
        "\3\130\7\117\3\134\2\uffff";
    static final String DFA4_acceptS =
        "\15\uffff\1\1\1\2";
    static final String DFA4_specialS =
        "\17\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\4\uffff\1\3\1\4\1\5\1\6\1\7",
            "\1\1\1\2\4\uffff\1\3\1\4\1\5\1\6\1\7",
            "\1\1\1\2\4\uffff\1\3\1\4\1\5\1\6\1\7",
            "\1\12\1\10\1\11",
            "\1\12\1\10\1\11",
            "\1\12\1\10\1\11",
            "\1\12\1\10\1\11",
            "\1\12\1\10\1\11",
            "\1\12\1\10\1\11",
            "\1\12\1\10\1\11",
            "\1\13\1\14\11\uffff\3\15\1\16",
            "\1\13\1\14\11\uffff\3\15\1\16",
            "\1\13\1\14\11\uffff\3\15\1\16",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "28:2: ( declaracao ';' -> declaracao | funcao -> funcao )";
        }
    }
    static final String DFA6_eotS =
        "\6\uffff";
    static final String DFA6_eofS =
        "\6\uffff";
    static final String DFA6_minS =
        "\1\115\3\116\2\uffff";
    static final String DFA6_maxS =
        "\1\115\3\133\2\uffff";
    static final String DFA6_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA6_specialS =
        "\6\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\2\1\3\11\uffff\2\5\1\4",
            "\1\2\1\3\11\uffff\2\5\1\4",
            "\1\2\1\3\11\uffff\2\5\1\4",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "38:2: ( ID c1= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) ) | ID c1= comentarios '=' c2= comentarios condicao c3= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) ) )";
        }
    }
    static final String DFA7_eotS =
        "\5\uffff";
    static final String DFA7_eofS =
        "\5\uffff";
    static final String DFA7_minS =
        "\3\116\2\uffff";
    static final String DFA7_maxS =
        "\3\135\2\uffff";
    static final String DFA7_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA7_specialS =
        "\5\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\1\2\4\uffff\5\3\4\uffff\1\4",
            "\1\1\1\2\4\uffff\5\3\4\uffff\1\4",
            "\1\1\1\2\4\uffff\5\3\4\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "44:76: ( argumentos )?";
        }
    }
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\3\115\7\uffff";
    static final String DFA9_maxS =
        "\3\144\7\uffff";
    static final String DFA9_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\7\1\1\1\2\16\uffff\1\3\1\uffff\1\4\1\5\1\6\1\10\1\11",
            "\1\7\1\1\1\2\16\uffff\1\3\1\uffff\1\4\1\5\1\6\1\10\1\11",
            "\1\7\1\1\1\2\16\uffff\1\3\1\uffff\1\4\1\5\1\6\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "58:2: ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ | energia_ ';' -> energia_ )";
        }
    }
    static final String DFA12_eotS =
        "\5\uffff";
    static final String DFA12_eofS =
        "\5\uffff";
    static final String DFA12_minS =
        "\3\115\2\uffff";
    static final String DFA12_maxS =
        "\3\130\2\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA12_specialS =
        "\5\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\4\1\1\1\2\4\uffff\5\3",
            "\1\4\1\1\1\2\4\uffff\5\3",
            "\1\4\1\1\1\2\4\uffff\5\3",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "76:2: ( declaracao -> declaracao | atribuicao -> atribuicao )";
        }
    }
    static final String DFA13_eotS =
        "\5\uffff";
    static final String DFA13_eofS =
        "\5\uffff";
    static final String DFA13_minS =
        "\3\112\2\uffff";
    static final String DFA13_maxS =
        "\3\177\2\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA13_specialS =
        "\5\uffff}>";
    static final String[] DFA13_transitionS = {
            "\4\3\1\1\1\2\15\uffff\1\4\7\uffff\1\3\20\uffff\2\3\3\uffff\5"+
            "\3",
            "\4\3\1\1\1\2\15\uffff\1\4\7\uffff\1\3\20\uffff\2\3\3\uffff"+
            "\5\3",
            "\4\3\1\1\1\2\15\uffff\1\4\7\uffff\1\3\20\uffff\2\3\3\uffff"+
            "\5\3",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "90:55: ( parametros )?";
        }
    }
    static final String DFA16_eotS =
        "\11\uffff";
    static final String DFA16_eofS =
        "\11\uffff";
    static final String DFA16_minS =
        "\3\115\1\116\2\uffff\2\116\1\uffff";
    static final String DFA16_maxS =
        "\3\144\1\165\2\uffff\2\165\1\uffff";
    static final String DFA16_acceptS =
        "\4\uffff\1\2\1\3\2\uffff\1\1";
    static final String DFA16_specialS =
        "\11\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\3\1\1\1\2\4\uffff\5\4\5\uffff\1\5\1\uffff\5\5",
            "\1\3\1\1\1\2\4\uffff\5\4\5\uffff\1\5\1\uffff\5\5",
            "\1\3\1\1\1\2\4\uffff\5\4\5\uffff\1\5\1\uffff\5\5",
            "\1\6\1\7\13\uffff\1\10\1\5\25\uffff\4\10",
            "",
            "",
            "\1\6\1\7\13\uffff\1\10\1\5\25\uffff\4\10",
            "\1\6\1\7\13\uffff\1\10\1\5\25\uffff\4\10",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "118:2: ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao )";
        }
    }
    static final String DFA17_eotS =
        "\5\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\3\116\2\uffff";
    static final String DFA17_maxS =
        "\3\150\2\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\1\2\11\uffff\2\4\2\uffff\1\4\12\uffff\1\3",
            "\1\1\1\2\11\uffff\2\4\2\uffff\1\4\12\uffff\1\3",
            "\1\1\1\2\11\uffff\2\4\2\uffff\1\4\12\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "128:14: (c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao ) | -> condicao_ou )";
        }
    }
    static final String DFA18_eotS =
        "\5\uffff";
    static final String DFA18_eofS =
        "\5\uffff";
    static final String DFA18_minS =
        "\3\116\2\uffff";
    static final String DFA18_maxS =
        "\3\152\2\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA18_specialS =
        "\5\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\1\3\1\uffff\1\4",
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\1\3\1\uffff\1\4",
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\1\3\1\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 134:29: (c1= comentarios '||' c2= comentarios c= condicao_e -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*";
        }
    }
    static final String DFA19_eotS =
        "\5\uffff";
    static final String DFA19_eofS =
        "\5\uffff";
    static final String DFA19_minS =
        "\3\116\2\uffff";
    static final String DFA19_maxS =
        "\3\153\2\uffff";
    static final String DFA19_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA19_specialS =
        "\5\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\1\3\1\uffff\1\3\1"+
            "\4",
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\1\3\1\uffff\1\3"+
            "\1\4",
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\1\3\1\uffff\1\3"+
            "\1\4",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "()* loopback of 138:47: (c1= comentarios '&&' c2= comentarios c= condicao_comparacao -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*";
        }
    }
    static final String DFA21_eotS =
        "\5\uffff";
    static final String DFA21_eofS =
        "\5\uffff";
    static final String DFA21_minS =
        "\3\116\2\uffff";
    static final String DFA21_maxS =
        "\3\157\2\uffff";
    static final String DFA21_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA21_specialS =
        "\5\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\1\3\1\uffff\2\3\4"+
            "\4",
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\1\3\1\uffff\2\3"+
            "\4\4",
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\1\3\1\uffff\2\3"+
            "\4\4",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "()* loopback of 142:46: (c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) ) )*";
        }
    }
    static final String DFA23_eotS =
        "\5\uffff";
    static final String DFA23_eofS =
        "\5\uffff";
    static final String DFA23_minS =
        "\3\116\2\uffff";
    static final String DFA23_maxS =
        "\3\161\2\uffff";
    static final String DFA23_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA23_specialS =
        "\5\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\1\3\1\uffff\6\3\2"+
            "\4",
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\1\3\1\uffff\6\3"+
            "\2\4",
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\1\3\1\uffff\6\3"+
            "\2\4",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "()* loopback of 151:27: (c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) ) )*";
        }
    }
    static final String DFA26_eotS =
        "\5\uffff";
    static final String DFA26_eofS =
        "\5\uffff";
    static final String DFA26_minS =
        "\3\116\2\uffff";
    static final String DFA26_maxS =
        "\3\167\2\uffff";
    static final String DFA26_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA26_specialS =
        "\5\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\12\3\4\uffff\2\4",
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\12\3\4\uffff\2\4",
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\12\3\4\uffff\2\4",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()* loopback of 176:33: (c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) ) )*";
        }
    }
    static final String DFA28_eotS =
        "\5\uffff";
    static final String DFA28_eofS =
        "\5\uffff";
    static final String DFA28_minS =
        "\3\116\2\uffff";
    static final String DFA28_maxS =
        "\3\172\2\uffff";
    static final String DFA28_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA28_specialS =
        "\5\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\12\3\4\uffff\2\3"+
            "\3\4",
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\12\3\4\uffff\2\3"+
            "\3\4",
            "\1\1\1\2\11\uffff\2\3\2\uffff\1\3\12\uffff\12\3\4\uffff\2\3"+
            "\3\4",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()* loopback of 183:17: (c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) ) )*";
        }
    }
    static final String DFA29_eotS =
        "\21\uffff";
    static final String DFA29_eofS =
        "\21\uffff";
    static final String DFA29_minS =
        "\4\112\1\uffff\1\116\1\uffff\2\115\3\uffff\2\116\3\uffff";
    static final String DFA29_maxS =
        "\4\177\1\uffff\1\174\1\uffff\2\145\3\uffff\2\172\3\uffff";
    static final String DFA29_acceptS =
        "\4\uffff\1\3\1\uffff\1\5\2\uffff\1\10\1\1\1\2\2\uffff\1\4\1\7\1"+
        "\6";
    static final String DFA29_specialS =
        "\21\uffff}>";
    static final String[] DFA29_transitionS = {
            "\3\4\1\5\1\7\1\10\25\uffff\1\11\20\uffff\1\1\1\2\3\uffff\2\6"+
            "\1\3\2\4",
            "\3\13\1\12\60\uffff\2\13",
            "\3\13\1\12\60\uffff\2\13",
            "\3\13\1\12\60\uffff\2\13",
            "",
            "\1\14\1\15\11\uffff\2\16\1\uffff\1\17\1\16\12\uffff\12\16\4"+
            "\uffff\5\16\2\20",
            "",
            "\1\17\1\7\1\10\25\uffff\1\11",
            "\1\17\1\7\1\10\25\uffff\1\11",
            "",
            "",
            "",
            "\1\14\1\15\11\uffff\2\16\1\uffff\1\17\1\16\12\uffff\12\16\4"+
            "\uffff\5\16",
            "\1\14\1\15\11\uffff\2\16\1\uffff\1\17\1\16\12\uffff\12\16\4"+
            "\uffff\5\16",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "191:2: ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ )";
        }
    }
 

    public static final BitSet FOLLOW_84_in_idTipo56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_idTipo66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_idTipo76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_idTipo86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_idTipo96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_tipo117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_tipo129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_tipo141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean__in_tipo153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_programa_in_prog174 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F0C000L});
    public static final BitSet FOLLOW_EOF_in_prog177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_programa201 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_programa203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcao_in_programa212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_declaracao232 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F0C000L});
    public static final BitSet FOLLOW_idTipo_in_declaracao234 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_comentarios_in_declaracao238 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_dec_nodo_in_declaracao240 = new BitSet(new long[]{0x0000000000000002L,0x000000000400C000L});
    public static final BitSet FOLLOW_comentarios_in_declaracao246 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_declaracao248 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_comentarios_in_declaracao252 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_dec_nodo_in_declaracao254 = new BitSet(new long[]{0x0000000000000002L,0x000000000400C000L});
    public static final BitSet FOLLOW_ID_in_dec_nodo317 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_comentarios_in_dec_nodo321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_dec_nodo352 = new BitSet(new long[]{0x0000000000000000L,0x000000000800C000L});
    public static final BitSet FOLLOW_comentarios_in_dec_nodo356 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_dec_nodo358 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_dec_nodo362 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_condicao_in_dec_nodo364 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_comentarios_in_dec_nodo368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_funcao421 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F0C000L});
    public static final BitSet FOLLOW_idTipo_in_funcao423 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_comentarios_in_funcao427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_funcao429 = new BitSet(new long[]{0x0000000000000000L,0x000000001000C000L});
    public static final BitSet FOLLOW_comentarios_in_funcao433 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_funcao435 = new BitSet(new long[]{0x0000000000000000L,0x0000000021F0C000L});
    public static final BitSet FOLLOW_comentarios_in_funcao439 = new BitSet(new long[]{0x0000000000000000L,0x0000000021F0C000L});
    public static final BitSet FOLLOW_argumentos_in_funcao441 = new BitSet(new long[]{0x0000000000000000L,0x000000002000C000L});
    public static final BitSet FOLLOW_comentarios_in_funcao446 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_funcao448 = new BitSet(new long[]{0x0000000000000000L,0x000000400000C000L});
    public static final BitSet FOLLOW_comentarios_in_funcao452 = new BitSet(new long[]{0x0000000000000000L,0x000000400000C000L});
    public static final BitSet FOLLOW_blocoCodigo_in_funcao454 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_comentarios_in_funcao458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumento_in_argumentos547 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_argumentos551 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F0C000L});
    public static final BitSet FOLLOW_argumento_in_argumentos553 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_comentarios_in_argumento575 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F0C000L});
    public static final BitSet FOLLOW_idTipo_in_argumento577 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_comentarios_in_argumento581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_argumento583 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_comentarios_in_argumento587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_instrucao637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for__in_instrucao645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while__in_instrucao653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return__in_instrucao661 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_instrucao663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_instrucao671 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_instrucao673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print__in_instrucao685 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_instrucao687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_energia__in_instrucao695 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_instrucao697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_if_716 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_if_718 = new BitSet(new long[]{0x0000000000000000L,0x000000001000C000L});
    public static final BitSet FOLLOW_comentarios_in_if_722 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_if_724 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_if_728 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_condicao_in_if_730 = new BitSet(new long[]{0x0000000000000000L,0x000000002000C000L});
    public static final BitSet FOLLOW_comentarios_in_if_734 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_if_736 = new BitSet(new long[]{0x0000000000000000L,0x000000400000C000L});
    public static final BitSet FOLLOW_comentarios_in_if_740 = new BitSet(new long[]{0x0000000000000000L,0x000000400000C000L});
    public static final BitSet FOLLOW_blocoCodigo_in_if_742 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_else__in_if_746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_else_912 = new BitSet(new long[]{0x0000000000000000L,0x000000404000C000L});
    public static final BitSet FOLLOW_blocoCodigo_in_else_916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_else_924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_for_944 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_for_946 = new BitSet(new long[]{0x0000000000000000L,0x000000001000C000L});
    public static final BitSet FOLLOW_comentarios_in_for_950 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_for_952 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F0E000L});
    public static final BitSet FOLLOW_for_declaracao_in_for_954 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_for_956 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_for_960 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_condicao_in_for_962 = new BitSet(new long[]{0x0000000000000000L,0x000000000200C000L});
    public static final BitSet FOLLOW_comentarios_in_for_966 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_for_968 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_for_972 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_expressao_in_for_974 = new BitSet(new long[]{0x0000000000000000L,0x000000002000C000L});
    public static final BitSet FOLLOW_comentarios_in_for_978 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_for_980 = new BitSet(new long[]{0x0000000000000000L,0x000000400000C000L});
    public static final BitSet FOLLOW_comentarios_in_for_984 = new BitSet(new long[]{0x0000000000000000L,0x000000400000C000L});
    public static final BitSet FOLLOW_blocoCodigo_in_for_986 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_comentarios_in_for_990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_for_declaracao1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atribuicao_in_for_declaracao1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_while_1114 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_while_1116 = new BitSet(new long[]{0x0000000000000000L,0x000000001000C000L});
    public static final BitSet FOLLOW_comentarios_in_while_1120 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_while_1122 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_while_1126 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_condicao_in_while_1128 = new BitSet(new long[]{0x0000000000000000L,0x000000002000C000L});
    public static final BitSet FOLLOW_comentarios_in_while_1132 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_while_1134 = new BitSet(new long[]{0x0000000000000000L,0x000000400000C000L});
    public static final BitSet FOLLOW_comentarios_in_while_1138 = new BitSet(new long[]{0x0000000000000000L,0x000000400000C000L});
    public static final BitSet FOLLOW_blocoCodigo_in_while_1140 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_comentarios_in_while_1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_return_1218 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_return_1220 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_return_1224 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_expressao_in_return_1226 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_comentarios_in_return_1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_call1278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_call1280 = new BitSet(new long[]{0x0000000000000000L,0x000000001000C000L});
    public static final BitSet FOLLOW_comentarios_in_call1285 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_call1287 = new BitSet(new long[]{0x0000000000000000L,0xF8C000202000FC00L});
    public static final BitSet FOLLOW_comentarios_in_call1291 = new BitSet(new long[]{0x0000000000000000L,0xF8C000202000FC00L});
    public static final BitSet FOLLOW_parametros_in_call1293 = new BitSet(new long[]{0x0000000000000000L,0x000000002000C000L});
    public static final BitSet FOLLOW_comentarios_in_call1298 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_call1300 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_comentarios_in_call1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_print_1372 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_print_1374 = new BitSet(new long[]{0x0000000000000000L,0x000000001000C000L});
    public static final BitSet FOLLOW_comentarios_in_print_1378 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_print_1380 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_print_1384 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_expressao_in_print_1386 = new BitSet(new long[]{0x0000000000000000L,0x000000002000C000L});
    public static final BitSet FOLLOW_comentarios_in_print_1390 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_print_1392 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_comentarios_in_print_1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_energia_1462 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_energia_1464 = new BitSet(new long[]{0x0000000000000000L,0x000000001000C000L});
    public static final BitSet FOLLOW_comentarios_in_energia_1468 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_energia_1470 = new BitSet(new long[]{0x0000000000000000L,0x000000002000C000L});
    public static final BitSet FOLLOW_comentarios_in_energia_1474 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_energia_1476 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_comentarios_in_energia_1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentarios_in_input_1537 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_input_1539 = new BitSet(new long[]{0x0000000000000000L,0x000000001000C000L});
    public static final BitSet FOLLOW_comentarios_in_input_1543 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_input_1545 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F0C000L});
    public static final BitSet FOLLOW_comentarios_in_input_1549 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F0C000L});
    public static final BitSet FOLLOW_idTipo_in_input_1551 = new BitSet(new long[]{0x0000000000000000L,0x000000002000C000L});
    public static final BitSet FOLLOW_comentarios_in_input_1555 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_input_1557 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_comentarios_in_input_1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parametro_in_parametros1621 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_parametros1625 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_parametro_in_parametros1627 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_comentarios_in_parametro1648 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_expressao_in_parametro1650 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_comentarios_in_parametro1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_blocoCodigo1690 = new BitSet(new long[]{0x0000000000000000L,0x000000DF41F0E000L});
    public static final BitSet FOLLOW_codigo_in_blocoCodigo1692 = new BitSet(new long[]{0x0000000000000000L,0x000000DF41F0E000L});
    public static final BitSet FOLLOW_103_in_blocoCodigo1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atribuicao_in_codigo1717 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_codigo1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_codigo1728 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_codigo1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucao_in_codigo1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condicao_ou_in_condicao1762 = new BitSet(new long[]{0x0000000000000002L,0x000001000000C000L});
    public static final BitSet FOLLOW_comentarios_in_condicao1768 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_condicao1770 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_condicao1774 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_expressao_in_condicao1776 = new BitSet(new long[]{0x0000000000000000L,0x000002000000C000L});
    public static final BitSet FOLLOW_comentarios_in_condicao1780 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_condicao1782 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_condicao1786 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_condicao_in_condicao1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condicao_e_in_condicao_ou1862 = new BitSet(new long[]{0x0000000000000002L,0x000004000000C000L});
    public static final BitSet FOLLOW_comentarios_in_condicao_ou1873 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_condicao_ou1875 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_condicao_ou1879 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_condicao_e_in_condicao_ou1883 = new BitSet(new long[]{0x0000000000000002L,0x000004000000C000L});
    public static final BitSet FOLLOW_condicao_comparacao_in_condicao_e1928 = new BitSet(new long[]{0x0000000000000002L,0x000008000000C000L});
    public static final BitSet FOLLOW_comentarios_in_condicao_e1939 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_condicao_e1941 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_condicao_e1945 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_condicao_comparacao_in_condicao_e1949 = new BitSet(new long[]{0x0000000000000002L,0x000008000000C000L});
    public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao1994 = new BitSet(new long[]{0x0000000000000002L,0x0000F0000000C000L});
    public static final BitSet FOLLOW_comentarios_in_condicao_comparacao2006 = new BitSet(new long[]{0x0000000000000000L,0x0000F00000000000L});
    public static final BitSet FOLLOW_108_in_condicao_comparacao2010 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_condicao_comparacao2014 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao2018 = new BitSet(new long[]{0x0000000000000002L,0x0000F0000000C000L});
    public static final BitSet FOLLOW_109_in_condicao_comparacao2072 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_condicao_comparacao2076 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao2080 = new BitSet(new long[]{0x0000000000000002L,0x0000F0000000C000L});
    public static final BitSet FOLLOW_110_in_condicao_comparacao2134 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_condicao_comparacao2138 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao2142 = new BitSet(new long[]{0x0000000000000002L,0x0000F0000000C000L});
    public static final BitSet FOLLOW_111_in_condicao_comparacao2196 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_condicao_comparacao2200 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao2204 = new BitSet(new long[]{0x0000000000000002L,0x0000F0000000C000L});
    public static final BitSet FOLLOW_expressao_in_condicao_igualdade2284 = new BitSet(new long[]{0x0000000000000002L,0x000300000000C000L});
    public static final BitSet FOLLOW_comentarios_in_condicao_igualdade2295 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_112_in_condicao_igualdade2299 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_condicao_igualdade2303 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_expressao_in_condicao_igualdade2307 = new BitSet(new long[]{0x0000000000000002L,0x000300000000C000L});
    public static final BitSet FOLLOW_113_in_condicao_igualdade2357 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_condicao_igualdade2361 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_expressao_in_condicao_igualdade2365 = new BitSet(new long[]{0x0000000000000002L,0x000300000000C000L});
    public static final BitSet FOLLOW_comentarios_in_atribuicao2443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_atribuicao2445 = new BitSet(new long[]{0x0000000000000000L,0x003C00000800C000L});
    public static final BitSet FOLLOW_comentarios_in_atribuicao2449 = new BitSet(new long[]{0x0000000000000000L,0x003C00000800C000L});
    public static final BitSet FOLLOW_opAtribuicao_in_atribuicao2451 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_atribuicao2455 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_condicao_in_atribuicao2457 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_comentarios_in_atribuicao2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_opAtribuicao2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_opAtribuicao2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_opAtribuicao2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_opAtribuicao2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_opAtribuicao2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoNum_in_expressao2590 = new BitSet(new long[]{0x0000000000000002L,0x00C000000000C000L});
    public static final BitSet FOLLOW_comentarios_in_expressao2601 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_118_in_expressao2605 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_expressao2609 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_expressaoNum_in_expressao2613 = new BitSet(new long[]{0x0000000000000002L,0x00C000000000C000L});
    public static final BitSet FOLLOW_119_in_expressao2664 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_expressao2668 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_expressaoNum_in_expressao2672 = new BitSet(new long[]{0x0000000000000002L,0x00C000000000C000L});
    public static final BitSet FOLLOW_oper_in_expressaoNum2745 = new BitSet(new long[]{0x0000000000000002L,0x070000000000C000L});
    public static final BitSet FOLLOW_comentarios_in_expressaoNum2756 = new BitSet(new long[]{0x0000000000000000L,0x0700000000000000L});
    public static final BitSet FOLLOW_120_in_expressaoNum2760 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_expressaoNum2764 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_oper_in_expressaoNum2768 = new BitSet(new long[]{0x0000000000000002L,0x070000000000C000L});
    public static final BitSet FOLLOW_121_in_expressaoNum2814 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_expressaoNum2818 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_oper_in_expressaoNum2822 = new BitSet(new long[]{0x0000000000000002L,0x070000000000C000L});
    public static final BitSet FOLLOW_122_in_expressaoNum2868 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_comentarios_in_expressaoNum2872 = new BitSet(new long[]{0x0000000000000000L,0xF8C000200000FC00L});
    public static final BitSet FOLLOW_oper_in_expressaoNum2876 = new BitSet(new long[]{0x0000000000000002L,0x070000000000C000L});
    public static final BitSet FOLLOW_opUnario_in_oper2943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_oper2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opUnario_in_oper2962 = new BitSet(new long[]{0x0000000000000000L,0xC000000000001C00L});
    public static final BitSet FOLLOW_tipo_in_oper2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_in_oper2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_oper2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incOp_in_oper3000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_oper3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_oper3017 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_incOp_in_oper3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_oper3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_input__in_oper3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_incOp3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_incOp3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_opUnario3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_opUnario3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_opUnario3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_boolean_3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_boolean_3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comentario_in_comentarios3172 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_COMENTARIO_LINHA_in_comentario3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMENTARIO_LINHAS_in_comentario3208 = new BitSet(new long[]{0x0000000000000002L});

}