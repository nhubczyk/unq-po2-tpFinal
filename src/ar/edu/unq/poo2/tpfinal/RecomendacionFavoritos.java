package ar.edu.unq.poo2.tpfinal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RecomendacionFavoritos implements Recomendacion {

	@Override
	public List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto) {
		List<Desafio> desafiosRecomendados = usuario.nDesafiosConMayorCoincidencia(20, proyecto);
		return usuario.nDesafiosConMayorSimilitud(5, desafiosRecomendados);
	}


}
