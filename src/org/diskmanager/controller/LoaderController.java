/**
 * 
 */
package org.diskmanager.controller;

import javafx.scene.control.Label;

/**
 * @author Salih.KARAHAN
 *
 */
public class LoaderController {
	
	@javafx.fxml.FXML 
	public Label fxLabelProcess;

	
	public void initialize(){
//		fxLabelProcess = new Label("Setted Label");
//		fxLabelProcess.setText("initialize runned");
		
	}
	
//	@javafx.fxml.FXML 
	public void SetProgress(){
		fxLabelProcess.setText("SettedProcess");
	}
}
