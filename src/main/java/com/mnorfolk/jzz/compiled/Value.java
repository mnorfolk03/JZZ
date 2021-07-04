package com.mnorfolk.jzz.compiled;

import com.mnorfolk.jzz.ex.InvalidFieldException;

import java.lang.reflect.Field;

/**
 * Represents a value in the programming language
 *
 * @author Maxwell Norfolk
 */
public interface Value {

    public static final Value VOID = new Value() {
        @Override
        public Value copy() {
            return this;
        }

        @Override
        public void assign(Value newVal) throws ClassCastException {
            throw new IllegalArgumentException("VOID cannot be set!");
        }

        @Override
        public ClassLiteral getType() {
            return ClassLiteral.VOID;
        }
    };

    void assign(Value newVal) throws ClassCastException;

    ClassLiteral getType();

    // Value attribute(String str);

    Value copy();

    /**
     * Returns the attribute with the given name, or throws an exception if it
     * is not a valid attribute
     */
    default Value getAttribute(String name) throws InvalidFieldException {
        try {
            Field f = this.getClass().getField(name);
            return (Value) f.get(this);
        } catch (NoSuchFieldException | IllegalAccessException | ClassCastException e) {
            throw new InvalidFieldException("Cannot access field: '" + name + "'.", e);
        }
    }
}
