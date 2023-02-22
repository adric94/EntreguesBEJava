package Exercici1;

public class Venda {
	Producte[] producteList;
	double preutotal;
	 
	
	
	public Venda() {
		super();
		this.producteList = new Producte[2];
		this.preutotal = 0;
	}

	public void calcularTotal() throws VendaBuidaException{
			if (producteList[0]==null) {
				throw new VendaBuidaException("Per fer una venda primer has d'afegir productes");
			}else 
				
				/*for (Producte i : productes) {
		    		preutotal += i.preu; }
				*/
				{
				for (int x = 0; x < producteList.length; x++){
				Producte actualProducte = producteList[x];
				preutotal += actualProducte.preu;
				}
			}
			
		}
	
	public void afegirProductes() {
    	Producte newProducte = new Producte ("Pà",1);
    	producteList[0] = newProducte;
		Producte newProducte2 = new Producte ("Arròs",2);		
    	producteList[1] = newProducte2;	
	}
	
	
}

