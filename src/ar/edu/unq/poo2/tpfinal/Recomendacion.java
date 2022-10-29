package ar.edu.unq.poo2.tpfinal;

import java.util.List;

public abstract class Recomendacion {
	public abstract List<Desafio> desafiosRecomendadosSegunValor(Usuario usuario, Proyecto proyecto);

	//public List<Desafio> nDesafiosConMayorCoincidencia(int cantidad,List<Desafio> desafiosNoAceptados,Usuario usuario){
		//la lista de desafios no debe haber sido aceptada por el usuario
		//for (Desafio desafio : desafiosNoAceptados) {
			
	//	}
		//return desafiosNoAceptados.sort()).forEachOrdered(this.diferenciaEntreDesafiosYPreferencia(, null));, usuario.getPreferenciasUsuario())).sequential().limit(cantidad).toList();
	//}

	public int diferenciaEntreDesafiosYPreferencia(Desafio desafio, PreferenciasUsuario preferencias) {
		return Math.abs(desafio.getDificultad() - preferencias.getDificultad())
				+ Math.abs(desafio.getCantidadMuestrasRecolectadas() - preferencias.getCantidadMuestras())
				+ Math.abs(desafio.getRecompensa() - preferencias.getRecompensaPreferida());
	}
}
