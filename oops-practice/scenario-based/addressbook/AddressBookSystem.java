package oops_practice.scanrio_based.addressbook;

import java.util.HashMap;
import java.util.Map;

// Use Case - 6
public class AddressBookSystem {
	 Map<String, AddressBookDao> addressBooks = new HashMap<>();
	 
	 // Create Address Book 
	 public boolean createAddressBook(String name) {
		 if(addressBooks.containsKey(name)) {
			 return false;
		 }
		 addressBooks.put(name, new AddressBookDao());
		 return true;
	 }
	 public AddressBookDao getAddressBook(String name) {
		 return addressBooks.get(name);
	 }
	 public void displayAddressBook() {
		 if(addressBooks.isEmpty()) {
			 System.out.println("No address book available .");
		 }
		 System.out.println("Available address book are : ");
		 System.out.println();
		 for(String name :addressBooks.keySet()) {
			 System.out.println(name);
			 
		 }
	 }
	 
	 // Use Case - 8
	 public void searchPerson(String value) {
		    boolean found = false;
		    for (AddressBookDao book : addressBooks.values()) {
		        for (Contacts c : book.getAllContacts()) {
		            if (c.getCity().equalsIgnoreCase(value) ||
		                c.getState().equalsIgnoreCase(value)) {

		                System.out.println(c.getFirstName()+" "+c.getLastName());
		                found = true;
		            }
		        }
		    }
		    if (!found) {
		        System.out.println("No person found in given City/State");
		    }
	 }
	 
	// Use Case - 9
	 public void viewPersonsByCity(String city) {
		    boolean found = false;
		    for (AddressBookDao book : addressBooks.values()) {
		        for (Contacts c : book.getAllContacts()) {
		            if (c.getCity().equalsIgnoreCase(city)) {
		                System.out.println(c.getFirstName() + " " + c.getLastName());
		                found = true;
		            }
		        }
		    }
		    if (!found) {
		        System.out.println("No persons found in city: " + city);
		    }
	 }
	 
	 public void viewPersonsByState(String state) {
		    boolean found = false;
		    for (AddressBookDao book : addressBooks.values()) {
		        for (Contacts c : book.getAllContacts()) {
		            if (c.getState().equalsIgnoreCase(state)) {
		                System.out.println(c.getFirstName() + " " + c.getLastName());
		                found = true;
		            }
		        }
		    }
		    if (!found) {
		        System.out.println("No persons found in state: " + state);
		    }
	 }
	 
	 // Use Case - 10
	// Count persons by City
	 public void countByCity(String city) {
	     int count = 0;
	     for (AddressBookDao book : addressBooks.values()) {
	         for (Contacts c : book.getAllContacts()) {
	             if (c.getCity().equalsIgnoreCase(city)) {
	                 count++;
	             }
	         }
	     }
	     if (count == 0) {
	         System.out.println("No contacts found in city: " + city);
	     } else {
	         System.out.println("Total contacts in city " + city + " : " + count);
	     }
	 }
	 // Count persons by State
	 public void countByState(String state) {
	     int count = 0;
	     for (AddressBookDao book : addressBooks.values()) {
	         for (Contacts c : book.getAllContacts()) {
	             if (c.getState().equalsIgnoreCase(state)) {
	                 count++;
	             }
	         }
	     }
	     if (count == 0) {
	         System.out.println("No contacts found in state: " + state);
	     } else {
	         System.out.println("Total contacts in state " + state + " : " + count);
	     }
	 }
	
}


