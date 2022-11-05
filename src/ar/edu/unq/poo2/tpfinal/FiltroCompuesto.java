package ar.edu.unq.poo2.tpfinal;

public abstract class FiltroCompuesto extends Filtro {
	protected Filtro subFiltro1;
	protected Filtro subFiltro2;
	
	public FiltroCompuesto(Filtro subFiltro1, Filtro subFiltro2) {
		this.subFiltro1 = subFiltro1;
		this.subFiltro2 = subFiltro2;
	}
}
