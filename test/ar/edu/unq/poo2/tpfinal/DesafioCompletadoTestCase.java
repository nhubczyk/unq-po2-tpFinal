package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesafioCompletadoTestCase {
	private DesafioCompletado desafioCompletado;
	private DesafioUsuario desafioUsuario;
	
	@BeforeEach
	void setUp() {
		desafioUsuario = mock(DesafioUsuario.class);
		desafioCompletado = new DesafioCompletado(desafioUsuario, 4, new ArrayList<Muestra>());
	}
	
	@Test
	void testMomentoSuperacion() {
		assertEquals(LocalDate.now(), desafioCompletado.getMomentoSuperacion());
	}
	
	@Test
	void testNotMomentoSuperacion() {
		assertNotEquals(LocalDate.now().minusMonths(3), desafioCompletado.getMomentoSuperacion());
	}

	@Test
	void testPuedeAgregarMuestra() {
		assertFalse(desafioCompletado.puedeAgregarMuestra());
	}
	
	@Test
	void testPorcentajeCompletitud() {
		assertEquals(100f, desafioCompletado.porcentajeCompletitud());
	}
	
	@Test
	void testNotPorcentajeCompletitud() {
		assertNotEquals(50f, desafioCompletado.porcentajeCompletitud());
	}
	
	@Test
	void testFueCompletado() {
		assertTrue(desafioCompletado.fueCompletado());
	}
	
	
}
