package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestUsuario {
	private Usuario usuario;
	private RecomendacionFavoritos recomendacionFavorita;
	private RecomendacionPreferencia recomendacionPreferencia;
	private PreferenciasUsuario preferencias1;
	private PreferenciasUsuario preferencias2;
	
	private Desafio desafio1;
	private Desafio desafio2;
	private Desafio desafio3;
	private Desafio desafio4;
	private Desafio desafio5;
	private Desafio desafio6;
	private Desafio desafio7;

	
	private DesafioUsuario desafioUActivo1;
	private DesafioUsuario desafioUActivo2;
	private DesafioUsuario desafioUActivo3;
	private DesafioUsuario desafioUActivo4;
	
	private DesafioUsuario desafioUCompletado1;
	private DesafioUsuario desafioUCompletado2;
	private DesafioUsuario desafioUCompletado3;
	
	private Usuario usuarioConDesafiosMockeados1;
	private Usuario usuarioConDesafiosMockeados2;

	@BeforeEach
	void setUp() {
		preferencias1 = mock(PreferenciasUsuario.class);
		preferencias2 = mock(PreferenciasUsuario.class);
		recomendacionFavorita = mock(RecomendacionFavoritos.class);
		recomendacionPreferencia = mock(RecomendacionPreferencia.class);
		
		desafio1 = mock(Desafio.class);
		desafio2 = mock(Desafio.class);
		desafio3 = mock(Desafio.class);
		desafio4 = mock(Desafio.class);
		desafio5 = mock(Desafio.class);
		desafio6 = mock(Desafio.class);
		desafio7 = mock(Desafio.class);
		
		desafioUActivo1 = mock(DesafioUsuario.class);
		desafioUActivo2 = mock(DesafioUsuario.class);
		desafioUActivo3 = mock(DesafioUsuario.class);
		desafioUActivo4 = mock(DesafioUsuario.class);
		
		when(desafioUActivo1.getDesafio()).thenReturn(desafio1);
		when(desafioUActivo1.getPorcentajeCompletitud()).thenReturn(70.0f);
		when(desafioUActivo1.fueCompletado()).thenReturn(false);
		when(desafioUActivo2.getDesafio()).thenReturn(desafio2);
		when(desafioUActivo2.getPorcentajeCompletitud()).thenReturn(50.0f);
		when(desafioUActivo2.fueCompletado()).thenReturn(false);
		when(desafioUActivo3.getDesafio()).thenReturn(desafio3);
		when(desafioUActivo3.getPorcentajeCompletitud()).thenReturn(66.0f);
		when(desafioUActivo3.fueCompletado()).thenReturn(false);
		when(desafioUActivo4.getDesafio()).thenReturn(desafio4);
		when(desafioUActivo4.getPorcentajeCompletitud()).thenReturn(13.0f);
		when(desafioUActivo4.fueCompletado()).thenReturn(false);
		
		desafioUCompletado1 = mock(DesafioUsuario.class);
		desafioUCompletado2 = mock(DesafioUsuario.class);
		desafioUCompletado3 = mock(DesafioUsuario.class);
		
		when(desafioUCompletado1.getDesafio()).thenReturn(desafio5);
		when(desafioUCompletado1.getMomentoSuperacion()).thenReturn(LocalDate.of(2022, Month.NOVEMBER, 1));
		when(desafioUCompletado1.fueCompletado()).thenReturn(true);
		when(desafioUCompletado2.getDesafio()).thenReturn(desafio6);
		when(desafioUCompletado2.getMomentoSuperacion()).thenReturn(LocalDate.of(2020, Month.OCTOBER, 15));
		when(desafioUCompletado2.fueCompletado()).thenReturn(true);		
		when(desafioUCompletado3.getDesafio()).thenReturn(desafio7);
		when(desafioUCompletado3.getMomentoSuperacion()).thenReturn(LocalDate.of(2077, Month.APRIL, 27));
		when(desafioUCompletado3.fueCompletado()).thenReturn(true);
		
		
		usuarioConDesafiosMockeados1 = mock(Usuario.class, CALLS_REAL_METHODS);
		when(usuarioConDesafiosMockeados1.getDesafios()).thenReturn(Arrays.asList(desafioUActivo1, desafioUActivo3, desafioUActivo4));

		
		usuarioConDesafiosMockeados2 = mock(Usuario.class, CALLS_REAL_METHODS);
		when(usuarioConDesafiosMockeados2.getDesafios()).thenReturn(Arrays.asList(desafioUActivo1, desafioUActivo3, desafioUActivo4
				, desafioUCompletado1, desafioUCompletado2, desafioUCompletado3));

	}
	
	@Test
	void testAddYContieneDeafios() {
		usuario = new Usuario(recomendacionFavorita, preferencias2);
		
		assertFalse(usuario.contieneDesafio(desafio1));
		assertFalse(usuario.contieneDesafio(desafio2));
		assertFalse(usuario.contieneDesafio(desafio3));
		assertFalse(usuario.contieneDesafio(desafio4));
		assertFalse(usuario.contieneDesafio(desafio5));
		assertFalse(usuario.contieneDesafio(desafio6));
		assertFalse(usuario.contieneDesafio(desafio7));
		
		usuario.anhadirDeafio(desafio1);
		usuario.anhadirDeafio(desafio2);
		usuario.anhadirDeafio(desafio3);
		usuario.anhadirDeafio(desafio4);
		
		assertTrue(usuario.contieneDesafio(desafio1));
		assertTrue(usuario.contieneDesafio(desafio2));
		assertTrue(usuario.contieneDesafio(desafio3));
		assertTrue(usuario.contieneDesafio(desafio4));
		assertFalse(usuario.contieneDesafio(desafio5));
		assertFalse(usuario.contieneDesafio(desafio6));
		assertFalse(usuario.contieneDesafio(desafio7));
		
		usuario.anhadirDeafio(desafio5);
		usuario.anhadirDeafio(desafio6);
		usuario.anhadirDeafio(desafio7);
		
		assertTrue(usuario.contieneDesafio(desafio1));
		assertTrue(usuario.contieneDesafio(desafio2));
		assertTrue(usuario.contieneDesafio(desafio3));
		assertTrue(usuario.contieneDesafio(desafio4));
		assertTrue(usuario.contieneDesafio(desafio5));
		assertTrue(usuario.contieneDesafio(desafio6));
		assertTrue(usuario.contieneDesafio(desafio7));
	}
	
	@Test
	void testAnhadirDesafioYGet() {
		usuario = new Usuario(recomendacionFavorita, preferencias2);
		
		usuario.anhadirDeafio(desafio1);
		usuario.anhadirDeafio(desafio2);
		usuario.anhadirDeafio(desafio3);
		usuario.anhadirDeafio(desafio4);
		usuario.anhadirDeafio(desafio1);
		
		assertEquals(4, usuario.getDesafios().size());
	}
	
	@Test
	void testPorcentajeCompletitudDesafio() {
		
		assertEquals(70.0f, usuarioConDesafiosMockeados1.porcentajeCompletitudDesafio(desafio1));
		//da 0 porque no esta en la lista
		assertEquals(0.0f, usuarioConDesafiosMockeados1.porcentajeCompletitudDesafio(desafio2));
		assertEquals(66.0f, usuarioConDesafiosMockeados1.porcentajeCompletitudDesafio(desafio3));
		assertEquals(13.0f, usuarioConDesafiosMockeados1.porcentajeCompletitudDesafio(desafio4));
	}
	
	@Test
	void testMomentoSuperacion() {
		assertEquals(LocalDate.of(2022, Month.NOVEMBER, 1), usuarioConDesafiosMockeados2.getMomentoSuperacion(desafio5));
		assertEquals(LocalDate.of(2020, Month.OCTOBER, 15), usuarioConDesafiosMockeados2.getMomentoSuperacion(desafio6));
		assertEquals(LocalDate.of(2077, Month.APRIL, 27), usuarioConDesafiosMockeados2.getMomentoSuperacion(desafio7));
	}
	
	@Test
	void testGetYSetMetodoRecomendacion() {
		usuario = new Usuario(recomendacionFavorita, preferencias2);
		assertEquals(recomendacionFavorita, usuario.getMetodoRecomendacion());
		assertNotEquals(recomendacionPreferencia, usuario.getMetodoRecomendacion());
		
		usuario.setMetodoDeRecomendacion(recomendacionPreferencia);
		assertEquals(recomendacionPreferencia, usuario.getMetodoRecomendacion());
		assertNotEquals(recomendacionFavorita, usuario.getMetodoRecomendacion());
	}
	
	@Test
	void testGetYSetPreferenciasUsuario() {
		usuario = new Usuario(recomendacionFavorita, preferencias2);
		assertEquals(preferencias2, usuario.getPreferenciasUsuario());
		assertNotEquals(preferencias1, usuario.getPreferenciasUsuario());
		
		usuario.setPreferenciasUsuario(preferencias1);
		assertEquals(preferencias1, usuario.getPreferenciasUsuario());
		assertNotEquals(preferencias2, usuario.getPreferenciasUsuario());
	}
	
	@Test
	void testPorcentajeDesafiosCompletados() {
		assertEquals(50f ,usuarioConDesafiosMockeados2.porcentajeDesafiosCompletados());
		
		when(usuarioConDesafiosMockeados2.getDesafios()).thenReturn(Arrays.asList(desafioUActivo1
				, desafioUActivo3, desafioUCompletado2, desafioUCompletado3));
		assertEquals(50f ,usuarioConDesafiosMockeados2.porcentajeDesafiosCompletados());
		
		when(usuarioConDesafiosMockeados2.getDesafios()).thenReturn(Arrays.asList(desafioUActivo1
				, desafioUCompletado2, desafioUCompletado3));
		assertEquals((float) 2 / 3 * 100 ,usuarioConDesafiosMockeados2.porcentajeDesafiosCompletados());
		
		when(usuarioConDesafiosMockeados2.getDesafios()).thenReturn(Arrays.asList(desafioUActivo1
				, desafioUActivo3, desafioUCompletado3));
		assertEquals((float) 1 / 3 * 100 ,usuarioConDesafiosMockeados2.porcentajeDesafiosCompletados());
	}

}