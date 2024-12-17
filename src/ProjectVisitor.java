// Generated from Project.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProjectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProjectVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProjectParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ProjectParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#function_definitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definitions(ProjectParser.Function_definitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(ProjectParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(ProjectParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ProjectParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code beginend}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginend(ProjectParser.BeginendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ProjectParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(ProjectParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ProjectParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(ProjectParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ProjectParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(ProjectParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(ProjectParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ProjectParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(ProjectParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ProjectParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paranthesis}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesis(ProjectParser.ParanthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binopr}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinopr(ProjectParser.BinoprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mexpr}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMexpr(ProjectParser.MexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#mexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMexp(ProjectParser.MexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#mldv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMldv(ProjectParser.MldvContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(ProjectParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paran}
	 * labeled alternative in {@link ProjectParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParan(ProjectParser.ParanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idd}
	 * labeled alternative in {@link ProjectParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdd(ProjectParser.IddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numm}
	 * labeled alternative in {@link ProjectParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumm(ProjectParser.NummContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#spop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpop(ProjectParser.SpopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#mldvop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMldvop(ProjectParser.MldvopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#faop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaop(ProjectParser.FaopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(ProjectParser.BinopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ProjectParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ProjectParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#boolea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolea(ProjectParser.BooleaContext ctx);
}