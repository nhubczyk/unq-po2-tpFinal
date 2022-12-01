package ar.edu.unq.poo2.tpfinal;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CienciaParticipativaTestCase {
	private CienciaParticipativa ciencia; //SUT
	private Proyecto proyecto; // DOC
	private Proyecto proyecto2; // DOC
	private Filtro filtro;
	
	@BeforeEach
	void setUp() {
		ciencia = new CienciaParticipativa();
		proyecto = mock(Proyecto.class);
		proyecto2 = mock(Proyecto.class);
		filtro = mock(Filtro.class);
		
		List<Proyecto> listaVieja = Arrays.asList(proyecto, proyecto2);
		List<Proyecto> listaNueva = Arrays.asList(proyecto);
		
		when(filtro.cumplenFiltro(listaVieja)).thenReturn(listaNueva);
		
	}
	
	@Test
	void testAgregarProyecto() {
		ciencia.agregarProyecto(proyecto);
		assertTrue(ciencia.tieneElElemento(proyecto));
	}
	
	@Test
	void testNoAgregarProyecto() {
		ciencia.agregarProyecto(proyecto2);
		assertFalse(ciencia.tieneElElemento(proyecto));
	}
	
	@Test
	void testFiltrarProyectos() {
		ciencia.agregarProyecto(proyecto);
		ciencia.agregarProyecto(proyecto2);
		assertTrue(ciencia.filtrarProyectos(filtro).contains(proyecto));
	}
	
	@Test
	void testNoFiltrarProyectos() {
		ciencia.agregarProyecto(proyecto);
		ciencia.agregarProyecto(proyecto2);
		assertFalse(ciencia.filtrarProyectos(filtro).contains(proyecto2));
	}

}