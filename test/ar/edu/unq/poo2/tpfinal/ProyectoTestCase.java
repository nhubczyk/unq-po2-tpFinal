package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class ProyectoTestCase {
	private Proyecto proyecto; // SUT
	private Categoria categoria; // DOC
	
	@Before
	public void setUp() {
		proyecto = new Proyecto();
		categoria = mock(Categoria.class);
	}
	
	@Test
	void testGetNombre() {
		assertEquals("Biotecnologia", proyecto.getNombre());
	}

}
