package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesafioActivoTestCase {
	private DesafioActivo desafioActivo;
	private DesafioUsuario desafioUsuario;
	
	@BeforeEach
	void setUp() {
		desafioUsuario = mock(DesafioUsuario.class);
		desafioActivo = new DesafioActivo(desafioUsuario);
		
		when(desafioUsuario.getCantidadMuestrasNecesarias()).thenReturn(10);
		when(desafioUsuario.getCantidadMuestrasRecolectadas()).thenReturn(20);
	}
	
	@Test
	void testMomentoSuperacion() {
		assertEquals(null, desafioActivo.getMomentoSuperacion());
	}
	
	@Test
	void testPuedeAgregarMuestra() {
		assertTrue(desafioActivo.puedeAgregarMuestra());
	}
	
	@Test
	void testFueCompletado() {
		assertFalse(desafioActivo.fueCompletado());
	}
	
	@Test
	void testPorcentajeCompletitud() {
		assertEquals(50.0, desafioActivo.porcentajeCompletitud());
	}

}
