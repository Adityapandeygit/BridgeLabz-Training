package collections_practice.scenario_based.restaurantTableReservationSystem;

public class Reservation {
	private String customerName;
    private int tableNumber;
    private String timeSlot;

    public Reservation(String customerName, int tableNumber, String timeSlot) {
        this.customerName = customerName;
        this.tableNumber = tableNumber;
        this.timeSlot = timeSlot;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    @Override
    public String toString() {
        return "Customer: " + customerName +
               ", Table: " + tableNumber +
               ", Time: " + timeSlot;
    }
}
