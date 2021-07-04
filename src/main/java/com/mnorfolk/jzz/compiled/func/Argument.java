package com.mnorfolk.jzz.compiled.func;

import com.mnorfolk.jzz.compiled.ClassLiteral;

import java.util.Arrays;

/**
 * Represents the arguments for a function
 *
 * @author Maxwell Norfolk
 */
public class Argument {

    private final ClassLiteral[] values;

    public Argument(ClassLiteral[] values) {
        this.values = values;
    }

    public ClassLiteral[] get() {
        return values;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(values);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Argument argument = (Argument) o;
        return Arrays.equals(values, argument.values);
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }
}
