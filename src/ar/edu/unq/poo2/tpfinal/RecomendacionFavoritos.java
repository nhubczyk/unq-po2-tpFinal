package ar.edu.unq.poo2.tpfinal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RecomendacionFavoritos extends Recomendacion {

	@Override
	public List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto) {
		List<Desafio> desafiosRecomendados = this.nDesafiosConMayorCoincidencia(20,
				this.desafiosSinAceptar(proyecto, usuario), usuario);
		Desafio desafioFav = usuario.getPreferenciasUsuario().getDesafioPreferido();
		return desafiosRecomendados.stream()
				.sorted((d1, d2) -> Float.compare(d1.similitudConDesafio(desafioFav), 
												d2.similitudConDesafio(desafioFav)))
				.limit(5).toList();
	}
	


}
