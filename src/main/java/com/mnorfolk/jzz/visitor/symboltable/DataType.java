package com.mnorfolk.jzz.visitor.symboltable;

import java.util.HashMap;

/**
 * Represents a datatype
 *
 * @author Maxwell Norfolk
 */
public class DataType {
    private int index;
    private static int nextIndex;
    private String name;

    private HashMap<String, DataType> fields;

    public DataType(String name) {
        this.index = nextIndex++;
        this.name = name;
        fields = new HashMap<>();
    }

    public static final DataType Class = new DataType("Class");

    public String getName() {
        return name;
    }

    public void addField(String name, DataType type) {
        fields.put(name, type);
    }

    /**
     * Returns the datatype of the field of the given name, or NULL if there isn't a field
     * of that name
     */
    public DataType getField(String name) {
        return fields.get(name);
    }

    @Override
    public int hashCode() {
        return index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataType dataType = (DataType) o;
        return index == dataType.index;
    }
}
