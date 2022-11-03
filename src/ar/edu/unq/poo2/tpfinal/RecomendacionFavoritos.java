package ar.edu.unq.poo2.tpfinal;

import java.util.Comparator;
import java.util.List;

public class RecomendacionFavoritos extends Recomendacion {

	@Override
	public List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto) {
		return this.nDesafiosConMayorCoincidencia(20, proyecto.getDesafios(), usuario).stream().limit(5).toList();
	}

	@Override
	public List<Desafio> nDesafiosConMayorCoincidencia(int cantidad, List<Desafio> desafiosNoAceptados,
			Usuario usuario) {
		List<Desafio> desafiosCoincidencia = desafiosNoAceptados.stream()
				.sorted(Comparator.comparingInt(
						d -> diferenciaEntreDesafios(d, usuario.getPreferenciasUsuario().getDesafioPreferido())))
				.limit(cantidad).toList();
		return desafiosCoincidencia;
	}

	public int diferenciaEntreDesafios(Desafio desafio, Desafio desafio2) {
		return Math.abs(desafio.getDificultad() - desafio2.getDificultad())
				+ Math.abs(desafio.getCantidadMuestrasRecolectadas() - desafio2.getCantidadMuestrasNecesarias())
				+ Math.abs(desafio.getRecompensa() - desafio2.getRecompensa());
	
	}
}


/*
 public class RecomendacionFavoritos extends Recomendacion {

	@Override
	public List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto) {
		return this.nDesafiosConMayorCoincidencia(20, proyecto.getDesafios(), usuario).stream().limit(5).toList();
	}

	@Override
	public List<Desafio> nDesafiosConMayorCoincidencia(int cantidad, List<Desafio> desafiosNoAceptados,
			Usuario usuario) {
		List<Desafio> desafiosCoincidencia = desafiosNoAceptados.stream()
				.sorted(Comparator.comparingInt(
						d -> diferenciaEntreDesafios(d, usuario.getPreferenciasUsuario().getDesafioPreferido())))
				.limit(cantidad).toList();
		return desafiosCoincidencia;
	}

	public int diferenciaEntreDesafios(Desafio desafio, Desafio desafio2) {
		return Math.abs(desafio.getDificultad() - desafio2.getDificultad())
				+ Math.abs(desafio.getCantidadMuestrasRecolectadas() - desafio2.getCantidadMuestrasNecesarias())
				+ Math.abs(desafio.getRecompensa() - desafio2.getRecompensa());
	}

}
 */
