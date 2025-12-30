package classandobject;

public class MovieTicket {

    String movieName;
    String seatNumber;
    double price;
    boolean isBooked;

    // Constructor
    MovieTicket() {
        isBooked = false; 
    }

    void bookTicket(String movieName, String seatNumber, double price) {
        if (!isBooked) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            isBooked = true;

            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
        } else {
            System.out.println("House full!!! sorry..... Ticket already booked");
        }
    }

    void displayTicketDetails() {
        if (!isBooked) {
            System.out.println("Ticket have not booked yet....");
        } else {
            System.out.println("Price: $" + price);
        }
    }

    public static void main(String[] args) {

        MovieTicket ticket = new MovieTicket(); 

        ticket.displayTicketDetails();
        ticket.bookTicket("Dragon", "A10", 120.0);
        // again trying to book a ticket 
        ticket.bookTicket("Dragon", "A10", 120.0);
        ticket.displayTicketDetails();
    }
}
