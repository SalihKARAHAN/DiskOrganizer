/**
 * 
 */
package org.discorganizer.exception;

/**
 * @author Salih.KARAHAN
 *
 */
public final class Thrower {
	private java.util.List<java.lang.Exception> _exceptionList;
	
	public Thrower() {
		_exceptionList = new java.util.ArrayList<java.lang.Exception>();
	}

	public boolean HasException;
	
	public <TExceptionClass extends java.lang.Exception> void AddException(TExceptionClass exception) {
		boolean isAdded = _exceptionList.add((java.lang.Exception)exception);
	}

	public void Throw() throws Exception {
		java.lang.Exception exception = _exceptionList.get(0); //FIXME@salih=> get(0) yok ise ???
		if(exception == null){
			//TODO@salih=> burada hangi hatayı fırlatacağız :D
		}
		throw exception;
	}
	
	public <TExceptionClass extends java.lang.Exception> void Throw(TExceptionClass exceptionClass) throws TExceptionClass {
		throw exceptionClass;
	}
}
