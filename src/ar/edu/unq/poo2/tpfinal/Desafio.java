package ar.edu.unq.poo2.tpfinal;

public class Desafio {
	//se crea la clase para q compile usuario
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

	public int getDificultad() {
		// TODO Auto-generated method stub
		return dificultad;
	}

	public int getCantidadMuestrasRecolectadas() {
		return cantidadMuestrasNecesarias - 3;
	}

	public int getCantidadMuestrasNecesarias() {
		return cantidadMuestrasNecesarias;
	}

	public void setCantidadMuestrasNecesarias(int cantidadMuestrasNecesarias) {
		this.cantidadMuestrasNecesarias = cantidadMuestrasNecesarias;
	}


	public int getRecompensa() {
		// TODO Auto-generated method stub
		return recompensa;
	}

	public float getPorcentajeCompletitud() {
		// TODO Auto-generated method stub
		return porcentaje;
	}
	
	public float setPorcentajeCompletitud(float cantidad) {
		return porcentaje = cantidad;
	}
	
	
}
