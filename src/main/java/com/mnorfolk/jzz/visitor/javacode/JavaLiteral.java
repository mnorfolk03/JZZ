package com.mnorfolk.jzz.visitor.javacode;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents a literal in java. This is just a string that should be the same in java
 * as it is in JZZ
 *
 * @author Maxwell Norfolk
 */
public class JavaLiteral implements JavaCode {

    private String literal;

    public JavaLiteral(String literal) {
        this.literal = literal;
    }

    @Override
    public String getCode() {
        return literal;
    }

    public static JavaLiteral getInt(String literal) {
        return new JavaLiteral("new Int(" + literal + ")");
    }

    public static JavaLiteral getSurroundParen(JavaCode middle) {
        return new JavaLiteral("(" + middle.getCode() + ")");
    }

    public static JavaLiteral addSemicolon(JavaCode main, int lineNum) {
        return new JavaLiteral(String.format("%-85s", main.getCode() + ";")
                + "// line: " + lineNum);
    }

    private static final Set<String> keywords = new HashSet<>(Arrays.asList(
            "abstract", "continue", "for", "new", "switch",
            "assert", "default", "goto", "package", "synchronized",
            "boolean", "do", "if", "private", "this",
            "break", "double", "implements", "protected", "throw",
            "byte", "else", "import", "public", "throws",
            "case", "enum", "instanceof", "return", "transient",
            "catch", "extends", "int", "short", "try",
            "char", "final", "interface", "static", "void",
            "class", "finally", "long", "strictfp", "volatile",
            "const", "float", "native", "super", "while", "String", "Object", "null",
            "true", "false"
    ));

    /**
     * Returns the correct representation for the identifier. This is either the exact
     * same, or if it is a keyword, then $id.
     */
    public static JavaLiteral identifier(String id) {
        if (keywords.contains(id)) {
            return new JavaLiteral("$" + id);
        }
        return new JavaLiteral(id);
    }

    public static JavaLiteral identifier(TerminalNode node) {
        return identifier(node.getText());
    }
}
