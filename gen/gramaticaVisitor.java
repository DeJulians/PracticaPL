// Generated from C:/Users/USER/OneDrive/Documentos/GitHub/PracticaPL/src\gramatica.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#dcllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllist(gramaticaParser.DcllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#dcllist1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllist1(gramaticaParser.Dcllist1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#funlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunlist(gramaticaParser.FunlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#funlist1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunlist1(gramaticaParser.Funlist1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(gramaticaParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(gramaticaParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#ctedef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtedef(gramaticaParser.CtedefContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#ctelist1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist1(gramaticaParser.Ctelist1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#simpvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpvalue(gramaticaParser.SimpvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(gramaticaParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#varlist1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist1(gramaticaParser.Varlist1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#vardef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardef(gramaticaParser.VardefContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#tbas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTbas(gramaticaParser.TbasContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(gramaticaParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#tvoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTvoid(gramaticaParser.TvoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(gramaticaParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#funchead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunchead(gramaticaParser.FuncheadContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#typedef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef(gramaticaParser.TypedefContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#typedef1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef1(gramaticaParser.Typedef1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#mainhead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainhead(gramaticaParser.MainheadContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(gramaticaParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#code1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode1(gramaticaParser.Code1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(gramaticaParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#ifa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfa(gramaticaParser.IfaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#elsea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsea(gramaticaParser.ElseaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#whilea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilea(gramaticaParser.WhileaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#dowhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile(gramaticaParser.DowhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#fora}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFora(gramaticaParser.ForaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcond(gramaticaParser.ExpcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#oplog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOplog(gramaticaParser.OplogContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#factorcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorcond(gramaticaParser.FactorcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#opcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcomp(gramaticaParser.OpcompContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#returna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturna(gramaticaParser.ReturnaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(gramaticaParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(gramaticaParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(gramaticaParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#funccall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall(gramaticaParser.FunccallContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#subparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubparamlist(gramaticaParser.SubparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(gramaticaParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(gramaticaParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(gramaticaParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(gramaticaParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(gramaticaParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(gramaticaParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(gramaticaParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCom(gramaticaParser.ComContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux(gramaticaParser.AuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#simb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimb(gramaticaParser.SimbContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#resv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResv(gramaticaParser.ResvContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#typ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyp(gramaticaParser.TypContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#voi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoi(gramaticaParser.VoiContext ctx);
}