package filtros;

import SinImplementar.Proyecto;

public class FiltroNombre extends Filtro {

	private String nombreAFiltrar;
	
	public FiltroNombre(String nombreAFiltrar) {
		this.nombreAFiltrar = nombreAFiltrar;
	}
	
	private String getNombreAFiltrar() {
		return nombreAFiltrar;
	}
	@Override
	public boolean cumpleFiltro(Proyecto p) {
		// TODO Auto-generated method stub
		return p.getNombre().toLowerCase().contains(getNombreAFiltrar().toLowerCase());
	}

}
