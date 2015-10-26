package org.johnf.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_DATE=7;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_DECIMAL=8;
    public static final int RULE_WS=11;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:11:7: ( 'workspace' )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:11:9: 'workspace'
            {
            match("workspace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:12:7: ( ';' )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:13:7: ( 'description' )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:13:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:14:7: ( '.' )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:14:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:15:7: ( 'entity' )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:15:9: 'entity'
            {
            match("entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:16:7: ( '{' )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:17:7: ( '}' )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:18:7: ( ':' )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:18:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:19:7: ( '[' )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:19:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:20:7: ( ',' )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:21:7: ( '*' )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:21:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:22:7: ( ']' )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:22:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "RULE_DATE"
    public final void mRULE_DATE() throws RecognitionException {
        try {
            int _type = RULE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:509:11: ( '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:509:13: '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match('-'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match('-'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:511:10: ( ( '-' )? ( '0' .. '9' )+ )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:511:12: ( '-' )? ( '0' .. '9' )+
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:511:12: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:511:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:511:17: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:511:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:513:14: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:513:16: ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:513:16: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:513:16: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:513:21: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:513:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match('.'); 
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:513:37: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:513:38: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:515:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:515:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:515:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:515:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:515:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:517:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:517:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:517:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:517:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:517:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:517:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:517:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:517:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:517:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:517:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:517:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:519:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:519:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:519:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:519:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:521:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:521:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:521:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:521:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:521:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:521:41: ( '\\r' )? '\\n'
                    {
                    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:521:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:521:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:523:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:523:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:523:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:525:16: ( . )
            // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:525:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_DATE | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=21;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:82: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 14 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:92: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 15 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:101: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 16 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:114: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:122: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 18 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:134: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 19 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:150: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 20 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:166: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 21 :
                // ../org.johnf.mydsl/src-gen/org/johnf/parser/antlr/internal/InternalMyDsl.g:1:174: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\27\1\uffff\1\27\1\uffff\1\27\7\uffff\1\45\2\25\1\uffff\3\25\2\uffff\1\27\2\uffff\1\27\1\uffff\1\27\7\uffff\1\45\2\uffff\1\45\4\uffff\3\27\1\45\3\27\1\45\3\27\1\uffff\2\27\1\74\2\27\1\uffff\2\27\1\101\1\27\1\uffff\1\27\1\104\1\uffff";
    static final String DFA16_eofS =
        "\105\uffff";
    static final String DFA16_minS =
        "\1\0\1\157\1\uffff\1\145\1\uffff\1\156\7\uffff\1\56\1\60\1\101\1\uffff\2\0\1\52\2\uffff\1\162\2\uffff\1\163\1\uffff\1\164\7\uffff\1\56\2\uffff\1\56\4\uffff\1\153\1\143\1\151\1\56\1\163\1\162\1\164\1\55\1\160\1\151\1\171\1\uffff\1\141\1\160\1\60\1\143\1\164\1\uffff\1\145\1\151\1\60\1\157\1\uffff\1\156\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\157\1\uffff\1\145\1\uffff\1\156\7\uffff\2\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\162\2\uffff\1\163\1\uffff\1\164\7\uffff\1\71\2\uffff\1\71\4\uffff\1\153\1\143\1\151\1\71\1\163\1\162\1\164\1\71\1\160\1\151\1\171\1\uffff\1\141\1\160\1\172\1\143\1\164\1\uffff\1\145\1\151\1\172\1\157\1\uffff\1\156\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\3\uffff\1\20\3\uffff\1\24\1\25\1\uffff\1\20\1\2\1\uffff\1\4\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\uffff\1\17\1\16\1\uffff\1\21\1\22\1\23\1\24\13\uffff\1\15\5\uffff\1\5\4\uffff\1\1\2\uffff\1\3";
    static final String DFA16_specialS =
        "\1\0\20\uffff\1\1\1\2\62\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\21\4\25\1\22\2\25\1\13\1\25\1\12\1\16\1\4\1\23\12\15\1\10\1\2\5\25\32\20\1\11\1\25\1\14\1\17\1\20\1\25\3\20\1\3\1\5\21\20\1\1\3\20\1\6\1\25\1\7\uff82\25",
            "\1\26",
            "",
            "\1\31",
            "",
            "\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\43",
            "\12\46",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\0\47",
            "\0\47",
            "\1\50\4\uffff\1\51",
            "",
            "",
            "\1\53",
            "",
            "",
            "\1\54",
            "",
            "\1\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\56",
            "",
            "",
            "\1\44\1\uffff\12\46",
            "",
            "",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\44\1\uffff\12\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66\1\44\1\uffff\12\46",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "\1\72",
            "\1\73",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\75",
            "\1\76",
            "",
            "\1\77",
            "\1\100",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\102",
            "",
            "\1\103",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_DATE | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='w') ) {s = 1;}

                        else if ( (LA16_0==';') ) {s = 2;}

                        else if ( (LA16_0=='d') ) {s = 3;}

                        else if ( (LA16_0=='.') ) {s = 4;}

                        else if ( (LA16_0=='e') ) {s = 5;}

                        else if ( (LA16_0=='{') ) {s = 6;}

                        else if ( (LA16_0=='}') ) {s = 7;}

                        else if ( (LA16_0==':') ) {s = 8;}

                        else if ( (LA16_0=='[') ) {s = 9;}

                        else if ( (LA16_0==',') ) {s = 10;}

                        else if ( (LA16_0=='*') ) {s = 11;}

                        else if ( (LA16_0==']') ) {s = 12;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 13;}

                        else if ( (LA16_0=='-') ) {s = 14;}

                        else if ( (LA16_0=='^') ) {s = 15;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='c')||(LA16_0>='f' && LA16_0<='v')||(LA16_0>='x' && LA16_0<='z')) ) {s = 16;}

                        else if ( (LA16_0=='\"') ) {s = 17;}

                        else if ( (LA16_0=='\'') ) {s = 18;}

                        else if ( (LA16_0=='/') ) {s = 19;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 20;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<=')')||LA16_0=='+'||(LA16_0>='<' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_17 = input.LA(1);

                        s = -1;
                        if ( ((LA16_17>='\u0000' && LA16_17<='\uFFFF')) ) {s = 39;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_18 = input.LA(1);

                        s = -1;
                        if ( ((LA16_18>='\u0000' && LA16_18<='\uFFFF')) ) {s = 39;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}