package oops_practice.scanrio_based.digitalWalletSystem;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg) {
        super(msg);
    }
}
