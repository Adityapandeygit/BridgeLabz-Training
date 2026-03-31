package Demo.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DateFormattertest {
	DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("31-01-2026", formatter.formatDate("2026-01-31"));
        assertEquals("15-08-2025", formatter.formatDate("2025-08-15"));
    }

    @Test
    void testInvalidFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("31-01-2026");
        });
    }

    @Test
    void testInvalidDateValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("2026-02-30");
        });
    }

    @Test
    void testNullDate() {
        assertThrows(Exception.class, () -> {
            formatter.formatDate(null);
        });
    }
}
