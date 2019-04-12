package application;

public class Dati {

	private String username;
	private String password;
	
	public Dati (){}

	public Dati(String username ,String password)
	{
		this.username=username;
		this.password=password;
	}
	public Dati(Dati d)
	{
	
		this.username=d.username;
		this.password=d.password;
	} 
		
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}

	@Override
	public String toString() {
		return "Dati username=" + username + ", password=" + password ;
	}
	
}