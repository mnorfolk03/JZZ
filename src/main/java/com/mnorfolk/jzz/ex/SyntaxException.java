package com.mnorfolk.jzz.ex;

/**
 * A syntax exception that occurs while parsing a file
 *
 * @author Maxwell Norfolk
 */
public class SyntaxException extends IllegalArgumentException {
    public SyntaxException() {
    }

    public SyntaxException(String s) {
        super(s);
    }

    public SyntaxException(String message, Throwable cause) {
        super(message, cause);
    }

    public SyntaxException(Throwable cause) {
        super(cause);
    }
}
