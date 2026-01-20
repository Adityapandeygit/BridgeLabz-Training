package dsa_practice.scenario_based.bookShelf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class LibraryCatalog {

    private HashMap<String, LinkedList<Book>> catalog;
    private HashSet<String> isbnSet;

    public LibraryCatalog() {
        catalog = new HashMap<>();
        isbnSet = new HashSet<>();
    }

    public void addBook(String genre, Book book) {
        if (isbnSet.contains(book.getIsbn())) {
            System.out.println("Book already exists");
            return;
        }

        // FIX: create list only if genre does not exist
        catalog.putIfAbsent(genre, new LinkedList<>());

        catalog.get(genre).add(book);
        isbnSet.add(book.getIsbn());
    }

    public void borrowBook(String genre, Book book) {
        if (!catalog.containsKey(genre)) {
            System.out.println("Genre not found");
            return;
        }

        LinkedList<Book> books = catalog.get(genre);

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(book.getIsbn())) {
                books.remove(i);
                isbnSet.remove(book.getIsbn());
                System.out.println("Book borrowed: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println("  " + book);
            }
        }
    }
    // check for empty catalog
    public boolean isEmpty() {
    	if(catalog.isEmpty()) {
    		return true;
    	}
    	return false;
    }
}
