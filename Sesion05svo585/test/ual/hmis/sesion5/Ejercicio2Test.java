package ual.hmis.sesion5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ual.hmis.sesion05.ejercicio1.Ejercicio1;
import ual.hmis.sesion05.ejercicio2.Ejercicio2;

class Ejercicio2Test {

	@Test
	void testLogin() {
		Ejercicio2 c = new Ejercicio2();
		assertTrue( c.login("user","pass"));
	}
	
	@Test
	void testLogin2() {
		Ejercicio2 c = new Ejercicio2();
		assertFalse( c.login("",""));
	}
	
	@Test
	void testLogin3() {
		Ejercicio2 c = new Ejercicio2();
		assertFalse( c.login("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
	}
	@Test
	void testLogin4() {
		Ejercicio2 c = new Ejercicio2();
		assertFalse( c.login("usedr","pass"));
	}

}
