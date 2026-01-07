package oops_practice.scanrio_based.onlineBankingSystem;

class CurrentAccount extends Account {

    CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * 0.02; 
    }
}