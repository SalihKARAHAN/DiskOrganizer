/**
 * 
 */
package org.discorganizer.schema;

import org.discorganizer.ApplicationState;
import org.discorganizer.EnvironmentType;

/**
 * @author Salih.KARAHAN
 *
 */
public class Environment {
	private EnvironmentType _environmentType;
	// private String

	/**
	 * 
	 */
	public Environment() {
		// TODO Auto-generated constructor stub
		this._environmentType = EnvironmentType.Windows;
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

}
