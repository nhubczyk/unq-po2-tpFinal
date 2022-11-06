package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;
import java.util.List;

public class DesafioCompletado extends DesafioAceptado {
	private LocalDate momentoSuperacion;

	public DesafioCompletado(DesafioUsuario desafio, int voto, List<Muestra> listaDeMuestras) {
		super(desafio);
		this.momentoSuperacion=LocalDate.now();
		this.votoGuardado=voto;
		this.muestras=listaDeMuestras;
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

	@Override
	public void agregarMuestra(Muestra muestra) {
		// No hace nada porque esta completado.
	}

}
