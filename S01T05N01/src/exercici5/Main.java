package exercici5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	
	public static void main (String[] args) {
		serialitzar();
		deserialitzar();
	}	
	public static void serialitzar(){	
		Cotxe cotxe = new Cotxe("Golf",170,false);
		
		FileOutputStream fileOut=null;
		ObjectOutputStream out=null;

		
		try {
			fileOut = new FileOutputStream("cotxe.ser");
			out = new ObjectOutputStream(fileOut);
			out.writeObject(cotxe);
			
		 
		}catch (IOException e) {
            e.printStackTrace();
        
		}finally {
			try {
				out.close();
				fileOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void deserialitzar(){
		FileInputStream fileIn = null;
		ObjectInputStream in = null;
		Cotxe deserialitzar = null;
		
		try {
		fileIn = new FileInputStream("cotxe.ser");
		in = new ObjectInputStream(fileIn);
		try {
			deserialitzar = (Cotxe) in.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				fileIn.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(deserialitzar.toString());
		

	}
	
	

}
