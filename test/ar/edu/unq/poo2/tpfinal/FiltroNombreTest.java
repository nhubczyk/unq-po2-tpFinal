package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroNombreTest {

	private FiltroNombre filtroNombre; //SUT
	private Proyecto proyecto1;
	private Proyecto proyecto2;
	private Proyecto proyecto3;
	private Proyecto proyecto4;
	private Proyecto proyecto5;
	private Proyecto proyecto6;
	private Proyecto proyecto7;
	private Proyecto proyecto8;
	
	@BeforeEach
	void setUp() throws Exception {
		proyecto1 = mock(Proyecto.class);
		proyecto2 = mock(Proyecto.class);
		proyecto3 = mock(Proyecto.class);
		proyecto4 = mock(Proyecto.class);
		proyecto5 = mock(Proyecto.class);
		proyecto6 = mock(Proyecto.class);
		proyecto7 = mock(Proyecto.class);
		proyecto8 = mock(Proyecto.class);
		
		when(proyecto1.getNombre()).thenReturn("Astronomia");
		when(proyecto2.getNombre()).thenReturn("Biologia");
		when(proyecto3.getNombre()).thenReturn("Medio ambiente");
		when(proyecto4.getNombre()).thenReturn("Sociologia");
		when(proyecto5.getNombre()).thenReturn("Botanica");
		when(proyecto6.getNombre()).thenReturn("Cultura");
		when(proyecto7.getNombre()).thenReturn("Gastronomia");
		when(proyecto8.getNombre()).thenReturn("Vida silvestre");
		
	}
	
	@Test
	void testCumpleFiltro() {
		filtroNombre = new FiltroNombre("nomia");
		assertTrue(filtroNombre.cumpleFiltro(proyecto1));
		assertFalse(filtroNombre.cumpleFiltro(proyecto2));
		assertFalse(filtroNombre.cumpleFiltro(proyecto3));
		assertFalse(filtroNombre.cumpleFiltro(proyecto4));
		assertFalse(filtroNombre.cumpleFiltro(proyecto5));
		assertFalse(filtroNombre.cumpleFiltro(proyecto6));
		assertTrue(filtroNombre.cumpleFiltro(proyecto7));
		assertFalse(filtroNombre.cumpleFiltro(proyecto8));
		
		filtroNombre = new FiltroNombre("ia");
		assertTrue(filtroNombre.cumpleFiltro(proyecto1));
		assertTrue(filtroNombre.cumpleFiltro(proyecto2));
		assertFalse(filtroNombre.cumpleFiltro(proyecto3));
		assertTrue(filtroNombre.cumpleFiltro(proyecto4));
		assertFalse(filtroNombre.cumpleFiltro(proyecto5));
		assertFalse(filtroNombre.cumpleFiltro(proyecto6));
		assertTrue(filtroNombre.cumpleFiltro(proyecto7));
		assertFalse(filtroNombre.cumpleFiltro(proyecto8));
		
		filtroNombre = new FiltroNombre(" ");
		assertFalse(filtroNombre.cumpleFiltro(proyecto1));
		assertFalse(filtroNombre.cumpleFiltro(proyecto2));
		assertTrue(filtroNombre.cumpleFiltro(proyecto3));
		assertFalse(filtroNombre.cumpleFiltro(proyecto4));
		assertFalse(filtroNombre.cumpleFiltro(proyecto5));
		assertFalse(filtroNombre.cumpleFiltro(proyecto6));
		assertFalse(filtroNombre.cumpleFiltro(proyecto7));
		assertTrue(filtroNombre.cumpleFiltro(proyecto8));
		
		filtroNombre = new FiltroNombre("a");
		assertTrue(filtroNombre.cumpleFiltro(proyecto1));
		assertTrue(filtroNombre.cumpleFiltro(proyecto2));
		assertTrue(filtroNombre.cumpleFiltro(proyecto3));
		assertTrue(filtroNombre.cumpleFiltro(proyecto4));
		assertTrue(filtroNombre.cumpleFiltro(proyecto5));
		assertTrue(filtroNombre.cumpleFiltro(proyecto6));
		assertTrue(filtroNombre.cumpleFiltro(proyecto7));
		assertTrue(filtroNombre.cumpleFiltro(proyecto8));
		
		
	}

}
