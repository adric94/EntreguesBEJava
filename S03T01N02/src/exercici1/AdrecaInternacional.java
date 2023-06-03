package exercici1;

public class AdrecaInternacional extends Adreca {

	@Override
		public String adrecaToString() {
		
		return "Adreça: Carrer: " + carrer + ", " + ciutat + ", " + codiPostal + ", " + pais;
	}
}