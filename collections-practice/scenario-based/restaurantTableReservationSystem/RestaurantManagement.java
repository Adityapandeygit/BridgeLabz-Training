package collections_practice.scenario_based.restaurantTableReservationSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantManagement {
	 Map<Integer, Table> tables = new HashMap<>();
     List<Reservation> reservations = new ArrayList<>();
     
     public void addTable(Table table) {
    	 tables.put(table.getTableNumber(),table);
     }
     public void reserveTable(String customerName, int tableNumber, String timeSlot)
             throws TableAlreadyReservedException {

         // Check if table exists
         if (!tables.containsKey(tableNumber)) {
             System.out.println("Table does not exist!");
             return;
         }

         // Prevent double booking
         for (Reservation r : reservations) {
             if (r.getTableNumber() == tableNumber &&
                 r.getTimeSlot().equalsIgnoreCase(timeSlot)) {

                 throw new TableAlreadyReservedException(
                     "Table " + tableNumber + " is already reserved for " + timeSlot
                 );
             }
         }

         // Reserve table
         reservations.add(new Reservation(customerName, tableNumber, timeSlot));
         System.out.println("Reservation successful!");
     }

     public void showReservations() {
         for (Reservation r : reservations) {
             System.out.println(r);
         }
     }
}
