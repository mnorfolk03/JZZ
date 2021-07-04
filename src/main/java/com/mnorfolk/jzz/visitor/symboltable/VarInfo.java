package com.mnorfolk.jzz.visitor.symboltable;

/**
 * Represents information about a variable in the symbol table
 *
 * @author Maxwell Norfolk
 */
public class VarInfo {
    private boolean init;
    private DataType type;

    public VarInfo(DataType type) {
        this.type = type;
        init = false;
    }

    public void initialize() {
        init = true;
    }

    public boolean initialized() {
        return init;
    }

    public DataType getType() {
        return type;
    }
}
