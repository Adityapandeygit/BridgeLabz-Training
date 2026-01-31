package Demo.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberUtilstest {
	@ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testIsEven_TrueCases(int number) {
        assertEquals(true, NumberUtils.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testIsEven_FalseCases(int number) {
        assertEquals(false, NumberUtils.isEven(number));
    }
}
