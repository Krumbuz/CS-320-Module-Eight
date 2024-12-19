import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {
    @Test
    public void testContactCreation() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("12345", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhoneNumber());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test
    public void testInvalidContactId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "John", "Doe", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testSettersValidation() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(null));
        assertThrows(IllegalArgumentException.class, () -> contact.setPhoneNumber("123"));
    }
}
