package application;

import java.util.Date;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller_Registrazione
{
	@FXML TextField NOME;
	@FXML TextField COGNOME; 
	@FXML TextField CITTA; 
	@FXML TextField NAZIONE; 
	@FXML TextField GG; 
	@FXML TextField MM; 
	@FXML TextField YYYY; 
	@FXML Button REGISTRATI;
	@FXML Button ANNULLA;
	
	StringProperty nome=new SimpleStringProperty();
	StringProperty cognome=new SimpleStringProperty();
	StringProperty citta=new SimpleStringProperty();
	StringProperty nazione=new SimpleStringProperty();
	StringProperty giorno=new SimpleStringProperty();
	StringProperty mese=new SimpleStringProperty();
	StringProperty yyyy=new SimpleStringProperty();
	
	
	public void initialize()
	{
		NOME.textProperty().bindBidirectional(nome);
		COGNOME.textProperty().bindBidirectional(cognome);
		CITTA.textProperty().bindBidirectional(citta);
		NAZIONE.textProperty().bindBidirectional(nazione);
		GG.textProperty().bindBidirectional(giorno);
		MM.textProperty().bindBidirectional(mese);
		YYYY.textProperty().bindBidirectional(yyyy);
		REGISTRATI.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
			try 
			{
				Registrati(ActionEvent);
			} 
			catch (CloneNotSupportedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		ANNULLA.addEventHandler(ActionEvent.ACTION,ActionEvent -> 
		{
			try {
				Annulla(ActionEvent);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
	@FXML
	public void Registrati(ActionEvent event) throws Exception
	{
		PAGINABIANCA_SCENE pag=new PAGINABIANCA_SCENE();
		pag.start(REGISTRAZIONE_SCENE.PrimaryStage);
		if(Controller_PaginaBianca.getI()==1)
		{
			Clienti.addCliente(new Cliente(getNome(),getCognome() ,getCitta(),getNazione(),getData()));
		}
		
		REGISTRAZIONE_SCENE.closestage();
		new LOGIN_SCENE().start(REGISTRAZIONE_SCENE.getPrimaryStage());
	}
	@FXML
	public void Annulla(ActionEvent event) throws Exception
	{
		REGISTRAZIONE_SCENE.closestage();
		new LOGIN_SCENE().start(REGISTRAZIONE_SCENE.getPrimaryStage());
	}
	public String getNome() 
	{
		return nome.get();
	}

	public String getCognome() 
	{
		return cognome.get();
	}

	public String getCitta() 
	{
		return citta.get();
	}

	public String getNazione() 
	{
		return nazione.get();
	}

	public Date getData()
	{
		@SuppressWarnings("deprecation")
		Date data=new Date(Integer.parseInt(yyyy.get()),Integer.parseInt(mese.get()),Integer.parseInt(giorno.get()));
		return data;
	}
	
	
}
