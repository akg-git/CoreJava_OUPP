/**
 * 
 */
package gov.in.oupp.training.java.corejava.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

import gov.in.oupp.training.java.corejava.junit.Calculator;

/**
 * @author AKG
 *
 */
public class CalculatorTest {

	 @Test
	 public void testAdd() {
	 Calculator calculator = new Calculator();
	 //assertEquals(EXPECTED, ACTUAL);
	 assertEquals(5, calculator.add(2, 3));
	 assertEquals(-5, calculator.add(-12, 7));
	 assertEquals(8, calculator.add(8, 0));
	
	 }

	@Test
	public void testSubstract() {
		Calculator calculator = new Calculator();
		assertEquals(15, calculator.substract(18, 3));
		assertEquals(-3, calculator.substract(-12, -9));
		assertEquals(9, calculator.substract(0, -9));

	}

	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		assertEquals(8, calculator.multiply(2, 4));
		assertEquals(-18, calculator.multiply(-6, 3));
		assertEquals(0, calculator.multiply(-12, 0));

	}

	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		assertEquals(5, calculator.divide(15, 3));
		assertEquals(6, calculator.divide(-12, -2));
		assertEquals(0, calculator.divide(0, 6));

		 // testing divide by 0
		 try {
		 calculator.divide(-12, 0);
		 fail("Expected ArithmeticException");
		 } catch (ArithmeticException ae) {
		 assertEquals("A number can\'t be divided by 0: Math Rule", ae.getMessage());
		 }

	}

}
