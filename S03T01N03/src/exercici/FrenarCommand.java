package exercici;

public class FrenarCommand implements Command{
	
	Vehicle vehicle;
	
	public FrenarCommand(Vehicle vehicle) {
		this.vehicle= vehicle;
			
	}
	
	@Override
	public void execute() {
		vehicle.frenar();
	}
	
}
