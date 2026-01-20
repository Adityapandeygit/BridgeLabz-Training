package dsa_practice.scenario_based.tabHistoryManager;

public class BrowserTab {
	 Node current;
	 // Move to new page
	 public void visit(String url) {
	        Node newNode = new Node(url);

	        if (current != null) {
	            current.next = null; // clear forward history
	            newNode.prev = current;
	            current.next = newNode;
	        }
	        current = newNode;
	        System.out.println("Visited: " + url);
	 }
	 // Visite the previous page
	 public void back() {
	        if (current != null && current.prev != null) {
	            current = current.prev;
	            System.out.println("Back to: " + current.url);
	        } else {
	            System.out.println("No previous page");
	        }
	  }
	 
	 public void forward() {
	        if (current != null && current.next != null) {
	            current = current.next;
	            System.out.println("Forward to: " + current.url);
	        } else {
	            System.out.println("No forward page");
	        }
	    }
	 
	 // Current page
	 public String getCurrentPage() {
		 if(current!=null) {
			 return current.url;
		 }
		 return null;
	 }
}
