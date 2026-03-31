package oops_practice.Encapsulation_Polymorphism_Interfaces_AbstractClasses;

interface Reservable{
	 void reserveItem(String borrowerName);
	 boolean checkAvailability();
}
abstract class LibraryItem {
	private final int itemId;
	private String title;
	private String author;
	private boolean isAvailable = true;
	private String borrower;
	
	LibraryItem(int itemId,String title,String author){
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}
	abstract int getLoanDuration();
	public void getItemDetails(){
		System.out.println("Item id : "+itemId);
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
	}
	// getter and setter
	public int getItemId( ) {
		return itemId;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title =  title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author =  author;
	}
	
	public void reserveItem(String borrowerName) {
		if(isAvailable) {
			borrower = borrowerName;
            isAvailable = false;
            System.out.println(title + " reserved by " + borrowerName);
		}
		else {
			System.out.println("Already reserved ");
		}
	}
	public boolean checkAvailability() {
        return isAvailable;
    }
	
}
class Book extends LibraryItem{
	Book(int itemId,String title,String author){
		super(itemId,title,author);
	}
	@Override
	public int getLoanDuration() {
		return 10;
	}
	

}
class Magazine extends LibraryItem{
	Magazine(int itemId,String title,String author){
		super(itemId,title,author);
	}
	@Override
	public int getLoanDuration() {
		return 20;
	}
	
}
class DVD extends LibraryItem{
	DVD(int itemId,String title,String author){
		super(itemId,title,author);
	}

	@Override
	public int getLoanDuration() {
		return 30;
	}
}



public class LibraryManagementSystem {
	public static void main(String[] args) {
		 LibraryItem item1 = new Book(101, "Clean Code", "Robert Martin");
		 item1.getItemDetails();
		 System.out.println("Loan duratrion : "+item1.getLoanDuration());
		 item1.reserveItem("Aditya");
		 System.out.println("Available: " + item1.checkAvailability());
		
	}
}
