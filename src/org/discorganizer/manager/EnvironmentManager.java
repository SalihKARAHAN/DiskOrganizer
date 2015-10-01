/**
 * 
 */
package org.discorganizer.manager;

import org.discorganizer.provider.contract.IEnvironmentProvider;
import org.discorganizer.schema.Environment;

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
