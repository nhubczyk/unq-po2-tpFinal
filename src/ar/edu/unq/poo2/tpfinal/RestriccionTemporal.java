package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;

public abstract class RestriccionTemporal {
	public abstract boolean cumpleRestriccion(LocalDate fecha);
	public abstract boolean cumpleRestriccionAhora();
}
