/**
 * 
 */
package org.discorganizer.view;

import java.util.HashMap;

import org.discorganizer.Constants;
import org.discorganizer.Main;
import org.discorganizer.schema.View;

/**
 * @author Salih.KARAHAN
 *
 */
public final class Views {
	private static java.util.Map<String, View> _views;

	/**
	 * 
	 */
	static {
		_views = new HashMap<String, View>();
		//_views.put(Constants.Pages.LOGIN_PAGE, new View("view/LoginView.fxml", false, "Disk Manager - Login"));
		_views.put(Constants.Pages.MAIN_PAGE, new View("view/MainView.fxml", true, "Disk Manager - Login"));
		_views.put(Constants.Pages.TEST_PAGE, new View("view/TestView.fxml", false, "Disk Manager - Loading"));
	}

	public static void GetView(String viewName) {
		View view = _views.get(viewName);
		Main.PageLoader(view.GetPath(), view.IsResizable(), view.GetTitle(), view.GetStyleSheetPathList());
	}
}
