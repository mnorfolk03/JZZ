package com.mnorfolk.jzz.compiled.func;

import com.mnorfolk.jzz.compiled.*;
import com.mnorfolk.jzz.compiled.classes.Array;
import com.mnorfolk.jzz.compiled.classes.Bool;
import com.mnorfolk.jzz.compiled.classes.Compare;
import com.mnorfolk.jzz.ex.ReturnNowException;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents an operator. If derivedCondition is true, then then it will first
 * attempt to lookup the params normally, then attempt to call it based upon INT_COMPARE
 *
 * @author Maxwell Norfolk
 */
public enum Operator {

    PLUS("+"),
    MINUS("-"),
    MULTI("*"),
    DIV("/"),
    FLOOR_DIV("//"),
    MOD("%"),
    DIV_MOD("/%") {
        @Override
        public Value call(Value... values) throws IllegalArgumentException {
            // if custom just for this op, then use it otherwise,
            // just return array of div and mod
            try {
                return super.call(values);
            } catch (IllegalArgumentException e) {
                return new Array(FLOOR_DIV.call(values), MOD.call(values));
            }
        }
    },
    POW("^"),
    LT("<", true, false, false), // <
    GT(">", false, false, true), // >
    LTEQ("<=", true, true, false), // < or =
    GTEQ(">=", false, true, true), // > or =
    EQ("==", false, true, false), // =
    NEQ("!=", true, false, true) {
        @Override
        public Value call(Value... values) throws IllegalArgumentException {
            // try to use INT_COMPARE, or a default NEQ op, else just do
            // NOT and EQ
            try {
                return super.call(values);
            } catch (IllegalArgumentException e) {
                return Operator.NOT.call(Operator.EQ.call(values));
            }
        }
    }, // < or >
    INT_COMPARE("<=>"), // should return Compare obj or else breaks stuff
    NOT("!"),
    OR("||"),
    AND("&&"),
    XOR("&|"),
    SHIFT_L("<<"),
    SHIFT_R(">>"),
    AMPERSAND("&"),
    INCREMENT("++"),
    DECREMENT("--"),
    BAR("|");

    private final String literal;
    private final Map<Argument, FunctionCode> overrides;
    private final boolean[] derivedCondition;

    private Operator(String literal) {
        this(literal, (boolean[]) null);
    }

    private Operator(String literal, boolean... derivedCondition) {
        this.literal = literal;
        overrides = new HashMap<>();
        this.derivedCondition = derivedCondition;
    }

    static {
        // init ops
        InitializeOperators.init();
    }

    public void override(FunctionCode code, Argument argTypes) {
        overrides.put(argTypes, code);
    }

    public void override(FunctionCode code, ClassLiteral... argTypes) {
        overrides.put(new Argument(argTypes), code);
    }

    public Value call(Value... values) throws IllegalArgumentException {

        // get the parameter types
        ClassLiteral[] paramTypes = new ClassLiteral[values.length];
        for (int i = 0; i < values.length; i++) {
            paramTypes[i] = values[i].getType();
        }

        // lookup the function, and call
        Argument args = new Argument(paramTypes);
        FunctionCode code = overrides.get(args);
        String errorMessage = "The argument types: " + args +
                " is invalid for operator: '" + name() + "'";

        // if found a method, call it
        if (code != null) {
            try {
                code.call(values);
                throw new IllegalStateException(
                        "This state is impossible to reach when executing an operator!");
            } catch (ReturnNowException e) {
                return e.get();
            }
        } else if (derivedCondition != null) { // if can't then try to use derived

            try {
                // use INT_COMPARE to see if it is derived
                INT_COMPARE.overrides.get(args).call(values);
            } catch (ReturnNowException e) {
                Compare comp = (Compare) e.get();
                // derived is stored as [lt, eq, gt] and corresponding status is [-1, 0, 1]
                // so +1 will give us the requested index
                if (derivedCondition[comp.status() + 1])
                    return Bool.TRUE;
                return Bool.FALSE;


            } catch (NullPointerException npe) {
                throw new IllegalArgumentException(errorMessage, npe);
            }

            throw new IllegalStateException("This should be unreachable in attempting" +
                    " to lookup a comparison operator's state.");
        } else // cannot find what to call :(
            throw new IllegalArgumentException(errorMessage, new NullPointerException());
    }
}
