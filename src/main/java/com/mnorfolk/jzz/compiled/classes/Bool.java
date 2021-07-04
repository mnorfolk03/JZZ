package com.mnorfolk.jzz.compiled.classes;

import com.mnorfolk.jzz.compiled.ClassLiteral;
import com.mnorfolk.jzz.compiled.Value;
import com.mnorfolk.jzz.compiled.ValueEnum;

import java.util.Objects;

/**
 * @author Maxwell Norfolk
 */
public class Bool implements ValueEnum {
    public static final Bool TRUE = new Bool(true) {
        @Override
        public void assign(Value newVal) {
            throw new IllegalArgumentException("Enum Constant cannot be set!");
        }
    };
    public static final Bool FALSE = new Bool(false) {
        @Override
        public void assign(Value newVal) {
            throw new IllegalArgumentException("Enum Constant cannot be set!");
        }
    };

    private boolean bool;

    public Bool(boolean bool) {
        this.bool = bool;
    }

    public boolean get() {
        return bool;
    }

    @Override
    public void assign(Value newVal) throws ClassCastException {
        this.bool = ((Bool) newVal).bool;
    }

    @Override
    public ClassLiteral getType() {
        return ClassLiteral.Bool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Bool other = (Bool) o;
        return bool == other.bool;
    }

    @Override
    public String toString() {
        return bool ? "TRUE" : "FALSE";
    }

    @Override
    public int hashCode() {
        return Objects.hash(bool);
    }
}
