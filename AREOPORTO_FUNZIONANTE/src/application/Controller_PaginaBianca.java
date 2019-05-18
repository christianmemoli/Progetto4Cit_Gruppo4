package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller_PaginaBianca 
{
	@FXML Button si;
	@FXML Button no;
	@FXML String text;
	private static int i=0;
	private static void setI(int I)
	{
		i=I;
	}
	
	public void initialize()
	{
		text="ciaoo";
		si.addEventHandler(ActionEvent.ACTION,ActionEvent -> 
		{
			setI(1);
			PAGINABIANCA_SCENE.closestage();
		});
		no.addEventHandler(ActionEvent.ACTION,ActionEvent -> 
		{
			setI(2);
			PAGINABIANCA_SCENE.closestage();
		});
	}
	static int getI()
	{
		return i;
	}
}
