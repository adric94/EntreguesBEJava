package exercici;

public class Avio implements Vehicle {
	
	@Override
	public void arrencar() {
			System.out.println("L'avió arrenca");
	}
	
	@Override
	public void accelerar() {
			System.out.println("L'avió accelera");
	}
	
	@Override
	public void frenar() {
			System.out.println("L'avió frena");
	}
		
}
