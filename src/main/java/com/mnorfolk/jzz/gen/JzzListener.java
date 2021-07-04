// Generated from C:/Users/KidsComputer/Documents/Intellij Projects/LanguageV2/src/main/resources\Jzz.g4 by ANTLR 4.7.2

package com.mnorfolk.jzz.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JzzParser}.
 */
public interface JzzListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JzzParser#parseFile}.
	 * @param ctx the parse tree
	 */
	void enterParseFile(JzzParser.ParseFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JzzParser#parseFile}.
	 * @param ctx the parse tree
	 */
	void exitParseFile(JzzParser.ParseFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiLambda}
	 * labeled alternative in {@link JzzParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterMultiLambda(JzzParser.MultiLambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiLambda}
	 * labeled alternative in {@link JzzParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitMultiLambda(JzzParser.MultiLambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleLambda}
	 * labeled alternative in {@link JzzParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterSingleLambda(JzzParser.SingleLambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleLambda}
	 * labeled alternative in {@link JzzParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitSingleLambda(JzzParser.SingleLambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JzzParser#lambdaParams}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParams(JzzParser.LambdaParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JzzParser#lambdaParams}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParams(JzzParser.LambdaParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareAndAssignLine}
	 * labeled alternative in {@link JzzParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void enterDeclareAndAssignLine(JzzParser.DeclareAndAssignLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareAndAssignLine}
	 * labeled alternative in {@link JzzParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void exitDeclareAndAssignLine(JzzParser.DeclareAndAssignLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareLine}
	 * labeled alternative in {@link JzzParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void enterDeclareLine(JzzParser.DeclareLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareLine}
	 * labeled alternative in {@link JzzParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void exitDeclareLine(JzzParser.DeclareLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignLine}
	 * labeled alternative in {@link JzzParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void enterAssignLine(JzzParser.AssignLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignLine}
	 * labeled alternative in {@link JzzParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void exitAssignLine(JzzParser.AssignLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignCallableLine}
	 * labeled alternative in {@link JzzParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void enterAssignCallableLine(JzzParser.AssignCallableLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignCallableLine}
	 * labeled alternative in {@link JzzParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void exitAssignCallableLine(JzzParser.AssignCallableLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLine}
	 * labeled alternative in {@link JzzParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void enterExprLine(JzzParser.ExprLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLine}
	 * labeled alternative in {@link JzzParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void exitExprLine(JzzParser.ExprLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link JzzParser#declareVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVar(JzzParser.DeclareVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link JzzParser#declareVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVar(JzzParser.DeclareVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link JzzParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(JzzParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link JzzParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(JzzParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignParen}
	 * labeled alternative in {@link JzzParser#assignCallable}.
	 * @param ctx the parse tree
	 */
	void enterAssignParen(JzzParser.AssignParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignParen}
	 * labeled alternative in {@link JzzParser#assignCallable}.
	 * @param ctx the parse tree
	 */
	void exitAssignParen(JzzParser.AssignParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignBracket}
	 * labeled alternative in {@link JzzParser#assignCallable}.
	 * @param ctx the parse tree
	 */
	void enterAssignBracket(JzzParser.AssignBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignBracket}
	 * labeled alternative in {@link JzzParser#assignCallable}.
	 * @param ctx the parse tree
	 */
	void exitAssignBracket(JzzParser.AssignBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link JzzParser#declareAndAssign}.
	 * @param ctx the parse tree
	 */
	void enterDeclareAndAssign(JzzParser.DeclareAndAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JzzParser#declareAndAssign}.
	 * @param ctx the parse tree
	 */
	void exitDeclareAndAssign(JzzParser.DeclareAndAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JzzParser#parenParams}.
	 * @param ctx the parse tree
	 */
	void enterParenParams(JzzParser.ParenParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JzzParser#parenParams}.
	 * @param ctx the parse tree
	 */
	void exitParenParams(JzzParser.ParenParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JzzParser#bracketParams}.
	 * @param ctx the parse tree
	 */
	void enterBracketParams(JzzParser.BracketParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JzzParser#bracketParams}.
	 * @param ctx the parse tree
	 */
	void exitBracketParams(JzzParser.BracketParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preNegate}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void enterPreNegate(JzzParser.PreNegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preNegate}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void exitPreNegate(JzzParser.PreNegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preDecrement}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrement(JzzParser.PreDecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preDecrement}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrement(JzzParser.PreDecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiDivOp}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiDivOp(JzzParser.MultiDivOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiDivOp}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiDivOp(JzzParser.MultiDivOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpr(JzzParser.ObjectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpr(JzzParser.ObjectExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preNot}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void enterPreNot(JzzParser.PreNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preNot}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void exitPreNot(JzzParser.PreNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powOp}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void enterPowOp(JzzParser.PowOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powOp}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void exitPowOp(JzzParser.PowOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preAmpersand}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void enterPreAmpersand(JzzParser.PreAmpersandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preAmpersand}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void exitPreAmpersand(JzzParser.PreAmpersandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preStar}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void enterPreStar(JzzParser.PreStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preStar}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void exitPreStar(JzzParser.PreStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preIncrement}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrement(JzzParser.PreIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preIncrement}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrement(JzzParser.PreIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinusOp}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusOp(JzzParser.PlusMinusOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinusOp}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusOp(JzzParser.PlusMinusOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftOp}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(JzzParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftOp}
	 * labeled alternative in {@link JzzParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(JzzParser.ShiftOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiCompExpr}
	 * labeled alternative in {@link JzzParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiCompExpr(JzzParser.MultiCompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiCompExpr}
	 * labeled alternative in {@link JzzParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiCompExpr(JzzParser.MultiCompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code findExpr}
	 * labeled alternative in {@link JzzParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFindExpr(JzzParser.FindExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code findExpr}
	 * labeled alternative in {@link JzzParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFindExpr(JzzParser.FindExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link JzzParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(JzzParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link JzzParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(JzzParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link JzzParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(JzzParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link JzzParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(JzzParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objLambda}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjLambda(JzzParser.ObjLambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objLambda}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjLambda(JzzParser.ObjLambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objAttribute}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjAttribute(JzzParser.ObjAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objAttribute}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjAttribute(JzzParser.ObjAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objArray}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjArray(JzzParser.ObjArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objArray}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjArray(JzzParser.ObjArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objLiteral}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjLiteral(JzzParser.ObjLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objLiteral}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjLiteral(JzzParser.ObjLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objSafeAttribute}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjSafeAttribute(JzzParser.ObjSafeAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objSafeAttribute}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjSafeAttribute(JzzParser.ObjSafeAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objId}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjId(JzzParser.ObjIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objId}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjId(JzzParser.ObjIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code barExpr}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void enterBarExpr(JzzParser.BarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code barExpr}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void exitBarExpr(JzzParser.BarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objBracketCall}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjBracketCall(JzzParser.ObjBracketCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objBracketCall}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjBracketCall(JzzParser.ObjBracketCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(JzzParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(JzzParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objParenCall}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjParenCall(JzzParser.ObjParenCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objParenCall}
	 * labeled alternative in {@link JzzParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjParenCall(JzzParser.ObjParenCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JzzParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(JzzParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JzzParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(JzzParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JzzParser#safeAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSafeAttribute(JzzParser.SafeAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JzzParser#safeAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSafeAttribute(JzzParser.SafeAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiArgs}
	 * labeled alternative in {@link JzzParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterMultiArgs(JzzParser.MultiArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiArgs}
	 * labeled alternative in {@link JzzParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitMultiArgs(JzzParser.MultiArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleArg}
	 * labeled alternative in {@link JzzParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterSingleArg(JzzParser.SingleArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleArg}
	 * labeled alternative in {@link JzzParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitSingleArg(JzzParser.SingleArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JzzParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JzzParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JzzParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JzzParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hex}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterHex(JzzParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hex}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitHex(JzzParser.HexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binary}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBinary(JzzParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binary}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBinary(JzzParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFloat(JzzParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFloat(JzzParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterInt(JzzParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitInt(JzzParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterString(JzzParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitString(JzzParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterTrue(JzzParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitTrue(JzzParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFalse(JzzParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link JzzParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFalse(JzzParser.FalseContext ctx);
}