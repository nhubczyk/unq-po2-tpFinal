package ar.edu.unq.poo2.tpfinal;

import java.util.ArrayList;
import java.util.List;

public class CienciaParticipativa {
	private List<Proyecto> proyectos = new ArrayList<Proyecto>();
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private List<Categoria> categorias = new ArrayList<Categoria>();
	
	public CienciaParticipativa() {
		
	}

	public void addProyecto(Proyecto proyecto) {
		proyectos.add(proyecto);
	}

	public Boolean tieneElElemento(Proyecto proyecto) {
		return proyectos.contains(proyecto);
	}
	
	public List<Proyecto> filtrarProyectos(Filtro filtro) {
		return filtro.cumplenFiltro(proyectos);	
	}
	
	public void agregarUsuario(Usuario user) {
		this.usuarios.add(user);
	}
	
	public void agregarCategoria(Categoria cat) {
		this.categorias.add(cat);
	}
	
}
