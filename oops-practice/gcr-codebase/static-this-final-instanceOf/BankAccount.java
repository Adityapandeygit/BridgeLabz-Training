package staticfinalinstanceOf;

public class BankAccount {
	static String bankName = "State bank of India";
	static int totalAccounts =0;
	private String accountHolderName;
	private final int accountNumber;
	private double balance;
	// parameterised Constructors
	public BankAccount(String accountHolderName, int accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this .balance = balance;
		totalAccounts++;
		
	}
	public static void getTotalAccounts() {
		System.out.println("Total number of accounts : "+ totalAccounts);
	}
	// display method 
	public void display() {
		if(this instanceof BankAccount) {
			System.out.println("Name of accountHolder : "+ accountHolderName);
			System.out.println("Account number : " + accountNumber);
			System.out.println("Current balance : " + balance);
		}
		else {
			System.out.println("Invalid Account Instance");
		}	
	}
	
	// Making getter and Setter for private variables 
	public void setaccountHolderName(String name) {
		this.accountHolderName = name;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void deposite(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposited : "+amount);
		}
		else {
			System.out.println("Invalid amount of deposite");
		}
	}
	public double getBalance() {
		return balance;
	}
	public void withdraw(double withdrawamt) {
		if(withdrawamt<=balance) {
			balance-=withdrawamt;
			System.out.println("Withdrawn amount : "+withdrawamt);
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	// creating main function
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("Aditya Pandey",1010,2000.0);
		BankAccount account2 = new BankAccount("Prashnant",1011,500.0);
		account1.display();
		account1.getBalance();
		System.out.println();
		account2.display();
		account2.getBalance();
		System.out.println();
		BankAccount.getTotalAccounts();
		System.out.println();

		System.out.println("Balance of Aditya's account : "+account1.getBalance());
		account1.deposite(2000);
		System.out.println("Balance of Aditya's account : "+account1.getBalance());
		
	}
	
}
