package Exercici1;

public class Main {
	
	//Bloc estàtic d'inicialització
	
	static Corda piano = new Corda("",0);
	
	static {
		piano.nom = "Piano";
		piano.preu = 900;
	}
	
	public static void main (String[]args){
		
		
		//Creació de les instàncies
		
		Corda guitarra = new Corda("Guitarra", 150);
		
		Vent saxo = new Vent ("Saxofon", 600);
		
		Percussio bateria = new Percussio ("Batería", 400);
		
		guitarra.tocar();
		saxo.tocar();
		bateria.tocar();
		
	}
}
