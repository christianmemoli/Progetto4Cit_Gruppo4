package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerPAGPRINC 
{
	@FXML private Button visualizzaDati;
	@FXML private Button eliminaAccount;
	@FXML private Button ricercaVoli;
	@FXML private Button visualizzaPrenotazioni;
	@FXML private Button aggiungiPrenotazioni;
	@FXML private Button eliminaPrenotazioni;
	@FXML private Button LOGOUT;
	public void initialize() throws Exception
	{
		LOGOUT.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
			
			Loggato.setVar(-1);
			return ;
			
		});
		
		visualizzaDati.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
			
			PAGPRINC_SCENE.closestage();
			try {
				new VISUALIZZACLIENTE_SCENE().start(PAGPRINC_SCENE.getPrimaryStage());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});

		eliminaAccount.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
	
	
	
		});

		ricercaVoli.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
	
	
	
		});
		
		visualizzaPrenotazioni.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
			
			
			
		});

		aggiungiPrenotazioni.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
	
	
	
		});

		eliminaPrenotazioni.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
	
	
	
		});
	}
}
