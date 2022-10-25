package ar.edu.unq.poo2.tpfinal;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
	private String nombre;
	private String descripcion;
	private List<Categoria> categorias = new ArrayList<Categoria>();
	
	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public String listadoDeCategorias() {
		var nombres = "";
		Categoria[] cat = null;
		for(Categoria categoria: cat) {
			nombres = categoria.getNombre();
		}
		return nombres;
	}
}
