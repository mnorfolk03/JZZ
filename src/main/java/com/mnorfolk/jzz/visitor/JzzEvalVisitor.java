package com.mnorfolk.jzz.visitor;

import com.mnorfolk.jzz.compiled.func.Operator;
import com.mnorfolk.jzz.ex.SyntaxException;
import com.mnorfolk.jzz.ex.VariableNotDeclared;
import com.mnorfolk.jzz.gen.JzzBaseVisitor;
import com.mnorfolk.jzz.gen.JzzParser;
import com.mnorfolk.jzz.visitor.javacode.*;
import com.mnorfolk.jzz.visitor.javacode.varassigns.JavaAssignVar;
import com.mnorfolk.jzz.visitor.javacode.varassigns.JavaDeclareVar;
import com.mnorfolk.jzz.visitor.javacode.varassigns.JavaDefineVar;
import com.mnorfolk.jzz.visitor.javacode.varassigns.JavaVarInfo;
import com.mnorfolk.jzz.visitor.symboltable.DataType;
import com.mnorfolk.jzz.visitor.symboltable.SymbolTable;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * The eval visitor will take the given parse tree and read through it and create
 * JavaCode objects that will then be used later in the compilation process to
 * generate the actual .java files that will be used.
 *
 * @author Maxwell Norfolk
 */
public class JzzEvalVisitor extends JzzBaseVisitor<JavaCode> {

    /**
     * Visits each parse tree by calling visit(), and returns an array filled with java
     * code associated with parse tree object.
     */
    private JavaCode[] visitEach(List<? extends ParseTree> list) {
        JavaCode[] code = new JavaCode[list.size()];

        for (int i = 0; i < list.size(); i++)
            code[i] = visit(list.get(i));
        return code;
    }

    ///////////////////////////////////////////////////////////////////////////
    // literal
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public JavaCode visitHex(JzzParser.HexContext ctx) {
        return JavaLiteral.getInt(ctx.getText());
    }

    @Override
    public JavaCode visitBinary(JzzParser.BinaryContext ctx) {
        return JavaLiteral.getInt(ctx.getText());
    }

    @Override
    public JavaCode visitFloat(JzzParser.FloatContext ctx) {
        return new JavaLiteral("new Float(" + ctx.getText() + ")");
    }

    @Override
    public JavaCode visitInt(JzzParser.IntContext ctx) {
        char[] values = ctx.getText().toCharArray();
        int offset = 0;
        // the language allows numbers with leading 0's. Java defaults to thinking
        // this is an octal, so we must kill those leading zeros. The -1 in the length
        // is because if the string is just a 0, we want to keep that.
        for (; offset < values.length - 1; offset++)
            if (values[offset] != '0')
                break;

        String lit = new String(values, offset, values.length - offset);
        return JavaLiteral.getInt(lit);
    }

    @Override
    public JavaCode visitString(JzzParser.StringContext ctx) {
        char[] originalText = ctx.getText().toCharArray();
        StringBuilder updated = new StringBuilder(originalText.length);


        updated.append('"');

        char strPrefix = originalText[0];

        // parse the string, and fix it up as necessary
        for (int i = 1; i < originalText.length - 1; i++) {
            char c = originalText[i];
            if (c == '\\') { // if \ then we need one of the following:
                char next = originalText[i + 1];
                if (next == strPrefix) {
                    updated.append(strPrefix);
                    i++;
                } else {
                    updated.append('\\');
                }
            } else if (c == '\n') {
                updated.append("\\n");
            } else if (c == '\r') {
                updated.append("\\r");
            } else {
                updated.append(c);
            }
        }
        return new JavaLiteral("new $String(" + updated.append('"') + ")");
    }

    @Override
    public JavaCode visitTrue(JzzParser.TrueContext ctx) {
        return new JavaBool(true);
    }

    @Override
    public JavaCode visitFalse(JzzParser.FalseContext ctx) {
        return new JavaBool(false);
    }

    ///////////////////////////////////////////////////////////////////////////
    // expr
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public JavaCode visitObjectExpr(JzzParser.ObjectExprContext ctx) {
        return visit(ctx.object());
    }

