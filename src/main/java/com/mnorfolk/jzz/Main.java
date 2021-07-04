package com.mnorfolk.jzz;

import com.mnorfolk.jzz.gen.JzzLexer;
import com.mnorfolk.jzz.gen.JzzParser;
import com.mnorfolk.jzz.visitor.JzzEvalVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

/**
 * Compiles the code and creates the java classes associated with it. Writes to
 * CompiledMain.java
 *
 * @author Maxwell Norfolk
 */
public class Main {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        try {
            InputStream inputStream = Main.class.getResourceAsStream("/iter-demo.jzz");
            Lexer lexer = new JzzLexer(CharStreams.fromStream(inputStream));

            TokenStream tokenStream = new CommonTokenStream(lexer);

            JzzParser parser = new JzzParser(tokenStream);

            JzzEvalVisitor visitor = new JzzEvalVisitor();
            System.out.println("-=-=-=-\n");
            String file = visitor.visitParseFile(parser.parseFile()).getMain();
            System.out.println(file);
            System.out.println("-=-=-=-\n");

            File compiledFile = new File(
                    "src/main/java/com/mnorfolk/jzz/compiled/CompiledMain.java");
            compiledFile.createNewFile();
            FileWriter writer = new FileWriter(compiledFile, false);
            writer.write(file);
            writer.flush();
            System.out.println("Wrote successfully!");
            long elapsed = System.nanoTime() - startTime;
            System.out.println("Finished in: " + (elapsed / 1e9) + " seconds.\n");
            System.out.println("-=-=-=-");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
