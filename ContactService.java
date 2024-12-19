import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Contact ID already exists");
        }
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID not found");
        }
        contacts.remove(contactId);
    }

    public void updateContactFirstName(String contactId, String firstName) {
        Contact contact = contacts.get(contactId);
        if (contact == null) {
            throw new IllegalArgumentException("Contact ID not found");
        }
        contact.setFirstName(firstName);
    }

    public void updateContactLastName(String contactId, String lastName) {
        Contact contact = contacts.get(contactId);
        if (contact == null) {
            throw new IllegalArgumentException("Contact ID not found");
        }
        contact.setLastName(lastName);
    }

    public void updateContactPhoneNumber(String contactId, String phoneNumber) {
        Contact contact = contacts.get(contactId);
        if (contact == null) {
            throw new IllegalArgumentException("Contact ID not found");
        }
        contact.setPhoneNumber(phoneNumber);
    }

    public void updateContactAddress(String contactId, String address) {
        Contact contact = contacts.get(contactId);
        if (contact == null) {
            throw new IllegalArgumentException("Contact ID not found");
        }
        contact.setAddress(address);
    }

    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}
