package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroCategoriaTest {

	private FiltroCategoria filtroCategoria; //SUT
	private Proyecto proyecto1;
	private Proyecto proyecto2;
	private Proyecto proyecto3;
	private Proyecto proyecto4;
	private Proyecto proyecto5;
	private Proyecto proyecto6;
	private Categoria c1;
	private Categoria c2;
	private Categoria c3;
	private Categoria c4;
	private Categoria c5;
	private Categoria c6;
	
	@BeforeEach
	void setUp() throws Exception {
		proyecto1 = mock(Proyecto.class);
		proyecto2 = mock(Proyecto.class);
		proyecto3 = mock(Proyecto.class);
		proyecto4 = mock(Proyecto.class);
		proyecto5 = mock(Proyecto.class);
		proyecto6 = mock(Proyecto.class);
		c1 = mock(Categoria.class);
		c2 = mock(Categoria.class);
		c3 = mock(Categoria.class);
		c4 = mock(Categoria.class);
		c5 = mock(Categoria.class);
		c6 = mock(Categoria.class);
		List<Categoria> categorias1 = Arrays.asList(c1, c2, c6);
		when(proyecto1.getCategorias()).thenReturn(categorias1);
		List<Categoria> categorias2 = Arrays.asList(c1, c3, c5);
		when(proyecto2.getCategorias()).thenReturn(categorias2);
		List<Categoria> categorias3 = Arrays.asList(c5, c3, c4);
		when(proyecto3.getCategorias()).thenReturn(categorias3);
		List<Categoria> categorias4 = Arrays.asList(c5, c6, c4);
		when(proyecto4.getCategorias()).thenReturn(categorias4);
		List<Categoria> categorias5 = Arrays.asList(c6, c4, c2);
		when(proyecto5.getCategorias()).thenReturn(categorias5);
		List<Categoria> categorias6 = Arrays.asList(c3, c1, c2);
		when(proyecto6.getCategorias()).thenReturn(categorias6);
		
	}
	@Test
	void testCumpleFiltroCaseTrue() {
		filtroCategoria = new FiltroCategoria(c1);
		assertTrue(filtroCategoria.cumpleFiltro(proyecto1));
		assertTrue(filtroCategoria.cumpleFiltro(proyecto2));
		assertTrue(filtroCategoria.cumpleFiltro(proyecto6));
		
		filtroCategoria = new FiltroCategoria(c2);
		assertTrue(filtroCategoria.cumpleFiltro(proyecto1));
		assertTrue(filtroCategoria.cumpleFiltro(proyecto5));
		assertTrue(filtroCategoria.cumpleFiltro(proyecto6));
		
		filtroCategoria = new FiltroCategoria(c3);
		assertTrue(filtroCategoria.cumpleFiltro(proyecto2));
		assertTrue(filtroCategoria.cumpleFiltro(proyecto3));
		assertTrue(filtroCategoria.cumpleFiltro(proyecto6));
		
		filtroCategoria = new FiltroCategoria(c4);
		assertTrue(filtroCategoria.cumpleFiltro(proyecto3));
		assertTrue(filtroCategoria.cumpleFiltro(proyecto4));
		assertTrue(filtroCategoria.cumpleFiltro(proyecto5));
		
		filtroCategoria = new FiltroCategoria(c5);
		assertTrue(filtroCategoria.cumpleFiltro(proyecto2));
		assertTrue(filtroCategoria.cumpleFiltro(proyecto3));
		assertTrue(filtroCategoria.cumpleFiltro(proyecto4));
		
		filtroCategoria = new FiltroCategoria(c6);
		assertTrue(filtroCategoria.cumpleFiltro(proyecto1));
		assertTrue(filtroCategoria.cumpleFiltro(proyecto4));
		assertTrue(filtroCategoria.cumpleFiltro(proyecto5));
	}
	
	@Test
	void testCumpleFiltroCaseFalse() {
		filtroCategoria = new FiltroCategoria(c1);
		assertFalse(filtroCategoria.cumpleFiltro(proyecto3));
		assertFalse(filtroCategoria.cumpleFiltro(proyecto4));
		assertFalse(filtroCategoria.cumpleFiltro(proyecto5));
		
		filtroCategoria = new FiltroCategoria(c2);
		assertFalse(filtroCategoria.cumpleFiltro(proyecto2));
		assertFalse(filtroCategoria.cumpleFiltro(proyecto3));
		assertFalse(filtroCategoria.cumpleFiltro(proyecto4));
		
		filtroCategoria = new FiltroCategoria(c3);
		assertFalse(filtroCategoria.cumpleFiltro(proyecto1));
		assertFalse(filtroCategoria.cumpleFiltro(proyecto4));
		assertFalse(filtroCategoria.cumpleFiltro(proyecto5));
		
		filtroCategoria = new FiltroCategoria(c4);
		assertFalse(filtroCategoria.cumpleFiltro(proyecto1));
		assertFalse(filtroCategoria.cumpleFiltro(proyecto2));
		assertFalse(filtroCategoria.cumpleFiltro(proyecto6));
		
		filtroCategoria = new FiltroCategoria(c5);
		assertFalse(filtroCategoria.cumpleFiltro(proyecto1));
		assertFalse(filtroCategoria.cumpleFiltro(proyecto5));
		assertFalse(filtroCategoria.cumpleFiltro(proyecto6));
		
		filtroCategoria = new FiltroCategoria(c6);
		assertFalse(filtroCategoria.cumpleFiltro(proyecto2));
		assertFalse(filtroCategoria.cumpleFiltro(proyecto3));
		assertFalse(filtroCategoria.cumpleFiltro(proyecto6));
		
		
	}

}
