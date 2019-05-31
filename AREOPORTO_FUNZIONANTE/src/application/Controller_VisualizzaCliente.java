package application;

import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;

public class Controller_VisualizzaCliente 
{
	 @FXML TextField CODICECLIENTE;
	 @FXML Button Cerca;
	 @FXML Button Annulla;
	 @FXML TreeTableColumn TABELLA;
	 
	 private StringProperty codicecliente;
	 
	 
	 public void Initialize()throws Exception
	 {
		 CODICECLIENTE.textProperty().bindBidirectional(codicecliente);
		 
		 Cerca.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
			 CERCA();
			 
		 });
	 }
	 
	 public void CERCA()
	 {
		 Cliente c= new Cliente(Clienti.getCliente(Integer.parseInt(codicecliente.get())));
		 String text="Nome: "+c.getNome()+" Cognome: "+c.getCognome();
		 TABELLA.getCellData(c);
		 
	 }
	
}
