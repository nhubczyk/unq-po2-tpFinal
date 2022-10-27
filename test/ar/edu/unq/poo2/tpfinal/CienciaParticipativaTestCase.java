package ar.edu.unq.poo2.tpfinal;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CienciaParticipativaTestCase {
	private CienciaParticipativa ciencia; //SUT
	private Proyecto proyecto; // DOC
	private Proyecto proyecto2; // DOC
	
	@BeforeEach
	void setUp() {
		ciencia = new CienciaParticipativa();
		proyecto = mock(Proyecto.class);
		proyecto2 = mock(Proyecto.class);
	}
	
	@Test
	void testAgregarProyecto() {
		ciencia.addProyecto(proyecto);
		assertTrue(ciencia.tieneElElemento(proyecto));
	}
	
	@Test
	void testNoAgregarProyecto() {
		ciencia.addProyecto(proyecto2);
		assertFalse(ciencia.tieneElElemento(proyecto));
	}

}