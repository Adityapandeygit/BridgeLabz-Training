package constructors;

public class BookLibrary {
	public String ISBN;         
    protected String title;      
    private String author;      
    BookLibrary(String ISBN, String title, String author){
    	this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

	void setAuthor(String name) {
    	this.author = name;
    }
    String getAuthor() {
    	return author;
    }
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
    
	public static void main(String[] args) {
		EBook ebook = new EBook("123-ABC", "Java Basics", "James Gosling", "PDF");
        ebook.displayEBookDetails();
	}
    
}


class EBook extends BookLibrary {
	String bookformat;
	public EBook(String ISBN, String title, String author, String bookformat) {
        super(ISBN, title, author);
        this.bookformat = bookformat;
    }
	void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);     
        System.out.println("Title: " + title);   
        System.out.println("Format: " + bookformat);
        System.out.println("Author: " + getAuthor());
    }
}
