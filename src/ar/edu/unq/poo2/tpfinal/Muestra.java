package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;

public class Muestra {
	private LocalDate fechaYHora;
	private Coordenada coordenada;
	private Usuario usuario;
	
	public Muestra(LocalDate fechaYHora, Coordenada coordenada, Usuario user) {
		this.fechaYHora=fechaYHora;
		this.coordenada=coordenada;
		this.usuario=user;
	}

	public LocalDate getFechaYHora() {
		return fechaYHora;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public Usuario getUsuario() {
		return usuario;
	}
}
