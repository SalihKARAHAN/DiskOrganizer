/**
 * 
 */
package org.diskmanager.schema;

/**
 * @author Salih.KARAHAN
 *
 */
public class File {
	private String _name;
	private float _size;
	private String _extension;
	private Directory _currentDirectory;
	
	/**
	 * 
	 */
	public File() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param _name
	 * @param _size
	 * @param _extension
	 * @param _currentDirectory
	 */
	public File(String _name, float _size, String _extension, Directory _currentDirectory) {
		this._name = _name;
		this._size = _size;
		this._extension = _extension;
		this._currentDirectory = _currentDirectory;
	}


	public void Delete(){
		
	}	
}
