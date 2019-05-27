package ual.hmis.sesion5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import ual.hmis.sesion05.ejercicio1.Ejercicio1;

class Ejercicio1Test {

	@ParameterizedTest
	@CsvSource ({"2, 1","5, 1","6,1", "14, 7"})
	void testTransformar(int input, int expected) {
		Ejercicio1 c = new Ejercicio1();
		assertEquals(expected, c.transformar(input));
	}

}
