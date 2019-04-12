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
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ControllerLogin 
{
	@FXML TextField USERNAME;
	@FXML PasswordField PASSWORD; 
	@FXML Button accesso;
	@FXML Button registrazione;
	StringProperty username=new SimpleStringProperty();
	StringProperty password=new SimpleStringProperty();
	LoGiN stage=new LoGiN();
	
	public void initialize()
	{
		USERNAME.textProperty().bindBidirectional(username);
		PASSWORD.textProperty().bindBidirectional(password);
		accesso.addEventHandler(MouseEvent.MOUSE_CLICKED,this::Login);
	}
	
	public void Login(MouseEvent event)
	{
		getUsername();
		getPassword();
	}
	
	public void Registrazione(MouseEvent event) throws Exception
	{
		ReGiStRaZiOnE r = new ReGiStRaZiOnE();
		LoGiN.closestage();
		r.start(LoGiN.getPrimaryStage());
	}
	
	public void getUsername() 
	{
		System.out.println(username.get());
	}

	public void getPassword() 
	{
		System.out.println(password.get());
	}
	
	
}
