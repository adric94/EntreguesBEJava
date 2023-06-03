package exercici1;

public class Main {

	public static void main(String[] args) {
		ContacteFactoria factory = new InternacionalContacteFactoria();
		
		Adreca adreca = factory.crearAdreca();
		NumeroTelefon telefon = factory.crearNumeroTelefon();
				
		adreca.carrer = "Benviure";
		adreca.ciutat = "Sant Boi";		
		adreca.codiPostal = "08830";
		adreca.pais = "Espanya";
				
		telefon.codi = "34";
		telefon.numero = "987543678";
		
		System.out.println(adreca.adrecaToString());
		System.out.println(telefon.numeroTelefonToString());
		
		
		Adreca adreca2 = factory.crearAdreca();
		NumeroTelefon telefon2 = factory.crearNumeroTelefon();
		
		adreca2.carrer = "5th";
		adreca2.ciutat = "Washington";
		adreca2.codiPostal = "73819";
		adreca2.pais = "USA";
		
		telefon2.codi = "1";
		telefon2.numero = "7482917362";
		
		System.out.println(adreca2.adrecaToString());
		System.out.println(telefon2.numeroTelefonToString());
				
	}

}
