package application;

import java.util.Date;

public class Cliente extends Utente implements Cloneable 
{
	protected String nazioneNascita,cittanascita;
	protected Date dataNascita;
	protected Integer code;
	
	
	public String getNazioneNascita() 
	{
		return nazioneNascita;
	}
	public void setNazioneNascita(String nazioneNascita) 
	{
		this.nazioneNascita = nazioneNascita;
	}
	
	public String getCittanascita() 
	{
		return cittanascita;
	}
	public void setCittanascita(String cittanascita) 
	{
		this.cittanascita = cittanascita;
	}
	
	public Date getDataNascita() 
	{
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) 
	{
		this.dataNascita = dataNascita;
	}
	
	public Integer getCode() 
	{
		return code;
	}
	public void setCode(Integer code) 
	{
		this.code = code;
	}
	
	public Cliente() {}
	
	public Cliente(String nome, String cognome, String nazioneNascita, String cittanascita, Date dataNascita) 
	{
		super(nome,cognome);
		this.nazioneNascita = nazioneNascita;
		this.cittanascita = cittanascita;
		this.dataNascita = dataNascita;
	}
	
	public Cliente(Cliente c) 
	{
		this.nome = c.nome;
		this.cognome = c.cognome;
		this.nazioneNascita = c.nazioneNascita;
		this.cittanascita = c.cittanascita;
		this.dataNascita = c.dataNascita;
		this.code = c.code;
	}
	
	protected Cliente(Utente c) 
	{
		this.nome = c.nome;
		this.cognome = c.cognome;
		this.nazioneNascita = c.nazioneNascita;
		this.cittanascita = c.cittanascita;
		this.dataNascita = c.dataNascita;
		this.code = c.code;
	}
	
	
	
	public Cliente Clone() throws CloneNotSupportedException
	{
		Cliente c= (Cliente) super.clone();
		return c;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", nazioneNascita=" + nazioneNascita
				+ ", cittanascita=" + cittanascita + ", dataNascita=" + dataNascita + ", code=" + code + "]";
	}
	
	
}
