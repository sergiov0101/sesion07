package ual.hmis.sesion5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio3.Ejercicio3;
import ual.hmis.sesion05.ejercicio4.Ejercicio4;

class Ejercicio4Test {
	@ParameterizedTest (name = "{index} => NumeroCadena({0})")
	@CsvSource({"hola,hlaz,hla,","hola,hola,hola"})

	void caracteresComunTest(String input1,String input2, String expected) {
		Ejercicio4 c = new Ejercicio4();
		System.out.println(c.caracteresComun(input1,input2));
		assertTrue(c.caracteresComun(input1,input2).equals(expected));

	}


}
