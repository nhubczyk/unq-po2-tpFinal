package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class testRecomendacionesFavoritos {
	private RecomendacionFavoritos recomendacion; // SUT
	private PreferenciasUsuario preferencias;// DOC
	private Proyecto proyecto;
	private Desafio desafio1;
	private Desafio desafio2;
	private Desafio desafio3;
	private Desafio desafio4;
	private Desafio desafio5;
	private Desafio desafio6;
	private Desafio desafio7;
	private Desafio desafio8;
	private Desafio desafio9;
	private Desafio desafio10;
	private Usuario user;
	private List<Desafio> desafiosRecomendados;
	private List<Desafio> desafiosNoRecomendados;
	private List<Desafio> desafios;

	@BeforeEach
	void setUp() throws Exception {
		proyecto = mock(Proyecto.class);
		desafio1 = mock(Desafio.class);
		desafio2 = mock(Desafio.class);
		desafio3 = mock(Desafio.class);
		desafio4 = mock(Desafio.class);
		desafio5 = mock(Desafio.class);
		desafio6 = mock(Desafio.class);
		desafio7 = mock(Desafio.class);
		desafio8 = mock(Desafio.class);
		desafio9 = mock(Desafio.class);
		desafio10 = mock(Desafio.class);
		user = mock(Usuario.class);
		desafios = new ArrayList<Desafio>();
		desafiosNoRecomendados = new ArrayList<Desafio>();
		desafiosNoRecomendados.add(desafio2);
		desafiosNoRecomendados.add(desafio4);
		desafiosNoRecomendados.add(desafio6);
		desafiosNoRecomendados.add(desafio8);
		desafiosNoRecomendados.add(desafio10);
		recomendacion = new RecomendacionFavoritos();
		preferencias = mock(PreferenciasUsuario.class);
		proyecto.agregarDesafio(desafio1);
		proyecto.agregarDesafio(desafio2);
		proyecto.agregarDesafio(desafio3);
		proyecto.agregarDesafio(desafio4);
		proyecto.agregarDesafio(desafio5);
		proyecto.agregarDesafio(desafio6);
		proyecto.agregarDesafio(desafio7);
		proyecto.agregarDesafio(desafio8);
		proyecto.agregarDesafio(desafio9);
		proyecto.agregarDesafio(desafio10);
		desafios.add(desafio1);
		desafios.add(desafio2);
		desafios.add(desafio3);
		desafios.add(desafio4);
		desafios.add(desafio5);
		desafios.add(desafio6);
		desafios.add(desafio7);
		desafios.add(desafio8);
		desafios.add(desafio9);
		desafios.add(desafio10);
		desafiosRecomendados = new ArrayList<Desafio>();
		desafiosRecomendados.add(desafio1);
		desafiosRecomendados.add(desafio3);
		desafiosRecomendados.add(desafio5);
		desafiosRecomendados.add(desafio7);
		desafiosRecomendados.add(desafio9);

		when(user.getMetodoRecomendacion()).thenReturn(recomendacion);
		when(user.contieneDesafio(desafio1)).thenReturn(false);
		when(user.contieneDesafio(desafio2)).thenReturn(false);
		when(user.contieneDesafio(desafio3)).thenReturn(false);
		when(user.contieneDesafio(desafio4)).thenReturn(false);
		when(user.contieneDesafio(desafio5)).thenReturn(false);
		when(user.contieneDesafio(desafio6)).thenReturn(false);
		when(user.contieneDesafio(desafio7)).thenReturn(false);
		when(user.contieneDesafio(desafio8)).thenReturn(false);
		when(user.contieneDesafio(desafio9)).thenReturn(false);
		when(user.contieneDesafio(desafio10)).thenReturn(false);
		when(proyecto.getDesafios()).thenReturn(desafios);
		when(user.getPreferenciasUsuario()).thenReturn(preferencias);
		when(preferencias.diferenciaConDesafio(desafio1)).thenReturn(4);
		when(preferencias.diferenciaConDesafio(desafio2)).thenReturn(5);
		when(preferencias.diferenciaConDesafio(desafio3)).thenReturn(4);
		when(preferencias.diferenciaConDesafio(desafio4)).thenReturn(6);
		when(preferencias.diferenciaConDesafio(desafio5)).thenReturn(4);
		when(preferencias.diferenciaConDesafio(desafio6)).thenReturn(7);
		when(preferencias.diferenciaConDesafio(desafio7)).thenReturn(4);
		when(preferencias.diferenciaConDesafio(desafio8)).thenReturn(8);
		when(preferencias.diferenciaConDesafio(desafio9)).thenReturn(4);
		when(preferencias.diferenciaConDesafio(desafio10)).thenReturn(41);

	}

	@Test
	void testDesafiosRecomendadosTrue() {
		assertEquals(desafiosRecomendados, recomendacion.desafiosRecomendadosSegunValor(user, proyecto));
	}

	@Test
	void testDesafiosRecomendadosFalse() {
		assertNotEquals(desafiosNoRecomendados, recomendacion.desafiosRecomendadosSegunValor(user, proyecto));
	}

	@Test
	void testnDesafiosConMayorCoincidencia() {
		assertEquals(desafiosRecomendados, recomendacion.nDesafiosConMayorCoincidencia(5, desafios, user));
	}

	@Test
	void testDesafiosSinAceptar() {
		assertEquals(desafios, recomendacion.desafiosSinAceptar(proyecto, user));
	}

	@Test
	void testDesafiosSinAceptarFalse() {
		assertNotEquals(desafiosRecomendados, recomendacion.desafiosSinAceptar(proyecto, user));
	}

}
