package com.mnorfolk.jzz.compiled.classes;

import com.mnorfolk.jzz.compiled.ClassLiteral;
import com.mnorfolk.jzz.compiled.Value;
import com.mnorfolk.jzz.compiled.func.Func;
import com.mnorfolk.jzz.compiled.func.Operator;
import com.mnorfolk.jzz.compiled.func.postop.BracketCallable;
import com.mnorfolk.jzz.compiled.func.postop.BracketSet;
import com.mnorfolk.jzz.ex.InvalidParamCountException;

import java.util.Arrays;

import static com.mnorfolk.jzz.compiled.func.InitializeFunc.$return;

/**
 * Represents an array of values
 *
 * @author Maxwell Norfolk
 */
public class Array implements BracketCallable, BracketSet {

    private Value[] data;

    public Func has = new Func(params -> {
        Value v = params[0];
        for (int i = 0; i < data.length; i++) {
            if (Operator.EQ.call(this, v).equals(Bool.TRUE))
                $return.callParen(new Bool(true));
        }
        $return.callParen(new Bool(false));
    });

    public Func forEach = new Func(params -> {
        Func forEach = (Func) params[0];
        for (Value val : data) {
            forEach.callParen(val);
        }
        $return.callParen(Value.VOID);
    });

    public Func it = new Func(params -> $return.callParen(new Iter(this)));

    public Array(Value... data) {
        this.data = data;
    }

    public int size() {
        return data.length;
    }

    public Value get(int index) {
        return data[index];
    }

    public Value[] data() {
        return data;
    }

    @Override
    public void assign(Value newVal) throws ClassCastException {
        this.data = ((Array) newVal).data;
    }

    @Override
    public ClassLiteral getType() {
        return ClassLiteral.Array;
    }

    @Override
    public Array copy() {
        return new Array(Arrays.copyOf(data, data.length));
    }

    @Override
    public Value callBracket(Value... params) {
        if (params.length == 1) {
            return data[((Int) params[0]).getInt()];
        } else if (params.length == 2) {
            int start = ((Int) params[0]).getInt();
            int end = ((Int) params[1]).getInt();
            Value[] newData = new Value[end - start];
            System.arraycopy(data, start, newData, 0, newData.length);
            return new Array(newData);
            // } else if (params.length == 3) {
            // TODO allow start, end, step
        } else
            throw new InvalidParamCountException("Too many parameters were passed while" +
                    " attempting to sub-index an array!");
    }

    @Override
    public void setBracket(Value right, Value... params) {
        int i = ((Int) params[0]).getInt();
        data[i] = right;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
