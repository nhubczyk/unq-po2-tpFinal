package filtros;

import java.util.List;

import SinImplementar.Proyecto;

public class FiltroOr extends Filtro {

	public List<Filtro> subFiltros;
	
	public FiltroOr(List<Filtro> subFiltros) {
		this.subFiltros = subFiltros;
	}
	
	@Override
	public boolean cumpleFiltro(Proyecto p) {
		for(Filtro f: subFiltros) {
			if (f.cumpleFiltro(p)) return true;
		}
		return false;
	}

}
