package com.mnorfolk.jzz.compiled.classes;

import com.mnorfolk.jzz.compiled.ClassLiteral;
import com.mnorfolk.jzz.compiled.Value;
import com.mnorfolk.jzz.compiled.func.Func;

import static com.mnorfolk.jzz.compiled.func.InitializeFunc.$return;

/**
 * @author Maxwell Norfolk
 */
public class ElseIf implements Value {

    private boolean executedYet;


    public Func elif = new Func(params -> {
        if (!executedYet) {
            Bool bool = (Bool) params[0];
            if (bool.equals(Bool.TRUE)) {
                Func subFunc = (Func) params[1];
                subFunc.callParen();
                executedYet = true;
            }
        }
        $return.callParen(this);
    });

    public Func $else = new Func(params -> {
        if (!executedYet) {
            Func func = (Func) params[0];
            func.callParen();
        }
        $return.callParen();
    });

    public ElseIf(boolean executedYet) {
        this.executedYet = executedYet;
    }

    @Override
    public void assign(Value newVal) throws ClassCastException {
        this.executedYet = ((ElseIf) newVal).executedYet;
    }

    @Override
    public ClassLiteral getType() {
        return ClassLiteral.ElseIf;
    }

    @Override
    public Value copy() {
        return new ElseIf(executedYet);
    }
}
