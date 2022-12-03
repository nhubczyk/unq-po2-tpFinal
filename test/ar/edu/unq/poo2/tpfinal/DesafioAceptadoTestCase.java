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
	void testVotarDesafio() throws Exception {
		
		desafioAceptado.votarDesafio(0);
		desafioAceptado.votarDesafio(1);
		desafioAceptado.votarDesafio(2);
		desafioAceptado.votarDesafio(3);
		desafioAceptado.votarDesafio(4);
		desafioAceptado.votarDesafio(5);
		
		assertThrows(Exception.class, () -> {
			desafioAceptado.votarDesafio(-1);
	    });
		
		assertThrows(Exception.class, () -> {
			desafioAceptado.votarDesafio(-10);
	    });
		
		assertThrows(Exception.class, () -> {
			desafioAceptado.votarDesafio(6);
	    });
		
		assertThrows(Exception.class, () -> {
			desafioAceptado.votarDesafio(10);
	    });
		
	}

}
