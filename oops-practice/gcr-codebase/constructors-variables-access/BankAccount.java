package constructors;

public class BankAccount {
	public int accountNumber ;
	protected String accountHolder ;
	private double balance;
	BankAccount(int accountNumber,String accountHolder,double balance){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	// creating getter and setter for balance
	public void setBalance(double newamount) {
		this.balance = balance+newamount;
	}
	public double getBalance() {
		return balance;
	}

	
	public void display() {
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Holder name : "+accountHolder);
		System.out.println("Available balance : "+balance);
	}
	
	public static void main(String[] args) {
		SavingsAccount sv1 = new SavingsAccount(101,"Aditya Pandey",100000);
		sv1.displaySavingAccountBalance();
		sv1.setBalance(1000);
		sv1.displaySavingAccountBalance();
	}
}

class SavingsAccount extends BankAccount{
	SavingsAccount(int accountNumber,String accountHolder,double balance){
		super(accountNumber,accountHolder,balance);
	}
	
	void displaySavingAccountBalance() {
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Holder name : "+accountHolder);
		System.out.println("balance : "+ getBalance());
		
	}
	
}
