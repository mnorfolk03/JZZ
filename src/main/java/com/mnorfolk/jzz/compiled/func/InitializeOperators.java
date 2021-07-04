package com.mnorfolk.jzz.compiled.func;

import com.mnorfolk.jzz.compiled.ClassLiteral;
import com.mnorfolk.jzz.compiled.Value;
import com.mnorfolk.jzz.compiled.classes.Float;
import com.mnorfolk.jzz.compiled.classes.Number;
import com.mnorfolk.jzz.compiled.classes.*;

import static com.mnorfolk.jzz.compiled.func.InitializeFunc.$return;

/**
 * Used to initalize the operators.
 *
 * @author Maxwell Norfolk
 */
public class InitializeOperators {

    public static void init() {
        // PLUS ////////////////////////////////////////////////////////////////////////
        {
            Operator.PLUS.override(params -> {
                Number n0 = (Number) params[0];
                Number n1 = (Number) params[1];
                $return.callParen(new Int(n0.getInt() + n1.getInt()));
            }, ClassLiteral.Int, ClassLiteral.Int);

            FunctionCode addFloat = params -> {
                Number n0 = (Number) params[0];
                Number n1 = (Number) params[1];
                $return.callParen(new Float(n0.getFloat() + n1.getFloat()));
            };

            Operator.PLUS.override(addFloat, ClassLiteral.Float, ClassLiteral.Float);
            Operator.PLUS.override(addFloat, ClassLiteral.Int, ClassLiteral.Float);
            Operator.PLUS.override(addFloat, ClassLiteral.Float, ClassLiteral.Int);

            Operator.PLUS.override(params -> {
                String s0 = (($String) params[0]).toString();
                String s1 = (($String) params[1]).toString();
                $return.callParen(new $String(s0 + s1));
            }, ClassLiteral.$String, ClassLiteral.$String);
        }
        // MINUS ///////////////////////////////////////////////////////////////////////
        {
            Operator.MINUS.override(params -> {
                Number n0 = (Number) params[0];
                Number n1 = (Number) params[1];
                $return.callParen(new Int(n0.getInt() - n1.getInt()));
            }, ClassLiteral.Int, ClassLiteral.Int);

            FunctionCode subFloat = params -> {
                Number n0 = (Number) params[0];
                Number n1 = (Number) params[1];
                $return.callParen(new Float(n0.getFloat() - n1.getFloat()));
            };

            Operator.MINUS.override(subFloat, ClassLiteral.Float, ClassLiteral.Float);
            Operator.MINUS.override(subFloat, ClassLiteral.Int, ClassLiteral.Float);
            Operator.MINUS.override(subFloat, ClassLiteral.Float, ClassLiteral.Int);
        }
        // UNARY MINUS /////////////////////////////////////////////////////////////////
        {
            Operator.MINUS.override(params -> $return.callParen(
                    new Int(-((Int) params[0]).getInt())), ClassLiteral.Int);

            Operator.MINUS.override(params -> $return.callParen(
                    new Float(-((Float) params[0]).getFloat())), ClassLiteral.Float);
        }
        // MULTI ///////////////////////////////////////////////////////////////////////
        {
            Operator.MULTI.override(params -> {
                Number n0 = (Number) params[0];
                Number n1 = (Number) params[1];
                $return.callParen(new Int(n0.getInt() * n1.getInt()));
            }, ClassLiteral.Int, ClassLiteral.Int);

            FunctionCode multiFloat = params -> {
                Number n0 = (Number) params[0];
                Number n1 = (Number) params[1];
                $return.callParen(new Float(n0.getFloat() * n1.getFloat()));
            };

            Operator.MULTI.override(multiFloat, ClassLiteral.Float, ClassLiteral.Float);
            Operator.MULTI.override(multiFloat, ClassLiteral.Int, ClassLiteral.Float);
            Operator.MULTI.override(multiFloat, ClassLiteral.Float, ClassLiteral.Int);

            Operator.MULTI.override((params) -> {
                Func func = (Func) params[0];
                Array arr = (Array) params[1];
                FunctionCode base = func.getCode();
                Value[] defaultParams = arr.copy().data();
                FunctionCode code = (passed) -> {
                    int len = Math.max(passed.length, defaultParams.length);
                    Value[] callParams = new Value[len];
                    int i = 0;
                    for (; i < passed.length; i++)
                        callParams[i] = passed[i];

                    for (; i < defaultParams.length; i++)
                        callParams[i] = defaultParams[i];
                    base.call(callParams);
                };

                $return.callParen(new Func(code));
            }, ClassLiteral.Func, ClassLiteral.Array);
        }

        Operator.MULTI.override(params -> {
            Iter it = (Iter) params[0];
            $return.callParen(it.get.callParen());
        }, ClassLiteral.Iter);
        // INT DIV /////////////////////////////////////////////////////////////////////
        {
            FunctionCode floorDiv = params -> {
                Number n0 = (Number) params[0];
                Number n1 = (Number) params[1];
                $return.callParen(new Int(Math.floorDiv(n0.getInt(), n1.getInt())));
            };

            Operator.FLOOR_DIV.override(floorDiv, ClassLiteral.Int, ClassLiteral.Int);
            Operator.FLOOR_DIV.override(floorDiv, ClassLiteral.Float, ClassLiteral.Float);
            Operator.FLOOR_DIV.override(floorDiv, ClassLiteral.Int, ClassLiteral.Float);
            Operator.FLOOR_DIV.override(floorDiv, ClassLiteral.Float, ClassLiteral.Int);
        }
        // FLOAT DIV ///////////////////////////////////////////////////////////////////
        {
            FunctionCode floatDiv = params -> {
                Number n0 = (Number) params[0];
                Number n1 = (Number) params[1];
                $return.callParen(new Float(n0.getFloat() / n1.getFloat()));
            };

            Operator.DIV.override(floatDiv, ClassLiteral.Int, ClassLiteral.Int);
            Operator.DIV.override(floatDiv, ClassLiteral.Float, ClassLiteral.Float);
            Operator.DIV.override(floatDiv, ClassLiteral.Int, ClassLiteral.Float);
            Operator.DIV.override(floatDiv, ClassLiteral.Float, ClassLiteral.Int);
        }
        // MODULUS /////////////////////////////////////////////////////////////////////
        {
            FunctionCode mod = params -> {
                Number n0 = (Number) params[0];
                Number n1 = (Number) params[1];
                $return.callParen(new Int(Math.floorMod(n0.getInt(), n1.getInt())));
            };

            Operator.MOD.override(mod, ClassLiteral.Int, ClassLiteral.Int);
            Operator.MOD.override(mod, ClassLiteral.Float, ClassLiteral.Float);
            Operator.MOD.override(mod, ClassLiteral.Int, ClassLiteral.Float);
            Operator.MOD.override(mod, ClassLiteral.Float, ClassLiteral.Int);

            Operator.MOD.override(params -> {
                $String str = ($String) params[0];
                Array arr = (Array) params[1];

                // transform int's and such into their corresponding correct primitive,
                // so it will work with this.
                Object[] javaObjs = new Object[arr.size()];
                for (int i = 0; i < javaObjs.length; i++) {
                    Value v = arr.get(i);
                    switch (v.getType()) {
                        case Int:
                            javaObjs[i] = ((Int) v).getInt();
                            break;
                        case Float:
                            javaObjs[i] = ((Float) v).getFloat();
                            break;
                        case Bool:
                            javaObjs[i] = ((Bool) v).get();
                            break;
                        default:
                            javaObjs[i] = v.toString();
                    }
                }

                $return.callParen(new $String(String.format(str.toString(), javaObjs)));
            }, ClassLiteral.$String, ClassLiteral.Array);
        }
        // POW /////////////////////////////////////////////////////////////////////////
        {
            FunctionCode pow = params -> {
                Number n0 = (Number) params[0];
                Number n1 = (Number) params[1];
                $return.callParen(new Float(Math.pow(n0.getFloat(), n1.getFloat())));
            };

            Operator.POW.override(pow, ClassLiteral.Int, ClassLiteral.Int);
            Operator.POW.override(pow, ClassLiteral.Float, ClassLiteral.Float);
            Operator.POW.override(pow, ClassLiteral.Int, ClassLiteral.Float);
            Operator.POW.override(pow, ClassLiteral.Float, ClassLiteral.Int);
        }
        // SHIFT_R /////////////////////////////////////////////////////////////////////
        {
            Operator.SHIFT_R.override(params -> {
                Scan scan = (Scan) params[0];
                Int n = (Int) params[1];
                n.assign(new Int(scan.get().nextInt()));
                $return.callParen(scan);
            }, ClassLiteral.Scan, ClassLiteral.Int);

            Operator.SHIFT_R.override(params -> {
                Scan scan = (Scan) params[0];
                Float n = (Float) params[1];
                n.assign(new Float(scan.get().nextDouble()));
                $return.callParen(scan);
            }, ClassLiteral.Scan, ClassLiteral.Float);

            Operator.SHIFT_R.override(params -> {
                Scan scan = (Scan) params[0];
                Bool n = (Bool) params[1];
                n.assign(new Bool(scan.get().nextBoolean()));
                $return.callParen(scan);
            }, ClassLiteral.Scan, ClassLiteral.Bool);

            Operator.SHIFT_R.override(params -> {
                Scan scan = (Scan) params[0];
                $String n = ($String) params[1];
                n.assign(new $String(scan.get().next()));
                $return.callParen(scan);
            }, ClassLiteral.Scan, ClassLiteral.$String);
        }

        // INT_COMPARE /////////////////////////////////////////////////////////////////
        {
            FunctionCode comp = params -> {
                Number n0 = (Number) params[0];
                Number n1 = (Number) params[1];
                int comp1 = Double.compare(n0.getFloat(), n1.getFloat());
                if (comp1 == 0)
                    $return.callParen(Compare.EQUAL);
                else
                    $return.callParen(comp1 > 0 ? Compare.GREATER_THAN : Compare.LESS_THAN);
            };

            Operator.INT_COMPARE.override(comp, ClassLiteral.Int, ClassLiteral.Int);
            Operator.INT_COMPARE.override(comp, ClassLiteral.Float, ClassLiteral.Float);
            Operator.INT_COMPARE.override(comp, ClassLiteral.Int, ClassLiteral.Float);
            Operator.INT_COMPARE.override(comp, ClassLiteral.Float, ClassLiteral.Int);

            Operator.INT_COMPARE.override(params -> {
                String s0 = (($String) params[0]).toString();
                String s1 = (($String) params[1]).toString();
                int comp1 = s0.compareTo(s1);
                if (comp1 == 0)
                    $return.callParen(Compare.EQUAL);
                else
                    $return.callParen(comp1 > 0 ? Compare.GREATER_THAN : Compare.LESS_THAN);
            }, ClassLiteral.$String, ClassLiteral.$String);
        }
        // INCREMENT ///////////////////////////////////////////////////////////////////
        {
            Operator.INCREMENT.override(params -> {
                int newVal = ((Number) params[0]).getInt();
                params[0].assign(new Int(newVal + 1));
                $return.callParen(params[0]);
            }, ClassLiteral.Int);
            Operator.INCREMENT.override(params -> {
                double newVal = ((Number) params[0]).getFloat();
                params[0].assign(new Float(newVal + 1));
                $return.callParen(params[0]);
            }, ClassLiteral.Float);

            Operator.INCREMENT.override(params -> {
                Iter it = (Iter) params[0];
                it.next.callParen();
                $return.callParen();
            }, ClassLiteral.Iter);
        }
        // DECREMENT ///////////////////////////////////////////////////////////////////
        {
            Operator.DECREMENT.override(params -> {
                int newVal = ((Number) params[0]).getInt();
                params[0].assign(new Int(newVal - 1));
                $return.callParen(params[0]);
            }, ClassLiteral.Int);
            Operator.DECREMENT.override(params -> {
                double newVal = ((Number) params[0]).getFloat();
                params[0].assign(new Float(newVal - 1));
                $return.callParen(params[0]);
            }, ClassLiteral.Float);

            Operator.DECREMENT.override(params -> {
                Iter it = (Iter) params[0];
                it.prev.callParen();
                $return.callParen();
            }, ClassLiteral.Iter);
        }
        // BAR /////////////////////////////////////////////////////////////////////////
        {
            Operator.BAR.override(params -> {
                int newVal = ((Number) params[0]).getInt();
                $return.callParen(new Int(Math.abs(newVal)));
            }, ClassLiteral.Int);
            Operator.BAR.override(params -> {
                double newVal = ((Number) params[0]).getFloat();
                $return.callParen(new Float(Math.abs(newVal)));
            }, ClassLiteral.Float);

            Operator.BAR.override(params -> $return.callParen(
                    new Int(((Array) params[0]).size())), ClassLiteral.Array);

            Operator.BAR.override(params -> $return.callParen(
                    new Int((($String) params[0]).size())), ClassLiteral.$String);
        }
        // EQ //////////////////////////////////////////////////////////////////////////
        {
            Operator.EQ.override(params -> {
                Bool b0 = (Bool) params[0];
                Bool b1 = (Bool) params[1];
                $return.callParen(new Bool(b0.get() == b1.get()));
            }, ClassLiteral.Bool, ClassLiteral.Bool);
        }
        // NOT /////////////////////////////////////////////////////////////////////////
        {
            Operator.NOT.override(params -> {
                if (params[0] instanceof Bool)
                    $return.callParen(new Bool(!((Bool) params[0]).get()));
            }, ClassLiteral.Bool);
        }
        // AND /////////////////////////////////////////////////////////////////////////
        {
            Operator.AND.override(params -> {
                Bool b0 = (Bool) params[0];
                Bool b1 = (Bool) params[1];
                $return.callParen(new Bool(b0.get() && b1.get()));
            }, ClassLiteral.Bool, ClassLiteral.Bool);
        }
        // OR //////////////////////////////////////////////////////////////////////////
        {
            Operator.OR.override(params -> {
                Bool b0 = (Bool) params[0];
                Bool b1 = (Bool) params[1];
                $return.callParen(new Bool(b0.get() || b1.get()));
            }, ClassLiteral.Bool, ClassLiteral.Bool);
        }
        // XOR /////////////////////////////////////////////////////////////////////////
        {
            Operator.XOR.override(params -> {
                Bool b0 = (Bool) params[0];
                Bool b1 = (Bool) params[1];
                $return.callParen(new Bool(b0.get() != b1.get()));
            }, ClassLiteral.Bool, ClassLiteral.Bool);

        }
    }
}
