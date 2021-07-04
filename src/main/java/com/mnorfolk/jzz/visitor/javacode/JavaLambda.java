package com.mnorfolk.jzz.visitor.javacode;

/**
 * Represents a lambda/function and the java code that should be associated with it.
 *
 * @author Maxwell Norfolk
 */
public class JavaLambda implements JavaCode {
    protected JavaLambdaParams paramSetUp;
    protected JavaCode[] code;

    public JavaLambda(JavaLambdaParams paramSetUp, JavaCode[] code) {
        this.paramSetUp = paramSetUp;
        this.code = code;

    }

    public String getMain() {
        String header = "package com.mnorfolk.jzz.compiled;\n" +
                "\n" +
                "\n" +
                "import com.mnorfolk.jzz.compiled.*;\n" +
                "import com.mnorfolk.jzz.compiled.classes.*;\n" +
                "import com.mnorfolk.jzz.compiled.func.*;\n" +
                "import com.mnorfolk.jzz.compiled.func.postop.*;\n" +
                "\n" +
                "import static com.mnorfolk.jzz.compiled.func.InitializeFunc.*;\n" +
                "import com.mnorfolk.jzz.ex.*;\n" +
                "import static com.mnorfolk.jzz.compiled.Value.VOID;\n" +
                "\n" +
                "/**\n" +
                " * The main file. This is compiled from a .jzz file.\n" +
                " *\n" +
                " * @author Maxwell Norfolk\n" +
                " */\n" +
                "public class CompiledMain {\n" +
                "\n" +
                "public static void main(String[] args) {\n";
        StringBuilder code = new StringBuilder(this.code.length * 20);
        for (JavaCode javaCode : this.code) {
            code.append(javaCode.getCode())
                    .append('\n');
        }
        return header + code + "}}";
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

        // setup code
        StringBuilder code = new StringBuilder(this.code.length * 20);
        for (JavaCode javaCode : this.code) {
            code.append(javaCode.getCode())
                    .append('\n');
        }

        return header
                + paramSetUp.getCode()
                + code
                + "$return.callParen(); // default return (incase they don't return)\n}})";
    }
}
