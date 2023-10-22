package mavenPractice;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.miitSessions.Calculator1;

public class CalculatorTest {
	@Test
	public void testAdd() {
		assertEquals(5,Calculator1.add(3,3));
	}
	
	@Test
	public void testSub() {
		assertEquals(-1,Calculator1.sub(6, 7));
	}
	
	@Test
	public void testMulti () {
		assertEquals(24,Calculator1.multi(12, 2));
	}
	
	@Test
	public void testDiv() {
		assertEquals (8, Calculator1.div(56, 7));
	}

	

}
