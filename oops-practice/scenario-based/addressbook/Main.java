package oops_practice.scanrio_based.addressbook;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        Scanner sc = new Scanner(System.in);
        AddressBookService service = new AddressBookService(sc);

        while (true) {
            System.out.println("\n1. Create Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. Add Contact");
            System.out.println("4. Edit Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Display Contacts");
            System.out.println("7. Search Person by City/State");
            System.out.println("8. View Persons by City");
            System.out.println("9. View Persons by State");
            System.out.println("10. Count Contacts by City");
            System.out.println("11. Count Contacts by State");
            System.out.println("12. Sort Contacts by City");
            System.out.println("13. Sort Contacts by State");
            System.out.println("14. Sort Contacts by Zip");
            System.out.println("15. Sort Contacts Alphabetically by Name");

            
            System.out.println("ENTER THE CHOICE:");
            
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    service.createAddressBook();
                    break;
                case 2:
                    service.selectAddressBook();
                    break;
                case 3:
                    service.addContact();
                    break;
                case 4:
                    service.editContact();
                    break;
                case 5:
                    service.deleteContact();
                    break;
                case 6:
                    service.displayAllContacts();
                    break;
                case 7:
                    System.out.print("Enter City or State: ");
                    service.searchPerson(sc.nextLine());
                    break;
                case 8:
                    System.out.print("Enter City: ");
                    service.viewByCity(sc.nextLine());
                    break;
                case 9:
                    System.out.print("Enter State: ");
                    service.viewByState(sc.nextLine());
                    break; 
                case 10:
                    System.out.print("Enter City: ");
                    service.countByCity(sc.nextLine());
                    break;

                case 11:
                    System.out.print("Enter State: ");
                    service.countByState(sc.nextLine());
                    break;
                case 12:
                    service.sortByCity();
                    break;

                case 13:
                    service.sortByState();
                    break;

                case 14:
                    service.sortByZip();
                    break;
                case 15:
                    service.sortByName();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
