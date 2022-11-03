package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	private Proyecto proyecto;
	private Usuario usuario;
	private DesafioUsuario desafioCompletado;
	private Desafio desafioSinAsignar;
	private DesafioUsuario desafioSinCompletar;
	private RecomendacionFavoritos recomendacionFavorita;
	private RecomendacionPreferencia recomendacionPreferencia;
	private PreferenciasUsuario preferenciasActuales;
	private PreferenciasUsuario preferencias2;
	private LocalDate superacion;

	@BeforeEach
	void setUp() {
		usuario = new Usuario();
		desafioSinCompletar = new DesafioUsuario();
		desafioSinAsignar = new Desafio();
		desafioCompletado = new DesafioUsuario();
		proyecto = new Proyecto("POO2", "Programacion orientada a objetos 2");
		preferenciasActuales = new PreferenciasUsuario();
		preferencias2 = new PreferenciasUsuario();
		usuario.superoElDesafio(desafioCompletado);
		recomendacionFavorita = new RecomendacionFavoritos();
		recomendacionPreferencia = new RecomendacionPreferencia();
		desafioSinCompletar.setPorcentajeCompletitud(80);
		superacion = LocalDate.now();
		desafioCompletado.setMomentoSuperacion(superacion);

	}

	@Test
	void testDesafioCompletitud() {
		desafioSinCompletar.setPorcentajeCompletitud(70);
		assertEquals(70.0, desafioSinCompletar.getPorcentajeCompletitud());
	}

	@Test
	void testSetMetodoRecomendacion() {
		usuario.setMetodoDeRecomendacion(recomendacionFavorita);
		assertEquals(recomendacionFavorita, usuario.getMetodoRecomendacion());
	}
	
	@Test
	void testGetMetodoRecomendacion() {
		usuario.setMetodoDeRecomendacion(recomendacionFavorita);
		assertNotEquals(usuario.getMetodoRecomendacion(), recomendacionPreferencia);
	}

	@Test
	void testSuperoElDesafio() {
		usuario.superoElDesafio(desafioCompletado);
		assertTrue(usuario.getDesafiosCompletos().contains(desafioCompletado));
	}

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
		proyecto.addDesafio(desafioSinAsignar);
		assertEquals(0, usuario.porcentajeCompletitudGeneral(proyecto));
	}

	@Test
	void testPorcentajeCompletitudGeneralOtraVariedad() {
		proyecto.addDesafio(desafioSinCompletar);
		proyecto.addDesafio(desafioSinAsignar);
		assertEquals(40, usuario.porcentajeCompletitudGeneral(proyecto));
	}

	@Test
	void testPreferencias() {
		usuario.setPreferenciasUsuario(preferenciasActuales);
		assertNotEquals(usuario.getPreferenciasUsuario(), preferencias2);
	}

	@Test
	void testPreferenciasVerdadero() {
		usuario.setPreferenciasUsuario(preferenciasActuales);
		assertEquals(usuario.getPreferenciasUsuario(), preferenciasActuales);
	}

}