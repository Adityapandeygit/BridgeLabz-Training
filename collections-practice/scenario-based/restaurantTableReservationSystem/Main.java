package collections_practice.scenario_based.restaurantTableReservationSystem;

public class Main {
	public static void main(String[] args) {

        RestaurantManagement restaurant = new RestaurantManagement();

        restaurant.addTable(new Table(1, 4));
        restaurant.addTable(new Table(2, 2));

        try {
            restaurant.reserveTable("Aditya", 1, "7PM - 8PM");
            restaurant.reserveTable("Rahul", 1, "7PM - 8PM"); 
        } catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }

        restaurant.showReservations();
    }
}
