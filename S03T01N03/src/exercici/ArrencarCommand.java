package exercici;

public class ArrencarCommand implements Command{
	
	Vehicle vehicle;
	
	public ArrencarCommand(Vehicle vehicle) {
		this.vehicle= vehicle;
			
	}
	
	@Override
	public void execute() {
		vehicle.arrencar();
	}
	
}
