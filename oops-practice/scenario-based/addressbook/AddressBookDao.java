package oops_practice.scanrio_based.addressbook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AddressBookDao {

    private List<Contacts> contactsList = new ArrayList<>();

    // Use Case 2 - Add Contact
    public boolean addContact(Contacts contact) {
    	if (isDuplicate(contact.getFirstName(), contact.getLastName())) {
            return false;
        }
        contactsList.add(contact);
        return true;
    }

    // Use Case 3 - Find Contact (used by Service)
    public Contacts findByName(String firstName, String lastName) {
        for (Contacts c : contactsList) {
            if (c.getFirstName().equalsIgnoreCase(firstName)
                    && c.getLastName().equalsIgnoreCase(lastName)) {
                return c;
            }
        }
        return null;
    }

    // Use Case 3 - Update Contact (called by Service)
    public void updateContact(Contacts contact,
                              String address, String city, String state,
                              String zip, String phone, String email) {

        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhoneNumber(phone);
        contact.setEmail(email);
    }

    // Use Case 4 - Delete Contact
    public boolean deleteContactByName(String firstName, String lastName) {
        for (int i = 0; i < contactsList.size(); i++) {
            Contacts c = contactsList.get(i);
            if (c.getFirstName().equalsIgnoreCase(firstName)
                    && c.getLastName().equalsIgnoreCase(lastName)) {
                contactsList.remove(i);
                return true;
            }
        }
        return false;
    }

    // Use Case 5 - Add Multiple Contacts
    public void addMultipleContacts(List<Contacts> contacts) {
        contactsList.addAll(contacts);
    }

    // Get all contacts
    public List<Contacts> getAllContacts() {
        return contactsList;
    }
    
    // Use Case - 7
    public boolean isDuplicate(String firstName, String lastName) {
        for (Contacts c : contactsList) {
            if (c.getFirstName().equalsIgnoreCase(firstName)
                    && c.getLastName().equalsIgnoreCase(lastName)) {
                return true;
            }
        }
        return false;
    }
    
    
    // Use Case - 11
    // Sort contacts alphabetically by First Name, then Last Name
    public void sortByName() {
        contactsList.sort(
            Comparator.comparing(Contacts::getFirstName, String.CASE_INSENSITIVE_ORDER)
                      .thenComparing(Contacts::getLastName, String.CASE_INSENSITIVE_ORDER)
        );
    }
    
    // Use Case - 12
    // Sort by City
    public void sortByCity() {
        contactsList.sort(Comparator.comparing(Contacts::getCity, String.CASE_INSENSITIVE_ORDER));
    }

    // Sort by State
    public void sortByState() {
        contactsList.sort(Comparator.comparing(Contacts::getState, String.CASE_INSENSITIVE_ORDER));
    }

    // Sort by Zip
    public void sortByZip() {
        contactsList.sort(Comparator.comparing(Contacts::getZip));
    }
}
