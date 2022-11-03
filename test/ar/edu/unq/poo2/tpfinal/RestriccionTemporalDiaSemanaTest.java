package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestriccionTemporalDiaSemanaTest {

	RestriccionTemporalDiaSemana rTDS; //SUT
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCumpleRestriccion() {
		List<DayOfWeek> dias1 = new ArrayList<DayOfWeek>(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.TUESDAY));
		rTDS = new RestriccionTemporalDiaSemana(dias1);
		assertTrue(rTDS.cumpleRestriccion(LocalDate.of(2022, Month.OCTOBER, 31)));
		assertTrue(rTDS.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 1)));
		assertTrue(rTDS.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 7)));
		assertTrue(rTDS.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 8)));
	}
	
	@Test
	void testNotCumpleRestriccion() {
		List<DayOfWeek> dias1 = new ArrayList<DayOfWeek>(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.TUESDAY));
		rTDS = new RestriccionTemporalDiaSemana(dias1);
		assertFalse(rTDS.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 2)));
		assertFalse(rTDS.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 3)));
		assertFalse(rTDS.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 4)));
		assertFalse(rTDS.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 5)));
		assertFalse(rTDS.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 6)));
		assertFalse(rTDS.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 9)));
		assertFalse(rTDS.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 10)));
		assertFalse(rTDS.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 11)));
		assertFalse(rTDS.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 12)));
		assertFalse(rTDS.cumpleRestriccion(LocalDate.of(2022, Month.NOVEMBER, 13)));
	}
	
	@Test
	void testCumpleRestriccionAhora() {
//		List<DayOfWeek> dias1 = new ArrayList<DayOfWeek>(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.TUESDAY));
//		rTDS = new RestriccionTemporalDiaSemana(dias1);
//		assertTrue(rTDS.cumpleRestriccion());
		List<DayOfWeek> diaActual = new ArrayList<DayOfWeek>(Arrays.asList(LocalDate.now().getDayOfWeek()));
		rTDS = new RestriccionTemporalDiaSemana(diaActual);
		assertTrue(rTDS.cumpleRestriccionAhora());
	}
	
	@Test
	void testNotCumpleRestriccionAhora() {
		List<DayOfWeek> todosLosDiasMenosHoy = new ArrayList<DayOfWeek>(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.TUESDAY,
				DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, 
				DayOfWeek.SATURDAY, DayOfWeek.SUNDAY));
		assertTrue(todosLosDiasMenosHoy.remove(LocalDate.now().getDayOfWeek()));
		rTDS = new RestriccionTemporalDiaSemana(todosLosDiasMenosHoy);
		assertFalse(rTDS.cumpleRestriccionAhora());
	}

}
