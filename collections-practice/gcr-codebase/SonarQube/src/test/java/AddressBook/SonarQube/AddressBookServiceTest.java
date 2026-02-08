package AddressBook.SonarQube;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class AddressBookServiceTest {
	@Test
    void testServiceCreation() {
        Scanner sc = new Scanner(System.in);
        AddressBookService service = new AddressBookService(sc);

        assertNotNull(service);
    }

    @Test
    void testSearchDelegation() {
        Scanner sc = new Scanner(System.in);
        AddressBookService service = new AddressBookService(sc);

        assertDoesNotThrow(() -> service.searchPerson("UP"));
    }
}
