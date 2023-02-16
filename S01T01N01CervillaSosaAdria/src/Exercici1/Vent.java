package Exercici1;

public class Vent extends Instrument {

	public Vent(String nom, int preu) {
		super(nom, preu);
	}
	
	public void tocar() {
		System.out.println("Està sonant un instrument de Vent");

	}

}
