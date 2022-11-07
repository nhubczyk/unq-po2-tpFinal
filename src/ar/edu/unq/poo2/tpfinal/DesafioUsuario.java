package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;
import java.util.List;

public class DesafioUsuario  {
	private EstadoDeDesafio estado;

	private Desafio desafioConcreto;

	
	public DesafioUsuario(Desafio desafioConcreto) {
		this.desafioConcreto=desafioConcreto;
		this.estado=new DesafioNoAceptado(this);
	}
	
	public LocalDate getMomentoSuperacion() {
		return estado.getMomentoSuperacion();
	}

	public void setEstado(EstadoDeDesafio estado) {
		this.estado = estado;
	}

	public int getCantidadMuestrasNecesarias() {
		return this.desafioConcreto.getCantidadMuestras();
	}

	public List<Muestra> getMuestrasRecolectadas() {
		return this.estado.getMuestras();
	}

	public float getPorcentajeCompletitud() {
		return estado.porcentajeCompletitud();
	}

	public Desafio getDesafio() {
		return desafioConcreto;
	}

	public EstadoDeDesafio getEstado() {
		return estado;
	}
	
	public void agregarMuestra(Muestra muestra) {
		this.estado.agregarMuestra(muestra);
	}

	public int getCantidadMuestrasRecolectadas() {
		return this.getMuestrasRecolectadas().size();
	}
	
	public boolean fueCompletado() {
		return this.estado.fueCompletado();
	}

}