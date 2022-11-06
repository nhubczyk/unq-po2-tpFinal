package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesafioNoAceptadoTestCase {
	private DesafioNoAceptado desafioNoAceptado; // SUT
	private DesafioUsuario desafioUsuario;
	
	@BeforeEach
	void setUp() {
		desafioUsuario = mock(DesafioUsuario.class);
		desafioNoAceptado = new DesafioNoAceptado(desafioUsuario);
	}
	
	@Test
	void testMomentoSuperacion() {
		assertEquals(null, desafioNoAceptado.getMomentoSuperacion());
	}

	@Test
	void testNotMomentoSuperacion() {
		assertFalse(desafioNoAceptado.getMomentoSuperacion() instanceof LocalDate);
	}
	
	
	@Test
	void testPuedeAgregarMuestra() {
		assertFalse(desafioNoAceptado.puedeAgregarMuestra());
	}
	
	@Test
	void testFueCompletado() {
		assertFalse(desafioNoAceptado.fueCompletado());
	}
	
	@Test
	void testVotarDesafio() {
		assertFalse(desafioNoAceptado.votarDesafio(3));
	}
	
	@Test
	void testPorcentajeCompletitud() {
		assertEquals(0.00f, desafioNoAceptado.porcentajeCompletitud());
	}
	
	@Test
	void testNotPorcentajeCompletitud() {
		assertNotEquals(10.3f, desafioNoAceptado.porcentajeCompletitud());
	}
	
	@Test
	void testAceptarDesafio() {
		desafioNoAceptado.aceptarDesafio();
		verify(desafioUsuario).setEstado(any(DesafioActivo.class));
	}
}
