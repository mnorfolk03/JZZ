package com.mnorfolk.jzz.compiled.func.postop;

import com.mnorfolk.jzz.compiled.Value;

/**
 * Represents a Value that is callable using param.
 *
 * @author Maxwell Norfolk
 */
public interface ParenCallable extends Value {

    public Value callParen(Value... params);
}
