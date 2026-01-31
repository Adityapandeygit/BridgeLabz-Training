package Demo.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Calculatortest {
	Calculator calc = new Calculator();
	@Test
	void testAdd() {
        assertEquals(10, calc.add(5, 5), "Addition should be correct");
    }
	void testSubtract() {
        assertEquals(2, calc.subtract(5, 3));
    }
	void testMultiply() {
		assertEquals(15, calc.multiply(3, 5));
	}
	void testDivide() {
        assertEquals(5, calc.divide(10, 2));
    }
	
	void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
        	calc.divide(10, 0);
        });
    }
}
