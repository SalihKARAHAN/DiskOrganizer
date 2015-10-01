package org.discorganizer.controller;

import org.discorganizer.Constants;
import org.discorganizer.view.Views;

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
