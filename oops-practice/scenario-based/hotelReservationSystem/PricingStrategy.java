package oops_practice.scanrio_based.hotelReservationSystem;

public interface PricingStrategy {
	double calculatePrice(double basePrice, int days);
}
