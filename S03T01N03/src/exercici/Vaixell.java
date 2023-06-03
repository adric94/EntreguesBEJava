package exercici;

public class Vaixell implements Vehicle {
	
	@Override
	public void arrencar() {
			System.out.println("El vaixell arrenca");
	}
	
	@Override
	public void accelerar() {
			System.out.println("El vaixell accelera");
	}
	
	@Override
	public void frenar() {
			System.out.println("El vaixell frena");
	}
		
}
