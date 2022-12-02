package ar.edu.unq.poo2.tpfinal;

public class PreferenciasUsuario  {
	int cantidadMuestras;
	int dificultad;
	int recompensaPreferida;
	Desafio desafioPreferido;
	
	public PreferenciasUsuario(int cantidadMuestras, int dificultad, int recompensaPreferida,
			Desafio desafioPreferido) {
		setCantidadMuestras(cantidadMuestras);
		setDificultad(dificultad);
		setRecompensaPreferida(recompensaPreferida);
		setDesafioPreferido(desafioPreferido);
	}
	

	public void setCantidadMuestras(int cantidadMuestrasNueva) {
		this.cantidadMuestras = cantidadMuestrasNueva;
	}

	public void setDificultad(int dificultadNueva) {
		this.dificultad = dificultadNueva;
	}

	public void setRecompensaPreferida(int recompensaPreferidaNueva) {
		this.recompensaPreferida = recompensaPreferidaNueva;
	}

	public void setDesafioPreferido(Desafio desafioPreferidoNueva) {
		this.desafioPreferido = desafioPreferidoNueva;
	}

	public int diferenciaConDesafio(Desafio desafio) {
		return Math.abs(desafio.getDificultad() - this.getDificultad())
				+ Math.abs(desafio.getCantidadMuestras() - this.getCantidadMuestras())
				+ Math.abs(desafio.getRecompensa() - this.getRecompensa());
	}

	public Desafio getDesafioPreferido() {
		return this.desafioPreferido;
	}


	public int getRecompensa() {
		return this.recompensaPreferida;
	}

	public int getDificultad() {
		return this.dificultad;
	}

	public int getCantidadMuestras() {
		return this.cantidadMuestras;
	}

}
