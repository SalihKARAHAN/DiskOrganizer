/**
 * 
 */
package org.diskmanager.manager;

import org.diskmanager.provider.contract.IEnvironmentProvider;
import org.diskmanager.schema.Environment;

/**
 * @author Salih.KARAHAN
 *
 */
public class EnvironmentManager implements IEnvironmentProvider {
	
	public static Environment GetEnvironment(){
		return new Environment();
	}

	/* (non-Javadoc)
	 * @see org.diskmanager.provider.contract.IEnvironmentProvider#GetDiskRootPath()
	 */
	@Override
	public String GetDiskRootPath() {
		// TODO Auto-generated method stub
		return null;
	}

}
