package P1P2_Proyect;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCuadrado {

	@Test
	public void testCuadrado() {
		Clase1 C = new Clase1();
		int x = 3;
		int resultado = C.Cuadrado(x);
		assertEquals(resultado,9);
	}
	
	@Test
	public void testDoble() {
		Clase1 C = new Clase1();
		int x = 3;
		int resultado = C.doble(x);
		assertEquals(resultado,6);
	}

}
