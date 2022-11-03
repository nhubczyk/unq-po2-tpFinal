package ar.edu.unq.poo2.tpfinal;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
	public abstract boolean cumpleFiltro(Proyecto p);
	
	public List<Proyecto> cumplenFiltro(List<Proyecto> proyectos) {
		List<Proyecto> losQueCumplen = new ArrayList<Proyecto>();
		for(Proyecto p: proyectos) {
			anhadirAListaSiCumpleFiltro(p, losQueCumplen);
		}
		return losQueCumplen;
	}
	
	private void anhadirAListaSiCumpleFiltro(Proyecto p, List<Proyecto> listaAAnhadir) {
		if(cumpleFiltro(p)) {
			listaAAnhadir.add(p);
		}
	}

}
