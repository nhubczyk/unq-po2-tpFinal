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
	}
	
	@Test
	void testGetArea() throws Exception {
		area = new Area(coordenada, 50f);
		assertEquals(50f, area.getRadio());
	}
	
	@Test
	void testExcepcionDelContructor() throws Exception {
		assertThrows(Exception.class, () -> {
			area = new Area(coordenada, -50f);
	    });
	}

}
