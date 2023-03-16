package exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> Main.afegirItem()); 
	}

}
