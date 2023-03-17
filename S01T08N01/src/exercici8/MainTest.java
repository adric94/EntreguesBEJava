package exercici8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		StringReverser reverse = str -> {
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
		};
		
		String str = "Del dret o del revés?";
		assertEquals("?séver led o terd leD", reverse.reverse(str));
	}

}
