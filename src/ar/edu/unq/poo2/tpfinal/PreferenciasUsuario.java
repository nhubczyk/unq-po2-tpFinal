package ar.edu.unq.poo2.tpfinal;

public class PreferenciasUsuario implements Puntuable {
	int cantidadMuestras;
	int dificultad;
	int recompensaPreferida;
	Desafio desafioPreferido;

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

	@Override
	public int getRecompensa() {
		return this.recompensaPreferida;
	}

	@Override
	public int getDificultad() {
		return this.dificultad;
	}

	@Override
	public int getCantidadMuestras() {
		return this.cantidadMuestras;
	}

}
