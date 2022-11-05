package ar.edu.unq.poo2.tpfinal;


public class FiltroAnd extends FiltroCompuesto{
	
	public FiltroAnd(Filtro subFiltro1, Filtro subFiltro2) {
		super(subFiltro1, subFiltro2);
	}

	@Override
	public boolean cumpleFiltro(Proyecto p) {
		return (subFiltro1.cumpleFiltro(p) && subFiltro2.cumpleFiltro(p));
	}
	
	
}
