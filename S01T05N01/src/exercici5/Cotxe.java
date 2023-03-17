package exercici5;

import java.io.Serializable;

public class Cotxe implements Serializable {
	private static final long serialVersionUID = 1L;
	private String model;
	private int potencia;
	private boolean automatic;
	
	public Cotxe(String model, int potencia, boolean automatic) {
		super();
		this.model = model;
		this.potencia = potencia;
		this.automatic = automatic;
	}

	@Override
	public String toString() {
		return "Cotxe [model=" + model + ", potencia=" + potencia + ", automatic=" + automatic + "]";
	}
	
}
