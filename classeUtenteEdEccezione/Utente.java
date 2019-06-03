package application;

import java.io.Serializable;

public abstract class Utente implements Cloneable,Serializable
{
	protected String nome,cognome;
	protected Integer code;
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) throws CaracterNotAllowedException
	{
		if(ctrlSoloLettere(nome))
		{		
			this.nome = nome;
		}
		
		else
		{
			throw new CaracterNotAllowedException("Il nome deve contenere solo lettere");
		}
	}
	public String getCognome() 
	{
		return cognome;
	}
	public void setCognome(String cognome) throws CaracterNotAllowedException 
	{
		if(ctrlSoloLettere(cognome))
		{		
			this.cognome =  cognome;
		}
		
		else
		{
			throw new CaracterNotAllowedException("Il cognome deve contenere solo lettere");
		}
	}
	
	public Integer getCode() 
	{
		return code;
	}
	
	public void setCode(Integer code) 
	{
		this.code = code;
	}
	public Utente() {}
	
	public Utente(String nome, String cognome) throws CaracterNotAllowedException
	{
		if(ctrlSoloLettere(nome)&&ctrlSoloLettere(cognome))
		{		
			this.nome = nome;
			this.cognome = cognome;
		}
		
		else if(!ctrlSoloLettere(nome))
		{
			if(!ctrlSoloLettere(cognome))
			{
				throw new CaracterNotAllowedException("Nome e cognome contengono caratteri non validi");
			}
				
			else
			{
				throw new CaracterNotAllowedException("Il nome deve contenere solo lettere");
			}
		}
			
		else
		{
			throw new CaracterNotAllowedException("Il cognome deve contenere solo lettere");
		}
				
	}
	
	public Utente Clone() throws CloneNotSupportedException
	{
		Utente u=(Utente) super.clone();
		return u;
	}
	
	public static boolean ctrlSoloLettere(String stringa) 
	{
		String flag="qwertyuiopasdfghjklzxcvbnm";
		String flagM="QWERTYUIOPASDFGHJKLZXCVBNM";
		boolean result;
		
		for(int i=0;i<stringa.length();i++)
		{
			result=false;
			for(int j=0;j<flag.length();j++)
			{	
				if(stringa.charAt(i)==flag.charAt(j)||stringa.charAt(i)==flagM.charAt(j))
				{
					result=true;
					break;
				}
			}
			
			if(!result)//se result è falso
			{
				return false;
			}
		}
		
		return true;
	}
	
	
	
}
