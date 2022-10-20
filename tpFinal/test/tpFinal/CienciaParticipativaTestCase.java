import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CienciaParticipativaTestCase {
	private CienciaParticipativa ciencia; //SUT
	private Proyecto proyecto; // DOC
	
	@Before
	public void setUp() {
		ciencia = new CienciaPartipativa();
		proyecto = mock(Proyecto.class);
	}
	
	@Test
	void testAgregarProyecto() {
		
	}

}