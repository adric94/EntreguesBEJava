package Exercici2;

public class Main {
	public static void main(String[]args){
		
		Cotxe newCotxe = new Cotxe("Polo",90);
		System.out.println(Cotxe.marca + ", " + Cotxe.model + ", " + newCotxe.potencia+".");
		
		Cotxe newCotxe2 = new Cotxe("Golf",140);
		System.out.println(Cotxe.marca + ", " + Cotxe.model + ", " + newCotxe2.potencia+".");
		
		
		//invocar mètode estàtic mitjançant classe
		Cotxe.frenar();
		//invocar mètode no estàtic mitjançant instància
		newCotxe.accelerar();
	}
	
	
}
