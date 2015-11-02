/**
 * 
 */
package org.discorganizer.controller;

import java.awt.ContainerOrderFocusTraversalPolicy;

import org.discorganizer.Main;
import org.discorganizer.library.ioc.Container;
import org.discorganizer.provider.contract.IEnvironmentProvider;
import org.discorganizer.provider.contract.IIOManager;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

/**
 * @author Salih.KARAHAN
 *
 */
public class MainController {
	private final IEnvironmentProvider _environmentProvider;
	private final IIOManager _io;

	/**
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * 
	 */
	public MainController() {
		_environmentProvider = Container.Resolve(IEnvironmentProvider.class);
		_io = Container.Resolve(IIOManager.class);
	}

	public void AddCategoryContextClick() {
		// System.out.println("AddCategoryContextClick");
		final javafx.stage.Stage dialog = new javafx.stage.Stage();
		dialog.initModality(javafx.stage.Modality.APPLICATION_MODAL);
		dialog.initOwner(Main.GetPrimaryScane());
		javafx.scene.layout.VBox dialogVbox = new javafx.scene.layout.VBox(20);
		dialogVbox.getChildren().add(new javafx.scene.text.Text("This is a Dialog"));
		javafx.scene.Scene dialogScene = new javafx.scene.Scene(dialogVbox, 300, 200);
		dialog.setScene(dialogScene);
		dialog.show();
	}
}
