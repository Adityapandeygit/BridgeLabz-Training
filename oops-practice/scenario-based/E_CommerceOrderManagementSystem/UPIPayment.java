package oops_practice.scanrio_based.E_CommerceOrderManagementSystem;

public class UPIPayment implements Payment{
	public void pay(double amount) {
		System.out.println("UPI payment successful: ₹" + amount);
	}
}
