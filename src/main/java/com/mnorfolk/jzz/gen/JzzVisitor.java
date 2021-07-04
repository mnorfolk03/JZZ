// Generated from C:/Users/KidsComputer/Documents/Intellij Projects/LanguageV2/src/main/resources\Jzz.g4 by ANTLR 4.7.2

package com.mnorfolk.jzz.gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JzzParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JzzVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JzzParser#parseFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseFile(JzzParser.ParseFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiLambda}
	 * labeled alternative in {@link JzzParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLambda(JzzParser.MultiLambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleLambda}
	 * labeled alternative in {@link JzzParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleLambda(JzzParser.SingleLambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JzzParser#lambdaParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParams(JzzParser.LambdaParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareAndAssignLine}
	 * labeled alternative in {@link JzzParser#codeLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareAndAssignLine(JzzParser.DeclareAndAssignLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareLine}
	 * labeled alternative in {@link JzzParser#codeLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareLine(JzzParser.DeclareLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignLine}
	 * labeled alternative in {@link JzzParser#codeLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignLine(JzzParser.AssignLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignCallableLine}
	 * labeled alternative in {@link JzzParser#codeLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignCallableLine(JzzParser.AssignCallableLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLine}
	 * labeled alternative in {@link JzzParser#codeLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLine(JzzParser.ExprLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link JzzParser#declareVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareVar(JzzParser.DeclareVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link JzzParser#assignVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVar(JzzParser.AssignVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignParen}
	 * labeled alternative in {@link JzzParser#assignCallable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignParen(JzzParser.AssignParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignBracket}
	 * labeled alternative in {@link JzzParser#assignCallable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignBracket(JzzParser.AssignBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link JzzParser#declareAndAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareAndAssign(JzzParser.DeclareAndAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link JzzParser#parenParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenParams(JzzParser.ParenParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JzzParser#bracketParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketParams(JzzParser.BracketParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preNegate}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreNegate(JzzParser.PreNegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preDecrement}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrement(JzzParser.PreDecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiDivOp}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiDivOp(JzzParser.MultiDivOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpr(JzzParser.ObjectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preNot}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreNot(JzzParser.PreNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powOp}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowOp(JzzParser.PowOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preAmpersand}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreAmpersand(JzzParser.PreAmpersandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preStar}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreStar(JzzParser.PreStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preIncrement}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrement(JzzParser.PreIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinusOp}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusOp(JzzParser.PlusMinusOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftOp}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOp(JzzParser.ShiftOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiCompExpr}
	 * labeled alternative in {@link JzzParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiCompExpr(JzzParser.MultiCompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code findExpr}
	 * labeled alternative in {@link JzzParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFindExpr(JzzParser.FindExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link JzzParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(JzzParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link JzzParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpr(JzzParser.LogicalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objLambda}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjLambda(JzzParser.ObjLambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objAttribute}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjAttribute(JzzParser.ObjAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objArray}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjArray(JzzParser.ObjArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objLiteral}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjLiteral(JzzParser.ObjLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objSafeAttribute}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjSafeAttribute(JzzParser.ObjSafeAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objId}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjId(JzzParser.ObjIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code barExpr}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBarExpr(JzzParser.BarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objBracketCall}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjBracketCall(JzzParser.ObjBracketCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(JzzParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objParenCall}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjParenCall(JzzParser.ObjParenCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JzzParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(JzzParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JzzParser#safeAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafeAttribute(JzzParser.SafeAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiArgs}
	 * labeled alternative in {@link JzzParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiArgs(JzzParser.MultiArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleArg}
	 * labeled alternative in {@link JzzParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleArg(JzzParser.SingleArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link JzzParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(JzzParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hex}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(JzzParser.HexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binary}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(JzzParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(JzzParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(JzzParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JzzParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(JzzParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(JzzParser.FalseContext ctx);
}