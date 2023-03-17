package exercici4;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static String route = "/Users/mac/Documents/GitHub/EntreguesBEJava/Dadestasca5" ;
	static ArrayList<File> directoriOrdenat; 
	

    public static void main(String[] args) {
    //llistarDirectori(route);
    //sortDirectori(); 
    //guardarFitxer();
    llegirTxt();
    }	
   
    public static void llegirTxt() {
    	try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Introdueix el nom del fitxer: ");
            String nomfitxer = scan.nextLine();
            String sortida = "/Users/mac/Documents/GitHub/itacademy/S01T05N01/";
            FileInputStream fitxer = new FileInputStream(sortida + nomfitxer + ".txt");
            InputStreamReader lector = new InputStreamReader(fitxer);
            BufferedReader br = new BufferedReader(lector);
            while(br.ready()) {
                String linea = br.readLine();
                System.out.println(linea);
            }
            br.close();
            scan.close();
    	}catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    	
    	
    		
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
    	
    public static void guardarFitxer() {
				
    	 try {
    		
    		FileWriter writer;
    		
    		for (File files:directoriOrdenat) {
    			
 			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
 				
 			writer = new FileWriter("directori.txt", true);
 				if (files.isDirectory() ) {
 	        writer.write(files.getName()+" (D)"+sdf.format(files.lastModified())+"\n");

 				}
 				else {
 			writer.write(files.getName()+" (F)"+sdf.format(files.lastModified())+"\n");	
 				
 				}
 			writer.close();
    		}
    		  System.out.println("S'ha guardat el fitxer de directoris");
    		} catch (IOException e) {
 	        System.out.println("Error escrivint al fitxer");
 	    }
 	 		        
 	    	
     }
    	
    	
    }

