package com.mnorfolk.jzz.compiled.func;

import com.mnorfolk.jzz.compiled.Value;
import com.mnorfolk.jzz.compiled.ClassLiteral;
import com.mnorfolk.jzz.compiled.func.postop.ParenCallable;
import com.mnorfolk.jzz.ex.ReturnNowException;

/**
 * Represents a function. Typically use {@link Func#Func(FunctionCode)} constructor
 * however if a function will make use of recursion instead use {@link Func#Func()} and
 * {@link #init(FunctionCode)}.
 *
 * @author Maxwell Norfolk
 */
public class Func implements ParenCallable {

    protected FunctionCode code;

    public Func(FunctionCode code) {
        this.code = code;
    }

    public Func() {
    }

    /**
     * This should be used with the default constructor. The reason for this is because of
     * recursive methods. They will try to access a reference to a method that does
     * not exist yet, and thus it may not be initialized. This can be easily fixed by
     * instead of doing <code>new Func(()->{...})<code/> do
     * <code>new Func(); myFunc.init(()->{...})<code/>. This will fix the issue.
     */
    public void init(FunctionCode code) {
        this.code = code;
    }

    public FunctionCode getCode(){
        return code;
    }

    @Override
    public Value callParen(Value... params) {
        try {
            code.call(params);
        } catch (ReturnNowException e) {
            return e.get();
        }
        throw new IllegalStateException("This should never be reached!");
    }

    @Override
    public void assign(Value newVal) throws ClassCastException {
        this.code = ((Func) newVal).code;
    }

    @Override
    public ClassLiteral getType() {
        return ClassLiteral.Func;
    }

    @Override
    public Value copy() {
        return new Func(code);
    }
}
