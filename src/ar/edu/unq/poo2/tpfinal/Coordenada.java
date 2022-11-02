package ar.edu.unq.poo2.tpfinal;

public class Coordenada {
	private float latitud;
	private float longitud;
	
	public Coordenada(float lat, float longi) {
		this.latitud=lat;
		this.longitud=longi;
	}
	
	public float getLatitud() {
		return latitud;
	}

	public float getLongitud() {
		return longitud;
	}
}
