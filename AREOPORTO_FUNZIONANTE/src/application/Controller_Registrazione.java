package application;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.TextFlow;
import javafx.stage.Popup;

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
	@FXML TextArea feedBack;
	@FXML Button REGISTRATIADMIN;
	
	StringProperty nome=new SimpleStringProperty();
	StringProperty cognome=new SimpleStringProperty();
	StringProperty citta=new SimpleStringProperty();
	StringProperty nazione=new SimpleStringProperty();
	StringProperty giorno=new SimpleStringProperty();
	StringProperty mese=new SimpleStringProperty();
	StringProperty yyyy=new SimpleStringProperty();
	StringProperty FeedBack =new SimpleStringProperty();
	
	
	public void initialize()
	{
		NOME.textProperty().bindBidirectional(nome);
		COGNOME.textProperty().bindBidirectional(cognome);
		CITTA.textProperty().bindBidirectional(citta);
		NAZIONE.textProperty().bindBidirectional(nazione);
		GG.textProperty().bindBidirectional(giorno);
		MM.textProperty().bindBidirectional(mese);
		YYYY.textProperty().bindBidirectional(yyyy);
		feedBack.textProperty().bindBidirectional(FeedBack);
		
		REGISTRATI.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
			try 
			{
				Registrati();
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
				Annulla();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		REGISTRATIADMIN.addEventHandler(ActionEvent.ACTION,ActionEvent ->{
			
		});
	}
	@FXML
	public void Registrati() throws Exception
	{
			int code=Clienti.addCliente(new Cliente(getNome(),getCognome() ,getCitta(),getNazione(),getData()));
			String text=("username: "+ListaDatiAccesso.ricerca(code).getUsernameCliente()+"   "+"password: "+ListaDatiAccesso.ricerca(code).getPassword()+"        Premi annulla ed effettua il login");
			feedBack.setText(text);
	}
	@FXML
	public void Annulla() throws Exception
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
	
	@FXML
	public void RegistratiADMIN() throws Exception
	{
		REGISTRAZIONE_SCENE.closestage();
		new REGISTRAZIONEADMIN_SCENE().start(REGISTRAZIONE_SCENE.getPrimaryStage());
	}
}
