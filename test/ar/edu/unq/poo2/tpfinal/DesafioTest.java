package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesafioTest {
	Desafio desafio;
	
	Desafio desafio1;
	Desafio desafio2;
	Desafio desafio3;
	@BeforeEach
	void setUp() throws Exception {
		desafio = new Desafio(1, 2, 3);
		
		desafio1 = new Desafio(3, 1, 5);
		desafio2 = new Desafio(7, 5, 20);
		desafio3 = new Desafio(20, 3, 13);
	}

	@Test
	void testGetYSetCantidadMuestras() {
		assertEquals(1, desafio.getCantidadMuestras());
		desafio.setCantidadMuestrasNecesarias(2);
		assertEquals(2, desafio.getCantidadMuestras());
		desafio.setCantidadMuestrasNecesarias(3);
		assertEquals(3, desafio.getCantidadMuestras());
	}

	@Test
	void testGetYSetDificultad() {
		assertEquals(2, desafio.getDificultad());
		desafio.setDificultad(3);
		assertEquals(3, desafio.getDificultad());
		desafio.setDificultad(4);
		assertEquals(4, desafio.getDificultad());	
	}

	@Test
	void testGetYSetRecompensa() {
		assertEquals(3, desafio.getRecompensa());
		desafio.setRecompensa(4);
		assertEquals(4, desafio.getRecompensa());
		desafio.setRecompensa(5);
		assertEquals(5, desafio.getRecompensa());

	}
	@Test
	void testSimilitudConDesafio() {
		assertEquals((float) 5 / 3, desafio.similitudConDesafio(desafio1));
		assertEquals((float)26 / 3, desafio.similitudConDesafio(desafio2));
		assertEquals((float)30 / 3, desafio.similitudConDesafio(desafio3));
		
		desafio = new Desafio(8, 4, 15);
		assertEquals((float)18 / 3, desafio.similitudConDesafio(desafio1));
		assertEquals((float)7 / 3, desafio.similitudConDesafio(desafio2));
		assertEquals((float)15 / 3, desafio.similitudConDesafio(desafio3));
		
		desafio = new Desafio(13, 3, 20);
		assertEquals((float)27 / 3, desafio.similitudConDesafio(desafio1));
		assertEquals((float)8 / 3, desafio.similitudConDesafio(desafio2));
		assertEquals((float)14 / 3, desafio.similitudConDesafio(desafio3));
	}
}

