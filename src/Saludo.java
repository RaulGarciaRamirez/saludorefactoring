/**
 * 
 */

/**
 * @author Raúl 
 * 
 * Saluda en diferentes idiomas
 */
public class Saludo {

	/**
	 * Greets
	 * 
	 * @param idioma       idioma elegido
	 * @param repeticiones cuántas veces se repite el saludo
	 * @return un String con los saludos
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

		// Repite el saludo repeticiones veces
		for (int contador = 0; contador < repeticiones; contador++) {
			resultado += saludo;
		}

		return resultado;
	}
}
