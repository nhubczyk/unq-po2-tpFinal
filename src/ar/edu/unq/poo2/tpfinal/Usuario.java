package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private Recomendacion metodoRecomendacion;
	private PreferenciasUsuario preferencias;

	private List<DesafioUsuario> desafiosCompletos = new ArrayList<DesafioUsuario>();

	public float porcentajeCompletitud(DesafioUsuario desafio) {
		return desafio.getPorcentajeCompletitud();
	}


	public List<DesafioUsuario> getDesafiosCompletos() {
		return desafiosCompletos;
	}

	public Recomendacion setMetodoDeRecomendacion(Recomendacion metodoUtilizado) {
		return metodoRecomendacion = metodoUtilizado;
	}

	public Recomendacion getMetodoRecomendacion() {
		return metodoRecomendacion;
	}

	public void superoElDesafio(DesafioUsuario desafioCompletado) {
		desafiosCompletos.add(desafioCompletado);
	}

	public LocalDate momentoSuperacion(DesafioUsuario desafio) {
		return desafio.momentoSuperacion();
	}

	public float porcentajeCompletitodGeneral(Proyecto proyecto) {
		float cantidadDePorcentaje = 0;
		for (DesafioUsuario desafioUsuario : desafiosCompletos) {
			cantidadDePorcentaje += desafioUsuario.getPorcentajeCompletitud();
		}
		return cantidadDePorcentaje;
	}
	
	public PreferenciasUsuario getPreferenciasUsuario() {
		return preferencias;
	}

}