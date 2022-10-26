package ar.edu.unq.poo2.tpfinal;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CienciaParticipativaTestCase {
	private CienciaParticipativa ciencia; //SUT
	private Proyecto proyecto; // DOC
	private Proyecto proyecto2; // DOC
	
	@Before
	public void setUp() {
		proyecto = mock(Proyecto.class);
		proyecto2 = mock(Proyecto.class);
	}
	
	@Test
	void testAgregarProyecto() {
		ciencia = new CienciaParticipativa();
		assertFalse(ciencia.tieneElElemento(proyecto2));
		ciencia.addProyecto(proyecto);
		assertTrue(ciencia.tieneElElemento(proyecto));
	}

}