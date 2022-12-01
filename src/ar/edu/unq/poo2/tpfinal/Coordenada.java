package ar.edu.unq.poo2.tpfinal;

public class Coordenada {
	private float latitud;
	private float longitud;
	
	public Coordenada(float latitud, float longitud) {
		this.latitud=latitud;
		this.longitud=longitud;
	}
	
	public float getLatitud() {
		return latitud;
	}

	public float getLongitud() {
		return longitud;
	}
}
