package org.johnf.mydsl2.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.johnf.mydsl2.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DATE", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'workspace'", "';'", "'description'", "'system'", "'{'", "'}'", "'import'", "'.'", "'entity'", "':'", "'['", "','", "'*'", "']'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_DATE=7;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=11;
    public static final int RULE_DECIMAL=8;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_dataTypes_6_0= ruleEntity ) )* ( (lv_systems_7_0= ruleSystem ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        EObject lv_dataTypes_6_0 = null;

        EObject lv_systems_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_dataTypes_6_0= ruleEntity ) )* ( (lv_systems_7_0= ruleSystem ) )* ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_dataTypes_6_0= ruleEntity ) )* ( (lv_systems_7_0= ruleSystem ) )* )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_dataTypes_6_0= ruleEntity ) )* ( (lv_systems_7_0= ruleSystem ) )* )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_dataTypes_6_0= ruleEntity ) )* ( (lv_systems_7_0= ruleSystem ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getWorkspaceKeyword_0());
                
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleModel156); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getSemicolonKeyword_2());
                
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:106:1: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:106:3: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleModel169); 

                        	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getDescriptionKeyword_3_0());
                        
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:110:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:111:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:111:1: (lv_description_4_0= RULE_STRING )
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:112:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModel186); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getModelAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleModel203); 

                        	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:132:3: ( (lv_dataTypes_6_0= ruleEntity ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:133:1: (lv_dataTypes_6_0= ruleEntity )
            	    {
            	    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:133:1: (lv_dataTypes_6_0= ruleEntity )
            	    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:134:3: lv_dataTypes_6_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDataTypesEntityParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleModel226);
            	    lv_dataTypes_6_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dataTypes",
            	            		lv_dataTypes_6_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:150:3: ( (lv_systems_7_0= ruleSystem ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:151:1: (lv_systems_7_0= ruleSystem )
            	    {
            	    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:151:1: (lv_systems_7_0= ruleSystem )
            	    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:152:3: lv_systems_7_0= ruleSystem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getSystemsSystemParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSystem_in_ruleModel248);
            	    lv_systems_7_0=ruleSystem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"systems",
            	            		lv_systems_7_0, 
            	            		"System");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSystem"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:176:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:177:2: (iv_ruleSystem= ruleSystem EOF )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:178:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem285);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem295); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:185:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_imports_6_0= ruleDefinitionImport ) )* ( (lv_dataTypes_7_0= ruleEntity ) )* otherlv_8= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_imports_6_0 = null;

        EObject lv_dataTypes_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:188:28: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_imports_6_0= ruleDefinitionImport ) )* ( (lv_dataTypes_7_0= ruleEntity ) )* otherlv_8= '}' ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:189:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_imports_6_0= ruleDefinitionImport ) )* ( (lv_dataTypes_7_0= ruleEntity ) )* otherlv_8= '}' )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:189:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_imports_6_0= ruleDefinitionImport ) )* ( (lv_dataTypes_7_0= ruleEntity ) )* otherlv_8= '}' )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:189:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_imports_6_0= ruleDefinitionImport ) )* ( (lv_dataTypes_7_0= ruleEntity ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSystem332); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:193:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:194:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:194:1: (lv_name_1_0= RULE_ID )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:195:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem349); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSystem366); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:215:1: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:215:3: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSystem379); 

                        	newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getDescriptionKeyword_3_0());
                        
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:219:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:220:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:220:1: (lv_description_4_0= RULE_STRING )
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:221:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystem396); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getSystemAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSystem413); 

                        	newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:241:3: ( (lv_imports_6_0= ruleDefinitionImport ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:242:1: (lv_imports_6_0= ruleDefinitionImport )
            	    {
            	    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:242:1: (lv_imports_6_0= ruleDefinitionImport )
            	    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:243:3: lv_imports_6_0= ruleDefinitionImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemAccess().getImportsDefinitionImportParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinitionImport_in_ruleSystem436);
            	    lv_imports_6_0=ruleDefinitionImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_6_0, 
            	            		"DefinitionImport");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:259:3: ( (lv_dataTypes_7_0= ruleEntity ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:260:1: (lv_dataTypes_7_0= ruleEntity )
            	    {
            	    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:260:1: (lv_dataTypes_7_0= ruleEntity )
            	    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:261:3: lv_dataTypes_7_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemAccess().getDataTypesEntityParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleSystem458);
            	    lv_dataTypes_7_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dataTypes",
            	            		lv_dataTypes_7_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleSystem471); 

                	newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleDefinitionImport"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:289:1: entryRuleDefinitionImport returns [EObject current=null] : iv_ruleDefinitionImport= ruleDefinitionImport EOF ;
    public final EObject entryRuleDefinitionImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionImport = null;


        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:290:2: (iv_ruleDefinitionImport= ruleDefinitionImport EOF )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:291:2: iv_ruleDefinitionImport= ruleDefinitionImport EOF
            {
             newCompositeNode(grammarAccess.getDefinitionImportRule()); 
            pushFollow(FOLLOW_ruleDefinitionImport_in_entryRuleDefinitionImport507);
            iv_ruleDefinitionImport=ruleDefinitionImport();

            state._fsp--;

             current =iv_ruleDefinitionImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionImport517); 

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
    // $ANTLR end "entryRuleDefinitionImport"


    // $ANTLR start "ruleDefinitionImport"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:298:1: ruleDefinitionImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ruleFQN ) ) otherlv_2= ';' ) ;
    public final EObject ruleDefinitionImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:301:28: ( (otherlv_0= 'import' ( ( ruleFQN ) ) otherlv_2= ';' ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:302:1: (otherlv_0= 'import' ( ( ruleFQN ) ) otherlv_2= ';' )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:302:1: (otherlv_0= 'import' ( ( ruleFQN ) ) otherlv_2= ';' )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:302:3: otherlv_0= 'import' ( ( ruleFQN ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleDefinitionImport554); 

                	newLeafNode(otherlv_0, grammarAccess.getDefinitionImportAccess().getImportKeyword_0());
                
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:306:1: ( ( ruleFQN ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:307:1: ( ruleFQN )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:307:1: ( ruleFQN )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:308:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDefinitionImportRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDefinitionImportAccess().getDefinitionDefinitionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleDefinitionImport577);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDefinitionImport589); 

                	newLeafNode(otherlv_2, grammarAccess.getDefinitionImportAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleDefinitionImport"


    // $ANTLR start "entryRuleDefinition"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:333:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:334:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:335:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition625);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition635); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:342:1: ruleDefinition returns [EObject current=null] : this_DataType_0= ruleDataType ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;


         enterRule(); 
            
        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:345:28: (this_DataType_0= ruleDataType )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:347:5: this_DataType_0= ruleDataType
            {
             
                    newCompositeNode(grammarAccess.getDefinitionAccess().getDataTypeParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleDataType_in_ruleDefinition681);
            this_DataType_0=ruleDataType();

            state._fsp--;

             
                    current = this_DataType_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleFQN"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:367:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:368:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:369:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN720);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN731); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:376:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:379:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:380:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:380:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:380:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN771); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:387:1: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:388:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleFQN790); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN805); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleDataType"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:408:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:409:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:410:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType852);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType862); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:417:1: ruleDataType returns [EObject current=null] : (this_BuiltInType_0= ruleBuiltInType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_BuiltInType_0 = null;

        EObject this_Entity_1 = null;


         enterRule(); 
            
        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:420:28: ( (this_BuiltInType_0= ruleBuiltInType | this_Entity_1= ruleEntity ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:421:1: (this_BuiltInType_0= ruleBuiltInType | this_Entity_1= ruleEntity )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:421:1: (this_BuiltInType_0= ruleBuiltInType | this_Entity_1= ruleEntity )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:422:5: this_BuiltInType_0= ruleBuiltInType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getBuiltInTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBuiltInType_in_ruleDataType909);
                    this_BuiltInType_0=ruleBuiltInType();

                    state._fsp--;

                     
                            current = this_BuiltInType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:432:5: this_Entity_1= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getEntityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleDataType936);
                    this_Entity_1=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_1; 
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:448:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:449:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:450:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity971);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity981); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:457:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_fields_6_0= ruleField ) )* otherlv_7= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_fields_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:460:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_fields_6_0= ruleField ) )* otherlv_7= '}' ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:461:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_fields_6_0= ruleField ) )* otherlv_7= '}' )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:461:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_fields_6_0= ruleField ) )* otherlv_7= '}' )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:461:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_fields_6_0= ruleField ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleEntity1018); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:465:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:466:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:466:1: (lv_name_1_0= RULE_ID )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:467:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1035); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleEntity1052); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:487:1: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:487:3: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEntity1065); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getDescriptionKeyword_3_0());
                        
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:491:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:492:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:492:1: (lv_description_4_0= RULE_STRING )
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:493:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity1082); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEntity1099); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:513:3: ( (lv_fields_6_0= ruleField ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:514:1: (lv_fields_6_0= ruleField )
            	    {
            	    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:514:1: (lv_fields_6_0= ruleField )
            	    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:515:3: lv_fields_6_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleEntity1122);
            	    lv_fields_6_0=ruleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_6_0, 
            	            		"Field");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleEntity1135); 

                	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleBuiltInType"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:543:1: entryRuleBuiltInType returns [EObject current=null] : iv_ruleBuiltInType= ruleBuiltInType EOF ;
    public final EObject entryRuleBuiltInType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInType = null;


        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:544:2: (iv_ruleBuiltInType= ruleBuiltInType EOF )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:545:2: iv_ruleBuiltInType= ruleBuiltInType EOF
            {
             newCompositeNode(grammarAccess.getBuiltInTypeRule()); 
            pushFollow(FOLLOW_ruleBuiltInType_in_entryRuleBuiltInType1171);
            iv_ruleBuiltInType=ruleBuiltInType();

            state._fsp--;

             current =iv_ruleBuiltInType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInType1181); 

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
    // $ANTLR end "entryRuleBuiltInType"


    // $ANTLR start "ruleBuiltInType"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:552:1: ruleBuiltInType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBuiltInType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;

         enterRule(); 
            
        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:555:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:556:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:556:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:556:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:556:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:557:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:557:1: (lv_name_0_0= RULE_ID )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:558:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBuiltInType1223); 

            			newLeafNode(lv_name_0_0, grammarAccess.getBuiltInTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBuiltInTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:574:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:575:1: (lv_description_1_0= RULE_STRING )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:575:1: (lv_description_1_0= RULE_STRING )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:576:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBuiltInType1245); 

            			newLeafNode(lv_description_1_0, grammarAccess.getBuiltInTypeAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBuiltInTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleBuiltInType"


    // $ANTLR start "entryRuleField"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:600:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:601:2: (iv_ruleField= ruleField EOF )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:602:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1286);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1296); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:609:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_lower_7_0=null;
        Token otherlv_8=null;
        Token lv_upperUnlimited_9_0=null;
        Token lv_upper_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;

         enterRule(); 
            
        try {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:612:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' ) ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:613:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' ) )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:613:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:613:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:613:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:614:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:614:1: (lv_name_0_0= RULE_ID )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:615:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1338); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleField1355); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
                
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:635:1: ( ( ruleFQN ) )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:636:1: ( ruleFQN )
            {
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:636:1: ( ruleFQN )
            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:637:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getTypeDataTypeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleField1378);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:650:2: ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EOF||LA14_0==RULE_ID||LA14_0==15||LA14_0==18||LA14_0==23) ) {
                alt14=1;
            }
            else if ( (LA14_0==14) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:650:3: ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? )
                    {
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:650:3: ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? )
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:650:4: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )?
                    {
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:650:4: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==15) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:650:6: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';'
                            {
                            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleField1393); 

                                	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getDescriptionKeyword_3_0_0_0());
                                
                            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:654:1: ( (lv_description_4_0= RULE_STRING ) )
                            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:655:1: (lv_description_4_0= RULE_STRING )
                            {
                            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:655:1: (lv_description_4_0= RULE_STRING )
                            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:656:3: lv_description_4_0= RULE_STRING
                            {
                            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField1410); 

                            			newLeafNode(lv_description_4_0, grammarAccess.getFieldAccess().getDescriptionSTRINGTerminalRuleCall_3_0_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFieldRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_4_0, 
                                    		"STRING");
                            	    

                            }


                            }

                            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleField1427); 

                                	newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_0_2());
                                

                            }
                            break;

                    }

                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:676:3: (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==23) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:676:5: otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';'
                            {
                            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleField1442); 

                                	newLeafNode(otherlv_6, grammarAccess.getFieldAccess().getLeftSquareBracketKeyword_3_0_1_0());
                                
                            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:680:1: ( (lv_lower_7_0= RULE_INT ) )
                            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:681:1: (lv_lower_7_0= RULE_INT )
                            {
                            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:681:1: (lv_lower_7_0= RULE_INT )
                            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:682:3: lv_lower_7_0= RULE_INT
                            {
                            lv_lower_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField1459); 

                            			newLeafNode(lv_lower_7_0, grammarAccess.getFieldAccess().getLowerINTTerminalRuleCall_3_0_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFieldRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"lower",
                                    		lv_lower_7_0, 
                                    		"INT");
                            	    

                            }


                            }

                            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleField1476); 

                                	newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getCommaKeyword_3_0_1_2());
                                
                            // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:702:1: ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) )
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==25) ) {
                                alt12=1;
                            }
                            else if ( (LA12_0==RULE_INT) ) {
                                alt12=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 12, 0, input);

                                throw nvae;
                            }
                            switch (alt12) {
                                case 1 :
                                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:702:2: ( (lv_upperUnlimited_9_0= '*' ) )
                                    {
                                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:702:2: ( (lv_upperUnlimited_9_0= '*' ) )
                                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:703:1: (lv_upperUnlimited_9_0= '*' )
                                    {
                                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:703:1: (lv_upperUnlimited_9_0= '*' )
                                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:704:3: lv_upperUnlimited_9_0= '*'
                                    {
                                    lv_upperUnlimited_9_0=(Token)match(input,25,FOLLOW_25_in_ruleField1495); 

                                            newLeafNode(lv_upperUnlimited_9_0, grammarAccess.getFieldAccess().getUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getFieldRule());
                                    	        }
                                           		setWithLastConsumed(current, "upperUnlimited", true, "*");
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:718:6: ( (lv_upper_10_0= RULE_INT ) )
                                    {
                                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:718:6: ( (lv_upper_10_0= RULE_INT ) )
                                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:719:1: (lv_upper_10_0= RULE_INT )
                                    {
                                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:719:1: (lv_upper_10_0= RULE_INT )
                                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:720:3: lv_upper_10_0= RULE_INT
                                    {
                                    lv_upper_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField1531); 

                                    			newLeafNode(lv_upper_10_0, grammarAccess.getFieldAccess().getUpperINTTerminalRuleCall_3_0_1_3_1_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getFieldRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"upper",
                                            		lv_upper_10_0, 
                                            		"INT");
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_11=(Token)match(input,26,FOLLOW_26_in_ruleField1549); 

                                	newLeafNode(otherlv_11, grammarAccess.getFieldAccess().getRightSquareBracketKeyword_3_0_1_4());
                                
                            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleField1561); 

                                	newLeafNode(otherlv_12, grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_1_5());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.johnf.mydsl2/src-gen/org/johnf/mydsl2/parser/antlr/internal/InternalMyDsl.g:745:7: otherlv_13= ';'
                    {
                    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleField1582); 

                        	newLeafNode(otherlv_13, grammarAccess.getFieldAccess().getSemicolonKeyword_3_1());
                        

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
    // $ANTLR end "ruleField"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel139 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModel156 = new BitSet(new long[]{0x0000000000218002L});
    public static final BitSet FOLLOW_15_in_ruleModel169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel186 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModel203 = new BitSet(new long[]{0x0000000000210002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleModel226 = new BitSet(new long[]{0x0000000000210002L});
    public static final BitSet FOLLOW_ruleSystem_in_ruleModel248 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSystem332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem349 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSystem366 = new BitSet(new long[]{0x00000000002C8000L});
    public static final BitSet FOLLOW_15_in_ruleSystem379 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystem396 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSystem413 = new BitSet(new long[]{0x00000000002C0000L});
    public static final BitSet FOLLOW_ruleDefinitionImport_in_ruleSystem436 = new BitSet(new long[]{0x00000000002C0000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleSystem458 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18_in_ruleSystem471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionImport_in_entryRuleDefinitionImport507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionImport517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDefinitionImport554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDefinitionImport577 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDefinitionImport589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDefinition681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN771 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleFQN790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN805 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInType_in_ruleDataType909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleDataType936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEntity1018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1035 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEntity1052 = new BitSet(new long[]{0x0000000000048010L});
    public static final BitSet FOLLOW_15_in_ruleEntity1065 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity1082 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity1099 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleField_in_ruleEntity1122 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleEntity1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInType_in_entryRuleBuiltInType1171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInType1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBuiltInType1223 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBuiltInType1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1338 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleField1355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleField1378 = new BitSet(new long[]{0x000000000080C002L});
    public static final BitSet FOLLOW_15_in_ruleField1393 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField1410 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleField1427 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleField1442 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField1459 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleField1476 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_25_in_ruleField1495 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField1531 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleField1549 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleField1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleField1582 = new BitSet(new long[]{0x0000000000000002L});

}