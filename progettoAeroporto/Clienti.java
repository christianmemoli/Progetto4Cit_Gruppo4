package progettoAeroporto;

import java.util.*;

public class Clienti 
{
	private static Integer matrice=0;
	private HashMap <Integer,Utente> clienti=new HashMap<Integer,Utente>();
	public Clienti() {};
	public Integer getNumeroClienti()
	{
		return clienti.size();
	}
	private static Integer generatecode()
	{
		Integer i=matrice;
		matrice++;
		return i;
	}
	public Integer addCliente(Utente u) throws CloneNotSupportedException
	{
		if(u instanceof Cliente)
		{
			Cliente c=new Cliente((Cliente) u.clone());
			
			c.setCode(generatecode());
			clienti.put(c.getCode(),new Cliente(c));
		
			if(clienti.get(c.getCode())!=null)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		
		else
		{
			Admin c=new Admin((Admin) u.clone());
			
			c.setCode(generatecode());
			clienti.put(c.getCode(),new Admin(c));
		
			if(clienti.get(c.getCode())!=null)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		
	}
	
	public Integer deleteCliente(Integer code)
	{
		clienti.remove(code);
		
		if(clienti.get(code)==null)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public Cliente[] getListaClienti()
	{
		Cliente [] Clienti=new Cliente[clienti.size()];
		for(Integer i=0,code=0;code<matrice;code++)
		{
			if(clienti.get(code)!=null)
			{
				Clienti[i]=new Cliente(clienti.get(code));
				i++;
			}
		}
		return Clienti;
	}
	
	public Cliente getCliente(Integer code)
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
	
	public boolean modificaCliente(Integer code, String nome, String cognome, String nazioneNascita, String cittanascita, Date dataNascita)
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
				clienti.get(code).setNazioneNascita(nazioneNascita);
			}
			
			if(cittanascita!=null)
			{
				clienti.get(code).setCittanascita(cittanascita);
			}
			
			if(dataNascita!=null)
			{
				clienti.get(code).setDataNascita(dataNascita);
			}
			
			return true;
		}
		
		
		else 
		{
			return false;
		}
	}
	 
}
