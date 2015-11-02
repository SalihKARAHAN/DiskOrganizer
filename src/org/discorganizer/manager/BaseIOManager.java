/**
 * 
 */
package org.discorganizer.manager;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.discorganizer.library.ioc.Container;
import org.discorganizer.provider.contract.IEnvironmentProvider;
import org.discorganizer.provider.contract.IIOManager;
import org.discorganizer.schema.Directory;
import org.discorganizer.schema.File;

/**
 * @author Salih.KARAHAN
 *
 */
public abstract class BaseIOManager implements IIOManager {

	private final IEnvironmentProvider _environmentProvider;

	/**
	 * 
	 */
	protected BaseIOManager() {
		_environmentProvider = Container.Resolve(IEnvironmentProvider.class);
	}

	@Override
	public Directory CreateDirectory(String name, Directory ownderDirectory) {
		return this.CreateDirectory(name, ownderDirectory.GetPath());
	}

	@Override
	public Directory CreateDirectory(String name, String targetPath) {

		String mergedPath = _environmentProvider.MergePath(targetPath, name);
		java.io.File directory = new java.io.File(mergedPath);
		if (!directory.exists()) {
			directory.mkdirs();
		}

		Directory directoryInfo = new Directory(name, targetPath);
		return directoryInfo;
	}

	@Override
	public File CreateFile(String name, byte[] dataContent, String targetPath) {
		return null;
	}

	@Override
	public File CreateFile(String name, byte[] dataContent, Directory ownerDirectory) {
		File file = null;
		try {
			// bu kısmın başka bir sınıf içerisinde olması gerekiyor.
			java.io.File phsicalFile = new java.io.File(ownerDirectory.CreateInnerAddress(name));
			java.io.FileOutputStream fileOutputStream = new FileOutputStream(phsicalFile);
			if (phsicalFile.exists()) {
				phsicalFile.createNewFile();
			}
			fileOutputStream.write(dataContent);
			fileOutputStream.flush();// ?
			fileOutputStream.close();

			file = new File(name, 0, "uzantı", ownerDirectory);
			ownerDirectory.AddFile(file);
			// todo bu directory üst taraftan parametre olarak alınabilir.

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return file;
	}

	@Override
	public Directory MoveDirectory(String currentPath, String targetPath) {
		return null;
	}

	@Override
	public File MoveFile(String currentPath, String targetPath) {
		return null;
	}

	@Override
	public Directory CopyDirectory(String currentPath, String targetPath) {
		return null;
	}

	@Override
	public File CopyFile(String currentPath, String targetPath) {
		return null;
	}

	@Override
	public void DeleteDirectory(String path) {

	}

	@Override
	public void DeleteFile(String path) {

	}
}
