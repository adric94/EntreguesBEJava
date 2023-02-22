package Exercici1;

public class Main {
		
	public static void main(String[] args) {
		
		Venda venda = new Venda();
		try {
			venda.calcularTotal();			
		} catch (VendaBuidaException err) {
			System.out.println(err.getMessage());
		}

		venda.afegirProductes();
		
		try {
			venda.calcularTotal();			
		} catch (VendaBuidaException err) {
			System.out.println(err.getMessage());
		}
		
		System.out.println(venda.preutotal);
		
			
		String[]test = {"a","b"};		
		 
		try {
			for (int x = 0; x <= test.length; x++) {
		 	String s = test[x];
			}
		}catch(ArrayIndexOutOfBoundsException e) { 
			System.out.println(e.getMessage());
		}
	}
}
