package oops_practice.scanrio_based.onlineBankingSystem;

public interface BankService {
    void createAccount(Account account);
    void transfer(int fromAcc, int toAcc, double amount) throws InsufficientBalanceException;
    void checkBalance(int accNo);
    void showTransactions(int accNo);
}