package ual.hmis.sesion05.ejercicio2;

public class Ejercicio2 {
	public boolean login (String username, String password){
	   // String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])";
		//comprobar cadena vacia
		if (username.isEmpty() || password.isEmpty()) {
			return false;
		}
		
		// comprobar que la longitud sea < 30
		if (username.length() >= 30 || password.length() >= 30) {
			return false;
		}
		/*if(!password.matches(pattern)) {
			return false;
		}*/
		// llamar al método de la bbdd
		return compruebaLoginEnBD(username, password);
		}
		public boolean compruebaLoginEnBD
		 (String username, String password){
		// método mock (simulado)
		if (username == "user" && password == "pass")
		return true;
		else
		return false;
		}
}
