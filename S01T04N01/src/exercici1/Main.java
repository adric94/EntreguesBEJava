package exercici1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class Main {
	
	static ArrayList <String> llistaMesos;
	
	public static void main(String[] args) {

	afegirMesos();
	ordenarMesos();
	mostrarMesos();
	
	}
	public static void afegirMesos() {
		
	llistaMesos = new ArrayList<String>();
	llistaMesos.add("Gener");
	llistaMesos.add("Desembre");
	llistaMesos.add("Febrer");
	llistaMesos.add("Març");
	llistaMesos.add("Abril");
	llistaMesos.add("Maig");
	llistaMesos.add("Juny");
	llistaMesos.add("Juliol");
	llistaMesos.add("Agost");
	llistaMesos.add("Setembre");
	llistaMesos.add("Octubre");
	llistaMesos.add("Novembre");

	}
	
	public static void mostrarMesos() {
		for (String mes:llistaMesos) {
			System.out.println(mes);
		}
	
	}
		
	public static void ordenarMesos() {
		Collections.sort(llistaMesos,  new Comparator<String>() {
         public int compare(String m1, String m2) {
    	 	try {
    	 		SimpleDateFormat sdf = new SimpleDateFormat("MMMM", new Locale("ca", "ES"));
		                 return sdf.parse(m1).compareTo(sdf.parse(m2));
		             } catch (ParseException ex) {
		                 return m1.compareTo(m2);
		             }
		         }
		     });
	}

}
