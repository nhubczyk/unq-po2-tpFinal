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
	
	public Proyecto(String nom, String descripcion) {
		this.setNombre(nom);
		this.setDescripcion(descripcion);
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
	
	public List<Categoria> listadoDeCategorias() {
		var categoriasADevolver = new ArrayList<Categoria>(categorias);
		return categoriasADevolver;
	}
	
	public void addCategoria(Categoria cat) {
		this.categorias.add(cat);
	}
	
	public void suscribir(Usuario user) {
		this.participantes.add(user);
	}

	public Boolean contieneUsuario(Usuario user) {
		return this.participantes.contains(user);
	}
	
	public void addMuestra(Muestra muestra) {
		this.muestras.add(muestra);
	}
	
	public Boolean tieneMuestra(Muestra muestra) {
		return this.muestras.contains(muestra);
	}
	
	public List<Muestra> listadoDeMuestras() {
		var muestrasADevolver = new ArrayList<Muestra>(muestras);
		return muestrasADevolver;
	}
	
	
}
