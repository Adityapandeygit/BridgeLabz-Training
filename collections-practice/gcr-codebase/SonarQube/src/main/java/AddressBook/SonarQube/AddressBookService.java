package AddressBook.SonarQube;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookService {

    private AddressBookSystem system = new AddressBookSystem();
    private AddressBookDao currentBook;
    private Scanner sc;
    public AddressBookService(Scanner sc) {
        this.sc = sc;
    }

    //  ADDRESS BOOK 

    public void createAddressBook() {
        System.out.print("Enter the address book name: ");
        String name = sc.nextLine();

        if (system.createAddressBook(name)) {
            System.out.println("Address Book created successfully");
        } else {
            System.out.println("Address Book already exists");
        }
    }

    public void selectAddressBook() {
        System.out.print("Enter Address Book Name: ");
        String name = sc.nextLine();

        currentBook = system.getAddressBook(name);
        if (currentBook == null) {
            System.out.println("Address Book not found");
        } else {
            System.out.println("Address Book selected: " + name);
        }
    }
    // Use Case - 8
    public void searchPerson(String name) {
    	system.searchPerson(name);
    }
    
    // Use Case - 9
    public void viewByCity(String city) {
        system.viewPersonsByCity(city);
    }
    public void viewByState(String state) {
        system.viewPersonsByState(state);
    }
    
    // Use Case - 10
    public void countByCity(String city) {
        system.countByCity(city);
    }
    public void countByState(String state) {
        system.countByState(state);
    }
    
    
    // CONTACT OPERATIONS 

    public void addContact() {
    	if (currentBook == null) {
            System.out.println("Please select an Address Book first");
            return;
        }
        Contacts contact = takeContactInput();
        boolean added = currentBook.addContact(contact);
        if (added) {
            System.out.println("Contact added successfully");
        } else {
            System.out.println("Duplicate contact found. Contact not added.");
        }
    }

    public void editContact() {
        if (currentBook == null) {
            System.out.println("Please select an Address Book first");
            return;
        }

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        Contacts contact = currentBook.findByName(firstName, lastName);
        if (contact == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new details:");
        Contacts updated = takeContactInput();

        currentBook.updateContact(
                contact,
                updated.getAddress(),
                updated.getCity(),
                updated.getState(),
                updated.getZip(),
                updated.getPhoneNumber(),
                updated.getEmail()
        );

        System.out.println("Contact updated successfully");
    }

    public void deleteContact() {
        if (currentBook == null) {
            System.out.println("Please select an Address Book first");
            return;
        }

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        boolean deleted = currentBook.deleteContactByName(firstName, lastName);
        System.out.println(deleted ? "Contact deleted successfully" : "Contact not found");
    }

    public void addMultipleContacts() {
        if (currentBook == null) {
            System.out.println("Please select an Address Book first");
            return;
        }

        System.out.print("Enter number of contacts to add: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        List<Contacts> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Contact " + i);
            Contacts contact = takeContactInput();
            if (currentBook.isDuplicate(contact.getFirstName(), contact.getLastName())) {
                System.out.println("Duplicate contact skipped: "
                        + contact.getFirstName() + " " + contact.getLastName());
            } else {
                list.add(contact);
            }
        }

        currentBook.addMultipleContacts(list);
        System.out.println("Multiple contacts added successfully");
    }

    public void displayAllContacts() {
        if (currentBook == null) {
            System.out.println("Please select an Address Book first");
            return;
        }
        List<Contacts> contacts = currentBook.getAllContacts();
        if (contacts.isEmpty()) {
            System.out.println("Address Book is empty");
            return;
        }

        System.out.println("\n Contact List ");
        for (Contacts c : contacts) {
            System.out.println(c);
            System.out.println();
        }
    }
    
    
    // Use Case - 11
    public void sortByName() {
        if (currentBook == null) {
            System.out.println("Please select an Address Book first");
            return;
        }
        currentBook.sortByName();
        System.out.println("Contacts sorted alphabetically by Name");
        displayAllContacts(); 
    }
    
    
    // Use Case - 12
    public void sortByCity() {
        if (currentBook == null) {
            System.out.println("Please select an Address Book first");
            return;
        }
        currentBook.sortByCity();
        System.out.println("Contacts sorted by City");
    }
    public void sortByState() {
        if (currentBook == null) {
            System.out.println("Please select an Address Book first");
            return;
        }
        currentBook.sortByState();
        System.out.println("Contacts sorted by State");
    }
    public void sortByZip() {
        if (currentBook == null) {
            System.out.println("Please select an Address Book first");
            return;
        }
        currentBook.sortByZip();
        System.out.println("Contacts sorted by Zip");
    }

    
    
    //  HELPER 

    private Contacts takeContactInput() {
        System.out.print("First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("State: ");
        String state = sc.nextLine();
        System.out.print("Zip: ");
        String zip = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        return new Contacts(firstName, lastName, address, city, state, zip, phone, email);
    }

	
}
