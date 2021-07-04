package com.mnorfolk.jzz.visitor.javacode;

/**
 * Represents a lambda/function that is enclosed in brackets []. This lambda is
 * simply an alias defined as [STUFF] =  {return(STUFF);}
 *
 * @author Maxwell Norfolk
 */
public class JavaBracketLambda extends JavaLambda {

    public JavaBracketLambda(JavaLambdaParams params, JavaCode code) {
        super(params, new JavaCode[]{code});
    }

    @Override
    public String getCode() {

        int min = paramSetUp.minParams();
        int max = paramSetUp.maxParams();

        // setup function
        String header = ("new Func(new FunctionCode() {\n")
                + ("@Override\n")
                + ("public void call(Value...params){\n")

                // check to make sure the parameter count is correct
                + ("if (params.length < " + min + " || params.length > "
                + max + ")\n")
                + ("throw new InvalidParamCountException(\"Expected [\" + " + min + " + \", \"\n")
                + ("+ " + max + " + \"], but instead got '\" + params.length + \"'.\",\n")
                + ("new IndexOutOfBoundsException());\n");

        return header
                + paramSetUp.getCode()
                + "$return.callParen(" + code[0].getCode() + "); // return the inside of brackets\n}})";
    }
}
