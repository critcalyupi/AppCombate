package app.beans;

import javax.annotation.ManagedBean;

@ManagedBean("Fichas")
public class FichasBean {
	Integer cantidadFichas = 5;

	public Integer getCantidadFichas() {
		return cantidadFichas;
	}

	public void setCantidadFichas(Integer cantidadFichas) {
		this.cantidadFichas = cantidadFichas;
	}
	
	
}