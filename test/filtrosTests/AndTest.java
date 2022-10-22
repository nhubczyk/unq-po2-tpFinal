package filtrosTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import SinImplementar.Proyecto;
import filtros.FiltroAnd;
import filtros.Filtro;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AndTest {
	
	private FiltroAnd filtroAnd; //SUT
	private Filtro filtroTrue; //DOC
	private Filtro filtroFalse; //DOC
	private Proyecto p;
	
	@BeforeEach
	void setUp() throws Exception {
		filtroTrue = mock(Filtro.class);
		filtroFalse = mock(Filtro.class);
		p = mock(Proyecto.class);
		
		when(filtroTrue.cumpleFiltro(p)).thenReturn(true);
		when(filtroFalse.cumpleFiltro(p)).thenReturn(false);
	}

	@Test
	void testSePreguntaAlHijoSiCumpleFiltro() {
		List<Filtro> filtros = new ArrayList<Filtro>(Arrays.asList(filtroTrue, filtroFalse));
		filtroAnd = new FiltroAnd(filtros);
		
		filtroAnd.cumpleFiltro(p);
		verify(filtroTrue).cumpleFiltro(p);
		verify(filtroFalse).cumpleFiltro(p);
	}
	
	@Test
	void testCumpleFiltro() {
		List<Filtro> filtros;
		
		filtros = new ArrayList<Filtro>(Arrays.asList(filtroTrue));
		filtroAnd = new FiltroAnd(filtros);				
		
		assertTrue(filtroAnd.cumpleFiltro(p));
		
		filtros = new ArrayList<Filtro>(Arrays.asList(filtroFalse));
		filtroAnd = new FiltroAnd(filtros);				
		
		assertFalse(filtroAnd.cumpleFiltro(p));
		
		filtros = new ArrayList<Filtro>(Arrays.asList(filtroTrue, filtroFalse));
		filtroAnd = new FiltroAnd(filtros);				
		
		assertFalse(filtroAnd.cumpleFiltro(p));
		
		filtros = new ArrayList<Filtro>(Arrays.asList(filtroTrue, filtroTrue));
		filtroAnd = new FiltroAnd(filtros);				
		
		assertTrue(filtroAnd.cumpleFiltro(p));
		
		filtros = new ArrayList<Filtro>(Arrays.asList(filtroFalse, filtroFalse));
		filtroAnd = new FiltroAnd(filtros);				
		
		assertFalse(filtroAnd.cumpleFiltro(p));
	}

}
