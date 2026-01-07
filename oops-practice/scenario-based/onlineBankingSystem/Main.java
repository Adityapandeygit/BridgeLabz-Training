package oops_practice.scanrio_based.onlineBankingSystem;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Account a1 = new SavingAccount(101, "Aditya", 5000);
        Account a2 = new CurrentAccount(102, "Rahul", 3000);

        bank.createAccount(a1);
        bank.createAccount(a2);

        bank.checkBalance(101);

        try {
            bank.transfer(101, 102, 1500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        bank.checkBalance(101);
        bank.checkBalance(102);

        System.out.println("\nTransaction History of Account 101:");
        bank.showTransactions(101);
    }
}
