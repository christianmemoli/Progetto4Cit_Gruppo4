package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VISUALIZZACLIENTE_SCENE extends Application 
{
	public static Stage PrimaryStage;
	@Override
	public void start(Stage primaryStage) throws Exception {
		try 
		{
		    PrimaryStage=primaryStage;
			Parent root = FXMLLoader.load(getClass().getResource("VisualizzaCliente.fxml"));
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
	public static void main(String[] args) 
	{
		launch(args);
	}
}
