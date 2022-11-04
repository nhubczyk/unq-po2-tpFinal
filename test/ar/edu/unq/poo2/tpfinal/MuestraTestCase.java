package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MuestraTestCase {
	private Muestra muestra;
	private Coordenada coordenada;
	private Usuario user;
	
	@BeforeEach
	public void setUp() {
		coordenada = mock(Coordenada.class);
		user = mock(Usuario.class);
		muestra = new Muestra(LocalDate.now(), coordenada, user);
	}
	
	@Test
	void testGetFachaYHora() {
		assertEquals(LocalDate.now(), muestra.getFechaYHora());
	}
	
	@Test
	void testNotGetFechaYHora() {
		assertNotEquals(LocalDate.now().plusDays(5), muestra.getFechaYHora());
		assertNotEquals(LocalDate.now().minusMonths(3), muestra.getFechaYHora());
	}

}
