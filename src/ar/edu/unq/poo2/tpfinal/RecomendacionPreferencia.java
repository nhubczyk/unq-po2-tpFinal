package ar.edu.unq.poo2.tpfinal;

import java.util.Comparator;
import java.util.List;

public class RecomendacionPreferencia extends Recomendacion {

	@Override
	public List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto) {
		return this.nDesafiosConMayorCoincidencia(5, proyecto.getDesafios(), usuario);
	}

	@Override
	public List<Desafio> nDesafiosConMayorCoincidencia(int cantidad, List<Desafio> desafiosNoAceptados,
			Usuario usuario) {
		List<Desafio> desafiosCoincidencia = desafiosNoAceptados.stream()
				.sorted(Comparator.comparingInt(d -> usuario.getPreferenciasUsuario().diferenciaConDesafio(d)))
				.limit(cantidad).toList();
		return desafiosCoincidencia;
	}

}
