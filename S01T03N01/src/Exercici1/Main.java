package Exercici1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

public class Main {
	static ArrayList<Month> monthList = new ArrayList<Month> ();

	public static void main(String[] args) {
	
		addMonths();
		showMonths();
		addAgost();
		orderMonths();
		showMonths();
		
		/*Converteixo l'Array en HashSet, que no em permetrà ordenar els mesos posteriorment
		però no em deixarà afegir duplicats*/
		
	    HashSet<Month> hset = new HashSet<Month>(monthList);
	    
	    addGenertest();
	    
	    /* Recorro la llista amb un for each i l'iterator. Al ser la llista el que estic
	     * recorrent, pot mostrar elements duplicats a diferencia del HashSet   */
	    
	    
	    for (Month month : hset) {
	    	System.out.println(month.name);
	    
	    }
	    
	    System.out.println("\n");
	    
	    Iterator<Month> it = monthList.iterator();
	    while (it.hasNext()) {
	    	System.out.println(it.next().name);
	    }
	   
	}
	
	public static void addMonths() {
		monthList.add (new Month ("Gener"));
		monthList.add (new Month ("Febrer"));
		monthList.add (new Month ("Març"));
		monthList.add (new Month ("Abril"));
		monthList.add (new Month ("Maig"));
		monthList.add (new Month ("Juny"));
		monthList.add (new Month ("Juliol"));
		monthList.add (new Month ("Setembre"));
		monthList.add (new Month ("Octubre"));
		monthList.add (new Month ("Novembre"));
		monthList.add (new Month ("Desembre"));
	
		
	}

	public static void orderMonths() { 
		Collections.sort(monthList,  new Comparator<Month>() {
			public int compare(Month m1, Month m2) {
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("MMMM", new Locale("ca", "ES"));
					return sdf.parse(m1.name).compareTo(sdf.parse(m2.name));
				} catch (ParseException ex) {
					return m1.name.compareTo(m2.name);
 
				}
			} 
		});
	}
	public static void addAgost() {
		monthList.add(new Month ("Agost"));

		
	}
	
	public static void addGenertest() {
		monthList.add(new Month ("Gener"));
		
		
	}
	
	public static void showMonths() {
		for(int months = 0; months<monthList.size(); months++) {
			System.out.println(monthList.get(months).name);
		}
		System.out.println("\n");
	}
	
	
	
	
}