/**
 * 
 */
package org.discorganizer;

/**
 * @author Salih.KARAHAN
 *
 */
public final class Constants {
	public static class Pages {
		public static final String LOGIN_PAGE = "LOGIN_PAGE";
		public static final String MAIN_PAGE = "MAIN_PAGE";
		public static final String TEST_PAGE = "TEST_PAGE";
	}

	public static final String DEFAULT_SETTINGS = "{}";

	public static class SystemProperty {
		/**
		 * Path'lerin hangi karakter ile ayrýldýðý bilgisini tutan anahtar
		 */
		public static final String PATH_SEPERATOR = "path.separator";
		
		/**
		 * Uygulamanýn çalýþtýðý kullanýcý dosyasý bilgisini tutan anahtar
		 */
		public static final String USER_DIR = "user.dir";
		
		/**
		 * Ýþletim sisteminin temprory dizin adresi bilgisini tutan anahtar
		 */
		public static final String TEMP_DIR = "java.io.tmpdir";
		
		/**
		 * Ýþletim sisteminin isim bilgisini tutan anahtar
		 */
		public static final String OS_NAME = "os.name"; //Windows 8.1
		
		/**
		 * Aktif kullanýcý dizin adresi bilgisini tutan anahtar
		 */
		public static final String USER_HOME = "user.home"; //C:\Users\Salih.KARAHAN
		
		/**
		 * File encoding bilgisini tutan anahtar
		 */
		public static final String FILE_ENCODING = "file.encoding"; // --> Cp1254
		
		/**
		 * Uygulamanýn çalýþtýðý dizin bilgisini tutan anahtar
		 */
		public static final String JAVA_CLASS_PATH = "java.class.path"; // --> R:\DevX\JavaGetEnvironmentInfo\bin
		
		/**
		 * Ýþletim sisteminde dizin adreslerini ayýran karakter bilgisini tutan anahtar
		 */
		public static final String FILE_SEPERATOR = "file.separator"; // \
		
		
		
	}
}
