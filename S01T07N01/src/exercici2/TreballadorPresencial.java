package exercici2;

public class TreballadorPresencial extends Treballador {
private static double benzina = 120;

	public TreballadorPresencial (String nom, String cognom, double preuHora) {
	super (nom, cognom, preuHora);
	
	
	}

	@Override
	public double calcularSou(int horesTreballades) {
		return super.calcularSou(horesTreballades)+benzina;
	}

	@Deprecated
	public double calculBenzina() {
		return benzina;
	}
}
