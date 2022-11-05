package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DesafioUsuario  {
	private EstadoDeDesafio estado;
	private Desafio desafioConcreto;
	private List<Muestra> muestras = new ArrayList<Muestra>();
	
	public DesafioUsuario(Desafio desafioConcreto) {
		this.desafioConcreto=desafioConcreto;
		this.estado=new DesafioNoAceptado();
	}
	
	public LocalDate getMomentoSuperacion() {
		return estado.getMomentoSuperacion();
	}
	

	public void setEstado(EstadoDeDesafio estado) {
		this.estado=estado;
	}

	public int getCantidadMuestrasNecesarias() {
		return this.desafioConcreto.getCantidadMuestras();
	}

	public int getCantidadMuestrasRecolectadas() {
		return this.muestras.size();
	}

	public float getPorcentajeCompletitud() {
		return estado.porcentajeCompletitud();
	}


}