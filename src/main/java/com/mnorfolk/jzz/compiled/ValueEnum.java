package com.mnorfolk.jzz.compiled;

/**
 * Represents a value enum
 *
 * @author Maxwell Norfolk
 */
public interface ValueEnum extends Value {

    @Override
    default ValueEnum copy() {
        return this;
    }
}
