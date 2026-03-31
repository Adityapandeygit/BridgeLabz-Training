package collections_practice.scenario_based.restaurantTableReservationSystem;

public class TableAlreadyReservedException extends Exception{
	public TableAlreadyReservedException(String msg) {
		super(msg);
	}
}
