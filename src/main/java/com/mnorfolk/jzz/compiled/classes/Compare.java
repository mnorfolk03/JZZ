package com.mnorfolk.jzz.compiled.classes;

import com.mnorfolk.jzz.compiled.ClassLiteral;
import com.mnorfolk.jzz.compiled.Value;
import com.mnorfolk.jzz.compiled.ValueEnum;

import java.util.Objects;

/**
 * @author Maxwell Norfolk
 */
public class Compare implements ValueEnum {


    public static final Compare LESS_THAN = new Compare(-1) {
        @Override
        public void assign(Value newVal) {
            throw new IllegalArgumentException("Enum Constant cannot be set!");
        }
    };
    public static final Compare EQUAL = new Compare(0) {
        @Override
        public void assign(Value newVal) {
            throw new IllegalArgumentException("Enum Constant cannot be set!");
        }
    };
    public static final Compare GREATER_THAN = new Compare(1) {
        @Override
        public void assign(Value newVal) {
            throw new IllegalArgumentException("Enum Constant cannot be set!");
        }
    };

    private int status;

    protected Compare(int i) {
        status = i;
    }

    /**
     * Returns 1 if GT, 0 if EQ, or -1 if LT
     */
    public int status() {
        return status;
    }

    @Override
    public void assign(Value newVal) {
        this.status = ((Compare) newVal).status;
    }

    @Override
    public ClassLiteral getType() {
        return ClassLiteral.Compare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compare compare = (Compare) o;
        return status == compare.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }
}