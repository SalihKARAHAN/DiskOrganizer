package org.diskmanager.controller;

import org.diskmanager.Constants;
import org.diskmanager.view.Views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class AuthController {
	@FXML
	private Text actiontarget;

	@FXML
	protected void handleSubmitButtonAction(ActionEvent event) {
		actiontarget.setText("Sign in button pressed");
		Views.GetView(Constants.Pages.MAIN_PAGE);
	}
}
