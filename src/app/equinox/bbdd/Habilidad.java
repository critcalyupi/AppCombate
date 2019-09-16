package app.equinox.bbdd;

import app.equinox.core.Ente;

public class Habilidad extends Ente {
	String descripcion;
	String tipo;
	String tipo_coste;
	int coste;
	boolean costeVariable;
	int enfriamiento;
	
	public Habilidad() {}
	
	//contructor de pasivas
	public Habilidad(String nombre, String tipo, String descripcion) {
		super(nombre);
		this.tipo = tipo;
		this.descripcion = descripcion;
	}
	
	//constructor de activas de coste fijo
	public Habilidad(String nombre, String tipo, int coste, String tipo_coste, int enfriamiento, String descripcion) {
		super(nombre);
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.tipo_coste = tipo_coste;
		this.coste = coste;
		this.enfriamiento = enfriamiento;
	}
	
	//constructor de activas de coste variable
	public Habilidad(String nombre, String tipo, int coste, String tipo_coste, boolean costeVariable, int enfriamiento, String descripcion) {
		super(nombre);
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.tipo_coste = tipo_coste;
		this.coste = coste;
		this.costeVariable = costeVariable;
		this.enfriamiento = enfriamiento;
	}
	
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipo_coste() {
		return tipo_coste;
	}
	public void setTipo_coste(String tipo_coste) {
		this.tipo_coste = tipo_coste;
	}
	public int getCoste() {
		return coste;
	}
	public void setCoste(int coste) {
		this.coste = coste;
	}
	public int getEnfriamiento() {
		return enfriamiento;
	}
	public void setEnfriamiento(int enfriamiento) {
		this.enfriamiento = enfriamiento;
	}
	
}
