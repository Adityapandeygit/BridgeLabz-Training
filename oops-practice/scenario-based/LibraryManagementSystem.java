package oops_practice.scanrio_based;

import java.util.Scanner;

class Book{
	String title;
	String author;
	boolean available;
	Book(String title,String author,boolean available){
		this.author = author;
		this.title = title;
		this.available = available;
	}

}
public class LibraryManagementSystem {
	
	public static void main(String[] args) {
		
		Book[] books = { new Book("Java Programming", "James Gosling",true),
			    new Book("Clean Code", "Robert Martin",true),
			    new Book("Data Structures", "Mark Allen",true),
			    new Book("Effective Java", "Joshua Bloch",true),
			    new Book("Python Basics", "Guido van Rossum",true)};
		
		display(books);
		System.out.println();
		searchBook(books);
		System.out.println();
		
		updateBookStatus(books,false);
	}
	public static void display(Book[] books) {
		System.out.println("Available books are :");
		for (Book b : books) {
            System.out.println(
                b.title + " | " + b.author + " | " +
                (b.available ? "Available" : "Not Available")
            );
        }
	}
	
	static void searchBook(Book[] books) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title of the book you want to search : ");
		String s = sc.nextLine();
		boolean found = false;
		for(Book b :books) {
			if(b.title.equals(s)) {
				System.out.println(b.title+" | "+b.author+" | " +
						(b.available ? "Available":"Not Available"));
				found = true;
			}
			
		}
		if(!found) {
			System.out.println("No book found in the library");
		}
	}
	
	public static void updateBookStatus(Book[] books,boolean returnBook) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter exact book title you want to retrun : ");
        String title = sc.nextLine();
        for (Book b : books) {
        	if(b.title.equals(title)) {
        		if(returnBook) {
        			b.available=true;
        		}
        		else {
        			// If you want to checkout book
        			if(b.available) {
        				b.available = false;
            			System.out.println("Book checked out successfully");
        			}
        			else {
        				System.out.println("Book is not available");
        			}
        			
        		}
        	}
        }
	}
}
