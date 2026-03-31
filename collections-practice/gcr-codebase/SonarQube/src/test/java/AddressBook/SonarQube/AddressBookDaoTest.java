package AddressBook.SonarQube;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AddressBookDaoTest {
	private AddressBookDao dao;
    private Contacts contact;

    @BeforeEach
    void setup() {
        dao = new AddressBookDao();
        contact = new Contacts(
                "Aditya", "Pandey",
                "Mathura Road",
                "Mathura",
                "UP",
                "281001",
                "9999999999",
                "adi@gmail.com"
        );
    }

    @Test
    void testAddContact() {
        boolean result = dao.addContact(contact);
        assertTrue(result);
        assertEquals(1, dao.getAllContacts().size());
    }

    @Test
    void testDuplicateContact() {
        dao.addContact(contact);
        boolean result = dao.addContact(contact);
        assertFalse(result);
    }

    @Test
    void testFindByName() {
        dao.addContact(contact);
        Contacts found = dao.findByName("Aditya", "Pandey");
        assertNotNull(found);
    }

    @Test
    void testDeleteContact() {
        dao.addContact(contact);
        boolean deleted = dao.deleteContactByName("Aditya", "Pandey");
        assertTrue(deleted);
    }

    @Test
    void testUpdateContact() {
        dao.addContact(contact);

        dao.updateContact(contact,
                "New Address",
                "Agra",
                "UP",
                "282001",
                "8888888888",
                "new@gmail.com");

        assertEquals("Agra", contact.getCity());
        assertEquals("New Address", contact.getAddress());
    }
}
