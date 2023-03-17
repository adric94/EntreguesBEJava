package exercici2;

public class TreballadorOnline extends Treballador {
	private static double internet = 60;

	public TreballadorOnline (String nom, String cognom, double preuHora) {
		super (nom, cognom, preuHora);
		
		
	}

	@Override
	public double calcularSou(int horesTreballades) {
		return super.calcularSou(horesTreballades)+internet;
	}
	
	@Deprecated
	public double calculInternet() {
		return internet;
	}
}
