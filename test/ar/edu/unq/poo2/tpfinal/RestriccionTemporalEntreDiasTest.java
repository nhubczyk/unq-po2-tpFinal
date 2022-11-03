package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestriccionTemporalEntreDiasTest {

	RestriccionTemporalEntreDias rTED; //SUT
	
	@BeforeEach
	void setUp() throws Exception {
	}
	
	void testCumpleRestriccionFechaExacta() {
		rTED = new RestriccionTemporalEntreDias(LocalDate.of(2022, Month.NOVEMBER, 2), LocalDate.of(2022, Month.NOVEMBER, 2));
		assertTrue(rTED.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 2)));
	}
	
	@Test
	void testCumpleRestriccionEnRango() {
		rTED = new RestriccionTemporalEntreDias(LocalDate.of(2022, Month.OCTOBER, 1), LocalDate.of(2022, Month.DECEMBER, 1));

		assertTrue(rTED.cumpleRestriccion(LocalDate.of(2022, Month.OCTOBER, 1)));
		assertTrue(rTED.cumpleRestriccion(LocalDate.of(2022, Month.OCTOBER, 8)));
		assertTrue(rTED.cumpleRestriccion(LocalDate.of(2022, Month.OCTOBER, 14)));
		assertTrue(rTED.cumpleRestriccion(LocalDate.of(2022, Month.OCTOBER, 27)));
		assertTrue(rTED.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 2)));
		assertTrue(rTED.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 7)));
		assertTrue(rTED.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 18)));
		assertTrue(rTED.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 29)));
		assertTrue(rTED.cumpleRestriccion(LocalDate.of(2022, Month.DECEMBER, 1)));
	}
	
	@Test
	void testNotCumpleRestriccionDespuesDeFecha() {
		rTED = new RestriccionTemporalEntreDias(LocalDate.of(2000, Month.OCTOBER, 1), LocalDate.of(2022, Month.DECEMBER, 1));
		assertFalse(rTED.cumpleRestriccion(LocalDate.of(2022, Month.DECEMBER, 2)));
	}
	
	@Test
	void testNotCumpleRestriccionAntesDeFecha() {
		rTED = new RestriccionTemporalEntreDias(LocalDate.of(2022, Month.OCTOBER, 2), LocalDate.of(2040, Month.DECEMBER, 1));
		assertFalse(rTED.cumpleRestriccion(LocalDate.of(2022, Month.OCTOBER, 1)));
	}
	
	

	@Test
	void testCumpleRestriccionAhoraFechaExacta() {
		LocalDate fechaInicio = LocalDate.now();
		LocalDate fechaFin = fechaInicio;
		rTED = new RestriccionTemporalEntreDias(fechaInicio, fechaFin);
		assertTrue(rTED.cumpleRestriccionAhora());
	}
	
	@Test
	void testCumpleRestriccionAhoraEnRango() {
		LocalDate fechaInicio = LocalDate.now().minusDays(10);
		LocalDate fechaFin = LocalDate.now().plusDays(10);
		rTED = new RestriccionTemporalEntreDias(fechaInicio, fechaFin);
		assertTrue(rTED.cumpleRestriccionAhora());
	}
	
	@Test
	void testNotCumpleRestriccionAhoraDespuesDeHoy() {
		LocalDate fechaInicio = LocalDate.now().plusDays(1);
		LocalDate fechaFin = LocalDate.now().plusDays(400);
		rTED = new RestriccionTemporalEntreDias(fechaInicio, fechaFin);
		assertFalse(rTED.cumpleRestriccionAhora());
	}
	
	@Test
	void testNotCumpleRestriccionAhoraAntesDeHoy() {
		LocalDate fechaInicio = LocalDate.now().minusDays(400);
		LocalDate fechaFin = LocalDate.now().minusDays(1);
		rTED = new RestriccionTemporalEntreDias(fechaInicio, fechaFin);
		assertFalse(rTED.cumpleRestriccionAhora());
	}

}
