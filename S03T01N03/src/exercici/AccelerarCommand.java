package exercici;

public class AccelerarCommand implements Command{
	
	Vehicle vehicle;
	
	public AccelerarCommand(Vehicle vehicle) {
		this.vehicle= vehicle;
			
	}
	
	@Override
	public void execute() {
		vehicle.accelerar();
	}
	
}