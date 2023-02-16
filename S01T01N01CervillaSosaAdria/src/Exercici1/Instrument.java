package Exercici1;

//La classe Instrument es abstracta perque l'enunciat demana que el mètode tocar
//sigui abstracte

public abstract class Instrument {
	String nom;
	int preu;
	
	
	public Instrument(String nom, int preu) {
		super();
		this.nom = nom;
		this.preu = preu;
	}
	public abstract void tocar ();
}	
//L'enunciat demana que creem tres classes filles de la classe Instrument