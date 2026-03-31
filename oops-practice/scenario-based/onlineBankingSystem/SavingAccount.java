package oops_practice.scanrio_based.onlineBankingSystem;

public class SavingAccount extends Account{
	SavingAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }
	double calculateInterest() {
        return getBalance() * 0.04; 
    }
}
