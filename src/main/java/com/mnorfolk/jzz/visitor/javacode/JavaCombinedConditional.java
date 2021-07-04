package com.mnorfolk.jzz.visitor.javacode;

import com.mnorfolk.jzz.compiled.func.Operator;

/**
 * Represents the java code for a combined conditional. A combined conditional
 * is simply a series of =='s, <'s or >'s (with also allowing the or equal to version
 * of the <'s and >'s)
 *
 * @author Maxwell Norfolk
 */
public class JavaCombinedConditional implements JavaCode {

    public JavaCombinedConditional(Operator[] ops, JavaCode[] args) {
        this.ops = ops;
        this.args = args;
    }

    private Operator[] ops;
    private JavaCode[] args;

    @Override
    public String getCode() {

        // 15 is Operator. and some additional chars
        StringBuilder builder = new StringBuilder(ops.length * 15);

        String[] convertedArgs = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            convertedArgs[i] = args[i].getCode();
        }

        // create a long combination of operators combined into one
        builder.append('(');
        for (int i = 0; i < ops.length; i++) {
            builder.append("Operator.")
                    .append(ops[i].name())
                    .append(".call(")
                    .append(convertedArgs[i])
                    .append(",")
                    .append(convertedArgs[i + 1])
                    .append(").equals(Bool.TRUE) && ");
        }

        builder.setLength(builder.length() - 4);

        builder.append(") ? new Bool(true) : new Bool(false)");
        return builder.toString();
    }
}
