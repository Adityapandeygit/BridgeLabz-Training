package collections_practice.gcr_codebase.java_exception;

class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
class BankAccount {
	double balance;
	BankAccount(double balance){
		this.balance = balance;
	}
	public void withdraw(double amount) throws InsufficientBalanceException{
		if(amount>balance) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
		balance = balance-amount;
	}
}
public class BankTransactionSystem {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(5000);
		try {
			account.withdraw(-16000); 
		}
		catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
	}
}
