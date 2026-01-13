package oops_practice.scanrio_based.smartShelf;

public class SmartShelfDemo {
	public static void main(String[] args) {

        SmartShelf shelf = new SmartShelf();

        shelf.addBook("Data Structures");
        shelf.addBook("Algorithms");
        shelf.addBook("Java Programming");
        shelf.addBook("Artificial Intelligence");

        shelf.printShelf();
    }
}
