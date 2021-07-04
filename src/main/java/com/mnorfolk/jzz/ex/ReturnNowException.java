package com.mnorfolk.jzz.ex;

import com.mnorfolk.jzz.compiled.Value;

/**
 * This class is used to represent a return in a function. The reason it exists is so
 * we can create a return function that will return any function. This exception
 * should ALWAYS be caught if not it may cause some issues.
 *
 * @author Maxwell Norfolk
 */
public class ReturnNowException extends RuntimeException {

    private Value retValue;

    /**
     * Creates a new return exception that returns the given value
     */
    public ReturnNowException(Value retValue) {
        this.retValue = retValue;
    }

    /**
     * Returns the return value associated with the function
     */
    public Value get() {
        return retValue;
    }
}
