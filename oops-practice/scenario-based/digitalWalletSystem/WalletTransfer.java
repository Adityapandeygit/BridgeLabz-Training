package oops_practice.scanrio_based.digitalWalletSystem;

public class WalletTransfer implements TransferService{
	public void transfer(User from, User to, double amount) throws InsufficientBalanceException {
        from.wallet.withdrawMoney(amount);
        to.wallet.addMoney(amount);
        System.out.println("Wallet to Wallet Transfer Successful");
    }
}
