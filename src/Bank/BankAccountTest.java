package Bank;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Exceptions.MaxBalance;
import Exceptions.MaxWithdraw;

public class BankAccountTest {
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Test
	public void testDeposit() {
		BankAccount a = new BankAccount("name",300,300);
		a.deposit(100);
		assertEquals(a.getbalance(), 400,0.01);
	}
	
	@Test 
	public void testWithdrawSucceed() throws MaxWithdraw, MaxBalance {
		BankAccount a = new BankAccount("name",400,300);
		a.withdraw(100);
		assertEquals(a.getbalance(),300,0.01);
	}
	
	@Test
	public void testWithdrawFail() throws MaxWithdraw, MaxBalance {
		BankAccount a = new BankAccount("name",300,300);
		exceptionRule.expect(MaxBalance.class);
		a.withdraw(100);
		
	}
}
