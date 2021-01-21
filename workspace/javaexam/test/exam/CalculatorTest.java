package exam;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	Calculator cal;
	protected void setUp() throws Exception {
		cal = new Calculator();
		System.out.println("setUP");
	}

	protected void tearDown() throws Exception {
		System.out.println("tearDown");
	}
	
	public void testAdd() throws Exception{
		System.out.println("testAdd");
		int result = cal.add(5, 3);
		assertEquals(8, result);
	}
	public void testMinus() throws Exception{
		System.out.println("testMinus");
		assertEquals(2, cal.minus(5, 3));
	}
}
