package operar;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class OperarTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testHacerOperaciones() {
		Operar.hacerOperaciones(2, 3, 1);
		Operar.hacerOperaciones(3, 3, 2);
		Operar.hacerOperaciones(4, 4, 3);
		Operar.hacerOperaciones(3, 3, 4);
	}

}
