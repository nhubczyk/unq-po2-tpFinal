package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;

public abstract class EstadoDeDesafio {
	protected DesafioUsuario desafioUsuario;
	
	public abstract Boolean votarDesafio(int voto);
	
	public abstract float porcentajeCompletitud();
	
	public abstract LocalDate getMomentoSuperacion();
	
	public abstract Boolean puedeAgregarMuestra();
	
	public abstract Boolean fueCompletado();
	
	public abstract void aceptarDesafio();
}
