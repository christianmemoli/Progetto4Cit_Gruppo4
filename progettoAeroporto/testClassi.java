package progettoAeroporto;

import java.util.Date;

public class testClassi {

	public static void main(String[] args) 
	{
		/*Voli v=new Voli();
		Date data=new Date(11,5,2019);
		Volo volo=new Volo("milano","amsterdam",100,220.50,data,10,30,14,15);
		System.out.println(v.getNumeroVoli());
		v.addVolo(volo);
		v.addVolo(volo);
		v.addVolo(volo);
		v.addVolo(volo);
		System.out.println(v.getNumeroVoli());
		Volo [] Voli=new Volo[v.getNumeroVoli()];
		Voli=v.getListaVoli();
		for(int i=0;i<Voli.length;i++)
		{
			System.out.println(Voli[i].toString());
		}*/

		Clienti c=new Clienti();
		Date data=new Date(4,11,2001);
		Cliente cliente=new Cliente("ale","spina","italia","parma", data);
		System.out.println(c.getNumeroClienti());
		try {
			c.addCliente(cliente);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			c.addCliente(cliente);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			c.addCliente(cliente);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			c.addCliente(cliente);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c.getNumeroClienti());
		Cliente [] Clienti=new Cliente[c.getNumeroClienti()];
		Clienti=c.getListaClienti();
		for(int i=0;i<Clienti.length;i++)
		{
			System.out.println(Clienti[i].toString());
		}
	}

}
