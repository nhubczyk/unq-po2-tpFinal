package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;

public class DesafioCompletado extends DesafioAceptado {
	private LocalDate momentoSuperacion;

	public DesafioCompletado(int voto) {
		this.momentoSuperacion=LocalDate.now();
		this.votoGuardado=voto;
	}
	
	@Override
	public float porcentajeCompletitud() {
		return 100f;
	}

	@Override
	public LocalDate getMomentoSuperacion() {
		return this.momentoSuperacion;
	}

	@Override
	public Boolean puedeAgregarMuestra() {
		return false;
	}

	@Override
	public Boolean fueCompletado() {
		return true;
	}

	@Override
	public void aceptarDesafio() {
		// No hace nada porque esta completado.
	}

}
