package exercici1;

import java.util.ArrayList;
import java.util.List;

public class AgentBorsa {
	List <AgenciaBorsa> agencies = new ArrayList <AgenciaBorsa>();
	
	double valorActual;
	double valorAnterior;
	
	public AgentBorsa() {
		super();
		agencies = new ArrayList <AgenciaBorsa>();
		valorAnterior =0;
	}
	
	public void afegirAgencia(AgenciaBorsa agencia) {
		agencies.add(agencia);
	}

	public void eliminarAgencia(AgenciaBorsa agencia) {
		agencies.remove(agencia);
	
	}
		
	
	public void setValorAnterior(double valorAnterior) {
		this.valorAnterior = valorAnterior;
	}
	public void setValorActual(double valorActual) {
		this.valorActual = valorActual;
	}

	public void actualitzarValor(double valorActual) {
		
		setValorActual(valorActual);
		
		for (AgenciaBorsa agencia : agencies ) {
			agencia.actualitzarValor(valorAnterior, valorActual);
		}
		setValorAnterior(valorActual);
		
	}


}
