package ar.edu.unq.poo2.tpfinal;

public abstract class DesafioAceptado extends EstadoDeDesafio {
	protected int votoGuardado;
	
	
	public Boolean votarDesafio(int voto) {
		if(voto >= 0 && voto <=5) {
			this.votoGuardado=voto;
			return true;
		}
		return false;
	}
}
