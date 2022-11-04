package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testRecomendacionesPreferencia {
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
	private RecomendacionPreferencia recomendacion;
	private PreferenciasUsuario preferencias;
	private List<Desafio> desafiosNoRecomendados;

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
		desafiosNoRecomendados = new ArrayList<Desafio>();
		desafiosNoRecomendados.add(desafio2);
		desafiosNoRecomendados.add(desafio4);
		desafiosNoRecomendados.add(desafio6);
		desafiosNoRecomendados.add(desafio8);
		desafiosNoRecomendados.add(desafio10);
		recomendacion = new RecomendacionPreferencia();
		preferencias = new PreferenciasUsuario();
		user.setPreferenciasUsuario(preferencias);
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
		user.setMetodoDeRecomendacion(recomendacion);
		desafiosRecomendados = new ArrayList<Desafio>();
		desafiosRecomendados.add(desafio1);
		desafiosRecomendados.add(desafio3);
		desafiosRecomendados.add(desafio5);
		desafiosRecomendados.add(desafio7);
		desafiosRecomendados.add(desafio9);
		preferencias.setCantidadMuestras(4);
		preferencias.setDificultad(4);
		preferencias.setRecompensaPreferida(3);
		preferencias.setDesafioPreferido(desafio9);

		desafio1.setCantidadMuestrasNecesarias(4);
		desafio1.setDificultad(4);
		desafio1.setRecompensa(3);

		desafio2.setCantidadMuestrasNecesarias(1);
		desafio2.setDificultad(1);
		desafio2.setRecompensa(1);

		desafio3.setCantidadMuestrasNecesarias(4);
		desafio3.setDificultad(4);
		desafio3.setRecompensa(3);

		desafio4.setCantidadMuestrasNecesarias(1);
		desafio4.setDificultad(1);
		desafio4.setRecompensa(1);

		desafio5.setCantidadMuestrasNecesarias(4);
		desafio5.setDificultad(4);
		desafio5.setRecompensa(3);

		desafio6.setCantidadMuestrasNecesarias(1);
		desafio6.setDificultad(1);
		desafio6.setRecompensa(1);

		desafio7.setCantidadMuestrasNecesarias(4);
		desafio7.setDificultad(4);
		desafio7.setRecompensa(3);

		desafio8.setCantidadMuestrasNecesarias(1);
		desafio8.setDificultad(1);
		desafio8.setRecompensa(1);

		desafio9.setCantidadMuestrasNecesarias(4);
		desafio9.setDificultad(4);
		desafio9.setRecompensa(3);

		desafio10.setCantidadMuestrasNecesarias(1);
		desafio10.setDificultad(1);
		desafio10.setRecompensa(1);

	}

	@Test
	void test() {
		assertEquals(proyecto.getRecomendaciones(user), desafiosRecomendados);
	}
	
	@Test
	void testfalse() {
		assertNotEquals(proyecto.getRecomendaciones(user), desafiosNoRecomendados);
	}

}
