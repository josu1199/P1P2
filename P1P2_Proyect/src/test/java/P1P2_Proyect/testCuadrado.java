package P1P2_Proyect;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCuadrado {

	private Clase1 C = new Clase1();
	
	@Test
	public void testCuadrado() {
		int x = 3;
		int resultado = C.Cuadrado(x);
		assertEquals(resultado,9);
	}
	
	@Test
	public void testTriple() {
		int x = 2;
		int resultado = C.Triple(x);
		assertEquals(resultado, 6);
	}

}
