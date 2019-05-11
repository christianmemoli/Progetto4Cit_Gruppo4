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
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getCognome() 
	{
		return cognome;
	}
	public void setCognome(String cognome) 
	{
		this.cognome = cognome;
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
	
	public Utente(String nome, String cognome) 
	{
		this.nome = nome;
		this.cognome = cognome;
	}
	public Utente Clone() throws CloneNotSupportedException
	{
		Utente u=(Utente) super.clone();
		return u;
	}
	
	
	
}
