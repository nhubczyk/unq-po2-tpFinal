package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CategoriaTest {
	Categoria categoria;

	@Test
	void testContructorYGet() {
		categoria = new Categoria("nombre1", "descripcion1");
		assertEquals("nombre1", categoria.getNombre());
		assertEquals("descripcion1", categoria.getDescripcion());
		
		categoria = new Categoria("nombre2", "descripcion2");
		assertEquals("nombre2", categoria.getNombre());
		assertEquals("descripcion2", categoria.getDescripcion());
		
		categoria = new Categoria("nombre3", "descripcion3");
		assertEquals("nombre3", categoria.getNombre());
		assertEquals("descripcion3", categoria.getDescripcion());
	}

}
