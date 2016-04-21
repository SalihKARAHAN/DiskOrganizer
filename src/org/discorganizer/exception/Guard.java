/**
 * 
 */
package org.discorganizer.exception;

import org.discorganizer.schema.Directory;

/**
 * @author Salih.KARAHAN
 *
 */
public final class Guard {

	public static Thrower NullCheck(Object value){
		return NullCheck(value, new NullReferanceException());
	}
	
	public static <TExceptionClass extends BaseException> Thrower NullCheck(Object value, TExceptionClass exception) {
		Thrower thrower = new Thrower();
		if (value == null) {
			thrower.HasException = true;
			thrower.AddException(exception);
		} else {
			thrower.HasException = false;
		}
		return thrower;
	}

}
