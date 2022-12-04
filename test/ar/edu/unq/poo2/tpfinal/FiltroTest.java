package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FiltroTest {
	
	private Filtro filtro; //SUT
	private Proyecto proyectoTrue;
	private Proyecto proyectoFalse;
	
	
	@Test
	void test() {
		filtro = mock(Filtro.class);
		
		proyectoTrue = mock(Proyecto.class);
		proyectoFalse = mock(Proyecto.class);
		
		when(filtro.cumpleFiltro(proyectoTrue)).thenReturn(true);
		when(filtro.cumpleFiltro(proyectoFalse)).thenReturn(false);
		
	    doCallRealMethod()
	      .when(filtro)
	      .cumplenFiltro(Mockito.anyList());
	    
	    
		
		List<Proyecto> proyectos = Arrays.asList(proyectoTrue, proyectoFalse);
		assertTrue(filtro.cumplenFiltro(proyectos).contains(proyectoTrue));
		assertFalse(filtro.cumplenFiltro(proyectos).contains(proyectoFalse));
	}

}
