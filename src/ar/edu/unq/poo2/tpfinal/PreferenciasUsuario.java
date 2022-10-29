package ar.edu.unq.poo2.tpfinal;

public class PreferenciasUsuario {
	int cantidadMuestras;
	int dificultad;
	int recompensaPreferida;
	Desafio desafioPreferido;

	public void setCantidadMuestras(int cantidadMuestras) {
		this.cantidadMuestras = cantidadMuestras;
	}

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

	public void setRecompensaPreferida(int recompensaPreferida) {
		this.recompensaPreferida = recompensaPreferida;
	}

	public void setDesafioPreferido(Desafio desafioPreferido) {
		this.desafioPreferido = desafioPreferido;
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
