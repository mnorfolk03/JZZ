package com.mnorfolk.jzz.compiled.func.postop;

import com.mnorfolk.jzz.compiled.Value;

/**
 * Represent a Value that is callable on brackets
 *
 * @author Maxwell Norfolk
 */
public interface BracketCallable extends Value {

    public Value callBracket(Value... params);
}