    @Override
    public JavaCode visitPreIncrement(JzzParser.PreIncrementContext ctx) {
        return new JavaOperator(Operator.INCREMENT, visit(ctx.subExpr()));
    }

    @Override
    public JavaCode visitPreDecrement(JzzParser.PreDecrementContext ctx) {
        return new JavaOperator(Operator.DECREMENT, visit(ctx.subExpr()));
    }

    @Override
    public JavaCode visitPreNot(JzzParser.PreNotContext ctx) {
        return new JavaOperator(Operator.NOT, visit(ctx.subExpr()));
    }

    @Override
    public JavaCode visitPreAmpersand(JzzParser.PreAmpersandContext ctx) {
        return new JavaOperator(Operator.AMPERSAND, visit(ctx.subExpr()));
    }

    @Override
    public JavaCode visitPreStar(JzzParser.PreStarContext ctx) {
        return new JavaOperator(Operator.MULTI, visit(ctx.subExpr()));
    }

    @Override
    public JavaCode visitPreNegate(JzzParser.PreNegateContext ctx) {
        return new JavaOperator(Operator.MINUS, visit(ctx.subExpr()));
    }

    @Override
    public JavaCode visitPowOp(JzzParser.PowOpContext ctx) {
        return new JavaOperator(Operator.POW, visitEach(ctx.subExpr()));
    }

    @Override
    public JavaCode visitMultiDivOp(JzzParser.MultiDivOpContext ctx) {
        Operator op;
        // figure out the operator used
        switch (ctx.op.getType()) {
            case JzzParser.MULTI:
                op = Operator.MULTI;
                break;
            case JzzParser.DIV:
                op = Operator.DIV;
                break;
            case JzzParser.FLOOR_DIV:
                op = Operator.FLOOR_DIV;
                break;
            case JzzParser.MOD:
                op = Operator.MOD;
                break;
            case JzzParser.DIV_MOD:
                op = Operator.DIV_MOD;
                break;
            default:
                throw new IllegalArgumentException(
                        "The following could not be parsed: '" + ctx.getText()
                                + "'. (Line " + ctx.getStart().getLine() + ")");
        }

        return new JavaOperator(op, visitEach(ctx.subExpr()));
    }

    @Override
    public JavaCode visitPlusMinusOp(JzzParser.PlusMinusOpContext ctx) {
        Operator op;
        // figure out the operator used
        switch (ctx.op.getType()) {
            case JzzParser.PLUS:
                op = Operator.PLUS;
                break;
            case JzzParser.MINUS:
                op = Operator.MINUS;
                break;
            default:
                throw new IllegalArgumentException("The following could not be parsed: '"
                        + ctx.getText() + "'. (Line " + ctx.getStart().getLine() + ")");
        }

        return new JavaOperator(op, visitEach(ctx.subExpr()));
    }

    @Override
    public JavaCode visitShiftOp(JzzParser.ShiftOpContext ctx) {
        Operator op;
        // figure out the operator used
        switch (ctx.op.getType()) {
            case JzzParser.SHIFT_L:
                op = Operator.SHIFT_L;
                break;
            case JzzParser.SHIFT_R:
                op = Operator.SHIFT_R;
                break;
            default:
                throw new IllegalArgumentException("The following could not be parsed: '"
                        + ctx.getText() + "'. (Line " + ctx.getStart().getLine() + ")");
        }

        return new JavaOperator(op, visitEach(ctx.subExpr()));
    }

    @Override
    public JavaCode visitFindExpr(JzzParser.FindExprContext ctx) {
        return visit(ctx.subExpr());
    }

