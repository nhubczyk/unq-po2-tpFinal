package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private Recomendacion metodoRecomendacion;
	private PreferenciasUsuario preferenciasActuales;
	private List<DesafioUsuario> desafiosCompletos = new ArrayList<DesafioUsuario>();
	// TODO CAMBIAR DESAFIOS COMPLETOS A DESAFIOS.
	
	public float porcentajeCompletitud(DesafioUsuario desafio) {
		return desafio.getPorcentajeCompletitud();
	}

	public List<DesafioUsuario> getDesafiosCompletos() {
		return desafiosCompletos;
	}

	public void superoElDesafio(DesafioUsuario desafioCompletado) {
		desafiosCompletos.add(desafioCompletado);
	}

	public Recomendacion setMetodoDeRecomendacion(Recomendacion metodoUtilizado) {
		return metodoRecomendacion = metodoUtilizado;
	}

	public Recomendacion getMetodoRecomendacion() {
		return metodoRecomendacion;
	}

	public LocalDate getMomentoSuperacion(DesafioUsuario desafio) {
		return desafio.getMomentoSuperacion();
	}

	public float porcentajeCompletitudGeneral(Proyecto proyecto) {
		float cantidadDePorcentaje = 0;
		for (Desafio desafioUsuario : proyecto.getDesafios()) {
			cantidadDePorcentaje += desafioUsuario.getPorcentajeCompletitud();
		}
		return cantidadDePorcentaje / proyecto.getDesafios().size();
	}

	public PreferenciasUsuario getPreferenciasUsuario() {
		return preferenciasActuales;
	}

	public void setPreferenciasUsuario(PreferenciasUsuario preferencias) {
		preferenciasActuales = preferencias;
	}
}