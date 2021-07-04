package com.mnorfolk.jzz.visitor.javacode;

import com.mnorfolk.jzz.visitor.javacode.varassigns.JavaAssignVar;
import com.mnorfolk.jzz.visitor.javacode.varassigns.JavaDeclareVar;
import com.mnorfolk.jzz.visitor.symboltable.SymbolTable;

/**
 * Represents the parameters used for a lambda. Handles how they are created and
 * will take the parameters from the vargs and convert it to variables and cast them
 * according to their types.
 *
 * @author Maxwell Norfolk
 */
public class JavaLambdaParams implements JavaCode {

    public JavaLambdaParams(JavaDeclareVar[] justDeclare, JavaAssignVar[] declareAndAssign) {
        this.justDeclare = justDeclare;
        this.declareAndAssign = declareAndAssign;

        // these variables will be initialized when the function is called, so we will
        // initialize them in the symbol table
        for (JavaDeclareVar var : justDeclare)
            SymbolTable.lookForVar(var.getVarName()).initialize();

        for (JavaAssignVar var : declareAndAssign)
            SymbolTable.lookForVar(var.getVarName()).initialize();
    }

    private JavaDeclareVar[] justDeclare;
    private JavaAssignVar[] declareAndAssign;

    public int minParams() {
        return justDeclare.length;
    }

    public int maxParams() {
        return justDeclare.length + declareAndAssign.length;
    }

    @Override
    public String getCode() {

        // just declare
        StringBuilder builder = new StringBuilder(maxParams() * 20);
        for (int i = 0; i < justDeclare.length; i++) {
            // Left side = (DATA_TYPE) params[i];
            builder.append(justDeclare[i].getCode())
                    .append(" = (")
                    .append(justDeclare[i].getDataType())
                    .append(") params[")
                    .append(i)
                    .append("];\n");
        }
        // declares and assigns
        for (int i = 0; i < declareAndAssign.length; i++) {
            // Left side = (DATA_TYPE) params[i];
            JavaDeclareVar left = (JavaDeclareVar) declareAndAssign[i].getLeft();

            builder.append(left.getCode())
                    .append(" = params.length > ")
                    .append(i)
                    .append(" ? (")
                    .append(left.getDataType())
                    .append(") params[")
                    .append(i)
                    .append("] : ")
                    .append(declareAndAssign[i].getRight().getCode())
                    .append(";\n");
        }

        return builder.toString();
    }
}
