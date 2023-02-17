package N02Exercici1;

public class Smartphone extends Telefon implements Camera,Rellotge {

	public Smartphone(String marca, String model) {
		super(marca, model);
	}

	@Override
	public void alarma() {
		System.out.println("Està sonant una alarma");
	}

	@Override
	public void fotografiar() {
		System.out.println("S'està fent una foto");
	}
	
	

}
