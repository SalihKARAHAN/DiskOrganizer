/**
 * 
 */
package org.discorganizer.manager;

import java.net.URL;
import java.security.CodeSource;
import java.util.Properties;

import org.discorganizer.exception.InvalidOperationSystemNameException;
import org.discorganizer.provider.contract.IEnvironmentProvider;
import org.discorganizer.schema.Environment;

/**
 * @author Salih.KARAHAN
 *
 */
public class EnvironmentManager implements IEnvironmentProvider {

	// ToDo#3@salih=> EnvironmentManager ile Environment nesnesi aras�ndaki i�
	// b�l�m� netle�tirilmeli
	private static Environment _environment;

	public Environment GetEnvironment() throws InvalidOperationSystemNameException {
		_environment = new Environment();
		return _environment;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.discorganizer.provider.contract.IEnvironmentProvider#GetDiskRootPath(
	 * )
	 */
	@Override
	public String GetDiskRootPath() {
		// TODO Auto-generated method stub
		String path = _environment.GetWorkingRootPath();
		return path;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.discorganizer.provider.contract.IEnvironmentProvider#MergePath(java.
	 * lang.String[])
	 */
	@Override
	public String MergePath(String... partialPaths) {
		// TODO Auto-generated method stub
		String seperator = _environment.GetPathSeperator();
		String mergedPath = String.join(seperator, partialPaths);
		return mergedPath;
	}

}
