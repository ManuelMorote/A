package EFAKART;

public class Kart {
	protected int numero;
	protected int potencia;
	protected String combustible;
	protected String color;
	
	public Kart (int numero, int potencia, String combustible, String color) {
		this.numero = numero;
		this.potencia = potencia;
		this.combustible = combustible;
		this.color = color;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "[Número: " + numero + " | Potencia: " + potencia + " | combustible: " + combustible + " | color: " + color + "]" ;
	}
}
