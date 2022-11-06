package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestUsuario {
	private Proyecto proyecto;
	private Usuario usuario;
	private DesafioUsuario desafioCompletado;
	private Desafio desafioSinAsignar;
	private DesafioUsuario desafioSinCompletar;
	private Desafio desafio1;
	private Desafio desafio2;
	private RecomendacionFavoritos recomendacionFavorita;
	private RecomendacionPreferencia recomendacionPreferencia;
	private PreferenciasUsuario preferenciasActuales;
	private PreferenciasUsuario preferencias2;
	private EstadoDeDesafio estado;

	@BeforeEach
	void setUp() {
		usuario = mock(Usuario.class);
		desafioSinCompletar = mock(DesafioUsuario.class);
		desafioSinAsignar = mock(Desafio.class);
		desafioCompletado = mock(DesafioUsuario.class);
		proyecto = mock(Proyecto.class);
		preferenciasActuales = new PreferenciasUsuario();
		preferencias2 = new PreferenciasUsuario();
		recomendacionFavorita = mock(RecomendacionFavoritos.class);
		recomendacionPreferencia = mock(RecomendacionPreferencia.class);
		estado = new DesafioActivo(desafioSinCompletar);
		usuario.getDesafios().add(desafioCompletado);

		when(desafioSinCompletar.getPorcentajeCompletitud()).thenReturn(70.0f);
		when(desafioSinCompletar.getEstado()).thenReturn(estado);
		when(desafioSinCompletar.getPorcentajeCompletitud()).thenReturn((float) 10);
		when(desafioSinCompletar.getCantidadMuestrasRecolectadas()).thenReturn(20);
		when(desafioCompletado.getPorcentajeCompletitud()).thenReturn((float) 100);
		when(usuario.getPreferenciasUsuario()).thenReturn(preferenciasActuales);
		when(usuario.getMomentoSuperacion(desafioCompletado)).thenReturn(LocalDate.now());
		when(usuario.getMetodoRecomendacion()).thenReturn(recomendacionFavorita);
		when(usuario.porcentajeCompletitudGeneral(proyecto)).thenReturn((float) 80.5);
	}

	@Test
	void testDesafioCompletitud() {
		assertEquals(100f, desafioCompletado.getPorcentajeCompletitud());
	}

	@Test
	void testDesafioCompletitudOtraVariable() {
		assertEquals(10.0f, desafioSinCompletar.getPorcentajeCompletitud());
	}

	@Test
	void testDesafioCompletitudOtraVariable2() {
		assertEquals(0.0f, desafioSinAsignar.getPorcentajeCompletitud());
	}

	@Test
	void testSetMetodoRecomendacion() {
		assertEquals(recomendacionFavorita, usuario.getMetodoRecomendacion());
	}

	@Test
	void testGetMetodoRecomendacion() {
		usuario.setMetodoDeRecomendacion(recomendacionFavorita);
		assertNotEquals(usuario.getMetodoRecomendacion(), recomendacionPreferencia);
	}
/*
	@Test
	void testSuperoElDesafio() {
		assertTrue(usuario.getDesafios().contains(desafioCompletado));
	}
*/
	@Test
	void testMomentoSuperacionVerdadero() {
		assertEquals(LocalDate.now(), usuario.getMomentoSuperacion(desafioCompletado));
	}

	@Test
	void testMomentoSuperacion() {

		assertNotEquals(LocalDate.of(2022, Month.NOVEMBER, 1), usuario.getMomentoSuperacion(desafioCompletado));
	}

	@Test
	void testPorcentajeCompletitudGeneral() {
		assertNotEquals(0, usuario.porcentajeCompletitudGeneral(proyecto));
	}

	@Test
	void testPorcentajeCompletitudGeneralOtraVariedad() {
		assertEquals(80.5, usuario.porcentajeCompletitudGeneral(proyecto));
	}

	@Test
	void testPreferencias() {
		usuario.setPreferenciasUsuario(preferenciasActuales);
		assertNotEquals(usuario.getPreferenciasUsuario(), preferencias2);
	}

	@Test
	void testPreferenciasVerdadero() {

		assertEquals(usuario.getPreferenciasUsuario(), preferenciasActuales);
	}

}