package classandobject;

public class BankAccount {
	String accountHolder;
	String accountNumber;
	double balance;
	void depositingMoney(double amount) {
		balance = balance + amount;
        System.out.println("Deposited: " + amount);
        currentBalance();
	}
	void withdrawMoney(double amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println("Withdraw amount is :" + amount);
			currentBalance();
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	void currentBalance() {
		System.out.println("Current balance: " + balance);
	}
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
        account.accountHolder = "State of Chennai";
        account.accountNumber = "ACC001";
        account.balance = 700.0;

        System.out.println(account.accountHolder);
        account.currentBalance();

        account.depositingMoney(200.0);
        account.withdrawMoney(100.0);
        account.withdrawMoney(900.0);
	}
}
