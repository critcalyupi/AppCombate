package app.beans;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import app.equinox.bbdd.Bestia;
import app.equinox.bbdd.Humanoide;
import app.equinox.bbdd.Personaje;

@ManagedBean(name = "Global", eager = true)
@RequestScoped
public class GlobalBean {
	
	Collection<Personaje> personajes = new ArrayList<>();
	Collection<Humanoide> aliados = new ArrayList<>();
	Collection<Humanoide> enemigos = new ArrayList<>();
	Collection<Bestia> bestias = new ArrayList<>();
	
	Integer cantidadFichas = 0;
	
	@PostConstruct
	public void init() {
		Personaje nuevo = new Personaje();
		nuevo.setNombre("zalan");
		nuevo.setClase("explorador");
		nuevo.setNivel(9);
		nuevo.setEstadisticas(11,9,19,5);
		nuevo.resetStats();
		nuevo.setRoles("soporte");
		//nuevo.setAtributos(4, 3, 4, 2, 4, 3, 4, 5, 2);
		personajes.add(nuevo);
		Personaje nuevo1 = new Personaje();
		nuevo1.setNombre("farin");
		nuevo1.setClase("guerrero");
		nuevo1.setNivel(9);
		nuevo1.setEstadisticas(18,4,16,5);
		nuevo1.resetStats();
		nuevo1.setRoles("tanque");
		personajes.add(nuevo1);
		Personaje nuevo3 = new Personaje();
		nuevo3.setNombre("zen");
		nuevo3.setClase("arquero");
		nuevo3.setNivel(9);
		nuevo3.setEstadisticas(8,8,21,4);
		nuevo3.resetStats();
		nuevo3.setRoles("dpsfisico");
		personajes.add(nuevo3);
		Personaje nuevo4 = new Personaje();
		nuevo4.setNombre("xaldir");
		nuevo4.setClase("mago");
		nuevo4.setNivel(9);
		nuevo4.setEstadisticas(7,19,6,4);
		nuevo4.resetStats();
		nuevo4.setRoles("dpsmagico","sanador");
		personajes.add(nuevo4);
		Personaje nuevo5 = new Personaje();
		nuevo5.setNombre("zhon");
		nuevo5.setClase("chaman");
		nuevo5.setNivel(9);
		nuevo5.setEstadisticas(13,11,15,5);
		nuevo5.resetStats();
		nuevo5.setRoles("tanque","soporte");
		personajes.add(nuevo5);
		Personaje nuevo6 = new Personaje();
		nuevo6.setNombre("shin");
		nuevo6.setClase("espadachin");
		nuevo6.setNivel(9);
		nuevo6.setEstadisticas(13,8,20,6);
		nuevo6.resetStats();
		nuevo6.setRoles("dpsfisico");
		personajes.add(nuevo6);
		Personaje nuevo7 = new Personaje();
		nuevo7.setNombre("al");
		nuevo7.setClase("hechicero");
		nuevo7.setNivel(9);
		nuevo7.setEstadisticas(14,15,8,6);
		nuevo7.resetStats();
		nuevo7.setRoles("dpsmagico");
		personajes.add(nuevo7);
		Personaje nuevo8 = new Personaje();
		nuevo8.setNombre("shaun");
		nuevo8.setClase("luchador");
		nuevo8.setNivel(7);
		nuevo8.setEstadisticas(11,5,16,4);
		nuevo8.resetStats();
		nuevo8.setRoles("dpsfisico");
		personajes.add(nuevo8);
		Personaje nuevo9 = new Personaje();
		nuevo9.setNombre("asher");
		nuevo9.setClase("cazador");
		nuevo9.setNivel(9);
		nuevo9.setEstadisticas(13,6,19,6);
		nuevo9.resetStats();
		nuevo9.setRoles("dpsfisico");
		personajes.add(nuevo9);
		
		// FIN PERSONAJES
		
		Humanoide aliado = new Humanoide();
		aliado.setNombre("tobias");
		aliado.setClase("ladron");
		aliado.setNivel(1);
		aliado.setEstadisticas(6, 7, 8, 6);
		aliado.resetStats();
		aliado.setRoles("soporte","dpsfisico");
		aliados.add(aliado);
		
		Humanoide enemigo = new Humanoide();
		enemigo.setNombre("ethan");
		enemigo.setClase("vampiro");
		enemigo.setNivel(15);
		enemigo.setEstadisticas(99, 99, 99, 99);
		enemigo.resetStats();
		enemigo.setRoles("dpsfisico","dpsfisico","dpsfisico");
		enemigos.add(enemigo);
		
		Bestia bestia = new Bestia();
		bestia.setNombre("jiagras");
		bestia.setTipo("criatura");
		bestia.setEstadisticas(9, 1, 1, 3);
		bestia.resetStats();
		bestia.setRoles("dpsfisico");
		bestias.add(bestia);
	}
	
	public Integer getCantidadFichas() {
		return personajes.size() + enemigos.size() + aliados.size() + bestias.size();
	}

	public Collection<Personaje> getPersonajes() {
		return personajes;
	}

	public void setPersonajes(Collection<Personaje> personajes) {
		this.personajes = personajes;
	}

	public Collection<Humanoide> getAliados() {
		return aliados;
	}

	public void setAliados(Collection<Humanoide> aliados) {
		this.aliados = aliados;
	}

	public Collection<Humanoide> getEnemigos() {
		return enemigos;
	}

	public void setEnemigos(Collection<Humanoide> enemigos) {
		this.enemigos = enemigos;
	}

	public Collection<Bestia> getBestias() {
		return bestias;
	}

	public void setBestias(Collection<Bestia> bestias) {
		this.bestias = bestias;
	}
	
}
