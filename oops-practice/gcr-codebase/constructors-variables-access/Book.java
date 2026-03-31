package constructors;

public class Book {
	String title;
	String author;
	double price;
	// creating default constructor
	Book(){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	// creating parameterised constructor
	Book(String title,String author,double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void display() {
		System.out.println("Book tile "+ title);
		System.out.println("Author name "+ author);
		System.out.println("Price " + price);
	}
	public static void main(String[] args) {
		
		Book book = new Book();
		book.title = "Rich Dad Poor Dad";
		book.author = "Aditya";
		book.price = 500;
		book.display();
		Book book1 = new Book("Rich Dad Poor Dad","Aditya",500);
		book.display();
		
	}
}
