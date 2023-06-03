package exercici;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sabateria {
	static Scanner scanner;
	
	public static void main(String[] args) {
		PaymentGateway paymentGateway = new PaymentGateway();
		
		System.out.println("Escull el mètode de pagament");
		
		scanner = new Scanner(System.in);
		boolean sortir = false;
		
		
		while(!sortir) {
			System.out.println("1 - Paypal");
			System.out.println("2 - Targeta de crèdit");
			System.out.println("3 - Càrrec bancari");
			
			try {
				int opcio = scanner.nextInt();
				PaymentMethod paymentMethod = null;				
				switch(opcio) {
					case 1: 
						paymentMethod = new PaypalPayment();
						
						break;
					
					case 2:
						paymentMethod = new TargetaCreditPayment();
						
						break;
						
					case 3:
						paymentMethod = new CarrecBancariPayment();
						
						break;

					default:
						System.out.println("Introdueix un mètode 1-3");
				}
				
				 if (paymentMethod != null) {
	                    paymentGateway.processPayment(paymentMethod, new PaymentCallback() {
	                       
	                    	@Override
	                        public void paymentSuccess() {
	                            System.out.println("El pagament s'ha realitzat amb èxit.");
	                        }

							@Override
							public void paymentFailure(String errorMessage) {
								
							}
	                   	
				 });      
							 sortir = true;
			
		}
			}catch(InputMismatchException e) {
				System.out.println("Has d'introduir un número");
				scanner.next();
			}
		scanner.close();
				
		
		}
	}
}	

			