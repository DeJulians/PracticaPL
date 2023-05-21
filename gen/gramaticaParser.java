// Generated from C:/Users/USER/OneDrive/Documentos/GitHub/PracticaPL/src\gramatica.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramaticaParser extends Parser {

	public String pagina = "<!DOCTYPE html>\n"+ "<HTML>\n"+ "<HEAD>\n"+ "<TITLE>codigo_prueba.c</TITLE>\n"+ "</HEAD>\n"+ "<BODY>\n"+ "<A name=\"programa\"><H1>Programa: codigo_prueba.c<H1></A>\n"+ "<DIV>";
	public String funciones = "<H2>Funciones:</H2>\n"+ "<DIV>"+ "<UL>";
	public String funcionesCod = "";
	public String principal = "</DIV>\n"+ "<DIV>\n"+ "<A name=\"principal\"><H2>Programa Principal</H2></A>";
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
	public static final int
		RULE_program = 0, RULE_dcllist = 1, RULE_dcllist1 = 2, RULE_funlist = 3, 
		RULE_funlist1 = 4, RULE_sentlist = 5, RULE_dcl = 6, RULE_ctedef = 7, RULE_simpvalue = 8, 
		RULE_varlist = 9, RULE_varlist1 = 10, RULE_vardef = 11, RULE_tbas = 12, 
		RULE_struct = 13, RULE_tvoid = 14, RULE_funcdef = 15, RULE_funchead = 16, 
		RULE_typedef = 17, RULE_typedef1 = 18, RULE_mainhead = 19, RULE_code = 20, 
		RULE_code1 = 21, RULE_sent = 22, RULE_ifa = 23, RULE_elsea = 24, RULE_whilea = 25, 
		RULE_dowhile = 26, RULE_fora = 27, RULE_expcond = 28, RULE_oplog = 29, 
		RULE_factorcond = 30, RULE_opcomp = 31, RULE_returna = 32, RULE_asig = 33, 
		RULE_exp = 34, RULE_op = 35, RULE_factor = 36, RULE_funccall = 37, RULE_subparamlist = 38, 
		RULE_explist = 39, RULE_text = 40, RULE_id = 41, RULE_const = 42, RULE_int = 43, 
		RULE_real = 44, RULE_string = 45, RULE_com = 46, RULE_aux = 47, RULE_simb = 48, 
		RULE_resv = 49, RULE_typ = 50, RULE_voi = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dcllist", "dcllist1", "funlist", "funlist1", "sentlist", 
			"dcl", "ctedef", "simpvalue", "varlist", "varlist1", "vardef", "tbas", 
			"struct", "tvoid", "funcdef", "funchead", "typedef", "typedef1", "mainhead", 
			"code", "code1", "sent", "ifa", "elsea", "whilea", "dowhile", "fora", 
			"expcond", "oplog", "factorcond", "opcomp", "returna", "asig", "exp", 
			"op", "factor", "funccall", "subparamlist", "explist", "text", "id", 
			"const", "int", "real", "string", "com", "aux", "simb", "resv", "typ", 
			"voi"
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

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

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
		public DcllistContext dcllist;
		public FunlistContext funlist;
		public SentlistContext sentlist;
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
			setState(104);
			((ProgramContext)_localctx).dcllist = dcllist();
			principal += ((ProgramContext)_localctx).dcllist.t;
			setState(106);
			((ProgramContext)_localctx).funlist = funlist();
			funcionesCod += ((ProgramContext)_localctx).funlist.t;
			setState(108);
			((ProgramContext)_localctx).sentlist = sentlist();
			principal += ((ProgramContext)_localctx).sentlist.t;
			          pagina += funciones;
			          pagina += funcionesCod;
			          pagina += principal;
			          pagina += "</DIV></DIV></BODY></HTML>";
			          File f = new File("codigo_prueba.html");
			          try {
			              f.createNewFile();
			              FileWriter fw = new FileWriter(f);
			              BufferedWriter bw = new BufferedWriter(fw);

			              bw.write(pagina);
			              bw.close();
			          }catch(Exception e){System.out.println(e);}
			        
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
		public String t;
		public DclContext dcl;
		public Dcllist1Context dcllist1;
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public Dcllist1Context dcllist1() {
			return getRuleContext(Dcllist1Context.class,0);
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				((DcllistContext)_localctx).dcl = dcl();
				setState(112);
				((DcllistContext)_localctx).dcllist1 = dcllist1();
				((DcllistContext)_localctx).t =  ((DcllistContext)_localctx).dcl.t + " " + ((DcllistContext)_localctx).dcllist1.t;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((DcllistContext)_localctx).t =  "";
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
	public static class Dcllist1Context extends ParserRuleContext {
		public String t;
		public DclContext dcl;
		public Dcllist1Context dcllist1;
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public Dcllist1Context dcllist1() {
			return getRuleContext(Dcllist1Context.class,0);
		}
		public Dcllist1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDcllist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDcllist1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDcllist1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dcllist1Context dcllist1() throws RecognitionException {
		Dcllist1Context _localctx = new Dcllist1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_dcllist1);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((Dcllist1Context)_localctx).dcl = dcl();
				setState(119);
				((Dcllist1Context)_localctx).dcllist1 = dcllist1();
				((Dcllist1Context)_localctx).t =  ((Dcllist1Context)_localctx).dcl.t + ((Dcllist1Context)_localctx).dcllist1.t;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Dcllist1Context)_localctx).t =  "";
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
		public String t;
		public FuncdefContext funcdef;
		public Funlist1Context funlist1;
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public Funlist1Context funlist1() {
			return getRuleContext(Funlist1Context.class,0);
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
		FunlistContext _localctx = new FunlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funlist);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				((FunlistContext)_localctx).funcdef = funcdef();
				setState(126);
				((FunlistContext)_localctx).funlist1 = funlist1();
				((FunlistContext)_localctx).t =  ((FunlistContext)_localctx).funcdef.t + ((FunlistContext)_localctx).funlist1.t;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((FunlistContext)_localctx).t =  "<HR/>";
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
	public static class Funlist1Context extends ParserRuleContext {
		public String t;
		public FuncdefContext funcdef;
		public Funlist1Context funlist1;
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public Funlist1Context funlist1() {
			return getRuleContext(Funlist1Context.class,0);
		}
		public Funlist1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funlist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFunlist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFunlist1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFunlist1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funlist1Context funlist1() throws RecognitionException {
		Funlist1Context _localctx = new Funlist1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_funlist1);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				((Funlist1Context)_localctx).funcdef = funcdef();
				setState(133);
				((Funlist1Context)_localctx).funlist1 = funlist1();
				((Funlist1Context)_localctx).t =  ((Funlist1Context)_localctx).funcdef.t + ((Funlist1Context)_localctx).funlist1.t;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Funlist1Context)_localctx).t =  "</UL>\n<HR/>\n";
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
	public static class SentlistContext extends ParserRuleContext {
		public String t;
		public MainheadContext mainhead;
		public CodeContext code;
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
		enterRule(_localctx, 10, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((SentlistContext)_localctx).mainhead = mainhead();
			setState(140);
			match(T__0);
			setState(141);
			((SentlistContext)_localctx).code = code();
			setState(142);
			match(T__1);
			((SentlistContext)_localctx).t =  ((SentlistContext)_localctx).mainhead.t + "{\n" + ((SentlistContext)_localctx).code.t + "\n}\n" + "<A HREF=\"#principal\">Inicio del Programa Principal</A> <A HREF=\"#programa\">inicio del Programa</A>";
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
		public String t;
		public CtedefContext ctedef;
		public VarlistContext varlist;
		public CtedefContext ctedef() {
			return getRuleContext(CtedefContext.class,0);
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
		enterRule(_localctx, 12, RULE_dcl);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				((DclContext)_localctx).ctedef = ctedef();
				((DclContext)_localctx).t =  ((DclContext)_localctx).ctedef.t;
				}
				break;
			case T__5:
			case TYPE:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				((DclContext)_localctx).varlist = varlist();
				((DclContext)_localctx).t =  ((DclContext)_localctx).varlist.t;
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
	public static class CtedefContext extends ParserRuleContext {
		public String t;
		public Token CONST_DEF_IDENTIFIER;
		public SimpvalueContext simpvalue;
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(gramaticaParser.CONST_DEF_IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCtedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCtedef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCtedef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtedefContext ctedef() throws RecognitionException {
		CtedefContext _localctx = new CtedefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ctedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__2);
			setState(154);
			((CtedefContext)_localctx).CONST_DEF_IDENTIFIER = match(CONST_DEF_IDENTIFIER);
			setState(155);
			((CtedefContext)_localctx).simpvalue = simpvalue();
			((CtedefContext)_localctx).t =  "<SPAN CLASS=\"palres\">#define</SPAN> " + "<SPAN CLASS=\"cte\">" + (((CtedefContext)_localctx).CONST_DEF_IDENTIFIER!=null?((CtedefContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) + "</SPAN> " + ((CtedefContext)_localctx).simpvalue.t + "\n";
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
		public String t;
		public Token NUMERIC_INTEGER_CONST;
		public Token NUMERIC_REAL_CONST;
		public Token STRING_CONST;
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
		enterRule(_localctx, 16, RULE_simpvalue);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST = match(NUMERIC_INTEGER_CONST);
				((SimpvalueContext)_localctx).t =  "<SPAN CLASS=\"cte\">" + (((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST.getText():null) + "</SPAN>";
				}
				break;
			case NUMERIC_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				((SimpvalueContext)_localctx).NUMERIC_REAL_CONST = match(NUMERIC_REAL_CONST);
				((SimpvalueContext)_localctx).t =  "<SPAN CLASS=\"cte\">" + (((SimpvalueContext)_localctx).NUMERIC_REAL_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_REAL_CONST.getText():null) + "</SPAN>";
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				((SimpvalueContext)_localctx).t =  "<SPAN CLASS=\"cte\">" + (((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null) + "</SPAN>";
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
	public static class VarlistContext extends ParserRuleContext {
		public String t;
		public VardefContext vardef;
		public Varlist1Context varlist1;
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
		enterRule(_localctx, 18, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((VarlistContext)_localctx).vardef = vardef();
			setState(167);
			match(T__3);
			setState(168);
			((VarlistContext)_localctx).varlist1 = varlist1();
			((VarlistContext)_localctx).t =  ((VarlistContext)_localctx).vardef.t + "; " + ((VarlistContext)_localctx).varlist1.t + " ";
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
		public String t;
		public VardefContext vardef;
		public Varlist1Context varlist1;
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
		enterRule(_localctx, 20, RULE_varlist1);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				((Varlist1Context)_localctx).vardef = vardef();
				setState(172);
				match(T__3);
				setState(173);
				((Varlist1Context)_localctx).varlist1 = varlist1();
				((Varlist1Context)_localctx).t =  ((Varlist1Context)_localctx).vardef.t + "; " + ((Varlist1Context)_localctx).varlist1.t + " ";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Varlist1Context)_localctx).t =  "\n";
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
		public String t;
		public TbasContext tbas;
		public Token IDENTIFIER;
		public SimpvalueContext simpvalue;
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
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
		enterRule(_localctx, 22, RULE_vardef);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				((VardefContext)_localctx).tbas = tbas();
				setState(180);
				((VardefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((VardefContext)_localctx).t =  ((VardefContext)_localctx).tbas.t + " <SPAN CLASS=\"ident\">" + (((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null) + "</SPAN>\n";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				((VardefContext)_localctx).tbas = tbas();
				setState(184);
				((VardefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(185);
				match(T__4);
				setState(186);
				((VardefContext)_localctx).simpvalue = simpvalue();
				((VardefContext)_localctx).t =  ((VardefContext)_localctx).tbas.t + " <SPAN CLASS=\"ident\">" + (((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null) + "</SPAN> = " + ((VardefContext)_localctx).simpvalue.t + "\n";
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
		public String t;
		public Token TYPE;
		public TvoidContext tvoid;
		public StructContext struct;
		public TerminalNode TYPE() { return getToken(gramaticaParser.TYPE, 0); }
		public TvoidContext tvoid() {
			return getRuleContext(TvoidContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
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
		enterRule(_localctx, 24, RULE_tbas);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				((TbasContext)_localctx).TYPE = match(TYPE);
				((TbasContext)_localctx).t =  "<SPAN CLASS=\"palres\">" + (((TbasContext)_localctx).TYPE!=null?((TbasContext)_localctx).TYPE.getText():null) + "</SPAN>";
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				((TbasContext)_localctx).tvoid = tvoid();
				((TbasContext)_localctx).t =  ((TbasContext)_localctx).tvoid.t;
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				((TbasContext)_localctx).struct = struct();
				((TbasContext)_localctx).t =  ((TbasContext)_localctx).struct.t;
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
	public static class StructContext extends ParserRuleContext {
		public String t;
		public VarlistContext varlist;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__5);
			setState(202);
			match(T__0);
			setState(203);
			((StructContext)_localctx).varlist = varlist();
			setState(204);
			match(T__1);
			((StructContext)_localctx).t =  "<SPAN CLASS=\"palres\">struct</SPAN> {" + ((StructContext)_localctx).varlist.t + "}";
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
		public String t;
		public Token VOID;
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
		enterRule(_localctx, 28, RULE_tvoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			((TvoidContext)_localctx).VOID = match(VOID);
			((TvoidContext)_localctx).t =  " <SPAN CLASS=\"palres\">" + (((TvoidContext)_localctx).VOID!=null?((TvoidContext)_localctx).VOID.getText():null) + "</SPAN>";
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
		public String t;
		public FuncheadContext funchead;
		public CodeContext code;
		public FuncheadContext funchead() {
			return getRuleContext(FuncheadContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			((FuncdefContext)_localctx).funchead = funchead();
			funciones += "<A HREF=\"#FUNCIONES:" + ((FuncdefContext)_localctx).funchead.t + "\">" + "<LI>" + ((FuncdefContext)_localctx).funchead.t + "</LI>" + "</A>\n";
			setState(212);
			match(T__0);
			setState(213);
			((FuncdefContext)_localctx).code = code();
			setState(214);
			match(T__1);
			((FuncdefContext)_localctx).t =  "<A name=\"FUNCIONES:" + ((FuncdefContext)_localctx).funchead.t + "\">" + ((FuncdefContext)_localctx).funchead.t + "\n{\n" + ((FuncdefContext)_localctx).code.t + "\n}\n <A HREF=\"#" + ((FuncdefContext)_localctx).funchead.t + "\">Iicio de la funcion</A> <A HREF=\"#principal\">Programa Principal</A>\n<HR/>\n";
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
		public String t;
		public TbasContext tbas;
		public Token IDENTIFIER;
		public TypedefContext typedef;
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
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
		enterRule(_localctx, 32, RULE_funchead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((FuncheadContext)_localctx).tbas = tbas();
			setState(218);
			((FuncheadContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(219);
			match(T__6);
			setState(220);
			((FuncheadContext)_localctx).typedef = typedef();
			setState(221);
			match(T__7);
			((FuncheadContext)_localctx).t =  ((FuncheadContext)_localctx).tbas.t + " <SPAN CLASS=\"ident\">" + (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null) + "</SPAN> (" + ((FuncheadContext)_localctx).typedef.t + ")";
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
	public static class TypedefContext extends ParserRuleContext {
		public String t;
		public Typedef1Context typedef1;
		public Typedef1Context typedef1() {
			return getRuleContext(Typedef1Context.class,0);
		}
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTypedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTypedef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTypedef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typedef);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case TYPE:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				((TypedefContext)_localctx).typedef1 = typedef1();
				((TypedefContext)_localctx).t =  ((TypedefContext)_localctx).typedef1.t;
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				((TypedefContext)_localctx).t =  "";
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
	public static class Typedef1Context extends ParserRuleContext {
		public String t;
		public TbasContext tbas;
		public Token IDENTIFIER;
		public Typedef1Context typedef1;
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public Typedef1Context typedef1() {
			return getRuleContext(Typedef1Context.class,0);
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
		enterRule(_localctx, 36, RULE_typedef1);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				((Typedef1Context)_localctx).tbas = tbas();
				setState(231);
				((Typedef1Context)_localctx).IDENTIFIER = match(IDENTIFIER);
				((Typedef1Context)_localctx).t =  ((Typedef1Context)_localctx).tbas.t + " <SPAN CLASS=\"ident\">" + (((Typedef1Context)_localctx).IDENTIFIER!=null?((Typedef1Context)_localctx).IDENTIFIER.getText():null) + "</SPAN>";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				((Typedef1Context)_localctx).tbas = tbas();
				setState(235);
				((Typedef1Context)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(236);
				match(T__8);
				setState(237);
				((Typedef1Context)_localctx).typedef1 = typedef1();
				((Typedef1Context)_localctx).t =  ((Typedef1Context)_localctx).tbas.t + " <SPAN CLASS=\"ident\">" + (((Typedef1Context)_localctx).IDENTIFIER!=null?((Typedef1Context)_localctx).IDENTIFIER.getText():null) + "</SPAN>, " + ((Typedef1Context)_localctx).typedef1.t;
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
	public static class MainheadContext extends ParserRuleContext {
		public String t;
		public TvoidContext tvoid;
		public TypedefContext typedef;
		public TvoidContext tvoid() {
			return getRuleContext(TvoidContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
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
		enterRule(_localctx, 38, RULE_mainhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			((MainheadContext)_localctx).tvoid = tvoid();
			setState(243);
			match(T__9);
			setState(244);
			match(T__6);
			setState(245);
			((MainheadContext)_localctx).typedef = typedef();
			setState(246);
			match(T__7);
			((MainheadContext)_localctx).t =  ((MainheadContext)_localctx).tvoid.t + " <SPAN CLASS=\"palres\">Main</SPAN>(" + ((MainheadContext)_localctx).typedef.t + ")";
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
		public String t;
		public SentContext sent;
		public Code1Context code1;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Code1Context code1() {
			return getRuleContext(Code1Context.class,0);
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
		enterRule(_localctx, 40, RULE_code);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__23:
			case TYPE:
			case VOID:
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				((CodeContext)_localctx).sent = sent();
				setState(250);
				((CodeContext)_localctx).code1 = code1();
				((CodeContext)_localctx).t =  "<DIV style=\"text-indent: 2cm\">" + ((CodeContext)_localctx).sent.t + ((CodeContext)_localctx).code1.t + "</DIV>";
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				((CodeContext)_localctx).t =  "";
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
	public static class Code1Context extends ParserRuleContext {
		public String t;
		public SentContext sent;
		public Code1Context code1;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Code1Context code1() {
			return getRuleContext(Code1Context.class,0);
		}
		public Code1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCode1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCode1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCode1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code1Context code1() throws RecognitionException {
		Code1Context _localctx = new Code1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_code1);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__23:
			case TYPE:
			case VOID:
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				((Code1Context)_localctx).sent = sent();
				setState(257);
				((Code1Context)_localctx).code1 = code1();
				((Code1Context)_localctx).t =  ((Code1Context)_localctx).sent.t + ((Code1Context)_localctx).code1.t;
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				((Code1Context)_localctx).t =  "";
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
	public static class SentContext extends ParserRuleContext {
		public String t;
		public AsigContext asig;
		public FunccallContext funccall;
		public VardefContext vardef;
		public ReturnaContext returna;
		public IfaContext ifa;
		public WhileaContext whilea;
		public DowhileContext dowhile;
		public ForaContext fora;
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public ReturnaContext returna() {
			return getRuleContext(ReturnaContext.class,0);
		}
		public IfaContext ifa() {
			return getRuleContext(IfaContext.class,0);
		}
		public WhileaContext whilea() {
			return getRuleContext(WhileaContext.class,0);
		}
		public DowhileContext dowhile() {
			return getRuleContext(DowhileContext.class,0);
		}
		public ForaContext fora() {
			return getRuleContext(ForaContext.class,0);
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
		enterRule(_localctx, 44, RULE_sent);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				((SentContext)_localctx).asig = asig();
				setState(264);
				match(T__3);
				((SentContext)_localctx).t =  ((SentContext)_localctx).asig.t + ";\n";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				((SentContext)_localctx).funccall = funccall();
				setState(268);
				match(T__3);
				((SentContext)_localctx).t =  ((SentContext)_localctx).funccall.t + ";";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				((SentContext)_localctx).vardef = vardef();
				setState(272);
				match(T__3);
				((SentContext)_localctx).t =  ((SentContext)_localctx).vardef.t + ";";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				((SentContext)_localctx).returna = returna();
				setState(276);
				match(T__3);
				((SentContext)_localctx).t =  ((SentContext)_localctx).returna.t + ";";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(279);
				((SentContext)_localctx).ifa = ifa();
				((SentContext)_localctx).t =  ((SentContext)_localctx).ifa.t;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				((SentContext)_localctx).whilea = whilea();
				((SentContext)_localctx).t =  ((SentContext)_localctx).whilea.t;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(285);
				((SentContext)_localctx).dowhile = dowhile();
				((SentContext)_localctx).t =  ((SentContext)_localctx).dowhile.t;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(288);
				((SentContext)_localctx).fora = fora();
				((SentContext)_localctx).t =  ((SentContext)_localctx).fora.t;
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
	public static class IfaContext extends ParserRuleContext {
		public String t;
		public ExpcondContext expcond;
		public CodeContext code;
		public ElseaContext elsea;
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ElseaContext elsea() {
			return getRuleContext(ElseaContext.class,0);
		}
		public IfaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterIfa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitIfa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitIfa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfaContext ifa() throws RecognitionException {
		IfaContext _localctx = new IfaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__10);
			setState(294);
			((IfaContext)_localctx).expcond = expcond(0);
			setState(295);
			match(T__0);
			setState(296);
			((IfaContext)_localctx).code = code();
			setState(297);
			match(T__1);
			setState(298);
			((IfaContext)_localctx).elsea = elsea();
			((IfaContext)_localctx).t =  "<SPAN CLASS=\"palres\">if</SPAN> " + ((IfaContext)_localctx).expcond.t + "{\n" + ((IfaContext)_localctx).code.t + "\n}\n" + ((IfaContext)_localctx).elsea.t;
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
	public static class ElseaContext extends ParserRuleContext {
		public String t;
		public CodeContext code;
		public IfaContext ifa;
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public IfaContext ifa() {
			return getRuleContext(IfaContext.class,0);
		}
		public ElseaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterElsea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitElsea(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitElsea(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseaContext elsea() throws RecognitionException {
		ElseaContext _localctx = new ElseaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_elsea);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(T__11);
				setState(302);
				match(T__0);
				setState(303);
				((ElseaContext)_localctx).code = code();
				setState(304);
				match(T__1);
				((ElseaContext)_localctx).t =  "<SPAN CLASS=\"palres\">else</SPAN>{\n" + ((ElseaContext)_localctx).code.t + "\n}\n";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(T__11);
				setState(308);
				((ElseaContext)_localctx).ifa = ifa();
				((ElseaContext)_localctx).t =  "<SPAN CLASS=\"palres\">else " + "</SPAN>" + ((ElseaContext)_localctx).ifa.t;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				((ElseaContext)_localctx).t =  "";
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
	public static class WhileaContext extends ParserRuleContext {
		public String t;
		public ExpcondContext expcond;
		public CodeContext code;
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public WhileaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterWhilea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitWhilea(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitWhilea(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileaContext whilea() throws RecognitionException {
		WhileaContext _localctx = new WhileaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_whilea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__12);
			setState(315);
			match(T__6);
			setState(316);
			((WhileaContext)_localctx).expcond = expcond(0);
			setState(317);
			match(T__7);
			setState(318);
			match(T__0);
			setState(319);
			((WhileaContext)_localctx).code = code();
			setState(320);
			match(T__1);
			((WhileaContext)_localctx).t =  "<SPAN CLASS=\"palres\">while</SPAN> (" + ((WhileaContext)_localctx).expcond.t + ") {\n" + ((WhileaContext)_localctx).code.t + "\n}\n";
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
	public static class DowhileContext extends ParserRuleContext {
		public String t;
		public CodeContext code;
		public ExpcondContext expcond;
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public DowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDowhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDowhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DowhileContext dowhile() throws RecognitionException {
		DowhileContext _localctx = new DowhileContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__13);
			setState(324);
			match(T__0);
			setState(325);
			((DowhileContext)_localctx).code = code();
			setState(326);
			match(T__1);
			setState(327);
			match(T__12);
			setState(328);
			match(T__6);
			setState(329);
			((DowhileContext)_localctx).expcond = expcond(0);
			setState(330);
			match(T__7);
			setState(331);
			match(T__3);
			((DowhileContext)_localctx).t =  "<SPAN CLASS=\"palres\">do</SPAN> {\n" + ((DowhileContext)_localctx).code.t + "\n}\n" + "while (" + ((DowhileContext)_localctx).expcond.t + ");\n";
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
	public static class ForaContext extends ParserRuleContext {
		public String t;
		public VardefContext vardef;
		public ExpcondContext expcond;
		public AsigContext asig;
		public CodeContext code;
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public List<AsigContext> asig() {
			return getRuleContexts(AsigContext.class);
		}
		public AsigContext asig(int i) {
			return getRuleContext(AsigContext.class,i);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ForaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fora; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFora(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFora(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFora(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForaContext fora() throws RecognitionException {
		ForaContext _localctx = new ForaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fora);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(T__14);
				setState(335);
				match(T__6);
				setState(336);
				((ForaContext)_localctx).vardef = vardef();
				setState(337);
				match(T__3);
				setState(338);
				((ForaContext)_localctx).expcond = expcond(0);
				setState(339);
				match(T__3);
				setState(340);
				((ForaContext)_localctx).asig = asig();
				setState(341);
				match(T__7);
				setState(342);
				match(T__0);
				setState(343);
				((ForaContext)_localctx).code = code();
				setState(344);
				match(T__1);
				((ForaContext)_localctx).t =  "<SPAN CLASS=\"palres\">for</SPAN> (" + ((ForaContext)_localctx).vardef.t + ";" + ((ForaContext)_localctx).expcond.t + ";" + ((ForaContext)_localctx).asig.t + ") {\n" + ((ForaContext)_localctx).code.t + "\n}\n";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(T__14);
				setState(348);
				match(T__6);
				setState(349);
				((ForaContext)_localctx).asig = asig();
				setState(350);
				match(T__3);
				setState(351);
				((ForaContext)_localctx).expcond = expcond(0);
				setState(352);
				match(T__3);
				setState(353);
				((ForaContext)_localctx).asig = asig();
				setState(354);
				match(T__7);
				setState(355);
				match(T__0);
				setState(356);
				((ForaContext)_localctx).code = code();
				setState(357);
				match(T__1);
				((ForaContext)_localctx).t =  "<SPAN CLASS=\"palres\">for</SPAN> (" + ((ForaContext)_localctx).asig.t + ";" + ((ForaContext)_localctx).expcond.t + ";" + ((ForaContext)_localctx).asig.t + ") {\n" + ((ForaContext)_localctx).code.t + "\n}\n";
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
	public static class ExpcondContext extends ParserRuleContext {
		public String t;
		public FactorcondContext factorcond;
		public OplogContext oplog;
		public ExpcondContext expcond;
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public List<ExpcondContext> expcond() {
			return getRuleContexts(ExpcondContext.class);
		}
		public ExpcondContext expcond(int i) {
			return getRuleContext(ExpcondContext.class,i);
		}
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpcondContext expcond() throws RecognitionException {
		return expcond(0);
	}

	private ExpcondContext expcond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpcondContext _localctx = new ExpcondContext(_ctx, _parentState);
		ExpcondContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expcond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(363);
			((ExpcondContext)_localctx).factorcond = factorcond();
			((ExpcondContext)_localctx).t =  ((ExpcondContext)_localctx).factorcond.t;
			}
			_ctx.stop = _input.LT(-1);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpcondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expcond);
					setState(366);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(367);
					((ExpcondContext)_localctx).oplog = oplog();
					setState(368);
					((ExpcondContext)_localctx).expcond = expcond(3);
					((ExpcondContext)_localctx).t =  ((ExpcondContext)_localctx).expcond.t + " " + ((ExpcondContext)_localctx).oplog.t + " " + ((ExpcondContext)_localctx).expcond.t;
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
	public static class OplogContext extends ParserRuleContext {
		public String t;
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOplog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOplog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_oplog);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(T__15);
				((OplogContext)_localctx).t =  "||";
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(T__16);
				((OplogContext)_localctx).t =  "&";
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
	public static class FactorcondContext extends ParserRuleContext {
		public String t;
		public ExpContext exp;
		public OpcompContext opcomp;
		public ExpcondContext expcond;
		public FactorcondContext factorcond;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public FactorcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFactorcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFactorcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorcondContext factorcond() throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_factorcond);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				((FactorcondContext)_localctx).exp = exp(0);
				setState(383);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(384);
				((FactorcondContext)_localctx).exp = exp(0);
				((FactorcondContext)_localctx).t =  ((FactorcondContext)_localctx).exp.t + " " + ((FactorcondContext)_localctx).opcomp.t + " " + ((FactorcondContext)_localctx).exp.t;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(T__6);
				setState(388);
				((FactorcondContext)_localctx).expcond = expcond(0);
				setState(389);
				match(T__7);
				((FactorcondContext)_localctx).t =  "(" + ((FactorcondContext)_localctx).expcond.t + ")";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				match(T__17);
				setState(393);
				((FactorcondContext)_localctx).factorcond = factorcond();
				((FactorcondContext)_localctx).t =  "!" + ((FactorcondContext)_localctx).factorcond.t;
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
	public static class OpcompContext extends ParserRuleContext {
		public String t;
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOpcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOpcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_opcomp);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(T__18);
				((OpcompContext)_localctx).t =  "<";
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(T__19);
				((OpcompContext)_localctx).t =  ">";
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				match(T__20);
				((OpcompContext)_localctx).t =  "<=";
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(404);
				match(T__21);
				((OpcompContext)_localctx).t =  ">=";
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(406);
				match(T__22);
				((OpcompContext)_localctx).t =  "==";
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
	public static class ReturnaContext extends ParserRuleContext {
		public String t;
		public ExpContext exp;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterReturna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitReturna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitReturna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnaContext returna() throws RecognitionException {
		ReturnaContext _localctx = new ReturnaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_returna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(T__23);
			setState(411);
			((ReturnaContext)_localctx).exp = exp(0);
			((ReturnaContext)_localctx).t =  "<SPAN CLASS=\"palres\">\return</SPAN>" + ((ReturnaContext)_localctx).exp.t;
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
		public String t;
		public Token IDENTIFIER;
		public ExpContext exp;
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
		enterRule(_localctx, 66, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			((AsigContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(415);
			match(T__4);
			setState(416);
			((AsigContext)_localctx).exp = exp(0);
			((AsigContext)_localctx).t =  "<SPAN CLASS=\"ident\">" + (((AsigContext)_localctx).IDENTIFIER!=null?((AsigContext)_localctx).IDENTIFIER.getText():null) + "</SPAN> = " + ((AsigContext)_localctx).exp.t;
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
		public String t;
		public FactorContext factor;
		public OpContext op;
		public ExpContext exp;
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(420);
			((ExpContext)_localctx).factor = factor();
			((ExpContext)_localctx).t =  ((ExpContext)_localctx).factor.t;
			}
			_ctx.stop = _input.LT(-1);
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(423);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(424);
					((ExpContext)_localctx).op = op();
					setState(425);
					((ExpContext)_localctx).exp = exp(3);
					((ExpContext)_localctx).t =  ((ExpContext)_localctx).exp.t + " " + ((ExpContext)_localctx).op.t + " " + ((ExpContext)_localctx).exp.t;
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public String t;
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
		enterRule(_localctx, 70, RULE_op);
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(T__24);
				((OpContext)_localctx).t =  "+";
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				match(T__25);
				((OpContext)_localctx).t =  "-";
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				match(T__26);
				((OpContext)_localctx).t =  "*";
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				match(T__27);
				((OpContext)_localctx).t =  "DIV";
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 5);
				{
				setState(441);
				match(T__28);
				((OpContext)_localctx).t =  "MOD";
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
	public static class FactorContext extends ParserRuleContext {
		public String t;
		public SimpvalueContext simpvalue;
		public ExpContext exp;
		public FunccallContext funccall;
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
		enterRule(_localctx, 72, RULE_factor);
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
			case NUMERIC_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				((FactorContext)_localctx).simpvalue = simpvalue();
				((FactorContext)_localctx).t =  ((FactorContext)_localctx).simpvalue.t;
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(T__6);
				setState(449);
				((FactorContext)_localctx).exp = exp(0);
				setState(450);
				match(T__7);
				((FactorContext)_localctx).t =  "(" + ((FactorContext)_localctx).exp.t + ")";
				}
				break;
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				((FactorContext)_localctx).funccall = funccall();
				((FactorContext)_localctx).t =  ((FactorContext)_localctx).funccall.t;
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
		public String t;
		public Token IDENTIFIER;
		public SubparamlistContext subparamlist;
		public Token CONST_DEF_IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public SubparamlistContext subparamlist() {
			return getRuleContext(SubparamlistContext.class,0);
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
		enterRule(_localctx, 74, RULE_funccall);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				((FunccallContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(459);
				((FunccallContext)_localctx).subparamlist = subparamlist();
				((FunccallContext)_localctx).t =  "<A HREF=\"#" + (((FunccallContext)_localctx).IDENTIFIER!=null?((FunccallContext)_localctx).IDENTIFIER.getText():null) + "\"><SPAN CLASS=\"ident\">" + (((FunccallContext)_localctx).IDENTIFIER!=null?((FunccallContext)_localctx).IDENTIFIER.getText():null) + "</SPAN> " + ((FunccallContext)_localctx).subparamlist.t + "</A>\n";
				}
				break;
			case CONST_DEF_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				((FunccallContext)_localctx).CONST_DEF_IDENTIFIER = match(CONST_DEF_IDENTIFIER);
				((FunccallContext)_localctx).t =  "<A HREF=\"#" + (((FunccallContext)_localctx).CONST_DEF_IDENTIFIER!=null?((FunccallContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) + "\">" + "<SPAN CLASS=\"cte\">" + (((FunccallContext)_localctx).CONST_DEF_IDENTIFIER!=null?((FunccallContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) + "</SPAN>" + "</A>\n";
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
	public static class SubparamlistContext extends ParserRuleContext {
		public String t;
		public ExplistContext explist;
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSubparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSubparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSubparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubparamlistContext subparamlist() throws RecognitionException {
		SubparamlistContext _localctx = new SubparamlistContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_subparamlist);
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				match(T__6);
				setState(467);
				((SubparamlistContext)_localctx).explist = explist();
				setState(468);
				match(T__7);
				((SubparamlistContext)_localctx).t =  "(" + ((SubparamlistContext)_localctx).explist.t + ")";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((SubparamlistContext)_localctx).t =  "";
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
		public String t;
		public ExpContext exp;
		public ExplistContext explist;
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
		enterRule(_localctx, 78, RULE_explist);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				((ExplistContext)_localctx).exp = exp(0);
				((ExplistContext)_localctx).t =  ((ExplistContext)_localctx).exp.t;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				((ExplistContext)_localctx).exp = exp(0);
				setState(478);
				match(T__8);
				setState(479);
				((ExplistContext)_localctx).explist = explist();
				((ExplistContext)_localctx).t =  ((ExplistContext)_localctx).exp.t + ", " + ((ExplistContext)_localctx).explist.t;
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
		enterRule(_localctx, 80, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(484);
				id();
				}
				break;
			case CONST_DEF_IDENTIFIER:
				{
				setState(485);
				const_();
				}
				break;
			case NUMERIC_INTEGER_CONST:
				{
				setState(486);
				int_();
				}
				break;
			case NUMERIC_REAL_CONST:
				{
				setState(487);
				real();
				setState(488);
				string();
				}
				break;
			case COMENTS:
				{
				setState(490);
				com();
				}
				break;
			case Aux_text:
				{
				setState(491);
				aux();
				}
				break;
			case Aux_simb:
				{
				setState(492);
				simb();
				}
				break;
			case RESERVED:
				{
				setState(493);
				resv();
				}
				break;
			case TYPE:
				{
				setState(494);
				typ();
				}
				break;
			case VOID:
				{
				setState(495);
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
		enterRule(_localctx, 82, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
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
		enterRule(_localctx, 84, RULE_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
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
		enterRule(_localctx, 86, RULE_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
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
		enterRule(_localctx, 88, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
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
		enterRule(_localctx, 90, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
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
		enterRule(_localctx, 92, RULE_com);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
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
		enterRule(_localctx, 94, RULE_aux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
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
		enterRule(_localctx, 96, RULE_simb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
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
		enterRule(_localctx, 98, RULE_resv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
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
		enterRule(_localctx, 100, RULE_typ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
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
		enterRule(_localctx, 102, RULE_voi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
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
		case 28:
			return expcond_sempred((ExpcondContext)_localctx, predIndex);
		case 34:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expcond_sempred(ExpcondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
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
		"\u0004\u0001(\u0209\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001u\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002|\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0083\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u008a\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0098\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00a5\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b2\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00be\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c8\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00e5\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00f1\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00ff\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0106\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0124\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0139\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0169\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u0174\b\u001c\n\u001c\f\u001c\u0177\t\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u017d\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u018d\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u0199\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u01ad\b\"\n\"\f\"\u01b0\t\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01bc\b#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u01c9\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01d1"+
		"\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u01d9\b&\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01e3"+
		"\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0003(\u01f1\b(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001"+
		"+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u0001"+
		"0\u00011\u00011\u00012\u00012\u00013\u00013\u00013\u0000\u00028D4\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdf\u0000\u0000\u0208\u0000h"+
		"\u0001\u0000\u0000\u0000\u0002t\u0001\u0000\u0000\u0000\u0004{\u0001\u0000"+
		"\u0000\u0000\u0006\u0082\u0001\u0000\u0000\u0000\b\u0089\u0001\u0000\u0000"+
		"\u0000\n\u008b\u0001\u0000\u0000\u0000\f\u0097\u0001\u0000\u0000\u0000"+
		"\u000e\u0099\u0001\u0000\u0000\u0000\u0010\u00a4\u0001\u0000\u0000\u0000"+
		"\u0012\u00a6\u0001\u0000\u0000\u0000\u0014\u00b1\u0001\u0000\u0000\u0000"+
		"\u0016\u00bd\u0001\u0000\u0000\u0000\u0018\u00c7\u0001\u0000\u0000\u0000"+
		"\u001a\u00c9\u0001\u0000\u0000\u0000\u001c\u00cf\u0001\u0000\u0000\u0000"+
		"\u001e\u00d2\u0001\u0000\u0000\u0000 \u00d9\u0001\u0000\u0000\u0000\""+
		"\u00e4\u0001\u0000\u0000\u0000$\u00f0\u0001\u0000\u0000\u0000&\u00f2\u0001"+
		"\u0000\u0000\u0000(\u00fe\u0001\u0000\u0000\u0000*\u0105\u0001\u0000\u0000"+
		"\u0000,\u0123\u0001\u0000\u0000\u0000.\u0125\u0001\u0000\u0000\u00000"+
		"\u0138\u0001\u0000\u0000\u00002\u013a\u0001\u0000\u0000\u00004\u0143\u0001"+
		"\u0000\u0000\u00006\u0168\u0001\u0000\u0000\u00008\u016a\u0001\u0000\u0000"+
		"\u0000:\u017c\u0001\u0000\u0000\u0000<\u018c\u0001\u0000\u0000\u0000>"+
		"\u0198\u0001\u0000\u0000\u0000@\u019a\u0001\u0000\u0000\u0000B\u019e\u0001"+
		"\u0000\u0000\u0000D\u01a3\u0001\u0000\u0000\u0000F\u01bb\u0001\u0000\u0000"+
		"\u0000H\u01c8\u0001\u0000\u0000\u0000J\u01d0\u0001\u0000\u0000\u0000L"+
		"\u01d8\u0001\u0000\u0000\u0000N\u01e2\u0001\u0000\u0000\u0000P\u01f0\u0001"+
		"\u0000\u0000\u0000R\u01f2\u0001\u0000\u0000\u0000T\u01f4\u0001\u0000\u0000"+
		"\u0000V\u01f6\u0001\u0000\u0000\u0000X\u01f8\u0001\u0000\u0000\u0000Z"+
		"\u01fa\u0001\u0000\u0000\u0000\\\u01fc\u0001\u0000\u0000\u0000^\u01fe"+
		"\u0001\u0000\u0000\u0000`\u0200\u0001\u0000\u0000\u0000b\u0202\u0001\u0000"+
		"\u0000\u0000d\u0204\u0001\u0000\u0000\u0000f\u0206\u0001\u0000\u0000\u0000"+
		"hi\u0003\u0002\u0001\u0000ij\u0006\u0000\uffff\uffff\u0000jk\u0003\u0006"+
		"\u0003\u0000kl\u0006\u0000\uffff\uffff\u0000lm\u0003\n\u0005\u0000mn\u0006"+
		"\u0000\uffff\uffff\u0000n\u0001\u0001\u0000\u0000\u0000op\u0003\f\u0006"+
		"\u0000pq\u0003\u0004\u0002\u0000qr\u0006\u0001\uffff\uffff\u0000ru\u0001"+
		"\u0000\u0000\u0000su\u0006\u0001\uffff\uffff\u0000to\u0001\u0000\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000u\u0003\u0001\u0000\u0000\u0000vw\u0003"+
		"\f\u0006\u0000wx\u0003\u0004\u0002\u0000xy\u0006\u0002\uffff\uffff\u0000"+
		"y|\u0001\u0000\u0000\u0000z|\u0006\u0002\uffff\uffff\u0000{v\u0001\u0000"+
		"\u0000\u0000{z\u0001\u0000\u0000\u0000|\u0005\u0001\u0000\u0000\u0000"+
		"}~\u0003\u001e\u000f\u0000~\u007f\u0003\b\u0004\u0000\u007f\u0080\u0006"+
		"\u0003\uffff\uffff\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0006\u0003\uffff\uffff\u0000\u0082}\u0001\u0000\u0000\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0007\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0003\u001e\u000f\u0000\u0085\u0086\u0003\b\u0004\u0000\u0086\u0087\u0006"+
		"\u0004\uffff\uffff\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u008a"+
		"\u0006\u0004\uffff\uffff\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\t\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0003&\u0013\u0000\u008c\u008d\u0005\u0001\u0000\u0000\u008d\u008e\u0003"+
		"(\u0014\u0000\u008e\u008f\u0005\u0002\u0000\u0000\u008f\u0090\u0006\u0005"+
		"\uffff\uffff\u0000\u0090\u000b\u0001\u0000\u0000\u0000\u0091\u0092\u0003"+
		"\u000e\u0007\u0000\u0092\u0093\u0006\u0006\uffff\uffff\u0000\u0093\u0098"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0003\u0012\t\u0000\u0095\u0096\u0006"+
		"\u0006\uffff\uffff\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0091"+
		"\u0001\u0000\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0098\r\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005\u0003\u0000\u0000\u009a\u009b\u0005"+
		"!\u0000\u0000\u009b\u009c\u0003\u0010\b\u0000\u009c\u009d\u0006\u0007"+
		"\uffff\uffff\u0000\u009d\u000f\u0001\u0000\u0000\u0000\u009e\u009f\u0005"+
		"#\u0000\u0000\u009f\u00a5\u0006\b\uffff\uffff\u0000\u00a0\u00a1\u0005"+
		"$\u0000\u0000\u00a1\u00a5\u0006\b\uffff\uffff\u0000\u00a2\u00a3\u0005"+
		"%\u0000\u0000\u00a3\u00a5\u0006\b\uffff\uffff\u0000\u00a4\u009e\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a0\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a5\u0011\u0001\u0000\u0000\u0000\u00a6\u00a7\u0003"+
		"\u0016\u000b\u0000\u00a7\u00a8\u0005\u0004\u0000\u0000\u00a8\u00a9\u0003"+
		"\u0014\n\u0000\u00a9\u00aa\u0006\t\uffff\uffff\u0000\u00aa\u0013\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0003\u0016\u000b\u0000\u00ac\u00ad\u0005"+
		"\u0004\u0000\u0000\u00ad\u00ae\u0003\u0014\n\u0000\u00ae\u00af\u0006\n"+
		"\uffff\uffff\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00b2\u0006"+
		"\n\uffff\uffff\u0000\u00b1\u00ab\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b2\u0015\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003"+
		"\u0018\f\u0000\u00b4\u00b5\u0005\"\u0000\u0000\u00b5\u00b6\u0006\u000b"+
		"\uffff\uffff\u0000\u00b6\u00be\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003"+
		"\u0018\f\u0000\u00b8\u00b9\u0005\"\u0000\u0000\u00b9\u00ba\u0005\u0005"+
		"\u0000\u0000\u00ba\u00bb\u0003\u0010\b\u0000\u00bb\u00bc\u0006\u000b\uffff"+
		"\uffff\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00b3\u0001\u0000"+
		"\u0000\u0000\u00bd\u00b7\u0001\u0000\u0000\u0000\u00be\u0017\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005\u001f\u0000\u0000\u00c0\u00c8\u0006\f\uffff"+
		"\uffff\u0000\u00c1\u00c2\u0003\u001c\u000e\u0000\u00c2\u00c3\u0006\f\uffff"+
		"\uffff\u0000\u00c3\u00c8\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003\u001a"+
		"\r\u0000\u00c5\u00c6\u0006\f\uffff\uffff\u0000\u00c6\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c7\u00bf\u0001\u0000\u0000\u0000\u00c7\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c8\u0019\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0005\u0006\u0000\u0000\u00ca\u00cb\u0005\u0001"+
		"\u0000\u0000\u00cb\u00cc\u0003\u0012\t\u0000\u00cc\u00cd\u0005\u0002\u0000"+
		"\u0000\u00cd\u00ce\u0006\r\uffff\uffff\u0000\u00ce\u001b\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0005 \u0000\u0000\u00d0\u00d1\u0006\u000e\uffff\uffff"+
		"\u0000\u00d1\u001d\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003 \u0010\u0000"+
		"\u00d3\u00d4\u0006\u000f\uffff\uffff\u0000\u00d4\u00d5\u0005\u0001\u0000"+
		"\u0000\u00d5\u00d6\u0003(\u0014\u0000\u00d6\u00d7\u0005\u0002\u0000\u0000"+
		"\u00d7\u00d8\u0006\u000f\uffff\uffff\u0000\u00d8\u001f\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0003\u0018\f\u0000\u00da\u00db\u0005\"\u0000\u0000"+
		"\u00db\u00dc\u0005\u0007\u0000\u0000\u00dc\u00dd\u0003\"\u0011\u0000\u00dd"+
		"\u00de\u0005\b\u0000\u0000\u00de\u00df\u0006\u0010\uffff\uffff\u0000\u00df"+
		"!\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003$\u0012\u0000\u00e1\u00e2\u0006"+
		"\u0011\uffff\uffff\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e5"+
		"\u0006\u0011\uffff\uffff\u0000\u00e4\u00e0\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e5#\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0003\u0018\f\u0000\u00e7\u00e8\u0005\"\u0000\u0000\u00e8\u00e9\u0006"+
		"\u0012\uffff\uffff\u0000\u00e9\u00f1\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0003\u0018\f\u0000\u00eb\u00ec\u0005\"\u0000\u0000\u00ec\u00ed\u0005"+
		"\t\u0000\u0000\u00ed\u00ee\u0003$\u0012\u0000\u00ee\u00ef\u0006\u0012"+
		"\uffff\uffff\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00e6\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ea\u0001\u0000\u0000\u0000\u00f1%\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0003\u001c\u000e\u0000\u00f3\u00f4\u0005\n\u0000"+
		"\u0000\u00f4\u00f5\u0005\u0007\u0000\u0000\u00f5\u00f6\u0003\"\u0011\u0000"+
		"\u00f6\u00f7\u0005\b\u0000\u0000\u00f7\u00f8\u0006\u0013\uffff\uffff\u0000"+
		"\u00f8\'\u0001\u0000\u0000\u0000\u00f9\u00fa\u0003,\u0016\u0000\u00fa"+
		"\u00fb\u0003*\u0015\u0000\u00fb\u00fc\u0006\u0014\uffff\uffff\u0000\u00fc"+
		"\u00ff\u0001\u0000\u0000\u0000\u00fd\u00ff\u0006\u0014\uffff\uffff\u0000"+
		"\u00fe\u00f9\u0001\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff)\u0001\u0000\u0000\u0000\u0100\u0101\u0003,\u0016\u0000\u0101\u0102"+
		"\u0003*\u0015\u0000\u0102\u0103\u0006\u0015\uffff\uffff\u0000\u0103\u0106"+
		"\u0001\u0000\u0000\u0000\u0104\u0106\u0006\u0015\uffff\uffff\u0000\u0105"+
		"\u0100\u0001\u0000\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106"+
		"+\u0001\u0000\u0000\u0000\u0107\u0108\u0003B!\u0000\u0108\u0109\u0005"+
		"\u0004\u0000\u0000\u0109\u010a\u0006\u0016\uffff\uffff\u0000\u010a\u0124"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0003J%\u0000\u010c\u010d\u0005\u0004"+
		"\u0000\u0000\u010d\u010e\u0006\u0016\uffff\uffff\u0000\u010e\u0124\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0003\u0016\u000b\u0000\u0110\u0111\u0005"+
		"\u0004\u0000\u0000\u0111\u0112\u0006\u0016\uffff\uffff\u0000\u0112\u0124"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0003@ \u0000\u0114\u0115\u0005\u0004"+
		"\u0000\u0000\u0115\u0116\u0006\u0016\uffff\uffff\u0000\u0116\u0124\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0003.\u0017\u0000\u0118\u0119\u0006\u0016"+
		"\uffff\uffff\u0000\u0119\u0124\u0001\u0000\u0000\u0000\u011a\u011b\u0003"+
		"2\u0019\u0000\u011b\u011c\u0006\u0016\uffff\uffff\u0000\u011c\u0124\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u00034\u001a\u0000\u011e\u011f\u0006\u0016"+
		"\uffff\uffff\u0000\u011f\u0124\u0001\u0000\u0000\u0000\u0120\u0121\u0003"+
		"6\u001b\u0000\u0121\u0122\u0006\u0016\uffff\uffff\u0000\u0122\u0124\u0001"+
		"\u0000\u0000\u0000\u0123\u0107\u0001\u0000\u0000\u0000\u0123\u010b\u0001"+
		"\u0000\u0000\u0000\u0123\u010f\u0001\u0000\u0000\u0000\u0123\u0113\u0001"+
		"\u0000\u0000\u0000\u0123\u0117\u0001\u0000\u0000\u0000\u0123\u011a\u0001"+
		"\u0000\u0000\u0000\u0123\u011d\u0001\u0000\u0000\u0000\u0123\u0120\u0001"+
		"\u0000\u0000\u0000\u0124-\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u000b"+
		"\u0000\u0000\u0126\u0127\u00038\u001c\u0000\u0127\u0128\u0005\u0001\u0000"+
		"\u0000\u0128\u0129\u0003(\u0014\u0000\u0129\u012a\u0005\u0002\u0000\u0000"+
		"\u012a\u012b\u00030\u0018\u0000\u012b\u012c\u0006\u0017\uffff\uffff\u0000"+
		"\u012c/\u0001\u0000\u0000\u0000\u012d\u012e\u0005\f\u0000\u0000\u012e"+
		"\u012f\u0005\u0001\u0000\u0000\u012f\u0130\u0003(\u0014\u0000\u0130\u0131"+
		"\u0005\u0002\u0000\u0000\u0131\u0132\u0006\u0018\uffff\uffff\u0000\u0132"+
		"\u0139\u0001\u0000\u0000\u0000\u0133\u0134\u0005\f\u0000\u0000\u0134\u0135"+
		"\u0003.\u0017\u0000\u0135\u0136\u0006\u0018\uffff\uffff\u0000\u0136\u0139"+
		"\u0001\u0000\u0000\u0000\u0137\u0139\u0006\u0018\uffff\uffff\u0000\u0138"+
		"\u012d\u0001\u0000\u0000\u0000\u0138\u0133\u0001\u0000\u0000\u0000\u0138"+
		"\u0137\u0001\u0000\u0000\u0000\u01391\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0005\r\u0000\u0000\u013b\u013c\u0005\u0007\u0000\u0000\u013c\u013d\u0003"+
		"8\u001c\u0000\u013d\u013e\u0005\b\u0000\u0000\u013e\u013f\u0005\u0001"+
		"\u0000\u0000\u013f\u0140\u0003(\u0014\u0000\u0140\u0141\u0005\u0002\u0000"+
		"\u0000\u0141\u0142\u0006\u0019\uffff\uffff\u0000\u01423\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0005\u000e\u0000\u0000\u0144\u0145\u0005\u0001\u0000"+
		"\u0000\u0145\u0146\u0003(\u0014\u0000\u0146\u0147\u0005\u0002\u0000\u0000"+
		"\u0147\u0148\u0005\r\u0000\u0000\u0148\u0149\u0005\u0007\u0000\u0000\u0149"+
		"\u014a\u00038\u001c\u0000\u014a\u014b\u0005\b\u0000\u0000\u014b\u014c"+
		"\u0005\u0004\u0000\u0000\u014c\u014d\u0006\u001a\uffff\uffff\u0000\u014d"+
		"5\u0001\u0000\u0000\u0000\u014e\u014f\u0005\u000f\u0000\u0000\u014f\u0150"+
		"\u0005\u0007\u0000\u0000\u0150\u0151\u0003\u0016\u000b\u0000\u0151\u0152"+
		"\u0005\u0004\u0000\u0000\u0152\u0153\u00038\u001c\u0000\u0153\u0154\u0005"+
		"\u0004\u0000\u0000\u0154\u0155\u0003B!\u0000\u0155\u0156\u0005\b\u0000"+
		"\u0000\u0156\u0157\u0005\u0001\u0000\u0000\u0157\u0158\u0003(\u0014\u0000"+
		"\u0158\u0159\u0005\u0002\u0000\u0000\u0159\u015a\u0006\u001b\uffff\uffff"+
		"\u0000\u015a\u0169\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u000f\u0000"+
		"\u0000\u015c\u015d\u0005\u0007\u0000\u0000\u015d\u015e\u0003B!\u0000\u015e"+
		"\u015f\u0005\u0004\u0000\u0000\u015f\u0160\u00038\u001c\u0000\u0160\u0161"+
		"\u0005\u0004\u0000\u0000\u0161\u0162\u0003B!\u0000\u0162\u0163\u0005\b"+
		"\u0000\u0000\u0163\u0164\u0005\u0001\u0000\u0000\u0164\u0165\u0003(\u0014"+
		"\u0000\u0165\u0166\u0005\u0002\u0000\u0000\u0166\u0167\u0006\u001b\uffff"+
		"\uffff\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u014e\u0001\u0000"+
		"\u0000\u0000\u0168\u015b\u0001\u0000\u0000\u0000\u01697\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u0006\u001c\uffff\uffff\u0000\u016b\u016c\u0003<\u001e"+
		"\u0000\u016c\u016d\u0006\u001c\uffff\uffff\u0000\u016d\u0175\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\n\u0002\u0000\u0000\u016f\u0170\u0003:\u001d"+
		"\u0000\u0170\u0171\u00038\u001c\u0003\u0171\u0172\u0006\u001c\uffff\uffff"+
		"\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u016e\u0001\u0000\u0000"+
		"\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000"+
		"\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u01769\u0001\u0000\u0000\u0000"+
		"\u0177\u0175\u0001\u0000\u0000\u0000\u0178\u0179\u0005\u0010\u0000\u0000"+
		"\u0179\u017d\u0006\u001d\uffff\uffff\u0000\u017a\u017b\u0005\u0011\u0000"+
		"\u0000\u017b\u017d\u0006\u001d\uffff\uffff\u0000\u017c\u0178\u0001\u0000"+
		"\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d;\u0001\u0000\u0000"+
		"\u0000\u017e\u017f\u0003D\"\u0000\u017f\u0180\u0003>\u001f\u0000\u0180"+
		"\u0181\u0003D\"\u0000\u0181\u0182\u0006\u001e\uffff\uffff\u0000\u0182"+
		"\u018d\u0001\u0000\u0000\u0000\u0183\u0184\u0005\u0007\u0000\u0000\u0184"+
		"\u0185\u00038\u001c\u0000\u0185\u0186\u0005\b\u0000\u0000\u0186\u0187"+
		"\u0006\u001e\uffff\uffff\u0000\u0187\u018d\u0001\u0000\u0000\u0000\u0188"+
		"\u0189\u0005\u0012\u0000\u0000\u0189\u018a\u0003<\u001e\u0000\u018a\u018b"+
		"\u0006\u001e\uffff\uffff\u0000\u018b\u018d\u0001\u0000\u0000\u0000\u018c"+
		"\u017e\u0001\u0000\u0000\u0000\u018c\u0183\u0001\u0000\u0000\u0000\u018c"+
		"\u0188\u0001\u0000\u0000\u0000\u018d=\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0005\u0013\u0000\u0000\u018f\u0199\u0006\u001f\uffff\uffff\u0000\u0190"+
		"\u0191\u0005\u0014\u0000\u0000\u0191\u0199\u0006\u001f\uffff\uffff\u0000"+
		"\u0192\u0193\u0005\u0015\u0000\u0000\u0193\u0199\u0006\u001f\uffff\uffff"+
		"\u0000\u0194\u0195\u0005\u0016\u0000\u0000\u0195\u0199\u0006\u001f\uffff"+
		"\uffff\u0000\u0196\u0197\u0005\u0017\u0000\u0000\u0197\u0199\u0006\u001f"+
		"\uffff\uffff\u0000\u0198\u018e\u0001\u0000\u0000\u0000\u0198\u0190\u0001"+
		"\u0000\u0000\u0000\u0198\u0192\u0001\u0000\u0000\u0000\u0198\u0194\u0001"+
		"\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0199?\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0005\u0018\u0000\u0000\u019b\u019c\u0003D\""+
		"\u0000\u019c\u019d\u0006 \uffff\uffff\u0000\u019dA\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0005\"\u0000\u0000\u019f\u01a0\u0005\u0005\u0000\u0000\u01a0"+
		"\u01a1\u0003D\"\u0000\u01a1\u01a2\u0006!\uffff\uffff\u0000\u01a2C\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a4\u0006\"\uffff\uffff\u0000\u01a4\u01a5\u0003"+
		"H$\u0000\u01a5\u01a6\u0006\"\uffff\uffff\u0000\u01a6\u01ae\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a8\n\u0002\u0000\u0000\u01a8\u01a9\u0003F#\u0000"+
		"\u01a9\u01aa\u0003D\"\u0003\u01aa\u01ab\u0006\"\uffff\uffff\u0000\u01ab"+
		"\u01ad\u0001\u0000\u0000\u0000\u01ac\u01a7\u0001\u0000\u0000\u0000\u01ad"+
		"\u01b0\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae"+
		"\u01af\u0001\u0000\u0000\u0000\u01afE\u0001\u0000\u0000\u0000\u01b0\u01ae"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005\u0019\u0000\u0000\u01b2\u01bc"+
		"\u0006#\uffff\uffff\u0000\u01b3\u01b4\u0005\u001a\u0000\u0000\u01b4\u01bc"+
		"\u0006#\uffff\uffff\u0000\u01b5\u01b6\u0005\u001b\u0000\u0000\u01b6\u01bc"+
		"\u0006#\uffff\uffff\u0000\u01b7\u01b8\u0005\u001c\u0000\u0000\u01b8\u01bc"+
		"\u0006#\uffff\uffff\u0000\u01b9\u01ba\u0005\u001d\u0000\u0000\u01ba\u01bc"+
		"\u0006#\uffff\uffff\u0000\u01bb\u01b1\u0001\u0000\u0000\u0000\u01bb\u01b3"+
		"\u0001\u0000\u0000\u0000\u01bb\u01b5\u0001\u0000\u0000\u0000\u01bb\u01b7"+
		"\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bcG\u0001"+
		"\u0000\u0000\u0000\u01bd\u01be\u0003\u0010\b\u0000\u01be\u01bf\u0006$"+
		"\uffff\uffff\u0000\u01bf\u01c9\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005"+
		"\u0007\u0000\u0000\u01c1\u01c2\u0003D\"\u0000\u01c2\u01c3\u0005\b\u0000"+
		"\u0000\u01c3\u01c4\u0006$\uffff\uffff\u0000\u01c4\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\u0003J%\u0000\u01c6\u01c7\u0006$\uffff\uffff\u0000"+
		"\u01c7\u01c9\u0001\u0000\u0000\u0000\u01c8\u01bd\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c0\u0001\u0000\u0000\u0000\u01c8\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c9I\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005\"\u0000\u0000\u01cb"+
		"\u01cc\u0003L&\u0000\u01cc\u01cd\u0006%\uffff\uffff\u0000\u01cd\u01d1"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005!\u0000\u0000\u01cf\u01d1\u0006"+
		"%\uffff\uffff\u0000\u01d0\u01ca\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001"+
		"\u0000\u0000\u0000\u01d1K\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005\u0007"+
		"\u0000\u0000\u01d3\u01d4\u0003N\'\u0000\u01d4\u01d5\u0005\b\u0000\u0000"+
		"\u01d5\u01d6\u0006&\uffff\uffff\u0000\u01d6\u01d9\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d9\u0006&\uffff\uffff\u0000\u01d8\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d9M\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u0003D\"\u0000\u01db\u01dc\u0006\'\uffff\uffff\u0000\u01dc\u01e3"+
		"\u0001\u0000\u0000\u0000\u01dd\u01de\u0003D\"\u0000\u01de\u01df\u0005"+
		"\t\u0000\u0000\u01df\u01e0\u0003N\'\u0000\u01e0\u01e1\u0006\'\uffff\uffff"+
		"\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000\u01e2\u01da\u0001\u0000\u0000"+
		"\u0000\u01e2\u01dd\u0001\u0000\u0000\u0000\u01e3O\u0001\u0000\u0000\u0000"+
		"\u01e4\u01f1\u0003R)\u0000\u01e5\u01f1\u0003T*\u0000\u01e6\u01f1\u0003"+
		"V+\u0000\u01e7\u01e8\u0003X,\u0000\u01e8\u01e9\u0003Z-\u0000\u01e9\u01f1"+
		"\u0001\u0000\u0000\u0000\u01ea\u01f1\u0003\\.\u0000\u01eb\u01f1\u0003"+
		"^/\u0000\u01ec\u01f1\u0003`0\u0000\u01ed\u01f1\u0003b1\u0000\u01ee\u01f1"+
		"\u0003d2\u0000\u01ef\u01f1\u0003f3\u0000\u01f0\u01e4\u0001\u0000\u0000"+
		"\u0000\u01f0\u01e5\u0001\u0000\u0000\u0000\u01f0\u01e6\u0001\u0000\u0000"+
		"\u0000\u01f0\u01e7\u0001\u0000\u0000\u0000\u01f0\u01ea\u0001\u0000\u0000"+
		"\u0000\u01f0\u01eb\u0001\u0000\u0000\u0000\u01f0\u01ec\u0001\u0000\u0000"+
		"\u0000\u01f0\u01ed\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000"+
		"\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f1Q\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f3\u0005\"\u0000\u0000\u01f3S\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f5\u0005!\u0000\u0000\u01f5U\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005"+
		"#\u0000\u0000\u01f7W\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005$\u0000"+
		"\u0000\u01f9Y\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005%\u0000\u0000\u01fb"+
		"[\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005&\u0000\u0000\u01fd]\u0001"+
		"\u0000\u0000\u0000\u01fe\u01ff\u0005\'\u0000\u0000\u01ff_\u0001\u0000"+
		"\u0000\u0000\u0200\u0201\u0005(\u0000\u0000\u0201a\u0001\u0000\u0000\u0000"+
		"\u0202\u0203\u0005\u001e\u0000\u0000\u0203c\u0001\u0000\u0000\u0000\u0204"+
		"\u0205\u0005\u001f\u0000\u0000\u0205e\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0005 \u0000\u0000\u0207g\u0001\u0000\u0000\u0000\u001bt{\u0082\u0089"+
		"\u0097\u00a4\u00b1\u00bd\u00c7\u00e4\u00f0\u00fe\u0105\u0123\u0138\u0168"+
		"\u0175\u017c\u018c\u0198\u01ae\u01bb\u01c8\u01d0\u01d8\u01e2\u01f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}