package ar.edu.unq.poo2.tpfinal;

public class PreferenciasUsuario {
	int cantidadMuestras=0;
	int dificultad;
	int recompensaPreferida;
	Desafio desafioPreferido;

	public void setCantidadMuestras(int cantidadMuestrasNueva) {
		cantidadMuestras = cantidadMuestrasNueva;
	}

	public void setDificultad(int dificultadNueva) {
		dificultad = dificultadNueva;
	}

	public void setRecompensaPreferida(int recompensaPreferidaNueva) {
		recompensaPreferida = recompensaPreferidaNueva;
	}

	public void setDesafioPreferido(Desafio desafioPreferidoNueva) {
		desafioPreferido = desafioPreferidoNueva;
	}

	public Desafio getDesafioPreferido() {
		return desafioPreferido;
	}

	public int getRecompensaPreferida() {
		return recompensaPreferida;
	}

	public int getDificultad() {
		return dificultad;
	}

	public int getCantidadMuestras() {
		return cantidadMuestras;
	}

}
