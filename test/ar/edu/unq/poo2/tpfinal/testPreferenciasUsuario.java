package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testPreferenciasUsuario {
	private Usuario usuario;
	private Desafio desafio;
	private Desafio desafio2;
	private PreferenciasUsuario preferencias;
	private int dificultad;
	private int cantidadMuestras;
	private int recompensa;

	@BeforeEach
	void setUp() throws Exception {
		usuario = mock(Usuario.class);
		desafio = mock(Desafio.class);
		desafio2 = mock(Desafio.class);
		preferencias = mock(PreferenciasUsuario.class);

		when(preferencias.getCantidadMuestras()).thenReturn(3);
		when(preferencias.getDificultad()).thenReturn(3);
		when(preferencias.getRecompensa()).thenReturn(3);
		when(preferencias.getDesafioPreferido()).thenReturn(desafio);
		when(desafio.getCantidadMuestras()).thenReturn(4);
		when(desafio.getDificultad()).thenReturn(1);
		when(desafio.getRecompensa()).thenReturn(1);
		when(usuario.getPreferenciasUsuario()).thenReturn(preferencias);
		when(preferencias.diferenciaConDesafio(desafio)).thenReturn(5);

	}

	@Test
	void testMuestrasTrue() {

		assertEquals(preferencias.getCantidadMuestras(), 3);
	}

	@Test
	void testMuestrasFalse() {
		assertNotEquals(preferencias.getCantidadMuestras(), 1);
	}

	@Test
	void testDificultadTrue() {

		assertEquals(preferencias.getDificultad(), 3);
	}

	@Test
	void testDificultadFalse() {

		assertNotEquals(preferencias.getDificultad(), 5);
	}

	@Test
	void testRecompensaTrue() {

		assertEquals(preferencias.getRecompensa(), 3);

	}

	@Test
	void testRecompensaFalse() {

		assertNotEquals(preferencias.getRecompensa(), 1);

	}

	@Test
	void testDesafioTrue() {

		assertEquals(preferencias.getDesafioPreferido(), desafio);
	}

	@Test
	void testDesafioFalse() {

		assertNotEquals(preferencias.getDesafioPreferido(), desafio2);
	}

	@Test
	void testDiferenciaConDesafioTrue() {
		assertEquals(preferencias.diferenciaConDesafio(desafio), 5);
	}

	@Test
	void testDiferenciaConDesafioFalse() {
		assertNotEquals(preferencias.diferenciaConDesafio(desafio), 3);
	}

}
