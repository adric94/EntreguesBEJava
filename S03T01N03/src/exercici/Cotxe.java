package exercici;

public class Cotxe implements Vehicle {
	
	@Override
	public void arrencar() {
			System.out.println("El cotxe arrenca");
	}
	
	@Override
	public void accelerar() {
			System.out.println("El cotxe accelera");
	}
	
	@Override
	public void frenar() {
			System.out.println("El cotxe frena");
	}
		
}
