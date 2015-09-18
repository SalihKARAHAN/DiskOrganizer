/**
 * 
 */
package org.diskmanager.schema;

import org.diskmanager.ApplicationState;
import org.diskmanager.EnvironmentType;

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
//		return null;
		return ApplicationState.NotInitialize;
	}
	
	public EnvironmentType GetEnvironmentType() {
		return _environmentType;
	}
	
	
}
