package oops_practice.scanrio_based.hotelReservationSystem;

public class FestivalPricing implements PricingStrategy{
	public double calculatePrice(double basePrice, int days) {
        return basePrice * days * 1.2; // 20% extra
    }
}
