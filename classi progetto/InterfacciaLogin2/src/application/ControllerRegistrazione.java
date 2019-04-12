package application;

import java.util.Date;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ControllerRegistrazione 
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
	
	ReGiStRaZiOnE registrazione=new ReGiStRaZiOnE();
	
	public void initialize()
	{
		NOME.textProperty().bindBidirectional(nome);
		COGNOME.textProperty().bindBidirectional(cognome);
		CITTA.textProperty().bindBidirectional(citta);
		NAZIONE.textProperty().bindBidirectional(nazione);
		GG.textProperty().bindBidirectional(giorno);
		MM.textProperty().bindBidirectional(mese);
		YYYY.textProperty().bindBidirectional(yyyy);
		REGISTRATI.addEventHandler(MouseEvent.MOUSE_CLICKED,event -> {
			try {
				Registrati(event);
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
	
	public void Registrati(MouseEvent event) throws CloneNotSupportedException
	{
		Cliente c=new Cliente(getNome(),getCognome() ,getCitta(),getNazione(),getData());
		Clienti hash=new Clienti();
		hash.addCliente(c);
		
	}
	public void Annulla(MouseEvent event) throws Exception
	{
		ReGiStRaZiOnE registrazione=new ReGiStRaZiOnE();
		registrazione.closestage();
		LoGiN stage=new LoGiN();
		stage.start(registrazione.getPrimaryStage());
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
