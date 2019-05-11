package application;


public class DatiAccesso 
{

		private String username;
		private String password;
		
		public DatiAccesso  (){}

		public DatiAccesso (String username ,String password)
		{
			this.username=username;
			this.password=password;
		}
		public DatiAccesso (DatiAccesso d)
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
		public String toString() 
		{
			return "Dati username=" + username + ", password=" + password ;
		}
	}
		
