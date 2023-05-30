package exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Undo undo = Undo.getInstance();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		String option;
		
				
			while (!exit) {
				System.out.println("Escull una opcio: 'add', 'remove', 'removelast', 'clear', 'history', 'exit'.");
			
				try {
					option = scanner.nextLine();
						
					switch (option) {
					
						case "add":
							System.out.println("Introdueix una comanda: ");
							String command = scanner.nextLine();
							undo.addCommand(command);
							break;
							
						case "remove":
							System.out.println("Introdueix un numero de comanda: ");
							int index = scanner.nextInt();
			                undo.removeCommand(index);
							break;
							
						case "removelast":
							undo.removelastCommand();
							break;
							
						case "clear":
							undo.clearHistory();
							break;
							
						case "history":
							undo.printHistory();
							break;
							
						case "exit":
							exit = true;
							break;
							
							
					}
					}catch (InputMismatchException e) {
						   System.out.println("Has d'introduir una opció");
						   scanner.nextLine();
					    }
				}
			scanner.close();

		
			
	}
}


