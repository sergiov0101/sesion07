package ual.hmis.sesion5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio3.Ejercicio3;

class Ejercicio3Test {
	@ParameterizedTest (name = "{index} => NumeroCadena({0})")
	@CsvSource({"2,*****","-1,número erróneo","5,*****","13, ************","6, ******"})

	void NumeroCadenatest(int input, String expected) {
		Ejercicio3 c = new Ejercicio3();
		assertTrue(c.numeroPorCadena(input).equals(expected));

	}

}
