package EFAKART;

public class PilotoExterno extends Piloto {

	public PilotoExterno(String nombre, String localidad, String dni, int edad) {
		super(nombre, localidad, dni, edad);
		this.coste = (int) (Math.random() * 41);
	}
	
	public String toString() {
		return super.toString() + " [coste: " + coste + "]";
	}
}
