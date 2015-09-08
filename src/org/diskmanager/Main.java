package org.diskmanager;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	
	private Environment _environment;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Setup setup = new Setup();
			setup.CheckSystem();
			
//			Button fxButtonLogin = new Button();
//			fxButtonLogin.setText("Login");
			
//			Parent root = FXMLLoader.load(getClass().getResource("view/LoginView.fxml"));
			Parent root = FXMLLoader.load(getClass().getResource("view/MainView.fxml"));
			
//			root.getChildren().add(fxButtonLogin);
			
			Scene scene = new Scene(root);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Disk Organizer");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
