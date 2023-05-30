package exercici1;

public class Main {

	public static void main(String[] args) {
		
		AgentBorsa agent1 = new AgentBorsa();
		
		AgenciaBorsa agencia1 = new AgenciaBorsa("Agencia1");
		AgenciaBorsa agencia2 = new AgenciaBorsa("Agencia2");
		AgenciaBorsa agencia3 = new AgenciaBorsa("Agencia3");
	
		agent1.afegirAgencia(agencia1);
		agent1.afegirAgencia(agencia2);
		agent1.afegirAgencia(agencia3);

		agent1.actualitzarValor(1500);
		agent1.actualitzarValor(1800);
	}
}
