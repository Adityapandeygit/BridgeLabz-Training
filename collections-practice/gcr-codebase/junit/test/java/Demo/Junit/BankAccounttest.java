package Demo.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BankAccounttest {
	@Test
	void testDeposite() {
		BankAccount account = new BankAccount(1000);
        account.deposit(500);
        assertEquals(1500,account.getBalance());
	}
	@Test
	void testWithdraw() {
		BankAccount account = new BankAccount(1000);
        account.withdraw(500);
        assertEquals(500,account.getBalance());
	}
	@Test
	void testWithdrawInsufficientFunds() {
		BankAccount account = new BankAccount(500);
		assertThrows(IllegalArgumentException.class	, () -> {
			account.withdraw(1000);
		});
	}
}
