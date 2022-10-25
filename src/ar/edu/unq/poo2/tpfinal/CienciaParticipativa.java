package ar.edu.unq.poo2.tpfinal;

import java.util.ArrayList;
import java.util.List;

public class CienciaParticipativa {
	private List<Proyecto> proyectos = new ArrayList<Proyecto>();
	
	public CienciaParticipativa() {
		
	}

	public void addProyecto(Proyecto proyecto) {
		proyectos.add(proyecto);
	}

	public Boolean tieneElElemento(Proyecto proyecto) {
		return proyectos.contains(proyecto);
	}
}
