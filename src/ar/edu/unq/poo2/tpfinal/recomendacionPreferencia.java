package ar.edu.unq.poo2.tpfinal;

import java.util.List;

public class recomendacionPreferencia extends Recomendacion{

	@Override
	public List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto) {
		return this.nDesafiosConMayorCoincidencia(20, proyecto.getDesafios(), usuario).stream()
				.limit(5)
				.toList();
	}
	
}
