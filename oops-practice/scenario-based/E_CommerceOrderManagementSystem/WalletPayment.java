package oops_practice.scanrio_based.E_CommerceOrderManagementSystem;

public class WalletPayment implements Payment{
	public void pay(double amount) {
		System.out.println("Wallet payment successful: ₹" + amount);
	}
}
