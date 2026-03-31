package dsa_practice.scenario_based.bookShelf;

import java.util.Scanner;

public class BookShelfMenu {
	public void start() {
	LibraryCatalog library = new LibraryCatalog();
	Scanner sc = new Scanner(System.in);
	while(true) {
		 System.out.println("\n===== BOOKSHELF MENU =====");
         System.out.println("1. Add Book");
         System.out.println("2. Borrow Book");
         System.out.println("3. Display Catalog");
         System.out.println("4. Exit");
         System.out.print("Enter choice: ");
         int choice = sc.nextInt();
         System.out.println();
         
         switch(choice) {
         	case 1:
             System.out.print("Enter Genre: ");
             String genre = sc.nextLine();

             System.out.print("Enter ISBN: ");
             String isbn = sc.nextLine();

             System.out.print("Enter Title: ");
             String title = sc.nextLine();

             System.out.print("Enter Author: ");
             String author = sc.nextLine();

             Book book = new Book(isbn, title, author);
             library.addBook(genre, book);
             break;
             
         	case 2:
                System.out.print("Enter Genre: ");
                String borrowGenre = sc.nextLine();

                System.out.print("Enter ISBN to Borrow: ");
                String borrowIsbn = sc.nextLine();

                // Only ISBN is enough to borrow
                Book borrowBook = new Book(borrowIsbn, "", "");
                library.borrowBook(borrowGenre, borrowBook);
                break;
                
         	case 3:
         		if(library.isEmpty()) {
         			System.out.println("No book present in catalog ");
         		}
                library.displayCatalog();
                
                break;
         	case 4:
                System.out.println("Exiting Bookshelf. Goodbye!");
                sc.close();
                return;
                
         	default:
                System.out.println("Invalid choice. Try again.");
         
         }
	}
	
	}
}
