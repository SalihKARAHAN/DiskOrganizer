/**
 * 
 */
package org.discorganizer.manager;

import org.discorganizer.exception.Guard;
import org.discorganizer.provider.contract.IEnvironmentProvider;
import org.discorganizer.provider.contract.IIOManager;
import org.discorganizer.schema.Category;
import org.discorganizer.schema.Directory;
import org.discorganizer.schema.Disk;

/**
 * @author Salih.KARAHAN
 *
 */
public class CategoryManager {

	private final IIOManager _io;
	private final IEnvironmentProvider _environment;

	/**
	 * 
	 */
	public CategoryManager(IIOManager ioManager, IEnvironmentProvider environmentProvider) {
		// TODO Auto-generated constructor stub
		_io = ioManager;
		_environment = environmentProvider;
	}

	public Category CreateCategory(String name) throws Exception {
		return CreateCategory(name, null);
	}

	/**
	 * 
	 * @param name Name of Category
	 * @param parentCategory if category as e child category you must a define its parent category
	 * @return
	 * @throws Exception
	 */
	public Category CreateCategory(String name, Category parentCategory) throws Exception {
		Category category = new Category();
		category.SetName(name);
		
		Directory categoryDirectory = null;
		
		if (parentCategory == null) {
			categoryDirectory = _io.CreateDirectory(name, _environment.GetDiskRootPath());
		} else {
			categoryDirectory = _io.CreateDirectory(name, parentCategory.GetDirectory().GetPath());
		}
		
		Guard.NullCheck(categoryDirectory).Throw();
		category.SetDirectory(categoryDirectory);
		return category;
	}
}
