package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Usuario {
	private Recomendacion metodoRecomendacion;
	private PreferenciasUsuario preferenciasActuales;
	private List<DesafioUsuario> desafios = new ArrayList<DesafioUsuario>();

	
	public Usuario(Recomendacion metodoRecomendacion, PreferenciasUsuario preferenciasIniciales){
		this.metodoRecomendacion = metodoRecomendacion;
		this.preferenciasActuales = preferenciasIniciales;
	}


	
	public List<DesafioUsuario> getDesafios() {
		return desafios;
	}

	
	public Boolean contieneDesafio(Desafio desafio) {		
		return this.getDesafios().stream().anyMatch(desafioActual -> desafioActual.getDesafio().equals(desafio));
	}

	
	public void setMetodoDeRecomendacion(Recomendacion metodoUtilizado) {
		this.metodoRecomendacion = metodoUtilizado;
	}

	
	public Recomendacion getMetodoRecomendacion() {
		return metodoRecomendacion;
	}

	
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
	
	
	
	//si desafio no esta incluido en los desafios del usuario devuelve 0
	public float porcentajeCompletitudDesafio(Desafio desafio) {
		DesafioUsuario desafioU = getDesafioUsuarioDeDesafio(desafio);
		if(desafioU == null) { return 0f; }
		return desafioU.getPorcentajeCompletitud();
	}
	
	private DesafioUsuario getDesafioUsuarioDeDesafio(Desafio desafio) {
		for (DesafioUsuario desafioUsuario : this.getDesafios()) {
			if(desafioUsuario.getDesafio() == desafio) {
				return desafioUsuario;
			}
		}
		return null;
	}

	
	public PreferenciasUsuario getPreferenciasUsuario() {
		return preferenciasActuales;
	}
	
	public void setPreferenciasUsuario(PreferenciasUsuario preferencias) {
		preferenciasActuales = preferencias;
	}
	
	
	public void agregarDeafio(Desafio desafio) {
		if (this.contieneDesafio(desafio)) { return; }
		this.desafios.add(new DesafioUsuario(desafio));
	}
	
	
	public List<Desafio> desafiosNoAgregados(Proyecto proyecto) {
		return proyecto.getDesafios().stream()
				.filter(desafio -> !this.contieneDesafio(desafio)).toList();
	}
	
	public List<Desafio> nDesafiosConMayorCoincidencia(int cantidad, Proyecto proyecto) {
		return nDesafiosConMayorCoincidencia(cantidad, desafiosNoAgregados(proyecto));
	}
	
	public List<Desafio> nDesafiosConMayorCoincidencia(int cantidad, List<Desafio> desafios) {
		return desafios.stream()
				.sorted(Comparator.comparingInt(d -> this.getPreferenciasUsuario().diferenciaConDesafio(d)))
				.limit(cantidad).toList();
	}
	
	public List<Desafio> nDesafiosConMayorSimilitud(int cantidad, Proyecto proyecto) {
		return nDesafiosConMayorSimilitud(cantidad, desafiosNoAgregados(proyecto));
	}
	
	public List<Desafio> nDesafiosConMayorSimilitud(int cantidad, List<Desafio> desafios){
		Desafio desafioFav = this.getPreferenciasUsuario().getDesafioPreferido();
		return desafios.stream()
		.sorted((d1, d2) -> Float.compare(d1.similitudConDesafio(desafioFav), 
										d2.similitudConDesafio(desafioFav)))
		.limit(cantidad).toList();
	}
}