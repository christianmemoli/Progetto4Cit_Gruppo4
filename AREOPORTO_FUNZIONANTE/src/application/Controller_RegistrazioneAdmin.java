package application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller_RegistrazioneAdmin 
{
	private StringProperty nome=new SimpleStringProperty();
	private StringProperty cognome=new SimpleStringProperty();
	private StringProperty codicefiscale=new SimpleStringProperty();
	@FXML TextField Nome;
	@FXML TextField Cognome;
	@FXML TextField CodiceFiscale;
	@FXML Button Okay;
	@FXML Button Annulla;
	@FXML TextArea feedBack;
	
	public void initialize() 
	{
		Nome.textProperty().bindBidirectional(nome);
		Cognome.textProperty().bindBidirectional(cognome);
		CodiceFiscale.textProperty().bindBidirectional(codicefiscale);
		Okay.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
				try 
				{
					Registrati();
				} 
				catch (CloneNotSupportedException e) 
				{
					e.printStackTrace();
				}
		});
		
		Annulla.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
				try 
				{
					Annulla();
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
		});
	}
	 @FXML
	public void Registrati() throws CloneNotSupportedException 
	{
		int code=Clienti.addAdmin(new Admin(nome.get(),cognome.get(),codicefiscale.get()));
		feedBack.setText("Username: "+ListaDatiAccesso.ricerca(code).getUsernameAdmin()+"  Password: "+ListaDatiAccesso.ricerca(code).getPassword()+"     premi annulla per tornare al Login");
	}
	@FXML
	public void Annulla() throws Exception 
	{
		REGISTRAZIONEADMIN_SCENE.closestage();
		new LOGIN_SCENE().start(REGISTRAZIONEADMIN_SCENE.getPrimaryStage());
	}
	
}
