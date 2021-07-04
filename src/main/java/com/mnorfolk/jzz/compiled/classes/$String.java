package com.mnorfolk.jzz.compiled.classes;

import com.mnorfolk.jzz.compiled.ClassLiteral;
import com.mnorfolk.jzz.compiled.Value;
import com.mnorfolk.jzz.compiled.func.Func;
import com.mnorfolk.jzz.compiled.func.postop.BracketCallable;
import com.mnorfolk.jzz.ex.InvalidParamCountException;

import java.util.Arrays;

import static com.mnorfolk.jzz.compiled.func.InitializeFunc.$return;

/**
 * Represents a String in JZZ
 *
 * @author Maxwell Norfolk
 */
public class $String implements BracketCallable {

    private char[] chars;

    public Func upper = new Func((params) -> {
        Value[] arr = new Value[chars.length];
        for (int i = 0; i < chars.length; i++)
            arr[i] = new Int(Character.toUpperCase(chars[i]));

        $return.callParen(new $String(arr));
    });

    public $String(Array arr) {
        this(arr.data());
    }

    public $String(char[] chars) {
        this.chars = chars;
    }

    public $String(String str) {
        this(str.toCharArray());
    }

    public $String(Value[] data) {
        chars = new char[data.length];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ((Int) data[i]).getInt();
        }
    }

    @Override
    public Value callBracket(Value... params) {
        if (params.length == 1) {
            return new Int(chars[((Int) params[0]).getInt()]);
        } else if (params.length == 2) {
            int start = ((Int) params[0]).getInt();
            int end = ((Int) params[1]).getInt();
            char[] newData = new char[end - start];
            System.arraycopy(chars, start, newData, 0, newData.length);
            return new $String(newData);
        } else
            throw new InvalidParamCountException("Too many parameters were passed while" +
                    " attempting to sub-index an array!");
    }

    public int size() {
        return chars.length;
    }

    @Override
    public void assign(Value newVal) throws ClassCastException {
        this.chars = (($String) newVal).copy().chars;
    }

    @Override
    public ClassLiteral getType() {
        return ClassLiteral.$String;
    }

    @Override
    public $String copy() {
        return new $String(Arrays.copyOf(chars, chars.length));
    }

    @Override
    public String toString() {
        return new String(chars);
    }
}
