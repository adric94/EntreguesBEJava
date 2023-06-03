package exercici1;

public class InternacionalContacteFactoria implements ContacteFactoria {

	@Override
	public Adreca crearAdreca() {
		return new AdrecaInternacional();
	}

	@Override
	public NumeroTelefon crearNumeroTelefon() {
		return new TelefonInternacional();
	}
}
