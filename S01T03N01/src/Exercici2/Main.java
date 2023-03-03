package Exercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> Llista1 = new ArrayList<Integer>();
		Llista1.add(1);
		Llista1.add(32);

		
	
		List<Integer> Llista2 = new ArrayList<Integer>();
		Llista2.addAll(Llista1);
		Collections.reverse(Llista2);
		
		
		ListIterator<Integer> Llista1Iterator = Llista1.listIterator();
		
		while (Llista1Iterator.hasNext()) {
			Llista2.add(Llista1Iterator.next());
		}
	
		Llista2.forEach(System.out::println);
	

		
	}
	

}
