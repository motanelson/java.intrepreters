// Generated from Basic.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BasicParser}.
 */
public interface BasicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BasicParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BasicParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BasicParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(BasicParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(BasicParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BasicParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BasicParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(BasicParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(BasicParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(BasicParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(BasicParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignment(BasicParser.ArrayAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignment(BasicParser.ArrayAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(BasicParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(BasicParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(BasicParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(BasicParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#subroutineDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubroutineDefinition(BasicParser.SubroutineDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#subroutineDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubroutineDefinition(BasicParser.SubroutineDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(BasicParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(BasicParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(BasicParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(BasicParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(BasicParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(BasicParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(BasicParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(BasicParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(BasicParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(BasicParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(BasicParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(BasicParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#labelStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabelStatement(BasicParser.LabelStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#labelStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabelStatement(BasicParser.LabelStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(BasicParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(BasicParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(BasicParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(BasicParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(BasicParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(BasicParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BasicParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BasicParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(BasicParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(BasicParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(BasicParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(BasicParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(BasicParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(BasicParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(BasicParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(BasicParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(BasicParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(BasicParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(BasicParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(BasicParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(BasicParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(BasicParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(BasicParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(BasicParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(BasicParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(BasicParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(BasicParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(BasicParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(BasicParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(BasicParser.ArgumentListContext ctx);
}