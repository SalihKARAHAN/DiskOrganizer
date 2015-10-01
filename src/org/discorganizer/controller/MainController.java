/**
 * 
 */
package org.discorganizer.controller;

/**
 * @author Salih.KARAHAN
 *
 */
public class MainController {
	@javafx.fxml.FXML
	private javafx.scene.control.TreeView<String> fxCategoryViewer;

	// the initialize method is automatically invoked by the FXMLLoader - it's
	// magic
	public void initialize() {
		loadTreeItems("initial 1", "initial 2", "initial 3");
	}

	public void loadTreeItems(String... rootItems) {
		javafx.scene.control.TreeItem<String> root = new javafx.scene.control.TreeItem<String>("Root Node");
		root.setExpanded(true);
		for (String itemString : rootItems) {
			root.getChildren().add(new javafx.scene.control.TreeItem<String>(itemString));
		}

		fxCategoryViewer.setRoot(root);
	}
}
