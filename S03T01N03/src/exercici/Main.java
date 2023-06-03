package exercici;

public class Main {

	public static void main(String[] args) {
		
		Vehicle avio1 = new Avio();
		Command avioArrenca = new ArrencarCommand(avio1);
		avioArrenca.execute();
		
		Command avioAccelera = new AccelerarCommand(avio1);
		avioAccelera.execute();
		
		Command avioFrena = new FrenarCommand(avio1);
		avioFrena.execute();	
		
		System.out.println("\n");
		
		Vehicle bici1 = new Bici();
		Command biciArrenca = new ArrencarCommand(bici1);
		biciArrenca.execute();
		
		Command biciAccelera = new AccelerarCommand(bici1);
		biciAccelera.execute();
		
		Command biciFrena = new FrenarCommand(bici1);
		biciFrena.execute();
		
		System.out.println("\n");

		Vehicle cotxe1 = new Cotxe();
		Command cotxeArrenca = new ArrencarCommand(cotxe1);
		cotxeArrenca.execute();
		
		Command cotxeAccelera = new AccelerarCommand(cotxe1);
		cotxeAccelera.execute();
		
		Command cotxeFrena = new FrenarCommand(cotxe1);
		cotxeFrena.execute();
		
		System.out.println("\n");

		Vehicle vaixell1 = new Vaixell();
		Command vaixellArrenca = new ArrencarCommand(vaixell1);
		vaixellArrenca.execute();
		
		Command vaixellAccelera = new AccelerarCommand(vaixell1);
		vaixellAccelera.execute();
		
		Command VaixellFrena = new FrenarCommand(vaixell1);
		VaixellFrena.execute();
		
	}

}
