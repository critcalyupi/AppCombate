package app.equinox.bbdd;

import java.util.ArrayList;
import java.util.Collection;

import app.equinox.core.Item;

public class Equipamiento extends Item {
	String tipo; // espada, armadura, escudo, daga, maza, baculo...
	Integer valor; // 5 (daño), o 5 (resistencia)
	String tipoValor; // daño (cortante, impactante, desgarrante...), o resistencia
	String material;
	String descripcion;
	String durabilidad;
	String usos;
	Collection<Extra> extras = new ArrayList<>(); // encantamientos y/o runas
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public String getTipoValor() {
		return tipoValor;
	}
	public void setTipoValor(String tipoValor) {
		this.tipoValor = tipoValor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDurabilidad() {
		return durabilidad;
	}
	public void setDurabilidad(String durabilidad) {
		this.durabilidad = durabilidad;
	}
	public String getUsos() {
		return usos;
	}
	public void setUsos(String usos) {
		this.usos = usos;
	}
	public Collection<Extra> getExtras() {
		return extras;
	}
	public void setExtras(Collection<Extra> extras) {
		this.extras = extras;
	}
	

	//overrides
	@Override
	public Integer getPeso() {
		Integer p = 0;
		if (super.getPeso() == null || super.getPeso() < 0) {
			//calcular peso segun pesoBase + material (base de datos)
		} else {
			return super.getPeso();
		}
		return 0;
	}
	
	//metodos
}
