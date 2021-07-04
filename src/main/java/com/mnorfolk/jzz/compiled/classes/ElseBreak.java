package com.mnorfolk.jzz.compiled.classes;

import com.mnorfolk.jzz.compiled.ClassLiteral;
import com.mnorfolk.jzz.compiled.Value;
import com.mnorfolk.jzz.compiled.func.Func;

import static com.mnorfolk.jzz.compiled.func.InitializeFunc.$return;

/**
 * Represents the object that should be used after a while loop or other loops. It allows
 * users to attach an else clause that will execute unless the loop breaks.
 *
 * @author Maxwell Norfolk
 */
public class ElseBreak implements Value {

    private boolean shouldExecute;

    public Func $else = new Func(params -> {
        if (shouldExecute) {
            Func func = (Func) params[0];
            func.callParen();
        }

        $return.callParen();
    });

    public ElseBreak(boolean shouldExecute) {
        this.shouldExecute = shouldExecute;
    }

    @Override
    public void assign(Value newVal) throws ClassCastException {
        this.shouldExecute = ((ElseBreak) newVal).shouldExecute;
    }

    @Override
    public ClassLiteral getType() {
        return ClassLiteral.ElseBreak;
    }

    @Override
    public Value copy() {
        return new ElseBreak(shouldExecute);
    }
}
