package application;
	
import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;


public class LoGiN extends Application
{
	public static Stage PrimaryStage;
	@Override
	public void start(Stage primaryStage) throws Exception {
		try 
		{
		    PrimaryStage=primaryStage;
			Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			PrimaryStage.setScene(scene);
			PrimaryStage.show();
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public static void closestage()
	{
		PrimaryStage.close();
	}

	public static Stage getPrimaryStage() {
		return PrimaryStage;
	}

	public static void main(String[] args) 
	{
		launch(args);
	}
}

