package Demo.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UnitTest {
	@Test
	public void Test_Deposit_ValidAmount() throws Exception {
		Program account = new Program(1000);
		account.deposit(500);
		assertEquals(1500,account.getBalance());
	}
	
	@Test
    public void Test_Deposit_NegativeAmount() {
		Program account = new Program(1000);
		Exception ex = assertThrows(Exception.class , ()-> {
			account.deposit(-100);
		});
	}
	@Test
    public void Test_Withdraw_ValidAmount() throws Exception {
		Program account = new Program(1000);
		account.withdraw(400);
		assertEquals(600, account.getBalance());
	}
	@Test
    public void Test_Withdraw_InsufficientFunds() {
        Program account = new Program(1000);
        Exception ex = assertThrows(Exception.class, () -> {
            account.withdraw(1500);
        });
    }

}
