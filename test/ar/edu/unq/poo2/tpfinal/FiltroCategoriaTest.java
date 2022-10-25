package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroCategoriaTest {

	private FiltroCategoria filtroCategoria; //SUT
	private Proyecto proyectoTrue;
	private Proyecto proyectoFalse;
	private Categoria c;
	
	@BeforeEach
	void setUp() throws Exception {
		proyectoTrue = mock(Proyecto.class);
		proyectoFalse = mock(Proyecto.class);
		
		//2 opciones:
		//when(proyectoTrue.contieneCategoria(Categoria)).thenReturn(true);
		//when(proyectoTrue.cloneCategorias()).thenReturn(c);
		
		// hacer lo mismo para el false
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
