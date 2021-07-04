package com.mnorfolk.jzz.visitor.javacode;

/**
 * Represents the java code for an array
 *
 * @author Maxwell Norfolk
 */
public class JavaArray implements JavaCode {

    private JavaCode[] data;

    public JavaArray(JavaCode[] data) {
        this.data = data;
    }

    public String getMiddle() {
        StringBuilder mid = new StringBuilder(data.length * 20);
        for (JavaCode code : data)
            mid.append(code.getCode()).append(", ");

        mid.setLength(mid.length() - 2);
        return mid.toString();
    }

    @Override
    public String getCode() {
        return "new Array(" + getMiddle() + ")";
    }
}
