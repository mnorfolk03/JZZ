package com.mnorfolk.jzz.visitor.javacode.varassigns;

import com.mnorfolk.jzz.visitor.symboltable.SymbolTable;

/**
 * Represents a variable being declared.
 *
 * @author Maxwell Norfolk
 */
public class JavaDeclareVar implements JavaVarInfo {

    private String varName;
    private String dataType;

    public JavaDeclareVar(String dataType, String varName) {
        this.dataType = dataType;
        this.varName = varName;

        SymbolTable.put(varName, dataType);
    }

    public String getDataType() {
        return dataType;
    }

    @Override
    public String getVarName() {
        return varName;
    }

    @Override
    public String getCode() {
        return dataType + " " + varName;
    }
}
