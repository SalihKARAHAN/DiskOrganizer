package org.discorganizer;

import java.io.IOException;

import org.discorganizer.view.Views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.AnchorPane;

public class Main extends Application {

	// private Environment _environment;
	private static Main _Application;
	private static Stage _stage;

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
		if (_Application == null) {
			_Application = this;
		}
	}

	public static Main GetClass() {
		return _Application;
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			_stage = primaryStage;
			Views.GetView(Constants.Pages.MAIN_PAGE);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			Setup setup = new Setup();
			setup.CheckSystem();
			setup.Bootstrap();
			launch(args);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void PageLoader(String fxmlPath, boolean resizable, String title,
			String... externalStyleSheetPathList) {
		try {
			Parent page = FXMLLoader.load(Main.GetClass().getClass().getResource(fxmlPath));
			Scene scene = new Scene(page);

			if (externalStyleSheetPathList != null) {
				for (int i = 0; i < externalStyleSheetPathList.length; i++) {
					String nextPath = externalStyleSheetPathList[i];
					scene.getStylesheets().add(Main.GetClass().getClass().getResource(nextPath).toExternalForm());
				}
			}
			_stage.setScene(scene);
			_stage.setResizable(resizable);
			_stage.setTitle(title);

			_stage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
