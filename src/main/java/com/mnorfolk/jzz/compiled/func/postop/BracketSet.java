package com.mnorfolk.jzz.compiled.func.postop;

import com.mnorfolk.jzz.compiled.Value;

/**
 * If a class implements this interface, then the [] = operator is defined on this. For
 * example, arr[0] = 5.
 *
 * @author Maxwell Norfolk
 */
public interface BracketSet extends Value {

    void setBracket(Value right, Value... params);
}
