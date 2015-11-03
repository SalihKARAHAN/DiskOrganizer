package org.discorganizer.schema;

public class Disk {

	private static final Disk _disk;
	
	private static Directory _systemDirectory;
	private java.util.List<Directory> _categoryDirectory;
	
	static{
		_disk = new Disk();
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

}
