package com.mnorfolk.jzz.visitor.javacode.varassigns;

import com.mnorfolk.jzz.ex.VariableNotDeclared;
import com.mnorfolk.jzz.visitor.javacode.JavaCode;
import com.mnorfolk.jzz.visitor.symboltable.SymbolTable;
import com.mnorfolk.jzz.visitor.symboltable.VarInfo;

/**
 * Represents a variable being assigned.
 *
 * @author Maxwell Norfolk
 */
public class JavaAssignVar implements JavaCode {

    private JavaVarInfo left;
    private JavaCode right;

    public JavaAssignVar(JavaVarInfo left, JavaCode right) {
        this.left = left;
        this.right = right;
    }

    public JavaCode getLeft() {
        return left;
    }

    public JavaCode getRight() {
        return right;
    }

    public String getVarName() {
        return left.getVarName();
    }

    @Override
    public String getCode() {
        VarInfo info = SymbolTable.lookForVar(getVarName());

        if (left instanceof JavaDefineVar) {
            if (info.initialized()) {
                return left.getCode() + ".assign(" + right.getCode() + ")";
            }
        }
        if (!SymbolTable.atThisLevel(getVarName()))
            throw new VariableNotDeclared("The variable '" + getVarName() + "' could" +
                    " not be set inside this subroutine!");
        info.initialize();
        return left.getCode() + " = (" + info.getType().getName() + ")" + right.getCode();
    }
}
