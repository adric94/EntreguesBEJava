package exercici2;

public class Main {

	public static void main(String[] args) {

		Persona joan = new Persona ("Joan","López",30);
				
		GenericMethods.mostrarGeneric(joan.nom,joan.cognom,joan.edat);
		GenericMethods.mostrarGeneric(joan.cognom,joan.nom,joan.edat);
		GenericMethods.mostrarGeneric(joan.edat,joan.cognom,joan.nom);

	}

}
