package exercici1;

public class Principal {

	public static void main(String[] args) {

		Treballador treb1 = new TreballadorOnline("María","Saura",25);
		Treballador treb2 = new TreballadorOnline("Artur","López",22);
		Treballador treb3 = new TreballadorPresencial ("John","Smith",25);
		Treballador treb4 = new TreballadorPresencial ("Esther","Arguren",22);

		
		System.out.println(treb1.getNom()+" "+treb1.getCognom()+", " + treb1.calcularSou(150));
		System.out.println(treb2.getNom()+" "+treb2.getCognom()+", " + treb2.calcularSou(150));
		System.out.println(treb3.getNom()+" "+treb3.getCognom()+", " + treb3.calcularSou(150));
		System.out.println(treb4.getNom()+" "+treb4.getCognom()+", " + treb4.calcularSou(150));

		
	}

}
