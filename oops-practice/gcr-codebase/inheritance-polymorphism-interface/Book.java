package oops_practice.inheritance;

public class Book {
	String title;
	int publicationYear;
	Book(String title,int publicationYear){
		this.title = title;
		this.publicationYear = publicationYear;
	}
	public static void main(String[] args) {
		Author author = new Author("Rich Dad Poor Dad",1980,"Xyz","Good");
		author.displayInfo();
	}
}
class Author extends Book{
	String name;
	String bio;
	Author(String title, int publicationYear,String name,String bio) {
		super(title, publicationYear);
		this.name = name;
		this.bio = bio;
	}	
	void displayInfo() {
		System.out.println("Book title : "+title);
		System.out.println("Book Publication Year : " + publicationYear);
		System.out.println("Book name : "+name);
		System.out.println("Book bio : "+bio);
	}
}
