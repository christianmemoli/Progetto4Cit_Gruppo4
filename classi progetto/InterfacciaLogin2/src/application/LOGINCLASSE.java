package application;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class LOGINCLASSE {

	 HashMap<Integer,Dati> utenti= new HashMap<Integer,Dati>();
	  

	public LOGINCLASSE(){}

	 public void addUtente(Dati d)
	 {
		 utenti.put(,d);
	 }
	 public void deleteUtenti(Integer code)
	 {
		 utenti.remove(code);
	 }
	 public Dati ricercaUtente(Integer code)
	 {
		 if (utenti.containsKey(code))
		 {
			 return utenti.get(code);
		 }
		 return null;
	 }
	 
}

