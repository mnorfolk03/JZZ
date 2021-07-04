package com.mnorfolk.jzz.compiled.func;

import com.mnorfolk.jzz.compiled.Value;
import com.mnorfolk.jzz.compiled.classes.*;
import com.mnorfolk.jzz.ex.AlertReturnException;
import com.mnorfolk.jzz.ex.BreakException;
import com.mnorfolk.jzz.ex.InvalidParamCountException;
import com.mnorfolk.jzz.ex.ReturnNowException;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * The default functions in the programming language
 *
 * @author Maxwell Norfolk
 */
public class InitializeFunc {

    public static final Func $return = new Func(params -> {
        if (params.length > 1)
            throw new InvalidParamCountException("Too many params received for the Func return!");
        Value ret = params.length == 0 ? Value.VOID : params[0];
        throw new ReturnNowException(ret);
    }) {
        @Override
        public Value callParen(Value... params) {
            code.call(params);
            throw new IllegalStateException("The code should always throw an exception!");
        }
    };

    public static final Func print = new Func(params -> {
        System.out.print(params[0]);
        $return.callParen(); // return VOID
    });

    public static final Func println = new Func(params -> {
        System.out.println(params[0]);
        $return.callParen(); // return VOID
    });

    public static final Func $if = new Func(params -> {
        boolean executed = false;
        Bool bool = (Bool) params[0];
        if (bool.equals(Bool.TRUE)) {
            Func subFunc = (Func) params[1];
            subFunc.callParen();
            executed = true;
        }
        $return.callParen(new ElseIf(executed)); // return VOID
    });

    public static final Func $while = new Func(params -> {
        Func bool = (Func) params[0];
        Func lambda = (Func) params[1];
        try {
            while (bool.callParen().equals(Bool.TRUE)) {
                lambda.callParen();
            }

            // no break
            $return.callParen(new ElseBreak(true));
        } catch (BreakException be) {
            $return.callParen(new ElseBreak(false));
        }
    });

    public static final Func $break = new Func(params -> {
        throw new BreakException();
    });

    public static final Func alert = new Func(params -> {
        if (params.length > 1)
            throw new InvalidParamCountException("Too many params received for the Func alert!");
        Value ret = params.length == 0 ? Value.VOID : params[0];
        throw new AlertReturnException(ret);
    });

    public static final Func react = new Func(params -> {
        if (params.length != 1)
            throw new InvalidParamCountException("react function needs exactly 1 function!");
        Func func = (Func) params[0];
        try {
            $return.callParen(
                    func.callParen()
            ); // return what the function normally returns or return from alert
        } catch (AlertReturnException exc) {
            $return.callParen(exc.get());
        }
    });

    public static final Func randInt = new Func(params -> {
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        Int limit = (Int) params[0];
        $return.callParen(new Int(rand.nextInt(0, limit.getInt())));
    });

    public static Scan in = new Scan(new Scanner(System.in));
}
