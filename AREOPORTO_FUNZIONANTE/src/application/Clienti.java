package application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Clienti implements Serializable
{
	private static Integer matrice=0,LastCliCode;
	
	private static HashMap <Integer,Utente> clienti=new HashMap<Integer,Utente>();
	
	public Clienti() {};
	
	public static Integer getNumeroClienti()
	{
		return clienti.size();
	}
	
	private static Integer generatecode()
	{
		Integer i=matrice;
		matrice++;
		return i;
	}
	
	public static Integer addCliente(Cliente c) throws CloneNotSupportedException
	{
			Cliente cl=new Cliente((Cliente) c.Clone());
			
			c.setCode(generatecode());
			LastCliCode=c.getCode();
			clienti.put(c.getCode(),new Cliente(c));
		
			if(clienti.get(c.getCode())!=null)
			{
				DatiAccesso d=new DatiAccesso(c.getCode(),(String)RandomPassword.generate());
				ListaDatiAccesso.addCliente(c.getCode(),d);
				return c.getCode();
			}
			else
			{
				return 0;
			}
	}
		
	public static Integer addAdmin(Admin a) throws CloneNotSupportedException
	{
			Admin c=new Admin((Admin) a.Clone());
			
			c.setCode(generatecode());
			clienti.put(c.getCode(),new Admin(c));
		
			if(clienti.get(c.getCode())!=null)
			{
				ListaDatiAccesso.addAdmin(c.getCode(),new DatiAccesso(a.getUsername(),a.getPassword()));
				return c.getCode();
			}
			else
			{
				return 0;
			}
	}
		
	
	public static Integer deleteCliente(Integer code)
	{
		clienti.remove(code);
		
		if(clienti.get(code)==null)
		{
			ListaDatiAccesso.deleteUtenti(code);
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public static Integer getLastCliCode()
	{
		return LastCliCode;
	}
	
	public static Cliente[] getListaClienti()
	{
		Cliente [] Clienti=new Cliente[clienti.size()];
		for(Integer i=0,code=0;code<matrice;code++)
		{
			if(clienti.get(code)!=null)
			{
				Clienti[i]=new Cliente((Cliente) clienti.get(code));
				i++;
			}
		}
		return Clienti;
	}
	
	public static Cliente getCliente(Integer code)
	{
		if(clienti.get(code)!=null)
		{
			return (Cliente) clienti.get(code);
		}
		else
		{
			return null;
		}
	}
	
	public static boolean modificaCliente(Integer code, String nome, String cognome, String nazioneNascita, String cittanascita, Date dataNascita)
	{
		if(clienti.containsKey(code))
		{
			if(nome!=null)
			{
				clienti.get(code).setNome(nome);
			}
			
			if(cognome!=null)
			{
				clienti.get(code).setCognome(cognome);
			}
			
			if(nazioneNascita!=null)
			{
				((Cliente) clienti.get(code)).setNazioneNascita(nazioneNascita);
			}
			
			if(cittanascita!=null)
			{
				((Cliente) clienti.get(code)).setCittanascita(cittanascita);
			}
			
			if(dataNascita!=null)
			{
				((Cliente) clienti.get(code)).setDataNascita(dataNascita);
			}
			
			return true;
		}
		
		
		else 
		{
			return false;
		}
	}
	
	public static void salvaClienti() throws java.io.IOException
	{
		ObjectOutputStream stream=new ObjectOutputStream(new FileOutputStream("clienti.bin"));
		stream.writeObject(clienti);
		stream.close();
	}
	
	@SuppressWarnings("unchecked")
	public static void caricaClienti() throws java.io.IOException
	{
		ObjectInputStream stream = new ObjectInputStream(new FileInputStream("clienti.bin"));
		
		try
		{
			
			clienti= (HashMap<Integer, Utente>)stream.readObject();
			
		}
		
		catch (ClassNotFoundException e)
		{
			
		}
		finally{
				stream.close();
		}
	}
	 
}

