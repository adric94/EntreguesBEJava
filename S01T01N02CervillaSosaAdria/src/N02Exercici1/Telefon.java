package N02Exercici1;

public class Telefon {

	String marca;
	String model;
	public Telefon(String marca, String model) {
		super();
		this.marca = marca;
		this.model = model;
	}
	
	public void trucar(String numero) {
		System.out.println("S'està trucant al "+numero);
	}
		 
}	
	
	


