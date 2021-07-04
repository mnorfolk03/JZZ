package com.mnorfolk.jzz.visitor.javacode.varassigns;

/**
 * Represents the left side of an assignVar rule
 *
 * @author Maxwell Norfolk
 */
public class JavaDefineVar implements JavaVarInfo {

    private String varName;

    public JavaDefineVar(String varName) {
        this.varName = varName;
    }

    @Override
    public String getVarName() {
        return varName;
    }

    @Override
    public String getCode() {
        return varName;
    }
}
