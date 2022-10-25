package ar.edu.unq.poo2.tpfinal;

public class FiltroNot extends Filtro{

	Filtro subFiltro;
	
	public FiltroNot(Filtro subFiltro) {
		this.subFiltro = subFiltro;
	}
	
	@Override
	public boolean cumpleFiltro(Proyecto p) {
		return !(subFiltro.cumpleFiltro(p));
	}

}
