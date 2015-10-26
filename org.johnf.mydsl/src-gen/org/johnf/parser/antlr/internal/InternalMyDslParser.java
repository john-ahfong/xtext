package org.johnf.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.johnf.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DATE", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'workspace'", "';'", "'description'", "'.'", "'entity'", "'{'", "'}'", "':'", "'['", "','", "'*'", "']'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_DATE=7;
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
    public String getGrammarFileName() { return "../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g"; }



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
    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_dataTypes_6_0= ruleEntity ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        EObject lv_dataTypes_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_dataTypes_6_0= ruleEntity ) )* ) )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_dataTypes_6_0= ruleEntity ) )* )
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_dataTypes_6_0= ruleEntity ) )* )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_dataTypes_6_0= ruleEntity ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getWorkspaceKeyword_0());
                
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:86:3: lv_name_1_0= RULE_ID
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
                
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:106:1: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:106:3: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleModel169); 

                        	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getDescriptionKeyword_3_0());
                        
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:110:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:111:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:111:1: (lv_description_4_0= RULE_STRING )
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:112:3: lv_description_4_0= RULE_STRING
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

            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:132:3: ( (lv_dataTypes_6_0= ruleEntity ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:133:1: (lv_dataTypes_6_0= ruleEntity )
            	    {
            	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:133:1: (lv_dataTypes_6_0= ruleEntity )
            	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:134:3: lv_dataTypes_6_0= ruleEntity
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


    // $ANTLR start "entryRuleFQN"
    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:158:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:159:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:160:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN264);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN275); 

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
    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:167:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:170:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:171:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:171:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:171:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN315); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:178:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:179:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleFQN334); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN349); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEntity"
    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:201:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:202:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:203:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity398);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity408); 

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
    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:210:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_fields_6_0= ruleField ) )* otherlv_7= '}' ) ;
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
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:213:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_fields_6_0= ruleField ) )* otherlv_7= '}' ) )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:214:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_fields_6_0= ruleField ) )* otherlv_7= '}' )
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:214:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_fields_6_0= ruleField ) )* otherlv_7= '}' )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:214:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_fields_6_0= ruleField ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEntity445); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:218:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:219:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:219:1: (lv_name_1_0= RULE_ID )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:220:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity462); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleEntity479); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:240:1: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:240:3: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEntity492); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getDescriptionKeyword_3_0());
                        
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:244:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:245:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:245:1: (lv_description_4_0= RULE_STRING )
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:246:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity509); 

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

                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEntity526); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:266:3: ( (lv_fields_6_0= ruleField ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:267:1: (lv_fields_6_0= ruleField )
            	    {
            	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:267:1: (lv_fields_6_0= ruleField )
            	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:268:3: lv_fields_6_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleEntity549);
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
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleEntity562); 

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
    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:296:1: entryRuleBuiltInType returns [EObject current=null] : iv_ruleBuiltInType= ruleBuiltInType EOF ;
    public final EObject entryRuleBuiltInType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInType = null;


        try {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:297:2: (iv_ruleBuiltInType= ruleBuiltInType EOF )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:298:2: iv_ruleBuiltInType= ruleBuiltInType EOF
            {
             newCompositeNode(grammarAccess.getBuiltInTypeRule()); 
            pushFollow(FOLLOW_ruleBuiltInType_in_entryRuleBuiltInType598);
            iv_ruleBuiltInType=ruleBuiltInType();

            state._fsp--;

             current =iv_ruleBuiltInType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInType608); 

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
    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:305:1: ruleBuiltInType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBuiltInType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_1_0=null;

         enterRule(); 
            
        try {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:308:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) ) )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:309:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:309:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) ) )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:309:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:309:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:310:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:310:1: (lv_name_0_0= RULE_ID )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:311:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBuiltInType650); 

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

            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:327:2: ( (lv_description_1_0= RULE_STRING ) )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:328:1: (lv_description_1_0= RULE_STRING )
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:328:1: (lv_description_1_0= RULE_STRING )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:329:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBuiltInType672); 

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
    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:353:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:354:2: (iv_ruleField= ruleField EOF )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:355:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField713);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField723); 

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
    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:362:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' ) ) ;
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
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:365:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' ) ) )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:366:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' ) )
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:366:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' ) )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:366:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' )
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:366:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:367:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:367:1: (lv_name_0_0= RULE_ID )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:368:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField765); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleField782); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
                
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:388:1: ( ( ruleFQN ) )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:389:1: ( ruleFQN )
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:389:1: ( ruleFQN )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:390:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getTypeDataTypeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleField805);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:403:2: ( ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? ) | otherlv_13= ';' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==EOF||LA9_0==RULE_ID||LA9_0==15||LA9_0==19||LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:403:3: ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? )
                    {
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:403:3: ( (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )? )
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:403:4: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )?
                    {
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:403:4: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==15) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:403:6: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';'
                            {
                            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleField820); 

                                	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getDescriptionKeyword_3_0_0_0());
                                
                            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:407:1: ( (lv_description_4_0= RULE_STRING ) )
                            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:408:1: (lv_description_4_0= RULE_STRING )
                            {
                            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:408:1: (lv_description_4_0= RULE_STRING )
                            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:409:3: lv_description_4_0= RULE_STRING
                            {
                            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField837); 

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

                            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleField854); 

                                	newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_0_2());
                                

                            }
                            break;

                    }

                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:429:3: (otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==21) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:429:5: otherlv_6= '[' ( (lv_lower_7_0= RULE_INT ) ) otherlv_8= ',' ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) ) otherlv_11= ']' otherlv_12= ';'
                            {
                            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleField869); 

                                	newLeafNode(otherlv_6, grammarAccess.getFieldAccess().getLeftSquareBracketKeyword_3_0_1_0());
                                
                            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:433:1: ( (lv_lower_7_0= RULE_INT ) )
                            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:434:1: (lv_lower_7_0= RULE_INT )
                            {
                            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:434:1: (lv_lower_7_0= RULE_INT )
                            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:435:3: lv_lower_7_0= RULE_INT
                            {
                            lv_lower_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField886); 

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

                            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleField903); 

                                	newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getCommaKeyword_3_0_1_2());
                                
                            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:455:1: ( ( (lv_upperUnlimited_9_0= '*' ) ) | ( (lv_upper_10_0= RULE_INT ) ) )
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0==23) ) {
                                alt7=1;
                            }
                            else if ( (LA7_0==RULE_INT) ) {
                                alt7=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 0, input);

                                throw nvae;
                            }
                            switch (alt7) {
                                case 1 :
                                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:455:2: ( (lv_upperUnlimited_9_0= '*' ) )
                                    {
                                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:455:2: ( (lv_upperUnlimited_9_0= '*' ) )
                                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:456:1: (lv_upperUnlimited_9_0= '*' )
                                    {
                                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:456:1: (lv_upperUnlimited_9_0= '*' )
                                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:457:3: lv_upperUnlimited_9_0= '*'
                                    {
                                    lv_upperUnlimited_9_0=(Token)match(input,23,FOLLOW_23_in_ruleField922); 

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
                                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:471:6: ( (lv_upper_10_0= RULE_INT ) )
                                    {
                                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:471:6: ( (lv_upper_10_0= RULE_INT ) )
                                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:472:1: (lv_upper_10_0= RULE_INT )
                                    {
                                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:472:1: (lv_upper_10_0= RULE_INT )
                                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:473:3: lv_upper_10_0= RULE_INT
                                    {
                                    lv_upper_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField958); 

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

                            otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleField976); 

                                	newLeafNode(otherlv_11, grammarAccess.getFieldAccess().getRightSquareBracketKeyword_3_0_1_4());
                                
                            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleField988); 

                                	newLeafNode(otherlv_12, grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_1_5());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:498:7: otherlv_13= ';'
                    {
                    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleField1009); 

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
    public static final BitSet FOLLOW_14_in_ruleModel156 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_15_in_ruleModel169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel186 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModel203 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleModel226 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN315 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleFQN334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN349 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEntity445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity462 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEntity479 = new BitSet(new long[]{0x0000000000088010L});
    public static final BitSet FOLLOW_15_in_ruleEntity492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity509 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity526 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleField_in_ruleEntity549 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleEntity562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInType_in_entryRuleBuiltInType598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBuiltInType650 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBuiltInType672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField765 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleField782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleField805 = new BitSet(new long[]{0x000000000020C002L});
    public static final BitSet FOLLOW_15_in_ruleField820 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField837 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleField854 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleField869 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField886 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleField903 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_23_in_ruleField922 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField958 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleField976 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleField988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleField1009 = new BitSet(new long[]{0x0000000000000002L});

}