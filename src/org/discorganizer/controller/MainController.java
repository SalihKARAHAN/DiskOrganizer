/**
 * 
 */
package org.discorganizer.controller;

import java.awt.ContainerOrderFocusTraversalPolicy;

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
	
	public void AddCategoryContextClick(){
		System.out.println("AddCategoryContextClick");
	}
}
