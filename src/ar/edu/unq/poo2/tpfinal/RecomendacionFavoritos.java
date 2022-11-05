package ar.edu.unq.poo2.tpfinal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RecomendacionFavoritos extends Recomendacion {

	@Override
	public List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto) {
		List<Desafio> desafiosRecomendados = this.nDesafiosConMayorCoincidencia(20, proyecto.getDesafios(), usuario);
		return desafiosRecomendados.stream()
				.sorted(Comparator.comparingInt(
						d -> d.similitudConDesafio(usuario.getPreferenciasUsuario().getDesafioPreferido())))
				.limit(5).toList();
	}

}
