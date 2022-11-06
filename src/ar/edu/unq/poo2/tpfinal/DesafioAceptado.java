package ar.edu.unq.poo2.tpfinal;

import java.util.ArrayList;
import java.util.List;

public abstract class DesafioAceptado extends EstadoDeDesafio {
	protected List<Muestra> muestras = new ArrayList<Muestra>();
	
	public DesafioAceptado(DesafioUsuario desafio) {
		super(desafio);
	}


	protected int votoGuardado;
	
	
	public Boolean votarDesafio(int voto) {
		if(voto >= 0 && voto <=5) {
			this.votoGuardado=voto;
			return true;
		}
		return false;
	}
	
	public List<Muestra> getMuestras() {
		return this.muestras;
	}
}
