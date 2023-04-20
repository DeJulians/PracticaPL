// Generated from C:/Users/USER/OneDrive/Documentos/GitHub/PracticaPL/src\gramatica.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(gramaticaParser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(gramaticaParser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#funlist}.
	 * @param ctx the parse tree
	 */
	void enterFunlist(gramaticaParser.FunlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#funlist}.
	 * @param ctx the parse tree
	 */
	void exitFunlist(gramaticaParser.FunlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(gramaticaParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(gramaticaParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(gramaticaParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(gramaticaParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(gramaticaParser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(gramaticaParser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#ctelist1}.
	 * @param ctx the parse tree
	 */
	void enterCtelist1(gramaticaParser.Ctelist1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#ctelist1}.
	 * @param ctx the parse tree
	 */
	void exitCtelist1(gramaticaParser.Ctelist1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(gramaticaParser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(gramaticaParser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(gramaticaParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(gramaticaParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#varlist1}.
	 * @param ctx the parse tree
	 */
	void enterVarlist1(gramaticaParser.Varlist1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#varlist1}.
	 * @param ctx the parse tree
	 */
	void exitVarlist1(gramaticaParser.Varlist1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(gramaticaParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(gramaticaParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tbas}.
	 * @param ctx the parse tree
	 */
	void enterTbas(gramaticaParser.TbasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tbas}.
	 * @param ctx the parse tree
	 */
	void exitTbas(gramaticaParser.TbasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tvoid}.
	 * @param ctx the parse tree
	 */
	void enterTvoid(gramaticaParser.TvoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tvoid}.
	 * @param ctx the parse tree
	 */
	void exitTvoid(gramaticaParser.TvoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(gramaticaParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(gramaticaParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#funchead}.
	 * @param ctx the parse tree
	 */
	void enterFunchead(gramaticaParser.FuncheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#funchead}.
	 * @param ctx the parse tree
	 */
	void exitFunchead(gramaticaParser.FuncheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#typedef1}.
	 * @param ctx the parse tree
	 */
	void enterTypedef1(gramaticaParser.Typedef1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#typedef1}.
	 * @param ctx the parse tree
	 */
	void exitTypedef1(gramaticaParser.Typedef1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#typedef2}.
	 * @param ctx the parse tree
	 */
	void enterTypedef2(gramaticaParser.Typedef2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#typedef2}.
	 * @param ctx the parse tree
	 */
	void exitTypedef2(gramaticaParser.Typedef2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#typedef22}.
	 * @param ctx the parse tree
	 */
	void enterTypedef22(gramaticaParser.Typedef22Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#typedef22}.
	 * @param ctx the parse tree
	 */
	void exitTypedef22(gramaticaParser.Typedef22Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#mainhead}.
	 * @param ctx the parse tree
	 */
	void enterMainhead(gramaticaParser.MainheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#mainhead}.
	 * @param ctx the parse tree
	 */
	void exitMainhead(gramaticaParser.MainheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(gramaticaParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(gramaticaParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(gramaticaParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(gramaticaParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(gramaticaParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(gramaticaParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(gramaticaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(gramaticaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(gramaticaParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(gramaticaParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(gramaticaParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(gramaticaParser.FunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubpparamlist(gramaticaParser.SubpparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubpparamlist(gramaticaParser.SubpparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(gramaticaParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(gramaticaParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(gramaticaParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(gramaticaParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(gramaticaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(gramaticaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(gramaticaParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(gramaticaParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#int}.
	 * @param ctx the parse tree
	 */
	void enterInt(gramaticaParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#int}.
	 * @param ctx the parse tree
	 */
	void exitInt(gramaticaParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(gramaticaParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(gramaticaParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(gramaticaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(gramaticaParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#com}.
	 * @param ctx the parse tree
	 */
	void enterCom(gramaticaParser.ComContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#com}.
	 * @param ctx the parse tree
	 */
	void exitCom(gramaticaParser.ComContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#aux}.
	 * @param ctx the parse tree
	 */
	void enterAux(gramaticaParser.AuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#aux}.
	 * @param ctx the parse tree
	 */
	void exitAux(gramaticaParser.AuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#simb}.
	 * @param ctx the parse tree
	 */
	void enterSimb(gramaticaParser.SimbContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#simb}.
	 * @param ctx the parse tree
	 */
	void exitSimb(gramaticaParser.SimbContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#resv}.
	 * @param ctx the parse tree
	 */
	void enterResv(gramaticaParser.ResvContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#resv}.
	 * @param ctx the parse tree
	 */
	void exitResv(gramaticaParser.ResvContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#typ}.
	 * @param ctx the parse tree
	 */
	void enterTyp(gramaticaParser.TypContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#typ}.
	 * @param ctx the parse tree
	 */
	void exitTyp(gramaticaParser.TypContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#voi}.
	 * @param ctx the parse tree
	 */
	void enterVoi(gramaticaParser.VoiContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#voi}.
	 * @param ctx the parse tree
	 */
	void exitVoi(gramaticaParser.VoiContext ctx);
}