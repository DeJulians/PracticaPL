// Generated from C:/Users/USER/OneDrive/Documentos/GitHub/PracticaPL/src\gramatica.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, RESERVED=30, TYPE=31, 
		VOID=32, CONST_DEF_IDENTIFIER=33, IDENTIFIER=34, NUMERIC_INTEGER_CONST=35, 
		NUMERIC_REAL_CONST=36, STRING_CONST=37, COMENTS=38, Aux_text=39, Aux_simb=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "RESERVED", "TYPE", "VOID", "CONST_DEF_IDENTIFIER", 
			"IDENTIFIER", "NUMERIC_INTEGER_CONST", "NUMERIC_REAL_CONST", "STRING_CONST", 
			"COMENTS", "Aux_text", "Aux_simb"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'#define'", "';'", "'='", "'struct'", "'('", "')'", 
			"','", "'Main'", "'if'", "'else'", "'while'", "'do'", "'for'", "'||'", 
			"'&'", "'!'", "'<'", "'>'", "'<='", "'>='", "'=='", "'return'", "'+'", 
			"'-'", "'*'", "'DIV'", "'MOD'", null, null, "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "RESERVED", "TYPE", "VOID", "CONST_DEF_IDENTIFIER", 
			"IDENTIFIER", "NUMERIC_INTEGER_CONST", "NUMERIC_REAL_CONST", "STRING_CONST", 
			"COMENTS", "Aux_text", "Aux_simb"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public gramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000(\u01ef\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u012e\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0157"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0005 \u015f\b \n \f \u0162\t \u0001 \u0005 \u0165\b \n \f \u0168\t"+
		" \u0001 \u0004 \u016b\b \u000b \f \u016c\u0001 \u0005 \u0170\b \n \f "+
		"\u0173\t \u0001!\u0005!\u0176\b!\n!\f!\u0179\t!\u0001!\u0005!\u017c\b"+
		"!\n!\f!\u017f\t!\u0001!\u0004!\u0182\b!\u000b!\f!\u0183\u0001!\u0005!"+
		"\u0187\b!\n!\f!\u018a\t!\u0001\"\u0003\"\u018d\b\"\u0001\"\u0004\"\u0190"+
		"\b\"\u000b\"\f\"\u0191\u0001#\u0001#\u0001#\u0004#\u0197\b#\u000b#\f#"+
		"\u0198\u0001#\u0003#\u019c\b#\u0001#\u0001#\u0004#\u01a0\b#\u000b#\f#"+
		"\u01a1\u0001#\u0001#\u0001#\u0004#\u01a7\b#\u000b#\f#\u01a8\u0003#\u01ab"+
		"\b#\u0001#\u0001#\u0003#\u01af\b#\u0001#\u0004#\u01b2\b#\u000b#\f#\u01b3"+
		"\u0003#\u01b6\b#\u0001$\u0001$\u0001$\u0005$\u01bb\b$\n$\f$\u01be\t$\u0001"+
		"$\u0001$\u0001$\u0001$\u0005$\u01c4\b$\n$\f$\u01c7\t$\u0001$\u0003$\u01ca"+
		"\b$\u0001%\u0001%\u0001%\u0001%\u0004%\u01d0\b%\u000b%\f%\u01d1\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0004%\u01dc\b%\u000b"+
		"%\f%\u01dd\u0001%\u0001%\u0001%\u0003%\u01e3\b%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u01ea\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0000\u0000("+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%"+
		"K&M\'O(\u0001\u0000\u000b\u0001\u0000AZ\u0003\u000009AZ__\u0001\u0000"+
		"az\u0003\u000009__az\u0002\u0000++--\u0001\u000009\u0002\u0000EEee\u0003"+
		"\u000009AZaz\b\u0000\"\"$$\')..@@\\\\{{}}\u0002\u0000##%%\u0003\u0000"+
		"\n\n\r\r  \u0229\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
		"O\u0001\u0000\u0000\u0000\u0001Q\u0001\u0000\u0000\u0000\u0003S\u0001"+
		"\u0000\u0000\u0000\u0005U\u0001\u0000\u0000\u0000\u0007]\u0001\u0000\u0000"+
		"\u0000\t_\u0001\u0000\u0000\u0000\u000ba\u0001\u0000\u0000\u0000\rh\u0001"+
		"\u0000\u0000\u0000\u000fj\u0001\u0000\u0000\u0000\u0011l\u0001\u0000\u0000"+
		"\u0000\u0013n\u0001\u0000\u0000\u0000\u0015s\u0001\u0000\u0000\u0000\u0017"+
		"v\u0001\u0000\u0000\u0000\u0019{\u0001\u0000\u0000\u0000\u001b\u0081\u0001"+
		"\u0000\u0000\u0000\u001d\u0084\u0001\u0000\u0000\u0000\u001f\u0088\u0001"+
		"\u0000\u0000\u0000!\u008b\u0001\u0000\u0000\u0000#\u008d\u0001\u0000\u0000"+
		"\u0000%\u008f\u0001\u0000\u0000\u0000\'\u0091\u0001\u0000\u0000\u0000"+
		")\u0093\u0001\u0000\u0000\u0000+\u0096\u0001\u0000\u0000\u0000-\u0099"+
		"\u0001\u0000\u0000\u0000/\u009c\u0001\u0000\u0000\u00001\u00a3\u0001\u0000"+
		"\u0000\u00003\u00a5\u0001\u0000\u0000\u00005\u00a7\u0001\u0000\u0000\u0000"+
		"7\u00a9\u0001\u0000\u0000\u00009\u00ad\u0001\u0000\u0000\u0000;\u012d"+
		"\u0001\u0000\u0000\u0000=\u0156\u0001\u0000\u0000\u0000?\u0158\u0001\u0000"+
		"\u0000\u0000A\u0160\u0001\u0000\u0000\u0000C\u0177\u0001\u0000\u0000\u0000"+
		"E\u018c\u0001\u0000\u0000\u0000G\u01b5\u0001\u0000\u0000\u0000I\u01c9"+
		"\u0001\u0000\u0000\u0000K\u01e2\u0001\u0000\u0000\u0000M\u01e9\u0001\u0000"+
		"\u0000\u0000O\u01eb\u0001\u0000\u0000\u0000QR\u0005{\u0000\u0000R\u0002"+
		"\u0001\u0000\u0000\u0000ST\u0005}\u0000\u0000T\u0004\u0001\u0000\u0000"+
		"\u0000UV\u0005#\u0000\u0000VW\u0005d\u0000\u0000WX\u0005e\u0000\u0000"+
		"XY\u0005f\u0000\u0000YZ\u0005i\u0000\u0000Z[\u0005n\u0000\u0000[\\\u0005"+
		"e\u0000\u0000\\\u0006\u0001\u0000\u0000\u0000]^\u0005;\u0000\u0000^\b"+
		"\u0001\u0000\u0000\u0000_`\u0005=\u0000\u0000`\n\u0001\u0000\u0000\u0000"+
		"ab\u0005s\u0000\u0000bc\u0005t\u0000\u0000cd\u0005r\u0000\u0000de\u0005"+
		"u\u0000\u0000ef\u0005c\u0000\u0000fg\u0005t\u0000\u0000g\f\u0001\u0000"+
		"\u0000\u0000hi\u0005(\u0000\u0000i\u000e\u0001\u0000\u0000\u0000jk\u0005"+
		")\u0000\u0000k\u0010\u0001\u0000\u0000\u0000lm\u0005,\u0000\u0000m\u0012"+
		"\u0001\u0000\u0000\u0000no\u0005M\u0000\u0000op\u0005a\u0000\u0000pq\u0005"+
		"i\u0000\u0000qr\u0005n\u0000\u0000r\u0014\u0001\u0000\u0000\u0000st\u0005"+
		"i\u0000\u0000tu\u0005f\u0000\u0000u\u0016\u0001\u0000\u0000\u0000vw\u0005"+
		"e\u0000\u0000wx\u0005l\u0000\u0000xy\u0005s\u0000\u0000yz\u0005e\u0000"+
		"\u0000z\u0018\u0001\u0000\u0000\u0000{|\u0005w\u0000\u0000|}\u0005h\u0000"+
		"\u0000}~\u0005i\u0000\u0000~\u007f\u0005l\u0000\u0000\u007f\u0080\u0005"+
		"e\u0000\u0000\u0080\u001a\u0001\u0000\u0000\u0000\u0081\u0082\u0005d\u0000"+
		"\u0000\u0082\u0083\u0005o\u0000\u0000\u0083\u001c\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005f\u0000\u0000\u0085\u0086\u0005o\u0000\u0000\u0086\u0087"+
		"\u0005r\u0000\u0000\u0087\u001e\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"|\u0000\u0000\u0089\u008a\u0005|\u0000\u0000\u008a \u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005&\u0000\u0000\u008c\"\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005!\u0000\u0000\u008e$\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005<\u0000\u0000\u0090&\u0001\u0000\u0000\u0000\u0091\u0092\u0005>"+
		"\u0000\u0000\u0092(\u0001\u0000\u0000\u0000\u0093\u0094\u0005<\u0000\u0000"+
		"\u0094\u0095\u0005=\u0000\u0000\u0095*\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0005>\u0000\u0000\u0097\u0098\u0005=\u0000\u0000\u0098,\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0005=\u0000\u0000\u009a\u009b\u0005=\u0000\u0000"+
		"\u009b.\u0001\u0000\u0000\u0000\u009c\u009d\u0005r\u0000\u0000\u009d\u009e"+
		"\u0005e\u0000\u0000\u009e\u009f\u0005t\u0000\u0000\u009f\u00a0\u0005u"+
		"\u0000\u0000\u00a0\u00a1\u0005r\u0000\u0000\u00a1\u00a2\u0005n\u0000\u0000"+
		"\u00a20\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005+\u0000\u0000\u00a42"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005-\u0000\u0000\u00a64\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0005*\u0000\u0000\u00a86\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0005D\u0000\u0000\u00aa\u00ab\u0005I\u0000\u0000\u00ab\u00ac"+
		"\u0005V\u0000\u0000\u00ac8\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005M"+
		"\u0000\u0000\u00ae\u00af\u0005O\u0000\u0000\u00af\u00b0\u0005D\u0000\u0000"+
		"\u00b0:\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005b\u0000\u0000\u00b2\u00b3"+
		"\u0005r\u0000\u0000\u00b3\u00b4\u0005e\u0000\u0000\u00b4\u00b5\u0005a"+
		"\u0000\u0000\u00b5\u012e\u0005k\u0000\u0000\u00b6\u00b7\u0005r\u0000\u0000"+
		"\u00b7\u00b8\u0005e\u0000\u0000\u00b8\u00b9\u0005g\u0000\u0000\u00b9\u00ba"+
		"\u0005i\u0000\u0000\u00ba\u00bb\u0005s\u0000\u0000\u00bb\u00bc\u0005t"+
		"\u0000\u0000\u00bc\u00bd\u0005e\u0000\u0000\u00bd\u012e\u0005r\u0000\u0000"+
		"\u00be\u00bf\u0005c\u0000\u0000\u00bf\u00c0\u0005a\u0000\u0000\u00c0\u00c1"+
		"\u0005s\u0000\u0000\u00c1\u012e\u0005e\u0000\u0000\u00c2\u00c3\u0005r"+
		"\u0000\u0000\u00c3\u00c4\u0005e\u0000\u0000\u00c4\u00c5\u0005t\u0000\u0000"+
		"\u00c5\u00c6\u0005u\u0000\u0000\u00c6\u00c7\u0005r\u0000\u0000\u00c7\u012e"+
		"\u0005n\u0000\u0000\u00c8\u00c9\u0005f\u0000\u0000\u00c9\u00ca\u0005o"+
		"\u0000\u0000\u00ca\u012e\u0005r\u0000\u0000\u00cb\u00cc\u0005i\u0000\u0000"+
		"\u00cc\u012e\u0005f\u0000\u0000\u00cd\u00ce\u0005e\u0000\u0000\u00ce\u00cf"+
		"\u0005l\u0000\u0000\u00cf\u00d0\u0005s\u0000\u0000\u00d0\u012e\u0005e"+
		"\u0000\u0000\u00d1\u00d2\u0005s\u0000\u0000\u00d2\u00d3\u0005w\u0000\u0000"+
		"\u00d3\u00d4\u0005i\u0000\u0000\u00d4\u00d5\u0005t\u0000\u0000\u00d5\u00d6"+
		"\u0005c\u0000\u0000\u00d6\u012e\u0005h\u0000\u0000\u00d7\u00d8\u0005u"+
		"\u0000\u0000\u00d8\u00d9\u0005n\u0000\u0000\u00d9\u00da\u0005i\u0000\u0000"+
		"\u00da\u00db\u0005o\u0000\u0000\u00db\u012e\u0005n\u0000\u0000\u00dc\u00dd"+
		"\u0005d\u0000\u0000\u00dd\u00de\u0005e\u0000\u0000\u00de\u00df\u0005f"+
		"\u0000\u0000\u00df\u00e0\u0005a\u0000\u0000\u00e0\u00e1\u0005u\u0000\u0000"+
		"\u00e1\u00e2\u0005l\u0000\u0000\u00e2\u012e\u0005t\u0000\u0000\u00e3\u00e4"+
		"\u0005d\u0000\u0000\u00e4\u012e\u0005o\u0000\u0000\u00e5\u00e6\u0005t"+
		"\u0000\u0000\u00e6\u00e7\u0005y\u0000\u0000\u00e7\u00e8\u0005p\u0000\u0000"+
		"\u00e8\u00e9\u0005e\u0000\u0000\u00e9\u00ea\u0005d\u0000\u0000\u00ea\u00eb"+
		"\u0005e\u0000\u0000\u00eb\u012e\u0005f\u0000\u0000\u00ec\u00ed\u0005u"+
		"\u0000\u0000\u00ed\u00ee\u0005n\u0000\u0000\u00ee\u00ef\u0005i\u0000\u0000"+
		"\u00ef\u00f0\u0005o\u0000\u0000\u00f0\u012e\u0005n\u0000\u0000\u00f1\u00f2"+
		"\u0005s\u0000\u0000\u00f2\u00f3\u0005h\u0000\u0000\u00f3\u00f4\u0005o"+
		"\u0000\u0000\u00f4\u00f5\u0005r\u0000\u0000\u00f5\u012e\u0005t\u0000\u0000"+
		"\u00f6\u00f7\u0005u\u0000\u0000\u00f7\u00f8\u0005n\u0000\u0000\u00f8\u00f9"+
		"\u0005s\u0000\u0000\u00f9\u00fa\u0005i\u0000\u0000\u00fa\u00fb\u0005g"+
		"\u0000\u0000\u00fb\u00fc\u0005n\u0000\u0000\u00fc\u00fd\u0005e\u0000\u0000"+
		"\u00fd\u012e\u0005d\u0000\u0000\u00fe\u00ff\u0005g\u0000\u0000\u00ff\u0100"+
		"\u0005o\u0000\u0000\u0100\u0101\u0005t\u0000\u0000\u0101\u012e\u0005o"+
		"\u0000\u0000\u0102\u0103\u0005s\u0000\u0000\u0103\u0104\u0005i\u0000\u0000"+
		"\u0104\u0105\u0005z\u0000\u0000\u0105\u0106\u0005e\u0000\u0000\u0106\u0107"+
		"\u0005o\u0000\u0000\u0107\u012e\u0005f\u0000\u0000\u0108\u0109\u0005v"+
		"\u0000\u0000\u0109\u010a\u0005o\u0000\u0000\u010a\u010b\u0005l\u0000\u0000"+
		"\u010b\u010c\u0005a\u0000\u0000\u010c\u010d\u0005t\u0000\u0000\u010d\u010e"+
		"\u0005i\u0000\u0000\u010e\u010f\u0005l\u0000\u0000\u010f\u012e\u0005e"+
		"\u0000\u0000\u0110\u0111\u0005s\u0000\u0000\u0111\u0112\u0005t\u0000\u0000"+
		"\u0112\u0113\u0005a\u0000\u0000\u0113\u0114\u0005t\u0000\u0000\u0114\u0115"+
		"\u0005i\u0000\u0000\u0115\u012e\u0005c\u0000\u0000\u0116\u0117\u0005w"+
		"\u0000\u0000\u0117\u0118\u0005h\u0000\u0000\u0118\u0119\u0005i\u0000\u0000"+
		"\u0119\u011a\u0005l\u0000\u0000\u011a\u012e\u0005e\u0000\u0000\u011b\u011c"+
		"\u0005s\u0000\u0000\u011c\u011d\u0005t\u0000\u0000\u011d\u011e\u0005r"+
		"\u0000\u0000\u011e\u011f\u0005u\u0000\u0000\u011f\u0120\u0005c\u0000\u0000"+
		"\u0120\u012e\u0005t\u0000\u0000\u0121\u0122\u0005_\u0000\u0000\u0122\u0123"+
		"\u0005P\u0000\u0000\u0123\u0124\u0005a\u0000\u0000\u0124\u0125\u0005c"+
		"\u0000\u0000\u0125\u0126\u0005k\u0000\u0000\u0126\u0127\u0005e\u0000\u0000"+
		"\u0127\u012e\u0005d\u0000\u0000\u0128\u0129\u0005c\u0000\u0000\u0129\u012a"+
		"\u0005o\u0000\u0000\u012a\u012b\u0005n\u0000\u0000\u012b\u012c\u0005s"+
		"\u0000\u0000\u012c\u012e\u0005t\u0000\u0000\u012d\u00b1\u0001\u0000\u0000"+
		"\u0000\u012d\u00b6\u0001\u0000\u0000\u0000\u012d\u00be\u0001\u0000\u0000"+
		"\u0000\u012d\u00c2\u0001\u0000\u0000\u0000\u012d\u00c8\u0001\u0000\u0000"+
		"\u0000\u012d\u00cb\u0001\u0000\u0000\u0000\u012d\u00cd\u0001\u0000\u0000"+
		"\u0000\u012d\u00d1\u0001\u0000\u0000\u0000\u012d\u00d7\u0001\u0000\u0000"+
		"\u0000\u012d\u00dc\u0001\u0000\u0000\u0000\u012d\u00e3\u0001\u0000\u0000"+
		"\u0000\u012d\u00e5\u0001\u0000\u0000\u0000\u012d\u00ec\u0001\u0000\u0000"+
		"\u0000\u012d\u00f1\u0001\u0000\u0000\u0000\u012d\u00f6\u0001\u0000\u0000"+
		"\u0000\u012d\u00fe\u0001\u0000\u0000\u0000\u012d\u0102\u0001\u0000\u0000"+
		"\u0000\u012d\u0108\u0001\u0000\u0000\u0000\u012d\u0110\u0001\u0000\u0000"+
		"\u0000\u012d\u0116\u0001\u0000\u0000\u0000\u012d\u011b\u0001\u0000\u0000"+
		"\u0000\u012d\u0121\u0001\u0000\u0000\u0000\u012d\u0128\u0001\u0000\u0000"+
		"\u0000\u012e<\u0001\u0000\u0000\u0000\u012f\u0130\u0005i\u0000\u0000\u0130"+
		"\u0131\u0005n\u0000\u0000\u0131\u0132\u0005t\u0000\u0000\u0132\u0133\u0005"+
		"e\u0000\u0000\u0133\u0134\u0005g\u0000\u0000\u0134\u0135\u0005e\u0000"+
		"\u0000\u0135\u0157\u0005r\u0000\u0000\u0136\u0137\u0005f\u0000\u0000\u0137"+
		"\u0138\u0005l\u0000\u0000\u0138\u0139\u0005o\u0000\u0000\u0139\u013a\u0005"+
		"a\u0000\u0000\u013a\u0157\u0005t\u0000\u0000\u013b\u013c\u0005s\u0000"+
		"\u0000\u013c\u013d\u0005t\u0000\u0000\u013d\u013e\u0005r\u0000\u0000\u013e"+
		"\u013f\u0005i\u0000\u0000\u013f\u0140\u0005n\u0000\u0000\u0140\u0157\u0005"+
		"g\u0000\u0000\u0141\u0142\u0005l\u0000\u0000\u0142\u0143\u0005o\u0000"+
		"\u0000\u0143\u0144\u0005n\u0000\u0000\u0144\u0157\u0005g\u0000\u0000\u0145"+
		"\u0146\u0005e\u0000\u0000\u0146\u0147\u0005n\u0000\u0000\u0147\u0148\u0005"+
		"u\u0000\u0000\u0148\u0157\u0005m\u0000\u0000\u0149\u014a\u0005c\u0000"+
		"\u0000\u014a\u014b\u0005h\u0000\u0000\u014b\u014c\u0005a\u0000\u0000\u014c"+
		"\u0157\u0005r\u0000\u0000\u014d\u014e\u0005d\u0000\u0000\u014e\u014f\u0005"+
		"o\u0000\u0000\u014f\u0150\u0005u\u0000\u0000\u0150\u0151\u0005b\u0000"+
		"\u0000\u0151\u0152\u0005l\u0000\u0000\u0152\u0157\u0005e\u0000\u0000\u0153"+
		"\u0154\u0005i\u0000\u0000\u0154\u0155\u0005n\u0000\u0000\u0155\u0157\u0005"+
		"t\u0000\u0000\u0156\u012f\u0001\u0000\u0000\u0000\u0156\u0136\u0001\u0000"+
		"\u0000\u0000\u0156\u013b\u0001\u0000\u0000\u0000\u0156\u0141\u0001\u0000"+
		"\u0000\u0000\u0156\u0145\u0001\u0000\u0000\u0000\u0156\u0149\u0001\u0000"+
		"\u0000\u0000\u0156\u014d\u0001\u0000\u0000\u0000\u0156\u0153\u0001\u0000"+
		"\u0000\u0000\u0157>\u0001\u0000\u0000\u0000\u0158\u0159\u0005v\u0000\u0000"+
		"\u0159\u015a\u0005o\u0000\u0000\u015a\u015b\u0005i\u0000\u0000\u015b\u015c"+
		"\u0005d\u0000\u0000\u015c@\u0001\u0000\u0000\u0000\u015d\u015f\u0007\u0000"+
		"\u0000\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015f\u0162\u0001\u0000"+
		"\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000"+
		"\u0000\u0000\u0161\u0166\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0163\u0165\u0007\u0001\u0000\u0000\u0164\u0163\u0001\u0000"+
		"\u0000\u0000\u0165\u0168\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u016a\u0001\u0000"+
		"\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0169\u016b\u0007\u0000"+
		"\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000"+
		"\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000"+
		"\u0000\u0000\u016d\u0171\u0001\u0000\u0000\u0000\u016e\u0170\u0007\u0001"+
		"\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000"+
		"\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000"+
		"\u0000\u0000\u0172B\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000"+
		"\u0000\u0174\u0176\u0007\u0002\u0000\u0000\u0175\u0174\u0001\u0000\u0000"+
		"\u0000\u0176\u0179\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u017d\u0001\u0000\u0000"+
		"\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u017a\u017c\u0007\u0003\u0000"+
		"\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017c\u017f\u0001\u0000\u0000"+
		"\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000"+
		"\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000"+
		"\u0000\u0180\u0182\u0007\u0002\u0000\u0000\u0181\u0180\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0188\u0001\u0000\u0000"+
		"\u0000\u0185\u0187\u0007\u0003\u0000\u0000\u0186\u0185\u0001\u0000\u0000"+
		"\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189D\u0001\u0000\u0000\u0000"+
		"\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018d\u0007\u0004\u0000\u0000"+
		"\u018c\u018b\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000"+
		"\u018d\u018f\u0001\u0000\u0000\u0000\u018e\u0190\u0007\u0005\u0000\u0000"+
		"\u018f\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000"+
		"\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000"+
		"\u0192F\u0001\u0000\u0000\u0000\u0193\u0194\u0003E\"\u0000\u0194\u0196"+
		"\u0005.\u0000\u0000\u0195\u0197\u0007\u0005\u0000\u0000\u0196\u0195\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0196\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u01b6\u0001"+
		"\u0000\u0000\u0000\u019a\u019c\u0007\u0004\u0000\u0000\u019b\u019a\u0001"+
		"\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u0001"+
		"\u0000\u0000\u0000\u019d\u019f\u0005.\u0000\u0000\u019e\u01a0\u0007\u0005"+
		"\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a2\u01b6\u0001\u0000\u0000\u0000\u01a3\u01aa\u0003E\""+
		"\u0000\u01a4\u01a6\u0005.\u0000\u0000\u01a5\u01a7\u0007\u0005\u0000\u0000"+
		"\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000"+
		"\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u01a4\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ae\u0007\u0006\u0000\u0000\u01ad\u01af\u0007\u0004\u0000\u0000"+
		"\u01ae\u01ad\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000"+
		"\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u01b2\u0007\u0005\u0000\u0000"+
		"\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u0193\u0001\u0000\u0000\u0000"+
		"\u01b5\u019b\u0001\u0000\u0000\u0000\u01b5\u01a3\u0001\u0000\u0000\u0000"+
		"\u01b6H\u0001\u0000\u0000\u0000\u01b7\u01bc\u0005\'\u0000\u0000\u01b8"+
		"\u01bb\u0007\u0007\u0000\u0000\u01b9\u01bb\u0003M&\u0000\u01ba\u01b8\u0001"+
		"\u0000\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb\u01be\u0001"+
		"\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bf\u0001\u0000\u0000\u0000\u01be\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bf\u01ca\u0005\'\u0000\u0000\u01c0\u01c5\u0005\""+
		"\u0000\u0000\u01c1\u01c4\u0003M&\u0000\u01c2\u01c4\u0007\u0007\u0000\u0000"+
		"\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c8\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8\u01ca\u0005\"\u0000\u0000\u01c9"+
		"\u01b7\u0001\u0000\u0000\u0000\u01c9\u01c0\u0001\u0000\u0000\u0000\u01ca"+
		"J\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005/\u0000\u0000\u01cc\u01cd\u0005"+
		"/\u0000\u0000\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce\u01d0\u0003M&"+
		"\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005/\u0000\u0000"+
		"\u01d4\u01d5\u0005/\u0000\u0000\u01d5\u01e3\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d7\u0005/\u0000\u0000\u01d7\u01d8\u0005*\u0000\u0000\u01d8\u01db\u0001"+
		"\u0000\u0000\u0000\u01d9\u01dc\u0003M&\u0000\u01da\u01dc\u0003O\'\u0000"+
		"\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01da\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000"+
		"\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000"+
		"\u01df\u01e0\u0005*\u0000\u0000\u01e0\u01e1\u0005/\u0000\u0000\u01e1\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e2\u01cb\u0001\u0000\u0000\u0000\u01e2\u01d6"+
		"\u0001\u0000\u0000\u0000\u01e3L\u0001\u0000\u0000\u0000\u01e4\u01ea\u0007"+
		"\b\u0000\u0000\u01e5\u01e6\u0005\u00e2\u0000\u0000\u01e6\u01e7\u0005\u201a"+
		"\u0000\u0000\u01e7\u01ea\u0005\u00ac\u0000\u0000\u01e8\u01ea\u0007\t\u0000"+
		"\u0000\u01e9\u01e4\u0001\u0000\u0000\u0000\u01e9\u01e5\u0001\u0000\u0000"+
		"\u0000\u01e9\u01e8\u0001\u0000\u0000\u0000\u01eaN\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ec\u0007\n\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed"+
		"\u01ee\u0006\'\u0000\u0000\u01eeP\u0001\u0000\u0000\u0000#\u0000\u012d"+
		"\u0156\u0160\u0164\u0166\u016c\u016f\u0171\u0177\u017b\u017d\u0183\u0186"+
		"\u0188\u018c\u0191\u0198\u019b\u01a1\u01a8\u01aa\u01ae\u01b3\u01b5\u01ba"+
		"\u01bc\u01c3\u01c5\u01c9\u01d1\u01db\u01dd\u01e2\u01e9\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}