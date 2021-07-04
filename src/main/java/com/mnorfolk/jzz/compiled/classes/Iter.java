package com.mnorfolk.jzz.compiled.classes;

import com.mnorfolk.jzz.compiled.ClassLiteral;
import com.mnorfolk.jzz.compiled.Value;
import com.mnorfolk.jzz.compiled.func.Func;

import static com.mnorfolk.jzz.compiled.func.InitializeFunc.$return;

/**
 * Represents an iterator
 *
 * @author Maxwell Norfolk
 */
public class Iter implements Value {

    private Array arr;
    private int index;

    public Func has = new Func(params -> {
        $return.callParen(new Bool(index < arr.size() && index >= 0));
    });

    public Func next = new Func(params -> {
        index++;
        $return.callParen();
    });

    public Func prev = new Func(params -> {
        index--;
        $return.callParen();
    });

    public Func reset = new Func(params -> {
        index = 0;
        $return.callParen();
    });

    public Func get = new Func(params -> {
        $return.callParen(arr.get(index));
    });

    public Iter(Array arr) {
        this.arr = arr;
    }

    public int index() {
        return index;
    }

    @Override
    public void assign(Value newVal) throws ClassCastException {
        Iter newIt = (Iter) newVal;
        arr = newIt.arr;
        index = newIt.index;
    }

    @Override
    public ClassLiteral getType() {
        return ClassLiteral.Iter;
    }

    @Override
    public Value copy() {
        Iter it = new Iter(this.arr);
        it.index = this.index;
        return it;
    }
}
