package ar.edu.unq.poo2.tpfinal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public interface Recomendacion {
	public abstract List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto);
}
