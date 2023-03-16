package exercici2;

import java.util.Scanner;

public class CalculoDni {
	
public static void main(String[] args) {
	
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Introdueix el número de DNI (SENSE LLETRA): ");
			int dniNumero = input.nextInt();
			String dniComplet = calcularLetraDNI(dniNumero);
			System.out.println("El DNI complet és:" + dniComplet);
		}
		    }

 public static String calcularLetraDNI(int dniNumero) {
	 	
        final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dniNumero % 23;
        String dniComplet = String.valueOf(dniNumero) + LETRAS_DNI.charAt(resto);
        return dniComplet;
	}

 public static boolean comprobarDni(String dniComplet) { 
	 	String dniNum = dniComplet.replaceAll("\\D+","");	 
	 	int dniNumero = Integer.parseInt(dniNum);
	 	String dniValid = calcularLetraDNI(dniNumero);
	 	if (dniValid.equals(dniComplet))
	 	return true;
	 	else return false;
	 
	 
	 
 }

} 