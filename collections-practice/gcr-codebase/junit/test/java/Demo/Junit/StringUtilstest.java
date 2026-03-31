package Demo.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilstest {
	StringUtils stringUtils;
	@BeforeEach
	void setUp() {
        stringUtils = new StringUtils();
    }
	
	@Test
	void testReverse() {
        assertEquals("olleh", stringUtils.reverse("hello"));
    }
	
	@Test
    void testReverseEmptyString() {
        assertEquals("", stringUtils.reverse(""));
    }

    @Test
    void testReverseNull() {
        assertNull(stringUtils.reverse(null));
    }

    @Test
    void testIsPalindromeTrue() {
        assertTrue(stringUtils.isPalindrome("madam"));
    }

    @Test
    void testIsPalindromeFalse() {
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    @Test
    void testIsPalindromeNull() {
        assertFalse(stringUtils.isPalindrome(null));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
    }

    @Test
    void testToUpperCaseAlreadyUpper() {
        assertEquals("HELLO", stringUtils.toUpperCase("HELLO"));
    }

    @Test
    void testToUpperCaseNull() {
        assertNull(stringUtils.toUpperCase(null));
    }
}
