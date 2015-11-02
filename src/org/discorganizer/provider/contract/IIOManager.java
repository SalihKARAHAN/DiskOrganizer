/**
 * 
 */
package org.discorganizer.provider.contract;

import org.discorganizer.schema.Directory;
import org.discorganizer.schema.File;

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
	
	Directory CreateDirectory(String name, Directory ownderDirectory);
	
	/**
	 * 
	 * @param name file name
	 * @param data file content
	 */
	File CreateFile(String name, byte[] dataContent, String targetPath);
	
	File CreateFile(String name, byte[] dataContent, Directory ownerDirectory);

	Directory MoveDirectory(String currentPath, String targetPath);
	
	File MoveFile(String currentPath, String targetPath);
	
	Directory CopyDirectory(String currentPath, String targetPath);
	
	File CopyFile(String currentPath, String targetPath);
	
	void DeleteDirectory(String path);
	
	void DeleteFile(String path);
	
}
