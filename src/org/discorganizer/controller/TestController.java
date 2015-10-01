/**
 * 
 */
package org.discorganizer.controller;

import java.awt.Container;

import org.discorganizer.provider.contract.IEnvironmentProvider;
import org.discorganizer.provider.contract.IIOManager;

import javafx.scene.control.Label;

/**
 * @author Salih.KARAHAN
 *
 */
public class TestController {
	
	@javafx.fxml.FXML 
	private Label fxLabelProcess;
	
	private IEnvironmentProvider _environmentProvider;
	private IIOManager _ioManager;
	
	/**
	 * 
	 */
	public TestController() {
//		_environmentProvider = Container.
	}

	
	public void initialize(){
//		fxLabelProcess = new Label("Setted Label");
//		fxLabelProcess.setText("initialize runned");
		
	}
	
//	@javafx.fxml.FXML 
	public void SetProgress(){
		fxLabelProcess.setText("SettedProcess");
	}
}
