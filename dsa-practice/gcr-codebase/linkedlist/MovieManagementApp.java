package dsa_practice.gcr_codebase.linkedlist;


class Node{
	String title;
    String director;
    int year;
    double rating;
    Node prev;
    Node next;

    Node(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}
class MManager{
	Node head = null;
	Node tail = null;
	public void addBeginning(String title,String director,int year,double rating) {
		Node newNode = new Node(title,director,year,rating);
		if(head==null) {
			head = tail =  newNode;
			return;
		}
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	public void addLast(String title,String director,int year,double rating) {
		Node newNode = new Node(title,director,year,rating);
		if(tail==null) {
			head = tail =  newNode;
			return;
		}
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}
	public void addPos(int pos , String title,String director,int year,double rating) {
		Node newNode = new Node(title,director,year,rating);
		if(pos == 1) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		Node temp = head;
		for(int i=1;i<pos-1;i++) {
			temp = temp.next;
		}
		if(temp==null || temp.next==null) {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		else {
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next.prev = newNode;
			temp.next = newNode;
		}
	}
	public void removebyTitle(String title) {
		Node temp = head;;
		while(temp!=null) {
			if(temp.title.equals(title)) {
				if(temp==head) {
					head = head.next;
					head.prev = null;
				}
				else if(temp==tail) {
					tail = tail.prev;
					tail.next = null;
				}
				else {
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;	
				}
				System.out.println("Movie Removed : ");
				return;
			}
			temp = temp.next;
		}
	}
	public void searchDirector(String director) {
		Node temp = head;
        boolean found = false;
        while(temp!=null) {
        	if(temp.director.equals(director)) {
        		System.out.println("Movie found");
        		found = true;
        	}
        	temp = temp.next;
        }
        if (!found) {
            System.out.println("No movies found for director: " + director);
        }
	}
	public void searchByRating(double rating) {
        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
            	System.out.println("Movie found");
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movies found with rating: " + rating);
        }
    }
	public void updateRating(String title,double newrating) {
		Node temp = head;
		while(temp != null) {
			if (temp.title.equalsIgnoreCase(title)) {
				temp.rating = newrating;
                System.out.println("Rating updated for: " + title);
                return;
			}
		}
		temp = temp.next;
		System.out.println("Movie not found!");
	}
	public void displayForward() {
        Node temp = head;
        System.out.println("Movies (Forward Order):");

        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }
	public void displayReverse() {
        Node temp = tail;
        System.out.println("Movies (Reverse Order):");

        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }
	public void displayMovie(Node movie) {
        System.out.println(
            "Title: " + movie.title +
            ", Director: " + movie.director +
            ", Year: " + movie.year +
            ", Rating: " + movie.rating
        );
    }

}

public class MovieManagementApp {
	public static void main(String[] args) {
		MManager  m = new MManager();
		m.addBeginning("Inception", "Christopher Nolan", 2010, 8.8);
		m.addLast("Interstellar", "Christopher Nolan", 2014, 8.6);
        m.addLast("Titanic", "James Cameron", 1997, 7.8);
      
        m.displayForward();
        m.displayReverse();
        
        m.addPos(2, "Avatar", "James Cameron", 2009, 7.9);
        m.displayForward();
        
        m.searchDirector("Christopher Nolan");
        m.searchByRating(7.9);

        m.updateRating("Titanic", 8.0);
        m.displayForward();

        m.removebyTitle("Avatar");
        m.displayForward();
	}
}
