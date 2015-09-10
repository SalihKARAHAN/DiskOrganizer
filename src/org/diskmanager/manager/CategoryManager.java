/**
 * 
 */
package org.diskmanager.manager;

import org.diskmanager.provider.contract.IEnvironmentProvider;
import org.diskmanager.provider.contract.IIOManager;
import org.diskmanager.schema.Category;

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

	void CreateCategory(String name, Category parentCategory) {
		// ToDo@salih#1 Create Directory for Category
		if (parentCategory == null) {
			String rootPath = _environment.GetDiskRootPath();
			_io.CreateDirectory(name, rootPath);
		}else {
			_io.CreateDirectory(name, parentCategory.GetDirectory().GetPath());
		}
	}
}