    @Override
    public JavaCode visitMultiCompExpr(JzzParser.MultiCompExprContext ctx) {
        List<ParseTree> opNodes = ctx.children;
        Operator[] ops = new Operator[(opNodes.size() - 1) / 2];
        int i = 0;
        for (ParseTree tree : opNodes) {
            // the non-terminals are the operators, so for each figure out what it is
            if (tree instanceof TerminalNode) {
                switch (((TerminalNode) tree).getSymbol().getType()) {
                    case JzzParser.EQ:
                        ops[i++] = Operator.EQ;
                        break;
                    case JzzParser.LT:
                        ops[i++] = Operator.LT;
                        break;
                    case JzzParser.LTEQ:
                        ops[i++] = Operator.LTEQ;
                        break;
                    case JzzParser.GT:
                        ops[i++] = Operator.GT;
                        break;
                    case JzzParser.GTEQ:
                        ops[i++] = Operator.GTEQ;
                        break;
                }
            }
        }
        return new JavaCombinedConditional(ops, visitEach(ctx.subExpr()));
    }

    @Override
    public JavaCode visitCompExpr(JzzParser.CompExprContext ctx) {
        Operator op;
        // figure out the operator used
        switch (ctx.op.getType()) {
            case JzzParser.NEQ:
                op = Operator.NEQ;
                break;
            case JzzParser.INT_COMPARE:
                op = Operator.INT_COMPARE;
                break;
            default:
                throw new IllegalArgumentException("The following could not be parsed: '"
                        + ctx.getText() + "'. (Line " + ctx.getStart().getLine() + ")");
        }

        return new JavaOperator(op, visitEach(ctx.subExpr()));
    }

    @Override
    public JavaCode visitLogicalExpr(JzzParser.LogicalExprContext ctx) {
        Operator op;
        // figure out the operator used
        switch (ctx.op.getType()) {
            case JzzParser.AND:
                op = Operator.AND;
                break;
            case JzzParser.OR:
                op = Operator.OR;
                break;
            case JzzParser.XOR:
                op = Operator.XOR;
                break;
            default:
                throw new IllegalArgumentException("The following could not be parsed: '"
                        + ctx.getText() + "'. (Line " + ctx.getStart().getLine() + ")");
        }

        return new JavaOperator(op, visitEach(ctx.expression()));
    }

    ///////////////////////////////////////////////////////////////////////////
    // array
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public JavaArray visitArray(JzzParser.ArrayContext ctx) {
        return new JavaArray(visitEach(ctx.expression()));
    }


    ///////////////////////////////////////////////////////////////////////////
    // object
    ///////////////////////////////////////////////////////////////////////////


    @Override
    public JavaCode visitObjId(JzzParser.ObjIdContext ctx) {
        JavaCode code = JavaLiteral.identifier(ctx.ID());
        try {
            if (!SymbolTable.lookForVar(code.getCode()).initialized())
                throw new VariableNotDeclared("Variable '"
                        + ctx.getText() + "' is not yet initialized! (Line "
                        + ctx.getStart().getLine() + ").");
        } catch (NullPointerException npe) {
            throw new VariableNotDeclared("Variable '"
                    + ctx.getText() + "' could not be found. (Line "
                    + ctx.getStart().getLine() + ").", npe);
        }
        return code;
    }

    @Override
    public JavaCode visitObjLiteral(JzzParser.ObjLiteralContext ctx) {
        return visit(ctx.literal());
    }

    @Override
    public JavaCode visitObjLambda(JzzParser.ObjLambdaContext ctx) {
        return visit(ctx.lambda());
    }

    @Override
    public JavaCode visitObjArray(JzzParser.ObjArrayContext ctx) {
        return JavaLiteral.getSurroundParen(visit(ctx.array()));
    }

    @Override
    public JavaCode visitParenExpr(JzzParser.ParenExprContext ctx) {
        return JavaLiteral.getSurroundParen(visit(ctx.expression()));
    }

    @Override
    public JavaCode visitBarExpr(JzzParser.BarExprContext ctx) {
        return new JavaOperator(Operator.BAR, visit(ctx.expression()));
    }

    @Override
    public JavaCode visitObjParenCall(JzzParser.ObjParenCallContext ctx) {
        return new JavaLiteral("((ParenCallable)" + visit(ctx.object()).getCode() + ")."
                + visit(ctx.parenParams()).getCode());
    }

    @Override
    public JavaCode visitObjBracketCall(JzzParser.ObjBracketCallContext ctx) {
        return new JavaLiteral("((BracketCallable)" + visit(ctx.object()).getCode() + ")."
                + visit(ctx.bracketParams()).getCode());
    }

