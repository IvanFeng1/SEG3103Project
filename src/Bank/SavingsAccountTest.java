package Bank;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Exceptions.MaxBalance;
import Exceptions.MaxWithdraw;

public class SavingsAccountTest {
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Test
	public void testInit() {
		SavingsAccount a = new SavingsAccount("name",5000,1000);
		assertEquals(a.maxWithLimit, 1000,0.01);
	}
	
	@Test 
	public void testGetNetBalance() {
		SavingsAccount a = new SavingsAccount("name",5000,1000);
		assertEquals(a.getNetBalance(), 5000 + (5000*0.05),0.01);
	}
	
	@Test 
	public void testWithdraw() throws MaxWithdraw, MaxBalance{
		SavingsAccount a = new SavingsAccount("name",5000,1000);
		exceptionRule.expect(MaxWithdraw.class);
		a.withdraw(6000);
		
	}
}
