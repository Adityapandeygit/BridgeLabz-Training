package oops_practice.scanrio_based;
class BankAccount {
	private int accountNumber;
	private double balance;
	BankAccount(int AccountNumber,double balance){
		this.accountNumber = AccountNumber;
		this.balance = balance;
	}
	// getter
	int getaccountNumber() {
		return accountNumber;
	}
	
	void deposit(double depositeAmount){
		if(depositeAmount>0) {
			System.out.println("Money deposited : "+depositeAmount);
			balance+=depositeAmount;
		}
		else {
			System.out.println("Enter a valid amount");
		}
	}
	void withdraw(double withdrawAmount) {
		if(withdrawAmount<=balance) {
			System.out.println("Withdrawal Successfully : "+withdrawAmount);
			balance -=withdrawAmount;
		}
		else {
			System.out.println("insufficient Balance");
		}
	}
	void checkBalance() {
		System.out.println("Current Balance : "+ balance);
	}
}



public class BankAccountManager {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(101010,1000.0);
		System.out.println("Account Number : " +bankAccount.getaccountNumber());
		bankAccount.checkBalance();
		bankAccount.deposit(500);
		bankAccount.checkBalance();
		bankAccount.withdraw(200.0);
		bankAccount.checkBalance();
		bankAccount.withdraw(2000);
	}
}
