// Generated from Project.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProjectParser}.
 */
public interface ProjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProjectParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ProjectParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ProjectParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#function_definitions}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definitions(ProjectParser.Function_definitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#function_definitions}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definitions(ProjectParser.Function_definitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(ProjectParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(ProjectParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(ProjectParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(ProjectParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ProjectParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ProjectParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code beginend}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBeginend(ProjectParser.BeginendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code beginend}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBeginend(ProjectParser.BeginendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(ProjectParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(ProjectParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(ProjectParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(ProjectParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ProjectParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ProjectParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFor(ProjectParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFor(ProjectParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ProjectParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ProjectParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunc(ProjectParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func}
	 * labeled alternative in {@link ProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunc(ProjectParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(ProjectParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(ProjectParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBool(ProjectParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBool(ProjectParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(ProjectParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(ProjectParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(ProjectParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(ProjectParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paranthesis}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParanthesis(ProjectParser.ParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paranthesis}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParanthesis(ProjectParser.ParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binopr}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinopr(ProjectParser.BinoprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binopr}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinopr(ProjectParser.BinoprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mexpr}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMexpr(ProjectParser.MexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mexpr}
	 * labeled alternative in {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMexpr(ProjectParser.MexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterMexp(ProjectParser.MexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitMexp(ProjectParser.MexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#mldv}.
	 * @param ctx the parse tree
	 */
	void enterMldv(ProjectParser.MldvContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#mldv}.
	 * @param ctx the parse tree
	 */
	void exitMldv(ProjectParser.MldvContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(ProjectParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(ProjectParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paran}
	 * labeled alternative in {@link ProjectParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterParan(ProjectParser.ParanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paran}
	 * labeled alternative in {@link ProjectParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitParan(ProjectParser.ParanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idd}
	 * labeled alternative in {@link ProjectParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterIdd(ProjectParser.IddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idd}
	 * labeled alternative in {@link ProjectParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitIdd(ProjectParser.IddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numm}
	 * labeled alternative in {@link ProjectParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterNumm(ProjectParser.NummContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numm}
	 * labeled alternative in {@link ProjectParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitNumm(ProjectParser.NummContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#spop}.
	 * @param ctx the parse tree
	 */
	void enterSpop(ProjectParser.SpopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#spop}.
	 * @param ctx the parse tree
	 */
	void exitSpop(ProjectParser.SpopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#mldvop}.
	 * @param ctx the parse tree
	 */
	void enterMldvop(ProjectParser.MldvopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#mldvop}.
	 * @param ctx the parse tree
	 */
	void exitMldvop(ProjectParser.MldvopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#faop}.
	 * @param ctx the parse tree
	 */
	void enterFaop(ProjectParser.FaopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#faop}.
	 * @param ctx the parse tree
	 */
	void exitFaop(ProjectParser.FaopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(ProjectParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(ProjectParser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ProjectParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ProjectParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ProjectParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ProjectParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#boolea}.
	 * @param ctx the parse tree
	 */
	void enterBoolea(ProjectParser.BooleaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#boolea}.
	 * @param ctx the parse tree
	 */
	void exitBoolea(ProjectParser.BooleaContext ctx);
}