package exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculoDniTest {

@ParameterizedTest
@ValueSource (strings= {"75295385D","61435741G","16867502S","96767751N","90917654B","87177015T",
		"71440864N","20277165C","13060158E","47666447M"})


	
	void test(String Dni) {
		boolean dniValid = CalculoDni.comprobarDni(Dni);
		assertEquals(true,dniValid);
}

}
