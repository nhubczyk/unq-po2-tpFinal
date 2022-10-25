package ar.edu.unq.poo2.tpfinal;

import java.util.List;

public class FiltroAnd extends Filtro{

	public List<Filtro> subFiltros;
	
	public FiltroAnd(List<Filtro> subFiltros) {
		this.subFiltros = subFiltros;
	}
	
	@Override
	public boolean cumpleFiltro(Proyecto p) {
		for(Filtro f: subFiltros) {
			if (!f.cumpleFiltro(p)) return false ;
		}
		return true;
	}
	
}
