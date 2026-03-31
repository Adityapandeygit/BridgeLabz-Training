package Demo.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DivideExceptiontest {
	DivideException d = new DivideException();
	
	@Test
	void testDivideException() {
		ArithmeticException exception = assertThrows(ArithmeticException.class, ()->{
			d.divide(10,0);
		});
		assertEquals("Division by zero is not allowed", exception.getMessage());
	}
}
