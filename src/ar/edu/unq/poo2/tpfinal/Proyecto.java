package ar.edu.unq.poo2.tpfinal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class Proyecto {
	private String nombre;
	private String descripcion;
	private List<Categoria> categorias = new ArrayList<Categoria>();
	private List<Muestra> muestras = new ArrayList<Muestra>();
	private List<Usuario> participantes = new ArrayList<Usuario>();
	private List<Desafio> desafios = new ArrayList<Desafio>();
	
	public Proyecto(String nom, String descripcion, Categoria categoria) {
		this.setNombre(nom);
		this.setDescripcion(descripcion);
		this.agregarCategoria(categoria);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nom) {
		this.nombre=nom;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion=descripcion;
	}
	
	public List<Categoria> getCategorias() {
		return categorias;
	}
	
	public void agregarCategoria(Categoria cat) {
		this.categorias.add(cat);
	}
	
	public void suscribir(Usuario user) {
		this.participantes.add(user);
	}

	public Boolean contieneUsuario(Usuario user) {
		return this.participantes.contains(user);
	}
	
	public void agregarMuestra(Muestra muestra) {
		this.muestras.add(muestra);
	}
	
	public Boolean tieneMuestra(Muestra muestra) {
		return this.muestras.contains(muestra);
	}
	
	public List<Muestra> getMuestras() {
		return muestras;
	}

	public List<Desafio> getDesafios() {
		return desafios;
	}
	
	public void agregarDesafio(Desafio desafio) {
		desafios.add(desafio);
	}
	
	public List<Desafio> getRecomendaciones(Usuario user) {
		return user.getMetodoRecomendacion().desafiosRecomendadosSegunValor(user, this);
	}
	
	public void agregarUsuario(Usuario user) {
		this.participantes.add(user);
	}
}
