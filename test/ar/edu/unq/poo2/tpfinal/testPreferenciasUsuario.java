package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testPreferenciasUsuario {
	private PreferenciasUsuario preferencias; //SUT
	
	private Desafio desafio1;
	private Desafio desafio2;
	private Desafio desafio3;

	@BeforeEach
	void setUp() throws Exception {
		desafio1 = mock(Desafio.class);
		desafio2 = mock(Desafio.class);
		desafio3 = mock(Desafio.class);
		preferencias = new PreferenciasUsuario(1, 2, 3, desafio1);
		
		when(desafio1.getCantidadMuestras()).thenReturn(3);
		when(desafio1.getDificultad()).thenReturn(1);
		when(desafio1.getRecompensa()).thenReturn(5);
		
		when(desafio2.getCantidadMuestras()).thenReturn(7);
		when(desafio2.getDificultad()).thenReturn(5);
		when(desafio2.getRecompensa()).thenReturn(20);
		
		when(desafio3.getCantidadMuestras()).thenReturn(20);
		when(desafio3.getDificultad()).thenReturn(3);
		when(desafio3.getRecompensa()).thenReturn(13);
	}

	@Test
	void testGetYSetCantidadMuestras() {
		assertEquals(1, preferencias.getCantidadMuestras());
		preferencias.setCantidadMuestras(2);
		assertEquals(2, preferencias.getCantidadMuestras());
		preferencias.setCantidadMuestras(3);
		assertEquals(3, preferencias.getCantidadMuestras());
	}

	@Test
	void testGetYSetDificultad() {
		assertEquals(2, preferencias.getDificultad());
		preferencias.setDificultad(3);
		assertEquals(3, preferencias.getDificultad());
		preferencias.setDificultad(4);
		assertEquals(4, preferencias.getDificultad());	
	}

	@Test
	void testGetYSetRecompensa() {
		assertEquals(3, preferencias.getRecompensa());
		preferencias.setRecompensaPreferida(4);
		assertEquals(4, preferencias.getRecompensa());
		preferencias.setRecompensaPreferida(5);
		assertEquals(5, preferencias.getRecompensa());

	}

	@Test
	void testGetYSetDesafio() {
		assertEquals(preferencias.getDesafioPreferido(), desafio1);
		assertNotEquals(preferencias.getDesafioPreferido(), desafio2);
		assertNotEquals(preferencias.getDesafioPreferido(), desafio3);
		
		preferencias.setDesafioPreferido(desafio2);
		assertNotEquals(preferencias.getDesafioPreferido(), desafio1);
		assertEquals(preferencias.getDesafioPreferido(), desafio2);
		assertNotEquals(preferencias.getDesafioPreferido(), desafio3);
		
		preferencias.setDesafioPreferido(desafio3);
		assertNotEquals(preferencias.getDesafioPreferido(), desafio1);
		assertNotEquals(preferencias.getDesafioPreferido(), desafio2);
		assertEquals(preferencias.getDesafioPreferido(), desafio3);
	}

	@Test
	void testDiferenciaConDesafio() {
		assertEquals(5, preferencias.diferenciaConDesafio(desafio1));
		assertEquals(26, preferencias.diferenciaConDesafio(desafio2));
		assertEquals(30, preferencias.diferenciaConDesafio(desafio3));
		
		preferencias = new PreferenciasUsuario(8, 4, 15, desafio2);
		assertEquals(18, preferencias.diferenciaConDesafio(desafio1));
		assertEquals(7, preferencias.diferenciaConDesafio(desafio2));
		assertEquals(15, preferencias.diferenciaConDesafio(desafio3));
		
		preferencias = new PreferenciasUsuario(13, 3, 20, desafio3);
		assertEquals(27, preferencias.diferenciaConDesafio(desafio1));
		assertEquals(8, preferencias.diferenciaConDesafio(desafio2));
		assertEquals(14, preferencias.diferenciaConDesafio(desafio3));
	}
}
