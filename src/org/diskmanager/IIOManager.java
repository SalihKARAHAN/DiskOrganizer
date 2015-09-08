/**
 * 
 */
package org.diskmanager;

/**
 * @author Salih.KARAHAN
 *
 */
public interface IIOManager {
	
	/**
	 * 
	 * @param name <i>directory name</i>
	 */
	void CreateDirectory(String name, String targetPath);
	
	/**
	 * 
	 * @param name file name
	 * @param data file content
	 */
	void CreateFile(String name, Object data, String targetPath); // 
	
	void MoveDirectory(String currentPath, String targetPath);
	
	void MoveFile(String currentPath, String targetPath);
	
	void CopyDirectory(String currentPath, String targetPath);
	
	void CopyFile(String currentPath, String targetPath);
	
	void DeleteDirectory(String path);
	
	void DeleteFile(String path);
	
}
