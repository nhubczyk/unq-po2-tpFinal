package ar.edu.unq.poo2.tpfinal;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CienciaParticipativaTestCase {
	private CienciaParticipativa ciencia; //SUT
	private Proyecto proyecto; // DOC
	
	@Before
	public void setUp() {
		ciencia = new CienciaParticipativa();
		proyecto = mock(Proyecto.class);
	}
	
	@Test
	void testAgregarProyecto() {
		ciencia.addProyecto(proyecto);
		assertTrue(ciencia.tieneElElemento(proyecto));
	}

}