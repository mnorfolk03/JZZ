package com.mnorfolk.jzz.ex;

import com.mnorfolk.jzz.compiled.Value;

/**
 * Represents an alert. Similar to a return, however instead of just stopping at the
 * end of the function, the alert can go through multiple functions. This is useful if the
 * user would want to return from an if statement for example
 *
 * @author Maxwell Norfolk
 */
public class AlertReturnException extends RuntimeException {

    private Value value;

    public AlertReturnException(Value value) {
        this.value = value;
    }

    public Value get() {
        return value;
    }
}
