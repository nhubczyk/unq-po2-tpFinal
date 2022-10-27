package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProyectoTestCase {
	private Proyecto proyecto; // SUT
	private Categoria categoria; // DOC
	private Categoria categoria2; 
	private Categoria categoria3;
	private Usuario user; // DOC
	private Usuario user2;
	private Muestra muestra; 
	private Muestra muestra2;
	
	@BeforeEach
	public void setUp() {
		proyecto = new Proyecto("Biotecnologia", "Proyecto biotecnologo");
		categoria = mock(Categoria.class);
		categoria2 = mock(Categoria.class);
		categoria3 = mock(Categoria.class);
		user = mock(Usuario.class);
		user2 = mock(Usuario.class);
		muestra = mock(Muestra.class);
		muestra2 = mock(Muestra.class);
	}
	
	@Test
	void testGetNombre() {
		assertEquals("Biotecnologia", proyecto.getNombre());
	}
	
	@Test
	void testNotGetNombre() {
		assertNotEquals("Sociales", proyecto.getNombre());
	}
	
	@Test
	void testListadoDeCategorias() {
		proyecto.addCategoria(categoria);
		proyecto.addCategoria(categoria2);
		proyecto.addCategoria(categoria3);
		assertTrue(proyecto.getCategorias().contains(categoria));
	}
	
	@Test
	void testNoListadoDeCategorias() {
		proyecto.addCategoria(categoria);
		proyecto.addCategoria(categoria2);
		assertFalse(proyecto.getCategorias().contains(categoria3));
	}
	
	@Test
	void testSuscribirUsuario() {
		proyecto.suscribir(user);
		assertTrue(proyecto.contieneUsuario(user));
	}
	
	@Test
	void testNoSuscribirUsuario() {
		proyecto.suscribir(user2);
		assertFalse(proyecto.contieneUsuario(user));
	}
	
	@Test
	void testAddMuestra() {
		proyecto.addMuestra(muestra);
		assertTrue(proyecto.tieneMuestra(muestra));
	}
	
	@Test
	void testNotAddMuestra() {
		proyecto.addMuestra(muestra);
		assertFalse(proyecto.tieneMuestra(muestra2));
	}
	
	@Test
	void testListadoDeMuestras() {
		proyecto.addMuestra(muestra);
		proyecto.addMuestra(muestra2);
		assertTrue(proyecto.getMuestras().contains(muestra));
	}
	
	@Test
	void testNoListadoDeMuestra() {
		proyecto.addMuestra(muestra);
		assertFalse(proyecto.getMuestras().contains(muestra2));
	}

}
