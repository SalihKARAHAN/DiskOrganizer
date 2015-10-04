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
	 * Bu metot uygulama her �al��t���nda bulundu�u disk �zerinde daha �nce
	 * uygulam�n�n �al���p �al��mad���n� kontrol edecek E�er eski kay�tlar varsa
	 * o kay�tlar� okuyorak sistemi a�acak E�er ilk defa a��l�yorsa sistem i�in
	 * gereklilikleri haz�rlayacak ve sistemi ba�latacak
	 * 
	 * @throws InvalidOperationSystemNameException
	 */
	public void CheckSystem() throws InvalidOperationSystemNameException {
		IEnvironmentProvider environmentProvider = Container.Resolve(IEnvironmentProvider.class,
				EnvironmentManager.class);
		// Environment environment = new Environment();
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
	 * 
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * 
	 * @throws Exception
	 */
	public void Bootstrap() {
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
	private void Initialize() {
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
