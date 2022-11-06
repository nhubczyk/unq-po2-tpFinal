package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;

public class DesafioActivo extends DesafioAceptado {

	public DesafioActivo(DesafioUsuario desafio) {
		super(desafio);
	}

	@Override
	public float porcentajeCompletitud() {
		return  ((float) this.getCantidadDeMuestrasRecolectadas()
				/ desafioUsuario.getCantidadMuestrasNecesarias()) 
				* 100;
	}
	
	public int getCantidadDeMuestrasRecolectadas() {
		return this.muestras.size();
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

	@Override
	public void agregarMuestra(Muestra muestra) {
		this.muestras.add(muestra);
		this.chequearCompletitud();
	}
	
	private void chequearCompletitud() {
		if(desafioUsuario.getCantidadMuestrasNecesarias() <= this.getCantidadDeMuestrasRecolectadas()) {
			desafioUsuario.setEstado(new DesafioCompletado(desafioUsuario, votoGuardado, muestras));
		}
	}

}
