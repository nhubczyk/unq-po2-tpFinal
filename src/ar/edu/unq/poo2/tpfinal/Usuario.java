package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private Recomendacion metodoRecomendacion;
	private PreferenciasUsuario preferenciasActuales;
	private List<DesafioUsuario> desafios = new ArrayList<DesafioUsuario>();

	//y
	public Usuario(Recomendacion metodoRecomendacion, PreferenciasUsuario preferenciasIniciales){
		this.metodoRecomendacion = metodoRecomendacion;
		this.preferenciasActuales = preferenciasIniciales;
	}


	//y
	public List<DesafioUsuario> getDesafios() {
		return desafios;
	}

	//y
	public Boolean contieneDesafio(Desafio desafio) {
		for (DesafioUsuario desafioUsuario : this.getDesafios()) {
			if (desafioUsuario.getDesafio() == desafio) {
				return true;
			}
		}
		return false;
	}

	//y
	public void setMetodoDeRecomendacion(Recomendacion metodoUtilizado) {
		this.metodoRecomendacion = metodoUtilizado;
	}

	//y
	public Recomendacion getMetodoRecomendacion() {
		return metodoRecomendacion;
	}

	//y
	public LocalDate getMomentoSuperacion(Desafio desafio) {
		return getDesafioUsuarioDeDesafio(desafio).getMomentoSuperacion();
	}

	public float porcentajeDesafiosCompletados() {
		int cantidadCompletados = 0;
		for (DesafioUsuario desafio : this.getDesafios()) {
			if(desafio.fueCompletado()) { 
				cantidadCompletados++;
			}
		}
		return (float) cantidadCompletados / this.getDesafios().size() * 100f;
	}
	
	
	//y
	//si desafio no esta incluido en los desafios del usuario devuelve 0
	public float porcentajeCompletitudDesafio(Desafio desafio) {
		DesafioUsuario desafioU = getDesafioUsuarioDeDesafio(desafio);
		if(desafioU == null) { return 0f; }
		return desafioU.getPorcentajeCompletitud();
	}
	//y
	private DesafioUsuario getDesafioUsuarioDeDesafio(Desafio desafio) {
		for (DesafioUsuario desafioUsuario : this.getDesafios()) {
			if(desafioUsuario.getDesafio() == desafio) {
				return desafioUsuario;
			}
		}
		return null;
	}

	//y
	public PreferenciasUsuario getPreferenciasUsuario() {
		return preferenciasActuales;
	}
	//y
	public void setPreferenciasUsuario(PreferenciasUsuario preferencias) {
		preferenciasActuales = preferencias;
	}
	
	//y
	public void anhadirDeafio(Desafio desafio) {
		if (this.contieneDesafio(desafio)) { return; }
		this.desafios.add(new DesafioUsuario(desafio));
	}
}