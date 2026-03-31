package AddressBook.SonarQube;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AddressBookSystemTest {
	private AddressBookSystem system;

    @BeforeEach
    void setup() {
        system = new AddressBookSystem();
    }

    @Test
    void testCreateAddressBook() {
        boolean created = system.createAddressBook("Personal");
        assertTrue(created);
    }

    @Test
    void testDuplicateAddressBook() {
        system.createAddressBook("Office");
        boolean created = system.createAddressBook("Office");
        assertFalse(created);
    }

    @Test
    void testGetAddressBook() {
        system.createAddressBook("Friends");
        AddressBookDao dao = system.getAddressBook("Friends");
        assertNotNull(dao);
    }
}
