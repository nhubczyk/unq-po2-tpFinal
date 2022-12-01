package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;
import java.util.List;

public abstract class EstadoDeDesafio {
	public DesafioUsuario desafioUsuario;
	
	public EstadoDeDesafio(DesafioUsuario desafio) {
		this.desafioUsuario=desafio;
	}
	
	public abstract void votarDesafio(int voto) throws Exception;
	
	public abstract float porcentajeCompletitud();
	
	public abstract LocalDate getMomentoSuperacion();
	
	public abstract Boolean puedeAgregarMuestra();
	
	public abstract Boolean fueCompletado();
	
	public abstract void aceptarDesafio();

	public abstract List<Muestra> getMuestras();

	public abstract void agregarMuestra(Muestra muestra);
}
