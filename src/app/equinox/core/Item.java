package app.equinox.core;

public abstract class Item extends Ente {
	Integer peso;
	Integer volumen;
	
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public Integer getVolumen() {
		return volumen;
	}
	public void setVolumen(Integer volumen) {
		this.volumen = volumen;
	}
	public String getEfecto() {
		return null;
	}
}
