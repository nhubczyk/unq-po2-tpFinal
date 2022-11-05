package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;

public class DesafioNoAceptado extends EstadoDeDesafio {

	@Override
	public Boolean votarDesafio(int voto) {
		return false;
	}

	@Override
	public LocalDate getMomentoSuperacion() {
		return null;
	}

	@Override
	public Boolean puedeAgregarMuestra() {
		return false;
	}

	@Override
	public Boolean fueCompletado() {
		return false;
	}

	@Override
	public float porcentajeCompletitud() {
		return 0.00f;
	}

	@Override
	public void aceptarDesafio() {
		this.desafioUsuario.setEstado(new DesafioActivo());
	}


}
