package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class ProyectoTestCase {
	private Proyecto proyecto; // SUT
	private Categoria categoria; // DOC
	private Categoria categoria2; 
	private Categoria categoria3;
	private Usuario user; // DOC
	
	@Before
	public void setUp() {
		categoria = mock(Categoria.class);
		categoria2 = mock(Categoria.class);
		categoria3 = mock(Categoria.class);
		user = mock(Usuario.class);
	}
	
	@Test
	void testGetNombre() {
		proyecto = new Proyecto("Biotecnologia", "Proyecto biotecnologo");
		assertEquals("Biotecnologia", proyecto.getNombre());
	}
	
	@Test
	void testListadoDeCategorias() {
		proyecto = new Proyecto("Biotecnologia", "Proyecto biotecnologo");
		assertFalse(proyecto.listadoDeCategorias().contains(categoria2));
		proyecto.addCategoria(categoria);
		proyecto.addCategoria(categoria2);
		proyecto.addCategoria(categoria3);
		assertTrue(proyecto.listadoDeCategorias().contains(categoria));
	}
	
	@Test
	void testSuscribirUsuario() {
		proyecto = new Proyecto("Biotecnologia", "Proyecto biotecnologo");
		proyecto.suscribir(user);
		assertTrue(proyecto.contieneUsuario(user));
	}

}
