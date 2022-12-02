package ar.edu.unq.poo2.tpfinal;

import java.util.Comparator;
import java.util.List;

public class RecomendacionPreferencia implements Recomendacion {

	@Override
	public List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto) {
		return usuario.nDesafiosConMayorCoincidencia(5, proyecto);
	}

}
