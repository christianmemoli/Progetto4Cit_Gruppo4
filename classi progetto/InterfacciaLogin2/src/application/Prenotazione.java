package application;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* insieme delle prenotazioni assegnate ad un cliente*/
public class Prenotazione implements Serializable
{
	private ArrayList<Volo>prenotazione;
	
	public Prenotazione()
	{
		prenotazione=new ArrayList<>();
	}
	
	public Prenotazione(Volo volo)
	{
		prenotazione=new ArrayList<>();
		this.addPrenotazione(new Volo(volo));
	}
	
	
	public Volo addPrenotazione(Volo volo)//throws SomethingException
	{	
		if(!this.verifyPrenotazione(volo.getCode()))
		{
			prenotazione.add(new Volo(volo));
			return new Volo(volo);
		}
		
		else
		{
			return null;
		}
		
	}
	
	public boolean delPrenotazione(Integer code)
	{
		if(this.verifyPrenotazione(code))
		{
			Iterator<Volo>i;
			
			for(i=prenotazione.iterator();i.hasNext();)
			{
				Volo v=i.next();
				
				if(v.getCode()==code)
				{
					i.remove();
					return true;
				}
			}
		}
		
		return false;
	}
	
	
	private boolean verifyPrenotazione(Integer code)//se lo stesso volo � gia stato prenotato ritorna vero se no falso
	{
		Iterator<Volo>i;
		
		for(i=prenotazione.iterator();i.hasNext();)
		{
			Volo v=i.next();
			
			if(v.getCode()==code)
			{
				return true;
			}
		}
		return false;
	}
	
	public Volo getPrenotazione(Integer code)//ritorna il volo se � stato prenotato ritorna null se non lo trova
	{
		Iterator<Volo>i;
		
		for(i=prenotazione.iterator();i.hasNext();)
		{
			Volo v=i.next();
			
			if(v.getCode()==code)
			{
				return v;
			}
		}
		return null; //TO-DO se viene inserito un volo non esistente
	}
	
	public void salvaPrenotazione() throws java.io.IOException
	{
		ObjectOutputStream stream=new ObjectOutputStream(new FileOutputStream("prenotazione.bin"));
		stream.writeObject(this.prenotazione);
		stream.close();
	}
	
	@SuppressWarnings("unchecked")
	public void caricaPrenotazione() throws java.io.IOException
	{
		ObjectInputStream stream = new ObjectInputStream(new FileInputStream("prenotazione.bin"));
		
		try{
			this.prenotazione= (ArrayList<Volo>)stream.readObject();
			
		}
		
		catch (ClassNotFoundException e)
		{}
		finally{
				stream.close();
		}
	}
}
