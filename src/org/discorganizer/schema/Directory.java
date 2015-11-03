/**
 * 
 */
package org.discorganizer.schema;

import java.awt.Container;
import java.util.ArrayList;

import org.discorganizer.exception.InvalidOperationSystemNameException;
import org.discorganizer.provider.contract.IEnvironmentProvider;

/**
 * @author Salih.KARAHAN
 *
 */
public class Directory {
	private static IEnvironmentProvider _EnvironmentProvider;
	private static Environment _Environment;
	private String _path;
	private String _name;
	private java.util.List<Directory> _childDirectoryList;
	private java.util.List<File> _fileList;

	static {
		_EnvironmentProvider = org.discorganizer.library.ioc.Container.Resolve(IEnvironmentProvider.class);
		try {
			_Environment = _EnvironmentProvider.GetEnvironment();
		} catch (InvalidOperationSystemNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	public Directory(String name, String targetPath) {
		this._name = name;
		this._path = targetPath;
		_childDirectoryList = new ArrayList<Directory>();
		_fileList = new ArrayList<File>();
	}

	/**
	 * @return absolute path to this path
	 */
	public String GetPath() {
		// TODO Auto-generated method stub
		return this._path + _Environment.GetPathSeperator() + this._name;
	}

	/**
	 * Verilen dosya ismiyle klasör içinde bir dosya adresi verir.
	 * @param fileName
	 * @return
	 */
	public String CreateInnerAddress(String fileName) {
		return this.GetPath() + _Environment.GetPathSeperator() + fileName;
	}

	public void AddFile(File file){
		_fileList.add(file); // todo: burada hata kontrolü ve hata mesajı gösterimi gibi birşey yapılmalı.
	}

	public void AddChildDirectory(Directory directory) {
		_childDirectoryList.add(directory);
	}
}
