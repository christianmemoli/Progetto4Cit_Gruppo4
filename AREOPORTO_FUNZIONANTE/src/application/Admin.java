package application;


public class Admin extends Utente
{
		protected String username;//autogen
		protected String password;//autogen
		protected String codeFiscale;
		private static Integer count=1110;
		private static Integer cont=0;
		
		public Admin() 
		{
			super();
		}
		
		public Admin(String nome, String cognome, String codeFiscale) 
		{
			super(nome,cognome);
			password=codeFiscale.substring(0,4)+count;
			String flag=password;
			
			for(int i=0;i<password.length()/2;i++)
			{
				password=password+(flag.substring(i,i)+flag.substring(password.length()-i,password.length()-i));
			}
			this.codeFiscale=codeFiscale;
			
			username=nome.substring(1,1)+cognome+cont;
			count++;
			cont++;
		}
		
		public Admin(Admin a) 
		{
			super(a.nome, a.cognome);
			this.username=a.username;
			this.password=a.password;
			this.codeFiscale=a.codeFiscale;
			
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

		public String getCodeFiscale() 
		{
			return codeFiscale;
		}

		public void setCodeFiscale(String codeFiscale) 
		{
			this.codeFiscale = codeFiscale;
		}
		@Override
		public Admin Clone() throws CloneNotSupportedException
		{
			Admin a=(Admin) super.clone();
			return a;
		}
	}
