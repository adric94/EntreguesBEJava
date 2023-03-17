package exercici2;

public class Treballador {

	private String nom;
	private String cognom;
	private double preuHora;
	
	public Treballador(String nom, String cognom, double preuHora) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public double getPreuHora() {
		return preuHora;
	}

	public void setPreuHora(double preuHora) {
		this.preuHora = preuHora;
	}

	
	
	public double calcularSou(int horesTreballades) {
	double salarihores = horesTreballades * preuHora;
	return salarihores;
	}
	
	
	
}
