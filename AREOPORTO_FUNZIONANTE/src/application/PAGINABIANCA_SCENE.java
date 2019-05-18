package application;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PAGINABIANCA_SCENE extends Application 
{
	public static Stage PrimaryStage;
	@Override
	public void start(Stage primaryStage)
	{
		try 
		{
			PrimaryStage=primaryStage;
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("/Users/alessandrospinabelli/Desktop/AREOPORTO_FUNZIONANTE/src/application/PAGINABIANCA.fxml"));
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
	
	public static Stage getPrimaryStage() 
	{
		return PrimaryStage;
	}
}
