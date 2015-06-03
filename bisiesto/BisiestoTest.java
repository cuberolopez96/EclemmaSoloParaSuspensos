package bisiesto;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BisiestoTest {

	@Test
	public void Bisiesto(){
		  Bisiesto.mostrarSiBisiesto(2000);
		  Bisiesto.mostrarSiBisiesto(2004);
		  Bisiesto.mostrarSiBisiesto(1100);
		  Bisiesto.mostrarSiBisiesto(2001);
	}

}
