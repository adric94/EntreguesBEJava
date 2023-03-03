package Exercici3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class Main {
	
	static HashMap<String, String> countries = new HashMap<String, String>();
	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();
	static int score = 0;
    static String username;
    
	public static void main(String[] args) {
    
	    
		llegirFitxer();
		demanarUsuari();
		mostrarCountry();
		guardarClassificacio();
	  	  
	}
    
    // Llegir el fitxer countries.txt i guardar les dades en un HashMap

	public static void llegirFitxer() {
		try {
			FileReader fileReader = new FileReader(new File("Countries.txt"));
	        BufferedReader bufferedReader = new BufferedReader(fileReader);
	        String line;
	        
	        
	        while ((line = bufferedReader.readLine()) != null) {
	            String[] parts = line.split(" ");
	            countries.put(parts[0], parts[1]);
	        }
	        bufferedReader.close();
	        fileReader.close();   
	    } catch (IOException e) {
	        System.out.println("Error llegint el fitxer.");
	    } 
    }

	public static void demanarUsuari() {
    	System.out.println("Benvingut/da al joc de les capitals!");
	    System.out.print("Si us plau, introdueix el teu nom: ");
	    username = scanner.nextLine();
    	
    }
    /*Al mètode mostrarCountry he afegit que elimini del HashMap el pais un cop mostrat 
	per tal de no repetir països */
	
    public static void mostrarCountry() {
    	String country;
    	for (int i = 0; i < 10; i++) {
    		    
 	    	// Seleccionar un país aleatori del HashMap
 	        
 	    	Object[] keys = countries.keySet().toArray();   	
 	    	int rnd = random.nextInt(keys.length);
 	    	        	
 	        country = (String) keys[rnd];
 	        countries.remove(country);
 	    	
 	    	System.out.println("Introdueix la capital de "+country);
 	        String capital = scanner.nextLine();
 	        
 	        
 	        if (capital.equals(countries.get(country))) {
 	            score++;
 	            System.out.println("Correcte!");
 	        } else {
 	            System.out.println("Incorrecte. La capital de " + country + " és " + countries.get(country));
 	        }
 	    }
    	scanner.close();
    	
    }
    
    public static void guardarClassificacio() {
    	  
	    try {
	        FileWriter writer = new FileWriter("classificacio.txt", true);
	        writer.write(username + ": " + score + "\n");
	        writer.close();
	       System.out.println("S'ha guardat el fitxer de classificació");
	    } catch (IOException e) {
	        System.out.println("Error escrivint al fitxer");
	    }
	 		        

    }
}
