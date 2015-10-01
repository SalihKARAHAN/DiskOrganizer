/**
 * 
 */
package org.discorganizer.manager;

import org.discorganizer.provider.contract.IIOManager;
import org.discorganizer.schema.Directory;
import org.discorganizer.schema.File;

/**
 * @author Salih.KARAHAN
 *
 */
public abstract class BaseIOManager implements IIOManager {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.diskmanager.provider.contract.IIOManager#CreateDirectory(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	public Directory CreateDirectory(String name, String targetPath) {
		// TODO Auto-generated method stub
		
		Directory directory = new Directory(name,targetPath);
		return directory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.diskmanager.provider.contract.IIOManager#CreateFile(java.lang.String,
	 * java.lang.Object, java.lang.String)
	 */
	@Override
	public File CreateFile(String name, Object data, String targetPath) {
		// TODO Auto-generated method stub
		File file = new File();
		return file;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.diskmanager.provider.contract.IIOManager#MoveDirectory(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	public Directory MoveDirectory(String currentPath, String targetPath) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.diskmanager.provider.contract.IIOManager#MoveFile(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public File MoveFile(String currentPath, String targetPath) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.diskmanager.provider.contract.IIOManager#CopyDirectory(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	public Directory CopyDirectory(String currentPath, String targetPath) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.diskmanager.provider.contract.IIOManager#CopyFile(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public File CopyFile(String currentPath, String targetPath) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.diskmanager.provider.contract.IIOManager#DeleteDirectory(java.lang.
	 * String)
	 */
	@Override
	public void DeleteDirectory(String path) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.diskmanager.provider.contract.IIOManager#DeleteFile(java.lang.String)
	 */
	@Override
	public void DeleteFile(String path) {
		// TODO Auto-generated method stub

	}

}
