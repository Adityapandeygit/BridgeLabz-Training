package oops_practice.scanrio_based.digitalWalletSystem;

public interface TransferService {
	void transfer(User from, User to, double amount) throws InsufficientBalanceException;
	
}
