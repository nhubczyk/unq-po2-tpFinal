package ar.edu.unq.poo2.tpfinal;

public class Area {
	private Coordenada coordenada;
	private float radio;
	
	public Area(Coordenada coordenada, float radio) throws Exception {
		if(radio < 0f) {
			throw new Exception("No se puede instanciar area con un radio menor a 0");
		}
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
