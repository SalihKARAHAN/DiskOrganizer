/**
 * 
 */
package org.discorganizer.schema;

import org.discorganizer.exception.Guard;
import org.discorganizer.exception.Thrower;

/**
 * @author Salih.KARAHAN
 *
 */
public class Category {
	private String _name; // kategorinin ismi
	private Directory _directory; // kategorinin temsil ettiği klasör
	private Category _parentCategory; // kategorinin evebeyn kategorisi
	private java.util.List<Category> _childCategoryList; // kategorinin çocuk kategorileri
	
	public String GetName(){
		return this._name;
	}

	public Directory GetDirectory() throws Exception {
		Guard.NullCheck(_directory).Throw();
		return this._directory;
	}
	
	public void SetDirectory(Directory directory){
		if(_directory == null){
			_directory = directory;
		}
	}
	
	public void SetName(String categoryName){
		this._name = categoryName;
	}

	public boolean HasParent() {
		return _parentCategory != null;
	}

	public Category GetParent() {
		return _parentCategory;
	}

	public boolean HasChild() {
		return !_childCategoryList.isEmpty();
	}

	public java.util.List<Category> GetChildren() {
		return _childCategoryList;
	}
}
