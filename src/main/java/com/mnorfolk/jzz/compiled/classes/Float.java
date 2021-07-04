package com.mnorfolk.jzz.compiled.classes;

import com.mnorfolk.jzz.compiled.ClassLiteral;
import com.mnorfolk.jzz.compiled.Value;

/**
 * Represents a floating point number
 *
 * @author Maxwell Norfolk
 */
public class Float extends Number {

    private double value;

    public Float(double value) {
        this.value = value;
    }

    @Override
    public int getInt() {
        return (int) value;
    }

    @Override
    public double getFloat() {
        return value;
    }

    @Override
    public void assign(Value newVal) throws ClassCastException {
        this.value = ((Number) newVal).getFloat();
    }

    @Override
    public ClassLiteral getType() {
        return ClassLiteral.Float;
    }

    @Override
    public Value copy() {
        return new Float(value);
    }

    @Override
    public String toString() {
        return ""+value;
    }
}
