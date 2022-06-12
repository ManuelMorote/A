package EFAKART;

public class Participante {
	
	protected Piloto Piloto;
	protected Kart Kart;
	
	public Participante (Piloto Piloto, Kart Kart) {
		this.Kart = Kart;
		this.Piloto = Piloto;
	}

	public Piloto getPiloto() {
		return Piloto;
	}

	public void setPiloto(Piloto piloto) {
		Piloto = piloto;
	}

	public Kart getKart() {
		return Kart;
	}

	public void setKart(Kart kart) {
		Kart = kart;
	}

	public String toString(){
		return "[Piloto: " + Piloto + " | Kart: " + Kart + "]";
	}
	
	public int posvictoria () {
		int PosVictoria;
		return PosVictoria = 2*Piloto.getEdad()+Kart.getPotencia();
	}

}
