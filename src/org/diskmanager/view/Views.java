/**
 * 
 */
package org.diskmanager.view;

import java.util.ArrayList;
import java.util.HashMap;

import org.diskmanager.Constants;
import org.diskmanager.Main;
import org.diskmanager.schema.View;

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
		// TODO Auto-generated constructor stub
		_views = new HashMap<String, View>();
		_views.put(Constants.Pages.LOGIN_PAGE, new View("view/LoginView.fxml", false, "Disk Manager - Login",
				"view/LoginView.css", "application.css"));
		_views.put(Constants.Pages.MAIN_PAGE, new View("view/MainView.fxml", false, "Disk Manager - Login", null));
	}

	public static void GetView(String viewName) {
		View view = _views.get(viewName);
		Main.PageLoader(view.GetPath(), view.IsResizable(), view.GetTitle(), view.GetStyleSheetPathList());
	}
}
