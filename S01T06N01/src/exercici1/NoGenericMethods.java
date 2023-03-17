package exercici1;

public class NoGenericMethods {


	private Object forma;
	private Object color;
	private Object material;
	

	public NoGenericMethods(Object forma, Object color, Object material) {
		super();
		this.forma = forma;
		this.color = color;
		this.material = material;
	}


	public Object getForma() {
		return forma;
	}


	public void setForma(Object forma) {
		this.forma = forma;
	}


	public Object getColor() {
		return color;
	}


	public void setColor(Object color) {
		this.color = color;
	}


	public Object getMaterial() {
		return material;
	}


	public void setMaterial(Object material) {
		this.material = material;
	}


	@Override
	public String toString() {
		return "NoGenericMethods [forma=" + forma + ", color=" + color + ", material=" + material + "]";
	}
	
	
	
	
}