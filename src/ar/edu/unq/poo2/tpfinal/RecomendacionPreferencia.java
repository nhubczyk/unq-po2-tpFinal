package ar.edu.unq.poo2.tpfinal;

import java.util.Comparator;
import java.util.List;

public class RecomendacionPreferencia extends Recomendacion {
//lo hago asi pq no me quiere compilar
	@Override
	public List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto) {
		// TODO Auto-generated method stub
		return null;
	}
/* 
	@Override
	public List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto) {
		return this.nDesafiosConMayorCoincidencia(5, proyecto.getDesafios(), usuario);
	}

	@Override
	public List<Desafio> nDesafiosConMayorCoincidencia(int cantidad, List<Desafio> desafiosNoAceptados,
			Usuario usuario) {
		List<Desafio> desafiosCoincidencia = desafiosNoAceptados.stream()
				.sorted(Comparator
						.comparingInt(d -> diferenciaEntreDesafiosYPreferencia(d, usuario.getPreferenciasUsuario())))
				.limit(cantidad).toList();
		return desafiosCoincidencia;
	}
*/
	
}

/* 
 public class RecomendacionPreferencia extends Recomendacion {

	@Override
	public List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto) {
		return this.nDesafiosConMayorCoincidencia(5, proyecto.getDesafios(), usuario);
	}

	@Override
	public List<Desafio> nDesafiosConMayorCoincidencia(int cantidad, List<Desafio> desafiosNoAceptados,
			Usuario usuario) {
		List<Desafio> desafiosCoincidencia = desafiosNoAceptados.stream()
				.sorted(Comparator
						.comparingInt(d -> diferenciaEntreDesafiosyPreferencias(d, usuario.getPreferenciasUsuario())))
				.limit(cantidad).toList();
		return desafiosCoincidencia;
	}

	public int diferenciaEntreDesafiosyPreferencias(Desafio desafio, PreferenciasUsuario preferencias) {
		return Math.abs(desafio.getDificultad() - preferencias.getDificultad())
				+ Math.abs(desafio.getCantidadMuestrasRecolectadas() - preferencias.getCantidadMuestras())
				+ Math.abs(desafio.getRecompensa() - preferencias.getRecompensaPreferida());
	}
}
 */ 
