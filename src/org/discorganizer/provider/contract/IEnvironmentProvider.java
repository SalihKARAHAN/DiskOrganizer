/**
 * 
 */
package org.discorganizer.provider.contract;

import org.discorganizer.exception.InvalidOperationSystemNameException;
import org.discorganizer.schema.Environment;

/**
 * @author Salih.KARAHAN
 *
 */
public interface IEnvironmentProvider {

	Environment GetEnvironment() throws InvalidOperationSystemNameException;

	/**
	 * @return
	 */
	String GetDiskRootPath();

	/**
	 * @param targetPath
	 * @param name
	 * @return
	 */
	String MergePath(String... partialPaths);
}
