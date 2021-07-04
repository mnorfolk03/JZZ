package com.mnorfolk.jzz.compiled.func.postop;

import com.mnorfolk.jzz.compiled.Value;

/**
 * If a class implements this interface, then the () = is defined on this type.
 * For example, var(2) = 5;
 *
 * @author Maxwell Norfolk
 */
public interface ParenSet extends Value {

    void setParen(Value right, Value... params);
}
