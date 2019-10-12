package app.equinox.bbdd;

import java.util.ArrayList;
import java.util.Collection;

import app.equinox.core.SerVivo;

public class Humanoide extends SerVivo {
	
	String clase;
	Integer nivel;
	Collection<Habilidad> habilidades = new ArrayList<>();
	
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

	public Collection<Habilidad> getHabilidades() {
		return habilidades;
	}
	
	public void setHabilidades(Collection<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}
	
	
	//metodos
	public Integer getVidaReal() {
		return (getResistencia()+getVidaActual());
	}
	
	public Collection<Habilidad> getTalentos(){
		Collection<Habilidad> talentos = new ArrayList<>();
		for (Habilidad h : getHabilidades()) {
			if (h.getTipo().equals("talento")) {talentos.add(h);}
		}
		return talentos;
	}
	
	public Collection<Habilidad> getMagias(){
		Collection<Habilidad> talentos = new ArrayList<>();
		for (Habilidad h : getHabilidades()) {
			if (h.getTipo().equals("magia")) {talentos.add(h);}
		}
		return talentos;
	}
	
	public Collection<Habilidad> getHabilidadesEspeciales(){
		Collection<Habilidad> talentos = new ArrayList<>();
		for (Habilidad h : getHabilidades()) {
			if (h.getTipo().equals("habilidad especial")) {talentos.add(h);}
		}
		return talentos;
	}
	
	//POR HACER: setTalentos (te muestra los talentos de clase, si eres nivel 10 los tienes todos.)
	//			 setMagias (te pide la magia y el nivel y hace el resto por ti)
	//			 setHabilidadEspecial (te pide todo y ya, de lo que sea)
	
}
