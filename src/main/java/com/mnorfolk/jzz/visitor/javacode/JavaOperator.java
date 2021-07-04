package com.mnorfolk.jzz.visitor.javacode;

import com.mnorfolk.jzz.compiled.func.Operator;

/**
 * Represents an operator being called.
 *
 * @author Maxwell Norfolk
 */
public class JavaOperator implements JavaCode {

    private Operator op;
    private JavaCode[] params;

    public JavaOperator(Operator op, JavaCode... params) {
        this.op = op;
        this.params = params;
    }

    @Override
    public String getCode() {
        StringBuilder builder = new StringBuilder(10 * params.length);
        for (JavaCode param : params)
            builder.append(param.getCode()).append(',');
        builder.deleteCharAt(builder.length() - 1);

        return "Operator." + op.name() + ".call(" + builder + ")";
    }
}
