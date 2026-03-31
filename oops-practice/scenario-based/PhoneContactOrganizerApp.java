package oops_practice.scanrio_based;

import java.util.ArrayList;
import java.util.List;

class InvalidPhoneNumberException extends RuntimeException {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        if (!phoneNumber.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException(
                "Phone number must be exactly 10 digits."
            );
        }
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber;
    }
}

class ContactOrganizer {
    private List<Contact> contacts = new ArrayList<>();
    public void addContact(String name, String phoneNumber) {
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Duplicate contact not allowed.");
                return;
            }
        }
        contacts.add(new Contact(name, phoneNumber));
        System.out.println("Contact added successfully.");
    }
    public void deleteContact(String phoneNumber) {
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                contacts.remove(c);
                System.out.println("Contact deleted successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void searchContact(String keyword) {
        boolean found = false;
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(keyword) ||
                c.getPhoneNumber().equals(keyword)) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching contact found.");
        }
    }

    // Display All Contacts
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}

public class PhoneContactOrganizerApp {
    public static void main(String[] args) {
        ContactOrganizer organizer = new ContactOrganizer();
        organizer.addContact("Aditya", "9876543210");
        organizer.addContact("Rohit", "9123456789");
        organizer.addContact("Aman", "9876543210");

        // Invalid phone number test
        try {
            organizer.addContact("Rahul", "12345");
        } catch (InvalidPhoneNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Search Result:");
        organizer.searchContact("Aditya");

        System.out.println("All Contacts:");
        organizer.displayContacts();

        System.out.println("Delete Contact:");
        organizer.deleteContact("9123456789");

        System.out.println("Updated Contacts:");
        organizer.displayContacts();
    }
}
