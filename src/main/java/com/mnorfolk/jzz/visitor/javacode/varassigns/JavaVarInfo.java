package com.mnorfolk.jzz.visitor.javacode.varassigns;

import com.mnorfolk.jzz.visitor.javacode.JavaCode;

/**
 * Interface used in assignVar, declareVar and declareAndAssign rules. This is important
 * for determining information about the variable like the datatype.
 *
 * @author Maxwell Norfolk
 */
public interface JavaVarInfo extends JavaCode {

    String getVarName();
}
