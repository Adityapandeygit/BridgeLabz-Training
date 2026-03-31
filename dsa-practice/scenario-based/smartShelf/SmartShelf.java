package oops_practice.scanrio_based.smartShelf;

import java.util.ArrayList;
import java.util.List;

public class SmartShelf {
	private List<Book> books = new ArrayList<>();

    // Add book and keep shelf sorted
    public void addBook(String title) {
        Book newBook = new Book(title);
        books.add(newBook);

        // Insertion Sort logic (real-time)
        int i = books.size() - 1;

        while (i > 0 && books.get(i - 1).title.compareToIgnoreCase(newBook.title) > 0) {
            books.set(i, books.get(i - 1));
            i--;
        }
        books.set(i, newBook);

        System.out.println(title + " added and placed correctly");
    }

    // Display current shelf
    public void printShelf() {
        System.out.println("SmartShelf:");
        for (Book b : books) {
            System.out.println(b.title);
        }
    }
}
