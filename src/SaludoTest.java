import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Bad Taste test class for a rubbish class
 */
public class SaludoTest {

	@Test
	public void testSaludar() {
		Saludo saludo = new Saludo();

		String esperado = "hola";
		String objetivo = saludo.saludar(0, 1);
		assertEquals("Testing spanish greet once", esperado, objetivo);

		esperado = "hellohello";
		objetivo = saludo.saludar(1, 2);
		assertEquals("Testing english greet twice", esperado, objetivo);

		esperado = "kaixokaixokaixokaixo";
		objetivo = saludo.saludar(2, 4);
		assertEquals("Testing basque greet four times", esperado, objetivo);

	}

}
