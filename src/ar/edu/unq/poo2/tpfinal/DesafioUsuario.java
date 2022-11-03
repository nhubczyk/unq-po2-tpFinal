package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;

public class DesafioUsuario extends Desafio {

	private LocalDate momentoSuperacion;

	public LocalDate getMomentoSuperacion() {
		return momentoSuperacion;
	}
	
	public void setMomentoSuperacion(LocalDate fecha) {
		momentoSuperacion = fecha;
	}


}