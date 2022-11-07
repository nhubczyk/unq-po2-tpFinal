package ar.edu.unq.poo2.tpfinal;

public class Categoria {
	private String nombre;
	private String descripcion;
	
	public Categoria(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

}
