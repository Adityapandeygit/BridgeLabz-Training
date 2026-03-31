package oops_practice.scanrio_based.digitalWalletSystem;

public class User {
	int userId;
    String name;
    Wallet wallet;

    User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.wallet = new Wallet();
    }
}
