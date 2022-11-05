package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;

public abstract class EstadoDeDesafio {
	public DesafioUsuario desafioUsuario;
	
	public EstadoDeDesafio(DesafioUsuario desafio) {
		this.desafioUsuario=desafio;
	}
	
	public abstract Boolean votarDesafio(int voto);
	
	public abstract float porcentajeCompletitud();
	
	public abstract LocalDate getMomentoSuperacion();
	
	public abstract Boolean puedeAgregarMuestra();
	
	public abstract Boolean fueCompletado();
	
	public abstract void aceptarDesafio();
}
