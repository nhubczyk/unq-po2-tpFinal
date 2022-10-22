package filtrosTests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import SinImplementar.Proyecto;
import filtros.Filtro;
import filtros.FiltroNot;

public class NotTest {

	private FiltroNot filtroNot; //SUT
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
	void testBuenSetup() {		
		assertTrue(filtroTrue.cumpleFiltro(p));
		assertFalse(filtroFalse.cumpleFiltro(p));
	}

	@Test
	void testSePreguntaAlHijoSiCumpleFiltro() {
		filtroNot = new FiltroNot(filtroTrue);		
		filtroNot.cumpleFiltro(p);
		verify(filtroTrue).cumpleFiltro(p);

		filtroNot = new FiltroNot(filtroFalse);		
		filtroNot.cumpleFiltro(p);
		verify(filtroFalse).cumpleFiltro(p);
	}
	
	@Test
	void testCumpleFiltro1() {		
		filtroNot = new FiltroNot(filtroTrue);						
		assertFalse(filtroNot.cumpleFiltro(p));

	}
	
	@Test
	void testCumpleFiltro2() {		
		filtroNot = new FiltroNot(filtroFalse);						
		assertTrue(filtroNot.cumpleFiltro(p));
	}
}
