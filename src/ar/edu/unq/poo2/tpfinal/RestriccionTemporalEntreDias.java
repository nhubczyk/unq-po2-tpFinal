package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;

public class RestriccionTemporalEntreDias extends RestriccionTemporal {

	private LocalDate diaInicio;
	private LocalDate diaFin;
	
	public RestriccionTemporalEntreDias(LocalDate diaInicio, LocalDate diaFin) {
		this.diaInicio = diaInicio;
		this.diaFin = diaFin;
	}
	
	@Override
	public boolean cumpleRestriccion(LocalDate fecha) {
		return ((fecha.isAfter(getDiaInicio()) || fecha.isEqual(getDiaInicio()))
	    		&&
	    		(fecha.isBefore(getDiaFin()) || fecha.isEqual(getDiaFin()))
	    		);
	}
	
	private LocalDate getDiaInicio() {
		return diaInicio;
	}
	
	private LocalDate getDiaFin() {
		return diaFin;
	}
	
	@Override
	public boolean cumpleRestriccionAhora() {
	    return cumpleRestriccion(LocalDate.now());
	}

}
