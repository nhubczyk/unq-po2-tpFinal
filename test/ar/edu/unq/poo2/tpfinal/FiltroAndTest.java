package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FiltroAndTest {
	
	private FiltroAnd filtroAnd; //SUT
	private Filtro filtroTrue; //DOC
	private Filtro filtroFalse; //DOC
	private Proyecto p; //DOC
	
	@Test
	void testCumpleFiltro() {
		filtroTrue = mock(Filtro.class);
		filtroFalse = mock(Filtro.class);
		p = mock(Proyecto.class);
		
		when(filtroTrue.cumpleFiltro(p)).thenReturn(true);
		when(filtroFalse.cumpleFiltro(p)).thenReturn(false);
		
		
		
		
		filtroAnd = new FiltroAnd(filtroTrue, filtroTrue);				
		
		assertTrue(filtroAnd.cumpleFiltro(p));
		
		filtroAnd = new FiltroAnd(filtroTrue, filtroFalse);				
		
		assertFalse(filtroAnd.cumpleFiltro(p));
		
		filtroAnd = new FiltroAnd(filtroFalse, filtroTrue);				
		
		assertFalse(filtroAnd.cumpleFiltro(p));
		
		filtroAnd = new FiltroAnd(filtroFalse, filtroFalse);				
		
		assertFalse(filtroAnd.cumpleFiltro(p));
	}

}
