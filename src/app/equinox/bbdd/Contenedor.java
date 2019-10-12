package app.equinox.bbdd;

import app.equinox.core.Item;

public class Contenedor extends Item {
	
	
	
	public void setCapacidad(Integer capacidad) { //Usamos volumen como capacidad
		super.setVolumen(capacidad);
	}
	public Integer getCapacidad() {
		return super.getVolumen();
	}
}
