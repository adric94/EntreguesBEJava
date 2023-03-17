package exercici2;
import java.io.File;
import java.text.SimpleDateFormat;
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
    	if (directoriOrdenat==null) {
    		
    		directoriOrdenat = new ArrayList<File>();
    	}
    	if (files != null) {
			for	(int i = 0; i < files.length; i++) {
				directoriOrdenat.add(files[i]);
				if (files[i].isDirectory()) {
					llistarDirectori(route+"/"+files[i].getName());
				}
			}
		}	
    } 	

    public static void sortDirectori() { 
    	
    	Collections.sort(directoriOrdenat);
    	
    }  	
    	
    public static void mostrarOrdenat() {
				
		for (File files:directoriOrdenat) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			if (files.isDirectory()) {
			System.out.println(files.getName()+" (D)"+sdf.format(files.lastModified()));
			}
			else { 
			System.out.println(files.getName()+" (F)"+sdf.format(files.lastModified()));

		}
	}
    }
}

