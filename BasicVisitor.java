// Generated from Basic.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BasicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BasicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BasicParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BasicParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(BasicParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BasicParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(BasicParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(BasicParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#arrayAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignment(BasicParser.ArrayAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(BasicParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(BasicParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#subroutineDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineDefinition(BasicParser.SubroutineDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(BasicParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(BasicParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(BasicParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(BasicParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(BasicParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(BasicParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#labelStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelStatement(BasicParser.LabelStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(BasicParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(BasicParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(BasicParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BasicParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(BasicParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(BasicParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(BasicParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(BasicParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(BasicParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(BasicParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(BasicParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(BasicParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(BasicParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(BasicParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(BasicParser.ArgumentListContext ctx);
}