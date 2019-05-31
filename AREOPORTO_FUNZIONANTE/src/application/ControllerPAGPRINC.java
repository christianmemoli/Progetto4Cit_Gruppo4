package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class ControllerPAGPRINC 
{
	
	@FXML private Button LOGOUT;
	@FXML private MenuItem visualizzaDati;
	public void initialize() throws Exception
	{
		LOGOUT.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
			
			Loggato.setVar(-1);
			System.exit(0);
			
		});
		visualizzaDati.addEventHandler(ActionEvent.ACTION, ActionEvent ->{
			PAGPRINC_SCENE.closestage();
			try {
				new VISUALIZZACLIENTE_SCENE().start(PAGPRINC_SCENE.getPrimaryStage());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
	}
	
}
