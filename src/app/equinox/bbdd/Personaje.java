package app.equinox.bbdd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import app.equinox.core.Item;

public class Personaje extends Humanoide {
	
	String jugador;
	ArrayList<Item> inventario;
	ArrayList<Consumible> invConsumibles;
	ArrayList<Arma> invArmas;
	ArrayList<Blindaje> invBlindajes;
	HashMap<Contenedor,Collection<Item>> bolsas;
	
	
	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}
	
	public ArrayList<Item> getInventario() {
		return inventario;
	}

	public void setInventario(ArrayList<Item> inventario) {
		this.inventario = inventario;
	}

	public void addItem(Item item) {
		inventario.add(item);
	}
	
	public void deleteItem(Item item) {
		inventario.remove(item);
	}
	
	
	
}
