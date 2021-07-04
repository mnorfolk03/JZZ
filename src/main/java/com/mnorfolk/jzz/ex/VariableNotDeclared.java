package com.mnorfolk.jzz.ex;

/**
 * Represents a variable not declared but accessed.
 *
 * @author Maxwell Norfolk
 */
public class VariableNotDeclared extends RuntimeException {

    public VariableNotDeclared() {
    }

    public VariableNotDeclared(String message) {
        super(message);
    }

    public VariableNotDeclared(String message, Throwable cause) {
        super(message, cause);
    }

    public VariableNotDeclared(Throwable cause) {
        super(cause);
    }
}
