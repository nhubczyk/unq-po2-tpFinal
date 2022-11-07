package ar.edu.unq.poo2.tpfinal;

public class Desafio implements Puntuable {
	private int cantidadMuestrasNecesarias;
	private int dificultad;
	private int recompensa;

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

	public void setRecompensa(int recompensa) {
		this.recompensa = recompensa;
	}


	public void setCantidadMuestrasNecesarias(int cantidadMuestrasNecesarias) {
		this.cantidadMuestrasNecesarias = cantidadMuestrasNecesarias;
	}



	@Override
	public int getRecompensa() {
		return recompensa;
	}

	@Override
	public int getDificultad() {
		return dificultad;
	}

	@Override
	public int getCantidadMuestras() {
		return cantidadMuestrasNecesarias;
	}

	public int similitudConDesafio(Desafio desafio) {
		return Math.abs(desafio.getDificultad() - this.getDificultad())
				+ Math.abs(desafio.getCantidadMuestras() - this.getCantidadMuestras())
				+ Math.abs(desafio.getRecompensa() - this.getRecompensa());
	}

}
