package app.equinox.core;

import java.util.HashMap;

public abstract class SerVivo {
	//estadisticas
	Integer vida;
	Integer mana;
	Integer energia;
	Integer sangre;
	
	//estadisticas actuales
	Integer vidaActual;
	Integer manaActual;
	Integer energiaActual;
	Integer sangreActual;
	
	//atributos
	Integer fuerza;
	Integer destreza;
	Integer resistencia;
	
	Integer inteligencia;
	Integer manipulacion;
	Integer velo;
	
	Integer astucia;
	Integer agilidad;
	Integer percepcion;
	
	public SerVivo() {}
	
	public SerVivo(Integer vida, Integer mana, Integer energia, Integer sangre, Integer fuerza, Integer destreza,
			Integer resistencia, Integer inteligencia, Integer manipulacion, Integer velo, Integer astucia,
			Integer agilidad, Integer percepcion) {
		super();
		this.vida = vida;
		this.mana = mana;
		this.energia = energia;
		this.sangre = sangre;
		this.fuerza = fuerza;
		this.destreza = destreza;
		this.resistencia = resistencia;
		this.inteligencia = inteligencia;
		this.manipulacion = manipulacion;
		this.velo = velo;
		this.astucia = astucia;
		this.agilidad = agilidad;
		this.percepcion = percepcion;
	}
	
	public Integer getVida() {
		return vida;
	}
	public void setVida(Integer vida) {
		this.vida = vida;
	}
	public Integer getMana() {
		return mana;
	}
	public void setMana(Integer mana) {
		this.mana = mana;
	}
	public Integer getEnergia() {
		return energia;
	}
	public void setEnergia(Integer energia) {
		this.energia = energia;
	}
	public Integer getSangre() {
		return sangre;
	}
	public void setSangre(Integer sangre) {
		this.sangre = sangre;
	}
	
	public Integer getVidaActual() {
		return vidaActual;
	}

	public void setVidaActual(Integer vidaActual) {
		this.vidaActual = vidaActual;
	}

	public Integer getManaActual() {
		return manaActual;
	}

	public void setManaActual(Integer manaActual) {
		this.manaActual = manaActual;
	}

	public Integer getEnergiaActual() {
		return energiaActual;
	}

	public void setEnergiaActual(Integer energiaActual) {
		this.energiaActual = energiaActual;
	}

	public Integer getSangreActual() {
		return sangreActual;
	}

	public void setSangreActual(Integer sangreActual) {
		this.sangreActual = sangreActual;
	}

	public Integer getFuerza() {
		return fuerza;
	}
	public void setFuerza(Integer fuerza) {
		this.fuerza = fuerza;
	}
	public Integer getDestreza() {
		return destreza;
	}
	public void setDestreza(Integer destreza) {
		this.destreza = destreza;
	}
	public Integer getResistencia() {
		return resistencia;
	}
	public void setResistencia(Integer resistencia) {
		this.resistencia = resistencia;
	}
	public Integer getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(Integer inteligencia) {
		this.inteligencia = inteligencia;
	}
	public Integer getManipulacion() {
		return manipulacion;
	}
	public void setManipulacion(Integer manipulacion) {
		this.manipulacion = manipulacion;
	}
	public Integer getVelo() {
		return velo;
	}
	public void setVelo(Integer velo) {
		this.velo = velo;
	}
	public Integer getAstucia() {
		return astucia;
	}
	public void setAstucia(Integer astucia) {
		this.astucia = astucia;
	}
	public Integer getAgilidad() {
		return agilidad;
	}
	public void setAgilidad(Integer agilidad) {
		this.agilidad = agilidad;
	}
	public Integer getPercepcion() {
		return percepcion;
	}
	public void setPercepcion(Integer percepcion) {
		this.percepcion = percepcion;
	}
	
	//getters y setters en bundle
	public void setEstadisticas(Integer vida, Integer mana, Integer energia, Integer sangre) {
		this.vida = vida;
		this.mana = mana;
		this.energia = energia;
		this.sangre = sangre;
	}
	
	public void setAtributos(Integer fuerza, Integer destreza, Integer resistencia, Integer inteligencia,
			Integer manipulacion, Integer velo, Integer astucia, Integer agilidad, Integer percepcion) {
		this.fuerza = fuerza;
		this.destreza = destreza;
		this.resistencia = resistencia;
		this.inteligencia = inteligencia;
		this.manipulacion = manipulacion;
		this.velo = velo;
		this.astucia = astucia;
		this.agilidad = agilidad;
		this.percepcion = percepcion;
	}
	
	public HashMap<String, Integer> getEstadisticas(){
		HashMap<String, Integer> res = new HashMap<String, Integer>();
		res.put("vida",getVida());
		res.put("mana",getMana());
		res.put("energia",getEnergia());
		res.put("sangre",getSangre());
		return res;
	}
	
	public HashMap<String, Integer> getAtributos(){
		HashMap<String, Integer> res = new HashMap<String, Integer>();
		res.put("fuerza",getFuerza());
		res.put("destreza",getDestreza());
		res.put("resistencia",getResistencia());
		res.put("inteligencia",getInteligencia());
		res.put("manipulacion",getManipulacion());
		res.put("velo",getVelo());
		res.put("astucia",getAstucia());
		res.put("agilidad",getAgilidad());
		res.put("percepcion",getPercepcion());
		return res;
	}
	
	//metodos utiles
	
}
