package application;

import java.util.Date;

public abstract class Utente  implements Cloneable
{
	protected String nome;
	protected String cognome;
	protected String nazioneNascita,cittanascita;
	protected Date dataNascita;
	protected Integer code;
	protected String username;//autogen
	protected String password;//autogen
	protected String codeFiscale;
	
	
	public Utente(String nome, String cognome) 
	{
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public Utente()
	{
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getNazioneNascita() {
		return nazioneNascita;
	}

	public void setNazioneNascita(String nazioneNascita) {
		this.nazioneNascita = nazioneNascita;
	}

	public String getCittanascita() {
		return cittanascita;
	}

	public void setCittanascita(String cittanascita) {
		this.cittanascita = cittanascita;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getCodeFiscale() {
		return codeFiscale;
	}

	public void setCodeFiscale(String codeFiscale) {
		this.codeFiscale = codeFiscale;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Utente clone() throws CloneNotSupportedException
	{
		Utente c= (Utente) super.clone();
		return c;
	}
}
