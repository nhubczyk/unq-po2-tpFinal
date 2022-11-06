package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesafioUsuarioTestCase {
	private DesafioUsuario desafioUsuario;
	private EstadoDeDesafio estadoDeDesafio;
	private EstadoDeDesafio estadoDeDesafio2;
	private Muestra muestra;
	private Muestra muestra2;
	private Desafio desafio;

	@BeforeEach
	void setUp() {
		desafio = mock(Desafio.class);
		desafioUsuario = new DesafioUsuario(desafio);
		estadoDeDesafio = mock(EstadoDeDesafio.class);
		estadoDeDesafio2 = mock(EstadoDeDesafio.class);
		muestra = mock(Muestra.class);
		muestra2 = mock(Muestra.class);
		
		when(desafio.getCantidadMuestras()).thenReturn(10);
		when(estadoDeDesafio.getMuestras()).thenReturn(new ArrayList<Muestra>());
		when(estadoDeDesafio.porcentajeCompletitud()).thenReturn((float) 85);
		when(estadoDeDesafio2.getMuestras()).thenReturn(Arrays.asList(muestra));
	}
	
	@Test
	void testGetMomentoDeSuperacion() {
		assertEquals(null, desafioUsuario.getMomentoSuperacion());
	}
	
	@Test
	void testNotGetMomentoDeSuperacion() {
		assertNotEquals(LocalDate.now().minusDays(7), desafioUsuario.getMomentoSuperacion());
	}
	
	@Test
	void testGetEstado() {
		desafioUsuario.setEstado(estadoDeDesafio);
		assertEquals(estadoDeDesafio, desafioUsuario.getEstado());
	}
	
	@Test
	void testNotGetEstado() {
		desafioUsuario.setEstado(estadoDeDesafio);
		assertNotEquals(estadoDeDesafio2, desafioUsuario.getEstado());
	}
	
	@Test
	void testGetCantidadDeMuestrasNecesarias() {
		assertEquals(10, desafioUsuario.getCantidadMuestrasNecesarias());
	}
	
	@Test 
	void testNotGetCantidadDeMuestrasNecesarias() {
		assertNotEquals(5, desafioUsuario.getCantidadMuestrasNecesarias());
	}
	
	@Test
	void testGetMuestrasRecolectadas() {
		assertEquals(new ArrayList<Muestra>(), desafioUsuario.getMuestrasRecolectadas());
	}
	
	@Test
	void testNotGetMuestrasRecolectadas() {
		assertNotEquals(Arrays.asList(muestra), desafioUsuario.getMuestrasRecolectadas());
	}
	
	@Test
	void getPorcentajeCompletitud() {
		desafioUsuario.setEstado(estadoDeDesafio);
		assertEquals((float) 85, desafioUsuario.getPorcentajeCompletitud());
	}
	
	@Test
	void getNotPorcentajeCompletitud() {
		assertNotEquals((float) 30, desafioUsuario.getPorcentajeCompletitud());
	}

	@Test
	void testAgregarMuestra() {
		desafioUsuario.setEstado(estadoDeDesafio);
		desafioUsuario.agregarMuestra(muestra);
		verify(estadoDeDesafio).agregarMuestra(muestra);
	}
	
	@Test
	void testNotAgregarMuestra() {
		desafioUsuario.setEstado(estadoDeDesafio);
		desafioUsuario.agregarMuestra(muestra2);
		verify(estadoDeDesafio, never()).agregarMuestra(muestra);
	}
	
	@Test
	void testCantidadDeMuestrasRecolectadas() {
		desafioUsuario.setEstado(estadoDeDesafio2);
		assertEquals(1, desafioUsuario.getCantidadMuestrasRecolectadas());
	}
	
	@Test
	void testNotCantidadDeMuestrasRecolectadas() {
		desafioUsuario.setEstado(estadoDeDesafio2);
		assertNotEquals(3, desafioUsuario.getCantidadMuestrasRecolectadas());
	}
}
