package oops_practice.scanrio_based.E_CommerceOrderManagementSystem;

public class CardPayment implements Payment{
	public void pay(double amount) {
		System.out.println("Card payment successful: ₹" + amount);
	}
}
