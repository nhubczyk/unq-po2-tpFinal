package ar.edu.unq.poo2.tpfinal;

public class PreferenciasUsuario implements Puntuable {
	int cantidadMuestras;
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


	public int diferenciaConDesafio(Desafio desafio) {
		return Math.abs(desafio.getDificultad() - this.getDificultad())
				+ Math.abs(desafio.getCantidadMuestrasRecolectadas() - this.getCantidadMuestras())
				+ Math.abs(desafio.getRecompensa() - this.getRecompensa());
	}

	public Desafio getDesafioPreferido() {
		return desafioPreferido;
	}

	@Override
	public int getRecompensa() {
		return recompensaPreferida;
	}

	@Override
	public int getDificultad() {
		return dificultad;
	}

	@Override
	public int getCantidadMuestras() {
		return cantidadMuestras;
	}

}
