/**
 * 
 */
package org.discorganizer;

import org.discorganizer.exception.InvalidOperationSystemNameException;
import org.discorganizer.library.ioc.Container;
import org.discorganizer.manager.EnvironmentManager;
import org.discorganizer.manager.linux.LinuxIOManager;
import org.discorganizer.manager.mac.MacIOManager;
import org.discorganizer.manager.windows.WindowsIOManager;
import org.discorganizer.provider.contract.IEnvironmentProvider;
import org.discorganizer.provider.contract.IIOManager;
import org.discorganizer.schema.Directory;
import org.discorganizer.schema.Environment;
import org.discorganizer.schema.File;

/**
 * @author Salih.KARAHAN
 *
 */
public final class Setup {

	/**
	 * 
	 */
	private ApplicationState _state;

	/**
	 * Bu metot uygulama her çalýþtýðýnda bulunduðu disk üzerinde daha önce
	 * uygulamýnýn çalýþýp çalýþmadýðýný kontrol edecek Eðer eski kayýtlar varsa
	 * o kayýtlarý okuyorak sistemi açacak Eðer ilk defa açýlýyorsa sistem için
	 * gereklilikleri hazýrlayacak ve sistemi baþlatacak
	 * @throws InvalidOperationSystemNameException 
	 * @throws ReflectiveOperationException 
	 * @throws InstantiationException 
	 */
	public void CheckSystem() throws InvalidOperationSystemNameException, InstantiationException, ReflectiveOperationException {
		IEnvironmentProvider environmentProvider = Container.Resolve(IEnvironmentProvider.class);
		Environment environment = environmentProvider.GetEnvironment();

		RegisterSystemComponents(environment.GetEnvironmentType());

		_state = environment.CheckInitialDirectoryAndFiles();
	}

	/**
	 * @param getEnvironmentType
	 */
	private void RegisterSystemComponents(EnvironmentType environmentType) {
		// TODO Auto-generated method stub
		switch (environmentType) {
		case Windows: {
			Container.Register(IIOManager.class, WindowsIOManager.class);
			Container.Register(IEnvironmentProvider.class, EnvironmentManager.class);
		}
			break;
		case Mac: {
			Container.Register(IIOManager.class, MacIOManager.class);
			Container.Register(IEnvironmentProvider.class, EnvironmentManager.class);
		}
			break;
		case Linux: {
			Container.Register(IIOManager.class, LinuxIOManager.class);
			Container.Register(IEnvironmentProvider.class, EnvironmentManager.class);
		}
			break;

		default: {

		}
			break;
		}
	}

	/**
	 * Second Method
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * 
	 * @throws Exception
	 */
	public void Bootstrap() throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		switch (_state) {
		case NotInitialize: {
			Initialize();
		}
			break;
		case Broken: {

		}
			break;
		case Initialized: {
			Load();
		}
			break;

		default: {

		}
			break;
		}

	}

	/**
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	private void Initialize() throws InstantiationException, IllegalAccessException {
		IEnvironmentProvider environmentProvider = Container.Resolve(IEnvironmentProvider.class);
		IIOManager io = Container.Resolve(IIOManager.class);
		
		Directory systemDirectory = io.CreateDirectory(".Disk", environmentProvider.GetDiskRootPath());
		File settingsFile = io.CreateFile(".settings.json", Constants.DEFAULT_SETTINGS, systemDirectory.GetPath());
		// CategoryManager manager = Container.Resolve();
		// manager.CreateCategory(name);
	}

	/**
	 * For Load data
	 */
	private void Load() {

	}
}
