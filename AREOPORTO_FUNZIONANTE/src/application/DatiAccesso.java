package application;


public class DatiAccesso 
{

		private int username;
		private String password;
		private String Username;
		
		public DatiAccesso  (){}

		public DatiAccesso (int username ,String password)
		{
			this.username=username;
			this.password=password;
			this.Username=null;
		}
		public DatiAccesso (String username ,String password)
		{
			this.Username=username;
			this.password=password;
			this.username=-1;
		}
		public DatiAccesso (DatiAccesso d)
		{
			this.username=d.username;
			this.password=d.password;
			this.Username=d.Username;
		} 
			
		public int getUsernameCliente() 
		{
			return username;
		}
		public String getUsernameAdmin() 
		{
			return Username;
		}
		public void setUsernameCliente(int username) 
		{
			this.username = username;
		}
		public void setUsernameAdmin(String username) 
		{
			this.Username = username;
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
			return "Dati username=" + username+ ", password=" + password ;
		}
	}
		
