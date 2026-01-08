package dsa_practice.gcr_codebase.linkedlist;

import java.time.LocalDateTime;

class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    LocalDateTime bookingTime;
    TicketNode next;

    TicketNode(int ticketId, String customerName, String movieName,
               String seatNumber, LocalDateTime bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private TicketNode head = null;

    public void addTicket(int id, String customer, String movie, String seat) {
        TicketNode newNode = new TicketNode(
                id, customer, movie, seat, LocalDateTime.now());
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        TicketNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        TicketNode curr = head;
        TicketNode prev = head;

        while (prev.next != head) {
            prev = prev.next;
        }
        while (true) {
            if (curr.ticketId == ticketId) {
                if (curr == head && curr.next == head) {
                    head = null;
                }
                else if (curr == head) {
                    head = head.next;
                    prev.next = head;
                }
                else {
                    prev.next = curr.next;
                }
                System.out.println("Ticket removed successfully.");
                return;
            }
            prev = curr;
            curr = curr.next;
            if (curr == head) {
            	break;
            } 
        }

        System.out.println("Ticket ID not found.");
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        TicketNode temp = head;
        while (true) {
            System.out.println(
                temp.ticketId + " " +
                temp.customerName + " " +
                temp.movieName + " " +
                temp.seatNumber
            );
            temp = temp.next;
            if (temp == head) {
            	break;
            } 
        }
    }
    public void searchTicket(String keyword) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }
        TicketNode temp = head;
        boolean found = false;
        while (true) {
            if (temp.customerName.equals(keyword) ||
                temp.movieName.equals(keyword)) {
                System.out.println("Ticket ID : " + temp.ticketId);
                System.out.println("Customer  : " + temp.customerName);
                System.out.println("Movie     : " + temp.movieName);
                System.out.println("Seat No   : " + temp.seatNumber);
                found = true;
            }
            temp = temp.next;
            if (temp == head) {
            	break;
            } 
        }

        if (!found) {
            System.out.println("No matching ticket found.");
        }
    }

    public int getTotalTickets() {
    	if (head == null) {
            return 0;
        }
        int count = 1;
        TicketNode temp = head.next;
        while(temp != head) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class OnlineTicketReservationSystem {
	public static void main(String[] args) {

        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(101, "Aditya", "Inception", "A1");
        system.addTicket(102, "Rahul", "Interstellar", "B2");
        system.addTicket(103, "Aditya", "Inception", "C3");

        System.out.println("\nAll Tickets:");
        system.displayTickets();

        System.out.println("\nSearch by Movie Name:");
        system.searchTicket("Inception");

        System.out.println("\nTotal Tickets: " + system.getTotalTickets());

        System.out.println("\nRemoving Ticket ID 102");
        system.removeTicket(102);

        System.out.println("\nUpdated Ticket List:");
        system.displayTickets();
    }
}
