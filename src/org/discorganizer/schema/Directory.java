/**
 * 
 */
package org.discorganizer.schema;

/**
 * @author Salih.KARAHAN
 *
 */
public class Directory {
	private String _path;
	private String _name;
	private java.util.List<Directory> _childDirectoryList;
	private java.util.List<File> _fileList;
	
	/**
	 * 
	 */
	public Directory(String name,String targetPath) {
		
	}
	
	/**
	 * @return
	 */
	public String GetPath() {
		// TODO Auto-generated method stub
		return _path;
	}
	
}
