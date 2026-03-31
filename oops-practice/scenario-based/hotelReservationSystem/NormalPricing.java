package oops_practice.scanrio_based.hotelReservationSystem;

public class NormalPricing implements PricingStrategy{
	public double calculatePrice(double basePrice, int days) {
        return basePrice * days;
    }
}
