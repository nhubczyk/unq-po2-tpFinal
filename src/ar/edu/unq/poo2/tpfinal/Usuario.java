package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private List<DesafioUsuario> desafiosCompletos = new ArrayList<DesafioUsuario>();

	public float porcentajeCompletitud(DesafioUsuario desafio) {
		return desafio.getPorcentajeCompletitud();
	}
	
	public boolean esCompletado(Desafio desafio) {
		return desafiosCompletos.contains(desafio); 
	}
	
}
