package app.equinox.bbdd;

import java.util.ArrayList;

import app.equinox.core.SerVivo;

public class Humanoide extends SerVivo {
	
	String clase;
	Integer nivel;
	ArrayList<Habilidad> habilidades;
	
	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}
	
	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public ArrayList<Habilidad> getHabilidades() {
		return habilidades;
	}
	
	public void setHabilidades(ArrayList<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}
	
	
	//metodos
	public Integer getVidaReal() {
		return (getResistencia()+getVidaActual());
	}
	
}
