package oops_practice.inheritance;

public class BankAccount {
	int accountNumber ;
	double balance;
	BankAccount(int accountNumber,double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	void displayAccountType(){
		System.out.println("Bank Count type");
	}
	
	public static void main(String[] args) {
		BankAccount savingAccount = new SavingsAccount(3454352,32487.0,20);
		savingAccount.displayAccountType();
		System.out.println();
		BankAccount checkingAccount = new CheckingAccount(3454352,32487.0,2000.0);
		checkingAccount.displayAccountType();
		System.out.println();
		BankAccount fixedDepositAccount = new FixedDepositAccount(3454352,32487.0,3000.0);
		fixedDepositAccount.displayAccountType();
	}
}
class SavingsAccount extends BankAccount{
	int interestRate ;
	SavingsAccount(int accountNumber,double balance,int interestRate){
		super(accountNumber,balance);
		this.interestRate=interestRate;
	}
	void displayAccountType() {
		super.displayAccountType();
		System.out.println("This is a saving account");
		System.out.println("Account number : " + accountNumber);
		System.out.println("Account balance : "+ balance);
		System.out.println("Interest Rate : " + interestRate+ "%");
	}
	
}
class CheckingAccount extends BankAccount{
	double withdrawalLimit ;
	CheckingAccount(int accountNumber,double balance,double withdrawalLimit){
		super(accountNumber,balance);
		this.withdrawalLimit=withdrawalLimit;
	}
	void displayAccountType() {
		super.displayAccountType();
		System.out.println("This is a Checking account");
		System.out.println("Account number : " + accountNumber);
		System.out.println("Account balance : "+ balance);
		System.out.println("Withdrawal limit : " + withdrawalLimit);
		System.out.println("New Balance : "+ (balance-withdrawalLimit));
	}
}
class FixedDepositAccount extends BankAccount{
	double depositeAmount;
	FixedDepositAccount(int accountNumber,double balance,double depositeAmount){
		super(accountNumber,balance);
		this.depositeAmount=depositeAmount;
	}
	void displayAccountType() {
		super.displayAccountType();
		System.out.println("This is a Fixed Deposite account");
		System.out.println("Account number : " + accountNumber);
		System.out.println("Account balance : "+ balance);
		System.out.println("Deposite Amount : " + depositeAmount);
		System.out.println("New Balance : "+ balance+depositeAmount);
	}
}