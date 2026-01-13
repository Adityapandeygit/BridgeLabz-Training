package oops_practice.scanrio_based.digitalWalletSystem;

public class BankTransfer implements TransferService{
	public void transfer(User from, User to, double amount) throws InsufficientBalanceException {
        from.wallet.withdrawMoney(amount);
        to.wallet.addMoney(amount);
        System.out.println("Bank Transfer Successful");
    }
}
