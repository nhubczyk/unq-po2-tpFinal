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
	void testElDesafioFueSuperado() {
		assertTrue(usuario.esCompletado(desafioCompletado));
	}

	@Test
	void testDesafioCompletitud() {
		assertEquals(10.0, desafioSinCompletar.getPorcentajeCompletitud());
	}

	@Test
	void testSetMetodoRecomendacion() {
		usuario.setMetodoDeRecomendacion(recomendacionFavorita);
		assertEquals(recomendacionFavorita, usuario.getMetodoRecomendacion());
	}

	@Test
	void testSuperoElDesafio() {
		usuario.superoElDesafio(desafioSinCompletar);
		assertTrue(usuario.esCompletado(desafioSinCompletar));
	}

	//@Test 
	//void testPorcentajeCompletitudGeneral(){
		//assertEquals(0,usuario.porcentajeCompletitodGeneral(proyecto));
	//}

}