package ar.edu.unq.poo2.tpfinal;

import java.util.Comparator;
import java.util.List;

public class RecomendacionPreferencia extends Recomendacion {

	@Override
	public List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto) {
		return this.nDesafiosConMayorCoincidencia(5, this.desafiosSinAceptar(proyecto, usuario), usuario);
	}

}
