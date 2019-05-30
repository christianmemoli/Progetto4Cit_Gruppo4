package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;

public class ControllerPAGPRINC 
{
	
	@FXML private Button LOGOUT;
	public void initialize() throws Exception
	{
		LOGOUT.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
			
			Loggato.setVar(-1);
			System.exit(0);
			
		});
	}
	
}
