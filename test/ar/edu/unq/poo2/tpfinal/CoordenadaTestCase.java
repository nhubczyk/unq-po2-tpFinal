package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoordenadaTestCase {
	private Coordenada coordenada;
	
	@BeforeEach
	public void setUp() {
		coordenada = new Coordenada(10f, 20f);
	}
	
	@Test
	void testGetLatitud() {
		assertEquals(10f, coordenada.getLatitud());
	}
	
	@Test
	void testNotGetLatitud() {
		assertNotEquals(15f, coordenada.getLongitud());
	}
	
	@Test
	void testGetLongitud() {
		assertEquals(20f, coordenada.getLongitud());
	}
	
	@Test
	void testNotGetLongitud() {
		assertNotEquals(100f, coordenada.getLatitud());
	}

}
