/**
 * 
 */
package gov.in.oupp.training.java.corejava.junit;

/**
 * @author AKG
 *
 */
public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int substract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		if (b == 0)
			throw new ArithmeticException("A number can\'t be divided by 0: Math Rule");

		return a / b;
	}

}