    ///////////////////////////////////////////////////////////////////////////
    // codeLine
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public JavaCode visitDeclareAndAssignLine(JzzParser.DeclareAndAssignLineContext ctx) {
        return JavaLiteral.addSemicolon(visit(ctx.declareAndAssign()), ctx.getStart().getLine());
    }

    @Override
    public JavaCode visitDeclareLine(JzzParser.DeclareLineContext ctx) {
        return JavaLiteral.addSemicolon(visit(ctx.declareVar()), ctx.getStart().getLine());
    }

    @Override
    public JavaCode visitAssignLine(JzzParser.AssignLineContext ctx) {
        return JavaLiteral.addSemicolon(visit(ctx.assignVar()), ctx.getStart().getLine());
    }

    @Override
    public JavaCode visitAssignCallableLine(JzzParser.AssignCallableLineContext ctx) {
        return JavaLiteral.addSemicolon(visit(ctx.assignCallable()), ctx.getStart().getLine());
    }

    private static int tempCount = 0;

    @Override
    public JavaCode visitExprLine(JzzParser.ExprLineContext ctx) {
        JavaCode expr = visit(ctx.expression());

        // ternary op ? : in java cannot be a statement, so we just let $temp# with # as
        // a number equal to the result. technically it should not do anything.
        if (expr instanceof JavaCombinedConditional)
            expr = new JavaLiteral("Value $temp" + tempCount + " = " + expr.getCode());
        return JavaLiteral.addSemicolon(expr, ctx.getStart().getLine());
    }

    ///////////////////////////////////////////////////////////////////////////
    // assign and declare
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public JavaDeclareVar visitDeclareVar(JzzParser.DeclareVarContext ctx) {
        return new JavaDeclareVar(
                JavaLiteral.identifier(ctx.ID(0)).getCode(),
                JavaLiteral.identifier(ctx.ID(1)).getCode()
        );
    }

    @Override
    public JavaAssignVar visitAssignVar(JzzParser.AssignVarContext ctx) {
        return new JavaAssignVar(new JavaDefineVar(
                JavaLiteral.identifier(
                        ctx.ID()).getCode()),
                visit(ctx.expression()));
    }

    @Override
    public JavaAssignVar visitDeclareAndAssign(JzzParser.DeclareAndAssignContext ctx) {
        return new JavaAssignVar((JavaVarInfo) visit(ctx.declareVar()), visit(ctx.expression()));
    }

    ///////////////////////////////////////////////////////////////////////////
    // Lambda
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public JavaCode visitMultiLambda(JzzParser.MultiLambdaContext ctx) {
        SymbolTable.enterNew();
        JavaLambda ret = new JavaLambda(
                visitLambdaParams(ctx.lambdaParams()),
                visitEach(ctx.codeLine())
        );
        SymbolTable.leave();
        return ret;
    }

    @Override
    public JavaCode visitSingleLambda(JzzParser.SingleLambdaContext ctx) {
        SymbolTable.enterNew();
        JavaBracketLambda ret = new JavaBracketLambda(
                visitLambdaParams(ctx.lambdaParams()),
                visit(ctx.expression())
        );
        SymbolTable.leave();
        return ret;
    }

    @Override
    public JavaLambdaParams visitLambdaParams(JzzParser.LambdaParamsContext ctx) {

        // if null, then the optional was not found
        if (ctx == null)
            return new JavaLambdaParams(new JavaDeclareVar[0], new JavaAssignVar[0]);

        // try to get just declares
        List<JzzParser.DeclareVarContext> list1 = ctx.declareVar();
        JavaDeclareVar[] declares = new JavaDeclareVar[list1 != null
                ? list1.size()
                : 0];

        for (int i = 0; i < declares.length; i++) {
            declares[i] = visitDeclareVar(list1.get(i));
        }

        // try to get just declares
        List<JzzParser.DeclareAndAssignContext> list2 = ctx.declareAndAssign();
        JavaAssignVar[] assigns = new JavaAssignVar[list2 != null
                ? list2.size()
                : 0];

        for (int i = 0; i < assigns.length; i++) {
            assigns[i] = visitDeclareAndAssign(list2.get(i));
        }
        return new JavaLambdaParams(declares, assigns);
    }

