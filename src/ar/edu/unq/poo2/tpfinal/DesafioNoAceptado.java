package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DesafioNoAceptado extends EstadoDeDesafio {

	public DesafioNoAceptado(DesafioUsuario desafio) {
		super(desafio);
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
		this.desafioUsuario.setEstado(new DesafioActivo(desafioUsuario));
	}

	@Override
	public List<Muestra> getMuestras() {
		return new ArrayList<Muestra>();
	}

	@Override
	public void agregarMuestra(Muestra muestra) {
		// No hace nada porque es desafio no aceptado.	
	}


	@Override
	public void votarDesafio(int voto) throws Exception {
		// 	No hace nada ya que es un desafio no aceptado.
	}


}
