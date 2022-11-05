package ar.edu.unq.poo2.tpfinal;

import java.util.List;

public abstract class Recomendacion {

	public abstract List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto);

	public abstract List<Desafio> nDesafiosConMayorCoincidencia(int cantidad, List<Desafio> desafiosNoAceptados,
			Usuario usuario);

}