    @Override
    public JavaLambda visitParseFile(JzzParser.ParseFileContext ctx) {
        return (JavaLambda) visit(ctx.lambda());
    }

    ///////////////////////////////////////////////////////////////////////////
    // Arguments
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public JavaCode visitMultiArgs(JzzParser.MultiArgsContext ctx) {
        return new JavaArguments(visitArray(ctx.array()));
    }

    @Override
    public JavaCode visitSingleArg(JzzParser.SingleArgContext ctx) {
        return new JavaArguments(visit(ctx.expression()));
    }

    @Override
    public JavaCode visitParenParams(JzzParser.ParenParamsContext ctx) {
        JzzParser.ArgumentsContext args = ctx.arguments();
        return new JavaLiteral("callParen(" + (args != null ? visit(args).getCode() : "") + ")");
    }

    @Override
    public JavaCode visitBracketParams(JzzParser.BracketParamsContext ctx) {
        JzzParser.ArgumentsContext args = ctx.arguments();
        return new JavaLiteral("callBracket(" + (args != null ? visit(args).getCode() : "") + ")");
    }

    ///////////////////////////////////////////////////////////////////////////
    // Assign Callable and Brackets
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public JavaCode visitAssignBracket(JzzParser.AssignBracketContext ctx) {
        JzzParser.ArgumentsContext args = ctx.arguments();
        return new JavaLiteral("((BracketSet) " + visit(ctx.object()).getCode()
                + ").setBracket(" + visit(ctx.expression()).getCode()
                + (args == null ? "" : ", " + visit(args).getCode()) + ")");
    }

    @Override
    public JavaCode visitAssignParen(JzzParser.AssignParenContext ctx) {
        JzzParser.ArgumentsContext args = ctx.arguments();
        return new JavaLiteral("((ParenSet) " + visit(ctx.object()).getCode()
                + ").setParen(" + visit(ctx.expression()).getCode()
                + (args == null ? "" : ", " + visit(args).getCode()) + ")");
    }

    ///////////////////////////////////////////////////////////////////////////
    // Represents accessing an attribute
    ///////////////////////////////////////////////////////////////////////////


    @Override
    public JavaCode visitObjAttribute(JzzParser.ObjAttributeContext ctx) {
        return new JavaLiteral("(" + visit(ctx.object()).getCode() + ")"
                + visit(ctx.attribute()).getCode());
    }

    @Override
    public JavaCode visitAttribute(JzzParser.AttributeContext ctx) {
        return new JavaLiteral(".getAttribute(\"" + JavaLiteral.identifier(ctx.ID()).getCode()
                + "\")" + (ctx.attribute() != null ? visit(ctx.attribute()).getCode() : ""));
    }

    @Override
    public JavaCode visitObjSafeAttribute(JzzParser.ObjSafeAttributeContext ctx) {
        String id = JavaLiteral.identifier(ctx.ID()).getCode();
        DataType parent = SymbolTable.lookForVar(id).getType();
        String att = visitSafeAttribute(parent, ctx.safeAttribute()).getCode();
        return new JavaLiteral(id + att);
    }

    public JavaCode visitSafeAttribute(DataType parentType, JzzParser.SafeAttributeContext ctx) {
        String attName = JavaLiteral.identifier(ctx.ID()).getCode();
        DataType childType = parentType.getField(attName);

        if (childType == null) {
            throw new SyntaxException("Attribute named: '" + attName +
                    "' cannot be found for type: '" + parentType.getName() + "'.");
        }
        String postAtt = "";
        if (ctx.safeAttribute() != null)
            postAtt = visitSafeAttribute(childType, ctx.safeAttribute()).getCode();
        return new JavaLiteral("." + attName + postAtt);
    }

    @Override
    public JavaCode visitSafeAttribute(JzzParser.SafeAttributeContext ctx) {
        throw new IllegalStateException("This should never be called, instead use the" +
                " version that takes the parent's DataType.");
    }
}
