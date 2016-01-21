// $ANTLR 3.2 Sep 23, 2009 12:02:23 maqv/msp.g 2016-01-19 18:11:15
 package maqv; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class mspParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Instrucoes", "Decl", "Store", "Load", "Pusha", "Push", "Jumpf", "Jump", "IOut", "IIn", "Halt", "And", "Or", "Nott", "LoEq", "Lt", "GoEq", "Gt", "Neq", "Eq", "Dec", "Inc", "Mod", "Mul", "Div", "Sub", "Add", "Energy", "Ret", "Call", "ALabel", "False", "True", "DFloat", "DBoolean", "DChar", "DInt", "Vazio", "F", "B", "S", "I", "Stackk", "STRING", "INT", "CHAR", "FLOAT", "DIGITO", "SufixoFloat", "LETRA", "ID", "WS", "','", "'ALabel'", "'Call'", "'Ret'", "'Energy'", "'Add'", "'Sub'", "'Div'", "'Mul'", "'Mod'", "'Inc'", "'Dec'", "'Eq'", "'Neq'", "'Gt'", "'GoEq'", "'Lt'", "'LoEq'", "'Not'", "'Or'", "'And'", "'Halt'", "'IIn'", "'IOut'", "'Jump'", "'Jumpf'", "'Pusha'", "'Pushi'", "'Pushc'", "'Pushf'", "'Pushb'", "'Load'", "'Store'", "'Decl'", "'true'", "'false'", "'char'", "'int'", "'boolean'", "'float'"
    };
    public static final int Decl=11;
    public static final int Jump=17;
    public static final int Push=15;
    public static final int Pusha=14;
    public static final int CHAR=55;
    public static final int Mul=33;
    public static final int Stackk=52;
    public static final int DChar=45;
    public static final int EOF=-1;
    public static final int Ret=38;
    public static final int Neq=28;
    public static final int T__93=93;
    public static final int Lt=25;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int Vazio=47;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int F=48;
    public static final int Mod=32;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int B=49;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int Halt=20;
    public static final int I=51;
    public static final int DFloat=43;
    public static final int Eq=29;
    public static final int INT=54;
    public static final int S=50;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int Nott=23;
    public static final int Dec=30;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int DBoolean=44;
    public static final int WS=61;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int Inc=31;
    public static final int SufixoFloat=58;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int Load=13;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int DIGITO=57;
    public static final int False=41;
    public static final int Gt=27;
    public static final int FLOAT=56;
    public static final int ID=60;
    public static final int Add=36;
    public static final int Jumpf=16;
    public static final int Call=39;
    public static final int DInt=46;
    public static final int Or=22;
    public static final int True=42;
    public static final int And=21;
    public static final int Div=34;
    public static final int ALabel=40;
    public static final int Store=12;
    public static final int GoEq=26;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int Instrucoes=10;
    public static final int Sub=35;
    public static final int IIn=19;
    public static final int IOut=18;
    public static final int Energy=37;
    public static final int LETRA=59;
    public static final int STRING=53;
    public static final int LoEq=24;

    // delegates
    // delegators


        public mspParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public mspParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return mspParser.tokenNames; }
    public String getGrammarFileName() { return "maqv/msp.g"; }


    public static class programa_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "programa"
    // maqv/msp.g:14:1: programa : instrucao ( ',' instrucao )* EOF -> ^( Instrucoes ( instrucao )+ ) ;
    public final mspParser.programa_return programa() throws RecognitionException {
        mspParser.programa_return retval = new mspParser.programa_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal2=null;
        Token EOF4=null;
        mspParser.instrucao_return instrucao1 = null;

        mspParser.instrucao_return instrucao3 = null;


        Tree char_literal2_tree=null;
        Tree EOF4_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_instrucao=new RewriteRuleSubtreeStream(adaptor,"rule instrucao");
        try {
            // maqv/msp.g:14:10: ( instrucao ( ',' instrucao )* EOF -> ^( Instrucoes ( instrucao )+ ) )
            // maqv/msp.g:15:2: instrucao ( ',' instrucao )* EOF
            {
            pushFollow(FOLLOW_instrucao_in_programa54);
            instrucao1=instrucao();

            state._fsp--;

            stream_instrucao.add(instrucao1.getTree());
            // maqv/msp.g:15:12: ( ',' instrucao )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==62) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // maqv/msp.g:15:13: ',' instrucao
            	    {
            	    char_literal2=(Token)match(input,62,FOLLOW_62_in_programa57);  
            	    stream_62.add(char_literal2);

            	    pushFollow(FOLLOW_instrucao_in_programa59);
            	    instrucao3=instrucao();

            	    state._fsp--;

            	    stream_instrucao.add(instrucao3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_programa63);  
            stream_EOF.add(EOF4);



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
            // 15:33: -> ^( Instrucoes ( instrucao )+ )
            {
                // maqv/msp.g:15:36: ^( Instrucoes ( instrucao )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Instrucoes, "Instrucoes"), root_1);

                if ( !(stream_instrucao.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instrucao.hasNext() ) {
                    adaptor.addChild(root_1, stream_instrucao.nextTree());

                }
                stream_instrucao.reset();

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
    // $ANTLR end "programa"

    public static class instrucao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instrucao"
    // maqv/msp.g:18:1: instrucao : ( 'ALabel' STRING -> ^( ALabel STRING ) | 'Call' STRING -> ^( Call STRING ) | 'Ret' -> ^( Ret ) | 'Energy' -> ^( Energy ) | 'Add' -> ^( Add ) | 'Sub' -> ^( Sub ) | 'Div' -> ^( Div ) | 'Mul' -> ^( Mul ) | 'Mod' -> ^( Mod ) | 'Inc' -> ^( Inc ) | 'Dec' -> ^( Dec ) | 'Eq' -> ^( Eq ) | 'Neq' -> ^( Neq ) | 'Gt' -> ^( Gt ) | 'GoEq' -> ^( GoEq ) | 'Lt' -> ^( Lt ) | 'LoEq' -> ^( LoEq ) | 'Not' -> ^( Nott ) | 'Or' -> ^( Or ) | 'And' -> ^( And ) | 'Halt' -> ^( Halt ) | 'IIn' idTipo -> ^( IIn idTipo ) | 'IOut' -> ^( IOut ) | 'Jump' STRING -> ^( Jump STRING ) | 'Jumpf' STRING -> ^( Jumpf STRING ) | 'Pusha' STRING -> ^( Pusha ^( S STRING ) ) | 'Pushi' INT -> ^( Push ^( I INT ) ) | 'Pushc' CHAR -> ^( Push ^( S CHAR ) ) | 'Pushf' FLOAT -> ^( Push ^( F FLOAT ) ) | 'Pushb' boolean_ -> ^( Push boolean_ ) | 'Load' -> ^( Load ) | 'Store' -> ^( Store ) | 'Decl' STRING INT INT -> ^( Decl STRING INT INT ) );
    public final mspParser.instrucao_return instrucao() throws RecognitionException {
        mspParser.instrucao_return retval = new mspParser.instrucao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal5=null;
        Token STRING6=null;
        Token string_literal7=null;
        Token STRING8=null;
        Token string_literal9=null;
        Token string_literal10=null;
        Token string_literal11=null;
        Token string_literal12=null;
        Token string_literal13=null;
        Token string_literal14=null;
        Token string_literal15=null;
        Token string_literal16=null;
        Token string_literal17=null;
        Token string_literal18=null;
        Token string_literal19=null;
        Token string_literal20=null;
        Token string_literal21=null;
        Token string_literal22=null;
        Token string_literal23=null;
        Token string_literal24=null;
        Token string_literal25=null;
        Token string_literal26=null;
        Token string_literal27=null;
        Token string_literal28=null;
        Token string_literal30=null;
        Token string_literal31=null;
        Token STRING32=null;
        Token string_literal33=null;
        Token STRING34=null;
        Token string_literal35=null;
        Token STRING36=null;
        Token string_literal37=null;
        Token INT38=null;
        Token string_literal39=null;
        Token CHAR40=null;
        Token string_literal41=null;
        Token FLOAT42=null;
        Token string_literal43=null;
        Token string_literal45=null;
        Token string_literal46=null;
        Token string_literal47=null;
        Token STRING48=null;
        Token INT49=null;
        Token INT50=null;
        mspParser.idTipo_return idTipo29 = null;

        mspParser.boolean__return boolean_44 = null;


        Tree string_literal5_tree=null;
        Tree STRING6_tree=null;
        Tree string_literal7_tree=null;
        Tree STRING8_tree=null;
        Tree string_literal9_tree=null;
        Tree string_literal10_tree=null;
        Tree string_literal11_tree=null;
        Tree string_literal12_tree=null;
        Tree string_literal13_tree=null;
        Tree string_literal14_tree=null;
        Tree string_literal15_tree=null;
        Tree string_literal16_tree=null;
        Tree string_literal17_tree=null;
        Tree string_literal18_tree=null;
        Tree string_literal19_tree=null;
        Tree string_literal20_tree=null;
        Tree string_literal21_tree=null;
        Tree string_literal22_tree=null;
        Tree string_literal23_tree=null;
        Tree string_literal24_tree=null;
        Tree string_literal25_tree=null;
        Tree string_literal26_tree=null;
        Tree string_literal27_tree=null;
        Tree string_literal28_tree=null;
        Tree string_literal30_tree=null;
        Tree string_literal31_tree=null;
        Tree STRING32_tree=null;
        Tree string_literal33_tree=null;
        Tree STRING34_tree=null;
        Tree string_literal35_tree=null;
        Tree STRING36_tree=null;
        Tree string_literal37_tree=null;
        Tree INT38_tree=null;
        Tree string_literal39_tree=null;
        Tree CHAR40_tree=null;
        Tree string_literal41_tree=null;
        Tree FLOAT42_tree=null;
        Tree string_literal43_tree=null;
        Tree string_literal45_tree=null;
        Tree string_literal46_tree=null;
        Tree string_literal47_tree=null;
        Tree STRING48_tree=null;
        Tree INT49_tree=null;
        Tree INT50_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_boolean_=new RewriteRuleSubtreeStream(adaptor,"rule boolean_");
        RewriteRuleSubtreeStream stream_idTipo=new RewriteRuleSubtreeStream(adaptor,"rule idTipo");
        try {
            // maqv/msp.g:19:2: ( 'ALabel' STRING -> ^( ALabel STRING ) | 'Call' STRING -> ^( Call STRING ) | 'Ret' -> ^( Ret ) | 'Energy' -> ^( Energy ) | 'Add' -> ^( Add ) | 'Sub' -> ^( Sub ) | 'Div' -> ^( Div ) | 'Mul' -> ^( Mul ) | 'Mod' -> ^( Mod ) | 'Inc' -> ^( Inc ) | 'Dec' -> ^( Dec ) | 'Eq' -> ^( Eq ) | 'Neq' -> ^( Neq ) | 'Gt' -> ^( Gt ) | 'GoEq' -> ^( GoEq ) | 'Lt' -> ^( Lt ) | 'LoEq' -> ^( LoEq ) | 'Not' -> ^( Nott ) | 'Or' -> ^( Or ) | 'And' -> ^( And ) | 'Halt' -> ^( Halt ) | 'IIn' idTipo -> ^( IIn idTipo ) | 'IOut' -> ^( IOut ) | 'Jump' STRING -> ^( Jump STRING ) | 'Jumpf' STRING -> ^( Jumpf STRING ) | 'Pusha' STRING -> ^( Pusha ^( S STRING ) ) | 'Pushi' INT -> ^( Push ^( I INT ) ) | 'Pushc' CHAR -> ^( Push ^( S CHAR ) ) | 'Pushf' FLOAT -> ^( Push ^( F FLOAT ) ) | 'Pushb' boolean_ -> ^( Push boolean_ ) | 'Load' -> ^( Load ) | 'Store' -> ^( Store ) | 'Decl' STRING INT INT -> ^( Decl STRING INT INT ) )
            int alt2=33;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt2=1;
                }
                break;
            case 64:
                {
                alt2=2;
                }
                break;
            case 65:
                {
                alt2=3;
                }
                break;
            case 66:
                {
                alt2=4;
                }
                break;
            case 67:
                {
                alt2=5;
                }
                break;
            case 68:
                {
                alt2=6;
                }
                break;
            case 69:
                {
                alt2=7;
                }
                break;
            case 70:
                {
                alt2=8;
                }
                break;
            case 71:
                {
                alt2=9;
                }
                break;
            case 72:
                {
                alt2=10;
                }
                break;
            case 73:
                {
                alt2=11;
                }
                break;
            case 74:
                {
                alt2=12;
                }
                break;
            case 75:
                {
                alt2=13;
                }
                break;
            case 76:
                {
                alt2=14;
                }
                break;
            case 77:
                {
                alt2=15;
                }
                break;
            case 78:
                {
                alt2=16;
                }
                break;
            case 79:
                {
                alt2=17;
                }
                break;
            case 80:
                {
                alt2=18;
                }
                break;
            case 81:
                {
                alt2=19;
                }
                break;
            case 82:
                {
                alt2=20;
                }
                break;
            case 83:
                {
                alt2=21;
                }
                break;
            case 84:
                {
                alt2=22;
                }
                break;
            case 85:
                {
                alt2=23;
                }
                break;
            case 86:
                {
                alt2=24;
                }
                break;
            case 87:
                {
                alt2=25;
                }
                break;
            case 88:
                {
                alt2=26;
                }
                break;
            case 89:
                {
                alt2=27;
                }
                break;
            case 90:
                {
                alt2=28;
                }
                break;
            case 91:
                {
                alt2=29;
                }
                break;
            case 92:
                {
                alt2=30;
                }
                break;
            case 93:
                {
                alt2=31;
                }
                break;
            case 94:
                {
                alt2=32;
                }
                break;
            case 95:
                {
                alt2=33;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // maqv/msp.g:19:4: 'ALabel' STRING
                    {
                    string_literal5=(Token)match(input,63,FOLLOW_63_in_instrucao83);  
                    stream_63.add(string_literal5);

                    STRING6=(Token)match(input,STRING,FOLLOW_STRING_in_instrucao85);  
                    stream_STRING.add(STRING6);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 19:20: -> ^( ALabel STRING )
                    {
                        // maqv/msp.g:19:23: ^( ALabel STRING )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ALabel, "ALabel"), root_1);

                        adaptor.addChild(root_1, stream_STRING.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // maqv/msp.g:21:4: 'Call' STRING
                    {
                    string_literal7=(Token)match(input,64,FOLLOW_64_in_instrucao101);  
                    stream_64.add(string_literal7);

                    STRING8=(Token)match(input,STRING,FOLLOW_STRING_in_instrucao103);  
                    stream_STRING.add(STRING8);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 21:18: -> ^( Call STRING )
                    {
                        // maqv/msp.g:21:21: ^( Call STRING )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Call, "Call"), root_1);

                        adaptor.addChild(root_1, stream_STRING.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // maqv/msp.g:22:4: 'Ret'
                    {
                    string_literal9=(Token)match(input,65,FOLLOW_65_in_instrucao118);  
                    stream_65.add(string_literal9);



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
                    // 22:10: -> ^( Ret )
                    {
                        // maqv/msp.g:22:13: ^( Ret )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Ret, "Ret"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // maqv/msp.g:23:4: 'Energy'
                    {
                    string_literal10=(Token)match(input,66,FOLLOW_66_in_instrucao132);  
                    stream_66.add(string_literal10);



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
                    // 23:13: -> ^( Energy )
                    {
                        // maqv/msp.g:23:16: ^( Energy )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Energy, "Energy"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // maqv/msp.g:25:4: 'Add'
                    {
                    string_literal11=(Token)match(input,67,FOLLOW_67_in_instrucao146);  
                    stream_67.add(string_literal11);



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
                    // 25:10: -> ^( Add )
                    {
                        // maqv/msp.g:25:13: ^( Add )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Add, "Add"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // maqv/msp.g:26:5: 'Sub'
                    {
                    string_literal12=(Token)match(input,68,FOLLOW_68_in_instrucao161);  
                    stream_68.add(string_literal12);



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
                    // 26:11: -> ^( Sub )
                    {
                        // maqv/msp.g:26:14: ^( Sub )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Sub, "Sub"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // maqv/msp.g:27:4: 'Div'
                    {
                    string_literal13=(Token)match(input,69,FOLLOW_69_in_instrucao172);  
                    stream_69.add(string_literal13);



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
                    // 27:10: -> ^( Div )
                    {
                        // maqv/msp.g:27:13: ^( Div )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Div, "Div"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // maqv/msp.g:28:4: 'Mul'
                    {
                    string_literal14=(Token)match(input,70,FOLLOW_70_in_instrucao183);  
                    stream_70.add(string_literal14);



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
                    // 28:10: -> ^( Mul )
                    {
                        // maqv/msp.g:28:13: ^( Mul )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Mul, "Mul"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // maqv/msp.g:29:4: 'Mod'
                    {
                    string_literal15=(Token)match(input,71,FOLLOW_71_in_instrucao194);  
                    stream_71.add(string_literal15);



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
                    // 29:10: -> ^( Mod )
                    {
                        // maqv/msp.g:29:13: ^( Mod )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Mod, "Mod"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 10 :
                    // maqv/msp.g:30:4: 'Inc'
                    {
                    string_literal16=(Token)match(input,72,FOLLOW_72_in_instrucao205);  
                    stream_72.add(string_literal16);



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
                    // 30:10: -> ^( Inc )
                    {
                        // maqv/msp.g:30:13: ^( Inc )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Inc, "Inc"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 11 :
                    // maqv/msp.g:31:4: 'Dec'
                    {
                    string_literal17=(Token)match(input,73,FOLLOW_73_in_instrucao216);  
                    stream_73.add(string_literal17);



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
                    // 31:10: -> ^( Dec )
                    {
                        // maqv/msp.g:31:13: ^( Dec )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Dec, "Dec"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 12 :
                    // maqv/msp.g:32:4: 'Eq'
                    {
                    string_literal18=(Token)match(input,74,FOLLOW_74_in_instrucao227);  
                    stream_74.add(string_literal18);



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
                    // 32:9: -> ^( Eq )
                    {
                        // maqv/msp.g:32:12: ^( Eq )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Eq, "Eq"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 13 :
                    // maqv/msp.g:33:4: 'Neq'
                    {
                    string_literal19=(Token)match(input,75,FOLLOW_75_in_instrucao238);  
                    stream_75.add(string_literal19);



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
                    // 33:10: -> ^( Neq )
                    {
                        // maqv/msp.g:33:13: ^( Neq )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Neq, "Neq"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 14 :
                    // maqv/msp.g:34:4: 'Gt'
                    {
                    string_literal20=(Token)match(input,76,FOLLOW_76_in_instrucao249);  
                    stream_76.add(string_literal20);



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
                    // 34:9: -> ^( Gt )
                    {
                        // maqv/msp.g:34:12: ^( Gt )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Gt, "Gt"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 15 :
                    // maqv/msp.g:35:4: 'GoEq'
                    {
                    string_literal21=(Token)match(input,77,FOLLOW_77_in_instrucao260);  
                    stream_77.add(string_literal21);



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
                    // 35:11: -> ^( GoEq )
                    {
                        // maqv/msp.g:35:14: ^( GoEq )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(GoEq, "GoEq"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 16 :
                    // maqv/msp.g:36:4: 'Lt'
                    {
                    string_literal22=(Token)match(input,78,FOLLOW_78_in_instrucao271);  
                    stream_78.add(string_literal22);



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
                    // 36:9: -> ^( Lt )
                    {
                        // maqv/msp.g:36:12: ^( Lt )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Lt, "Lt"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 17 :
                    // maqv/msp.g:37:4: 'LoEq'
                    {
                    string_literal23=(Token)match(input,79,FOLLOW_79_in_instrucao282);  
                    stream_79.add(string_literal23);



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
                    // 37:11: -> ^( LoEq )
                    {
                        // maqv/msp.g:37:14: ^( LoEq )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(LoEq, "LoEq"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 18 :
                    // maqv/msp.g:38:4: 'Not'
                    {
                    string_literal24=(Token)match(input,80,FOLLOW_80_in_instrucao293);  
                    stream_80.add(string_literal24);



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
                    // 38:10: -> ^( Nott )
                    {
                        // maqv/msp.g:38:13: ^( Nott )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Nott, "Nott"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 19 :
                    // maqv/msp.g:39:4: 'Or'
                    {
                    string_literal25=(Token)match(input,81,FOLLOW_81_in_instrucao304);  
                    stream_81.add(string_literal25);



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
                    // 39:9: -> ^( Or )
                    {
                        // maqv/msp.g:39:12: ^( Or )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Or, "Or"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 20 :
                    // maqv/msp.g:40:4: 'And'
                    {
                    string_literal26=(Token)match(input,82,FOLLOW_82_in_instrucao315);  
                    stream_82.add(string_literal26);



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
                    // 40:10: -> ^( And )
                    {
                        // maqv/msp.g:40:13: ^( And )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(And, "And"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 21 :
                    // maqv/msp.g:42:4: 'Halt'
                    {
                    string_literal27=(Token)match(input,83,FOLLOW_83_in_instrucao328);  
                    stream_83.add(string_literal27);



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
                    // 42:11: -> ^( Halt )
                    {
                        // maqv/msp.g:42:14: ^( Halt )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Halt, "Halt"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 22 :
                    // maqv/msp.g:44:4: 'IIn' idTipo
                    {
                    string_literal28=(Token)match(input,84,FOLLOW_84_in_instrucao344);  
                    stream_84.add(string_literal28);

                    pushFollow(FOLLOW_idTipo_in_instrucao346);
                    idTipo29=idTipo();

                    state._fsp--;

                    stream_idTipo.add(idTipo29.getTree());


                    // AST REWRITE
                    // elements: idTipo
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 44:17: -> ^( IIn idTipo )
                    {
                        // maqv/msp.g:44:20: ^( IIn idTipo )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(IIn, "IIn"), root_1);

                        adaptor.addChild(root_1, stream_idTipo.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 23 :
                    // maqv/msp.g:45:4: 'IOut'
                    {
                    string_literal30=(Token)match(input,85,FOLLOW_85_in_instrucao362);  
                    stream_85.add(string_literal30);



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
                    // 45:11: -> ^( IOut )
                    {
                        // maqv/msp.g:45:14: ^( IOut )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(IOut, "IOut"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 24 :
                    // maqv/msp.g:47:4: 'Jump' STRING
                    {
                    string_literal31=(Token)match(input,86,FOLLOW_86_in_instrucao375);  
                    stream_86.add(string_literal31);

                    STRING32=(Token)match(input,STRING,FOLLOW_STRING_in_instrucao377);  
                    stream_STRING.add(STRING32);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 47:18: -> ^( Jump STRING )
                    {
                        // maqv/msp.g:47:21: ^( Jump STRING )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Jump, "Jump"), root_1);

                        adaptor.addChild(root_1, stream_STRING.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 25 :
                    // maqv/msp.g:48:4: 'Jumpf' STRING
                    {
                    string_literal33=(Token)match(input,87,FOLLOW_87_in_instrucao392);  
                    stream_87.add(string_literal33);

                    STRING34=(Token)match(input,STRING,FOLLOW_STRING_in_instrucao394);  
                    stream_STRING.add(STRING34);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 48:19: -> ^( Jumpf STRING )
                    {
                        // maqv/msp.g:48:22: ^( Jumpf STRING )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Jumpf, "Jumpf"), root_1);

                        adaptor.addChild(root_1, stream_STRING.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 26 :
                    // maqv/msp.g:50:4: 'Pusha' STRING
                    {
                    string_literal35=(Token)match(input,88,FOLLOW_88_in_instrucao409);  
                    stream_88.add(string_literal35);

                    STRING36=(Token)match(input,STRING,FOLLOW_STRING_in_instrucao411);  
                    stream_STRING.add(STRING36);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 50:19: -> ^( Pusha ^( S STRING ) )
                    {
                        // maqv/msp.g:50:22: ^( Pusha ^( S STRING ) )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Pusha, "Pusha"), root_1);

                        // maqv/msp.g:50:30: ^( S STRING )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(S, "S"), root_2);

                        adaptor.addChild(root_2, stream_STRING.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 27 :
                    // maqv/msp.g:51:4: 'Pushi' INT
                    {
                    string_literal37=(Token)match(input,89,FOLLOW_89_in_instrucao430);  
                    stream_89.add(string_literal37);

                    INT38=(Token)match(input,INT,FOLLOW_INT_in_instrucao432);  
                    stream_INT.add(INT38);



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
                    // 51:16: -> ^( Push ^( I INT ) )
                    {
                        // maqv/msp.g:51:19: ^( Push ^( I INT ) )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Push, "Push"), root_1);

                        // maqv/msp.g:51:26: ^( I INT )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(I, "I"), root_2);

                        adaptor.addChild(root_2, stream_INT.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 28 :
                    // maqv/msp.g:52:4: 'Pushc' CHAR
                    {
                    string_literal39=(Token)match(input,90,FOLLOW_90_in_instrucao449);  
                    stream_90.add(string_literal39);

                    CHAR40=(Token)match(input,CHAR,FOLLOW_CHAR_in_instrucao451);  
                    stream_CHAR.add(CHAR40);



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
                    // 52:17: -> ^( Push ^( S CHAR ) )
                    {
                        // maqv/msp.g:52:20: ^( Push ^( S CHAR ) )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Push, "Push"), root_1);

                        // maqv/msp.g:52:27: ^( S CHAR )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(S, "S"), root_2);

                        adaptor.addChild(root_2, stream_CHAR.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 29 :
                    // maqv/msp.g:53:4: 'Pushf' FLOAT
                    {
                    string_literal41=(Token)match(input,91,FOLLOW_91_in_instrucao468);  
                    stream_91.add(string_literal41);

                    FLOAT42=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_instrucao470);  
                    stream_FLOAT.add(FLOAT42);



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
                    // 53:18: -> ^( Push ^( F FLOAT ) )
                    {
                        // maqv/msp.g:53:21: ^( Push ^( F FLOAT ) )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Push, "Push"), root_1);

                        // maqv/msp.g:53:28: ^( F FLOAT )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(F, "F"), root_2);

                        adaptor.addChild(root_2, stream_FLOAT.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 30 :
                    // maqv/msp.g:54:4: 'Pushb' boolean_
                    {
                    string_literal43=(Token)match(input,92,FOLLOW_92_in_instrucao487);  
                    stream_92.add(string_literal43);

                    pushFollow(FOLLOW_boolean__in_instrucao489);
                    boolean_44=boolean_();

                    state._fsp--;

                    stream_boolean_.add(boolean_44.getTree());


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
                    // 54:21: -> ^( Push boolean_ )
                    {
                        // maqv/msp.g:54:24: ^( Push boolean_ )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Push, "Push"), root_1);

                        adaptor.addChild(root_1, stream_boolean_.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 31 :
                    // maqv/msp.g:55:4: 'Load'
                    {
                    string_literal45=(Token)match(input,93,FOLLOW_93_in_instrucao502);  
                    stream_93.add(string_literal45);



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
                    // 55:11: -> ^( Load )
                    {
                        // maqv/msp.g:55:14: ^( Load )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Load, "Load"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 32 :
                    // maqv/msp.g:56:4: 'Store'
                    {
                    string_literal46=(Token)match(input,94,FOLLOW_94_in_instrucao513);  
                    stream_94.add(string_literal46);



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
                    // 56:12: -> ^( Store )
                    {
                        // maqv/msp.g:56:15: ^( Store )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Store, "Store"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 33 :
                    // maqv/msp.g:57:4: 'Decl' STRING INT INT
                    {
                    string_literal47=(Token)match(input,95,FOLLOW_95_in_instrucao524);  
                    stream_95.add(string_literal47);

                    STRING48=(Token)match(input,STRING,FOLLOW_STRING_in_instrucao526);  
                    stream_STRING.add(STRING48);

                    INT49=(Token)match(input,INT,FOLLOW_INT_in_instrucao528);  
                    stream_INT.add(INT49);

                    INT50=(Token)match(input,INT,FOLLOW_INT_in_instrucao530);  
                    stream_INT.add(INT50);



                    // AST REWRITE
                    // elements: INT, INT, STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 57:26: -> ^( Decl STRING INT INT )
                    {
                        // maqv/msp.g:57:29: ^( Decl STRING INT INT )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Decl, "Decl"), root_1);

                        adaptor.addChild(root_1, stream_STRING.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

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

    public static class boolean__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_"
    // maqv/msp.g:69:1: boolean_ : ( 'true' -> ^( True ) | 'false' -> ^( False ) );
    public final mspParser.boolean__return boolean_() throws RecognitionException {
        mspParser.boolean__return retval = new mspParser.boolean__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal51=null;
        Token string_literal52=null;

        Tree string_literal51_tree=null;
        Tree string_literal52_tree=null;
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");

        try {
            // maqv/msp.g:70:2: ( 'true' -> ^( True ) | 'false' -> ^( False ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==96) ) {
                alt3=1;
            }
            else if ( (LA3_0==97) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // maqv/msp.g:70:4: 'true'
                    {
                    string_literal51=(Token)match(input,96,FOLLOW_96_in_boolean_556);  
                    stream_96.add(string_literal51);



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
                    // 70:11: -> ^( True )
                    {
                        // maqv/msp.g:70:14: ^( True )
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
                    // maqv/msp.g:71:4: 'false'
                    {
                    string_literal52=(Token)match(input,97,FOLLOW_97_in_boolean_567);  
                    stream_97.add(string_literal52);



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
                    // 71:12: -> ^( False )
                    {
                        // maqv/msp.g:71:15: ^( False )
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

    public static class idTipo_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idTipo"
    // maqv/msp.g:74:1: idTipo : ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) ) ;
    public final mspParser.idTipo_return idTipo() throws RecognitionException {
        mspParser.idTipo_return retval = new mspParser.idTipo_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal53=null;
        Token string_literal54=null;
        Token string_literal55=null;
        Token string_literal56=null;

        Tree string_literal53_tree=null;
        Tree string_literal54_tree=null;
        Tree string_literal55_tree=null;
        Tree string_literal56_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");

        try {
            // maqv/msp.g:74:8: ( ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) ) )
            // maqv/msp.g:74:10: ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) )
            {
            // maqv/msp.g:74:10: ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt4=1;
                }
                break;
            case 99:
                {
                alt4=2;
                }
                break;
            case 100:
                {
                alt4=3;
                }
                break;
            case 101:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // maqv/msp.g:74:11: 'char'
                    {
                    string_literal53=(Token)match(input,98,FOLLOW_98_in_idTipo585);  
                    stream_98.add(string_literal53);



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
                    // 74:18: -> ^( DChar )
                    {
                        // maqv/msp.g:74:21: ^( DChar )
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
                    // maqv/msp.g:74:32: 'int'
                    {
                    string_literal54=(Token)match(input,99,FOLLOW_99_in_idTipo595);  
                    stream_99.add(string_literal54);



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
                    // 74:38: -> ^( DInt )
                    {
                        // maqv/msp.g:74:41: ^( DInt )
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
                    // maqv/msp.g:74:51: 'boolean'
                    {
                    string_literal55=(Token)match(input,100,FOLLOW_100_in_idTipo605);  
                    stream_100.add(string_literal55);



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
                    // 74:61: -> ^( DBoolean )
                    {
                        // maqv/msp.g:74:64: ^( DBoolean )
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
                    // maqv/msp.g:74:78: 'float'
                    {
                    string_literal56=(Token)match(input,101,FOLLOW_101_in_idTipo615);  
                    stream_101.add(string_literal56);



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
                    // 74:86: -> ^( DFloat )
                    {
                        // maqv/msp.g:74:89: ^( DFloat )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DFloat, "DFloat"), root_1);

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

    // Delegated rules


 

    public static final BitSet FOLLOW_instrucao_in_programa54 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_programa57 = new BitSet(new long[]{0x8000000000000000L,0x00000000FFFFFFFFL});
    public static final BitSet FOLLOW_instrucao_in_programa59 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_EOF_in_programa63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_instrucao83 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_in_instrucao85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_instrucao101 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_in_instrucao103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_instrucao118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_instrucao132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_instrucao146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_instrucao161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_instrucao172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_instrucao183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_instrucao194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_instrucao205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_instrucao216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_instrucao227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_instrucao238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_instrucao249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_instrucao260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_instrucao271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_instrucao282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_instrucao293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_instrucao304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_instrucao315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_instrucao328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_instrucao344 = new BitSet(new long[]{0x0000000000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_idTipo_in_instrucao346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_instrucao362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_instrucao375 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_in_instrucao377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_instrucao392 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_in_instrucao394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_instrucao409 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_in_instrucao411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_instrucao430 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_INT_in_instrucao432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_instrucao449 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_CHAR_in_instrucao451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_instrucao468 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FLOAT_in_instrucao470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_instrucao487 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_boolean__in_instrucao489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_instrucao502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_instrucao513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_instrucao524 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_in_instrucao526 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_INT_in_instrucao528 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_INT_in_instrucao530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_boolean_556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_boolean_567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_idTipo585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_idTipo595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_idTipo605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_idTipo615 = new BitSet(new long[]{0x0000000000000002L});

}