/**
 * 
 */
package org.diskmanager;

/**
 * @author Salih.KARAHAN
 *
 */
public class Setup {
	/**
	 * Bu metot uygulama her çalýþtýðýnda bulunduðu disk üzerinde daha önce uygulamýnýn çalýþýp çalýþmadýðýný kontrol edecek
	 * Eðer eski kayýtlar varsa o kayýtlarý okuyorak sistemi açacak
	 * Eðer ilk defa açýlýyorsa sistem için gereklilikleri hazýrlayacak ve sistemi baþlatacak
	 */
	void CheckSystem(){
		EnvironmentCollector.GetEnvironment();
		
	}
}
