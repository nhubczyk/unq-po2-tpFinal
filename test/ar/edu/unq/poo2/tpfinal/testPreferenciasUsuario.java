package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

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
		usuario = new Usuario();
		desafio = new Desafio();
		desafio2 = new Desafio();
		preferencias = new PreferenciasUsuario();
		usuario.setPreferenciasUsuario(preferencias);
		dificultad = 3;
		cantidadMuestras = 3;
		recompensa = 3;
		preferencias.setCantidadMuestras(cantidadMuestras);
		preferencias.setDificultad(dificultad);
		preferencias.setDesafioPreferido(desafio);
		preferencias.setRecompensaPreferida(recompensa);
		desafio.setCantidadMuestrasNecesarias(4);
		desafio.setDificultad(1);
		desafio.setRecompensa(1);
	}

	@Test
	void testMuestrasTrue() {

		assertEquals(usuario.getPreferenciasUsuario().getCantidadMuestras(), cantidadMuestras);
	}

	@Test
	void testMuestrasFalse() {
		assertNotEquals(usuario.getPreferenciasUsuario().getCantidadMuestras(), 1);
	}

	@Test
	void testDificultadTrue() {

		assertEquals(usuario.getPreferenciasUsuario().getDificultad(), dificultad);
	}

	@Test
	void testDificultadFalse() {

		assertNotEquals(usuario.getPreferenciasUsuario().getDificultad(), 5);
	}

	@Test
	void testRecompensaTrue() {

		assertEquals(usuario.getPreferenciasUsuario().getRecompensa(), recompensa);

	}

	@Test
	void testRecompensaFalse() {

		assertNotEquals(usuario.getPreferenciasUsuario().getRecompensa(), 1);

	}

	@Test
	void testDesafioTrue() {

		assertEquals(usuario.getPreferenciasUsuario().getDesafioPreferido(), desafio);
	}

	@Test
	void testDesafioFalse() {

		assertNotEquals(usuario.getPreferenciasUsuario().getDesafioPreferido(), desafio2);
	}

	@Test
	void testDiferenciaConDesafioTrue() {
		assertEquals(usuario.getPreferenciasUsuario().diferenciaConDesafio(desafio), 6);
	}

	@Test
	void testDiferenciaConDesafioFalse() {
		assertNotEquals(usuario.getPreferenciasUsuario().diferenciaConDesafio(desafio), 3);
	}

}
