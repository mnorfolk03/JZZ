package com.mnorfolk.jzz.compiled.classes;

import com.mnorfolk.jzz.compiled.ClassLiteral;
import com.mnorfolk.jzz.compiled.Value;

/**
 * Represents an integer
 *
 * @author Maxwell Norfolk
 */
public class Int extends Number {

    private int value;

    public Int(int i) {
        this.value = i;
    }

    @Override
    public int getInt() {
        return value;
    }

    @Override
    public double getFloat() {
        return value;
    }

    @Override
    public void assign(Value newVal) {
        value = ((Number) newVal).getInt();
    }

    @Override
    public Int copy() {
        return new Int(value);
    }

    @Override
    public ClassLiteral getType() {
        return ClassLiteral.Int;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
