package exercici1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

	static String route = "/Users/mac/Documents/GitHub/EntreguesBEJava/Dadestasca5" ;
	static ArrayList<File> directoriOrdenat; 
	

    public static void main(String[] args) {
    llistarDirectori(route);
    sortDirectori(); 
    mostrarOrdenat();
    }	
    public static void llistarDirectori(String route) {
    	File directori = new File(route);
    	File[] files = directori.listFiles();
    	
    	directoriOrdenat = new ArrayList<File>();
    	
    	if (files != null) {
			for	(int i = 0; i < files.length; i++) {
				directoriOrdenat.add(files[i]);
				
			}
		}	
    } 	

    public static void sortDirectori() { 
    	
    	Collections.sort(directoriOrdenat);
    	
    }  	
    	
    public static void mostrarOrdenat() {
				
		for (File files:directoriOrdenat) {
			System.out.println(files.getName());

		}
	}
    
}

