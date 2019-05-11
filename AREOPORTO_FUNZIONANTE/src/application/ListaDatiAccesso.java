package application;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class ListaDatiAccesso 
{

		private static HashMap<Integer,DatiAccesso> utenti= new HashMap<Integer,DatiAccesso>();

		public static void addCliente(DatiAccesso c)
		 {
			 utenti.put(Clienti.getLastCliCode()+1,c);
		 }
		public static void addAdmin(DatiAccesso a)
		 {
			 utenti.put(Clienti.getLastCliCode()+1,a);
		 }
		public static void deleteUtenti(Integer code)
		 {
			 utenti.remove(code);
		 }
		public static DatiAccesso ricerca(Integer code)
		 {
			 if (utenti.containsKey(code))
			 {
				 return utenti.get(code);
			 }
			 return null;
		 }
		 
	}

