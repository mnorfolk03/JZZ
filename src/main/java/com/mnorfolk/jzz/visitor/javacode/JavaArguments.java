package com.mnorfolk.jzz.visitor.javacode;

/**
 * Represents arguments to be passed to a functions
 *
 * @author Maxwell Norfolk
 */
public class JavaArguments implements JavaCode {

    private String string;

    public JavaArguments(JavaArray arr) {
        string = arr.getMiddle();
    }

    public JavaArguments(JavaCode rawStr) {
        string = rawStr.getCode();
    }

    @Override
    public String getCode() {
        return string;
    }
}
