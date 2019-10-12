package app.equinox.bbdd;

import app.equinox.util.Inventario;

public class Personaje extends Humanoide {
	
	String jugador;
	Inventario inventario = new Inventario();
	
	
	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}
	
	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	
}
