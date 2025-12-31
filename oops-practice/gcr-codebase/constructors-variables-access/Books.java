package constructors;

public class Books {
	String title;
	String author;
	double price;
	boolean availability = true;
	Books(String title,String author,double price){
		this.author = author;
		this.title = title;
		this.price = price;
		this.availability = true;
	}
	void borrowBook() {
		if(availability) {
			System.out.println("The book is available you can borrow");
			System.out.println("Book borrowed successfully.");
			availability = false;
		}
		else {
			System.out.println("Sorry the book is not available");
		}
	}
	void displayBook() {
	    System.out.println("Title: " + title);
	    System.out.println("Author: " + author);
	    System.out.println("Price: " + price);
	    System.out.println("Available: " + availability);
	    System.out.println();
	}
	
	public static void main(String[] args) {
		Books b1 = new Books("Rich dad Poor dad","Aditya",300);
		b1.borrowBook();
		b1.displayBook();
		b1.borrowBook();
		
	}
}
