package com.mnorfolk.jzz.compiled.classes;

import com.mnorfolk.jzz.compiled.ClassLiteral;
import com.mnorfolk.jzz.compiled.Value;
import com.mnorfolk.jzz.ex.InvalidFieldException;

/**
 * Represents any object. This is simply a pointer or wrapper for a value. This is
 * useful if we don't know what type a variable will be until runtime.
 *
 * @author Maxwell Norfolk
 */
public class $Object implements Value {

    private Value data;

    @Override
    public void assign(Value newVal) throws ClassCastException {
        data = newVal;
    }

    @Override
    public ClassLiteral getType() {
        return data.getType();
    }

    @Override
    public Value getAttribute(String name) throws InvalidFieldException {
        return data.getAttribute(name);
    }

    @Override
    public Value copy() {
        return data.copy();
    }
}
