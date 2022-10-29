package ar.edu.unq.poo2.tpfinal;

import java.util.List;

public class recomendacionFavoritos extends Recomendacion{


	@Override
	public List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto) {
		return this.nDesafiosConMayorCoincidencia(5, proyecto.getDesafios(), usuario);
	}
	
}
