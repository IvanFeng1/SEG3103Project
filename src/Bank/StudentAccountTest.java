package Bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentAccountTest {

	@Test
	public void testInit() {
		StudentAccount a = new StudentAccount("name",7000,"Institution");
		assertEquals(a.institutionName, "Institution");
	}

}
