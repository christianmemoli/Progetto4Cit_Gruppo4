package application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;

public class Voli 
{
		private static Integer matriceVoli=0;
		private HashMap <Integer,Volo> voli=new HashMap<Integer,Volo>();
		public Voli() {};
		public Integer getNumeroVoli()
		{
			return voli.size();
		}
		private static Integer generatecodeVoli()
		{
			Integer i=matriceVoli;
			matriceVoli++;
			return i;
		}
		public Integer addVolo(Volo v)
		{
			v.setCode(generatecodeVoli());
			voli.put(v.getCode(),new Volo(v));
			
			if(voli.get(v.getCode())!=null)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		
		public Integer deleteVolo(Integer code)
		{
			voli.remove(code);
			
			if(voli.get(code)==null)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		
		public Volo[] getListaVoli()
		{
			Volo [] Voli=new Volo[voli.size()];
			for(Integer i=0,code=0;code<matriceVoli;code++)
			{
				if(voli.get(code)!=null)
				{
					Voli[i]=new Volo(voli.get(code));
					i++;
				}
			}
			return Voli;
		}
		
		public Volo getVolo(Integer code)
		{
			if(voli.get(code)!=null)
			{
				return voli.get(code);
			}
			else
			{
				return null;
			}
		}
		public boolean modificaVolo(Integer code, String aereoportoPartenza,String aereoportoArrivo,Integer numeroPosti,double costoVolo,Date DataVolo,
		LocalTime timePartenza,	LocalTime timeArrivo)
		{
			if(voli.containsKey(code))
			{
				if(aereoportoArrivo!=null)
				{
					voli.get(code).setAreoportoArrivo(aereoportoArrivo);
				}
				
				if(aereoportoPartenza!=null)
				{
					voli.get(code).setAreoportoPartenza(aereoportoPartenza);
				}
				
				if(numeroPosti!=null)
				{
					voli.get(code).setNumeroPosti(numeroPosti);
				}
				
				if(costoVolo>-1)
				{
					voli.get(code).setCostoVolo(costoVolo);
				}
				
				if(DataVolo!=null)
				{
					voli.get(code).setDataVolo(DataVolo);
				}
				
				if(timePartenza!=null)
				{
					voli.get(code).setTimePartenza(timePartenza);
				}
				
				if(timeArrivo!=null)
				{
					voli.get(code).setTimeArrivo(timeArrivo);
				}
				
				
				return true;
			}
			
			else
			{
				return false;
			}
		}
		
		public void salvaVoli() throws java.io.IOException
		{
			ObjectOutputStream stream=new ObjectOutputStream(new FileOutputStream("voli.bin"));
			stream.writeObject(this.voli);
			stream.close();
		}
		
		@SuppressWarnings("unchecked")
		public void caricaVoli() throws java.io.IOException
		{
			ObjectInputStream stream = new ObjectInputStream(new FileInputStream("voli.bin"));
			
			try{
				this.voli= (HashMap<Integer, Volo>)stream.readObject();
				
			}
			
			catch (ClassNotFoundException e)
			{}
			finally{
					stream.close();
			}
		}
	}
