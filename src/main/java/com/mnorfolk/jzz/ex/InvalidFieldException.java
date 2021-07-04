package com.mnorfolk.jzz.ex;

/**
 * Represents an attempt of a field being accessed, but it cannot be found.
 *
 * @author Maxwell Norfolk
 */
public class InvalidFieldException extends RuntimeException {

    public InvalidFieldException() {
    }

    public InvalidFieldException(String message) {
        super(message);
    }

    public InvalidFieldException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidFieldException(Throwable cause) {
        super(cause);
    }
}
