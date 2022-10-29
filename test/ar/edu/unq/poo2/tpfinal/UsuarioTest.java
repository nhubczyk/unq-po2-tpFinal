package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	private Proyecto proyecto;
	private Usuario usuario;
	private DesafioUsuario desafioCompletado;
	private Desafio desafioSinAsignar;
	private DesafioUsuario desafioSinCompletar;
	private recomendacionFavoritos recomendacionFavorita;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

	}

	@BeforeEach
	void setUp() {
		usuario = new Usuario();
		usuario.superoElDesafio(desafioCompletado);
		desafioSinCompletar = new DesafioUsuario();
		recomendacionFavorita = new recomendacionFavoritos();
		proyecto = new Proyecto("POO2", "nashe");
		desafioSinAsignar = new Desafio();

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
	void testPorcentajeCompletitudGeneral() {
		proyecto.addDesafio(desafioSinAsignar);
		assertEquals(0, usuario.porcentajeCompletitudGeneral(proyecto));
	}

	@Test
	void testPorcentajeCompletitudGeneralCambiado() {
		proyecto.addDesafio(desafioSinCompletar);
		proyecto.addDesafio(desafioSinAsignar);
		desafioSinCompletar.setPorcentajeCompletitud(80);
		assertEquals(40, usuario.porcentajeCompletitudGeneral(proyecto));
	}
/*	
	@Test 
	void testPreferencias() {
		var PreferenciasUsuario preferencias = (1,2,3,desafioSinCompletar);
		usuario.setPreferenciasUsuario(1, 2, 3, desafioSinCompletar);
		assertEquals(usuario.preferenciasUsuario,(1,2,3,desafioSinCompletar));
	}
*/
}