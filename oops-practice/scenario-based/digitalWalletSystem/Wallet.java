package oops_practice.scanrio_based.digitalWalletSystem;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
	private double balance = 0;
    private List<Transaction> transactions = new ArrayList<>();

    void addMoney(double amount) {
        balance += amount;
        transactions.add(new Transaction("Added", amount));
    }

    void withdrawMoney(double amount) throws InsufficientBalanceException {
        if (balance < amount)
            throw new InsufficientBalanceException("Insufficient Balance");

        balance -= amount;
        transactions.add(new Transaction("Withdrawn", amount));
    }

    double getBalance() {
        return balance;
    }

    List<Transaction> getTransactions() {
        return transactions;
    }
}
