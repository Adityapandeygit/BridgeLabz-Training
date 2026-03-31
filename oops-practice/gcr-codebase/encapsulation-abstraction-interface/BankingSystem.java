package oops_practice.Encapsulation_Polymorphism_Interfaces_AbstractClasses;
interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public abstract double calculateInterest();
}
class SavingsAccount extends BankAccount implements Loanable {
    private static final double interestRate = 0.04;
    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }
    @Override
    public double calculateInterest() {
        return getBalance()*interestRate;
    }
    @Override
    public void applyForLoan() {
        System.out.println("Loan applied for Savings Account");
    }
    @Override
    public double calculateLoanEligibility() {
        return getBalance()*5;
    }
}
class CurrentAccount extends BankAccount implements Loanable {
    private static final double interestRate = 0.01;
    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance()*interestRate;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied for Current Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance()*10;
    }
}

public class BankingSystem {
	public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SA101", "Aditya", 50000);
        System.out.println("Account holder name: " + acc1.getHolderName());
        System.out.println("Balance: " + acc1.getBalance());
        System.out.println("Interest: " + acc1.calculateInterest());
        System.out.println();
//        // Interface polymorphism
        Loanable loanAcc1 = new SavingsAccount("SA102", "Amit", 40000);
        loanAcc1.applyForLoan();
        System.out.println("Loan Eligibility: " + loanAcc1.calculateLoanEligibility());
        
        System.out.println();
        BankAccount acc2 = new CurrentAccount("CA201", "Rahul", 80000);
        System.out.println("Account holder name: " + acc2.getHolderName());
        System.out.println("Balance: " + acc2.getBalance());
        System.out.println("Interest: " + acc2.calculateInterest());
        System.out.println();
//        // Interface polymorphism
        Loanable loanAcc2 = new SavingsAccount("SA102", "Amit", 40000);
        loanAcc2.applyForLoan();
        System.out.println("Loan Eligibility: " + loanAcc2.calculateLoanEligibility());
    }
       
}
