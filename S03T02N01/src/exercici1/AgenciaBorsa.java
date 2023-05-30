package exercici1;

public class AgenciaBorsa {

	String nom;

	public AgenciaBorsa(String nom) {
		super();
		this.nom = nom;
	}
	
	public void actualitzarValor(double valorAnterior, double valorActual) {
		
		double rest = valorActual - valorAnterior;
		
		if (valorAnterior > valorActual)
			System.out.println(nom+": La borsa ha baixat:"+ rest);
		else if (valorAnterior < valorActual)
			System.out.println(nom+": La borsa ha pujat:"+ rest);
		else 
			System.out.println(nom+": La borsa es manté igual");
		
	}
	
}
