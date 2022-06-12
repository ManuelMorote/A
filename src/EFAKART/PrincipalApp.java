package EFAKART;

import java.util.*;

public class PrincipalApp {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Piloto> Pilotos = new ArrayList<Piloto>();
		ArrayList<Kart> Karts = new ArrayList<Kart>();
		ArrayList<Participante> Participantes = new ArrayList<Participante>();
		
		InicializarEscenario(Pilotos, Karts);
		
		int opcion;
		boolean salir = false;
		
		do {
			System.out.println("############################");
			System.out.println("Seleccione una de las siguientes opciones:");
			System.out.println("1. Visualizar Pilotos.");
			System.out.println("2. Visualizar Karts.");
			System.out.println("3. Modificar Pilotos.");
			System.out.println("4. Simular carrera.");
			System.out.println("5. Salir.");
			opcion = sc.nextInt();
			System.out.println("############################");
			
			switch(opcion) {
			case 1:
				VisualizarPilotos(Pilotos);
				break;
			case 2:
				VisualizarKarts (Karts);
				break;
			case 3:
				System.out.println("Seleccione una de las siguientes opciones:");
				System.out.println("1. Añadir Piloto.");
				System.out.println("2. Eliminar Piloto.");
				opcion = sc.nextInt();
				System.out.println("############################");
				switch(opcion) {
				case 1:
					AñadirPiloto(Pilotos);
					break;
				case 2:
					EliminarPiloto(Pilotos);
					break;
				default:
					System.out.println("El número no coincide con ninguna opción");
					break;
				}
				break;
			case 4:
				CrearParticipantes(Pilotos, Karts, Participantes);
				SimularCarrera(Pilotos, Karts, Participantes);
				break;
			case 5:
				salir = true;
				System.out.println("Tenga un buen día.");
				break;
			default:
				System.out.println("El número no coincide con ninguna opción");
				break;
			}
			
		}while (salir != true);
	}
	
	public static void InicializarEscenario (ArrayList<Piloto> Pilotos, ArrayList<Kart> Karts) {
		Pilotos.add(new Piloto("Javier", "Calzada", "70777000A", 19));
		Pilotos.add(new Piloto("Raúl", "Cordoba", "05050050B", 22));
		Pilotos.add(new Piloto("Oscar", "Jaen", "70000000C", 21));
		Pilotos.add(new PilotoExterno("Jorge", "Manzanares", "70101101R", 19));
		Pilotos.add(new PilotoExterno("Patricio", "Valdepeñas", "7011111F", 32));
		
		Karts.add(new Kart(55, 150, "Gasoil", "Rojo"));
		Karts.add(new Kart(10, 180, "Gasolina", "Verde"));
		Karts.add(new Kart(25, 120, "Gasoil", "Amarillo"));
		Karts.add(new Kart(33, 150, "Gasolina", "Azul"));
		Karts.add(new Kart(7, 160, "Gasolina", "Negro"));
		Karts.add(new Kart(88, 190, "Gasoil", "Morado"));
		Karts.add(new Kart(21, 110, "Gasoil", "Rosa"));
		Karts.add(new Kart(54, 120, "Gasoil", "Naranja"));
	}

	public static void VisualizarPilotos (ArrayList<Piloto> Pilotos) {
		System.out.println("Estos son todos los pilotos:");
		
		for (int i = 0; i < Pilotos.size(); i++) {
			System.out.println(Pilotos.get(i).toString());
		}
	}
	
	public static void VisualizarKarts (ArrayList<Kart> Karts) {
		System.out.println("Estos son todos los karts:");
		
		for (int i = 0; i < Karts.size(); i++) {
			System.out.println(Karts.get(i).toString());
		}
	}
	
	public static void AñadirPiloto (ArrayList<Piloto> Pilotos) {
		String Nombre, Localidad, DNI;
		int tipo, Edad;
		
		System.out.println("¿Qué tipo de piloto es?");
		System.out.println("1. Piloto local.");
		System.out.println("2-*. Piloto externo.");
		tipo = sc.nextInt();
		
		
		System.out.println("Seleccione un nombre:");
		Nombre = sc.next();
		
		System.out.println("Escriba una localidad:");
		Localidad = sc.next();
		
		System.out.println("Ponga el DNI:");
		DNI = sc.next();
		
		System.out.println("Introduzca la edad:");
		Edad = sc.nextInt();
		
		
		if (tipo == 1) {
			Pilotos.add(new Piloto(Nombre, Localidad, DNI, Edad));
		}
		else {
			Pilotos.add(new PilotoExterno(Nombre, Localidad, DNI, Edad));
		}
		
	}
	
	public static void EliminarPiloto (ArrayList<Piloto> Pilotos) {
		int opcion;
		System.out.println("Estos son todos los pilotos:");
		
		for (int i = 0; i < Pilotos.size(); i++) {
			System.out.println(i + ". " + Pilotos.get(i).toString());
		}
		
		System.out.println("Eliga uno de ellos por número:");
		opcion = sc.nextInt();
		
		if(opcion + 1 > Pilotos.size()) {
			System.out.println("No es una opción.");
		}
		else {
			Pilotos.remove(opcion);
			System.out.println("Se borró correctamente.");
		}
	}
	
	public static void CrearParticipantes (ArrayList<Piloto> Pilotos, ArrayList<Kart> Karts, ArrayList<Participante> Participantes) {
		
		if (Pilotos.size() > 8) {
			for (int i = 0; i < 8; i++) {
				Participante NuevoParticipante = new Participante(Pilotos.remove((int) (Math.random() * (Pilotos.size()))), Karts.remove((int) (Math.random() * (Karts.size()))));
				Participantes.add(NuevoParticipante);
			}
		}
		
		else {
			int numero = Pilotos.size();
			for (int i = 0; i < numero; i++) {
				Participante NuevoParticipante = new Participante(Pilotos.remove((int) (Math.random() * (Pilotos.size()))), Karts.remove((int) (Math.random() * (Karts.size()))));
				Participantes.add(NuevoParticipante);
			}
		}
	}
	
	public static void SimularCarrera (ArrayList<Piloto> Pilotos, ArrayList<Kart> Karts, ArrayList<Participante> Participantes) {
		int mayorvelocidad = 0;
		String ganador = null, cocheganador = null;
		
		for (int i = 0 ; i < Participantes.size(); i++) {
			if (Participantes.get(i).posvictoria() > mayorvelocidad) {
				mayorvelocidad = Participantes.get(i).posvictoria();
				ganador = Participantes.get(i).getPiloto().getNombre();
				cocheganador = Participantes.get(i).getKart().toString();
			}
		}
		
		System.out.println("El ganador es " + ganador);
		System.out.println("Con un coche con las siguientes especificaciones: " + cocheganador);
	}
}
