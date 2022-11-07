package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesafioAceptadoTestCase {
	private DesafioAceptado desafioAceptado;
	private DesafioUsuario desafioUsuario;
	
	@BeforeEach
	void setUp() {
		desafioUsuario = mock(DesafioUsuario.class);
		desafioAceptado = mock(DesafioAceptado.class, withSettings()
		        .useConstructor(desafioUsuario)
		        .defaultAnswer(CALLS_REAL_METHODS)
		);	
	}
	
	@Test
	void testGetMuestras() {
		assertEquals(0, desafioAceptado.getMuestras().size());
	}
	
	@Test
	void testNotMuestras() {
		assertNotEquals(10, desafioAceptado.getMuestras().size());
	}
	
	@Test
	void testVotarDesafio() {
		assertTrue(desafioAceptado.votarDesafio(0));
		assertTrue(desafioAceptado.votarDesafio(1));
		assertTrue(desafioAceptado.votarDesafio(2));
		assertTrue(desafioAceptado.votarDesafio(3));
		assertTrue(desafioAceptado.votarDesafio(4));
		assertTrue(desafioAceptado.votarDesafio(5));
		
		assertFalse(desafioAceptado.votarDesafio(-1));
		assertFalse(desafioAceptado.votarDesafio(-10));
		assertFalse(desafioAceptado.votarDesafio(6));
		assertFalse(desafioAceptado.votarDesafio(10));
	}

}
