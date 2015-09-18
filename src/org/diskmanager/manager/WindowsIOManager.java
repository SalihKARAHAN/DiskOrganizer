/**
 * 
 */
package org.diskmanager.manager;

import org.diskmanager.schema.File;

/**
 * @author Salih.KARAHAN
 *
 */
public class WindowsIOManager extends BaseIOManager {
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.diskmanager.manager.BaseIOManager#CreateFile(java.lang.String,
	 * java.lang.Object, java.lang.String)
	 */
	@Override
	public File CreateFile(String name, Object data, String targetPath) {
		// TODO Auto-generated method stub
		return super.CreateFile(name, data, targetPath);
	}
}
