package oops_practice.scanrio_based.onlineBankingSystem;

import java.util.HashMap;
import java.util.Map;

class Bank implements BankService {
    Map<Integer, Account> accounts = new HashMap<>();
    @Override
    public void createAccount(Account account) {
        accounts.put(account.accountNumber, account);
        System.out.println("Account created for " + account.holderName);
    }

    @Override
    public void transfer(int fromAcc, int toAcc, double amount) throws InsufficientBalanceException {
        Account sender = accounts.get(fromAcc);
        Account receiver = accounts.get(toAcc);

        sender.withdraw(amount);
        receiver.deposit(amount);

        sender.transactions.add("Transferred " + amount + " to Account " + toAcc);
        receiver.transactions.add("Received " + amount + " from Account " + fromAcc);
    }

    @Override
    public void checkBalance(int accNo) {
        Account acc = accounts.get(accNo);
        System.out.println("Balance: " + acc.getBalance());
    }

    @Override
    public void showTransactions(int accNo) {
        Account acc = accounts.get(accNo);
        acc.getTransactionHistory().forEach(System.out::println);
    }
}
