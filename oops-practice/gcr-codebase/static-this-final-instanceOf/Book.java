package staticfinalinstanceOf;

public class Book {
	static String libraryName = "Gla Library";
	String title;
	String author;
	final String isbn;
	public Book(String title,String author,String isbn) {
		this.author = author;
		this.title = title;
		this.isbn = isbn;
	}
	
	public static void displayLibraryName() {
		System.out.println("Name of the Library"+libraryName);
	}
	public void display(Object obj) {
		if(this instanceof Book) {
			Book b = (Book) obj;
			displayLibraryName();
			System.out.println("Title: "+title);
			System.out.println("Author: " +author);
			System.out.println("ISBN: "+isbn);
		}
		else {
			System.out.println("Invalid instance");
		}
	}
	
	public static void main(String[] args) {
		Book b1 = new Book("Effective Java","Joshua Bloch","978-0134685991");
		b1.display(b1);
	}	
}
