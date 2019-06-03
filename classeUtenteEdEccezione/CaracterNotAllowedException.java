package application;

public class CaracterNotAllowedException extends Exception
{
	String s;

	public CaracterNotAllowedException(String s) 
	{
		super(s);
	}
	
}
