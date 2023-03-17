package exercici1;

public class Main {

	public static void main(String[] args) {

		NoGenericMethods objecte1 = new NoGenericMethods ("Rodó","Vermell","Plàstic");
		System.out.println(objecte1.toString());
		
		NoGenericMethods objecte2 = new NoGenericMethods ("Plàstic","Rodó","Vermell");
		System.out.println(objecte2.toString());
		
		NoGenericMethods objecte3 = new NoGenericMethods ("Vermell","Plàstic","Rodó");
		System.out.println(objecte3.toString());


	}

}
