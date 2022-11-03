package ar.edu.unq.poo2.tpfinal;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class RestriccionTemporalDiaSemana extends RestriccionTemporal {
	private List<DayOfWeek> diasDeSemanaValidos;
	
	public RestriccionTemporalDiaSemana(List<DayOfWeek> diasDeSemanaValidos) {
		this.diasDeSemanaValidos = diasDeSemanaValidos;
	}
	
	private List<DayOfWeek> getDiasDeSemanaValidos(){
		return diasDeSemanaValidos;
	}
	
	@Override
	public boolean cumpleRestriccion(LocalDate fecha) {
		return getDiasDeSemanaValidos().contains(fecha.getDayOfWeek());
	}
	
	@Override
	public boolean cumpleRestriccionAhora() {
		return cumpleRestriccion(LocalDate.now());
	}
}
