package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {
	public String numeroPorCadena(int numero) {
		String salida = "";
		if(numero < 0) {
			salida = "n�mero err�neo";
		}else if(numero <= 5) {
			salida = "*****";
		}else if(numero >= 12) {
			salida = "************";
		}else {
			for(int i=0; i < numero ; i++ ) {
				salida +="*";
			}
		}
	
		return salida;
	}
}
