package oops_practice.scanrio_based.ticketPriceOptimizer;

public class EventManager {
	public static void main(String[] args) {
        Ticket[] tickets = {
            new Ticket(1500),
            new Ticket(500),
            new Ticket(2000),
            new Ticket(750),
            new Ticket(1200),
            new Ticket(300)
        };
        QuickSortUtil.quickSort(tickets, 0, tickets.length - 1);
        System.out.println("Sorted Ticket Prices:");
        for (Ticket t : tickets) {
            System.out.print(t.price + " ");
        }
        System.out.println();
        System.out.println("Top 3 Cheapest Tickets:");
        for (int i = 0; i < 3; i++) {
            System.out.println(tickets[i].price);
        }
    }
}
