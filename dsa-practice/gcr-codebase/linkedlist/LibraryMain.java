package dsa_practice.gcr_codebase.linkedlist;
class BookNode {
    int bookId;
    String title;
    String author;
    String genre;
    boolean isAvailable;
    BookNode prev;
    BookNode next;
    BookNode(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.prev = null;
        this.next = null;
    }
}

class LibraryManagementSystem {
    private BookNode head;
    private BookNode tail;
    public void addAtBeginning(int id, String title, String author, String genre, boolean status) {
        BookNode newNode = new BookNode(id, title, author, genre, status);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addAtEnd(int id, String title, String author, String genre, boolean status) {
        BookNode newNode = new BookNode(id, title, author, genre, status);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void addAtPosition(int pos, int id, String title, String author, String genre, boolean status) {
        if (pos == 1) {
            addAtBeginning(id, title, author, genre, status);
            return;
        }
        BookNode temp = head;
        for (int i = 1;i<pos-1;i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            addAtEnd(id, title, author, genre, status);
            return;
        }
        BookNode newNode = new BookNode(id, title, author, genre, status);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }
    public void removeByBookId(int id) {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }
        BookNode temp = head;
        while (temp!=null) {
            if (temp.bookId == id) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Book removed successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    public void search(String key) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(key) || temp.author.equalsIgnoreCase(key)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No matching book found");
        }
    }
    public void updateAvailability(int id, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }
    public void displayForward() {
        BookNode temp = head;
        if (temp == null) {
            System.out.println("No books available");
            return;
        }

        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }
    public void displayReverse() {
        BookNode temp = tail;
        if (temp == null) {
            System.out.println("No books available");
            return;
        }

        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }
    public int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    private void displayBook(BookNode b) {
        System.out.println(
            "ID: " + b.bookId +
            ", Title: " + b.title +
            ", Author: " + b.author +
            ", Genre: " + b.genre +
            ", Available: " + b.isAvailable
        );
    }
}
public class LibraryMain {
	public static void main(String[] args) {
		LibraryManagementSystem lib = new LibraryManagementSystem();
	    lib.addAtBeginning(101, "Java Basics", "James", "Programming", true);
	    lib.addAtEnd(102, "DSA", "Mark", "Computer Science", true);
	    lib.addAtPosition(2, 103, "DBMS", "Elmasri", "Database", false);

	    System.out.println("Forward Display");
	    lib.displayForward();

	    System.out.println("Reverse Display");
	    lib.displayReverse();

	    lib.search("James");
	    lib.updateAvailability(103, true);
	    lib.removeByBookId(102);

	    System.out.println("Total Books: " + lib.countBooks());
		
	}
}
