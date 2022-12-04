package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testRecomendacionesPreferencia {
	private RecomendacionPreferencia recomendacion;// SUT
	
	private Proyecto proyecto;
	private Usuario usuario;
	private List<Desafio> desafiosResultado;
	

	@BeforeEach
	void setUp() {
		
		recomendacion = new RecomendacionPreferencia();
		usuario = mock(Usuario.class);
		desafiosResultado = mock(List.class);
		proyecto = mock(Proyecto.class);
		
		when(usuario.nDesafiosConMayorCoincidencia(5, proyecto)).thenReturn(desafiosResultado);
	}

	
	@Test
	void testDesafiosRecomendadosSegunValor() {
		verify(usuario, never()).nDesafiosConMayorCoincidencia(anyInt(), any(Proyecto.class));		
		
		assertEquals(desafiosResultado, recomendacion.desafiosRecomendadosSegunValor(usuario, proyecto));
		
		verify(usuario).nDesafiosConMayorCoincidencia(5, proyecto);
	}

}
