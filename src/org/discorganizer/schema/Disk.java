package org.discorganizer.schema;

import java.util.ArrayList;

public class Disk {

	private static final Disk _disk;
	
	private static Directory _systemDirectory;
	private java.util.List<Category> _categoryDirectory;
	
	static{
		_disk = new Disk();
	}
	
	public Disk() {
		_categoryDirectory = new ArrayList<Category>();
	}
	
	//Todo@salih GetInstance metodu singleton olmalı!
//	public static Disk GetInstance(){
//		return _disk;
//	}

	public static void AddSystemDirectory(Directory systemDirectory) {
		_disk._systemDirectory = systemDirectory;
	}
	
	public static String GetDiskPath(){
		return _systemDirectory.GetPath();
	}
	
	public static void AddCategory(Category category){
		_disk._categoryDirectory.add(category);
	}

}
