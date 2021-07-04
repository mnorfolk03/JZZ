package com.mnorfolk.jzz.compiled.func;

import com.mnorfolk.jzz.compiled.Value;
import com.mnorfolk.jzz.ex.InvalidParamCountException;
import com.mnorfolk.jzz.ex.ReturnNowException;

/**
 * Represents a body of code used in a function or something similar.
 *
 * @author Maxwell Norfolk
 */
public interface FunctionCode {

    /**
     * Executes code based upon the input. It will ALWAYS throw an exception. If it
     * throws the ReturnNowException then that should be treated as the return type.
     *
     * @param params the parameters to call on.
     * @throws InvalidParamCountException if there are too many or too few parameters
     * @throws ReturnNowException         the return value for the function.
     */
    void call(Value... params) throws InvalidParamCountException, ReturnNowException;
}
