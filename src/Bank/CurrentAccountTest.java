package Bank;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Exceptions.MaxBalance;

public class CurrentAccountTest {
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Test
	public void testInsuffBalance() throws Exception{
		exceptionRule.expect(Exception.class);
		CurrentAccount a = new CurrentAccount("name",4000,"123");
	}

}
