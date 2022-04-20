/**
 * 
 */

/**
 * @author Bad Taste greetz in different languages
 */
public class Saludo {

	/**
	 * Greets
	 * 
	 * @param idioma       chosen language
	 * @param repeticiones how many times repeat greet
	 * @return a String with the greeting
	 */
	public String saludar(int idioma, int repeticiones) {
		String resultado = "";
		String saludo = "";

		switch (idioma) {
		case 0:
			saludo = "hola";
			break;
		case 1:
			saludo = "hello";
			break;
		case 2:
			saludo = "kaixo";
			break;
		default:
			break;
		}

		// Repeat greet rep times
		for (int contador = 0; contador < repeticiones; contador++) {
			resultado += saludo;
		}

		return resultado;
	}
}
