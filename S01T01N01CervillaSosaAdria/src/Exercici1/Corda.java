package Exercici1;

public class Corda extends Instrument {

	public Corda(String nom, int preu) {
		super(nom, preu);
	}

	public void tocar() {
		System.out.println("Està sonant un instrument de Corda");
	}		

}
