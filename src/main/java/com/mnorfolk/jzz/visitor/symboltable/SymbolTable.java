package com.mnorfolk.jzz.visitor.symboltable;

import com.mnorfolk.jzz.ex.SyntaxException;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents the symbol table
 *
 * @author Maxwell Norfolk
 */
public class SymbolTable {

    /**
     * Simple class used to represent an environment (scope). Keeps track of the variables,
     * their corresponding types and the classes that are declared here
     */
    private static class Environment {
        private Map<String, VarInfo> vars;
        private Map<String, DataType> classes;
        private Environment parent;

        public Environment(Environment parent) {
            this.parent = parent;
            this.vars = new HashMap<>();
            this.classes = new HashMap<>();
        }

        /**
         * Returns the datatype for the variable
         */
        public VarInfo lookForVar(String key) {
            for (Environment here = this; here != null; here = here.parent) {
                VarInfo data = here.vars.get(key);
                if (data != null)
                    return data;
            }
            return null;
        }

        /**
         * Returns the DataType object associated with the class name
         */
        public DataType lookForClass(String key) {
            for (Environment here = this; here != null; here = here.parent) {
                DataType data = here.classes.get(key);
                if (data != null)
                    return data;
            }
            return null;
        }
    }

    public static Environment current;

    // static initializer
    static {
        enterNew();
        put("Class", "Class");
        put("Int", "Class");
        put("Float", "Class");
        put("$String", "Class");
        put("Array", "Class");
        put("Compare", "Class");
        put("Bool", "Class");
        put("Func", "Class");
        put("Scan", "Class");
        put("Iter", "Class");
        put("$return", "Func", true);
        put("$if", "Func", true);
        put("$while", "Func", true);
        put("$break", "Func", true);
        put("print", "Func", true);
        put("println", "Func", true);
        put("react", "Func", true);
        put("alert", "Func", true);
        put("randInt", "Func", true);

        put("in", "Scan", true);

        ///////////////////////////////////////////////////
        // Attribute's
        ///////////////////////////////////////////////////

        putAttribute("$String", "upper", "Func");

        putAttribute("Scan", "has", "Func");
        putAttribute("Scan", "hasInt", "Func");
        putAttribute("Scan", "hasFloat", "Func");
        putAttribute("Scan", "hasBool", "Func");

        putAttribute("Scan", "next", "Func");
        putAttribute("Scan", "nextInt", "Func");
        putAttribute("Scan", "nextFloat", "Func");
        putAttribute("Scan", "nextBool", "Func");
        putAttribute("Scan", "nextLine", "Func");

        putAttribute("Array", "has", "Func");
        putAttribute("Array", "forEach", "Func");
        putAttribute("Array", "it", "Func");

        putAttribute("Iter", "has", "Func");
        putAttribute("Iter", "get", "Func");
        putAttribute("Iter", "next", "Func");
        putAttribute("Iter", "prev", "Func");
        putAttribute("Iter", "reset", "Func");
    }

    /**
     * Goes down a level and creates a new environment with the current as parent
     */
    public static void enterNew() {
        current = new Environment(current);
    }

    /**
     * Returns to the parent
     */
    public static void leave() {
        current = current.parent;
    }

    /**
     * Looks for a string and returns the corresponding datatype for the variable
     */
    public static VarInfo lookForVar(String str) {
        return current.lookForVar(str);
    }

    public static boolean atThisLevel(String varName) {
        return current.vars.containsKey(varName);
    }

    /**
     * Puts a value into the symbol table
     */
    public static void put(String str, String type, boolean init) {
        if (type.equals("Class")) {
            current.classes.put(str, new DataType(str));
            current.vars.put(str, new VarInfo(DataType.Class));
        } else {
            DataType dataType = current.lookForClass(type);
            if (dataType == null) {
                throw new SyntaxException("Cannot find Class/Datatype named: '"
                        + type + "' in instance of declaring '" + str + "'.");
            }
            // add it and make sure we aren't replacing a variable already
            // declared in this scope

            VarInfo info = new VarInfo(dataType);
            if (init)
                info.initialize();
            if (current.vars.put(str, info) != null)
                throw new SyntaxException("Cannot declare '" + str + "' as '" + type +
                        "' as that name has already been declared in this scope!");
        }
    }

    /**
     * Puts a value into the symbol table uninitialized
     */
    public static void put(String str, String type) {
        put(str, type, false);
    }

    public static void putAttribute(String parentTypeName, String attName, String attTypeName) {
        DataType parent = current.classes.get(parentTypeName);
        DataType attType = current.classes.get(attTypeName);
        parent.addField(attName, attType);
    }
}