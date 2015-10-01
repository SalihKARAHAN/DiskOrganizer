/**
 * 
 */
package org.discorganizer.schema;

/**
 * @author Salih.KARAHAN
 *
 */
public class Category {
	private String _name;
	private Directory _directory;
	private Category _parentCategory;
	private java.util.List<Category> _childCategoryList;

	public String GetName() {
		return _name;
	}

	public Directory GetDirectory() {
		return _directory;
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
