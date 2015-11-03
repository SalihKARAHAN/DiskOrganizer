/**
 * 
 */
package org.discorganizer.controller;

import java.awt.ContainerOrderFocusTraversalPolicy;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonUtil;

import org.discorganizer.Main;
import org.discorganizer.library.ioc.Container;
import org.discorganizer.manager.CategoryManager;
import org.discorganizer.provider.contract.IEnvironmentProvider;
import org.discorganizer.provider.contract.IIOManager;
import org.discorganizer.schema.Category;
import org.discorganizer.schema.Disk;

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
	private final CategoryManager _categoryManager;

	/**
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * 
	 */
	public MainController() {
		_environmentProvider = Container.Resolve(IEnvironmentProvider.class);
		_io = Container.Resolve(IIOManager.class);
		_categoryManager = new CategoryManager(_io, _environmentProvider);
	}

	public void AddCategoryContextClick() {
		// System.out.println("AddCategoryContextClick");
		final javafx.stage.Stage dialog = new javafx.stage.Stage();
		dialog.initModality(javafx.stage.Modality.APPLICATION_MODAL); // Enum
		dialog.initOwner(Main.GetPrimaryScane()); 
		javafx.scene.layout.VBox dialogVbox = new javafx.scene.layout.VBox(20);
		dialogVbox.getChildren().add(new javafx.scene.text.Text("Category Name:"));
		
		javafx.scene.control.TextField textCategoryInput = new javafx.scene.control.TextField();
		dialogVbox.getChildren().add(textCategoryInput);
		
		javafx.scene.control.Button addCategoryButton = new javafx.scene.control.Button();
		addCategoryButton.setText("Add Category2");
		addCategoryButton.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				try {
					Category addedCategory = _categoryManager.CreateCategory(textCategoryInput.getText());
					Disk.AddCategory(addedCategory);
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				dialog.close();
			}
			
		});
		
		dialogVbox.getChildren().add(addCategoryButton);
		javafx.scene.Scene dialogScene = new javafx.scene.Scene(dialogVbox, 300, 200);
		dialog.setScene(dialogScene);
		dialog.show();
	}
}
