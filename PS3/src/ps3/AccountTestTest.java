package ps3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTestTest {
	Account c;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		c = new Account();
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}
	

	@Test
	public void test() {
		int x = 0;
		
		while (x < 20) {
			c.deposit(3000);
		}
		
	}
	@Test
	public final void testWithdraw() {
		c.setBalance(20000);
		c.withdraw(2500); 
		assertEquals("true", (long)c.getBalance(), (long)20000.00);
	c.withdraw(2500);
	}
	
	@Test
	public final void testMonthlyInterestRate () {
		c.setAnnualInterestRate(.0045);
	}

}
