package EFAKART;

public class Piloto {
	
	protected String nombre;
	protected String localidad;
	protected String dni;
	protected int edad;
	protected int coste;
	
	public Piloto (String nombre, String localidad, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.localidad = localidad;
		this.dni = dni;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getCoste() {
		return coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}

	public String toString() {
		return "[nombre: " + nombre + " | localidad: " + localidad + " | DNI: " + dni + " | edad: " + edad + "]";
	}

}
