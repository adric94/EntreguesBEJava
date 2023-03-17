package exercici2;

public class Principal {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Treballador treb1 = new TreballadorOnline("Maria","Saura",25);
		Treballador treb2 = new TreballadorOnline("Artur","López",22);
		Treballador treb3 = new TreballadorPresencial ("John","Smith",25);
		Treballador treb4 = new TreballadorPresencial ("Esther","Arguren",22);

		
		System.out.println(treb1.getNom()+" "+treb1.getCognom()+", " + treb1.calcularSou(150));
		System.out.println(treb2.getNom()+" "+treb2.getCognom()+", " + treb2.calcularSou(150));
		System.out.println(treb3.getNom()+" "+treb3.getCognom()+", " + treb3.calcularSou(150));
		System.out.println(treb4.getNom()+" "+treb4.getCognom()+", " + treb4.calcularSou(150));


		System.out.println(((TreballadorOnline) treb2).calculInternet());
		System.out.println(((TreballadorPresencial) treb3).calculBenzina());

	}

}
