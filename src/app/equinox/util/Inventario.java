package app.equinox.util;

import java.util.ArrayList;
import java.util.Collection;

import app.equinox.bbdd.Arma;
import app.equinox.bbdd.Blindaje;
import app.equinox.bbdd.Consumible;
import app.equinox.bbdd.Contenedor;
import app.equinox.bbdd.Equipamiento;
import app.equinox.bbdd.Miscelanea;
import app.equinox.core.Item;

public class Inventario {
	Collection<Consumible> consumibles = new ArrayList<>();
	Collection<Equipamiento> equipamiento = new ArrayList<>();
	Collection<Miscelanea> miscelanea = new ArrayList<>();
	Collection<Contenedor> bolsas = new ArrayList<>();
	
	
	
	public Collection<Consumible> getConsumibles() {
		return consumibles;
	}
	public void setConsumibles(Collection<Consumible> consumibles) {
		this.consumibles = consumibles;
	}
	
	public Collection<Equipamiento> getEquipamiento() {
		return equipamiento;
	}
	public void setEquipamiento(Collection<Equipamiento> equipamiento) {
		this.equipamiento = equipamiento;
	}
	public void addEquipamiento(Equipamiento e) {
		this.equipamiento.add(e);
	}
	public Collection<Equipamiento> getArsenal() {
		Collection<Equipamiento> a = new ArrayList<>();
		for (Equipamiento e : getEquipamiento()) {
			if (!e.getTipoValor().equals("resistencia")) { a.add(e); }
		}
		return a;
	}
	public void addArma(Equipamiento arma) {
		this.equipamiento.add(arma);
	}
	public Collection<Equipamiento> getBlindaje() {
		Collection<Equipamiento> b = new ArrayList<>();
		for (Equipamiento e : getEquipamiento()) {
			if (e.getTipoValor().equals("resistencia")) { b.add(e); }
		}
		return b;
	}
	public void addBlindaje(Equipamiento blindaje) {
		this.equipamiento.add(blindaje);
	}
	public Collection<Miscelanea> getMiscelanea() {
		return miscelanea;
	}
	public void setMiscelanea(Collection<Miscelanea> miscelanea) {
		this.miscelanea = miscelanea;
	}
	public Collection<Contenedor> getBolsas() {
		return bolsas;
	}
	public void setBolsas(Collection<Contenedor> bolsas) {
		this.bolsas = bolsas;
	}
	
	
	//metodos
	
	public Collection<Item> getInventario(){ //no devuelve bolsas, ojo
		Collection<Item> inventario = new ArrayList<>();
		
		inventario.addAll(getConsumibles());
		inventario.addAll(getEquipamiento());
		inventario.addAll(getMiscelanea());
		
		return inventario;
	}
	
	public Integer getPesoTotal() {
		Integer p = 0;
		for (Item i : getInventario()) {
			p = p + i.getPeso();
		}
		return p;
	}
	
}
