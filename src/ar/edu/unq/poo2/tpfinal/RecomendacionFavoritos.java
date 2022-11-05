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
						d -> d.similitudConDesafio(usuario.getPreferenciasUsuario().getDesafioPreferido())))
				.limit(cantidad).toList();
		return desafiosCoincidencia;
	}

}
