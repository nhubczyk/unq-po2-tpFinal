package ar.edu.unq.poo2.tpfinal;

public class PreferenciasUsuario {
	private int cantidadMuestras;
	private int dificultad;
	private int recompensaPreferida;
	private Desafio desafioPreferido;

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
