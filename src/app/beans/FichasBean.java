package app.beans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "Fichas", eager = true)
@RequestScoped
public class FichasBean {
	Integer cantidadFichas = 11;

	public Integer getCantidadFichas() {
		return cantidadFichas;
	}

	public void setCantidadFichas(Integer cantidadFichas) {
		this.cantidadFichas = cantidadFichas;
	}
	
}