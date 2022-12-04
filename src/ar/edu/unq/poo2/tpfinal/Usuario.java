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
	
	
	/**
	 * @param desafio - desafio a calcular porcentaje de completitud
	 * @return El porcentaje de completitud, pero si el desafio no esta
	 * incluido en los desafios del usuario devuelve 0
	 */
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
	
	
	public void agregarDesafio (Desafio desafio) throws Exception {
		if (this.contieneDesafio(desafio)) { 
			throw new Exception("Se intengo agregar un desafio que ya existia en Usuario"); }
		this.desafios.add(new DesafioUsuario(desafio));
	}
	
	/**
	 * @param proyecto - proyecto que contiene una lista de desafios
	 * @return La lista de desafios que contiene proyecto sin incluir
	 * aquellos que estan agregados al usuario
	 */
	public List<Desafio> desafiosNoAgregados(Proyecto proyecto) {
		return proyecto.getDesafios().stream()
				.filter(desafio -> !this.contieneDesafio(desafio)).toList();
	}
	
	/**
	 * @param cantidad - lo largo que se quiere que sea la lista devuelta
	 * @param proyecto - contenedor de los desafios que se van a comparar con el desafio favorito
	 * @return
	 * Los desafios pertenecientes a proyecto ordenados por mayor coincidencia que tienen
	 * con las preferencias del usuario, y que ademas no estan
	 * agregados a usuario
	 */
	public List<Desafio> nDesafiosConMayorCoincidencia(int cantidad, Proyecto proyecto) {
		return nDesafiosConMayorCoincidencia(cantidad, desafiosNoAgregados(proyecto));
	}
	
	
	/**
	 * @param cantidad - lo largo que se quiere que sea la lista devuelta
	 * @param desafios - desafios a comparar con las preferencias del usuario
	 * @return Los desafios de la lista desafios
	 * rdenados por mayor coincidencia que tienen con las
	 * preferencias del usuario
	 */
	public List<Desafio> nDesafiosConMayorCoincidencia(int cantidad, List<Desafio> desafios) {
		return desafios.stream()
				.sorted(Comparator.comparingInt(d -> this.getPreferenciasUsuario().diferenciaConDesafio(d)))
				.limit(cantidad).toList();
	}
	
	/**
	 * @param cantidad - lo largo que se quiere que sea la lista devuelta
	 * @param proyecto - contenedor de los desafios que se van a comparar con el desafio favorito
	 * @return
	 * Los desafios pertenecientes a proyecto rdenados por mayor similitud que tienen
	 * con el desafio favorito del usuario, y que ademas no estan
	 * agregados a usuario
	 */
	public List<Desafio> nDesafiosConMayorSimilitud(int cantidad, Proyecto proyecto) {
		return nDesafiosConMayorSimilitud(cantidad, desafiosNoAgregados(proyecto));
	}
	
	/**
	 * @param cantidad - lo largo que se quiere que sea la lista devuelta
	 * @param desafios - desafios a comparar con el desafio favorito
	 * @return Los desafios de la lista desafios
	 * rdenados por mayor similitud que tienen con el
	 * desafio favorito del usuario
	 */
	public List<Desafio> nDesafiosConMayorSimilitud(int cantidad, List<Desafio> desafios){
		Desafio desafioFav = this.getPreferenciasUsuario().getDesafioPreferido();
		return desafios.stream()
		.sorted((d1, d2) -> Float.compare(d1.similitudConDesafio(desafioFav), 
										d2.similitudConDesafio(desafioFav)))
		.limit(cantidad).toList();
	}
}