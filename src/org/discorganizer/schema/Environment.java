/**
 * 
 */
package org.discorganizer.schema;

import org.discorganizer.ApplicationState;
import org.discorganizer.Constants;
import org.discorganizer.EnvironmentType;
import org.discorganizer.exception.InvalidOperationSystemNameException;

/**
 * @author Salih.KARAHAN
 *
 */
public class Environment {
	private EnvironmentType _environmentType;
	private final String _fileSeperator;
	private final String _workingRootPath;

	/**
	 * @throws InvalidOperationSystemNameException
	 * 
	 */
	public Environment() throws InvalidOperationSystemNameException {
		// TODO Auto-generated constructor stub
		_environmentType = SetEnvironmentType();
		_fileSeperator = System.getProperty(Constants.SystemProperty.FILE_SEPERATOR);
		_workingRootPath = System.getProperty(Constants.SystemProperty.USER_DIR);
	}

	/**
	 * 
	 */
	public ApplicationState CheckInitialDirectoryAndFiles() {
		// TODO Auto-generated method stub
		// return null;

		// TODO #2: Test etme amacýyla þimdilik NotInitialize dönülmüþtür! Daha
		// sonra burada bazý kontroller sonucu uygulamanýn diskteki durumunu
		// çözümleyecek bir iþlemin gerçekleþtirilmesi gerekmektedir!
		return ApplicationState.NotInitialize;
	}

	public EnvironmentType GetEnvironmentType() {
		return _environmentType;
	}

	private EnvironmentType SetEnvironmentType() throws InvalidOperationSystemNameException {

		switch (System.getProperty(Constants.SystemProperty.OS_NAME)) {
		case "Windows 8.1":
			return EnvironmentType.Windows;
		default:
			throw new InvalidOperationSystemNameException();
		}
	}

	/**
	 * @return
	 */
	public String GetWorkingRootPath() {
		// TODO Auto-generated method stub
		return _workingRootPath;
	}

	public String GetPathSeperator(){
		return _fileSeperator;
	}
}
