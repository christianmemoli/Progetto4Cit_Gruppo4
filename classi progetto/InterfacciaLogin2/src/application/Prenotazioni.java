package application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;


public class Prenotazioni implements Serializable
{
	HashMap<Integer, Prenotazione> prenotazioni;
	
	public Prenotazioni()
	{
		prenotazioni=new HashMap<Integer, Prenotazione>();
	}
	
	public void addClientePrenotazioni(Volo volo, Integer codeCli)//inserisce un nuovo cliente che ha delle prenotazioni
	{
		if(prenotazioni.containsKey(codeCli))
		{
			this.addPrenotazione(new Volo(volo), codeCli);
			return;
		}
		
		Prenotazione p=new Prenotazione(new Volo(volo));
		prenotazioni.put(codeCli, p);
	}
	
	public void addPrenotazione(Volo volo,Integer codeCli)
	{
		prenotazioni.get(codeCli).addPrenotazione(new Volo(volo));
	}
	
	public boolean delPrenotazione(Integer codeCli,Integer codeVolo)
	{	
		if(prenotazioni.containsKey(codeCli))
		{
			return prenotazioni.get(codeCli).delPrenotazione(codeVolo);	
		}
		
		return false;
	}
	
	public void addCliente(Integer codeCli)
	{
		prenotazioni.put(codeCli, new Prenotazione());
	}
	
	public Prenotazione getListaPrenotazioni(Integer codeCli)
	{
		if(prenotazioni.containsKey(codeCli))
		{
			return prenotazioni.get(codeCli);
		}
		return null;
	}
	
	public Volo getSinglePrenotazione(Integer codeCli,Integer codeVolo)
	{
		if(prenotazioni.containsKey(codeCli))
		{
			return prenotazioni.get(codeCli).getPrenotazione(codeVolo);
		}
		
		return null;
	}
	
	public void salvaPrenotazioni() throws java.io.IOException
	{
		ObjectOutputStream stream=new ObjectOutputStream(new FileOutputStream("prenotazioni.bin"));
		stream.writeObject(this.prenotazioni);
		stream.close();
	}
	
	@SuppressWarnings("unchecked")
	public void caricaPrenotazioni() throws java.io.IOException
	{
		ObjectInputStream stream = new ObjectInputStream(new FileInputStream("prenotazioni.bin"));
		
		try{
			this.prenotazioni= (HashMap<Integer, Prenotazione>)stream.readObject();
			
		}
		
		catch (ClassNotFoundException e)
		{}
		finally{
				stream.close();
		}
	}
}
