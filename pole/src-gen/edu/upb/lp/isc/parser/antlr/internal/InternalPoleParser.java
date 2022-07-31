package edu.upb.lp.isc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.upb.lp.isc.services.PoleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPoleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PO'", "'LE'", "'EYYOLVIDONA'", "'('", "'EY'", "')'", "'OIGO'", "'MUY'", "'PEROMUY'", "'BORROSO'", "'PARATICONDESPRECIO'", "'@'", "'PARATI'", "'GG?'", "'WITHTEAM'", "'NOTEAM'", "'EZ'", "'CASITEAM'", "'RULETARUSA?'", "'BOOM'", "'BALA'", "'CHOCO'", "'YVOLO'", "'YYOVOLE'", "'YSEFUE'", "'SA'", "'MATAO'", "'PACO'", "'AHITEVAMI'", "'DOLOR'", "'PEREMENNAYA'", "'->'", "'DALAS'", "'MRBEAST'", "'XOKAS'", "'YINYANG'", "'MICORAZON'", "'-'", "'.'", "'e'", "'E'", "'KGRANDE'", "'SUMA'", "'RESTA'", "'MULTIPLICACION'", "'DIVISION'", "'MODULO'", "'JULIOPROFE'", "'Y'", "'LA'", "'GOTITA'", "'POXI'", "'AGUA'", "'POL'", "'RRAS'", "'MIBILLETERA'", "'PEPE'", "'NAR'", "'XO'", "'PANDA'", "'ANJA'", "'R'", "'LEGAL'", "'ILEGAL'", "'ALEGAL'", "'ANTILEGAL'", "'ALVERRES'", "'CON'", "'YIN'", "'YANG'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPoleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPoleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPoleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPole.g"; }



     	private PoleGrammarAccess grammarAccess;

        public InternalPoleParser(TokenStream input, PoleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Programa";
       	}

       	@Override
       	protected PoleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePrograma"
    // InternalPole.g:64:1: entryRulePrograma returns [EObject current=null] : iv_rulePrograma= rulePrograma EOF ;
    public final EObject entryRulePrograma() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrograma = null;


        try {
            // InternalPole.g:64:49: (iv_rulePrograma= rulePrograma EOF )
            // InternalPole.g:65:2: iv_rulePrograma= rulePrograma EOF
            {
             newCompositeNode(grammarAccess.getProgramaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrograma=rulePrograma();

            state._fsp--;

             current =iv_rulePrograma; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrograma"


    // $ANTLR start "rulePrograma"
    // InternalPole.g:71:1: rulePrograma returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'PO' ( (lv_ej_2_0= ruleEjecucion ) ) otherlv_3= 'LE' ) ;
    public final EObject rulePrograma() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ej_2_0 = null;



        	enterRule();

        try {
            // InternalPole.g:77:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'PO' ( (lv_ej_2_0= ruleEjecucion ) ) otherlv_3= 'LE' ) )
            // InternalPole.g:78:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'PO' ( (lv_ej_2_0= ruleEjecucion ) ) otherlv_3= 'LE' )
            {
            // InternalPole.g:78:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'PO' ( (lv_ej_2_0= ruleEjecucion ) ) otherlv_3= 'LE' )
            // InternalPole.g:79:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'PO' ( (lv_ej_2_0= ruleEjecucion ) ) otherlv_3= 'LE'
            {
            // InternalPole.g:79:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPole.g:80:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPole.g:80:4: (lv_name_0_0= RULE_ID )
            // InternalPole.g:81:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getProgramaAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramaAccess().getPOKeyword_1());
            		
            // InternalPole.g:101:3: ( (lv_ej_2_0= ruleEjecucion ) )
            // InternalPole.g:102:4: (lv_ej_2_0= ruleEjecucion )
            {
            // InternalPole.g:102:4: (lv_ej_2_0= ruleEjecucion )
            // InternalPole.g:103:5: lv_ej_2_0= ruleEjecucion
            {

            					newCompositeNode(grammarAccess.getProgramaAccess().getEjEjecucionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_ej_2_0=ruleEjecucion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramaRule());
            					}
            					set(
            						current,
            						"ej",
            						lv_ej_2_0,
            						"edu.upb.lp.isc.Pole.Ejecucion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProgramaAccess().getLEKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrograma"


    // $ANTLR start "entryRuleEjecucion"
    // InternalPole.g:128:1: entryRuleEjecucion returns [EObject current=null] : iv_ruleEjecucion= ruleEjecucion EOF ;
    public final EObject entryRuleEjecucion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEjecucion = null;


        try {
            // InternalPole.g:128:50: (iv_ruleEjecucion= ruleEjecucion EOF )
            // InternalPole.g:129:2: iv_ruleEjecucion= ruleEjecucion EOF
            {
             newCompositeNode(grammarAccess.getEjecucionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEjecucion=ruleEjecucion();

            state._fsp--;

             current =iv_ruleEjecucion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEjecucion"


    // $ANTLR start "ruleEjecucion"
    // InternalPole.g:135:1: ruleEjecucion returns [EObject current=null] : ( (lv_instr_0_0= ruleInstruccion ) )+ ;
    public final EObject ruleEjecucion() throws RecognitionException {
        EObject current = null;

        EObject lv_instr_0_0 = null;



        	enterRule();

        try {
            // InternalPole.g:141:2: ( ( (lv_instr_0_0= ruleInstruccion ) )+ )
            // InternalPole.g:142:2: ( (lv_instr_0_0= ruleInstruccion ) )+
            {
            // InternalPole.g:142:2: ( (lv_instr_0_0= ruleInstruccion ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==13||LA1_0==17||LA1_0==21||(LA1_0>=23 && LA1_0<=24)||LA1_0==32||LA1_0==36||LA1_0==39||LA1_0==41) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPole.g:143:3: (lv_instr_0_0= ruleInstruccion )
            	    {
            	    // InternalPole.g:143:3: (lv_instr_0_0= ruleInstruccion )
            	    // InternalPole.g:144:4: lv_instr_0_0= ruleInstruccion
            	    {

            	    				newCompositeNode(grammarAccess.getEjecucionAccess().getInstrInstruccionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_6);
            	    lv_instr_0_0=ruleInstruccion();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getEjecucionRule());
            	    				}
            	    				add(
            	    					current,
            	    					"instr",
            	    					lv_instr_0_0,
            	    					"edu.upb.lp.isc.Pole.Instruccion");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEjecucion"


    // $ANTLR start "entryRuleInstruccion"
    // InternalPole.g:164:1: entryRuleInstruccion returns [EObject current=null] : iv_ruleInstruccion= ruleInstruccion EOF ;
    public final EObject entryRuleInstruccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruccion = null;


        try {
            // InternalPole.g:164:52: (iv_ruleInstruccion= ruleInstruccion EOF )
            // InternalPole.g:165:2: iv_ruleInstruccion= ruleInstruccion EOF
            {
             newCompositeNode(grammarAccess.getInstruccionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruccion=ruleInstruccion();

            state._fsp--;

             current =iv_ruleInstruccion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruccion"


    // $ANTLR start "ruleInstruccion"
    // InternalPole.g:171:1: ruleInstruccion returns [EObject current=null] : (this_DeclVariables_0= ruleDeclVariables | this_Imprimir_1= ruleImprimir | this_Condicional_2= ruleCondicional | this_Switch_3= ruleSwitch | this_For_4= ruleFor | this_While_5= ruleWhile | this_DoWhile_6= ruleDoWhile | this_Funciones_7= ruleFunciones | this_AsignacionVariable_8= ruleAsignacionVariable | this_LlamadoMetodo_9= ruleLlamadoMetodo | this_ImprimirSinSaltoDeLinea_10= ruleImprimirSinSaltoDeLinea ) ;
    public final EObject ruleInstruccion() throws RecognitionException {
        EObject current = null;

        EObject this_DeclVariables_0 = null;

        EObject this_Imprimir_1 = null;

        EObject this_Condicional_2 = null;

        EObject this_Switch_3 = null;

        EObject this_For_4 = null;

        EObject this_While_5 = null;

        EObject this_DoWhile_6 = null;

        EObject this_Funciones_7 = null;

        EObject this_AsignacionVariable_8 = null;

        EObject this_LlamadoMetodo_9 = null;

        EObject this_ImprimirSinSaltoDeLinea_10 = null;



        	enterRule();

        try {
            // InternalPole.g:177:2: ( (this_DeclVariables_0= ruleDeclVariables | this_Imprimir_1= ruleImprimir | this_Condicional_2= ruleCondicional | this_Switch_3= ruleSwitch | this_For_4= ruleFor | this_While_5= ruleWhile | this_DoWhile_6= ruleDoWhile | this_Funciones_7= ruleFunciones | this_AsignacionVariable_8= ruleAsignacionVariable | this_LlamadoMetodo_9= ruleLlamadoMetodo | this_ImprimirSinSaltoDeLinea_10= ruleImprimirSinSaltoDeLinea ) )
            // InternalPole.g:178:2: (this_DeclVariables_0= ruleDeclVariables | this_Imprimir_1= ruleImprimir | this_Condicional_2= ruleCondicional | this_Switch_3= ruleSwitch | this_For_4= ruleFor | this_While_5= ruleWhile | this_DoWhile_6= ruleDoWhile | this_Funciones_7= ruleFunciones | this_AsignacionVariable_8= ruleAsignacionVariable | this_LlamadoMetodo_9= ruleLlamadoMetodo | this_ImprimirSinSaltoDeLinea_10= ruleImprimirSinSaltoDeLinea )
            {
            // InternalPole.g:178:2: (this_DeclVariables_0= ruleDeclVariables | this_Imprimir_1= ruleImprimir | this_Condicional_2= ruleCondicional | this_Switch_3= ruleSwitch | this_For_4= ruleFor | this_While_5= ruleWhile | this_DoWhile_6= ruleDoWhile | this_Funciones_7= ruleFunciones | this_AsignacionVariable_8= ruleAsignacionVariable | this_LlamadoMetodo_9= ruleLlamadoMetodo | this_ImprimirSinSaltoDeLinea_10= ruleImprimirSinSaltoDeLinea )
            int alt2=11;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalPole.g:179:3: this_DeclVariables_0= ruleDeclVariables
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getDeclVariablesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclVariables_0=ruleDeclVariables();

                    state._fsp--;


                    			current = this_DeclVariables_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPole.g:188:3: this_Imprimir_1= ruleImprimir
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getImprimirParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Imprimir_1=ruleImprimir();

                    state._fsp--;


                    			current = this_Imprimir_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPole.g:197:3: this_Condicional_2= ruleCondicional
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getCondicionalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condicional_2=ruleCondicional();

                    state._fsp--;


                    			current = this_Condicional_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPole.g:206:3: this_Switch_3= ruleSwitch
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getSwitchParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Switch_3=ruleSwitch();

                    state._fsp--;


                    			current = this_Switch_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPole.g:215:3: this_For_4= ruleFor
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getForParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_For_4=ruleFor();

                    state._fsp--;


                    			current = this_For_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPole.g:224:3: this_While_5= ruleWhile
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getWhileParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_While_5=ruleWhile();

                    state._fsp--;


                    			current = this_While_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPole.g:233:3: this_DoWhile_6= ruleDoWhile
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getDoWhileParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoWhile_6=ruleDoWhile();

                    state._fsp--;


                    			current = this_DoWhile_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalPole.g:242:3: this_Funciones_7= ruleFunciones
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getFuncionesParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Funciones_7=ruleFunciones();

                    state._fsp--;


                    			current = this_Funciones_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalPole.g:251:3: this_AsignacionVariable_8= ruleAsignacionVariable
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getAsignacionVariableParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_AsignacionVariable_8=ruleAsignacionVariable();

                    state._fsp--;


                    			current = this_AsignacionVariable_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalPole.g:260:3: this_LlamadoMetodo_9= ruleLlamadoMetodo
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getLlamadoMetodoParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_LlamadoMetodo_9=ruleLlamadoMetodo();

                    state._fsp--;


                    			current = this_LlamadoMetodo_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalPole.g:269:3: this_ImprimirSinSaltoDeLinea_10= ruleImprimirSinSaltoDeLinea
                    {

                    			newCompositeNode(grammarAccess.getInstruccionAccess().getImprimirSinSaltoDeLineaParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImprimirSinSaltoDeLinea_10=ruleImprimirSinSaltoDeLinea();

                    state._fsp--;


                    			current = this_ImprimirSinSaltoDeLinea_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruccion"


    // $ANTLR start "entryRuleLlamadoMetodo"
    // InternalPole.g:281:1: entryRuleLlamadoMetodo returns [EObject current=null] : iv_ruleLlamadoMetodo= ruleLlamadoMetodo EOF ;
    public final EObject entryRuleLlamadoMetodo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlamadoMetodo = null;


        try {
            // InternalPole.g:281:54: (iv_ruleLlamadoMetodo= ruleLlamadoMetodo EOF )
            // InternalPole.g:282:2: iv_ruleLlamadoMetodo= ruleLlamadoMetodo EOF
            {
             newCompositeNode(grammarAccess.getLlamadoMetodoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLlamadoMetodo=ruleLlamadoMetodo();

            state._fsp--;

             current =iv_ruleLlamadoMetodo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLlamadoMetodo"


    // $ANTLR start "ruleLlamadoMetodo"
    // InternalPole.g:288:1: ruleLlamadoMetodo returns [EObject current=null] : (otherlv_0= 'EYYOLVIDONA' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'EY' ( (lv_args_4_0= ruleExpresion ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleLlamadoMetodo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalPole.g:294:2: ( (otherlv_0= 'EYYOLVIDONA' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'EY' ( (lv_args_4_0= ruleExpresion ) ) )* otherlv_5= ')' ) )
            // InternalPole.g:295:2: (otherlv_0= 'EYYOLVIDONA' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'EY' ( (lv_args_4_0= ruleExpresion ) ) )* otherlv_5= ')' )
            {
            // InternalPole.g:295:2: (otherlv_0= 'EYYOLVIDONA' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'EY' ( (lv_args_4_0= ruleExpresion ) ) )* otherlv_5= ')' )
            // InternalPole.g:296:3: otherlv_0= 'EYYOLVIDONA' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'EY' ( (lv_args_4_0= ruleExpresion ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLlamadoMetodoAccess().getEYYOLVIDONAKeyword_0());
            		
            // InternalPole.g:300:3: ( (otherlv_1= RULE_ID ) )
            // InternalPole.g:301:4: (otherlv_1= RULE_ID )
            {
            // InternalPole.g:301:4: (otherlv_1= RULE_ID )
            // InternalPole.g:302:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLlamadoMetodoRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_1, grammarAccess.getLlamadoMetodoAccess().getMethodFuncionesCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getLlamadoMetodoAccess().getLeftParenthesisKeyword_2());
            		
            // InternalPole.g:317:3: (otherlv_3= 'EY' ( (lv_args_4_0= ruleExpresion ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPole.g:318:4: otherlv_3= 'EY' ( (lv_args_4_0= ruleExpresion ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getLlamadoMetodoAccess().getEYKeyword_3_0());
            	    			
            	    // InternalPole.g:322:4: ( (lv_args_4_0= ruleExpresion ) )
            	    // InternalPole.g:323:5: (lv_args_4_0= ruleExpresion )
            	    {
            	    // InternalPole.g:323:5: (lv_args_4_0= ruleExpresion )
            	    // InternalPole.g:324:6: lv_args_4_0= ruleExpresion
            	    {

            	    						newCompositeNode(grammarAccess.getLlamadoMetodoAccess().getArgsExpresionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_args_4_0=ruleExpresion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLlamadoMetodoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"args",
            	    							lv_args_4_0,
            	    							"edu.upb.lp.isc.Pole.Expresion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLlamadoMetodoAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLlamadoMetodo"


    // $ANTLR start "entryRuleFunciones"
    // InternalPole.g:350:1: entryRuleFunciones returns [EObject current=null] : iv_ruleFunciones= ruleFunciones EOF ;
    public final EObject entryRuleFunciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunciones = null;


        try {
            // InternalPole.g:350:50: (iv_ruleFunciones= ruleFunciones EOF )
            // InternalPole.g:351:2: iv_ruleFunciones= ruleFunciones EOF
            {
             newCompositeNode(grammarAccess.getFuncionesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunciones=ruleFunciones();

            state._fsp--;

             current =iv_ruleFunciones; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunciones"


    // $ANTLR start "ruleFunciones"
    // InternalPole.g:357:1: ruleFunciones returns [EObject current=null] : (otherlv_0= 'OIGO' ( (lv_tipoDeDato_1_0= ruleTipoDeDato ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'MUY' ( (lv_param_4_0= ruleDeclVariables2 ) ) )* ( (lv_instr_5_0= ruleInstruccion ) )* (otherlv_6= 'PEROMUY' ( (lv_e_7_0= ruleExpresion ) ) )? otherlv_8= 'BORROSO' ) ;
    public final EObject ruleFunciones() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_tipoDeDato_1_0 = null;

        EObject lv_param_4_0 = null;

        EObject lv_instr_5_0 = null;

        EObject lv_e_7_0 = null;



        	enterRule();

        try {
            // InternalPole.g:363:2: ( (otherlv_0= 'OIGO' ( (lv_tipoDeDato_1_0= ruleTipoDeDato ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'MUY' ( (lv_param_4_0= ruleDeclVariables2 ) ) )* ( (lv_instr_5_0= ruleInstruccion ) )* (otherlv_6= 'PEROMUY' ( (lv_e_7_0= ruleExpresion ) ) )? otherlv_8= 'BORROSO' ) )
            // InternalPole.g:364:2: (otherlv_0= 'OIGO' ( (lv_tipoDeDato_1_0= ruleTipoDeDato ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'MUY' ( (lv_param_4_0= ruleDeclVariables2 ) ) )* ( (lv_instr_5_0= ruleInstruccion ) )* (otherlv_6= 'PEROMUY' ( (lv_e_7_0= ruleExpresion ) ) )? otherlv_8= 'BORROSO' )
            {
            // InternalPole.g:364:2: (otherlv_0= 'OIGO' ( (lv_tipoDeDato_1_0= ruleTipoDeDato ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'MUY' ( (lv_param_4_0= ruleDeclVariables2 ) ) )* ( (lv_instr_5_0= ruleInstruccion ) )* (otherlv_6= 'PEROMUY' ( (lv_e_7_0= ruleExpresion ) ) )? otherlv_8= 'BORROSO' )
            // InternalPole.g:365:3: otherlv_0= 'OIGO' ( (lv_tipoDeDato_1_0= ruleTipoDeDato ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'MUY' ( (lv_param_4_0= ruleDeclVariables2 ) ) )* ( (lv_instr_5_0= ruleInstruccion ) )* (otherlv_6= 'PEROMUY' ( (lv_e_7_0= ruleExpresion ) ) )? otherlv_8= 'BORROSO'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncionesAccess().getOIGOKeyword_0());
            		
            // InternalPole.g:369:3: ( (lv_tipoDeDato_1_0= ruleTipoDeDato ) )
            // InternalPole.g:370:4: (lv_tipoDeDato_1_0= ruleTipoDeDato )
            {
            // InternalPole.g:370:4: (lv_tipoDeDato_1_0= ruleTipoDeDato )
            // InternalPole.g:371:5: lv_tipoDeDato_1_0= ruleTipoDeDato
            {

            					newCompositeNode(grammarAccess.getFuncionesAccess().getTipoDeDatoTipoDeDatoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_tipoDeDato_1_0=ruleTipoDeDato();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncionesRule());
            					}
            					set(
            						current,
            						"tipoDeDato",
            						lv_tipoDeDato_1_0,
            						"edu.upb.lp.isc.Pole.TipoDeDato");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPole.g:388:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPole.g:389:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPole.g:389:4: (lv_name_2_0= RULE_ID )
            // InternalPole.g:390:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFuncionesAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncionesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPole.g:406:3: (otherlv_3= 'MUY' ( (lv_param_4_0= ruleDeclVariables2 ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPole.g:407:4: otherlv_3= 'MUY' ( (lv_param_4_0= ruleDeclVariables2 ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFuncionesAccess().getMUYKeyword_3_0());
            	    			
            	    // InternalPole.g:411:4: ( (lv_param_4_0= ruleDeclVariables2 ) )
            	    // InternalPole.g:412:5: (lv_param_4_0= ruleDeclVariables2 )
            	    {
            	    // InternalPole.g:412:5: (lv_param_4_0= ruleDeclVariables2 )
            	    // InternalPole.g:413:6: lv_param_4_0= ruleDeclVariables2
            	    {

            	    						newCompositeNode(grammarAccess.getFuncionesAccess().getParamDeclVariables2ParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_param_4_0=ruleDeclVariables2();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFuncionesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"param",
            	    							lv_param_4_0,
            	    							"edu.upb.lp.isc.Pole.DeclVariables2");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalPole.g:431:3: ( (lv_instr_5_0= ruleInstruccion ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==13||LA5_0==17||LA5_0==21||(LA5_0>=23 && LA5_0<=24)||LA5_0==32||LA5_0==36||LA5_0==39||LA5_0==41) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPole.g:432:4: (lv_instr_5_0= ruleInstruccion )
            	    {
            	    // InternalPole.g:432:4: (lv_instr_5_0= ruleInstruccion )
            	    // InternalPole.g:433:5: lv_instr_5_0= ruleInstruccion
            	    {

            	    					newCompositeNode(grammarAccess.getFuncionesAccess().getInstrInstruccionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_instr_5_0=ruleInstruccion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFuncionesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instr",
            	    						lv_instr_5_0,
            	    						"edu.upb.lp.isc.Pole.Instruccion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalPole.g:450:3: (otherlv_6= 'PEROMUY' ( (lv_e_7_0= ruleExpresion ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPole.g:451:4: otherlv_6= 'PEROMUY' ( (lv_e_7_0= ruleExpresion ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getFuncionesAccess().getPEROMUYKeyword_5_0());
                    			
                    // InternalPole.g:455:4: ( (lv_e_7_0= ruleExpresion ) )
                    // InternalPole.g:456:5: (lv_e_7_0= ruleExpresion )
                    {
                    // InternalPole.g:456:5: (lv_e_7_0= ruleExpresion )
                    // InternalPole.g:457:6: lv_e_7_0= ruleExpresion
                    {

                    						newCompositeNode(grammarAccess.getFuncionesAccess().getEExpresionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_e_7_0=ruleExpresion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuncionesRule());
                    						}
                    						set(
                    							current,
                    							"e",
                    							lv_e_7_0,
                    							"edu.upb.lp.isc.Pole.Expresion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFuncionesAccess().getBORROSOKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunciones"


    // $ANTLR start "entryRuleImprimir"
    // InternalPole.g:483:1: entryRuleImprimir returns [EObject current=null] : iv_ruleImprimir= ruleImprimir EOF ;
    public final EObject entryRuleImprimir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImprimir = null;


        try {
            // InternalPole.g:483:49: (iv_ruleImprimir= ruleImprimir EOF )
            // InternalPole.g:484:2: iv_ruleImprimir= ruleImprimir EOF
            {
             newCompositeNode(grammarAccess.getImprimirRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImprimir=ruleImprimir();

            state._fsp--;

             current =iv_ruleImprimir; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImprimir"


    // $ANTLR start "ruleImprimir"
    // InternalPole.g:490:1: ruleImprimir returns [EObject current=null] : (otherlv_0= 'PARATICONDESPRECIO' ( (lv_e_1_0= ruleExpresion ) ) (otherlv_2= '@' ( (lv_e1_3_0= ruleExpresion ) ) )* ) ;
    public final EObject ruleImprimir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_e_1_0 = null;

        EObject lv_e1_3_0 = null;



        	enterRule();

        try {
            // InternalPole.g:496:2: ( (otherlv_0= 'PARATICONDESPRECIO' ( (lv_e_1_0= ruleExpresion ) ) (otherlv_2= '@' ( (lv_e1_3_0= ruleExpresion ) ) )* ) )
            // InternalPole.g:497:2: (otherlv_0= 'PARATICONDESPRECIO' ( (lv_e_1_0= ruleExpresion ) ) (otherlv_2= '@' ( (lv_e1_3_0= ruleExpresion ) ) )* )
            {
            // InternalPole.g:497:2: (otherlv_0= 'PARATICONDESPRECIO' ( (lv_e_1_0= ruleExpresion ) ) (otherlv_2= '@' ( (lv_e1_3_0= ruleExpresion ) ) )* )
            // InternalPole.g:498:3: otherlv_0= 'PARATICONDESPRECIO' ( (lv_e_1_0= ruleExpresion ) ) (otherlv_2= '@' ( (lv_e1_3_0= ruleExpresion ) ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getImprimirAccess().getPARATICONDESPRECIOKeyword_0());
            		
            // InternalPole.g:502:3: ( (lv_e_1_0= ruleExpresion ) )
            // InternalPole.g:503:4: (lv_e_1_0= ruleExpresion )
            {
            // InternalPole.g:503:4: (lv_e_1_0= ruleExpresion )
            // InternalPole.g:504:5: lv_e_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getImprimirAccess().getEExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_e_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImprimirRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_1_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPole.g:521:3: (otherlv_2= '@' ( (lv_e1_3_0= ruleExpresion ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPole.g:522:4: otherlv_2= '@' ( (lv_e1_3_0= ruleExpresion ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImprimirAccess().getCommercialAtKeyword_2_0());
            	    			
            	    // InternalPole.g:526:4: ( (lv_e1_3_0= ruleExpresion ) )
            	    // InternalPole.g:527:5: (lv_e1_3_0= ruleExpresion )
            	    {
            	    // InternalPole.g:527:5: (lv_e1_3_0= ruleExpresion )
            	    // InternalPole.g:528:6: lv_e1_3_0= ruleExpresion
            	    {

            	    						newCompositeNode(grammarAccess.getImprimirAccess().getE1ExpresionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_e1_3_0=ruleExpresion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImprimirRule());
            	    						}
            	    						add(
            	    							current,
            	    							"e1",
            	    							lv_e1_3_0,
            	    							"edu.upb.lp.isc.Pole.Expresion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImprimir"


    // $ANTLR start "entryRuleImprimirSinSaltoDeLinea"
    // InternalPole.g:550:1: entryRuleImprimirSinSaltoDeLinea returns [EObject current=null] : iv_ruleImprimirSinSaltoDeLinea= ruleImprimirSinSaltoDeLinea EOF ;
    public final EObject entryRuleImprimirSinSaltoDeLinea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImprimirSinSaltoDeLinea = null;


        try {
            // InternalPole.g:550:64: (iv_ruleImprimirSinSaltoDeLinea= ruleImprimirSinSaltoDeLinea EOF )
            // InternalPole.g:551:2: iv_ruleImprimirSinSaltoDeLinea= ruleImprimirSinSaltoDeLinea EOF
            {
             newCompositeNode(grammarAccess.getImprimirSinSaltoDeLineaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImprimirSinSaltoDeLinea=ruleImprimirSinSaltoDeLinea();

            state._fsp--;

             current =iv_ruleImprimirSinSaltoDeLinea; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImprimirSinSaltoDeLinea"


    // $ANTLR start "ruleImprimirSinSaltoDeLinea"
    // InternalPole.g:557:1: ruleImprimirSinSaltoDeLinea returns [EObject current=null] : (otherlv_0= 'PARATI' ( (lv_e_1_0= ruleExpresion ) ) (otherlv_2= '@' ( (lv_e1_3_0= ruleExpresion ) ) )* ) ;
    public final EObject ruleImprimirSinSaltoDeLinea() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_e_1_0 = null;

        EObject lv_e1_3_0 = null;



        	enterRule();

        try {
            // InternalPole.g:563:2: ( (otherlv_0= 'PARATI' ( (lv_e_1_0= ruleExpresion ) ) (otherlv_2= '@' ( (lv_e1_3_0= ruleExpresion ) ) )* ) )
            // InternalPole.g:564:2: (otherlv_0= 'PARATI' ( (lv_e_1_0= ruleExpresion ) ) (otherlv_2= '@' ( (lv_e1_3_0= ruleExpresion ) ) )* )
            {
            // InternalPole.g:564:2: (otherlv_0= 'PARATI' ( (lv_e_1_0= ruleExpresion ) ) (otherlv_2= '@' ( (lv_e1_3_0= ruleExpresion ) ) )* )
            // InternalPole.g:565:3: otherlv_0= 'PARATI' ( (lv_e_1_0= ruleExpresion ) ) (otherlv_2= '@' ( (lv_e1_3_0= ruleExpresion ) ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getImprimirSinSaltoDeLineaAccess().getPARATIKeyword_0());
            		
            // InternalPole.g:569:3: ( (lv_e_1_0= ruleExpresion ) )
            // InternalPole.g:570:4: (lv_e_1_0= ruleExpresion )
            {
            // InternalPole.g:570:4: (lv_e_1_0= ruleExpresion )
            // InternalPole.g:571:5: lv_e_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getImprimirSinSaltoDeLineaAccess().getEExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_e_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImprimirSinSaltoDeLineaRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_1_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPole.g:588:3: (otherlv_2= '@' ( (lv_e1_3_0= ruleExpresion ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPole.g:589:4: otherlv_2= '@' ( (lv_e1_3_0= ruleExpresion ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImprimirSinSaltoDeLineaAccess().getCommercialAtKeyword_2_0());
            	    			
            	    // InternalPole.g:593:4: ( (lv_e1_3_0= ruleExpresion ) )
            	    // InternalPole.g:594:5: (lv_e1_3_0= ruleExpresion )
            	    {
            	    // InternalPole.g:594:5: (lv_e1_3_0= ruleExpresion )
            	    // InternalPole.g:595:6: lv_e1_3_0= ruleExpresion
            	    {

            	    						newCompositeNode(grammarAccess.getImprimirSinSaltoDeLineaAccess().getE1ExpresionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_e1_3_0=ruleExpresion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImprimirSinSaltoDeLineaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"e1",
            	    							lv_e1_3_0,
            	    							"edu.upb.lp.isc.Pole.Expresion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImprimirSinSaltoDeLinea"


    // $ANTLR start "entryRuleCondicional"
    // InternalPole.g:617:1: entryRuleCondicional returns [EObject current=null] : iv_ruleCondicional= ruleCondicional EOF ;
    public final EObject entryRuleCondicional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicional = null;


        try {
            // InternalPole.g:617:52: (iv_ruleCondicional= ruleCondicional EOF )
            // InternalPole.g:618:2: iv_ruleCondicional= ruleCondicional EOF
            {
             newCompositeNode(grammarAccess.getCondicionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondicional=ruleCondicional();

            state._fsp--;

             current =iv_ruleCondicional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondicional"


    // $ANTLR start "ruleCondicional"
    // InternalPole.g:624:1: ruleCondicional returns [EObject current=null] : (otherlv_0= 'GG?' ( (lv_expr_1_0= ruleExpresion ) ) otherlv_2= 'WITHTEAM' ( (lv_instr_3_0= ruleInstruccion ) )* ( (lv_casiTeam_4_0= ruleCondicionalElseIf ) )* (otherlv_5= 'NOTEAM' ( (lv_instrElse_6_0= ruleInstruccion ) )* )? otherlv_7= 'EZ' ) ;
    public final EObject ruleCondicional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expr_1_0 = null;

        EObject lv_instr_3_0 = null;

        EObject lv_casiTeam_4_0 = null;

        EObject lv_instrElse_6_0 = null;



        	enterRule();

        try {
            // InternalPole.g:630:2: ( (otherlv_0= 'GG?' ( (lv_expr_1_0= ruleExpresion ) ) otherlv_2= 'WITHTEAM' ( (lv_instr_3_0= ruleInstruccion ) )* ( (lv_casiTeam_4_0= ruleCondicionalElseIf ) )* (otherlv_5= 'NOTEAM' ( (lv_instrElse_6_0= ruleInstruccion ) )* )? otherlv_7= 'EZ' ) )
            // InternalPole.g:631:2: (otherlv_0= 'GG?' ( (lv_expr_1_0= ruleExpresion ) ) otherlv_2= 'WITHTEAM' ( (lv_instr_3_0= ruleInstruccion ) )* ( (lv_casiTeam_4_0= ruleCondicionalElseIf ) )* (otherlv_5= 'NOTEAM' ( (lv_instrElse_6_0= ruleInstruccion ) )* )? otherlv_7= 'EZ' )
            {
            // InternalPole.g:631:2: (otherlv_0= 'GG?' ( (lv_expr_1_0= ruleExpresion ) ) otherlv_2= 'WITHTEAM' ( (lv_instr_3_0= ruleInstruccion ) )* ( (lv_casiTeam_4_0= ruleCondicionalElseIf ) )* (otherlv_5= 'NOTEAM' ( (lv_instrElse_6_0= ruleInstruccion ) )* )? otherlv_7= 'EZ' )
            // InternalPole.g:632:3: otherlv_0= 'GG?' ( (lv_expr_1_0= ruleExpresion ) ) otherlv_2= 'WITHTEAM' ( (lv_instr_3_0= ruleInstruccion ) )* ( (lv_casiTeam_4_0= ruleCondicionalElseIf ) )* (otherlv_5= 'NOTEAM' ( (lv_instrElse_6_0= ruleInstruccion ) )* )? otherlv_7= 'EZ'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCondicionalAccess().getGGKeyword_0());
            		
            // InternalPole.g:636:3: ( (lv_expr_1_0= ruleExpresion ) )
            // InternalPole.g:637:4: (lv_expr_1_0= ruleExpresion )
            {
            // InternalPole.g:637:4: (lv_expr_1_0= ruleExpresion )
            // InternalPole.g:638:5: lv_expr_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getCondicionalAccess().getExprExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_expr_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getCondicionalAccess().getWITHTEAMKeyword_2());
            		
            // InternalPole.g:659:3: ( (lv_instr_3_0= ruleInstruccion ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==13||LA9_0==17||LA9_0==21||(LA9_0>=23 && LA9_0<=24)||LA9_0==32||LA9_0==36||LA9_0==39||LA9_0==41) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPole.g:660:4: (lv_instr_3_0= ruleInstruccion )
            	    {
            	    // InternalPole.g:660:4: (lv_instr_3_0= ruleInstruccion )
            	    // InternalPole.g:661:5: lv_instr_3_0= ruleInstruccion
            	    {

            	    					newCompositeNode(grammarAccess.getCondicionalAccess().getInstrInstruccionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_instr_3_0=ruleInstruccion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instr",
            	    						lv_instr_3_0,
            	    						"edu.upb.lp.isc.Pole.Instruccion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalPole.g:678:3: ( (lv_casiTeam_4_0= ruleCondicionalElseIf ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPole.g:679:4: (lv_casiTeam_4_0= ruleCondicionalElseIf )
            	    {
            	    // InternalPole.g:679:4: (lv_casiTeam_4_0= ruleCondicionalElseIf )
            	    // InternalPole.g:680:5: lv_casiTeam_4_0= ruleCondicionalElseIf
            	    {

            	    					newCompositeNode(grammarAccess.getCondicionalAccess().getCasiTeamCondicionalElseIfParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_casiTeam_4_0=ruleCondicionalElseIf();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"casiTeam",
            	    						lv_casiTeam_4_0,
            	    						"edu.upb.lp.isc.Pole.CondicionalElseIf");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalPole.g:697:3: (otherlv_5= 'NOTEAM' ( (lv_instrElse_6_0= ruleInstruccion ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPole.g:698:4: otherlv_5= 'NOTEAM' ( (lv_instrElse_6_0= ruleInstruccion ) )*
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getCondicionalAccess().getNOTEAMKeyword_5_0());
                    			
                    // InternalPole.g:702:4: ( (lv_instrElse_6_0= ruleInstruccion ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||LA11_0==13||LA11_0==17||LA11_0==21||(LA11_0>=23 && LA11_0<=24)||LA11_0==32||LA11_0==36||LA11_0==39||LA11_0==41) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalPole.g:703:5: (lv_instrElse_6_0= ruleInstruccion )
                    	    {
                    	    // InternalPole.g:703:5: (lv_instrElse_6_0= ruleInstruccion )
                    	    // InternalPole.g:704:6: lv_instrElse_6_0= ruleInstruccion
                    	    {

                    	    						newCompositeNode(grammarAccess.getCondicionalAccess().getInstrElseInstruccionParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_instrElse_6_0=ruleInstruccion();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCondicionalRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"instrElse",
                    	    							lv_instrElse_6_0,
                    	    							"edu.upb.lp.isc.Pole.Instruccion");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCondicionalAccess().getEZKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondicional"


    // $ANTLR start "entryRuleCondicionalElseIf"
    // InternalPole.g:730:1: entryRuleCondicionalElseIf returns [EObject current=null] : iv_ruleCondicionalElseIf= ruleCondicionalElseIf EOF ;
    public final EObject entryRuleCondicionalElseIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicionalElseIf = null;


        try {
            // InternalPole.g:730:58: (iv_ruleCondicionalElseIf= ruleCondicionalElseIf EOF )
            // InternalPole.g:731:2: iv_ruleCondicionalElseIf= ruleCondicionalElseIf EOF
            {
             newCompositeNode(grammarAccess.getCondicionalElseIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondicionalElseIf=ruleCondicionalElseIf();

            state._fsp--;

             current =iv_ruleCondicionalElseIf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondicionalElseIf"


    // $ANTLR start "ruleCondicionalElseIf"
    // InternalPole.g:737:1: ruleCondicionalElseIf returns [EObject current=null] : (otherlv_0= 'CASITEAM' ( (lv_exprELIF_1_0= ruleExpresion ) ) ( (lv_instrELIF_2_0= ruleInstruccion ) )* ) ;
    public final EObject ruleCondicionalElseIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exprELIF_1_0 = null;

        EObject lv_instrELIF_2_0 = null;



        	enterRule();

        try {
            // InternalPole.g:743:2: ( (otherlv_0= 'CASITEAM' ( (lv_exprELIF_1_0= ruleExpresion ) ) ( (lv_instrELIF_2_0= ruleInstruccion ) )* ) )
            // InternalPole.g:744:2: (otherlv_0= 'CASITEAM' ( (lv_exprELIF_1_0= ruleExpresion ) ) ( (lv_instrELIF_2_0= ruleInstruccion ) )* )
            {
            // InternalPole.g:744:2: (otherlv_0= 'CASITEAM' ( (lv_exprELIF_1_0= ruleExpresion ) ) ( (lv_instrELIF_2_0= ruleInstruccion ) )* )
            // InternalPole.g:745:3: otherlv_0= 'CASITEAM' ( (lv_exprELIF_1_0= ruleExpresion ) ) ( (lv_instrELIF_2_0= ruleInstruccion ) )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCondicionalElseIfAccess().getCASITEAMKeyword_0());
            		
            // InternalPole.g:749:3: ( (lv_exprELIF_1_0= ruleExpresion ) )
            // InternalPole.g:750:4: (lv_exprELIF_1_0= ruleExpresion )
            {
            // InternalPole.g:750:4: (lv_exprELIF_1_0= ruleExpresion )
            // InternalPole.g:751:5: lv_exprELIF_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getCondicionalElseIfAccess().getExprELIFExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_exprELIF_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondicionalElseIfRule());
            					}
            					set(
            						current,
            						"exprELIF",
            						lv_exprELIF_1_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPole.g:768:3: ( (lv_instrELIF_2_0= ruleInstruccion ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==13||LA13_0==17||LA13_0==21||(LA13_0>=23 && LA13_0<=24)||LA13_0==32||LA13_0==36||LA13_0==39||LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPole.g:769:4: (lv_instrELIF_2_0= ruleInstruccion )
            	    {
            	    // InternalPole.g:769:4: (lv_instrELIF_2_0= ruleInstruccion )
            	    // InternalPole.g:770:5: lv_instrELIF_2_0= ruleInstruccion
            	    {

            	    					newCompositeNode(grammarAccess.getCondicionalElseIfAccess().getInstrELIFInstruccionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_instrELIF_2_0=ruleInstruccion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCondicionalElseIfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instrELIF",
            	    						lv_instrELIF_2_0,
            	    						"edu.upb.lp.isc.Pole.Instruccion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondicionalElseIf"


    // $ANTLR start "entryRuleSwitch"
    // InternalPole.g:791:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // InternalPole.g:791:47: (iv_ruleSwitch= ruleSwitch EOF )
            // InternalPole.g:792:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitch"


    // $ANTLR start "ruleSwitch"
    // InternalPole.g:798:1: ruleSwitch returns [EObject current=null] : ( ( (lv_var_0_0= ruleLlamadoVariable ) ) otherlv_1= 'RULETARUSA?' ( (lv_case_2_0= ruleCaseSwitch ) )+ otherlv_3= 'BOOM' ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_var_0_0 = null;

        EObject lv_case_2_0 = null;



        	enterRule();

        try {
            // InternalPole.g:804:2: ( ( ( (lv_var_0_0= ruleLlamadoVariable ) ) otherlv_1= 'RULETARUSA?' ( (lv_case_2_0= ruleCaseSwitch ) )+ otherlv_3= 'BOOM' ) )
            // InternalPole.g:805:2: ( ( (lv_var_0_0= ruleLlamadoVariable ) ) otherlv_1= 'RULETARUSA?' ( (lv_case_2_0= ruleCaseSwitch ) )+ otherlv_3= 'BOOM' )
            {
            // InternalPole.g:805:2: ( ( (lv_var_0_0= ruleLlamadoVariable ) ) otherlv_1= 'RULETARUSA?' ( (lv_case_2_0= ruleCaseSwitch ) )+ otherlv_3= 'BOOM' )
            // InternalPole.g:806:3: ( (lv_var_0_0= ruleLlamadoVariable ) ) otherlv_1= 'RULETARUSA?' ( (lv_case_2_0= ruleCaseSwitch ) )+ otherlv_3= 'BOOM'
            {
            // InternalPole.g:806:3: ( (lv_var_0_0= ruleLlamadoVariable ) )
            // InternalPole.g:807:4: (lv_var_0_0= ruleLlamadoVariable )
            {
            // InternalPole.g:807:4: (lv_var_0_0= ruleLlamadoVariable )
            // InternalPole.g:808:5: lv_var_0_0= ruleLlamadoVariable
            {

            					newCompositeNode(grammarAccess.getSwitchAccess().getVarLlamadoVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_var_0_0=ruleLlamadoVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSwitchRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_0_0,
            						"edu.upb.lp.isc.Pole.LlamadoVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getSwitchAccess().getRULETARUSAKeyword_1());
            		
            // InternalPole.g:829:3: ( (lv_case_2_0= ruleCaseSwitch ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPole.g:830:4: (lv_case_2_0= ruleCaseSwitch )
            	    {
            	    // InternalPole.g:830:4: (lv_case_2_0= ruleCaseSwitch )
            	    // InternalPole.g:831:5: lv_case_2_0= ruleCaseSwitch
            	    {

            	    					newCompositeNode(grammarAccess.getSwitchAccess().getCaseCaseSwitchParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_case_2_0=ruleCaseSwitch();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSwitchRule());
            	    					}
            	    					add(
            	    						current,
            	    						"case",
            	    						lv_case_2_0,
            	    						"edu.upb.lp.isc.Pole.CaseSwitch");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSwitchAccess().getBOOMKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitch"


    // $ANTLR start "entryRuleCaseSwitch"
    // InternalPole.g:856:1: entryRuleCaseSwitch returns [EObject current=null] : iv_ruleCaseSwitch= ruleCaseSwitch EOF ;
    public final EObject entryRuleCaseSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseSwitch = null;


        try {
            // InternalPole.g:856:51: (iv_ruleCaseSwitch= ruleCaseSwitch EOF )
            // InternalPole.g:857:2: iv_ruleCaseSwitch= ruleCaseSwitch EOF
            {
             newCompositeNode(grammarAccess.getCaseSwitchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCaseSwitch=ruleCaseSwitch();

            state._fsp--;

             current =iv_ruleCaseSwitch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaseSwitch"


    // $ANTLR start "ruleCaseSwitch"
    // InternalPole.g:863:1: ruleCaseSwitch returns [EObject current=null] : (otherlv_0= 'BALA' ( (lv_e_1_0= ruleExpresion ) ) ( (lv_instr_2_0= ruleInstruccion ) )* ) ;
    public final EObject ruleCaseSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_e_1_0 = null;

        EObject lv_instr_2_0 = null;



        	enterRule();

        try {
            // InternalPole.g:869:2: ( (otherlv_0= 'BALA' ( (lv_e_1_0= ruleExpresion ) ) ( (lv_instr_2_0= ruleInstruccion ) )* ) )
            // InternalPole.g:870:2: (otherlv_0= 'BALA' ( (lv_e_1_0= ruleExpresion ) ) ( (lv_instr_2_0= ruleInstruccion ) )* )
            {
            // InternalPole.g:870:2: (otherlv_0= 'BALA' ( (lv_e_1_0= ruleExpresion ) ) ( (lv_instr_2_0= ruleInstruccion ) )* )
            // InternalPole.g:871:3: otherlv_0= 'BALA' ( (lv_e_1_0= ruleExpresion ) ) ( (lv_instr_2_0= ruleInstruccion ) )*
            {
            otherlv_0=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseSwitchAccess().getBALAKeyword_0());
            		
            // InternalPole.g:875:3: ( (lv_e_1_0= ruleExpresion ) )
            // InternalPole.g:876:4: (lv_e_1_0= ruleExpresion )
            {
            // InternalPole.g:876:4: (lv_e_1_0= ruleExpresion )
            // InternalPole.g:877:5: lv_e_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getCaseSwitchAccess().getEExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_e_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseSwitchRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_1_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPole.g:894:3: ( (lv_instr_2_0= ruleInstruccion ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==13||LA15_0==17||LA15_0==21||(LA15_0>=23 && LA15_0<=24)||LA15_0==32||LA15_0==36||LA15_0==39||LA15_0==41) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPole.g:895:4: (lv_instr_2_0= ruleInstruccion )
            	    {
            	    // InternalPole.g:895:4: (lv_instr_2_0= ruleInstruccion )
            	    // InternalPole.g:896:5: lv_instr_2_0= ruleInstruccion
            	    {

            	    					newCompositeNode(grammarAccess.getCaseSwitchAccess().getInstrInstruccionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_instr_2_0=ruleInstruccion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCaseSwitchRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instr",
            	    						lv_instr_2_0,
            	    						"edu.upb.lp.isc.Pole.Instruccion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaseSwitch"


    // $ANTLR start "entryRuleFor"
    // InternalPole.g:917:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalPole.g:917:44: (iv_ruleFor= ruleFor EOF )
            // InternalPole.g:918:2: iv_ruleFor= ruleFor EOF
            {
             newCompositeNode(grammarAccess.getForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;

             current =iv_ruleFor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalPole.g:924:1: ruleFor returns [EObject current=null] : (otherlv_0= 'CHOCO' ( (lv_name_1_0= RULE_ID ) ) ( (lv_var_2_0= ruleDeclVariables ) ) otherlv_3= 'YVOLO' ( (lv_expr_4_0= ruleExpresionBooleana ) ) otherlv_5= 'YYOVOLE' ( (lv_asig_6_0= ruleAsignacionVariable ) ) ( (lv_instr_7_0= ruleInstruccion ) )* otherlv_8= 'YSEFUE' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_var_2_0 = null;

        EObject lv_expr_4_0 = null;

        EObject lv_asig_6_0 = null;

        EObject lv_instr_7_0 = null;



        	enterRule();

        try {
            // InternalPole.g:930:2: ( (otherlv_0= 'CHOCO' ( (lv_name_1_0= RULE_ID ) ) ( (lv_var_2_0= ruleDeclVariables ) ) otherlv_3= 'YVOLO' ( (lv_expr_4_0= ruleExpresionBooleana ) ) otherlv_5= 'YYOVOLE' ( (lv_asig_6_0= ruleAsignacionVariable ) ) ( (lv_instr_7_0= ruleInstruccion ) )* otherlv_8= 'YSEFUE' ) )
            // InternalPole.g:931:2: (otherlv_0= 'CHOCO' ( (lv_name_1_0= RULE_ID ) ) ( (lv_var_2_0= ruleDeclVariables ) ) otherlv_3= 'YVOLO' ( (lv_expr_4_0= ruleExpresionBooleana ) ) otherlv_5= 'YYOVOLE' ( (lv_asig_6_0= ruleAsignacionVariable ) ) ( (lv_instr_7_0= ruleInstruccion ) )* otherlv_8= 'YSEFUE' )
            {
            // InternalPole.g:931:2: (otherlv_0= 'CHOCO' ( (lv_name_1_0= RULE_ID ) ) ( (lv_var_2_0= ruleDeclVariables ) ) otherlv_3= 'YVOLO' ( (lv_expr_4_0= ruleExpresionBooleana ) ) otherlv_5= 'YYOVOLE' ( (lv_asig_6_0= ruleAsignacionVariable ) ) ( (lv_instr_7_0= ruleInstruccion ) )* otherlv_8= 'YSEFUE' )
            // InternalPole.g:932:3: otherlv_0= 'CHOCO' ( (lv_name_1_0= RULE_ID ) ) ( (lv_var_2_0= ruleDeclVariables ) ) otherlv_3= 'YVOLO' ( (lv_expr_4_0= ruleExpresionBooleana ) ) otherlv_5= 'YYOVOLE' ( (lv_asig_6_0= ruleAsignacionVariable ) ) ( (lv_instr_7_0= ruleInstruccion ) )* otherlv_8= 'YSEFUE'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getForAccess().getCHOCOKeyword_0());
            		
            // InternalPole.g:936:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPole.g:937:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPole.g:937:4: (lv_name_1_0= RULE_ID )
            // InternalPole.g:938:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getForAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPole.g:954:3: ( (lv_var_2_0= ruleDeclVariables ) )
            // InternalPole.g:955:4: (lv_var_2_0= ruleDeclVariables )
            {
            // InternalPole.g:955:4: (lv_var_2_0= ruleDeclVariables )
            // InternalPole.g:956:5: lv_var_2_0= ruleDeclVariables
            {

            					newCompositeNode(grammarAccess.getForAccess().getVarDeclVariablesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_var_2_0=ruleDeclVariables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_2_0,
            						"edu.upb.lp.isc.Pole.DeclVariables");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getForAccess().getYVOLOKeyword_3());
            		
            // InternalPole.g:977:3: ( (lv_expr_4_0= ruleExpresionBooleana ) )
            // InternalPole.g:978:4: (lv_expr_4_0= ruleExpresionBooleana )
            {
            // InternalPole.g:978:4: (lv_expr_4_0= ruleExpresionBooleana )
            // InternalPole.g:979:5: lv_expr_4_0= ruleExpresionBooleana
            {

            					newCompositeNode(grammarAccess.getForAccess().getExprExpresionBooleanaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
            lv_expr_4_0=ruleExpresionBooleana();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_4_0,
            						"edu.upb.lp.isc.Pole.ExpresionBooleana");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getForAccess().getYYOVOLEKeyword_5());
            		
            // InternalPole.g:1000:3: ( (lv_asig_6_0= ruleAsignacionVariable ) )
            // InternalPole.g:1001:4: (lv_asig_6_0= ruleAsignacionVariable )
            {
            // InternalPole.g:1001:4: (lv_asig_6_0= ruleAsignacionVariable )
            // InternalPole.g:1002:5: lv_asig_6_0= ruleAsignacionVariable
            {

            					newCompositeNode(grammarAccess.getForAccess().getAsigAsignacionVariableParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_27);
            lv_asig_6_0=ruleAsignacionVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForRule());
            					}
            					set(
            						current,
            						"asig",
            						lv_asig_6_0,
            						"edu.upb.lp.isc.Pole.AsignacionVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPole.g:1019:3: ( (lv_instr_7_0= ruleInstruccion ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==13||LA16_0==17||LA16_0==21||(LA16_0>=23 && LA16_0<=24)||LA16_0==32||LA16_0==36||LA16_0==39||LA16_0==41) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPole.g:1020:4: (lv_instr_7_0= ruleInstruccion )
            	    {
            	    // InternalPole.g:1020:4: (lv_instr_7_0= ruleInstruccion )
            	    // InternalPole.g:1021:5: lv_instr_7_0= ruleInstruccion
            	    {

            	    					newCompositeNode(grammarAccess.getForAccess().getInstrInstruccionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_instr_7_0=ruleInstruccion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instr",
            	    						lv_instr_7_0,
            	    						"edu.upb.lp.isc.Pole.Instruccion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_8=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getForAccess().getYSEFUEKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleWhile"
    // InternalPole.g:1046:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalPole.g:1046:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalPole.g:1047:2: iv_ruleWhile= ruleWhile EOF
            {
             newCompositeNode(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;

             current =iv_ruleWhile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalPole.g:1053:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'SA' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'MATAO' ( (lv_expr_3_0= ruleExpresion ) ) ( (lv_instr_4_0= ruleInstruccion ) )* otherlv_5= 'PACO' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_expr_3_0 = null;

        EObject lv_instr_4_0 = null;



        	enterRule();

        try {
            // InternalPole.g:1059:2: ( (otherlv_0= 'SA' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'MATAO' ( (lv_expr_3_0= ruleExpresion ) ) ( (lv_instr_4_0= ruleInstruccion ) )* otherlv_5= 'PACO' ) )
            // InternalPole.g:1060:2: (otherlv_0= 'SA' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'MATAO' ( (lv_expr_3_0= ruleExpresion ) ) ( (lv_instr_4_0= ruleInstruccion ) )* otherlv_5= 'PACO' )
            {
            // InternalPole.g:1060:2: (otherlv_0= 'SA' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'MATAO' ( (lv_expr_3_0= ruleExpresion ) ) ( (lv_instr_4_0= ruleInstruccion ) )* otherlv_5= 'PACO' )
            // InternalPole.g:1061:3: otherlv_0= 'SA' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'MATAO' ( (lv_expr_3_0= ruleExpresion ) ) ( (lv_instr_4_0= ruleInstruccion ) )* otherlv_5= 'PACO'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getSAKeyword_0());
            		
            // InternalPole.g:1065:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPole.g:1066:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPole.g:1066:4: (lv_name_1_0= RULE_ID )
            // InternalPole.g:1067:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWhileAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getMATAOKeyword_2());
            		
            // InternalPole.g:1087:3: ( (lv_expr_3_0= ruleExpresion ) )
            // InternalPole.g:1088:4: (lv_expr_3_0= ruleExpresion )
            {
            // InternalPole.g:1088:4: (lv_expr_3_0= ruleExpresion )
            // InternalPole.g:1089:5: lv_expr_3_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getWhileAccess().getExprExpresionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_expr_3_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_3_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPole.g:1106:3: ( (lv_instr_4_0= ruleInstruccion ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==13||LA17_0==17||LA17_0==21||(LA17_0>=23 && LA17_0<=24)||LA17_0==32||LA17_0==36||LA17_0==39||LA17_0==41) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPole.g:1107:4: (lv_instr_4_0= ruleInstruccion )
            	    {
            	    // InternalPole.g:1107:4: (lv_instr_4_0= ruleInstruccion )
            	    // InternalPole.g:1108:5: lv_instr_4_0= ruleInstruccion
            	    {

            	    					newCompositeNode(grammarAccess.getWhileAccess().getInstrInstruccionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_instr_4_0=ruleInstruccion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instr",
            	    						lv_instr_4_0,
            	    						"edu.upb.lp.isc.Pole.Instruccion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_5=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWhileAccess().getPACOKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleDoWhile"
    // InternalPole.g:1133:1: entryRuleDoWhile returns [EObject current=null] : iv_ruleDoWhile= ruleDoWhile EOF ;
    public final EObject entryRuleDoWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhile = null;


        try {
            // InternalPole.g:1133:48: (iv_ruleDoWhile= ruleDoWhile EOF )
            // InternalPole.g:1134:2: iv_ruleDoWhile= ruleDoWhile EOF
            {
             newCompositeNode(grammarAccess.getDoWhileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoWhile=ruleDoWhile();

            state._fsp--;

             current =iv_ruleDoWhile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoWhile"


    // $ANTLR start "ruleDoWhile"
    // InternalPole.g:1140:1: ruleDoWhile returns [EObject current=null] : (otherlv_0= 'AHITEVAMI' ( (lv_name_1_0= RULE_ID ) ) ( (lv_instr_2_0= ruleInstruccion ) )* otherlv_3= 'DOLOR' ( (lv_expr_4_0= ruleExpresion ) ) ) ;
    public final EObject ruleDoWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_instr_2_0 = null;

        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalPole.g:1146:2: ( (otherlv_0= 'AHITEVAMI' ( (lv_name_1_0= RULE_ID ) ) ( (lv_instr_2_0= ruleInstruccion ) )* otherlv_3= 'DOLOR' ( (lv_expr_4_0= ruleExpresion ) ) ) )
            // InternalPole.g:1147:2: (otherlv_0= 'AHITEVAMI' ( (lv_name_1_0= RULE_ID ) ) ( (lv_instr_2_0= ruleInstruccion ) )* otherlv_3= 'DOLOR' ( (lv_expr_4_0= ruleExpresion ) ) )
            {
            // InternalPole.g:1147:2: (otherlv_0= 'AHITEVAMI' ( (lv_name_1_0= RULE_ID ) ) ( (lv_instr_2_0= ruleInstruccion ) )* otherlv_3= 'DOLOR' ( (lv_expr_4_0= ruleExpresion ) ) )
            // InternalPole.g:1148:3: otherlv_0= 'AHITEVAMI' ( (lv_name_1_0= RULE_ID ) ) ( (lv_instr_2_0= ruleInstruccion ) )* otherlv_3= 'DOLOR' ( (lv_expr_4_0= ruleExpresion ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDoWhileAccess().getAHITEVAMIKeyword_0());
            		
            // InternalPole.g:1152:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPole.g:1153:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPole.g:1153:4: (lv_name_1_0= RULE_ID )
            // InternalPole.g:1154:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDoWhileAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDoWhileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPole.g:1170:3: ( (lv_instr_2_0= ruleInstruccion ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==13||LA18_0==17||LA18_0==21||(LA18_0>=23 && LA18_0<=24)||LA18_0==32||LA18_0==36||LA18_0==39||LA18_0==41) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPole.g:1171:4: (lv_instr_2_0= ruleInstruccion )
            	    {
            	    // InternalPole.g:1171:4: (lv_instr_2_0= ruleInstruccion )
            	    // InternalPole.g:1172:5: lv_instr_2_0= ruleInstruccion
            	    {

            	    					newCompositeNode(grammarAccess.getDoWhileAccess().getInstrInstruccionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_instr_2_0=ruleInstruccion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDoWhileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instr",
            	    						lv_instr_2_0,
            	    						"edu.upb.lp.isc.Pole.Instruccion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_3=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getDoWhileAccess().getDOLORKeyword_3());
            		
            // InternalPole.g:1193:3: ( (lv_expr_4_0= ruleExpresion ) )
            // InternalPole.g:1194:4: (lv_expr_4_0= ruleExpresion )
            {
            // InternalPole.g:1194:4: (lv_expr_4_0= ruleExpresion )
            // InternalPole.g:1195:5: lv_expr_4_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getDoWhileAccess().getExprExpresionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_4_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoWhileRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_4_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoWhile"


    // $ANTLR start "entryRuleDeclVariables"
    // InternalPole.g:1216:1: entryRuleDeclVariables returns [EObject current=null] : iv_ruleDeclVariables= ruleDeclVariables EOF ;
    public final EObject entryRuleDeclVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclVariables = null;


        try {
            // InternalPole.g:1216:54: (iv_ruleDeclVariables= ruleDeclVariables EOF )
            // InternalPole.g:1217:2: iv_ruleDeclVariables= ruleDeclVariables EOF
            {
             newCompositeNode(grammarAccess.getDeclVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclVariables=ruleDeclVariables();

            state._fsp--;

             current =iv_ruleDeclVariables; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclVariables"


    // $ANTLR start "ruleDeclVariables"
    // InternalPole.g:1223:1: ruleDeclVariables returns [EObject current=null] : (otherlv_0= 'PEREMENNAYA' ( (lv_tipoDeDato_1_0= ruleTipoDeDato ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_valor_4_0= ruleExpresion ) ) ) ;
    public final EObject ruleDeclVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipoDeDato_1_0 = null;

        EObject lv_valor_4_0 = null;



        	enterRule();

        try {
            // InternalPole.g:1229:2: ( (otherlv_0= 'PEREMENNAYA' ( (lv_tipoDeDato_1_0= ruleTipoDeDato ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_valor_4_0= ruleExpresion ) ) ) )
            // InternalPole.g:1230:2: (otherlv_0= 'PEREMENNAYA' ( (lv_tipoDeDato_1_0= ruleTipoDeDato ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_valor_4_0= ruleExpresion ) ) )
            {
            // InternalPole.g:1230:2: (otherlv_0= 'PEREMENNAYA' ( (lv_tipoDeDato_1_0= ruleTipoDeDato ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_valor_4_0= ruleExpresion ) ) )
            // InternalPole.g:1231:3: otherlv_0= 'PEREMENNAYA' ( (lv_tipoDeDato_1_0= ruleTipoDeDato ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_valor_4_0= ruleExpresion ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclVariablesAccess().getPEREMENNAYAKeyword_0());
            		
            // InternalPole.g:1235:3: ( (lv_tipoDeDato_1_0= ruleTipoDeDato ) )
            // InternalPole.g:1236:4: (lv_tipoDeDato_1_0= ruleTipoDeDato )
            {
            // InternalPole.g:1236:4: (lv_tipoDeDato_1_0= ruleTipoDeDato )
            // InternalPole.g:1237:5: lv_tipoDeDato_1_0= ruleTipoDeDato
            {

            					newCompositeNode(grammarAccess.getDeclVariablesAccess().getTipoDeDatoTipoDeDatoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_tipoDeDato_1_0=ruleTipoDeDato();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclVariablesRule());
            					}
            					set(
            						current,
            						"tipoDeDato",
            						lv_tipoDeDato_1_0,
            						"edu.upb.lp.isc.Pole.TipoDeDato");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPole.g:1254:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPole.g:1255:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPole.g:1255:4: (lv_name_2_0= RULE_ID )
            // InternalPole.g:1256:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDeclVariablesAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclVariablesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getDeclVariablesAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalPole.g:1276:3: ( (lv_valor_4_0= ruleExpresion ) )
            // InternalPole.g:1277:4: (lv_valor_4_0= ruleExpresion )
            {
            // InternalPole.g:1277:4: (lv_valor_4_0= ruleExpresion )
            // InternalPole.g:1278:5: lv_valor_4_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getDeclVariablesAccess().getValorExpresionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_valor_4_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclVariablesRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_4_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclVariables"


    // $ANTLR start "entryRuleDeclVariables2"
    // InternalPole.g:1299:1: entryRuleDeclVariables2 returns [EObject current=null] : iv_ruleDeclVariables2= ruleDeclVariables2 EOF ;
    public final EObject entryRuleDeclVariables2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclVariables2 = null;


        try {
            // InternalPole.g:1299:55: (iv_ruleDeclVariables2= ruleDeclVariables2 EOF )
            // InternalPole.g:1300:2: iv_ruleDeclVariables2= ruleDeclVariables2 EOF
            {
             newCompositeNode(grammarAccess.getDeclVariables2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclVariables2=ruleDeclVariables2();

            state._fsp--;

             current =iv_ruleDeclVariables2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclVariables2"


    // $ANTLR start "ruleDeclVariables2"
    // InternalPole.g:1306:1: ruleDeclVariables2 returns [EObject current=null] : ( ( (lv_tipoDeDato_0_0= ruleTipoDeDato ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclVariables2() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_tipoDeDato_0_0 = null;



        	enterRule();

        try {
            // InternalPole.g:1312:2: ( ( ( (lv_tipoDeDato_0_0= ruleTipoDeDato ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalPole.g:1313:2: ( ( (lv_tipoDeDato_0_0= ruleTipoDeDato ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalPole.g:1313:2: ( ( (lv_tipoDeDato_0_0= ruleTipoDeDato ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalPole.g:1314:3: ( (lv_tipoDeDato_0_0= ruleTipoDeDato ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalPole.g:1314:3: ( (lv_tipoDeDato_0_0= ruleTipoDeDato ) )
            // InternalPole.g:1315:4: (lv_tipoDeDato_0_0= ruleTipoDeDato )
            {
            // InternalPole.g:1315:4: (lv_tipoDeDato_0_0= ruleTipoDeDato )
            // InternalPole.g:1316:5: lv_tipoDeDato_0_0= ruleTipoDeDato
            {

            					newCompositeNode(grammarAccess.getDeclVariables2Access().getTipoDeDatoTipoDeDatoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_tipoDeDato_0_0=ruleTipoDeDato();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclVariables2Rule());
            					}
            					set(
            						current,
            						"tipoDeDato",
            						lv_tipoDeDato_0_0,
            						"edu.upb.lp.isc.Pole.TipoDeDato");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPole.g:1333:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPole.g:1334:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPole.g:1334:4: (lv_name_1_0= RULE_ID )
            // InternalPole.g:1335:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDeclVariables2Access().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclVariables2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclVariables2"


    // $ANTLR start "entryRuleAsignacionVariable"
    // InternalPole.g:1355:1: entryRuleAsignacionVariable returns [EObject current=null] : iv_ruleAsignacionVariable= ruleAsignacionVariable EOF ;
    public final EObject entryRuleAsignacionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionVariable = null;


        try {
            // InternalPole.g:1355:59: (iv_ruleAsignacionVariable= ruleAsignacionVariable EOF )
            // InternalPole.g:1356:2: iv_ruleAsignacionVariable= ruleAsignacionVariable EOF
            {
             newCompositeNode(grammarAccess.getAsignacionVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsignacionVariable=ruleAsignacionVariable();

            state._fsp--;

             current =iv_ruleAsignacionVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsignacionVariable"


    // $ANTLR start "ruleAsignacionVariable"
    // InternalPole.g:1362:1: ruleAsignacionVariable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_valor_2_0= ruleExpresion ) ) ) ;
    public final EObject ruleAsignacionVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_valor_2_0 = null;



        	enterRule();

        try {
            // InternalPole.g:1368:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_valor_2_0= ruleExpresion ) ) ) )
            // InternalPole.g:1369:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_valor_2_0= ruleExpresion ) ) )
            {
            // InternalPole.g:1369:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_valor_2_0= ruleExpresion ) ) )
            // InternalPole.g:1370:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_valor_2_0= ruleExpresion ) )
            {
            // InternalPole.g:1370:3: ( (otherlv_0= RULE_ID ) )
            // InternalPole.g:1371:4: (otherlv_0= RULE_ID )
            {
            // InternalPole.g:1371:4: (otherlv_0= RULE_ID )
            // InternalPole.g:1372:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAsignacionVariableRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_0, grammarAccess.getAsignacionVariableAccess().getVariableDeclVariablesCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAsignacionVariableAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalPole.g:1387:3: ( (lv_valor_2_0= ruleExpresion ) )
            // InternalPole.g:1388:4: (lv_valor_2_0= ruleExpresion )
            {
            // InternalPole.g:1388:4: (lv_valor_2_0= ruleExpresion )
            // InternalPole.g:1389:5: lv_valor_2_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getAsignacionVariableAccess().getValorExpresionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_valor_2_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsignacionVariableRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_2_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAsignacionVariable"


    // $ANTLR start "entryRuleTipoDeDato"
    // InternalPole.g:1410:1: entryRuleTipoDeDato returns [String current=null] : iv_ruleTipoDeDato= ruleTipoDeDato EOF ;
    public final String entryRuleTipoDeDato() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoDeDato = null;


        try {
            // InternalPole.g:1410:50: (iv_ruleTipoDeDato= ruleTipoDeDato EOF )
            // InternalPole.g:1411:2: iv_ruleTipoDeDato= ruleTipoDeDato EOF
            {
             newCompositeNode(grammarAccess.getTipoDeDatoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoDeDato=ruleTipoDeDato();

            state._fsp--;

             current =iv_ruleTipoDeDato.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoDeDato"


    // $ANTLR start "ruleTipoDeDato"
    // InternalPole.g:1417:1: ruleTipoDeDato returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'DALAS' | kw= 'MRBEAST' | kw= 'XOKAS' | kw= 'YINYANG' | kw= 'MICORAZON' ) ;
    public final AntlrDatatypeRuleToken ruleTipoDeDato() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPole.g:1423:2: ( (kw= 'DALAS' | kw= 'MRBEAST' | kw= 'XOKAS' | kw= 'YINYANG' | kw= 'MICORAZON' ) )
            // InternalPole.g:1424:2: (kw= 'DALAS' | kw= 'MRBEAST' | kw= 'XOKAS' | kw= 'YINYANG' | kw= 'MICORAZON' )
            {
            // InternalPole.g:1424:2: (kw= 'DALAS' | kw= 'MRBEAST' | kw= 'XOKAS' | kw= 'YINYANG' | kw= 'MICORAZON' )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt19=1;
                }
                break;
            case 44:
                {
                alt19=2;
                }
                break;
            case 45:
                {
                alt19=3;
                }
                break;
            case 46:
                {
                alt19=4;
                }
                break;
            case 47:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalPole.g:1425:3: kw= 'DALAS'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoDeDatoAccess().getDALASKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPole.g:1431:3: kw= 'MRBEAST'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoDeDatoAccess().getMRBEASTKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPole.g:1437:3: kw= 'XOKAS'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoDeDatoAccess().getXOKASKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPole.g:1443:3: kw= 'YINYANG'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoDeDatoAccess().getYINYANGKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPole.g:1449:3: kw= 'MICORAZON'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoDeDatoAccess().getMICORAZONKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoDeDato"


    // $ANTLR start "entryRuleExpresion"
    // InternalPole.g:1458:1: entryRuleExpresion returns [EObject current=null] : iv_ruleExpresion= ruleExpresion EOF ;
    public final EObject entryRuleExpresion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresion = null;


        try {
            // InternalPole.g:1458:50: (iv_ruleExpresion= ruleExpresion EOF )
            // InternalPole.g:1459:2: iv_ruleExpresion= ruleExpresion EOF
            {
             newCompositeNode(grammarAccess.getExpresionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresion=ruleExpresion();

            state._fsp--;

             current =iv_ruleExpresion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // InternalPole.g:1465:1: ruleExpresion returns [EObject current=null] : (this_ExpresionDecimal_0= ruleExpresionDecimal | this_ExpresionString_1= ruleExpresionString | this_ExpresionBooleana_2= ruleExpresionBooleana | this_LlamadoVariable_3= ruleLlamadoVariable | this_LlamadoFuncion_4= ruleLlamadoFuncion ) ;
    public final EObject ruleExpresion() throws RecognitionException {
        EObject current = null;

        EObject this_ExpresionDecimal_0 = null;

        EObject this_ExpresionString_1 = null;

        EObject this_ExpresionBooleana_2 = null;

        EObject this_LlamadoVariable_3 = null;

        EObject this_LlamadoFuncion_4 = null;



        	enterRule();

        try {
            // InternalPole.g:1471:2: ( (this_ExpresionDecimal_0= ruleExpresionDecimal | this_ExpresionString_1= ruleExpresionString | this_ExpresionBooleana_2= ruleExpresionBooleana | this_LlamadoVariable_3= ruleLlamadoVariable | this_LlamadoFuncion_4= ruleLlamadoFuncion ) )
            // InternalPole.g:1472:2: (this_ExpresionDecimal_0= ruleExpresionDecimal | this_ExpresionString_1= ruleExpresionString | this_ExpresionBooleana_2= ruleExpresionBooleana | this_LlamadoVariable_3= ruleLlamadoVariable | this_LlamadoFuncion_4= ruleLlamadoFuncion )
            {
            // InternalPole.g:1472:2: (this_ExpresionDecimal_0= ruleExpresionDecimal | this_ExpresionString_1= ruleExpresionString | this_ExpresionBooleana_2= ruleExpresionBooleana | this_LlamadoVariable_3= ruleLlamadoVariable | this_LlamadoFuncion_4= ruleLlamadoFuncion )
            int alt20=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 48:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt20=1;
                }
                break;
            case RULE_STRING:
            case 60:
                {
                alt20=2;
                }
                break;
            case 62:
            case 63:
            case 66:
            case 67:
            case 68:
            case 69:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 79:
            case 80:
                {
                alt20=3;
                }
                break;
            case RULE_ID:
                {
                alt20=4;
                }
                break;
            case 13:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalPole.g:1473:3: this_ExpresionDecimal_0= ruleExpresionDecimal
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionDecimalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionDecimal_0=ruleExpresionDecimal();

                    state._fsp--;


                    			current = this_ExpresionDecimal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPole.g:1482:3: this_ExpresionString_1= ruleExpresionString
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionString_1=ruleExpresionString();

                    state._fsp--;


                    			current = this_ExpresionString_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPole.g:1491:3: this_ExpresionBooleana_2= ruleExpresionBooleana
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionBooleanaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionBooleana_2=ruleExpresionBooleana();

                    state._fsp--;


                    			current = this_ExpresionBooleana_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPole.g:1500:3: this_LlamadoVariable_3= ruleLlamadoVariable
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getLlamadoVariableParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LlamadoVariable_3=ruleLlamadoVariable();

                    state._fsp--;


                    			current = this_LlamadoVariable_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPole.g:1509:3: this_LlamadoFuncion_4= ruleLlamadoFuncion
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getLlamadoFuncionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LlamadoFuncion_4=ruleLlamadoFuncion();

                    state._fsp--;


                    			current = this_LlamadoFuncion_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleLlamadoVariable"
    // InternalPole.g:1521:1: entryRuleLlamadoVariable returns [EObject current=null] : iv_ruleLlamadoVariable= ruleLlamadoVariable EOF ;
    public final EObject entryRuleLlamadoVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlamadoVariable = null;


        try {
            // InternalPole.g:1521:56: (iv_ruleLlamadoVariable= ruleLlamadoVariable EOF )
            // InternalPole.g:1522:2: iv_ruleLlamadoVariable= ruleLlamadoVariable EOF
            {
             newCompositeNode(grammarAccess.getLlamadoVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLlamadoVariable=ruleLlamadoVariable();

            state._fsp--;

             current =iv_ruleLlamadoVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLlamadoVariable"


    // $ANTLR start "ruleLlamadoVariable"
    // InternalPole.g:1528:1: ruleLlamadoVariable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleLlamadoVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalPole.g:1534:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalPole.g:1535:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalPole.g:1535:2: ( (otherlv_0= RULE_ID ) )
            // InternalPole.g:1536:3: (otherlv_0= RULE_ID )
            {
            // InternalPole.g:1536:3: (otherlv_0= RULE_ID )
            // InternalPole.g:1537:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLlamadoVariableRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getLlamadoVariableAccess().getVariableDeclVariablesCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLlamadoVariable"


    // $ANTLR start "entryRuleLlamadoFuncion"
    // InternalPole.g:1551:1: entryRuleLlamadoFuncion returns [EObject current=null] : iv_ruleLlamadoFuncion= ruleLlamadoFuncion EOF ;
    public final EObject entryRuleLlamadoFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlamadoFuncion = null;


        try {
            // InternalPole.g:1551:55: (iv_ruleLlamadoFuncion= ruleLlamadoFuncion EOF )
            // InternalPole.g:1552:2: iv_ruleLlamadoFuncion= ruleLlamadoFuncion EOF
            {
             newCompositeNode(grammarAccess.getLlamadoFuncionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLlamadoFuncion=ruleLlamadoFuncion();

            state._fsp--;

             current =iv_ruleLlamadoFuncion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLlamadoFuncion"


    // $ANTLR start "ruleLlamadoFuncion"
    // InternalPole.g:1558:1: ruleLlamadoFuncion returns [EObject current=null] : (otherlv_0= 'EYYOLVIDONA' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'EY' ( (lv_args_4_0= ruleExpresion ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleLlamadoFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalPole.g:1564:2: ( (otherlv_0= 'EYYOLVIDONA' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'EY' ( (lv_args_4_0= ruleExpresion ) ) )* otherlv_5= ')' ) )
            // InternalPole.g:1565:2: (otherlv_0= 'EYYOLVIDONA' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'EY' ( (lv_args_4_0= ruleExpresion ) ) )* otherlv_5= ')' )
            {
            // InternalPole.g:1565:2: (otherlv_0= 'EYYOLVIDONA' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'EY' ( (lv_args_4_0= ruleExpresion ) ) )* otherlv_5= ')' )
            // InternalPole.g:1566:3: otherlv_0= 'EYYOLVIDONA' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'EY' ( (lv_args_4_0= ruleExpresion ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLlamadoFuncionAccess().getEYYOLVIDONAKeyword_0());
            		
            // InternalPole.g:1570:3: ( (otherlv_1= RULE_ID ) )
            // InternalPole.g:1571:4: (otherlv_1= RULE_ID )
            {
            // InternalPole.g:1571:4: (otherlv_1= RULE_ID )
            // InternalPole.g:1572:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLlamadoFuncionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_1, grammarAccess.getLlamadoFuncionAccess().getFuncFuncionesCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getLlamadoFuncionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalPole.g:1587:3: (otherlv_3= 'EY' ( (lv_args_4_0= ruleExpresion ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==15) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPole.g:1588:4: otherlv_3= 'EY' ( (lv_args_4_0= ruleExpresion ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getLlamadoFuncionAccess().getEYKeyword_3_0());
            	    			
            	    // InternalPole.g:1592:4: ( (lv_args_4_0= ruleExpresion ) )
            	    // InternalPole.g:1593:5: (lv_args_4_0= ruleExpresion )
            	    {
            	    // InternalPole.g:1593:5: (lv_args_4_0= ruleExpresion )
            	    // InternalPole.g:1594:6: lv_args_4_0= ruleExpresion
            	    {

            	    						newCompositeNode(grammarAccess.getLlamadoFuncionAccess().getArgsExpresionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_args_4_0=ruleExpresion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLlamadoFuncionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"args",
            	    							lv_args_4_0,
            	    							"edu.upb.lp.isc.Pole.Expresion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLlamadoFuncionAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLlamadoFuncion"


    // $ANTLR start "entryRuleExpresionDecimal"
    // InternalPole.g:1620:1: entryRuleExpresionDecimal returns [EObject current=null] : iv_ruleExpresionDecimal= ruleExpresionDecimal EOF ;
    public final EObject entryRuleExpresionDecimal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionDecimal = null;


        try {
            // InternalPole.g:1620:57: (iv_ruleExpresionDecimal= ruleExpresionDecimal EOF )
            // InternalPole.g:1621:2: iv_ruleExpresionDecimal= ruleExpresionDecimal EOF
            {
             newCompositeNode(grammarAccess.getExpresionDecimalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionDecimal=ruleExpresionDecimal();

            state._fsp--;

             current =iv_ruleExpresionDecimal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionDecimal"


    // $ANTLR start "ruleExpresionDecimal"
    // InternalPole.g:1627:1: ruleExpresionDecimal returns [EObject current=null] : (this_ExpresionAritmetica_0= ruleExpresionAritmetica | this_ExpresionSimpleAritmetica_1= ruleExpresionSimpleAritmetica | this_ExpresionSimpleXokas_2= ruleExpresionSimpleXokas | this_ExpresionLongitudString_3= ruleExpresionLongitudString | this_ExpresionNegativo_4= ruleExpresionNegativo ) ;
    public final EObject ruleExpresionDecimal() throws RecognitionException {
        EObject current = null;

        EObject this_ExpresionAritmetica_0 = null;

        EObject this_ExpresionSimpleAritmetica_1 = null;

        EObject this_ExpresionSimpleXokas_2 = null;

        EObject this_ExpresionLongitudString_3 = null;

        EObject this_ExpresionNegativo_4 = null;



        	enterRule();

        try {
            // InternalPole.g:1633:2: ( (this_ExpresionAritmetica_0= ruleExpresionAritmetica | this_ExpresionSimpleAritmetica_1= ruleExpresionSimpleAritmetica | this_ExpresionSimpleXokas_2= ruleExpresionSimpleXokas | this_ExpresionLongitudString_3= ruleExpresionLongitudString | this_ExpresionNegativo_4= ruleExpresionNegativo ) )
            // InternalPole.g:1634:2: (this_ExpresionAritmetica_0= ruleExpresionAritmetica | this_ExpresionSimpleAritmetica_1= ruleExpresionSimpleAritmetica | this_ExpresionSimpleXokas_2= ruleExpresionSimpleXokas | this_ExpresionLongitudString_3= ruleExpresionLongitudString | this_ExpresionNegativo_4= ruleExpresionNegativo )
            {
            // InternalPole.g:1634:2: (this_ExpresionAritmetica_0= ruleExpresionAritmetica | this_ExpresionSimpleAritmetica_1= ruleExpresionSimpleAritmetica | this_ExpresionSimpleXokas_2= ruleExpresionSimpleXokas | this_ExpresionLongitudString_3= ruleExpresionLongitudString | this_ExpresionNegativo_4= ruleExpresionNegativo )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt22=1;
                }
                break;
            case RULE_INT:
                {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==49) ) {
                    alt22=3;
                }
                else if ( (LA22_2==EOF||LA22_2==RULE_ID||(LA22_2>=12 && LA22_2<=13)||(LA22_2>=15 && LA22_2<=17)||(LA22_2>=19 && LA22_2<=28)||(LA22_2>=30 && LA22_2<=36)||(LA22_2>=38 && LA22_2<=41)||LA22_2==59||LA22_2==61||(LA22_2>=64 && LA22_2<=65)||(LA22_2>=70 && LA22_2<=72)||LA22_2==78) ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                alt22=4;
                }
                break;
            case 48:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalPole.g:1635:3: this_ExpresionAritmetica_0= ruleExpresionAritmetica
                    {

                    			newCompositeNode(grammarAccess.getExpresionDecimalAccess().getExpresionAritmeticaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionAritmetica_0=ruleExpresionAritmetica();

                    state._fsp--;


                    			current = this_ExpresionAritmetica_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPole.g:1644:3: this_ExpresionSimpleAritmetica_1= ruleExpresionSimpleAritmetica
                    {

                    			newCompositeNode(grammarAccess.getExpresionDecimalAccess().getExpresionSimpleAritmeticaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionSimpleAritmetica_1=ruleExpresionSimpleAritmetica();

                    state._fsp--;


                    			current = this_ExpresionSimpleAritmetica_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPole.g:1653:3: this_ExpresionSimpleXokas_2= ruleExpresionSimpleXokas
                    {

                    			newCompositeNode(grammarAccess.getExpresionDecimalAccess().getExpresionSimpleXokasParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionSimpleXokas_2=ruleExpresionSimpleXokas();

                    state._fsp--;


                    			current = this_ExpresionSimpleXokas_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPole.g:1662:3: this_ExpresionLongitudString_3= ruleExpresionLongitudString
                    {

                    			newCompositeNode(grammarAccess.getExpresionDecimalAccess().getExpresionLongitudStringParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionLongitudString_3=ruleExpresionLongitudString();

                    state._fsp--;


                    			current = this_ExpresionLongitudString_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPole.g:1671:3: this_ExpresionNegativo_4= ruleExpresionNegativo
                    {

                    			newCompositeNode(grammarAccess.getExpresionDecimalAccess().getExpresionNegativoParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionNegativo_4=ruleExpresionNegativo();

                    state._fsp--;


                    			current = this_ExpresionNegativo_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionDecimal"


    // $ANTLR start "entryRuleExpresionNegativo"
    // InternalPole.g:1683:1: entryRuleExpresionNegativo returns [EObject current=null] : iv_ruleExpresionNegativo= ruleExpresionNegativo EOF ;
    public final EObject entryRuleExpresionNegativo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionNegativo = null;


        try {
            // InternalPole.g:1683:58: (iv_ruleExpresionNegativo= ruleExpresionNegativo EOF )
            // InternalPole.g:1684:2: iv_ruleExpresionNegativo= ruleExpresionNegativo EOF
            {
             newCompositeNode(grammarAccess.getExpresionNegativoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionNegativo=ruleExpresionNegativo();

            state._fsp--;

             current =iv_ruleExpresionNegativo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionNegativo"


    // $ANTLR start "ruleExpresionNegativo"
    // InternalPole.g:1690:1: ruleExpresionNegativo returns [EObject current=null] : (otherlv_0= '-' ( (lv_e_1_0= ruleExpresion ) ) ) ;
    public final EObject ruleExpresionNegativo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_e_1_0 = null;



        	enterRule();

        try {
            // InternalPole.g:1696:2: ( (otherlv_0= '-' ( (lv_e_1_0= ruleExpresion ) ) ) )
            // InternalPole.g:1697:2: (otherlv_0= '-' ( (lv_e_1_0= ruleExpresion ) ) )
            {
            // InternalPole.g:1697:2: (otherlv_0= '-' ( (lv_e_1_0= ruleExpresion ) ) )
            // InternalPole.g:1698:3: otherlv_0= '-' ( (lv_e_1_0= ruleExpresion ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getExpresionNegativoAccess().getHyphenMinusKeyword_0());
            		
            // InternalPole.g:1702:3: ( (lv_e_1_0= ruleExpresion ) )
            // InternalPole.g:1703:4: (lv_e_1_0= ruleExpresion )
            {
            // InternalPole.g:1703:4: (lv_e_1_0= ruleExpresion )
            // InternalPole.g:1704:5: lv_e_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionNegativoAccess().getEExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_e_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionNegativoRule());
            					}
            					set(
            						current,
            						"e",
            						lv_e_1_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionNegativo"


    // $ANTLR start "entryRuleExpresionSimpleXokas"
    // InternalPole.g:1725:1: entryRuleExpresionSimpleXokas returns [EObject current=null] : iv_ruleExpresionSimpleXokas= ruleExpresionSimpleXokas EOF ;
    public final EObject entryRuleExpresionSimpleXokas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionSimpleXokas = null;


        try {
            // InternalPole.g:1725:61: (iv_ruleExpresionSimpleXokas= ruleExpresionSimpleXokas EOF )
            // InternalPole.g:1726:2: iv_ruleExpresionSimpleXokas= ruleExpresionSimpleXokas EOF
            {
             newCompositeNode(grammarAccess.getExpresionSimpleXokasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionSimpleXokas=ruleExpresionSimpleXokas();

            state._fsp--;

             current =iv_ruleExpresionSimpleXokas; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionSimpleXokas"


    // $ANTLR start "ruleExpresionSimpleXokas"
    // InternalPole.g:1732:1: ruleExpresionSimpleXokas returns [EObject current=null] : ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_y_2_0= RULE_INT ) ) ( (otherlv_3= 'e' | otherlv_4= 'E' ) (otherlv_5= '-' )? ( (lv_z_6_0= RULE_INT ) ) )? ) ;
    public final EObject ruleExpresionSimpleXokas() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;
        Token otherlv_1=null;
        Token lv_y_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_z_6_0=null;


        	enterRule();

        try {
            // InternalPole.g:1738:2: ( ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_y_2_0= RULE_INT ) ) ( (otherlv_3= 'e' | otherlv_4= 'E' ) (otherlv_5= '-' )? ( (lv_z_6_0= RULE_INT ) ) )? ) )
            // InternalPole.g:1739:2: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_y_2_0= RULE_INT ) ) ( (otherlv_3= 'e' | otherlv_4= 'E' ) (otherlv_5= '-' )? ( (lv_z_6_0= RULE_INT ) ) )? )
            {
            // InternalPole.g:1739:2: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_y_2_0= RULE_INT ) ) ( (otherlv_3= 'e' | otherlv_4= 'E' ) (otherlv_5= '-' )? ( (lv_z_6_0= RULE_INT ) ) )? )
            // InternalPole.g:1740:3: ( (lv_x_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_y_2_0= RULE_INT ) ) ( (otherlv_3= 'e' | otherlv_4= 'E' ) (otherlv_5= '-' )? ( (lv_z_6_0= RULE_INT ) ) )?
            {
            // InternalPole.g:1740:3: ( (lv_x_0_0= RULE_INT ) )
            // InternalPole.g:1741:4: (lv_x_0_0= RULE_INT )
            {
            // InternalPole.g:1741:4: (lv_x_0_0= RULE_INT )
            // InternalPole.g:1742:5: lv_x_0_0= RULE_INT
            {
            lv_x_0_0=(Token)match(input,RULE_INT,FOLLOW_32); 

            					newLeafNode(lv_x_0_0, grammarAccess.getExpresionSimpleXokasAccess().getXINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpresionSimpleXokasRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,49,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionSimpleXokasAccess().getFullStopKeyword_1());
            		
            // InternalPole.g:1762:3: ( (lv_y_2_0= RULE_INT ) )
            // InternalPole.g:1763:4: (lv_y_2_0= RULE_INT )
            {
            // InternalPole.g:1763:4: (lv_y_2_0= RULE_INT )
            // InternalPole.g:1764:5: lv_y_2_0= RULE_INT
            {
            lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_34); 

            					newLeafNode(lv_y_2_0, grammarAccess.getExpresionSimpleXokasAccess().getYINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpresionSimpleXokasRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalPole.g:1780:3: ( (otherlv_3= 'e' | otherlv_4= 'E' ) (otherlv_5= '-' )? ( (lv_z_6_0= RULE_INT ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=50 && LA25_0<=51)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPole.g:1781:4: (otherlv_3= 'e' | otherlv_4= 'E' ) (otherlv_5= '-' )? ( (lv_z_6_0= RULE_INT ) )
                    {
                    // InternalPole.g:1781:4: (otherlv_3= 'e' | otherlv_4= 'E' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==50) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==51) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalPole.g:1782:5: otherlv_3= 'e'
                            {
                            otherlv_3=(Token)match(input,50,FOLLOW_35); 

                            					newLeafNode(otherlv_3, grammarAccess.getExpresionSimpleXokasAccess().getEKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPole.g:1787:5: otherlv_4= 'E'
                            {
                            otherlv_4=(Token)match(input,51,FOLLOW_35); 

                            					newLeafNode(otherlv_4, grammarAccess.getExpresionSimpleXokasAccess().getEKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalPole.g:1792:4: (otherlv_5= '-' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==48) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalPole.g:1793:5: otherlv_5= '-'
                            {
                            otherlv_5=(Token)match(input,48,FOLLOW_33); 

                            					newLeafNode(otherlv_5, grammarAccess.getExpresionSimpleXokasAccess().getHyphenMinusKeyword_3_1());
                            				

                            }
                            break;

                    }

                    // InternalPole.g:1798:4: ( (lv_z_6_0= RULE_INT ) )
                    // InternalPole.g:1799:5: (lv_z_6_0= RULE_INT )
                    {
                    // InternalPole.g:1799:5: (lv_z_6_0= RULE_INT )
                    // InternalPole.g:1800:6: lv_z_6_0= RULE_INT
                    {
                    lv_z_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_z_6_0, grammarAccess.getExpresionSimpleXokasAccess().getZINTTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpresionSimpleXokasRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"z",
                    							lv_z_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionSimpleXokas"


    // $ANTLR start "entryRuleExpresionSimpleAritmetica"
    // InternalPole.g:1821:1: entryRuleExpresionSimpleAritmetica returns [EObject current=null] : iv_ruleExpresionSimpleAritmetica= ruleExpresionSimpleAritmetica EOF ;
    public final EObject entryRuleExpresionSimpleAritmetica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionSimpleAritmetica = null;


        try {
            // InternalPole.g:1821:66: (iv_ruleExpresionSimpleAritmetica= ruleExpresionSimpleAritmetica EOF )
            // InternalPole.g:1822:2: iv_ruleExpresionSimpleAritmetica= ruleExpresionSimpleAritmetica EOF
            {
             newCompositeNode(grammarAccess.getExpresionSimpleAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionSimpleAritmetica=ruleExpresionSimpleAritmetica();

            state._fsp--;

             current =iv_ruleExpresionSimpleAritmetica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionSimpleAritmetica"


    // $ANTLR start "ruleExpresionSimpleAritmetica"
    // InternalPole.g:1828:1: ruleExpresionSimpleAritmetica returns [EObject current=null] : ( (lv_x_0_0= RULE_INT ) ) ;
    public final EObject ruleExpresionSimpleAritmetica() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;


        	enterRule();

        try {
            // InternalPole.g:1834:2: ( ( (lv_x_0_0= RULE_INT ) ) )
            // InternalPole.g:1835:2: ( (lv_x_0_0= RULE_INT ) )
            {
            // InternalPole.g:1835:2: ( (lv_x_0_0= RULE_INT ) )
            // InternalPole.g:1836:3: (lv_x_0_0= RULE_INT )
            {
            // InternalPole.g:1836:3: (lv_x_0_0= RULE_INT )
            // InternalPole.g:1837:4: lv_x_0_0= RULE_INT
            {
            lv_x_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_x_0_0, grammarAccess.getExpresionSimpleAritmeticaAccess().getXINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExpresionSimpleAritmeticaRule());
            				}
            				setWithLastConsumed(
            					current,
            					"x",
            					lv_x_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionSimpleAritmetica"


    // $ANTLR start "entryRuleExpresionLongitudString"
    // InternalPole.g:1856:1: entryRuleExpresionLongitudString returns [EObject current=null] : iv_ruleExpresionLongitudString= ruleExpresionLongitudString EOF ;
    public final EObject entryRuleExpresionLongitudString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionLongitudString = null;


        try {
            // InternalPole.g:1856:64: (iv_ruleExpresionLongitudString= ruleExpresionLongitudString EOF )
            // InternalPole.g:1857:2: iv_ruleExpresionLongitudString= ruleExpresionLongitudString EOF
            {
             newCompositeNode(grammarAccess.getExpresionLongitudStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionLongitudString=ruleExpresionLongitudString();

            state._fsp--;

             current =iv_ruleExpresionLongitudString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionLongitudString"


    // $ANTLR start "ruleExpresionLongitudString"
    // InternalPole.g:1863:1: ruleExpresionLongitudString returns [EObject current=null] : (otherlv_0= 'KGRANDE' ( (lv_llamado_1_0= ruleExpresion ) ) ) ;
    public final EObject ruleExpresionLongitudString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_llamado_1_0 = null;



        	enterRule();

        try {
            // InternalPole.g:1869:2: ( (otherlv_0= 'KGRANDE' ( (lv_llamado_1_0= ruleExpresion ) ) ) )
            // InternalPole.g:1870:2: (otherlv_0= 'KGRANDE' ( (lv_llamado_1_0= ruleExpresion ) ) )
            {
            // InternalPole.g:1870:2: (otherlv_0= 'KGRANDE' ( (lv_llamado_1_0= ruleExpresion ) ) )
            // InternalPole.g:1871:3: otherlv_0= 'KGRANDE' ( (lv_llamado_1_0= ruleExpresion ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getExpresionLongitudStringAccess().getKGRANDEKeyword_0());
            		
            // InternalPole.g:1875:3: ( (lv_llamado_1_0= ruleExpresion ) )
            // InternalPole.g:1876:4: (lv_llamado_1_0= ruleExpresion )
            {
            // InternalPole.g:1876:4: (lv_llamado_1_0= ruleExpresion )
            // InternalPole.g:1877:5: lv_llamado_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionLongitudStringAccess().getLlamadoExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_llamado_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionLongitudStringRule());
            					}
            					set(
            						current,
            						"llamado",
            						lv_llamado_1_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionLongitudString"


    // $ANTLR start "entryRuleExpresionAritmetica"
    // InternalPole.g:1898:1: entryRuleExpresionAritmetica returns [EObject current=null] : iv_ruleExpresionAritmetica= ruleExpresionAritmetica EOF ;
    public final EObject entryRuleExpresionAritmetica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionAritmetica = null;


        try {
            // InternalPole.g:1898:60: (iv_ruleExpresionAritmetica= ruleExpresionAritmetica EOF )
            // InternalPole.g:1899:2: iv_ruleExpresionAritmetica= ruleExpresionAritmetica EOF
            {
             newCompositeNode(grammarAccess.getExpresionAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionAritmetica=ruleExpresionAritmetica();

            state._fsp--;

             current =iv_ruleExpresionAritmetica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionAritmetica"


    // $ANTLR start "ruleExpresionAritmetica"
    // InternalPole.g:1905:1: ruleExpresionAritmetica returns [EObject current=null] : (this_Suma_0= ruleSuma | this_Resta_1= ruleResta | this_Multiplicacion_2= ruleMultiplicacion | this_Division_3= ruleDivision | this_Modulo_4= ruleModulo ) ;
    public final EObject ruleExpresionAritmetica() throws RecognitionException {
        EObject current = null;

        EObject this_Suma_0 = null;

        EObject this_Resta_1 = null;

        EObject this_Multiplicacion_2 = null;

        EObject this_Division_3 = null;

        EObject this_Modulo_4 = null;



        	enterRule();

        try {
            // InternalPole.g:1911:2: ( (this_Suma_0= ruleSuma | this_Resta_1= ruleResta | this_Multiplicacion_2= ruleMultiplicacion | this_Division_3= ruleDivision | this_Modulo_4= ruleModulo ) )
            // InternalPole.g:1912:2: (this_Suma_0= ruleSuma | this_Resta_1= ruleResta | this_Multiplicacion_2= ruleMultiplicacion | this_Division_3= ruleDivision | this_Modulo_4= ruleModulo )
            {
            // InternalPole.g:1912:2: (this_Suma_0= ruleSuma | this_Resta_1= ruleResta | this_Multiplicacion_2= ruleMultiplicacion | this_Division_3= ruleDivision | this_Modulo_4= ruleModulo )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt26=1;
                }
                break;
            case 54:
                {
                alt26=2;
                }
                break;
            case 55:
                {
                alt26=3;
                }
                break;
            case 56:
                {
                alt26=4;
                }
                break;
            case 57:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalPole.g:1913:3: this_Suma_0= ruleSuma
                    {

                    			newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getSumaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Suma_0=ruleSuma();

                    state._fsp--;


                    			current = this_Suma_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPole.g:1922:3: this_Resta_1= ruleResta
                    {

                    			newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getRestaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Resta_1=ruleResta();

                    state._fsp--;


                    			current = this_Resta_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPole.g:1931:3: this_Multiplicacion_2= ruleMultiplicacion
                    {

                    			newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getMultiplicacionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Multiplicacion_2=ruleMultiplicacion();

                    state._fsp--;


                    			current = this_Multiplicacion_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPole.g:1940:3: this_Division_3= ruleDivision
                    {

                    			newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getDivisionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Division_3=ruleDivision();

                    state._fsp--;


                    			current = this_Division_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPole.g:1949:3: this_Modulo_4= ruleModulo
                    {

                    			newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getModuloParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Modulo_4=ruleModulo();

                    state._fsp--;


                    			current = this_Modulo_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionAritmetica"


    // $ANTLR start "entryRuleSuma"
    // InternalPole.g:1961:1: entryRuleSuma returns [EObject current=null] : iv_ruleSuma= ruleSuma EOF ;
    public final EObject entryRuleSuma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuma = null;


        try {
            // InternalPole.g:1961:45: (iv_ruleSuma= ruleSuma EOF )
            // InternalPole.g:1962:2: iv_ruleSuma= ruleSuma EOF
            {
             newCompositeNode(grammarAccess.getSumaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuma=ruleSuma();

            state._fsp--;

             current =iv_ruleSuma; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuma"


    // $ANTLR start "ruleSuma"
    // InternalPole.g:1968:1: ruleSuma returns [EObject current=null] : (otherlv_0= 'SUMA' ( (lv_op_1_0= ruleOperacion ) ) ) ;
    public final EObject ruleSuma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalPole.g:1974:2: ( (otherlv_0= 'SUMA' ( (lv_op_1_0= ruleOperacion ) ) ) )
            // InternalPole.g:1975:2: (otherlv_0= 'SUMA' ( (lv_op_1_0= ruleOperacion ) ) )
            {
            // InternalPole.g:1975:2: (otherlv_0= 'SUMA' ( (lv_op_1_0= ruleOperacion ) ) )
            // InternalPole.g:1976:3: otherlv_0= 'SUMA' ( (lv_op_1_0= ruleOperacion ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getSumaAccess().getSUMAKeyword_0());
            		
            // InternalPole.g:1980:3: ( (lv_op_1_0= ruleOperacion ) )
            // InternalPole.g:1981:4: (lv_op_1_0= ruleOperacion )
            {
            // InternalPole.g:1981:4: (lv_op_1_0= ruleOperacion )
            // InternalPole.g:1982:5: lv_op_1_0= ruleOperacion
            {

            					newCompositeNode(grammarAccess.getSumaAccess().getOpOperacionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_op_1_0=ruleOperacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumaRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"edu.upb.lp.isc.Pole.Operacion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuma"


    // $ANTLR start "entryRuleResta"
    // InternalPole.g:2003:1: entryRuleResta returns [EObject current=null] : iv_ruleResta= ruleResta EOF ;
    public final EObject entryRuleResta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResta = null;


        try {
            // InternalPole.g:2003:46: (iv_ruleResta= ruleResta EOF )
            // InternalPole.g:2004:2: iv_ruleResta= ruleResta EOF
            {
             newCompositeNode(grammarAccess.getRestaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResta=ruleResta();

            state._fsp--;

             current =iv_ruleResta; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResta"


    // $ANTLR start "ruleResta"
    // InternalPole.g:2010:1: ruleResta returns [EObject current=null] : (otherlv_0= 'RESTA' ( (lv_op_1_0= ruleOperacion ) ) ) ;
    public final EObject ruleResta() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalPole.g:2016:2: ( (otherlv_0= 'RESTA' ( (lv_op_1_0= ruleOperacion ) ) ) )
            // InternalPole.g:2017:2: (otherlv_0= 'RESTA' ( (lv_op_1_0= ruleOperacion ) ) )
            {
            // InternalPole.g:2017:2: (otherlv_0= 'RESTA' ( (lv_op_1_0= ruleOperacion ) ) )
            // InternalPole.g:2018:3: otherlv_0= 'RESTA' ( (lv_op_1_0= ruleOperacion ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getRestaAccess().getRESTAKeyword_0());
            		
            // InternalPole.g:2022:3: ( (lv_op_1_0= ruleOperacion ) )
            // InternalPole.g:2023:4: (lv_op_1_0= ruleOperacion )
            {
            // InternalPole.g:2023:4: (lv_op_1_0= ruleOperacion )
            // InternalPole.g:2024:5: lv_op_1_0= ruleOperacion
            {

            					newCompositeNode(grammarAccess.getRestaAccess().getOpOperacionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_op_1_0=ruleOperacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestaRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"edu.upb.lp.isc.Pole.Operacion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResta"


    // $ANTLR start "entryRuleMultiplicacion"
    // InternalPole.g:2045:1: entryRuleMultiplicacion returns [EObject current=null] : iv_ruleMultiplicacion= ruleMultiplicacion EOF ;
    public final EObject entryRuleMultiplicacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacion = null;


        try {
            // InternalPole.g:2045:55: (iv_ruleMultiplicacion= ruleMultiplicacion EOF )
            // InternalPole.g:2046:2: iv_ruleMultiplicacion= ruleMultiplicacion EOF
            {
             newCompositeNode(grammarAccess.getMultiplicacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicacion=ruleMultiplicacion();

            state._fsp--;

             current =iv_ruleMultiplicacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicacion"


    // $ANTLR start "ruleMultiplicacion"
    // InternalPole.g:2052:1: ruleMultiplicacion returns [EObject current=null] : (otherlv_0= 'MULTIPLICACION' ( (lv_op_1_0= ruleOperacion ) ) ) ;
    public final EObject ruleMultiplicacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalPole.g:2058:2: ( (otherlv_0= 'MULTIPLICACION' ( (lv_op_1_0= ruleOperacion ) ) ) )
            // InternalPole.g:2059:2: (otherlv_0= 'MULTIPLICACION' ( (lv_op_1_0= ruleOperacion ) ) )
            {
            // InternalPole.g:2059:2: (otherlv_0= 'MULTIPLICACION' ( (lv_op_1_0= ruleOperacion ) ) )
            // InternalPole.g:2060:3: otherlv_0= 'MULTIPLICACION' ( (lv_op_1_0= ruleOperacion ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplicacionAccess().getMULTIPLICACIONKeyword_0());
            		
            // InternalPole.g:2064:3: ( (lv_op_1_0= ruleOperacion ) )
            // InternalPole.g:2065:4: (lv_op_1_0= ruleOperacion )
            {
            // InternalPole.g:2065:4: (lv_op_1_0= ruleOperacion )
            // InternalPole.g:2066:5: lv_op_1_0= ruleOperacion
            {

            					newCompositeNode(grammarAccess.getMultiplicacionAccess().getOpOperacionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_op_1_0=ruleOperacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiplicacionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"edu.upb.lp.isc.Pole.Operacion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicacion"


    // $ANTLR start "entryRuleDivision"
    // InternalPole.g:2087:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalPole.g:2087:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalPole.g:2088:2: iv_ruleDivision= ruleDivision EOF
            {
             newCompositeNode(grammarAccess.getDivisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivision=ruleDivision();

            state._fsp--;

             current =iv_ruleDivision; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // InternalPole.g:2094:1: ruleDivision returns [EObject current=null] : (otherlv_0= 'DIVISION' ( (lv_op_1_0= ruleOperacion ) ) ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalPole.g:2100:2: ( (otherlv_0= 'DIVISION' ( (lv_op_1_0= ruleOperacion ) ) ) )
            // InternalPole.g:2101:2: (otherlv_0= 'DIVISION' ( (lv_op_1_0= ruleOperacion ) ) )
            {
            // InternalPole.g:2101:2: (otherlv_0= 'DIVISION' ( (lv_op_1_0= ruleOperacion ) ) )
            // InternalPole.g:2102:3: otherlv_0= 'DIVISION' ( (lv_op_1_0= ruleOperacion ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getDivisionAccess().getDIVISIONKeyword_0());
            		
            // InternalPole.g:2106:3: ( (lv_op_1_0= ruleOperacion ) )
            // InternalPole.g:2107:4: (lv_op_1_0= ruleOperacion )
            {
            // InternalPole.g:2107:4: (lv_op_1_0= ruleOperacion )
            // InternalPole.g:2108:5: lv_op_1_0= ruleOperacion
            {

            					newCompositeNode(grammarAccess.getDivisionAccess().getOpOperacionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_op_1_0=ruleOperacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivisionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"edu.upb.lp.isc.Pole.Operacion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRuleModulo"
    // InternalPole.g:2129:1: entryRuleModulo returns [EObject current=null] : iv_ruleModulo= ruleModulo EOF ;
    public final EObject entryRuleModulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulo = null;


        try {
            // InternalPole.g:2129:47: (iv_ruleModulo= ruleModulo EOF )
            // InternalPole.g:2130:2: iv_ruleModulo= ruleModulo EOF
            {
             newCompositeNode(grammarAccess.getModuloRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModulo=ruleModulo();

            state._fsp--;

             current =iv_ruleModulo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModulo"


    // $ANTLR start "ruleModulo"
    // InternalPole.g:2136:1: ruleModulo returns [EObject current=null] : (otherlv_0= 'MODULO' ( (lv_op_1_0= ruleOperacion ) ) ) ;
    public final EObject ruleModulo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalPole.g:2142:2: ( (otherlv_0= 'MODULO' ( (lv_op_1_0= ruleOperacion ) ) ) )
            // InternalPole.g:2143:2: (otherlv_0= 'MODULO' ( (lv_op_1_0= ruleOperacion ) ) )
            {
            // InternalPole.g:2143:2: (otherlv_0= 'MODULO' ( (lv_op_1_0= ruleOperacion ) ) )
            // InternalPole.g:2144:3: otherlv_0= 'MODULO' ( (lv_op_1_0= ruleOperacion ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getModuloAccess().getMODULOKeyword_0());
            		
            // InternalPole.g:2148:3: ( (lv_op_1_0= ruleOperacion ) )
            // InternalPole.g:2149:4: (lv_op_1_0= ruleOperacion )
            {
            // InternalPole.g:2149:4: (lv_op_1_0= ruleOperacion )
            // InternalPole.g:2150:5: lv_op_1_0= ruleOperacion
            {

            					newCompositeNode(grammarAccess.getModuloAccess().getOpOperacionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_op_1_0=ruleOperacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuloRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"edu.upb.lp.isc.Pole.Operacion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModulo"


    // $ANTLR start "entryRuleOperacion"
    // InternalPole.g:2171:1: entryRuleOperacion returns [EObject current=null] : iv_ruleOperacion= ruleOperacion EOF ;
    public final EObject entryRuleOperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacion = null;


        try {
            // InternalPole.g:2171:50: (iv_ruleOperacion= ruleOperacion EOF )
            // InternalPole.g:2172:2: iv_ruleOperacion= ruleOperacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperacion=ruleOperacion();

            state._fsp--;

             current =iv_ruleOperacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperacion"


    // $ANTLR start "ruleOperacion"
    // InternalPole.g:2178:1: ruleOperacion returns [EObject current=null] : (otherlv_0= 'JULIOPROFE' ( (lv_izq_1_0= ruleExpresion ) ) otherlv_2= 'Y' ( (lv_der_3_0= ruleExpresion ) ) ) ;
    public final EObject ruleOperacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_izq_1_0 = null;

        EObject lv_der_3_0 = null;



        	enterRule();

        try {
            // InternalPole.g:2184:2: ( (otherlv_0= 'JULIOPROFE' ( (lv_izq_1_0= ruleExpresion ) ) otherlv_2= 'Y' ( (lv_der_3_0= ruleExpresion ) ) ) )
            // InternalPole.g:2185:2: (otherlv_0= 'JULIOPROFE' ( (lv_izq_1_0= ruleExpresion ) ) otherlv_2= 'Y' ( (lv_der_3_0= ruleExpresion ) ) )
            {
            // InternalPole.g:2185:2: (otherlv_0= 'JULIOPROFE' ( (lv_izq_1_0= ruleExpresion ) ) otherlv_2= 'Y' ( (lv_der_3_0= ruleExpresion ) ) )
            // InternalPole.g:2186:3: otherlv_0= 'JULIOPROFE' ( (lv_izq_1_0= ruleExpresion ) ) otherlv_2= 'Y' ( (lv_der_3_0= ruleExpresion ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getOperacionAccess().getJULIOPROFEKeyword_0());
            		
            // InternalPole.g:2190:3: ( (lv_izq_1_0= ruleExpresion ) )
            // InternalPole.g:2191:4: (lv_izq_1_0= ruleExpresion )
            {
            // InternalPole.g:2191:4: (lv_izq_1_0= ruleExpresion )
            // InternalPole.g:2192:5: lv_izq_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getOperacionAccess().getIzqExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
            lv_izq_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperacionRule());
            					}
            					set(
            						current,
            						"izq",
            						lv_izq_1_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,59,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getOperacionAccess().getYKeyword_2());
            		
            // InternalPole.g:2213:3: ( (lv_der_3_0= ruleExpresion ) )
            // InternalPole.g:2214:4: (lv_der_3_0= ruleExpresion )
            {
            // InternalPole.g:2214:4: (lv_der_3_0= ruleExpresion )
            // InternalPole.g:2215:5: lv_der_3_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getOperacionAccess().getDerExpresionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_der_3_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperacionRule());
            					}
            					set(
            						current,
            						"der",
            						lv_der_3_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperacion"


    // $ANTLR start "entryRuleExpresionString"
    // InternalPole.g:2236:1: entryRuleExpresionString returns [EObject current=null] : iv_ruleExpresionString= ruleExpresionString EOF ;
    public final EObject entryRuleExpresionString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionString = null;


        try {
            // InternalPole.g:2236:56: (iv_ruleExpresionString= ruleExpresionString EOF )
            // InternalPole.g:2237:2: iv_ruleExpresionString= ruleExpresionString EOF
            {
             newCompositeNode(grammarAccess.getExpresionStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionString=ruleExpresionString();

            state._fsp--;

             current =iv_ruleExpresionString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionString"


    // $ANTLR start "ruleExpresionString"
    // InternalPole.g:2243:1: ruleExpresionString returns [EObject current=null] : (this_ExpresionConcatenacion_0= ruleExpresionConcatenacion | this_ExpresionSimpleString_1= ruleExpresionSimpleString ) ;
    public final EObject ruleExpresionString() throws RecognitionException {
        EObject current = null;

        EObject this_ExpresionConcatenacion_0 = null;

        EObject this_ExpresionSimpleString_1 = null;



        	enterRule();

        try {
            // InternalPole.g:2249:2: ( (this_ExpresionConcatenacion_0= ruleExpresionConcatenacion | this_ExpresionSimpleString_1= ruleExpresionSimpleString ) )
            // InternalPole.g:2250:2: (this_ExpresionConcatenacion_0= ruleExpresionConcatenacion | this_ExpresionSimpleString_1= ruleExpresionSimpleString )
            {
            // InternalPole.g:2250:2: (this_ExpresionConcatenacion_0= ruleExpresionConcatenacion | this_ExpresionSimpleString_1= ruleExpresionSimpleString )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==60) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_STRING) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalPole.g:2251:3: this_ExpresionConcatenacion_0= ruleExpresionConcatenacion
                    {

                    			newCompositeNode(grammarAccess.getExpresionStringAccess().getExpresionConcatenacionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionConcatenacion_0=ruleExpresionConcatenacion();

                    state._fsp--;


                    			current = this_ExpresionConcatenacion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPole.g:2260:3: this_ExpresionSimpleString_1= ruleExpresionSimpleString
                    {

                    			newCompositeNode(grammarAccess.getExpresionStringAccess().getExpresionSimpleStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionSimpleString_1=ruleExpresionSimpleString();

                    state._fsp--;


                    			current = this_ExpresionSimpleString_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionString"


    // $ANTLR start "entryRuleExpresionSimpleString"
    // InternalPole.g:2272:1: entryRuleExpresionSimpleString returns [EObject current=null] : iv_ruleExpresionSimpleString= ruleExpresionSimpleString EOF ;
    public final EObject entryRuleExpresionSimpleString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionSimpleString = null;


        try {
            // InternalPole.g:2272:62: (iv_ruleExpresionSimpleString= ruleExpresionSimpleString EOF )
            // InternalPole.g:2273:2: iv_ruleExpresionSimpleString= ruleExpresionSimpleString EOF
            {
             newCompositeNode(grammarAccess.getExpresionSimpleStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionSimpleString=ruleExpresionSimpleString();

            state._fsp--;

             current =iv_ruleExpresionSimpleString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionSimpleString"


    // $ANTLR start "ruleExpresionSimpleString"
    // InternalPole.g:2279:1: ruleExpresionSimpleString returns [EObject current=null] : ( (lv_x_0_0= RULE_STRING ) ) ;
    public final EObject ruleExpresionSimpleString() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;


        	enterRule();

        try {
            // InternalPole.g:2285:2: ( ( (lv_x_0_0= RULE_STRING ) ) )
            // InternalPole.g:2286:2: ( (lv_x_0_0= RULE_STRING ) )
            {
            // InternalPole.g:2286:2: ( (lv_x_0_0= RULE_STRING ) )
            // InternalPole.g:2287:3: (lv_x_0_0= RULE_STRING )
            {
            // InternalPole.g:2287:3: (lv_x_0_0= RULE_STRING )
            // InternalPole.g:2288:4: lv_x_0_0= RULE_STRING
            {
            lv_x_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_x_0_0, grammarAccess.getExpresionSimpleStringAccess().getXSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExpresionSimpleStringRule());
            				}
            				setWithLastConsumed(
            					current,
            					"x",
            					lv_x_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionSimpleString"


    // $ANTLR start "entryRuleExpresionConcatenacion"
    // InternalPole.g:2307:1: entryRuleExpresionConcatenacion returns [EObject current=null] : iv_ruleExpresionConcatenacion= ruleExpresionConcatenacion EOF ;
    public final EObject entryRuleExpresionConcatenacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionConcatenacion = null;


        try {
            // InternalPole.g:2307:63: (iv_ruleExpresionConcatenacion= ruleExpresionConcatenacion EOF )
            // InternalPole.g:2308:2: iv_ruleExpresionConcatenacion= ruleExpresionConcatenacion EOF
            {
             newCompositeNode(grammarAccess.getExpresionConcatenacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionConcatenacion=ruleExpresionConcatenacion();

            state._fsp--;

             current =iv_ruleExpresionConcatenacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionConcatenacion"


    // $ANTLR start "ruleExpresionConcatenacion"
    // InternalPole.g:2314:1: ruleExpresionConcatenacion returns [EObject current=null] : (otherlv_0= 'LA' ( (lv_primero_1_0= ruleExpresion ) ) otherlv_2= 'GOTITA' ( (lv_segundo_3_0= ruleExpresion ) ) ) ;
    public final EObject ruleExpresionConcatenacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_primero_1_0 = null;

        EObject lv_segundo_3_0 = null;



        	enterRule();

        try {
            // InternalPole.g:2320:2: ( (otherlv_0= 'LA' ( (lv_primero_1_0= ruleExpresion ) ) otherlv_2= 'GOTITA' ( (lv_segundo_3_0= ruleExpresion ) ) ) )
            // InternalPole.g:2321:2: (otherlv_0= 'LA' ( (lv_primero_1_0= ruleExpresion ) ) otherlv_2= 'GOTITA' ( (lv_segundo_3_0= ruleExpresion ) ) )
            {
            // InternalPole.g:2321:2: (otherlv_0= 'LA' ( (lv_primero_1_0= ruleExpresion ) ) otherlv_2= 'GOTITA' ( (lv_segundo_3_0= ruleExpresion ) ) )
            // InternalPole.g:2322:3: otherlv_0= 'LA' ( (lv_primero_1_0= ruleExpresion ) ) otherlv_2= 'GOTITA' ( (lv_segundo_3_0= ruleExpresion ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getExpresionConcatenacionAccess().getLAKeyword_0());
            		
            // InternalPole.g:2326:3: ( (lv_primero_1_0= ruleExpresion ) )
            // InternalPole.g:2327:4: (lv_primero_1_0= ruleExpresion )
            {
            // InternalPole.g:2327:4: (lv_primero_1_0= ruleExpresion )
            // InternalPole.g:2328:5: lv_primero_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionConcatenacionAccess().getPrimeroExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_primero_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionConcatenacionRule());
            					}
            					set(
            						current,
            						"primero",
            						lv_primero_1_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,61,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getExpresionConcatenacionAccess().getGOTITAKeyword_2());
            		
            // InternalPole.g:2349:3: ( (lv_segundo_3_0= ruleExpresion ) )
            // InternalPole.g:2350:4: (lv_segundo_3_0= ruleExpresion )
            {
            // InternalPole.g:2350:4: (lv_segundo_3_0= ruleExpresion )
            // InternalPole.g:2351:5: lv_segundo_3_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionConcatenacionAccess().getSegundoExpresionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_segundo_3_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionConcatenacionRule());
            					}
            					set(
            						current,
            						"segundo",
            						lv_segundo_3_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionConcatenacion"


    // $ANTLR start "entryRuleExpresionBooleana"
    // InternalPole.g:2372:1: entryRuleExpresionBooleana returns [EObject current=null] : iv_ruleExpresionBooleana= ruleExpresionBooleana EOF ;
    public final EObject entryRuleExpresionBooleana() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionBooleana = null;


        try {
            // InternalPole.g:2372:58: (iv_ruleExpresionBooleana= ruleExpresionBooleana EOF )
            // InternalPole.g:2373:2: iv_ruleExpresionBooleana= ruleExpresionBooleana EOF
            {
             newCompositeNode(grammarAccess.getExpresionBooleanaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionBooleana=ruleExpresionBooleana();

            state._fsp--;

             current =iv_ruleExpresionBooleana; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionBooleana"


    // $ANTLR start "ruleExpresionBooleana"
    // InternalPole.g:2379:1: ruleExpresionBooleana returns [EObject current=null] : (this_ExpresionOperacionesBooleanas_0= ruleExpresionOperacionesBooleanas | this_ExpresionBooleanaSimple_1= ruleExpresionBooleanaSimple ) ;
    public final EObject ruleExpresionBooleana() throws RecognitionException {
        EObject current = null;

        EObject this_ExpresionOperacionesBooleanas_0 = null;

        EObject this_ExpresionBooleanaSimple_1 = null;



        	enterRule();

        try {
            // InternalPole.g:2385:2: ( (this_ExpresionOperacionesBooleanas_0= ruleExpresionOperacionesBooleanas | this_ExpresionBooleanaSimple_1= ruleExpresionBooleanaSimple ) )
            // InternalPole.g:2386:2: (this_ExpresionOperacionesBooleanas_0= ruleExpresionOperacionesBooleanas | this_ExpresionBooleanaSimple_1= ruleExpresionBooleanaSimple )
            {
            // InternalPole.g:2386:2: (this_ExpresionOperacionesBooleanas_0= ruleExpresionOperacionesBooleanas | this_ExpresionBooleanaSimple_1= ruleExpresionBooleanaSimple )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=62 && LA28_0<=63)||(LA28_0>=66 && LA28_0<=69)||(LA28_0>=73 && LA28_0<=77)) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=79 && LA28_0<=80)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalPole.g:2387:3: this_ExpresionOperacionesBooleanas_0= ruleExpresionOperacionesBooleanas
                    {

                    			newCompositeNode(grammarAccess.getExpresionBooleanaAccess().getExpresionOperacionesBooleanasParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionOperacionesBooleanas_0=ruleExpresionOperacionesBooleanas();

                    state._fsp--;


                    			current = this_ExpresionOperacionesBooleanas_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPole.g:2396:3: this_ExpresionBooleanaSimple_1= ruleExpresionBooleanaSimple
                    {

                    			newCompositeNode(grammarAccess.getExpresionBooleanaAccess().getExpresionBooleanaSimpleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionBooleanaSimple_1=ruleExpresionBooleanaSimple();

                    state._fsp--;


                    			current = this_ExpresionBooleanaSimple_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionBooleana"


    // $ANTLR start "entryRuleExpresionOperacionesBooleanas"
    // InternalPole.g:2408:1: entryRuleExpresionOperacionesBooleanas returns [EObject current=null] : iv_ruleExpresionOperacionesBooleanas= ruleExpresionOperacionesBooleanas EOF ;
    public final EObject entryRuleExpresionOperacionesBooleanas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionOperacionesBooleanas = null;


        try {
            // InternalPole.g:2408:70: (iv_ruleExpresionOperacionesBooleanas= ruleExpresionOperacionesBooleanas EOF )
            // InternalPole.g:2409:2: iv_ruleExpresionOperacionesBooleanas= ruleExpresionOperacionesBooleanas EOF
            {
             newCompositeNode(grammarAccess.getExpresionOperacionesBooleanasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionOperacionesBooleanas=ruleExpresionOperacionesBooleanas();

            state._fsp--;

             current =iv_ruleExpresionOperacionesBooleanas; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionOperacionesBooleanas"


    // $ANTLR start "ruleExpresionOperacionesBooleanas"
    // InternalPole.g:2415:1: ruleExpresionOperacionesBooleanas returns [EObject current=null] : (this_OperacionesBooleanasDeComparacion_0= ruleOperacionesBooleanasDeComparacion | this_OperacionesBooleanasDeComparacionAritmetica_1= ruleOperacionesBooleanasDeComparacionAritmetica | this_OperadoresLogicosBooleanos_2= ruleOperadoresLogicosBooleanos | this_OpNEG_3= ruleOpNEG | this_ExpresionStringVacio_4= ruleExpresionStringVacio ) ;
    public final EObject ruleExpresionOperacionesBooleanas() throws RecognitionException {
        EObject current = null;

        EObject this_OperacionesBooleanasDeComparacion_0 = null;

        EObject this_OperacionesBooleanasDeComparacionAritmetica_1 = null;

        EObject this_OperadoresLogicosBooleanos_2 = null;

        EObject this_OpNEG_3 = null;

        EObject this_ExpresionStringVacio_4 = null;



        	enterRule();

        try {
            // InternalPole.g:2421:2: ( (this_OperacionesBooleanasDeComparacion_0= ruleOperacionesBooleanasDeComparacion | this_OperacionesBooleanasDeComparacionAritmetica_1= ruleOperacionesBooleanasDeComparacionAritmetica | this_OperadoresLogicosBooleanos_2= ruleOperadoresLogicosBooleanos | this_OpNEG_3= ruleOpNEG | this_ExpresionStringVacio_4= ruleExpresionStringVacio ) )
            // InternalPole.g:2422:2: (this_OperacionesBooleanasDeComparacion_0= ruleOperacionesBooleanasDeComparacion | this_OperacionesBooleanasDeComparacionAritmetica_1= ruleOperacionesBooleanasDeComparacionAritmetica | this_OperadoresLogicosBooleanos_2= ruleOperadoresLogicosBooleanos | this_OpNEG_3= ruleOpNEG | this_ExpresionStringVacio_4= ruleExpresionStringVacio )
            {
            // InternalPole.g:2422:2: (this_OperacionesBooleanasDeComparacion_0= ruleOperacionesBooleanasDeComparacion | this_OperacionesBooleanasDeComparacionAritmetica_1= ruleOperacionesBooleanasDeComparacionAritmetica | this_OperadoresLogicosBooleanos_2= ruleOperadoresLogicosBooleanos | this_OpNEG_3= ruleOpNEG | this_ExpresionStringVacio_4= ruleExpresionStringVacio )
            int alt29=5;
            switch ( input.LA(1) ) {
            case 62:
            case 63:
                {
                alt29=1;
                }
                break;
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt29=2;
                }
                break;
            case 67:
            case 68:
            case 69:
                {
                alt29=3;
                }
                break;
            case 77:
                {
                alt29=4;
                }
                break;
            case 66:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalPole.g:2423:3: this_OperacionesBooleanasDeComparacion_0= ruleOperacionesBooleanasDeComparacion
                    {

                    			newCompositeNode(grammarAccess.getExpresionOperacionesBooleanasAccess().getOperacionesBooleanasDeComparacionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperacionesBooleanasDeComparacion_0=ruleOperacionesBooleanasDeComparacion();

                    state._fsp--;


                    			current = this_OperacionesBooleanasDeComparacion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPole.g:2432:3: this_OperacionesBooleanasDeComparacionAritmetica_1= ruleOperacionesBooleanasDeComparacionAritmetica
                    {

                    			newCompositeNode(grammarAccess.getExpresionOperacionesBooleanasAccess().getOperacionesBooleanasDeComparacionAritmeticaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperacionesBooleanasDeComparacionAritmetica_1=ruleOperacionesBooleanasDeComparacionAritmetica();

                    state._fsp--;


                    			current = this_OperacionesBooleanasDeComparacionAritmetica_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPole.g:2441:3: this_OperadoresLogicosBooleanos_2= ruleOperadoresLogicosBooleanos
                    {

                    			newCompositeNode(grammarAccess.getExpresionOperacionesBooleanasAccess().getOperadoresLogicosBooleanosParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperadoresLogicosBooleanos_2=ruleOperadoresLogicosBooleanos();

                    state._fsp--;


                    			current = this_OperadoresLogicosBooleanos_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPole.g:2450:3: this_OpNEG_3= ruleOpNEG
                    {

                    			newCompositeNode(grammarAccess.getExpresionOperacionesBooleanasAccess().getOpNEGParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpNEG_3=ruleOpNEG();

                    state._fsp--;


                    			current = this_OpNEG_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPole.g:2459:3: this_ExpresionStringVacio_4= ruleExpresionStringVacio
                    {

                    			newCompositeNode(grammarAccess.getExpresionOperacionesBooleanasAccess().getExpresionStringVacioParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionStringVacio_4=ruleExpresionStringVacio();

                    state._fsp--;


                    			current = this_ExpresionStringVacio_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionOperacionesBooleanas"


    // $ANTLR start "entryRuleOperacionesBooleanasDeComparacion"
    // InternalPole.g:2471:1: entryRuleOperacionesBooleanasDeComparacion returns [EObject current=null] : iv_ruleOperacionesBooleanasDeComparacion= ruleOperacionesBooleanasDeComparacion EOF ;
    public final EObject entryRuleOperacionesBooleanasDeComparacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacionesBooleanasDeComparacion = null;


        try {
            // InternalPole.g:2471:74: (iv_ruleOperacionesBooleanasDeComparacion= ruleOperacionesBooleanasDeComparacion EOF )
            // InternalPole.g:2472:2: iv_ruleOperacionesBooleanasDeComparacion= ruleOperacionesBooleanasDeComparacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionesBooleanasDeComparacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperacionesBooleanasDeComparacion=ruleOperacionesBooleanasDeComparacion();

            state._fsp--;

             current =iv_ruleOperacionesBooleanasDeComparacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperacionesBooleanasDeComparacion"


    // $ANTLR start "ruleOperacionesBooleanasDeComparacion"
    // InternalPole.g:2478:1: ruleOperacionesBooleanasDeComparacion returns [EObject current=null] : ( ( ( (lv_x_0_1= 'POXI' | lv_x_0_2= 'AGUA' ) ) ) ( (lv_izq_1_0= ruleExpresion ) ) ( ( (lv_y_2_1= 'POL' | lv_y_2_2= 'RRAS' ) ) ) ( (lv_der_3_0= ruleExpresion ) ) ) ;
    public final EObject ruleOperacionesBooleanasDeComparacion() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_1=null;
        Token lv_x_0_2=null;
        Token lv_y_2_1=null;
        Token lv_y_2_2=null;
        EObject lv_izq_1_0 = null;

        EObject lv_der_3_0 = null;



        	enterRule();

        try {
            // InternalPole.g:2484:2: ( ( ( ( (lv_x_0_1= 'POXI' | lv_x_0_2= 'AGUA' ) ) ) ( (lv_izq_1_0= ruleExpresion ) ) ( ( (lv_y_2_1= 'POL' | lv_y_2_2= 'RRAS' ) ) ) ( (lv_der_3_0= ruleExpresion ) ) ) )
            // InternalPole.g:2485:2: ( ( ( (lv_x_0_1= 'POXI' | lv_x_0_2= 'AGUA' ) ) ) ( (lv_izq_1_0= ruleExpresion ) ) ( ( (lv_y_2_1= 'POL' | lv_y_2_2= 'RRAS' ) ) ) ( (lv_der_3_0= ruleExpresion ) ) )
            {
            // InternalPole.g:2485:2: ( ( ( (lv_x_0_1= 'POXI' | lv_x_0_2= 'AGUA' ) ) ) ( (lv_izq_1_0= ruleExpresion ) ) ( ( (lv_y_2_1= 'POL' | lv_y_2_2= 'RRAS' ) ) ) ( (lv_der_3_0= ruleExpresion ) ) )
            // InternalPole.g:2486:3: ( ( (lv_x_0_1= 'POXI' | lv_x_0_2= 'AGUA' ) ) ) ( (lv_izq_1_0= ruleExpresion ) ) ( ( (lv_y_2_1= 'POL' | lv_y_2_2= 'RRAS' ) ) ) ( (lv_der_3_0= ruleExpresion ) )
            {
            // InternalPole.g:2486:3: ( ( (lv_x_0_1= 'POXI' | lv_x_0_2= 'AGUA' ) ) )
            // InternalPole.g:2487:4: ( (lv_x_0_1= 'POXI' | lv_x_0_2= 'AGUA' ) )
            {
            // InternalPole.g:2487:4: ( (lv_x_0_1= 'POXI' | lv_x_0_2= 'AGUA' ) )
            // InternalPole.g:2488:5: (lv_x_0_1= 'POXI' | lv_x_0_2= 'AGUA' )
            {
            // InternalPole.g:2488:5: (lv_x_0_1= 'POXI' | lv_x_0_2= 'AGUA' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==62) ) {
                alt30=1;
            }
            else if ( (LA30_0==63) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalPole.g:2489:6: lv_x_0_1= 'POXI'
                    {
                    lv_x_0_1=(Token)match(input,62,FOLLOW_10); 

                    						newLeafNode(lv_x_0_1, grammarAccess.getOperacionesBooleanasDeComparacionAccess().getXPOXIKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperacionesBooleanasDeComparacionRule());
                    						}
                    						setWithLastConsumed(current, "x", lv_x_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalPole.g:2500:6: lv_x_0_2= 'AGUA'
                    {
                    lv_x_0_2=(Token)match(input,63,FOLLOW_10); 

                    						newLeafNode(lv_x_0_2, grammarAccess.getOperacionesBooleanasDeComparacionAccess().getXAGUAKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperacionesBooleanasDeComparacionRule());
                    						}
                    						setWithLastConsumed(current, "x", lv_x_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalPole.g:2513:3: ( (lv_izq_1_0= ruleExpresion ) )
            // InternalPole.g:2514:4: (lv_izq_1_0= ruleExpresion )
            {
            // InternalPole.g:2514:4: (lv_izq_1_0= ruleExpresion )
            // InternalPole.g:2515:5: lv_izq_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getOperacionesBooleanasDeComparacionAccess().getIzqExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_izq_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperacionesBooleanasDeComparacionRule());
            					}
            					set(
            						current,
            						"izq",
            						lv_izq_1_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPole.g:2532:3: ( ( (lv_y_2_1= 'POL' | lv_y_2_2= 'RRAS' ) ) )
            // InternalPole.g:2533:4: ( (lv_y_2_1= 'POL' | lv_y_2_2= 'RRAS' ) )
            {
            // InternalPole.g:2533:4: ( (lv_y_2_1= 'POL' | lv_y_2_2= 'RRAS' ) )
            // InternalPole.g:2534:5: (lv_y_2_1= 'POL' | lv_y_2_2= 'RRAS' )
            {
            // InternalPole.g:2534:5: (lv_y_2_1= 'POL' | lv_y_2_2= 'RRAS' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==64) ) {
                alt31=1;
            }
            else if ( (LA31_0==65) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalPole.g:2535:6: lv_y_2_1= 'POL'
                    {
                    lv_y_2_1=(Token)match(input,64,FOLLOW_10); 

                    						newLeafNode(lv_y_2_1, grammarAccess.getOperacionesBooleanasDeComparacionAccess().getYPOLKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperacionesBooleanasDeComparacionRule());
                    						}
                    						setWithLastConsumed(current, "y", lv_y_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalPole.g:2546:6: lv_y_2_2= 'RRAS'
                    {
                    lv_y_2_2=(Token)match(input,65,FOLLOW_10); 

                    						newLeafNode(lv_y_2_2, grammarAccess.getOperacionesBooleanasDeComparacionAccess().getYRRASKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperacionesBooleanasDeComparacionRule());
                    						}
                    						setWithLastConsumed(current, "y", lv_y_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalPole.g:2559:3: ( (lv_der_3_0= ruleExpresion ) )
            // InternalPole.g:2560:4: (lv_der_3_0= ruleExpresion )
            {
            // InternalPole.g:2560:4: (lv_der_3_0= ruleExpresion )
            // InternalPole.g:2561:5: lv_der_3_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getOperacionesBooleanasDeComparacionAccess().getDerExpresionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_der_3_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperacionesBooleanasDeComparacionRule());
            					}
            					set(
            						current,
            						"der",
            						lv_der_3_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperacionesBooleanasDeComparacion"


    // $ANTLR start "entryRuleExpresionStringVacio"
    // InternalPole.g:2582:1: entryRuleExpresionStringVacio returns [EObject current=null] : iv_ruleExpresionStringVacio= ruleExpresionStringVacio EOF ;
    public final EObject entryRuleExpresionStringVacio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionStringVacio = null;


        try {
            // InternalPole.g:2582:61: (iv_ruleExpresionStringVacio= ruleExpresionStringVacio EOF )
            // InternalPole.g:2583:2: iv_ruleExpresionStringVacio= ruleExpresionStringVacio EOF
            {
             newCompositeNode(grammarAccess.getExpresionStringVacioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionStringVacio=ruleExpresionStringVacio();

            state._fsp--;

             current =iv_ruleExpresionStringVacio; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionStringVacio"


    // $ANTLR start "ruleExpresionStringVacio"
    // InternalPole.g:2589:1: ruleExpresionStringVacio returns [EObject current=null] : (otherlv_0= 'MIBILLETERA' ( (lv_llamado_1_0= ruleExpresion ) ) ) ;
    public final EObject ruleExpresionStringVacio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_llamado_1_0 = null;



        	enterRule();

        try {
            // InternalPole.g:2595:2: ( (otherlv_0= 'MIBILLETERA' ( (lv_llamado_1_0= ruleExpresion ) ) ) )
            // InternalPole.g:2596:2: (otherlv_0= 'MIBILLETERA' ( (lv_llamado_1_0= ruleExpresion ) ) )
            {
            // InternalPole.g:2596:2: (otherlv_0= 'MIBILLETERA' ( (lv_llamado_1_0= ruleExpresion ) ) )
            // InternalPole.g:2597:3: otherlv_0= 'MIBILLETERA' ( (lv_llamado_1_0= ruleExpresion ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getExpresionStringVacioAccess().getMIBILLETERAKeyword_0());
            		
            // InternalPole.g:2601:3: ( (lv_llamado_1_0= ruleExpresion ) )
            // InternalPole.g:2602:4: (lv_llamado_1_0= ruleExpresion )
            {
            // InternalPole.g:2602:4: (lv_llamado_1_0= ruleExpresion )
            // InternalPole.g:2603:5: lv_llamado_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionStringVacioAccess().getLlamadoExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_llamado_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionStringVacioRule());
            					}
            					set(
            						current,
            						"llamado",
            						lv_llamado_1_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionStringVacio"


    // $ANTLR start "entryRuleOperadoresLogicosBooleanos"
    // InternalPole.g:2624:1: entryRuleOperadoresLogicosBooleanos returns [EObject current=null] : iv_ruleOperadoresLogicosBooleanos= ruleOperadoresLogicosBooleanos EOF ;
    public final EObject entryRuleOperadoresLogicosBooleanos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperadoresLogicosBooleanos = null;


        try {
            // InternalPole.g:2624:67: (iv_ruleOperadoresLogicosBooleanos= ruleOperadoresLogicosBooleanos EOF )
            // InternalPole.g:2625:2: iv_ruleOperadoresLogicosBooleanos= ruleOperadoresLogicosBooleanos EOF
            {
             newCompositeNode(grammarAccess.getOperadoresLogicosBooleanosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperadoresLogicosBooleanos=ruleOperadoresLogicosBooleanos();

            state._fsp--;

             current =iv_ruleOperadoresLogicosBooleanos; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperadoresLogicosBooleanos"


    // $ANTLR start "ruleOperadoresLogicosBooleanos"
    // InternalPole.g:2631:1: ruleOperadoresLogicosBooleanos returns [EObject current=null] : ( ( ( (lv_x_0_1= 'PEPE' | lv_x_0_2= 'NAR' | lv_x_0_3= 'XO' ) ) ) ( (lv_izq_1_0= ruleExpresion ) ) ( ( (lv_y_2_1= 'PANDA' | lv_y_2_2= 'ANJA' | lv_y_2_3= 'R' ) ) ) ( (lv_der_3_0= ruleExpresion ) ) ) ;
    public final EObject ruleOperadoresLogicosBooleanos() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_1=null;
        Token lv_x_0_2=null;
        Token lv_x_0_3=null;
        Token lv_y_2_1=null;
        Token lv_y_2_2=null;
        Token lv_y_2_3=null;
        EObject lv_izq_1_0 = null;

        EObject lv_der_3_0 = null;



        	enterRule();

        try {
            // InternalPole.g:2637:2: ( ( ( ( (lv_x_0_1= 'PEPE' | lv_x_0_2= 'NAR' | lv_x_0_3= 'XO' ) ) ) ( (lv_izq_1_0= ruleExpresion ) ) ( ( (lv_y_2_1= 'PANDA' | lv_y_2_2= 'ANJA' | lv_y_2_3= 'R' ) ) ) ( (lv_der_3_0= ruleExpresion ) ) ) )
            // InternalPole.g:2638:2: ( ( ( (lv_x_0_1= 'PEPE' | lv_x_0_2= 'NAR' | lv_x_0_3= 'XO' ) ) ) ( (lv_izq_1_0= ruleExpresion ) ) ( ( (lv_y_2_1= 'PANDA' | lv_y_2_2= 'ANJA' | lv_y_2_3= 'R' ) ) ) ( (lv_der_3_0= ruleExpresion ) ) )
            {
            // InternalPole.g:2638:2: ( ( ( (lv_x_0_1= 'PEPE' | lv_x_0_2= 'NAR' | lv_x_0_3= 'XO' ) ) ) ( (lv_izq_1_0= ruleExpresion ) ) ( ( (lv_y_2_1= 'PANDA' | lv_y_2_2= 'ANJA' | lv_y_2_3= 'R' ) ) ) ( (lv_der_3_0= ruleExpresion ) ) )
            // InternalPole.g:2639:3: ( ( (lv_x_0_1= 'PEPE' | lv_x_0_2= 'NAR' | lv_x_0_3= 'XO' ) ) ) ( (lv_izq_1_0= ruleExpresion ) ) ( ( (lv_y_2_1= 'PANDA' | lv_y_2_2= 'ANJA' | lv_y_2_3= 'R' ) ) ) ( (lv_der_3_0= ruleExpresion ) )
            {
            // InternalPole.g:2639:3: ( ( (lv_x_0_1= 'PEPE' | lv_x_0_2= 'NAR' | lv_x_0_3= 'XO' ) ) )
            // InternalPole.g:2640:4: ( (lv_x_0_1= 'PEPE' | lv_x_0_2= 'NAR' | lv_x_0_3= 'XO' ) )
            {
            // InternalPole.g:2640:4: ( (lv_x_0_1= 'PEPE' | lv_x_0_2= 'NAR' | lv_x_0_3= 'XO' ) )
            // InternalPole.g:2641:5: (lv_x_0_1= 'PEPE' | lv_x_0_2= 'NAR' | lv_x_0_3= 'XO' )
            {
            // InternalPole.g:2641:5: (lv_x_0_1= 'PEPE' | lv_x_0_2= 'NAR' | lv_x_0_3= 'XO' )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt32=1;
                }
                break;
            case 68:
                {
                alt32=2;
                }
                break;
            case 69:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalPole.g:2642:6: lv_x_0_1= 'PEPE'
                    {
                    lv_x_0_1=(Token)match(input,67,FOLLOW_10); 

                    						newLeafNode(lv_x_0_1, grammarAccess.getOperadoresLogicosBooleanosAccess().getXPEPEKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperadoresLogicosBooleanosRule());
                    						}
                    						setWithLastConsumed(current, "x", lv_x_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalPole.g:2653:6: lv_x_0_2= 'NAR'
                    {
                    lv_x_0_2=(Token)match(input,68,FOLLOW_10); 

                    						newLeafNode(lv_x_0_2, grammarAccess.getOperadoresLogicosBooleanosAccess().getXNARKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperadoresLogicosBooleanosRule());
                    						}
                    						setWithLastConsumed(current, "x", lv_x_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalPole.g:2664:6: lv_x_0_3= 'XO'
                    {
                    lv_x_0_3=(Token)match(input,69,FOLLOW_10); 

                    						newLeafNode(lv_x_0_3, grammarAccess.getOperadoresLogicosBooleanosAccess().getXXOKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperadoresLogicosBooleanosRule());
                    						}
                    						setWithLastConsumed(current, "x", lv_x_0_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalPole.g:2677:3: ( (lv_izq_1_0= ruleExpresion ) )
            // InternalPole.g:2678:4: (lv_izq_1_0= ruleExpresion )
            {
            // InternalPole.g:2678:4: (lv_izq_1_0= ruleExpresion )
            // InternalPole.g:2679:5: lv_izq_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getOperadoresLogicosBooleanosAccess().getIzqExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_izq_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperadoresLogicosBooleanosRule());
            					}
            					set(
            						current,
            						"izq",
            						lv_izq_1_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPole.g:2696:3: ( ( (lv_y_2_1= 'PANDA' | lv_y_2_2= 'ANJA' | lv_y_2_3= 'R' ) ) )
            // InternalPole.g:2697:4: ( (lv_y_2_1= 'PANDA' | lv_y_2_2= 'ANJA' | lv_y_2_3= 'R' ) )
            {
            // InternalPole.g:2697:4: ( (lv_y_2_1= 'PANDA' | lv_y_2_2= 'ANJA' | lv_y_2_3= 'R' ) )
            // InternalPole.g:2698:5: (lv_y_2_1= 'PANDA' | lv_y_2_2= 'ANJA' | lv_y_2_3= 'R' )
            {
            // InternalPole.g:2698:5: (lv_y_2_1= 'PANDA' | lv_y_2_2= 'ANJA' | lv_y_2_3= 'R' )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt33=1;
                }
                break;
            case 71:
                {
                alt33=2;
                }
                break;
            case 72:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalPole.g:2699:6: lv_y_2_1= 'PANDA'
                    {
                    lv_y_2_1=(Token)match(input,70,FOLLOW_10); 

                    						newLeafNode(lv_y_2_1, grammarAccess.getOperadoresLogicosBooleanosAccess().getYPANDAKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperadoresLogicosBooleanosRule());
                    						}
                    						setWithLastConsumed(current, "y", lv_y_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalPole.g:2710:6: lv_y_2_2= 'ANJA'
                    {
                    lv_y_2_2=(Token)match(input,71,FOLLOW_10); 

                    						newLeafNode(lv_y_2_2, grammarAccess.getOperadoresLogicosBooleanosAccess().getYANJAKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperadoresLogicosBooleanosRule());
                    						}
                    						setWithLastConsumed(current, "y", lv_y_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalPole.g:2721:6: lv_y_2_3= 'R'
                    {
                    lv_y_2_3=(Token)match(input,72,FOLLOW_10); 

                    						newLeafNode(lv_y_2_3, grammarAccess.getOperadoresLogicosBooleanosAccess().getYRKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperadoresLogicosBooleanosRule());
                    						}
                    						setWithLastConsumed(current, "y", lv_y_2_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalPole.g:2734:3: ( (lv_der_3_0= ruleExpresion ) )
            // InternalPole.g:2735:4: (lv_der_3_0= ruleExpresion )
            {
            // InternalPole.g:2735:4: (lv_der_3_0= ruleExpresion )
            // InternalPole.g:2736:5: lv_der_3_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getOperadoresLogicosBooleanosAccess().getDerExpresionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_der_3_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperadoresLogicosBooleanosRule());
            					}
            					set(
            						current,
            						"der",
            						lv_der_3_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperadoresLogicosBooleanos"


    // $ANTLR start "entryRuleOperacionesBooleanasDeComparacionAritmetica"
    // InternalPole.g:2757:1: entryRuleOperacionesBooleanasDeComparacionAritmetica returns [EObject current=null] : iv_ruleOperacionesBooleanasDeComparacionAritmetica= ruleOperacionesBooleanasDeComparacionAritmetica EOF ;
    public final EObject entryRuleOperacionesBooleanasDeComparacionAritmetica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacionesBooleanasDeComparacionAritmetica = null;


        try {
            // InternalPole.g:2757:84: (iv_ruleOperacionesBooleanasDeComparacionAritmetica= ruleOperacionesBooleanasDeComparacionAritmetica EOF )
            // InternalPole.g:2758:2: iv_ruleOperacionesBooleanasDeComparacionAritmetica= ruleOperacionesBooleanasDeComparacionAritmetica EOF
            {
             newCompositeNode(grammarAccess.getOperacionesBooleanasDeComparacionAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperacionesBooleanasDeComparacionAritmetica=ruleOperacionesBooleanasDeComparacionAritmetica();

            state._fsp--;

             current =iv_ruleOperacionesBooleanasDeComparacionAritmetica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperacionesBooleanasDeComparacionAritmetica"


    // $ANTLR start "ruleOperacionesBooleanasDeComparacionAritmetica"
    // InternalPole.g:2764:1: ruleOperacionesBooleanasDeComparacionAritmetica returns [EObject current=null] : ( ( ( (lv_x_0_1= 'LEGAL' | lv_x_0_2= 'ILEGAL' | lv_x_0_3= 'ALEGAL' | lv_x_0_4= 'ANTILEGAL' ) ) ) ( (lv_op_1_0= ruleOpComp ) ) ) ;
    public final EObject ruleOperacionesBooleanasDeComparacionAritmetica() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_1=null;
        Token lv_x_0_2=null;
        Token lv_x_0_3=null;
        Token lv_x_0_4=null;
        EObject lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalPole.g:2770:2: ( ( ( ( (lv_x_0_1= 'LEGAL' | lv_x_0_2= 'ILEGAL' | lv_x_0_3= 'ALEGAL' | lv_x_0_4= 'ANTILEGAL' ) ) ) ( (lv_op_1_0= ruleOpComp ) ) ) )
            // InternalPole.g:2771:2: ( ( ( (lv_x_0_1= 'LEGAL' | lv_x_0_2= 'ILEGAL' | lv_x_0_3= 'ALEGAL' | lv_x_0_4= 'ANTILEGAL' ) ) ) ( (lv_op_1_0= ruleOpComp ) ) )
            {
            // InternalPole.g:2771:2: ( ( ( (lv_x_0_1= 'LEGAL' | lv_x_0_2= 'ILEGAL' | lv_x_0_3= 'ALEGAL' | lv_x_0_4= 'ANTILEGAL' ) ) ) ( (lv_op_1_0= ruleOpComp ) ) )
            // InternalPole.g:2772:3: ( ( (lv_x_0_1= 'LEGAL' | lv_x_0_2= 'ILEGAL' | lv_x_0_3= 'ALEGAL' | lv_x_0_4= 'ANTILEGAL' ) ) ) ( (lv_op_1_0= ruleOpComp ) )
            {
            // InternalPole.g:2772:3: ( ( (lv_x_0_1= 'LEGAL' | lv_x_0_2= 'ILEGAL' | lv_x_0_3= 'ALEGAL' | lv_x_0_4= 'ANTILEGAL' ) ) )
            // InternalPole.g:2773:4: ( (lv_x_0_1= 'LEGAL' | lv_x_0_2= 'ILEGAL' | lv_x_0_3= 'ALEGAL' | lv_x_0_4= 'ANTILEGAL' ) )
            {
            // InternalPole.g:2773:4: ( (lv_x_0_1= 'LEGAL' | lv_x_0_2= 'ILEGAL' | lv_x_0_3= 'ALEGAL' | lv_x_0_4= 'ANTILEGAL' ) )
            // InternalPole.g:2774:5: (lv_x_0_1= 'LEGAL' | lv_x_0_2= 'ILEGAL' | lv_x_0_3= 'ALEGAL' | lv_x_0_4= 'ANTILEGAL' )
            {
            // InternalPole.g:2774:5: (lv_x_0_1= 'LEGAL' | lv_x_0_2= 'ILEGAL' | lv_x_0_3= 'ALEGAL' | lv_x_0_4= 'ANTILEGAL' )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt34=1;
                }
                break;
            case 74:
                {
                alt34=2;
                }
                break;
            case 75:
                {
                alt34=3;
                }
                break;
            case 76:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalPole.g:2775:6: lv_x_0_1= 'LEGAL'
                    {
                    lv_x_0_1=(Token)match(input,73,FOLLOW_10); 

                    						newLeafNode(lv_x_0_1, grammarAccess.getOperacionesBooleanasDeComparacionAritmeticaAccess().getXLEGALKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperacionesBooleanasDeComparacionAritmeticaRule());
                    						}
                    						setWithLastConsumed(current, "x", lv_x_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalPole.g:2786:6: lv_x_0_2= 'ILEGAL'
                    {
                    lv_x_0_2=(Token)match(input,74,FOLLOW_10); 

                    						newLeafNode(lv_x_0_2, grammarAccess.getOperacionesBooleanasDeComparacionAritmeticaAccess().getXILEGALKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperacionesBooleanasDeComparacionAritmeticaRule());
                    						}
                    						setWithLastConsumed(current, "x", lv_x_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalPole.g:2797:6: lv_x_0_3= 'ALEGAL'
                    {
                    lv_x_0_3=(Token)match(input,75,FOLLOW_10); 

                    						newLeafNode(lv_x_0_3, grammarAccess.getOperacionesBooleanasDeComparacionAritmeticaAccess().getXALEGALKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperacionesBooleanasDeComparacionAritmeticaRule());
                    						}
                    						setWithLastConsumed(current, "x", lv_x_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalPole.g:2808:6: lv_x_0_4= 'ANTILEGAL'
                    {
                    lv_x_0_4=(Token)match(input,76,FOLLOW_10); 

                    						newLeafNode(lv_x_0_4, grammarAccess.getOperacionesBooleanasDeComparacionAritmeticaAccess().getXANTILEGALKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperacionesBooleanasDeComparacionAritmeticaRule());
                    						}
                    						setWithLastConsumed(current, "x", lv_x_0_4, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalPole.g:2821:3: ( (lv_op_1_0= ruleOpComp ) )
            // InternalPole.g:2822:4: (lv_op_1_0= ruleOpComp )
            {
            // InternalPole.g:2822:4: (lv_op_1_0= ruleOpComp )
            // InternalPole.g:2823:5: lv_op_1_0= ruleOpComp
            {

            					newCompositeNode(grammarAccess.getOperacionesBooleanasDeComparacionAritmeticaAccess().getOpOpCompParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_op_1_0=ruleOpComp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperacionesBooleanasDeComparacionAritmeticaRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"edu.upb.lp.isc.Pole.OpComp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperacionesBooleanasDeComparacionAritmetica"


    // $ANTLR start "entryRuleOpNEG"
    // InternalPole.g:2844:1: entryRuleOpNEG returns [EObject current=null] : iv_ruleOpNEG= ruleOpNEG EOF ;
    public final EObject entryRuleOpNEG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpNEG = null;


        try {
            // InternalPole.g:2844:46: (iv_ruleOpNEG= ruleOpNEG EOF )
            // InternalPole.g:2845:2: iv_ruleOpNEG= ruleOpNEG EOF
            {
             newCompositeNode(grammarAccess.getOpNEGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpNEG=ruleOpNEG();

            state._fsp--;

             current =iv_ruleOpNEG; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpNEG"


    // $ANTLR start "ruleOpNEG"
    // InternalPole.g:2851:1: ruleOpNEG returns [EObject current=null] : (otherlv_0= 'ALVERRES' ( (lv_expr_1_0= ruleExpresion ) ) ) ;
    public final EObject ruleOpNEG() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalPole.g:2857:2: ( (otherlv_0= 'ALVERRES' ( (lv_expr_1_0= ruleExpresion ) ) ) )
            // InternalPole.g:2858:2: (otherlv_0= 'ALVERRES' ( (lv_expr_1_0= ruleExpresion ) ) )
            {
            // InternalPole.g:2858:2: (otherlv_0= 'ALVERRES' ( (lv_expr_1_0= ruleExpresion ) ) )
            // InternalPole.g:2859:3: otherlv_0= 'ALVERRES' ( (lv_expr_1_0= ruleExpresion ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getOpNEGAccess().getALVERRESKeyword_0());
            		
            // InternalPole.g:2863:3: ( (lv_expr_1_0= ruleExpresion ) )
            // InternalPole.g:2864:4: (lv_expr_1_0= ruleExpresion )
            {
            // InternalPole.g:2864:4: (lv_expr_1_0= ruleExpresion )
            // InternalPole.g:2865:5: lv_expr_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getOpNEGAccess().getExprExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpNEGRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpNEG"


    // $ANTLR start "entryRuleOpComp"
    // InternalPole.g:2886:1: entryRuleOpComp returns [EObject current=null] : iv_ruleOpComp= ruleOpComp EOF ;
    public final EObject entryRuleOpComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpComp = null;


        try {
            // InternalPole.g:2886:47: (iv_ruleOpComp= ruleOpComp EOF )
            // InternalPole.g:2887:2: iv_ruleOpComp= ruleOpComp EOF
            {
             newCompositeNode(grammarAccess.getOpCompRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpComp=ruleOpComp();

            state._fsp--;

             current =iv_ruleOpComp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpComp"


    // $ANTLR start "ruleOpComp"
    // InternalPole.g:2893:1: ruleOpComp returns [EObject current=null] : ( ( (lv_izq_0_0= ruleExpresion ) ) otherlv_1= 'CON' ( (lv_der_2_0= ruleExpresion ) ) ) ;
    public final EObject ruleOpComp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_izq_0_0 = null;

        EObject lv_der_2_0 = null;



        	enterRule();

        try {
            // InternalPole.g:2899:2: ( ( ( (lv_izq_0_0= ruleExpresion ) ) otherlv_1= 'CON' ( (lv_der_2_0= ruleExpresion ) ) ) )
            // InternalPole.g:2900:2: ( ( (lv_izq_0_0= ruleExpresion ) ) otherlv_1= 'CON' ( (lv_der_2_0= ruleExpresion ) ) )
            {
            // InternalPole.g:2900:2: ( ( (lv_izq_0_0= ruleExpresion ) ) otherlv_1= 'CON' ( (lv_der_2_0= ruleExpresion ) ) )
            // InternalPole.g:2901:3: ( (lv_izq_0_0= ruleExpresion ) ) otherlv_1= 'CON' ( (lv_der_2_0= ruleExpresion ) )
            {
            // InternalPole.g:2901:3: ( (lv_izq_0_0= ruleExpresion ) )
            // InternalPole.g:2902:4: (lv_izq_0_0= ruleExpresion )
            {
            // InternalPole.g:2902:4: (lv_izq_0_0= ruleExpresion )
            // InternalPole.g:2903:5: lv_izq_0_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getOpCompAccess().getIzqExpresionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
            lv_izq_0_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpCompRule());
            					}
            					set(
            						current,
            						"izq",
            						lv_izq_0_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,78,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getOpCompAccess().getCONKeyword_1());
            		
            // InternalPole.g:2924:3: ( (lv_der_2_0= ruleExpresion ) )
            // InternalPole.g:2925:4: (lv_der_2_0= ruleExpresion )
            {
            // InternalPole.g:2925:4: (lv_der_2_0= ruleExpresion )
            // InternalPole.g:2926:5: lv_der_2_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getOpCompAccess().getDerExpresionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_der_2_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpCompRule());
            					}
            					set(
            						current,
            						"der",
            						lv_der_2_0,
            						"edu.upb.lp.isc.Pole.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpComp"


    // $ANTLR start "entryRuleExpresionBooleanaSimple"
    // InternalPole.g:2947:1: entryRuleExpresionBooleanaSimple returns [EObject current=null] : iv_ruleExpresionBooleanaSimple= ruleExpresionBooleanaSimple EOF ;
    public final EObject entryRuleExpresionBooleanaSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionBooleanaSimple = null;


        try {
            // InternalPole.g:2947:64: (iv_ruleExpresionBooleanaSimple= ruleExpresionBooleanaSimple EOF )
            // InternalPole.g:2948:2: iv_ruleExpresionBooleanaSimple= ruleExpresionBooleanaSimple EOF
            {
             newCompositeNode(grammarAccess.getExpresionBooleanaSimpleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionBooleanaSimple=ruleExpresionBooleanaSimple();

            state._fsp--;

             current =iv_ruleExpresionBooleanaSimple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionBooleanaSimple"


    // $ANTLR start "ruleExpresionBooleanaSimple"
    // InternalPole.g:2954:1: ruleExpresionBooleanaSimple returns [EObject current=null] : ( ( (lv_x_0_1= 'YIN' | lv_x_0_2= 'YANG' ) ) ) ;
    public final EObject ruleExpresionBooleanaSimple() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_1=null;
        Token lv_x_0_2=null;


        	enterRule();

        try {
            // InternalPole.g:2960:2: ( ( ( (lv_x_0_1= 'YIN' | lv_x_0_2= 'YANG' ) ) ) )
            // InternalPole.g:2961:2: ( ( (lv_x_0_1= 'YIN' | lv_x_0_2= 'YANG' ) ) )
            {
            // InternalPole.g:2961:2: ( ( (lv_x_0_1= 'YIN' | lv_x_0_2= 'YANG' ) ) )
            // InternalPole.g:2962:3: ( (lv_x_0_1= 'YIN' | lv_x_0_2= 'YANG' ) )
            {
            // InternalPole.g:2962:3: ( (lv_x_0_1= 'YIN' | lv_x_0_2= 'YANG' ) )
            // InternalPole.g:2963:4: (lv_x_0_1= 'YIN' | lv_x_0_2= 'YANG' )
            {
            // InternalPole.g:2963:4: (lv_x_0_1= 'YIN' | lv_x_0_2= 'YANG' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==79) ) {
                alt35=1;
            }
            else if ( (LA35_0==80) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalPole.g:2964:5: lv_x_0_1= 'YIN'
                    {
                    lv_x_0_1=(Token)match(input,79,FOLLOW_2); 

                    					newLeafNode(lv_x_0_1, grammarAccess.getExpresionBooleanaSimpleAccess().getXYINKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpresionBooleanaSimpleRule());
                    					}
                    					setWithLastConsumed(current, "x", lv_x_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalPole.g:2975:5: lv_x_0_2= 'YANG'
                    {
                    lv_x_0_2=(Token)match(input,80,FOLLOW_2); 

                    					newLeafNode(lv_x_0_2, grammarAccess.getExpresionBooleanaSimpleAccess().getXYANGKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpresionBooleanaSimpleRule());
                    					}
                    					setWithLastConsumed(current, "x", lv_x_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionBooleanaSimple"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\35\10\uffff";
    static final String dfa_3s = "\1\51\3\uffff\1\52\10\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\7\1\10\1\12\1\13\1\4\1\11";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\10\uffff\1\11\3\uffff\1\10\3\uffff\1\2\1\uffff\1\12\1\3\7\uffff\1\5\3\uffff\1\6\2\uffff\1\7\1\uffff\1\1",
            "",
            "",
            "",
            "\1\13\14\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "178:2: (this_DeclVariables_0= ruleDeclVariables | this_Imprimir_1= ruleImprimir | this_Condicional_2= ruleCondicional | this_Switch_3= ruleSwitch | this_For_4= ruleFor | this_While_5= ruleWhile | this_DoWhile_6= ruleDoWhile | this_Funciones_7= ruleFunciones | this_AsignacionVariable_8= ruleAsignacionVariable | this_LlamadoMetodo_9= ruleLlamadoMetodo | this_ImprimirSinSaltoDeLinea_10= ruleImprimirSinSaltoDeLinea )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000029101A22010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000029101A22012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xD3F1000000002070L,0x000000000001BE3CL});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000F80000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000029101BE2010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000029101BA2010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000002911DA22010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000029109A22010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xC000000000000000L,0x000000000001BE3CL});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000029901A22010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000002D101A22010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000039101A22010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});

}