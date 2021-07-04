package com.mnorfolk.jzz.compiled.classes;

import com.mnorfolk.jzz.compiled.Value;

/**
 * Represents an abstract number
 *
 * @author Maxwell Norfolk
 */
public abstract class Number implements Value {

    public abstract int getInt();

    public abstract double getFloat();
}
