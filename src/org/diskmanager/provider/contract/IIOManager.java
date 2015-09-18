/**
 * 
 */
package org.diskmanager.provider.contract;

import org.diskmanager.schema.Directory;
import org.diskmanager.schema.File;

/**
 * @author Salih.KARAHAN
 *
 */
public interface IIOManager {
	
	/**
	 * 
	 * @param name <i>directory name</i>
	 */
	Directory CreateDirectory(String name, String targetPath);
	
	/**
	 * 
	 * @param name file name
	 * @param data file content
	 */
	File CreateFile(String name, Object data, String targetPath); // 
	
	Directory MoveDirectory(String currentPath, String targetPath);
	
	File MoveFile(String currentPath, String targetPath);
	
	Directory CopyDirectory(String currentPath, String targetPath);
	
	File CopyFile(String currentPath, String targetPath);
	
	void DeleteDirectory(String path);
	
	void DeleteFile(String path);
	
}
