package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AreaTestCase {
	private Area area;
	private Coordenada coordenada;
	
	@BeforeEach
	public void setUp() {
		coordenada = mock(Coordenada.class);
		area = new Area(coordenada, 50f);
	}
	
	@Test
	void testGetArea() {
		assertEquals(50f, area.getRadio());
	}
	
	@Test
	void testNotGetArea() {
		assertNotEquals(100f, area.getRadio());
	}

}
