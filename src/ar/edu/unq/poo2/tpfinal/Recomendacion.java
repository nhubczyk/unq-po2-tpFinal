package ar.edu.unq.poo2.tpfinal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class Recomendacion {

	public abstract List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto);

	public List<Desafio> nDesafiosConMayorCoincidencia(int cantidad, List<Desafio> desafiosNoAceptados,
			Usuario usuario) {
		List<Desafio> desafiosCoincidencia = desafiosNoAceptados.stream()
				.sorted(Comparator.comparingInt(d -> usuario.getPreferenciasUsuario().diferenciaConDesafio(d)))
				.limit(cantidad).toList();
		return desafiosCoincidencia;
	}

	public List<Desafio> desafiosSinAceptar(Proyecto proyecto, Usuario user) {
		List<Desafio> desafios = new ArrayList<Desafio>();
		for (Desafio desafio : proyecto.getDesafios()) {
			if (!user.contieneDesafio(desafio)) {
				desafios.add(desafio);
			}
		}
		return desafios;
	}
}
