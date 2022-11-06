package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesafioActivoTestCase {
	private DesafioActivo desafioActivo;
	private DesafioUsuario desafioUsuario;
	private Muestra muestra;
	
	@BeforeEach
	void setUp() {
		desafioUsuario = mock(DesafioUsuario.class);
		desafioActivo = new DesafioActivo(desafioUsuario);
		muestra = mock(Muestra.class);
		
		when(desafioUsuario.getCantidadMuestrasNecesarias()).thenReturn(10);
	}
	
	@Test
	void testMomentoSuperacion() {
		assertEquals(null, desafioActivo.getMomentoSuperacion());
	}
	
	@Test
	void testPuedeAgregarMuestra() {
		assertTrue(desafioActivo.puedeAgregarMuestra());
	}
	
	@Test
	void testFueCompletado() {
		assertFalse(desafioActivo.fueCompletado());
	}
	
	private void agregarNMuestras(int m) {
		for (int i = 0; i < m; ++i) {
			desafioActivo.agregarMuestra(muestra);
		}
	}
	
	@Test
	void testPorcentajeCompletitud() {
		this.agregarNMuestras(5);
		assertEquals(50.0, desafioActivo.porcentajeCompletitud());
	}
	
	@Test
	void testAgregarMuestra() {
		this.agregarNMuestras(9);
		verify(desafioUsuario, never()).setEstado(any(DesafioCompletado.class));
		desafioActivo.agregarMuestra(muestra);
		verify(desafioUsuario).setEstado(any(DesafioCompletado.class));
	}

}
