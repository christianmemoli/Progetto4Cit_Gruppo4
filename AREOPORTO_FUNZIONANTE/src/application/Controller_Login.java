package application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller_Login 
{
	@FXML TextField USERNAME;
	@FXML PasswordField PASSWORD; 
	@FXML Button Accesso;
	@FXML Button registrazione;
	StringProperty username=new SimpleStringProperty();
	StringProperty password=new SimpleStringProperty();
	
	public void initialize() throws Exception
	{
		USERNAME.textProperty().bindBidirectional(username);
		PASSWORD.textProperty().bindBidirectional(password);
		
		Accesso.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
				try 
				{
					Login(ActionEvent);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
		});
		registrazione.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
			try 
			{
				Registrazione(ActionEvent);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
	});
	}
	@FXML
	public void Login(ActionEvent event) throws Exception
	{
		DatiAccesso d=new DatiAccesso(getUsername(),getPassword());
		if((d.getUsernameCliente())!=0)
		{
			if(ListaDatiAccesso.ricerca(Integer.parseInt(getUsername())).equals(d))
					System.out.println("bella");
					Loggato.setVar(2);
					System.out.println("bella");
					LOGIN_SCENE.closestage();
					PAGPRINC_SCENE p=new PAGPRINC_SCENE();
					p.start(LOGIN_SCENE.getPrimaryStage());
			
		}
		else
		{
			if(ListaDatiAccesso.ricerca(Integer.parseInt(getUsername())).getUsernameAdmin().equals(d.getUsernameAdmin()))
			{
				if(ListaDatiAccesso.ricerca(Integer.parseInt(getUsername())).getPassword().equals(d.getPassword()))
				{
					Loggato.setVar(1);				
				}
			}
		}
	}
	@FXML
	public void Registrazione(ActionEvent event) throws Exception
	{
		LOGIN_SCENE.closestage();
		new REGISTRAZIONE_SCENE().start(LOGIN_SCENE.getPrimaryStage());
	}
	
	public String getUsername() 
	{
		return username.get();
	}

	public String getPassword() 
	{
		return password.get();
	}
	
	
}
