package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;

public class DesafioActivo extends DesafioAceptado {

	@Override
	public float porcentajeCompletitud() {
		return (desafioUsuario.getCantidadMuestrasNecesarias()
				/ desafioUsuario.getCantidadMuestrasRecolectadas()) 
				* 100;
	}

	@Override
	public LocalDate getMomentoSuperacion() {
		return null;
	}

	@Override
	public Boolean puedeAgregarMuestra() {
		return true;
	}

	@Override
	public Boolean fueCompletado() {
		return false;
	}

	@Override
	public void aceptarDesafio() {
		// No hace nada porque ya esta aceptado.
	}

}
