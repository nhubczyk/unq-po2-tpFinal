package ar.edu.unq.poo2.tpfinal;

public class Desafio implements Puntuable {
	private int cantidadMuestrasNecesarias;
	private float porcentaje;
	private int dificultad;
	private int recompensa;

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

	public void setRecompensa(int recompensa) {
		this.recompensa = recompensa;
	}

	public float setPorcentajeCompletitud(float cantidad) {
		return porcentaje = cantidad;
	}

	public void setCantidadMuestrasNecesarias(int cantidadMuestrasNecesarias) {
		this.cantidadMuestrasNecesarias = cantidadMuestrasNecesarias;
	}

	public int getCantidadMuestrasRecolectadas() {
		return cantidadMuestrasNecesarias - 3;
	}

	public float getPorcentajeCompletitud() {
		return porcentaje;
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
				+ Math.abs(desafio.getCantidadMuestrasRecolectadas() - this.getCantidadMuestras())
				+ Math.abs(desafio.getRecompensa() - this.getRecompensa());
	}

}
