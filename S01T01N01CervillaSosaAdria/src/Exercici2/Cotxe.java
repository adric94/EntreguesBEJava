package Exercici2;

public class Cotxe {
	
	//Al fer servir static la variable és única, en cas de no fer-ho servir el sistema
	//crea una nova variable a cada instància. Final indica que es una variable constant,
	//no podrà ser redefinida. 
	static final String marca="Volkswagen";
	static String model;
	final int potencia;
	
	
	//A l'atribut marca li assigno un valor a la capcelera de la classe
	//Tant estàtic com final es poden inicialitzar al constructor de la classe
	public Cotxe(String model, int potencia) {
		super();
		Cotxe.model = model;
		this.potencia = potencia;
	}
	
	//Creo frenar com a mètode estàtic com demana l'enunciat
	public static void frenar() {
		System.out.println("El vehicle està frenant");
			}
	public void accelerar() {
		System.out.println("El vehicle està accelerant");
			}
	
	}
