package Demo.Junit;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRegistrationtest {
	UserRegistration registration = new UserRegistration();
	void testValidRegistration() {
        assertTrue(registration.registerUser(
                "Aditya",
                "aditya@gmail.com",
                "Password1"
        ));
    }
	void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("ab", "test@gmail.com", "Password1");
        });
    }
	void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("Aditya", "invalidemail", "Password1");
        });
    }
	void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("Aditya", "test@gmail.com", "pass");
        });
    }
	void testNullInputs() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(null, null, null);
        });
    }
}
