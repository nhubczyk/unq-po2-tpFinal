package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class testRecomendacionesFavoritos {
	private RecomendacionFavoritos recomendacion; // SUT
	
	private Proyecto proyecto;
	private Usuario usuario;
	private List<Desafio> desafiosCoincidencia;
	private List<Desafio> desafiosSimilitud;

	@BeforeEach
	void setUp() {
		
		recomendacion = new RecomendacionFavoritos();
		usuario = mock(Usuario.class);
		desafiosCoincidencia = mock(List.class);
		desafiosSimilitud = mock(List.class);
		proyecto = mock(Proyecto.class);
		
		when(usuario.nDesafiosConMayorCoincidencia(20, proyecto)).thenReturn(desafiosCoincidencia);
		when(usuario.nDesafiosConMayorSimilitud(5, desafiosCoincidencia)).thenReturn(desafiosSimilitud);
	}

	@Test
	void testDesafiosRecomendadosSegunValor() {
		verify(usuario, never()).nDesafiosConMayorCoincidencia(anyInt(), any(Proyecto.class));
		verify(usuario, never()).nDesafiosConMayorSimilitud(anyInt(), anyList());
		
		assertEquals(desafiosSimilitud, recomendacion.desafiosRecomendadosSegunValor(usuario, proyecto));
		
		verify(usuario).nDesafiosConMayorCoincidencia(20, proyecto);
		verify(usuario).nDesafiosConMayorSimilitud(5, desafiosCoincidencia);
	}
}
