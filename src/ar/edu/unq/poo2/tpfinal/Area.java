package ar.edu.unq.poo2.tpfinal;

public class Area {
	private Coordenada coordenada;
	private float radio;
	
	public Area(Coordenada coordenada, float radio) {
		this.coordenada=coordenada;
		this.radio=radio;
	}

	public float getRadio() {
		return radio;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}
}
