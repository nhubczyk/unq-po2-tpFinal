package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testRecomendacionesFavoritos {
	private Proyecto proyecto;
	private Desafio desafio1;
	private Desafio desafio2;
	private Desafio desafio3;
	private Desafio desafio4;
	private Desafio desafio5;
	private Desafio desafio6;
	private Desafio desafio7;
	private Desafio desafio8;
	private Desafio desafio9;
	private Desafio desafio10;
	private Usuario user;
	private List<Desafio> desafiosRecomendados;
	private RecomendacionFavoritos recomendacion;

	@BeforeEach
	void setUp() throws Exception {
		proyecto = new Proyecto("Poo2", "Objetos 2");
		desafio1 = new Desafio();
		desafio2 = new Desafio();
		desafio3 = new Desafio();
		desafio4 = new Desafio();
		desafio5 = new Desafio();
		desafio6 = new Desafio();
		desafio7 = new Desafio();
		desafio8 = new Desafio();
		desafio9 = new Desafio();
		desafio10 = new Desafio();
		user = new Usuario();
		
		proyecto.addDesafio(desafio1);
		proyecto.addDesafio(desafio2);
		proyecto.addDesafio(desafio3);
		proyecto.addDesafio(desafio4);
		proyecto.addDesafio(desafio5);
		proyecto.addDesafio(desafio6);
		proyecto.addDesafio(desafio7);
		proyecto.addDesafio(desafio8);
		proyecto.addDesafio(desafio9);
		proyecto.addDesafio(desafio10);
		desafiosRecomendados = new ArrayList<Desafio>();
		desafiosRecomendados.add(desafio1);
		desafiosRecomendados.add(desafio3);
		desafiosRecomendados.add(desafio5);
		desafiosRecomendados.add(desafio7);
		desafiosRecomendados.add(desafio9);

	}

	@Test
	void testDesafiosRecomendadosTrue() {
		user.setMetodoDeRecomendacion(recomendacion);
		assertEquals(proyecto.getRecomendaciones(user), desafiosRecomendados);

	}

}
