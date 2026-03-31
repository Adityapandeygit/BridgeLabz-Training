package classandobject;

public class Book {
	String title;
	String Author;
	double price;
	
	void display() {
		System.out.println("Title of the book: "+ title);
		System.out.println("Author of the book: "+ Author);
		System.out.println("Price of the book: "+ price);
	}
	public static void main(String[] args) {
		Book book = new Book();
		book.title = "2States";
		book.Author = "Chetan Bhagat";
		book.price = 500.0;
		book.display();
	}
}
