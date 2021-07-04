package com.mnorfolk.jzz.ex;

/**
 * Represents an incorrect number of parameters passed
 *
 * @author Maxwell Norfolk
 */
public class InvalidParamCountException extends IllegalArgumentException {
    public InvalidParamCountException() {
    }

    public InvalidParamCountException(String s) {
        super(s);
    }

    public InvalidParamCountException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidParamCountException(Throwable cause) {
        super(cause);
    }
}
