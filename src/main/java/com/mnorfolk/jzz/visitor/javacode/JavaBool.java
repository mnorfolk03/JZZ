package com.mnorfolk.jzz.visitor.javacode;

/**
 * Represents a boolean. The reason this exists is simply because when using
 * the Bool.TRUE you would not be able to assign it.
 *
 * @author Maxwell Norfolk
 */
public class JavaBool implements JavaCode {

    private boolean bool;

    public JavaBool(boolean bool) {
        this.bool = bool;
    }

    @Override
    public String getCode() {
        return "new Bool(" + bool + ")";
    }
}
