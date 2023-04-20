// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, RESERVED=16, 
		TYPE=17, VOID=18, CONST_DEF_IDENTIFIER=19, IDENTIFIER=20, NUMERIC_INTEGER_CONST=21, 
		NUMERIC_REAL_CONST=22, STRING_CONST=23, COMENTS=24, Aux_text=25, Aux_simb=26;
	public static final int
		RULE_program = 0, RULE_dcllist = 1, RULE_funlist = 2, RULE_sentlist = 3, 
		RULE_dcl = 4, RULE_ctelist = 5, RULE_ctelist1 = 6, RULE_simpvalue = 7, 
		RULE_varlist = 8, RULE_varlist1 = 9, RULE_vardef = 10, RULE_tbas = 11, 
		RULE_tvoid = 12, RULE_funcdef = 13, RULE_funchead = 14, RULE_typedef1 = 15, 
		RULE_typedef2 = 16, RULE_typedef22 = 17, RULE_mainhead = 18, RULE_code = 19, 
		RULE_sent = 20, RULE_asig = 21, RULE_exp = 22, RULE_op = 23, RULE_factor = 24, 
		RULE_funccall = 25, RULE_subpparamlist = 26, RULE_explist = 27, RULE_text = 28, 
		RULE_id = 29, RULE_const = 30, RULE_int = 31, RULE_real = 32, RULE_string = 33, 
		RULE_com = 34, RULE_aux = 35, RULE_simb = 36, RULE_resv = 37, RULE_typ = 38, 
		RULE_voi = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dcllist", "funlist", "sentlist", "dcl", "ctelist", "ctelist1", 
			"simpvalue", "varlist", "varlist1", "vardef", "tbas", "tvoid", "funcdef", 
			"funchead", "typedef1", "typedef2", "typedef22", "mainhead", "code", 
			"sent", "asig", "exp", "op", "factor", "funccall", "subpparamlist", "explist", 
			"text", "id", "const", "int", "real", "string", "com", "aux", "simb", 
			"resv", "typ", "voi"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'#define'", "';'", "'='", "'return'", "'('", "')'", 
			"','", "'Main'", "'+'", "'-'", "'*'", "'DIV'", "'MOD'", null, null, "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "RESERVED", "TYPE", "VOID", "CONST_DEF_IDENTIFIER", 
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public FunlistContext funlist() {
			return getRuleContext(FunlistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			dcllist();
			setState(81);
			funlist(0);
			setState(82);
			sentlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DcllistContext extends ParserRuleContext {
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDcllist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDcllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistContext dcllist() throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dcllist);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				dcl();
				setState(86);
				dcllist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunlistContext extends ParserRuleContext {
		public FunlistContext funlist() {
			return getRuleContext(FunlistContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public FunlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFunlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFunlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFunlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunlistContext funlist() throws RecognitionException {
		return funlist(0);
	}

	private FunlistContext funlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FunlistContext _localctx = new FunlistContext(_ctx, _parentState);
		FunlistContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_funlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_funlist);
					setState(91);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(92);
					funcdef();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentlistContext extends ParserRuleContext {
		public MainheadContext mainhead() {
			return getRuleContext(MainheadContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			mainhead();
			setState(99);
			match(T__0);
			setState(100);
			code();
			setState(101);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DclContext extends ParserRuleContext {
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dcl);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				ctelist();
				}
				break;
			case TYPE:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				varlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CtelistContext extends ParserRuleContext {
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(gramaticaParser.CONST_DEF_IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Ctelist1Context ctelist1() {
			return getRuleContext(Ctelist1Context.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCtelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCtelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistContext ctelist() throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ctelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__2);
			setState(108);
			match(CONST_DEF_IDENTIFIER);
			setState(109);
			simpvalue();
			setState(110);
			ctelist1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ctelist1Context extends ParserRuleContext {
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(gramaticaParser.CONST_DEF_IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Ctelist1Context ctelist1() {
			return getRuleContext(Ctelist1Context.class,0);
		}
		public Ctelist1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCtelist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCtelist1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCtelist1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ctelist1Context ctelist1() throws RecognitionException {
		Ctelist1Context _localctx = new Ctelist1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_ctelist1);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__2);
				setState(113);
				match(CONST_DEF_IDENTIFIER);
				setState(114);
				simpvalue();
				setState(115);
				ctelist1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpvalueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_INTEGER_CONST() { return getToken(gramaticaParser.NUMERIC_INTEGER_CONST, 0); }
		public TerminalNode NUMERIC_REAL_CONST() { return getToken(gramaticaParser.NUMERIC_REAL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(gramaticaParser.STRING_CONST, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSimpvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSimpvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simpvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarlistContext extends ParserRuleContext {
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public Varlist1Context varlist1() {
			return getRuleContext(Varlist1Context.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			vardef();
			setState(123);
			match(T__3);
			setState(124);
			varlist1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Varlist1Context extends ParserRuleContext {
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public Varlist1Context varlist1() {
			return getRuleContext(Varlist1Context.class,0);
		}
		public Varlist1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarlist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarlist1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVarlist1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varlist1Context varlist1() throws RecognitionException {
		Varlist1Context _localctx = new Varlist1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_varlist1);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				vardef();
				setState(127);
				match(T__3);
				setState(128);
				varlist1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VardefContext extends ParserRuleContext {
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVardef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVardef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vardef);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				tbas();
				setState(134);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				tbas();
				setState(137);
				match(IDENTIFIER);
				setState(138);
				match(T__4);
				setState(139);
				simpvalue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				funcdef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TbasContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(gramaticaParser.TYPE, 0); }
		public TvoidContext tvoid() {
			return getRuleContext(TvoidContext.class,0);
		}
		public TbasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTbas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTbas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTbas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TbasContext tbas() throws RecognitionException {
		TbasContext _localctx = new TbasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tbas);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(TYPE);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				tvoid();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TvoidContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(gramaticaParser.VOID, 0); }
		public TvoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tvoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTvoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TvoidContext tvoid() throws RecognitionException {
		TvoidContext _localctx = new TvoidContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tvoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(VOID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncdefContext extends ParserRuleContext {
		public FuncheadContext funchead() {
			return getRuleContext(FuncheadContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFuncdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcdef);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				funchead();
				setState(151);
				match(T__0);
				setState(152);
				code();
				setState(153);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				funchead();
				setState(156);
				match(T__0);
				setState(157);
				code();
				setState(158);
				match(T__5);
				setState(159);
				match(T__6);
				setState(160);
				match(IDENTIFIER);
				setState(161);
				match(T__7);
				setState(162);
				match(T__3);
				setState(163);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncheadContext extends ParserRuleContext {
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public Typedef1Context typedef1() {
			return getRuleContext(Typedef1Context.class,0);
		}
		public FuncheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funchead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFunchead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFunchead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFunchead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncheadContext funchead() throws RecognitionException {
		FuncheadContext _localctx = new FuncheadContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funchead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			tbas();
			setState(168);
			match(IDENTIFIER);
			setState(169);
			match(T__6);
			setState(170);
			typedef1();
			setState(171);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Typedef1Context extends ParserRuleContext {
		public Typedef2Context typedef2() {
			return getRuleContext(Typedef2Context.class,0);
		}
		public Typedef1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTypedef1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTypedef1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTypedef1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typedef1Context typedef1() throws RecognitionException {
		Typedef1Context _localctx = new Typedef1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_typedef1);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				typedef2();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Typedef2Context extends ParserRuleContext {
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public Typedef22Context typedef22() {
			return getRuleContext(Typedef22Context.class,0);
		}
		public Typedef2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTypedef2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTypedef2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTypedef2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typedef2Context typedef2() throws RecognitionException {
		Typedef2Context _localctx = new Typedef2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_typedef2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			tbas();
			setState(178);
			match(IDENTIFIER);
			setState(179);
			typedef22();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Typedef22Context extends ParserRuleContext {
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public Typedef22Context typedef22() {
			return getRuleContext(Typedef22Context.class,0);
		}
		public Typedef22Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef22; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTypedef22(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTypedef22(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTypedef22(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typedef22Context typedef22() throws RecognitionException {
		Typedef22Context _localctx = new Typedef22Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_typedef22);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(T__8);
				setState(183);
				tbas();
				setState(184);
				match(IDENTIFIER);
				setState(185);
				typedef22();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainheadContext extends ParserRuleContext {
		public TvoidContext tvoid() {
			return getRuleContext(TvoidContext.class,0);
		}
		public Typedef1Context typedef1() {
			return getRuleContext(Typedef1Context.class,0);
		}
		public MainheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMainhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMainhead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitMainhead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainheadContext mainhead() throws RecognitionException {
		MainheadContext _localctx = new MainheadContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mainhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			tvoid();
			setState(190);
			match(T__9);
			setState(191);
			match(T__6);
			setState(192);
			typedef1();
			setState(193);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeContext extends ParserRuleContext {
		public List<SentContext> sent() {
			return getRuleContexts(SentContext.class);
		}
		public SentContext sent(int i) {
			return getRuleContext(SentContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_code);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0) {
				{
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(195);
						sent();
						}
						} 
					}
					setState(200);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(201);
				sent();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentContext extends ParserRuleContext {
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sent);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				asig();
				setState(205);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				funccall();
				setState(208);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				vardef();
				setState(211);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsigContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IDENTIFIER);
			setState(216);
			match(T__4);
			setState(217);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(220);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(222);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(223);
					op();
					setState(224);
					exp(3);
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 63488L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_factor);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
			case NUMERIC_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				simpvalue();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(T__6);
				setState(235);
				exp(0);
				setState(236);
				match(T__7);
				}
				break;
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				funccall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunccallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(gramaticaParser.CONST_DEF_IDENTIFIER, 0); }
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFunccall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funccall);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(IDENTIFIER);
				setState(242);
				subpparamlist();
				}
				break;
			case CONST_DEF_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(CONST_DEF_IDENTIFIER);
				setState(244);
				subpparamlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubpparamlistContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubpparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSubpparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSubpparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSubpparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubpparamlistContext subpparamlist() throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_subpparamlist);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__6);
				setState(248);
				explist();
				setState(249);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplistContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_explist);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				exp(0);
				setState(256);
				match(T__8);
				setState(257);
				explist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public IntContext int_() {
			return getRuleContext(IntContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public AuxContext aux() {
			return getRuleContext(AuxContext.class,0);
		}
		public SimbContext simb() {
			return getRuleContext(SimbContext.class,0);
		}
		public ResvContext resv() {
			return getRuleContext(ResvContext.class,0);
		}
		public TypContext typ() {
			return getRuleContext(TypContext.class,0);
		}
		public VoiContext voi() {
			return getRuleContext(VoiContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(261);
				id();
				}
				break;
			case CONST_DEF_IDENTIFIER:
				{
				setState(262);
				const_();
				}
				break;
			case NUMERIC_INTEGER_CONST:
				{
				setState(263);
				int_();
				}
				break;
			case NUMERIC_REAL_CONST:
				{
				setState(264);
				real();
				setState(265);
				string();
				}
				break;
			case COMENTS:
				{
				setState(267);
				com();
				}
				break;
			case Aux_text:
				{
				setState(268);
				aux();
				}
				break;
			case Aux_simb:
				{
				setState(269);
				simb();
				}
				break;
			case RESERVED:
				{
				setState(270);
				resv();
				}
				break;
			case TYPE:
				{
				setState(271);
				typ();
				}
				break;
			case VOID:
				{
				setState(272);
				voi();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstContext extends ParserRuleContext {
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(gramaticaParser.CONST_DEF_IDENTIFIER, 0); }
		public ConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstContext const_() throws RecognitionException {
		ConstContext _localctx = new ConstContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(CONST_DEF_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ParserRuleContext {
		public TerminalNode NUMERIC_INTEGER_CONST() { return getToken(gramaticaParser.NUMERIC_INTEGER_CONST, 0); }
		public IntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntContext int_() throws RecognitionException {
		IntContext _localctx = new IntContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(NUMERIC_INTEGER_CONST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RealContext extends ParserRuleContext {
		public TerminalNode NUMERIC_REAL_CONST() { return getToken(gramaticaParser.NUMERIC_REAL_CONST, 0); }
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(NUMERIC_REAL_CONST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_CONST() { return getToken(gramaticaParser.STRING_CONST, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(STRING_CONST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComContext extends ParserRuleContext {
		public TerminalNode COMENTS() { return getToken(gramaticaParser.COMENTS, 0); }
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_com);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(COMENTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AuxContext extends ParserRuleContext {
		public TerminalNode Aux_text() { return getToken(gramaticaParser.Aux_text, 0); }
		public AuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxContext aux() throws RecognitionException {
		AuxContext _localctx = new AuxContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_aux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(Aux_text);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimbContext extends ParserRuleContext {
		public TerminalNode Aux_simb() { return getToken(gramaticaParser.Aux_simb, 0); }
		public SimbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSimb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSimb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSimb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimbContext simb() throws RecognitionException {
		SimbContext _localctx = new SimbContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_simb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(Aux_simb);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResvContext extends ParserRuleContext {
		public TerminalNode RESERVED() { return getToken(gramaticaParser.RESERVED, 0); }
		public ResvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterResv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitResv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitResv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResvContext resv() throws RecognitionException {
		ResvContext _localctx = new ResvContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_resv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(RESERVED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(gramaticaParser.TYPE, 0); }
		public TypContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTyp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTyp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTyp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypContext typ() throws RecognitionException {
		TypContext _localctx = new TypContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VoiContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(gramaticaParser.VOID, 0); }
		public VoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVoi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVoi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVoi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoiContext voi() throws RecognitionException {
		VoiContext _localctx = new VoiContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_voi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(VOID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return funlist_sempred((FunlistContext)_localctx, predIndex);
		case 22:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean funlist_sempred(FunlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u012a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001Y\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002^\b\u0002\n\u0002\f\u0002a\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004j\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006w\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0084"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u008f\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u0093\b\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00a6\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00b0\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00bc\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0005\u0013\u00c5\b\u0013\n\u0013\f\u0013\u00c8\t\u0013\u0001\u0013\u0003"+
		"\u0013\u00cb\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00d6"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u00e3\b\u0016\n\u0016\f\u0016\u00e6\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u00f0\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u00f6\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u00fd\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u0104\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0112\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001"+
		"$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0000\u0002\u0004"+
		",(\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLN\u0000\u0002\u0001\u0000\u0015\u0017"+
		"\u0001\u0000\u000b\u000f\u011f\u0000P\u0001\u0000\u0000\u0000\u0002X\u0001"+
		"\u0000\u0000\u0000\u0004Z\u0001\u0000\u0000\u0000\u0006b\u0001\u0000\u0000"+
		"\u0000\bi\u0001\u0000\u0000\u0000\nk\u0001\u0000\u0000\u0000\fv\u0001"+
		"\u0000\u0000\u0000\u000ex\u0001\u0000\u0000\u0000\u0010z\u0001\u0000\u0000"+
		"\u0000\u0012\u0083\u0001\u0000\u0000\u0000\u0014\u008e\u0001\u0000\u0000"+
		"\u0000\u0016\u0092\u0001\u0000\u0000\u0000\u0018\u0094\u0001\u0000\u0000"+
		"\u0000\u001a\u00a5\u0001\u0000\u0000\u0000\u001c\u00a7\u0001\u0000\u0000"+
		"\u0000\u001e\u00af\u0001\u0000\u0000\u0000 \u00b1\u0001\u0000\u0000\u0000"+
		"\"\u00bb\u0001\u0000\u0000\u0000$\u00bd\u0001\u0000\u0000\u0000&\u00ca"+
		"\u0001\u0000\u0000\u0000(\u00d5\u0001\u0000\u0000\u0000*\u00d7\u0001\u0000"+
		"\u0000\u0000,\u00db\u0001\u0000\u0000\u0000.\u00e7\u0001\u0000\u0000\u0000"+
		"0\u00ef\u0001\u0000\u0000\u00002\u00f5\u0001\u0000\u0000\u00004\u00fc"+
		"\u0001\u0000\u0000\u00006\u0103\u0001\u0000\u0000\u00008\u0111\u0001\u0000"+
		"\u0000\u0000:\u0113\u0001\u0000\u0000\u0000<\u0115\u0001\u0000\u0000\u0000"+
		">\u0117\u0001\u0000\u0000\u0000@\u0119\u0001\u0000\u0000\u0000B\u011b"+
		"\u0001\u0000\u0000\u0000D\u011d\u0001\u0000\u0000\u0000F\u011f\u0001\u0000"+
		"\u0000\u0000H\u0121\u0001\u0000\u0000\u0000J\u0123\u0001\u0000\u0000\u0000"+
		"L\u0125\u0001\u0000\u0000\u0000N\u0127\u0001\u0000\u0000\u0000PQ\u0003"+
		"\u0002\u0001\u0000QR\u0003\u0004\u0002\u0000RS\u0003\u0006\u0003\u0000"+
		"S\u0001\u0001\u0000\u0000\u0000TY\u0001\u0000\u0000\u0000UV\u0003\b\u0004"+
		"\u0000VW\u0003\u0002\u0001\u0000WY\u0001\u0000\u0000\u0000XT\u0001\u0000"+
		"\u0000\u0000XU\u0001\u0000\u0000\u0000Y\u0003\u0001\u0000\u0000\u0000"+
		"Z_\u0006\u0002\uffff\uffff\u0000[\\\n\u0001\u0000\u0000\\^\u0003\u001a"+
		"\r\u0000][\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0005\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000bc\u0003$\u0012\u0000cd\u0005\u0001\u0000\u0000"+
		"de\u0003&\u0013\u0000ef\u0005\u0002\u0000\u0000f\u0007\u0001\u0000\u0000"+
		"\u0000gj\u0003\n\u0005\u0000hj\u0003\u0010\b\u0000ig\u0001\u0000\u0000"+
		"\u0000ih\u0001\u0000\u0000\u0000j\t\u0001\u0000\u0000\u0000kl\u0005\u0003"+
		"\u0000\u0000lm\u0005\u0013\u0000\u0000mn\u0003\u000e\u0007\u0000no\u0003"+
		"\f\u0006\u0000o\u000b\u0001\u0000\u0000\u0000pq\u0005\u0003\u0000\u0000"+
		"qr\u0005\u0013\u0000\u0000rs\u0003\u000e\u0007\u0000st\u0003\f\u0006\u0000"+
		"tw\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vp\u0001\u0000\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000w\r\u0001\u0000\u0000\u0000xy\u0007\u0000"+
		"\u0000\u0000y\u000f\u0001\u0000\u0000\u0000z{\u0003\u0014\n\u0000{|\u0005"+
		"\u0004\u0000\u0000|}\u0003\u0012\t\u0000}\u0011\u0001\u0000\u0000\u0000"+
		"~\u007f\u0003\u0014\n\u0000\u007f\u0080\u0005\u0004\u0000\u0000\u0080"+
		"\u0081\u0003\u0012\t\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0001\u0000\u0000\u0000\u0083~\u0001\u0000\u0000\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0013\u0001\u0000\u0000\u0000\u0085\u0086\u0003"+
		"\u0016\u000b\u0000\u0086\u0087\u0005\u0014\u0000\u0000\u0087\u008f\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0003\u0016\u000b\u0000\u0089\u008a\u0005"+
		"\u0014\u0000\u0000\u008a\u008b\u0005\u0005\u0000\u0000\u008b\u008c\u0003"+
		"\u000e\u0007\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008f\u0003"+
		"\u001a\r\u0000\u008e\u0085\u0001\u0000\u0000\u0000\u008e\u0088\u0001\u0000"+
		"\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0015\u0001\u0000"+
		"\u0000\u0000\u0090\u0093\u0005\u0011\u0000\u0000\u0091\u0093\u0003\u0018"+
		"\f\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0017\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0012\u0000"+
		"\u0000\u0095\u0019\u0001\u0000\u0000\u0000\u0096\u0097\u0003\u001c\u000e"+
		"\u0000\u0097\u0098\u0005\u0001\u0000\u0000\u0098\u0099\u0003&\u0013\u0000"+
		"\u0099\u009a\u0005\u0002\u0000\u0000\u009a\u00a6\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0003\u001c\u000e\u0000\u009c\u009d\u0005\u0001\u0000\u0000"+
		"\u009d\u009e\u0003&\u0013\u0000\u009e\u009f\u0005\u0006\u0000\u0000\u009f"+
		"\u00a0\u0005\u0007\u0000\u0000\u00a0\u00a1\u0005\u0014\u0000\u0000\u00a1"+
		"\u00a2\u0005\b\u0000\u0000\u00a2\u00a3\u0005\u0004\u0000\u0000\u00a3\u00a4"+
		"\u0005\u0002\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u0096"+
		"\u0001\u0000\u0000\u0000\u00a5\u009b\u0001\u0000\u0000\u0000\u00a6\u001b"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003\u0016\u000b\u0000\u00a8\u00a9"+
		"\u0005\u0014\u0000\u0000\u00a9\u00aa\u0005\u0007\u0000\u0000\u00aa\u00ab"+
		"\u0003\u001e\u000f\u0000\u00ab\u00ac\u0005\b\u0000\u0000\u00ac\u001d\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0003 \u0010\u0000\u00ae\u00b0\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b0\u001f\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003\u0016"+
		"\u000b\u0000\u00b2\u00b3\u0005\u0014\u0000\u0000\u00b3\u00b4\u0003\"\u0011"+
		"\u0000\u00b4!\u0001\u0000\u0000\u0000\u00b5\u00bc\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0005\t\u0000\u0000\u00b7\u00b8\u0003\u0016\u000b\u0000\u00b8"+
		"\u00b9\u0005\u0014\u0000\u0000\u00b9\u00ba\u0003\"\u0011\u0000\u00ba\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b5\u0001\u0000\u0000\u0000\u00bb\u00b6"+
		"\u0001\u0000\u0000\u0000\u00bc#\u0001\u0000\u0000\u0000\u00bd\u00be\u0003"+
		"\u0018\f\u0000\u00be\u00bf\u0005\n\u0000\u0000\u00bf\u00c0\u0005\u0007"+
		"\u0000\u0000\u00c0\u00c1\u0003\u001e\u000f\u0000\u00c1\u00c2\u0005\b\u0000"+
		"\u0000\u00c2%\u0001\u0000\u0000\u0000\u00c3\u00c5\u0003(\u0014\u0000\u00c4"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9"+
		"\u00cb\u0003(\u0014\u0000\u00ca\u00c6\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cb\'\u0001\u0000\u0000\u0000\u00cc\u00cd\u0003"+
		"*\u0015\u0000\u00cd\u00ce\u0005\u0004\u0000\u0000\u00ce\u00d6\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u00032\u0019\u0000\u00d0\u00d1\u0005\u0004\u0000"+
		"\u0000\u00d1\u00d6\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003\u0014\n\u0000"+
		"\u00d3\u00d4\u0005\u0004\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d5\u00cc\u0001\u0000\u0000\u0000\u00d5\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d2\u0001\u0000\u0000\u0000\u00d6)\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0005\u0014\u0000\u0000\u00d8\u00d9\u0005\u0005\u0000\u0000\u00d9"+
		"\u00da\u0003,\u0016\u0000\u00da+\u0001\u0000\u0000\u0000\u00db\u00dc\u0006"+
		"\u0016\uffff\uffff\u0000\u00dc\u00dd\u00030\u0018\u0000\u00dd\u00e4\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\n\u0002\u0000\u0000\u00df\u00e0\u0003."+
		"\u0017\u0000\u00e0\u00e1\u0003,\u0016\u0003\u00e1\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e2\u00de\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e5-\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0007\u0001\u0000\u0000\u00e8/\u0001\u0000\u0000\u0000\u00e9"+
		"\u00f0\u0003\u000e\u0007\u0000\u00ea\u00eb\u0005\u0007\u0000\u0000\u00eb"+
		"\u00ec\u0003,\u0016\u0000\u00ec\u00ed\u0005\b\u0000\u0000\u00ed\u00f0"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f0\u00032\u0019\u0000\u00ef\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ea\u0001\u0000\u0000\u0000\u00ef\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f01\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u0014"+
		"\u0000\u0000\u00f2\u00f6\u00034\u001a\u0000\u00f3\u00f4\u0005\u0013\u0000"+
		"\u0000\u00f4\u00f6\u00034\u001a\u0000\u00f5\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f63\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005\u0007\u0000\u0000\u00f8\u00f9\u00036\u001b\u0000\u00f9\u00fa"+
		"\u0005\b\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fc\u00f7\u0001\u0000\u0000\u0000\u00fc\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fd5\u0001\u0000\u0000\u0000\u00fe\u0104\u0003,\u0016"+
		"\u0000\u00ff\u0100\u0003,\u0016\u0000\u0100\u0101\u0005\t\u0000\u0000"+
		"\u0101\u0102\u00036\u001b\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103"+
		"\u00fe\u0001\u0000\u0000\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0104"+
		"7\u0001\u0000\u0000\u0000\u0105\u0112\u0003:\u001d\u0000\u0106\u0112\u0003"+
		"<\u001e\u0000\u0107\u0112\u0003>\u001f\u0000\u0108\u0109\u0003@ \u0000"+
		"\u0109\u010a\u0003B!\u0000\u010a\u0112\u0001\u0000\u0000\u0000\u010b\u0112"+
		"\u0003D\"\u0000\u010c\u0112\u0003F#\u0000\u010d\u0112\u0003H$\u0000\u010e"+
		"\u0112\u0003J%\u0000\u010f\u0112\u0003L&\u0000\u0110\u0112\u0003N\'\u0000"+
		"\u0111\u0105\u0001\u0000\u0000\u0000\u0111\u0106\u0001\u0000\u0000\u0000"+
		"\u0111\u0107\u0001\u0000\u0000\u0000\u0111\u0108\u0001\u0000\u0000\u0000"+
		"\u0111\u010b\u0001\u0000\u0000\u0000\u0111\u010c\u0001\u0000\u0000\u0000"+
		"\u0111\u010d\u0001\u0000\u0000\u0000\u0111\u010e\u0001\u0000\u0000\u0000"+
		"\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000"+
		"\u01129\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u0014\u0000\u0000\u0114"+
		";\u0001\u0000\u0000\u0000\u0115\u0116\u0005\u0013\u0000\u0000\u0116=\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0005\u0015\u0000\u0000\u0118?\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0005\u0016\u0000\u0000\u011aA\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0005\u0017\u0000\u0000\u011cC\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\u0005\u0018\u0000\u0000\u011eE\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0005\u0019\u0000\u0000\u0120G\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0005\u001a\u0000\u0000\u0122I\u0001\u0000\u0000\u0000\u0123\u0124\u0005"+
		"\u0010\u0000\u0000\u0124K\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0011"+
		"\u0000\u0000\u0126M\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u0012\u0000"+
		"\u0000\u0128O\u0001\u0000\u0000\u0000\u0013X_iv\u0083\u008e\u0092\u00a5"+
		"\u00af\u00bb\u00c6\u00ca\u00d5\u00e4\u00ef\u00f5\u00fc\u0103\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}