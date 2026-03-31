package AddressBook.SonarQube;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactsTest {
	 @Test
	    void testContactCreation() {
	        Contacts c = new Contacts(
	                "Aditya",
	                "Pandey",
	                "Address",
	                "City",
	                "State",
	                "123456",
	                "9876543210",
	                "test@gmail.com"
	        );

	        assertEquals("Aditya", c.getFirstName());
	        assertEquals("Pandey", c.getLastName());
	        assertEquals("City", c.getCity());
	    }
}
