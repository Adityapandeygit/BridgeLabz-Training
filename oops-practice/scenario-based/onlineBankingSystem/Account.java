package oops_practice.scanrio_based.onlineBankingSystem;

import java.util.ArrayList;
import java.util.List;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public abstract class Account {
	 int accountNumber;
	 String holderName;
	 private double balance;
	 List<String> transactions = new ArrayList<>();
	 Account(int accountNumber, String holderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.holderName = holderName;
	        this.balance = balance;
	        transactions.add("Initial balance: " + balance);
	 }
	 abstract double calculateInterest();
	 
	 void deposit(double amount) {
		 balance += amount;
		 transactions.add("Deposited: " + amount);
	 }
	 
	 void withdraw(double amount) throws InsufficientBalanceException {
	      if(amount > balance) {
	          throw new InsufficientBalanceException("Insufficient balance!");
	      }
	      balance -= amount;
	      transactions.add("Withdrawn: " + amount);
	 }
	 double getBalance() {
	      return balance;
	 }
	 List<String> getTransactionHistory() {
	        return transactions;
	 }
	 
}
