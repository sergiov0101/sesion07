package ual.hmis.sesion05.ejercicio4;

public class Ejercicio4 {
	public String caracteresComun(String P1,String P2) {
		String aux = "";
		for(int i = 0 ; i < P1.length(); i++) {
			if (P2.indexOf(P1.charAt(i)) >=0 && aux.indexOf(P1.charAt(i))<  0) {
				aux += P1.charAt(i);
				
			}
		}
		return aux;
	}

}
