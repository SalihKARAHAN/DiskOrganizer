/**
 * 
 */
package org.diskmanager.schema;

/**
 * @author Salih.KARAHAN
 *
 */
public class Directory {
	private String _path;
	private String _name;
	private java.util.List<Directory> _childDirectoryList;
	/**
	 * @return
	 */
	public String GetPath() {
		// TODO Auto-generated method stub
		return _path;
	}
	
}
