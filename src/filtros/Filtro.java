package filtros;

import java.util.ArrayList;
import java.util.List;

import SinImplementar.Proyecto;

public abstract class Filtro {
	public abstract boolean cumpleFiltro(Proyecto p);
	
	public List<Proyecto> cumplenFiltro(List<Proyecto> proyectos) {
		List<Proyecto> losQueCumplen = new ArrayList<Proyecto>();
		for(Proyecto p: proyectos) {
			if(cumpleFiltro(p)) {
				losQueCumplen.add(p);
			}
		}
		return losQueCumplen;
	}
}
