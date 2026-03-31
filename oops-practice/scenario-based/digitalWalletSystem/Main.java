package oops_practice.scanrio_based.digitalWalletSystem;

public class Main {
	public static void main(String[] args) {
		User u1 = new User(1, "Aditya");
        User u2 = new User(2, "Rahul");

        u1.wallet.addMoney(1000);

        TransferService walletTransfer = new WalletTransfer();
        TransferService bankTransfer = new BankTransfer();

        try {
            walletTransfer.transfer(u1, u2, 300);
            bankTransfer.transfer(u1, u2, 500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Aditya Balance: ₹" + u1.wallet.getBalance());
        System.out.println("Rahul Balance: ₹" + u2.wallet.getBalance());

        System.out.println("\nAditya Transactions:");
        for (Transaction t : u1.wallet.getTransactions()) {
            System.out.println(t);
        }
	}
}
