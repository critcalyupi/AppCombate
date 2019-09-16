package app.equinox.core;

public abstract class Ente {
	String nombre;
	Integer id;
	
	public Ente() {}
	
	public Ente(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
