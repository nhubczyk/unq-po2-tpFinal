package ar.edu.unq.poo2.tpfinal;

public class FiltroCategoria extends Filtro {

	private Categoria categoriaAFiltrar;
	
	public FiltroCategoria(Categoria categoriaAFiltrar) {
		this.categoriaAFiltrar = categoriaAFiltrar;
	}
	
	@Override
	public boolean cumpleFiltro(Proyecto p) {
		return p.getCategorias().contains(categoriaAFiltrar);
	}

}
