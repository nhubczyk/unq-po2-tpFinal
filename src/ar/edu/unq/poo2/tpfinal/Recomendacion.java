package ar.edu.unq.poo2.tpfinal;

import java.util.Comparator;
import java.util.List;

public abstract class Recomendacion {
	
	
	public abstract List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto);

	public List<Desafio> nDesafiosConMayorCoincidencia(int cantidad,List<Desafio> desafiosNoAceptados,Usuario usuario){
		List<Desafio> desafiosCoincidencia = desafiosNoAceptados.stream()
            .sorted(Comparator.comparingInt(d -> diferenciaEntreDesafiosYPreferencia(d, usuario.getPreferenciasUsuario())))
            .limit(cantidad)
            .toList()
            ;
		return desafiosCoincidencia;
	}
	public int diferenciaEntreDesafiosYPreferencia(Desafio desafio, PreferenciasUsuario preferencias) {
		return Math.abs(desafio.getDificultad() - preferencias.getDificultad())
				+ Math.abs(desafio.getCantidadMuestrasRecolectadas() - preferencias.getCantidadMuestras())
				+ Math.abs(desafio.getRecompensa() - preferencias.getRecompensaPreferida());
	}
}

/*
 estuve pensando en como hacer esto de otra manera ya que siento que tiene un error ya que
 una de las formas de calcular necesita de las preferencias, que es la que implementamos
 PERO la otra necesita de comparar contra un Desafio en concreto, que es el que tiene en las
 preferencias, mi idea es la siguiente, la voy a plasmar en este y en las otras clases 
 para que veamos como funcionan, ademas tengo problemas con los test xdxd
 */

//quedaria asi aunque siento que repite mucho codigo y va a ser algo que señalen los profes

/*
public abstract class Recomendacion {
	public abstract List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto);

	public abstract List<Desafio> nDesafiosConMayorCoincidencia(int cantidad, List<Desafio> desafiosNoAceptados,
			Usuario usuario);

} 
 */
