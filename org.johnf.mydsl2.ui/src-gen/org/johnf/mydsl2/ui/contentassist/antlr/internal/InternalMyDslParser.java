package org.johnf.mydsl2.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.johnf.mydsl2.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DATE", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'workspace'", "'description'", "'system'", "'{'", "'}'", "'import'", "'.'", "'entity'", "':'", "'['", "','", "']'", "'*'"
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
    public String getGrammarFileName() { return "../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleModel EOF )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Model__Group__0 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSystem"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleSystem EOF )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem121);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__System__Group__0 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__System__Group__0 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__System__Group__0 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__System__Group__0 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__System__Group__0
            {
            pushFollow(FOLLOW_rule__System__Group__0_in_ruleSystem154);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleDefinitionImport"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleDefinitionImport : ruleDefinitionImport EOF ;
    public final void entryRuleDefinitionImport() throws RecognitionException {
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleDefinitionImport EOF )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleDefinitionImport EOF
            {
             before(grammarAccess.getDefinitionImportRule()); 
            pushFollow(FOLLOW_ruleDefinitionImport_in_entryRuleDefinitionImport181);
            ruleDefinitionImport();

            state._fsp--;

             after(grammarAccess.getDefinitionImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionImport188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinitionImport"


    // $ANTLR start "ruleDefinitionImport"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleDefinitionImport : ( ( rule__DefinitionImport__Group__0 ) ) ;
    public final void ruleDefinitionImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__DefinitionImport__Group__0 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__DefinitionImport__Group__0 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__DefinitionImport__Group__0 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__DefinitionImport__Group__0 )
            {
             before(grammarAccess.getDefinitionImportAccess().getGroup()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__DefinitionImport__Group__0 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__DefinitionImport__Group__0
            {
            pushFollow(FOLLOW_rule__DefinitionImport__Group__0_in_ruleDefinitionImport214);
            rule__DefinitionImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinitionImport"


    // $ANTLR start "entryRuleDefinition"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleDefinition EOF )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition241);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleDefinition : ( ruleDataType ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ruleDataType ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ruleDataType )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ruleDataType )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ruleDataType
            {
             before(grammarAccess.getDefinitionAccess().getDataTypeParserRuleCall()); 
            pushFollow(FOLLOW_ruleDataType_in_ruleDefinition274);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getDataTypeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleFQN"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:176:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:177:1: ( ruleFQN EOF )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:178:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN304);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN311); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:185:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:189:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:190:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:190:1: ( ( rule__FQN__Group__0 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:191:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:192:1: ( rule__FQN__Group__0 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:192:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN337);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleDataType"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:204:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:205:1: ( ruleDataType EOF )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:206:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType364);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType371); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:213:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:217:2: ( ( ( rule__DataType__Alternatives ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:218:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:218:1: ( ( rule__DataType__Alternatives ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:219:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:220:1: ( rule__DataType__Alternatives )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:220:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType397);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:232:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:233:1: ( ruleEntity EOF )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:234:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity424);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity431); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:241:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:245:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:246:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:246:1: ( ( rule__Entity__Group__0 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:247:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:248:1: ( rule__Entity__Group__0 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:248:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity457);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleBuiltInType"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:260:1: entryRuleBuiltInType : ruleBuiltInType EOF ;
    public final void entryRuleBuiltInType() throws RecognitionException {
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:261:1: ( ruleBuiltInType EOF )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:262:1: ruleBuiltInType EOF
            {
             before(grammarAccess.getBuiltInTypeRule()); 
            pushFollow(FOLLOW_ruleBuiltInType_in_entryRuleBuiltInType484);
            ruleBuiltInType();

            state._fsp--;

             after(grammarAccess.getBuiltInTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInType491); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBuiltInType"


    // $ANTLR start "ruleBuiltInType"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:269:1: ruleBuiltInType : ( ( rule__BuiltInType__Group__0 ) ) ;
    public final void ruleBuiltInType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:273:2: ( ( ( rule__BuiltInType__Group__0 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: ( ( rule__BuiltInType__Group__0 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: ( ( rule__BuiltInType__Group__0 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:275:1: ( rule__BuiltInType__Group__0 )
            {
             before(grammarAccess.getBuiltInTypeAccess().getGroup()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:276:1: ( rule__BuiltInType__Group__0 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:276:2: rule__BuiltInType__Group__0
            {
            pushFollow(FOLLOW_rule__BuiltInType__Group__0_in_ruleBuiltInType517);
            rule__BuiltInType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBuiltInTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuiltInType"


    // $ANTLR start "entryRuleField"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:288:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:289:1: ( ruleField EOF )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:290:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField544);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField551); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:297:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:301:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:302:1: ( ( rule__Field__Group__0 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:302:1: ( ( rule__Field__Group__0 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:303:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:304:1: ( rule__Field__Group__0 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:304:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField577);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "rule__DataType__Alternatives"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:318:1: rule__DataType__Alternatives : ( ( ruleBuiltInType ) | ( ruleEntity ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:322:1: ( ( ruleBuiltInType ) | ( ruleEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:323:1: ( ruleBuiltInType )
                    {
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:323:1: ( ruleBuiltInType )
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:324:1: ruleBuiltInType
                    {
                     before(grammarAccess.getDataTypeAccess().getBuiltInTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBuiltInType_in_rule__DataType__Alternatives615);
                    ruleBuiltInType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getBuiltInTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:329:6: ( ruleEntity )
                    {
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:329:6: ( ruleEntity )
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:330:1: ruleEntity
                    {
                     before(grammarAccess.getDataTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__DataType__Alternatives632);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__Field__Alternatives_3"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: rule__Field__Alternatives_3 : ( ( ( rule__Field__Group_3_0__0 ) ) | ( ';' ) );
    public final void rule__Field__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:344:1: ( ( ( rule__Field__Group_3_0__0 ) ) | ( ';' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EOF||LA2_0==RULE_ID||LA2_0==15||LA2_0==18||LA2_0==23) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:345:1: ( ( rule__Field__Group_3_0__0 ) )
                    {
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:345:1: ( ( rule__Field__Group_3_0__0 ) )
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:346:1: ( rule__Field__Group_3_0__0 )
                    {
                     before(grammarAccess.getFieldAccess().getGroup_3_0()); 
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:347:1: ( rule__Field__Group_3_0__0 )
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:347:2: rule__Field__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_3_0__0_in_rule__Field__Alternatives_3664);
                    rule__Field__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:351:6: ( ';' )
                    {
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:351:6: ( ';' )
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:352:1: ';'
                    {
                     before(grammarAccess.getFieldAccess().getSemicolonKeyword_3_1()); 
                    match(input,13,FOLLOW_13_in_rule__Field__Alternatives_3683); 
                     after(grammarAccess.getFieldAccess().getSemicolonKeyword_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Alternatives_3"


    // $ANTLR start "rule__Field__Alternatives_3_0_1_3"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:364:1: rule__Field__Alternatives_3_0_1_3 : ( ( ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 ) ) | ( ( rule__Field__UpperAssignment_3_0_1_3_1 ) ) );
    public final void rule__Field__Alternatives_3_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:368:1: ( ( ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 ) ) | ( ( rule__Field__UpperAssignment_3_0_1_3_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 ) )
                    {
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 ) )
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 )
                    {
                     before(grammarAccess.getFieldAccess().getUpperUnlimitedAssignment_3_0_1_3_0()); 
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: ( rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 )
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:371:2: rule__Field__UpperUnlimitedAssignment_3_0_1_3_0
                    {
                    pushFollow(FOLLOW_rule__Field__UpperUnlimitedAssignment_3_0_1_3_0_in_rule__Field__Alternatives_3_0_1_3717);
                    rule__Field__UpperUnlimitedAssignment_3_0_1_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getUpperUnlimitedAssignment_3_0_1_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:375:6: ( ( rule__Field__UpperAssignment_3_0_1_3_1 ) )
                    {
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:375:6: ( ( rule__Field__UpperAssignment_3_0_1_3_1 ) )
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:376:1: ( rule__Field__UpperAssignment_3_0_1_3_1 )
                    {
                     before(grammarAccess.getFieldAccess().getUpperAssignment_3_0_1_3_1()); 
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ( rule__Field__UpperAssignment_3_0_1_3_1 )
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:377:2: rule__Field__UpperAssignment_3_0_1_3_1
                    {
                    pushFollow(FOLLOW_rule__Field__UpperAssignment_3_0_1_3_1_in_rule__Field__Alternatives_3_0_1_3735);
                    rule__Field__UpperAssignment_3_0_1_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getUpperAssignment_3_0_1_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Alternatives_3_0_1_3"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:388:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:392:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:393:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0766);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0769);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:400:1: rule__Model__Group__0__Impl : ( 'workspace' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:404:1: ( ( 'workspace' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ( 'workspace' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ( 'workspace' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:406:1: 'workspace'
            {
             before(grammarAccess.getModelAccess().getWorkspaceKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Model__Group__0__Impl797); 
             after(grammarAccess.getModelAccess().getWorkspaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:419:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:423:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:424:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1828);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1831);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:431:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:435:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:436:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:436:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:437:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( rule__Model__NameAssignment_1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:438:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl858);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:448:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:452:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:453:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2888);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2891);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:460:1: rule__Model__Group__2__Impl : ( ';' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:464:1: ( ( ';' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:465:1: ( ';' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:465:1: ( ';' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ';'
            {
             before(grammarAccess.getModelAccess().getSemicolonKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Model__Group__2__Impl919); 
             after(grammarAccess.getModelAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:479:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:483:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:484:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3950);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3953);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:491:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ( ( ( rule__Model__Group_3__0 )? ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( ( rule__Model__Group_3__0 )? )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( ( rule__Model__Group_3__0 )? )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( rule__Model__Group_3__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: ( rule__Model__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:498:2: rule__Model__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl980);
                    rule__Model__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:508:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:512:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:513:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41011);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41014);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:520:1: rule__Model__Group__4__Impl : ( ( rule__Model__DataTypesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( ( ( rule__Model__DataTypesAssignment_4 )* ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ( ( rule__Model__DataTypesAssignment_4 )* )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ( ( rule__Model__DataTypesAssignment_4 )* )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:526:1: ( rule__Model__DataTypesAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getDataTypesAssignment_4()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:527:1: ( rule__Model__DataTypesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:527:2: rule__Model__DataTypesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__DataTypesAssignment_4_in_rule__Model__Group__4__Impl1041);
            	    rule__Model__DataTypesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDataTypesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:541:1: ( rule__Model__Group__5__Impl )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:542:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51072);
            rule__Model__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:548:1: rule__Model__Group__5__Impl : ( ( rule__Model__SystemsAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( ( ( rule__Model__SystemsAssignment_5 )* ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: ( ( rule__Model__SystemsAssignment_5 )* )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: ( ( rule__Model__SystemsAssignment_5 )* )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:554:1: ( rule__Model__SystemsAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getSystemsAssignment_5()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:555:1: ( rule__Model__SystemsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:555:2: rule__Model__SystemsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Model__SystemsAssignment_5_in_rule__Model__Group__5__Impl1099);
            	    rule__Model__SystemsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSystemsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group_3__0"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:577:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:582:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__01142);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__01145);
            rule__Model__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__0"


    // $ANTLR start "rule__Model__Group_3__0__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:589:1: rule__Model__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:593:1: ( ( 'description' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: ( 'description' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: ( 'description' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:595:1: 'description'
            {
             before(grammarAccess.getModelAccess().getDescriptionKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__Model__Group_3__0__Impl1173); 
             after(grammarAccess.getModelAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__0__Impl"


    // $ANTLR start "rule__Model__Group_3__1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:612:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:613:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
            {
            pushFollow(FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__11204);
            rule__Model__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__11207);
            rule__Model__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__1"


    // $ANTLR start "rule__Model__Group_3__1__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:620:1: rule__Model__Group_3__1__Impl : ( ( rule__Model__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:624:1: ( ( ( rule__Model__DescriptionAssignment_3_1 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:625:1: ( ( rule__Model__DescriptionAssignment_3_1 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:625:1: ( ( rule__Model__DescriptionAssignment_3_1 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:626:1: ( rule__Model__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getModelAccess().getDescriptionAssignment_3_1()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:627:1: ( rule__Model__DescriptionAssignment_3_1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:627:2: rule__Model__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Model__DescriptionAssignment_3_1_in_rule__Model__Group_3__1__Impl1234);
            rule__Model__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__1__Impl"


    // $ANTLR start "rule__Model__Group_3__2"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:637:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:641:1: ( rule__Model__Group_3__2__Impl )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:642:2: rule__Model__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__21264);
            rule__Model__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__2"


    // $ANTLR start "rule__Model__Group_3__2__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: rule__Model__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:652:1: ( ( ';' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:653:1: ( ';' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:653:1: ( ';' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:654:1: ';'
            {
             before(grammarAccess.getModelAccess().getSemicolonKeyword_3_2()); 
            match(input,13,FOLLOW_13_in_rule__Model__Group_3__2__Impl1292); 
             after(grammarAccess.getModelAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__2__Impl"


    // $ANTLR start "rule__System__Group__0"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:673:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:677:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:678:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__01329);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__1_in_rule__System__Group__01332);
            rule__System__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:685:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:689:1: ( ( 'system' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ( 'system' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ( 'system' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: 'system'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__System__Group__0__Impl1360); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:709:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__11391);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__2_in_rule__System__Group__11394);
            rule__System__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:716:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:721:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:721:1: ( ( rule__System__NameAssignment_1 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:722:1: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:723:1: ( rule__System__NameAssignment_1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:723:2: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl1421);
            rule__System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:737:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:738:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__21451);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__3_in_rule__System__Group__21454);
            rule__System__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:745:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: ( ( '{' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:750:1: ( '{' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:750:1: ( '{' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:751:1: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__System__Group__2__Impl1482); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:764:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:769:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__31513);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__4_in_rule__System__Group__31516);
            rule__System__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: rule__System__Group__3__Impl : ( ( rule__System__Group_3__0 )? ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:780:1: ( ( ( rule__System__Group_3__0 )? ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:781:1: ( ( rule__System__Group_3__0 )? )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:781:1: ( ( rule__System__Group_3__0 )? )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: ( rule__System__Group_3__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_3()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:783:1: ( rule__System__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:783:2: rule__System__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__System__Group_3__0_in_rule__System__Group__3__Impl1543);
                    rule__System__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:798:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__41574);
            rule__System__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__5_in_rule__System__Group__41577);
            rule__System__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:805:1: rule__System__Group__4__Impl : ( ( rule__System__ImportsAssignment_4 )* ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:809:1: ( ( ( rule__System__ImportsAssignment_4 )* ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:810:1: ( ( rule__System__ImportsAssignment_4 )* )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:810:1: ( ( rule__System__ImportsAssignment_4 )* )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: ( rule__System__ImportsAssignment_4 )*
            {
             before(grammarAccess.getSystemAccess().getImportsAssignment_4()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:812:1: ( rule__System__ImportsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:812:2: rule__System__ImportsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__System__ImportsAssignment_4_in_rule__System__Group__4__Impl1604);
            	    rule__System__ImportsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getImportsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:822:1: rule__System__Group__5 : rule__System__Group__5__Impl rule__System__Group__6 ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: ( rule__System__Group__5__Impl rule__System__Group__6 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:827:2: rule__System__Group__5__Impl rule__System__Group__6
            {
            pushFollow(FOLLOW_rule__System__Group__5__Impl_in_rule__System__Group__51635);
            rule__System__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__6_in_rule__System__Group__51638);
            rule__System__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:834:1: rule__System__Group__5__Impl : ( ( rule__System__DataTypesAssignment_5 )* ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:838:1: ( ( ( rule__System__DataTypesAssignment_5 )* ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: ( ( rule__System__DataTypesAssignment_5 )* )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: ( ( rule__System__DataTypesAssignment_5 )* )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: ( rule__System__DataTypesAssignment_5 )*
            {
             before(grammarAccess.getSystemAccess().getDataTypesAssignment_5()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:841:1: ( rule__System__DataTypesAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:841:2: rule__System__DataTypesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__System__DataTypesAssignment_5_in_rule__System__Group__5__Impl1665);
            	    rule__System__DataTypesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getDataTypesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__System__Group__6"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: rule__System__Group__6 : rule__System__Group__6__Impl ;
    public final void rule__System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:855:1: ( rule__System__Group__6__Impl )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:856:2: rule__System__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__System__Group__6__Impl_in_rule__System__Group__61696);
            rule__System__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__6"


    // $ANTLR start "rule__System__Group__6__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:862:1: rule__System__Group__6__Impl : ( '}' ) ;
    public final void rule__System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:866:1: ( ( '}' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:867:1: ( '}' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:867:1: ( '}' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__System__Group__6__Impl1724); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__6__Impl"


    // $ANTLR start "rule__System__Group_3__0"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: rule__System__Group_3__0 : rule__System__Group_3__0__Impl rule__System__Group_3__1 ;
    public final void rule__System__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: ( rule__System__Group_3__0__Impl rule__System__Group_3__1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:900:2: rule__System__Group_3__0__Impl rule__System__Group_3__1
            {
            pushFollow(FOLLOW_rule__System__Group_3__0__Impl_in_rule__System__Group_3__01769);
            rule__System__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group_3__1_in_rule__System__Group_3__01772);
            rule__System__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3__0"


    // $ANTLR start "rule__System__Group_3__0__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:907:1: rule__System__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__System__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:911:1: ( ( 'description' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:912:1: ( 'description' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:912:1: ( 'description' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:913:1: 'description'
            {
             before(grammarAccess.getSystemAccess().getDescriptionKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__System__Group_3__0__Impl1800); 
             after(grammarAccess.getSystemAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3__0__Impl"


    // $ANTLR start "rule__System__Group_3__1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:926:1: rule__System__Group_3__1 : rule__System__Group_3__1__Impl rule__System__Group_3__2 ;
    public final void rule__System__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: ( rule__System__Group_3__1__Impl rule__System__Group_3__2 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:931:2: rule__System__Group_3__1__Impl rule__System__Group_3__2
            {
            pushFollow(FOLLOW_rule__System__Group_3__1__Impl_in_rule__System__Group_3__11831);
            rule__System__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group_3__2_in_rule__System__Group_3__11834);
            rule__System__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3__1"


    // $ANTLR start "rule__System__Group_3__1__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:938:1: rule__System__Group_3__1__Impl : ( ( rule__System__DescriptionAssignment_3_1 ) ) ;
    public final void rule__System__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: ( ( ( rule__System__DescriptionAssignment_3_1 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:943:1: ( ( rule__System__DescriptionAssignment_3_1 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:943:1: ( ( rule__System__DescriptionAssignment_3_1 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:944:1: ( rule__System__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getSystemAccess().getDescriptionAssignment_3_1()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:945:1: ( rule__System__DescriptionAssignment_3_1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:945:2: rule__System__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__System__DescriptionAssignment_3_1_in_rule__System__Group_3__1__Impl1861);
            rule__System__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3__1__Impl"


    // $ANTLR start "rule__System__Group_3__2"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: rule__System__Group_3__2 : rule__System__Group_3__2__Impl ;
    public final void rule__System__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:959:1: ( rule__System__Group_3__2__Impl )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:960:2: rule__System__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__System__Group_3__2__Impl_in_rule__System__Group_3__21891);
            rule__System__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3__2"


    // $ANTLR start "rule__System__Group_3__2__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: rule__System__Group_3__2__Impl : ( ';' ) ;
    public final void rule__System__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: ( ( ';' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:971:1: ( ';' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:971:1: ( ';' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:972:1: ';'
            {
             before(grammarAccess.getSystemAccess().getSemicolonKeyword_3_2()); 
            match(input,13,FOLLOW_13_in_rule__System__Group_3__2__Impl1919); 
             after(grammarAccess.getSystemAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3__2__Impl"


    // $ANTLR start "rule__DefinitionImport__Group__0"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:991:1: rule__DefinitionImport__Group__0 : rule__DefinitionImport__Group__0__Impl rule__DefinitionImport__Group__1 ;
    public final void rule__DefinitionImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:995:1: ( rule__DefinitionImport__Group__0__Impl rule__DefinitionImport__Group__1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:996:2: rule__DefinitionImport__Group__0__Impl rule__DefinitionImport__Group__1
            {
            pushFollow(FOLLOW_rule__DefinitionImport__Group__0__Impl_in_rule__DefinitionImport__Group__01956);
            rule__DefinitionImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefinitionImport__Group__1_in_rule__DefinitionImport__Group__01959);
            rule__DefinitionImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionImport__Group__0"


    // $ANTLR start "rule__DefinitionImport__Group__0__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:1: rule__DefinitionImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__DefinitionImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: ( ( 'import' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: ( 'import' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: ( 'import' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1009:1: 'import'
            {
             before(grammarAccess.getDefinitionImportAccess().getImportKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__DefinitionImport__Group__0__Impl1987); 
             after(grammarAccess.getDefinitionImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionImport__Group__0__Impl"


    // $ANTLR start "rule__DefinitionImport__Group__1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:1: rule__DefinitionImport__Group__1 : rule__DefinitionImport__Group__1__Impl rule__DefinitionImport__Group__2 ;
    public final void rule__DefinitionImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: ( rule__DefinitionImport__Group__1__Impl rule__DefinitionImport__Group__2 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1027:2: rule__DefinitionImport__Group__1__Impl rule__DefinitionImport__Group__2
            {
            pushFollow(FOLLOW_rule__DefinitionImport__Group__1__Impl_in_rule__DefinitionImport__Group__12018);
            rule__DefinitionImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefinitionImport__Group__2_in_rule__DefinitionImport__Group__12021);
            rule__DefinitionImport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionImport__Group__1"


    // $ANTLR start "rule__DefinitionImport__Group__1__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1034:1: rule__DefinitionImport__Group__1__Impl : ( ( rule__DefinitionImport__DefinitionAssignment_1 ) ) ;
    public final void rule__DefinitionImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:1: ( ( ( rule__DefinitionImport__DefinitionAssignment_1 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: ( ( rule__DefinitionImport__DefinitionAssignment_1 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: ( ( rule__DefinitionImport__DefinitionAssignment_1 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:1: ( rule__DefinitionImport__DefinitionAssignment_1 )
            {
             before(grammarAccess.getDefinitionImportAccess().getDefinitionAssignment_1()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: ( rule__DefinitionImport__DefinitionAssignment_1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:2: rule__DefinitionImport__DefinitionAssignment_1
            {
            pushFollow(FOLLOW_rule__DefinitionImport__DefinitionAssignment_1_in_rule__DefinitionImport__Group__1__Impl2048);
            rule__DefinitionImport__DefinitionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionImportAccess().getDefinitionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionImport__Group__1__Impl"


    // $ANTLR start "rule__DefinitionImport__Group__2"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1051:1: rule__DefinitionImport__Group__2 : rule__DefinitionImport__Group__2__Impl ;
    public final void rule__DefinitionImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: ( rule__DefinitionImport__Group__2__Impl )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:2: rule__DefinitionImport__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefinitionImport__Group__2__Impl_in_rule__DefinitionImport__Group__22078);
            rule__DefinitionImport__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionImport__Group__2"


    // $ANTLR start "rule__DefinitionImport__Group__2__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: rule__DefinitionImport__Group__2__Impl : ( ';' ) ;
    public final void rule__DefinitionImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:1: ( ( ';' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: ( ';' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: ( ';' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: ';'
            {
             before(grammarAccess.getDefinitionImportAccess().getSemicolonKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__DefinitionImport__Group__2__Impl2106); 
             after(grammarAccess.getDefinitionImportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionImport__Group__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1087:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1092:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02143);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02146);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1099:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1103:1: ( ( RULE_ID ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ( RULE_ID )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ( RULE_ID )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2173); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1120:1: ( rule__FQN__Group__1__Impl )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12202);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1127:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1134:1: ( rule__FQN__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1134:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2229);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1153:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02264);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02267);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1164:1: ( ( '.' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:1: ( '.' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:1: ( '.' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1166:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__FQN__Group_1__0__Impl2295); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1179:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1183:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__12326);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:1: ( ( RULE_ID ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1195:1: ( RULE_ID )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1195:1: ( RULE_ID )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl2353); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1216:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02386);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02389);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1223:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1227:1: ( ( 'entity' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: ( 'entity' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: ( 'entity' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group__0__Impl2417); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1247:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12448);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12451);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1254:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:1: ( rule__Entity__NameAssignment_1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl2478);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__22508);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22511);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1283:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1287:1: ( ( '{' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: ( '{' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: ( '{' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__2__Impl2539); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1306:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__32570);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32573);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1314:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( ( rule__Entity__Group_3__0 )? )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1321:1: ( rule__Entity__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1321:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl2600);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42631);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42634);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1343:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FieldsAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:1: ( ( ( rule__Entity__FieldsAssignment_4 )* ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:1: ( ( rule__Entity__FieldsAssignment_4 )* )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:1: ( ( rule__Entity__FieldsAssignment_4 )* )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:1: ( rule__Entity__FieldsAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_4()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: ( rule__Entity__FieldsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:2: rule__Entity__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FieldsAssignment_4_in_rule__Entity__Group__4__Impl2661);
            	    rule__Entity__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFieldsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1360:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: ( rule__Entity__Group__5__Impl )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52692);
            rule__Entity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: ( ( '}' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:1: ( '}' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:1: ( '}' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1377:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Entity__Group__5__Impl2720); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1402:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__02763);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__02766);
            rule__Entity__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1414:1: rule__Entity__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1418:1: ( ( 'description' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:1: ( 'description' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:1: ( 'description' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1420:1: 'description'
            {
             before(grammarAccess.getEntityAccess().getDescriptionKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group_3__0__Impl2794); 
             after(grammarAccess.getEntityAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1433:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: ( rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:2: rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12825);
            rule__Entity__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__2_in_rule__Entity__Group_3__12828);
            rule__Entity__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1445:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1449:1: ( ( ( rule__Entity__DescriptionAssignment_3_1 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: ( ( rule__Entity__DescriptionAssignment_3_1 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: ( ( rule__Entity__DescriptionAssignment_3_1 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:1: ( rule__Entity__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getDescriptionAssignment_3_1()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: ( rule__Entity__DescriptionAssignment_3_1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:2: rule__Entity__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__DescriptionAssignment_3_1_in_rule__Entity__Group_3__1__Impl2855);
            rule__Entity__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_3__2"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1462:1: rule__Entity__Group_3__2 : rule__Entity__Group_3__2__Impl ;
    public final void rule__Entity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1466:1: ( rule__Entity__Group_3__2__Impl )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1467:2: rule__Entity__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__2__Impl_in_rule__Entity__Group_3__22885);
            rule__Entity__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__2"


    // $ANTLR start "rule__Entity__Group_3__2__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: rule__Entity__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Entity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1477:1: ( ( ';' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:1: ( ';' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:1: ( ';' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1479:1: ';'
            {
             before(grammarAccess.getEntityAccess().getSemicolonKeyword_3_2()); 
            match(input,13,FOLLOW_13_in_rule__Entity__Group_3__2__Impl2913); 
             after(grammarAccess.getEntityAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__2__Impl"


    // $ANTLR start "rule__BuiltInType__Group__0"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1498:1: rule__BuiltInType__Group__0 : rule__BuiltInType__Group__0__Impl rule__BuiltInType__Group__1 ;
    public final void rule__BuiltInType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1502:1: ( rule__BuiltInType__Group__0__Impl rule__BuiltInType__Group__1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1503:2: rule__BuiltInType__Group__0__Impl rule__BuiltInType__Group__1
            {
            pushFollow(FOLLOW_rule__BuiltInType__Group__0__Impl_in_rule__BuiltInType__Group__02950);
            rule__BuiltInType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BuiltInType__Group__1_in_rule__BuiltInType__Group__02953);
            rule__BuiltInType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInType__Group__0"


    // $ANTLR start "rule__BuiltInType__Group__0__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1510:1: rule__BuiltInType__Group__0__Impl : ( ( rule__BuiltInType__NameAssignment_0 ) ) ;
    public final void rule__BuiltInType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1514:1: ( ( ( rule__BuiltInType__NameAssignment_0 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1515:1: ( ( rule__BuiltInType__NameAssignment_0 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1515:1: ( ( rule__BuiltInType__NameAssignment_0 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:1: ( rule__BuiltInType__NameAssignment_0 )
            {
             before(grammarAccess.getBuiltInTypeAccess().getNameAssignment_0()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:1: ( rule__BuiltInType__NameAssignment_0 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:2: rule__BuiltInType__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BuiltInType__NameAssignment_0_in_rule__BuiltInType__Group__0__Impl2980);
            rule__BuiltInType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBuiltInTypeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInType__Group__0__Impl"


    // $ANTLR start "rule__BuiltInType__Group__1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1527:1: rule__BuiltInType__Group__1 : rule__BuiltInType__Group__1__Impl ;
    public final void rule__BuiltInType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:1: ( rule__BuiltInType__Group__1__Impl )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:2: rule__BuiltInType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BuiltInType__Group__1__Impl_in_rule__BuiltInType__Group__13010);
            rule__BuiltInType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInType__Group__1"


    // $ANTLR start "rule__BuiltInType__Group__1__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1538:1: rule__BuiltInType__Group__1__Impl : ( ( rule__BuiltInType__DescriptionAssignment_1 ) ) ;
    public final void rule__BuiltInType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1542:1: ( ( ( rule__BuiltInType__DescriptionAssignment_1 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:1: ( ( rule__BuiltInType__DescriptionAssignment_1 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:1: ( ( rule__BuiltInType__DescriptionAssignment_1 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:1: ( rule__BuiltInType__DescriptionAssignment_1 )
            {
             before(grammarAccess.getBuiltInTypeAccess().getDescriptionAssignment_1()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1545:1: ( rule__BuiltInType__DescriptionAssignment_1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1545:2: rule__BuiltInType__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__BuiltInType__DescriptionAssignment_1_in_rule__BuiltInType__Group__1__Impl3037);
            rule__BuiltInType__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBuiltInTypeAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInType__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1564:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03071);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03074);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1575:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: ( ( rule__Field__NameAssignment_0 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:1: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1578:1: ( rule__Field__NameAssignment_0 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1578:2: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl3101);
            rule__Field__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1593:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13131);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13134);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1600:1: rule__Field__Group__1__Impl : ( ':' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:1: ( ( ':' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1605:1: ( ':' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1605:1: ( ':' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__1__Impl3162); 
             after(grammarAccess.getFieldAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1619:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1624:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23193);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23196);
            rule__Field__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1631:1: rule__Field__Group__2__Impl : ( ( rule__Field__TypeAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:1: ( ( ( rule__Field__TypeAssignment_2 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1636:1: ( ( rule__Field__TypeAssignment_2 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1636:1: ( ( rule__Field__TypeAssignment_2 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1637:1: ( rule__Field__TypeAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_2()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:1: ( rule__Field__TypeAssignment_2 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:2: rule__Field__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_2_in_rule__Field__Group__2__Impl3223);
            rule__Field__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1648:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:1: ( rule__Field__Group__3__Impl )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1653:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33253);
            rule__Field__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1659:1: rule__Field__Group__3__Impl : ( ( rule__Field__Alternatives_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: ( ( ( rule__Field__Alternatives_3 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:1: ( ( rule__Field__Alternatives_3 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:1: ( ( rule__Field__Alternatives_3 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: ( rule__Field__Alternatives_3 )
            {
             before(grammarAccess.getFieldAccess().getAlternatives_3()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1666:1: ( rule__Field__Alternatives_3 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1666:2: rule__Field__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Field__Alternatives_3_in_rule__Field__Group__3__Impl3280);
            rule__Field__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group_3_0__0"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:1: rule__Field__Group_3_0__0 : rule__Field__Group_3_0__0__Impl rule__Field__Group_3_0__1 ;
    public final void rule__Field__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1688:1: ( rule__Field__Group_3_0__0__Impl rule__Field__Group_3_0__1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1689:2: rule__Field__Group_3_0__0__Impl rule__Field__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0__0__Impl_in_rule__Field__Group_3_0__03318);
            rule__Field__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0__1_in_rule__Field__Group_3_0__03321);
            rule__Field__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0__0"


    // $ANTLR start "rule__Field__Group_3_0__0__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: rule__Field__Group_3_0__0__Impl : ( ( rule__Field__Group_3_0_0__0 )? ) ;
    public final void rule__Field__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:1: ( ( ( rule__Field__Group_3_0_0__0 )? ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:1: ( ( rule__Field__Group_3_0_0__0 )? )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:1: ( ( rule__Field__Group_3_0_0__0 )? )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1702:1: ( rule__Field__Group_3_0_0__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_3_0_0()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: ( rule__Field__Group_3_0_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:2: rule__Field__Group_3_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_3_0_0__0_in_rule__Field__Group_3_0__0__Impl3348);
                    rule__Field__Group_3_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0__0__Impl"


    // $ANTLR start "rule__Field__Group_3_0__1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: rule__Field__Group_3_0__1 : rule__Field__Group_3_0__1__Impl ;
    public final void rule__Field__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1717:1: ( rule__Field__Group_3_0__1__Impl )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1718:2: rule__Field__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0__1__Impl_in_rule__Field__Group_3_0__13379);
            rule__Field__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0__1"


    // $ANTLR start "rule__Field__Group_3_0__1__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: rule__Field__Group_3_0__1__Impl : ( ( rule__Field__Group_3_0_1__0 )? ) ;
    public final void rule__Field__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:1: ( ( ( rule__Field__Group_3_0_1__0 )? ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:1: ( ( rule__Field__Group_3_0_1__0 )? )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:1: ( ( rule__Field__Group_3_0_1__0 )? )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1730:1: ( rule__Field__Group_3_0_1__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_3_0_1()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1731:1: ( rule__Field__Group_3_0_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1731:2: rule__Field__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_3_0_1__0_in_rule__Field__Group_3_0__1__Impl3406);
                    rule__Field__Group_3_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0__1__Impl"


    // $ANTLR start "rule__Field__Group_3_0_0__0"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: rule__Field__Group_3_0_0__0 : rule__Field__Group_3_0_0__0__Impl rule__Field__Group_3_0_0__1 ;
    public final void rule__Field__Group_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: ( rule__Field__Group_3_0_0__0__Impl rule__Field__Group_3_0_0__1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1750:2: rule__Field__Group_3_0_0__0__Impl rule__Field__Group_3_0_0__1
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_0__0__Impl_in_rule__Field__Group_3_0_0__03441);
            rule__Field__Group_3_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_0__1_in_rule__Field__Group_3_0_0__03444);
            rule__Field__Group_3_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_0__0"


    // $ANTLR start "rule__Field__Group_3_0_0__0__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1757:1: rule__Field__Group_3_0_0__0__Impl : ( 'description' ) ;
    public final void rule__Field__Group_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1761:1: ( ( 'description' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1762:1: ( 'description' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1762:1: ( 'description' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1763:1: 'description'
            {
             before(grammarAccess.getFieldAccess().getDescriptionKeyword_3_0_0_0()); 
            match(input,15,FOLLOW_15_in_rule__Field__Group_3_0_0__0__Impl3472); 
             after(grammarAccess.getFieldAccess().getDescriptionKeyword_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_0__0__Impl"


    // $ANTLR start "rule__Field__Group_3_0_0__1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1776:1: rule__Field__Group_3_0_0__1 : rule__Field__Group_3_0_0__1__Impl rule__Field__Group_3_0_0__2 ;
    public final void rule__Field__Group_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1780:1: ( rule__Field__Group_3_0_0__1__Impl rule__Field__Group_3_0_0__2 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:2: rule__Field__Group_3_0_0__1__Impl rule__Field__Group_3_0_0__2
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_0__1__Impl_in_rule__Field__Group_3_0_0__13503);
            rule__Field__Group_3_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_0__2_in_rule__Field__Group_3_0_0__13506);
            rule__Field__Group_3_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_0__1"


    // $ANTLR start "rule__Field__Group_3_0_0__1__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:1: rule__Field__Group_3_0_0__1__Impl : ( ( rule__Field__DescriptionAssignment_3_0_0_1 ) ) ;
    public final void rule__Field__Group_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1792:1: ( ( ( rule__Field__DescriptionAssignment_3_0_0_1 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:1: ( ( rule__Field__DescriptionAssignment_3_0_0_1 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:1: ( ( rule__Field__DescriptionAssignment_3_0_0_1 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1794:1: ( rule__Field__DescriptionAssignment_3_0_0_1 )
            {
             before(grammarAccess.getFieldAccess().getDescriptionAssignment_3_0_0_1()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:1: ( rule__Field__DescriptionAssignment_3_0_0_1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:2: rule__Field__DescriptionAssignment_3_0_0_1
            {
            pushFollow(FOLLOW_rule__Field__DescriptionAssignment_3_0_0_1_in_rule__Field__Group_3_0_0__1__Impl3533);
            rule__Field__DescriptionAssignment_3_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getDescriptionAssignment_3_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_0__1__Impl"


    // $ANTLR start "rule__Field__Group_3_0_0__2"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:1: rule__Field__Group_3_0_0__2 : rule__Field__Group_3_0_0__2__Impl ;
    public final void rule__Field__Group_3_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1809:1: ( rule__Field__Group_3_0_0__2__Impl )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1810:2: rule__Field__Group_3_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_0__2__Impl_in_rule__Field__Group_3_0_0__23563);
            rule__Field__Group_3_0_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_0__2"


    // $ANTLR start "rule__Field__Group_3_0_0__2__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1816:1: rule__Field__Group_3_0_0__2__Impl : ( ';' ) ;
    public final void rule__Field__Group_3_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1820:1: ( ( ';' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1821:1: ( ';' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1821:1: ( ';' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1822:1: ';'
            {
             before(grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_0_2()); 
            match(input,13,FOLLOW_13_in_rule__Field__Group_3_0_0__2__Impl3591); 
             after(grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_0__2__Impl"


    // $ANTLR start "rule__Field__Group_3_0_1__0"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1841:1: rule__Field__Group_3_0_1__0 : rule__Field__Group_3_0_1__0__Impl rule__Field__Group_3_0_1__1 ;
    public final void rule__Field__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1845:1: ( rule__Field__Group_3_0_1__0__Impl rule__Field__Group_3_0_1__1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1846:2: rule__Field__Group_3_0_1__0__Impl rule__Field__Group_3_0_1__1
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__0__Impl_in_rule__Field__Group_3_0_1__03628);
            rule__Field__Group_3_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_1__1_in_rule__Field__Group_3_0_1__03631);
            rule__Field__Group_3_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_1__0"


    // $ANTLR start "rule__Field__Group_3_0_1__0__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1853:1: rule__Field__Group_3_0_1__0__Impl : ( '[' ) ;
    public final void rule__Field__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:1: ( ( '[' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:1: ( '[' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:1: ( '[' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: '['
            {
             before(grammarAccess.getFieldAccess().getLeftSquareBracketKeyword_3_0_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group_3_0_1__0__Impl3659); 
             after(grammarAccess.getFieldAccess().getLeftSquareBracketKeyword_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_1__0__Impl"


    // $ANTLR start "rule__Field__Group_3_0_1__1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: rule__Field__Group_3_0_1__1 : rule__Field__Group_3_0_1__1__Impl rule__Field__Group_3_0_1__2 ;
    public final void rule__Field__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1876:1: ( rule__Field__Group_3_0_1__1__Impl rule__Field__Group_3_0_1__2 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:2: rule__Field__Group_3_0_1__1__Impl rule__Field__Group_3_0_1__2
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__1__Impl_in_rule__Field__Group_3_0_1__13690);
            rule__Field__Group_3_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_1__2_in_rule__Field__Group_3_0_1__13693);
            rule__Field__Group_3_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_1__1"


    // $ANTLR start "rule__Field__Group_3_0_1__1__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1884:1: rule__Field__Group_3_0_1__1__Impl : ( ( rule__Field__LowerAssignment_3_0_1_1 ) ) ;
    public final void rule__Field__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1888:1: ( ( ( rule__Field__LowerAssignment_3_0_1_1 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: ( ( rule__Field__LowerAssignment_3_0_1_1 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: ( ( rule__Field__LowerAssignment_3_0_1_1 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1890:1: ( rule__Field__LowerAssignment_3_0_1_1 )
            {
             before(grammarAccess.getFieldAccess().getLowerAssignment_3_0_1_1()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: ( rule__Field__LowerAssignment_3_0_1_1 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:2: rule__Field__LowerAssignment_3_0_1_1
            {
            pushFollow(FOLLOW_rule__Field__LowerAssignment_3_0_1_1_in_rule__Field__Group_3_0_1__1__Impl3720);
            rule__Field__LowerAssignment_3_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getLowerAssignment_3_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_1__1__Impl"


    // $ANTLR start "rule__Field__Group_3_0_1__2"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1901:1: rule__Field__Group_3_0_1__2 : rule__Field__Group_3_0_1__2__Impl rule__Field__Group_3_0_1__3 ;
    public final void rule__Field__Group_3_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1905:1: ( rule__Field__Group_3_0_1__2__Impl rule__Field__Group_3_0_1__3 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1906:2: rule__Field__Group_3_0_1__2__Impl rule__Field__Group_3_0_1__3
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__2__Impl_in_rule__Field__Group_3_0_1__23750);
            rule__Field__Group_3_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_1__3_in_rule__Field__Group_3_0_1__23753);
            rule__Field__Group_3_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_1__2"


    // $ANTLR start "rule__Field__Group_3_0_1__2__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1913:1: rule__Field__Group_3_0_1__2__Impl : ( ',' ) ;
    public final void rule__Field__Group_3_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: ( ( ',' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1918:1: ( ',' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1918:1: ( ',' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1919:1: ','
            {
             before(grammarAccess.getFieldAccess().getCommaKeyword_3_0_1_2()); 
            match(input,24,FOLLOW_24_in_rule__Field__Group_3_0_1__2__Impl3781); 
             after(grammarAccess.getFieldAccess().getCommaKeyword_3_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_1__2__Impl"


    // $ANTLR start "rule__Field__Group_3_0_1__3"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1932:1: rule__Field__Group_3_0_1__3 : rule__Field__Group_3_0_1__3__Impl rule__Field__Group_3_0_1__4 ;
    public final void rule__Field__Group_3_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:1: ( rule__Field__Group_3_0_1__3__Impl rule__Field__Group_3_0_1__4 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1937:2: rule__Field__Group_3_0_1__3__Impl rule__Field__Group_3_0_1__4
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__3__Impl_in_rule__Field__Group_3_0_1__33812);
            rule__Field__Group_3_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_1__4_in_rule__Field__Group_3_0_1__33815);
            rule__Field__Group_3_0_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_1__3"


    // $ANTLR start "rule__Field__Group_3_0_1__3__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1944:1: rule__Field__Group_3_0_1__3__Impl : ( ( rule__Field__Alternatives_3_0_1_3 ) ) ;
    public final void rule__Field__Group_3_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: ( ( ( rule__Field__Alternatives_3_0_1_3 ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: ( ( rule__Field__Alternatives_3_0_1_3 ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: ( ( rule__Field__Alternatives_3_0_1_3 ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:1: ( rule__Field__Alternatives_3_0_1_3 )
            {
             before(grammarAccess.getFieldAccess().getAlternatives_3_0_1_3()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1951:1: ( rule__Field__Alternatives_3_0_1_3 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1951:2: rule__Field__Alternatives_3_0_1_3
            {
            pushFollow(FOLLOW_rule__Field__Alternatives_3_0_1_3_in_rule__Field__Group_3_0_1__3__Impl3842);
            rule__Field__Alternatives_3_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getAlternatives_3_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_1__3__Impl"


    // $ANTLR start "rule__Field__Group_3_0_1__4"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: rule__Field__Group_3_0_1__4 : rule__Field__Group_3_0_1__4__Impl rule__Field__Group_3_0_1__5 ;
    public final void rule__Field__Group_3_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:1: ( rule__Field__Group_3_0_1__4__Impl rule__Field__Group_3_0_1__5 )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:2: rule__Field__Group_3_0_1__4__Impl rule__Field__Group_3_0_1__5
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__4__Impl_in_rule__Field__Group_3_0_1__43872);
            rule__Field__Group_3_0_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_3_0_1__5_in_rule__Field__Group_3_0_1__43875);
            rule__Field__Group_3_0_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_1__4"


    // $ANTLR start "rule__Field__Group_3_0_1__4__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1973:1: rule__Field__Group_3_0_1__4__Impl : ( ']' ) ;
    public final void rule__Field__Group_3_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1977:1: ( ( ']' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1978:1: ( ']' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1978:1: ( ']' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:1: ']'
            {
             before(grammarAccess.getFieldAccess().getRightSquareBracketKeyword_3_0_1_4()); 
            match(input,25,FOLLOW_25_in_rule__Field__Group_3_0_1__4__Impl3903); 
             after(grammarAccess.getFieldAccess().getRightSquareBracketKeyword_3_0_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_1__4__Impl"


    // $ANTLR start "rule__Field__Group_3_0_1__5"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:1: rule__Field__Group_3_0_1__5 : rule__Field__Group_3_0_1__5__Impl ;
    public final void rule__Field__Group_3_0_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: ( rule__Field__Group_3_0_1__5__Impl )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:2: rule__Field__Group_3_0_1__5__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_3_0_1__5__Impl_in_rule__Field__Group_3_0_1__53934);
            rule__Field__Group_3_0_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_1__5"


    // $ANTLR start "rule__Field__Group_3_0_1__5__Impl"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2003:1: rule__Field__Group_3_0_1__5__Impl : ( ';' ) ;
    public final void rule__Field__Group_3_0_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2007:1: ( ( ';' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2008:1: ( ';' )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2008:1: ( ';' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2009:1: ';'
            {
             before(grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_1_5()); 
            match(input,13,FOLLOW_13_in_rule__Field__Group_3_0_1__5__Impl3962); 
             after(grammarAccess.getFieldAccess().getSemicolonKeyword_3_0_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_3_0_1__5__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2035:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: ( ( RULE_ID ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: ( RULE_ID )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: ( RULE_ID )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_14010); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__DescriptionAssignment_3_1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2050:1: rule__Model__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Model__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2054:1: ( ( RULE_STRING ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2055:1: ( RULE_STRING )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2055:1: ( RULE_STRING )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2056:1: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__DescriptionAssignment_3_14041); 
             after(grammarAccess.getModelAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Model__DataTypesAssignment_4"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2065:1: rule__Model__DataTypesAssignment_4 : ( ruleEntity ) ;
    public final void rule__Model__DataTypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: ( ( ruleEntity ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2070:1: ( ruleEntity )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2070:1: ( ruleEntity )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:1: ruleEntity
            {
             before(grammarAccess.getModelAccess().getDataTypesEntityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Model__DataTypesAssignment_44072);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDataTypesEntityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DataTypesAssignment_4"


    // $ANTLR start "rule__Model__SystemsAssignment_5"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2080:1: rule__Model__SystemsAssignment_5 : ( ruleSystem ) ;
    public final void rule__Model__SystemsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2084:1: ( ( ruleSystem ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2085:1: ( ruleSystem )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2085:1: ( ruleSystem )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: ruleSystem
            {
             before(grammarAccess.getModelAccess().getSystemsSystemParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleSystem_in_rule__Model__SystemsAssignment_54103);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSystemsSystemParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SystemsAssignment_5"


    // $ANTLR start "rule__System__NameAssignment_1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2095:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:1: ( ( RULE_ID ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:1: ( RULE_ID )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:1: ( RULE_ID )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2101:1: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__System__NameAssignment_14134); 
             after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__DescriptionAssignment_3_1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2110:1: rule__System__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__System__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2114:1: ( ( RULE_STRING ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2115:1: ( RULE_STRING )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2115:1: ( RULE_STRING )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:1: RULE_STRING
            {
             before(grammarAccess.getSystemAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__System__DescriptionAssignment_3_14165); 
             after(grammarAccess.getSystemAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__DescriptionAssignment_3_1"


    // $ANTLR start "rule__System__ImportsAssignment_4"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2125:1: rule__System__ImportsAssignment_4 : ( ruleDefinitionImport ) ;
    public final void rule__System__ImportsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2129:1: ( ( ruleDefinitionImport ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:1: ( ruleDefinitionImport )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:1: ( ruleDefinitionImport )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2131:1: ruleDefinitionImport
            {
             before(grammarAccess.getSystemAccess().getImportsDefinitionImportParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDefinitionImport_in_rule__System__ImportsAssignment_44196);
            ruleDefinitionImport();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getImportsDefinitionImportParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__ImportsAssignment_4"


    // $ANTLR start "rule__System__DataTypesAssignment_5"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2140:1: rule__System__DataTypesAssignment_5 : ( ruleEntity ) ;
    public final void rule__System__DataTypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ( ( ruleEntity ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2145:1: ( ruleEntity )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2145:1: ( ruleEntity )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:1: ruleEntity
            {
             before(grammarAccess.getSystemAccess().getDataTypesEntityParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__System__DataTypesAssignment_54227);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getDataTypesEntityParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__DataTypesAssignment_5"


    // $ANTLR start "rule__DefinitionImport__DefinitionAssignment_1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2155:1: rule__DefinitionImport__DefinitionAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__DefinitionImport__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2159:1: ( ( ( ruleFQN ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2160:1: ( ( ruleFQN ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2160:1: ( ( ruleFQN ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:1: ( ruleFQN )
            {
             before(grammarAccess.getDefinitionImportAccess().getDefinitionDefinitionCrossReference_1_0()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:1: ( ruleFQN )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2163:1: ruleFQN
            {
             before(grammarAccess.getDefinitionImportAccess().getDefinitionDefinitionFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__DefinitionImport__DefinitionAssignment_14262);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getDefinitionImportAccess().getDefinitionDefinitionFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDefinitionImportAccess().getDefinitionDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionImport__DefinitionAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2174:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2178:1: ( ( RULE_ID ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2179:1: ( RULE_ID )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2179:1: ( RULE_ID )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_14297); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__DescriptionAssignment_3_1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2189:1: rule__Entity__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Entity__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: ( ( RULE_STRING ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:1: ( RULE_STRING )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:1: ( RULE_STRING )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:1: RULE_STRING
            {
             before(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_3_14328); 
             after(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Entity__FieldsAssignment_4"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2204:1: rule__Entity__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2208:1: ( ( ruleField ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: ( ruleField )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: ( ruleField )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:1: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__Entity__FieldsAssignment_44359);
            ruleField();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FieldsAssignment_4"


    // $ANTLR start "rule__BuiltInType__NameAssignment_0"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2219:1: rule__BuiltInType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BuiltInType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: ( ( RULE_ID ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2224:1: ( RULE_ID )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2224:1: ( RULE_ID )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2225:1: RULE_ID
            {
             before(grammarAccess.getBuiltInTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BuiltInType__NameAssignment_04390); 
             after(grammarAccess.getBuiltInTypeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInType__NameAssignment_0"


    // $ANTLR start "rule__BuiltInType__DescriptionAssignment_1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2234:1: rule__BuiltInType__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__BuiltInType__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2238:1: ( ( RULE_STRING ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2239:1: ( RULE_STRING )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2239:1: ( RULE_STRING )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2240:1: RULE_STRING
            {
             before(grammarAccess.getBuiltInTypeAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BuiltInType__DescriptionAssignment_14421); 
             after(grammarAccess.getBuiltInTypeAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInType__DescriptionAssignment_1"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: ( ( RULE_ID ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2254:1: ( RULE_ID )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2254:1: ( RULE_ID )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_04452); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_0"


    // $ANTLR start "rule__Field__TypeAssignment_2"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2264:1: rule__Field__TypeAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Field__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2268:1: ( ( ( ruleFQN ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:1: ( ( ruleFQN ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:1: ( ( ruleFQN ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2270:1: ( ruleFQN )
            {
             before(grammarAccess.getFieldAccess().getTypeDataTypeCrossReference_2_0()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2271:1: ( ruleFQN )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2272:1: ruleFQN
            {
             before(grammarAccess.getFieldAccess().getTypeDataTypeFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Field__TypeAssignment_24487);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeDataTypeFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getTypeDataTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeAssignment_2"


    // $ANTLR start "rule__Field__DescriptionAssignment_3_0_0_1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2283:1: rule__Field__DescriptionAssignment_3_0_0_1 : ( RULE_STRING ) ;
    public final void rule__Field__DescriptionAssignment_3_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2287:1: ( ( RULE_STRING ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2288:1: ( RULE_STRING )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2288:1: ( RULE_STRING )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2289:1: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getDescriptionSTRINGTerminalRuleCall_3_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__DescriptionAssignment_3_0_0_14522); 
             after(grammarAccess.getFieldAccess().getDescriptionSTRINGTerminalRuleCall_3_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__DescriptionAssignment_3_0_0_1"


    // $ANTLR start "rule__Field__LowerAssignment_3_0_1_1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:1: rule__Field__LowerAssignment_3_0_1_1 : ( RULE_INT ) ;
    public final void rule__Field__LowerAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: ( ( RULE_INT ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:1: ( RULE_INT )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:1: ( RULE_INT )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2304:1: RULE_INT
            {
             before(grammarAccess.getFieldAccess().getLowerINTTerminalRuleCall_3_0_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Field__LowerAssignment_3_0_1_14553); 
             after(grammarAccess.getFieldAccess().getLowerINTTerminalRuleCall_3_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__LowerAssignment_3_0_1_1"


    // $ANTLR start "rule__Field__UpperUnlimitedAssignment_3_0_1_3_0"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:1: rule__Field__UpperUnlimitedAssignment_3_0_1_3_0 : ( ( '*' ) ) ;
    public final void rule__Field__UpperUnlimitedAssignment_3_0_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2317:1: ( ( ( '*' ) ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2318:1: ( ( '*' ) )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2318:1: ( ( '*' ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2319:1: ( '*' )
            {
             before(grammarAccess.getFieldAccess().getUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0()); 
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2320:1: ( '*' )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2321:1: '*'
            {
             before(grammarAccess.getFieldAccess().getUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0()); 
            match(input,26,FOLLOW_26_in_rule__Field__UpperUnlimitedAssignment_3_0_1_3_04589); 
             after(grammarAccess.getFieldAccess().getUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0()); 

            }

             after(grammarAccess.getFieldAccess().getUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__UpperUnlimitedAssignment_3_0_1_3_0"


    // $ANTLR start "rule__Field__UpperAssignment_3_0_1_3_1"
    // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2336:1: rule__Field__UpperAssignment_3_0_1_3_1 : ( RULE_INT ) ;
    public final void rule__Field__UpperAssignment_3_0_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: ( ( RULE_INT ) )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( RULE_INT )
            {
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( RULE_INT )
            // ../org.johnf.mydsl2.ui/src-gen/org/johnf/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:1: RULE_INT
            {
             before(grammarAccess.getFieldAccess().getUpperINTTerminalRuleCall_3_0_1_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Field__UpperAssignment_3_0_1_3_14628); 
             after(grammarAccess.getFieldAccess().getUpperINTTerminalRuleCall_3_0_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__UpperAssignment_3_0_1_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0_in_ruleSystem154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionImport_in_entryRuleDefinitionImport181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionImport188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionImport__Group__0_in_ruleDefinitionImport214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDefinition274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInType_in_entryRuleBuiltInType484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInType491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInType__Group__0_in_ruleBuiltInType517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInType_in_rule__DataType__Alternatives615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__DataType__Alternatives632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0__0_in_rule__Field__Alternatives_3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Field__Alternatives_3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__UpperUnlimitedAssignment_3_0_1_3_0_in_rule__Field__Alternatives_3_0_1_3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__UpperAssignment_3_0_1_3_1_in_rule__Field__Alternatives_3_0_1_3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group__0__Impl797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1828 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2888 = new BitSet(new long[]{0x0000000000218000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group__2__Impl919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3950 = new BitSet(new long[]{0x0000000000218000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41011 = new BitSet(new long[]{0x0000000000218000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DataTypesAssignment_4_in_rule__Model__Group__4__Impl1041 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SystemsAssignment_5_in_rule__Model__Group__5__Impl1099 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__01142 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__01145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__Group_3__0__Impl1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__11204 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__11207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DescriptionAssignment_3_1_in_rule__Model__Group_3__1__Impl1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__21264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group_3__2__Impl1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__01329 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__01332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__System__Group__0__Impl1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__11391 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__11394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__21451 = new BitSet(new long[]{0x00000000002C8000L});
    public static final BitSet FOLLOW_rule__System__Group__3_in_rule__System__Group__21454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__System__Group__2__Impl1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__31513 = new BitSet(new long[]{0x00000000002C8000L});
    public static final BitSet FOLLOW_rule__System__Group__4_in_rule__System__Group__31516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_3__0_in_rule__System__Group__3__Impl1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__41574 = new BitSet(new long[]{0x00000000002C8000L});
    public static final BitSet FOLLOW_rule__System__Group__5_in_rule__System__Group__41577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__ImportsAssignment_4_in_rule__System__Group__4__Impl1604 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__System__Group__5__Impl_in_rule__System__Group__51635 = new BitSet(new long[]{0x00000000002C8000L});
    public static final BitSet FOLLOW_rule__System__Group__6_in_rule__System__Group__51638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__DataTypesAssignment_5_in_rule__System__Group__5__Impl1665 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__System__Group__6__Impl_in_rule__System__Group__61696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__System__Group__6__Impl1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_3__0__Impl_in_rule__System__Group_3__01769 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__System__Group_3__1_in_rule__System__Group_3__01772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__System__Group_3__0__Impl1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_3__1__Impl_in_rule__System__Group_3__11831 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__System__Group_3__2_in_rule__System__Group_3__11834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__DescriptionAssignment_3_1_in_rule__System__Group_3__1__Impl1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_3__2__Impl_in_rule__System__Group_3__21891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__System__Group_3__2__Impl1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionImport__Group__0__Impl_in_rule__DefinitionImport__Group__01956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DefinitionImport__Group__1_in_rule__DefinitionImport__Group__01959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DefinitionImport__Group__0__Impl1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionImport__Group__1__Impl_in_rule__DefinitionImport__Group__12018 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__DefinitionImport__Group__2_in_rule__DefinitionImport__Group__12021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionImport__DefinitionAssignment_1_in_rule__DefinitionImport__Group__1__Impl2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionImport__Group__2__Impl_in_rule__DefinitionImport__Group__22078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DefinitionImport__Group__2__Impl2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02143 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2229 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FQN__Group_1__0__Impl2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__12326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group__0__Impl2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12448 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__22508 = new BitSet(new long[]{0x0000000000048010L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__2__Impl2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__32570 = new BitSet(new long[]{0x0000000000048010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42631 = new BitSet(new long[]{0x0000000000048010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FieldsAssignment_4_in_rule__Entity__Group__4__Impl2661 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Entity__Group__5__Impl2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__02763 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__02766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group_3__0__Impl2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12825 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__2_in_rule__Entity__Group_3__12828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__DescriptionAssignment_3_1_in_rule__Entity__Group_3__1__Impl2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__2__Impl_in_rule__Entity__Group_3__22885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Entity__Group_3__2__Impl2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInType__Group__0__Impl_in_rule__BuiltInType__Group__02950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BuiltInType__Group__1_in_rule__BuiltInType__Group__02953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInType__NameAssignment_0_in_rule__BuiltInType__Group__0__Impl2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInType__Group__1__Impl_in_rule__BuiltInType__Group__13010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInType__DescriptionAssignment_1_in_rule__BuiltInType__Group__1__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03071 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__1__Impl3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23193 = new BitSet(new long[]{0x000000000080A000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_2_in_rule__Field__Group__2__Impl3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_3_in_rule__Field__Group__3__Impl3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0__0__Impl_in_rule__Field__Group_3_0__03318 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0__1_in_rule__Field__Group_3_0__03321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__0_in_rule__Field__Group_3_0__0__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0__1__Impl_in_rule__Field__Group_3_0__13379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__0_in_rule__Field__Group_3_0__1__Impl3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__0__Impl_in_rule__Field__Group_3_0_0__03441 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__1_in_rule__Field__Group_3_0_0__03444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Field__Group_3_0_0__0__Impl3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__1__Impl_in_rule__Field__Group_3_0_0__13503 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__2_in_rule__Field__Group_3_0_0__13506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__DescriptionAssignment_3_0_0_1_in_rule__Field__Group_3_0_0__1__Impl3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_0__2__Impl_in_rule__Field__Group_3_0_0__23563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Field__Group_3_0_0__2__Impl3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__0__Impl_in_rule__Field__Group_3_0_1__03628 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__1_in_rule__Field__Group_3_0_1__03631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group_3_0_1__0__Impl3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__1__Impl_in_rule__Field__Group_3_0_1__13690 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__2_in_rule__Field__Group_3_0_1__13693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__LowerAssignment_3_0_1_1_in_rule__Field__Group_3_0_1__1__Impl3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__2__Impl_in_rule__Field__Group_3_0_1__23750 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__3_in_rule__Field__Group_3_0_1__23753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Field__Group_3_0_1__2__Impl3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__3__Impl_in_rule__Field__Group_3_0_1__33812 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__4_in_rule__Field__Group_3_0_1__33815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_3_0_1_3_in_rule__Field__Group_3_0_1__3__Impl3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__4__Impl_in_rule__Field__Group_3_0_1__43872 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__5_in_rule__Field__Group_3_0_1__43875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Field__Group_3_0_1__4__Impl3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_3_0_1__5__Impl_in_rule__Field__Group_3_0_1__53934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Field__Group_3_0_1__5__Impl3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_14010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__DescriptionAssignment_3_14041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Model__DataTypesAssignment_44072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_rule__Model__SystemsAssignment_54103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__System__NameAssignment_14134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__System__DescriptionAssignment_3_14165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionImport_in_rule__System__ImportsAssignment_44196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__System__DataTypesAssignment_54227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__DefinitionImport__DefinitionAssignment_14262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_14297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_3_14328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Entity__FieldsAssignment_44359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BuiltInType__NameAssignment_04390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BuiltInType__DescriptionAssignment_14421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_04452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Field__TypeAssignment_24487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__DescriptionAssignment_3_0_0_14522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Field__LowerAssignment_3_0_1_14553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Field__UpperUnlimitedAssignment_3_0_1_3_04589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Field__UpperAssignment_3_0_1_3_14628 = new BitSet(new long[]{0x0000000000000002L});

}