package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	private Usuario usuario;
	private DesafioUsuario desafioCompletado;
	private Desafio desafioSinAsignar;
	private DesafioUsuario desafioSinCompletar;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@BeforeEach
	void setUp() {
		usuario = new Usuario();
		usuario.superoElDesafio(desafioCompletado);
		
	}

	@Test
	void testElDesafioFueSuperado() {
		assertTrue(usuario.esCompletado(desafioCompletado));
	}
	
	@Test
	void testDesafioCompletitud() {
		assertEquals(0,desafioSinCompletar.getPorcentajeCompletitud());
	}
	
	@Test
	void testSetMetodoRecomendacion() {
		usuario.setMetodoDeRecomendacion(Recomendacion recomendacionFavoritos);
		assertEquals(Recomendacion recomendacionFavoritos, usuario.getMetodoRecomendacion());
	}
	
	@Test 
	void testSuperoElDesafio() {
		assertFalse(usuario.esCompletado(DesafioUsuario DesafioSinCompletar));
		usuario.superoElDesafio(DesafioUsuario desafioSinCompletar);
		assertTrue(usuario.esCompletado(null))
	}

}