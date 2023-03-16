package exercici1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MainTest {

	ArrayList <String> testMesos;
	
	public void initTest() {
		testMesos = new ArrayList <String>();
		Main.afegirMesos();
		Main.ordenarMesos();
		testMesos = Main.llistaMesos;
	}
	
	
	@Test
	void testSize() {
		initTest();
		int size =testMesos.size();
		assertEquals(12,size);
	
	}

	@Test
	void testNull() {
		initTest();
		assertNotNull(testMesos);
	}
	
	@Test
	void testAgost() {
		initTest();
		
		boolean correcte = false;
			
		if (testMesos.get(7)=="Agost") {
		correcte = true;
		}
		assertEquals(true,correcte);	
		
	}
}
