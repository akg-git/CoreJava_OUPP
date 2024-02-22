/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops;

/**
 * @author AKG
 *
 */

class TestCalculator{
	private int operand1;
	private int operand2;
	private int result;
	
	TestCalculator()
	{
		
	}
	
	TestCalculator(int operand1, int operand2)
	{
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	int addition()
	{
		result = operand1 + operand2;
		return result;
	}
	
	 int substraction()
	{
		result =  operand1 - operand2;
		return result;
	}
	
	 int multiplication()
	{
		result = operand1 * operand2;
		return result;
	}
	
	 int division()
	{
		result = operand1 / operand2;
		return result;
	}
}

public class CalculatorTest                            {

	public static void main(String[] args) {

//		TestCalculator tc = new TestCalculator();
//		
//		System.out.println("Addition = "+ tc.addition(4, 9));
//		System.out.println("Substraction = "+ tc.substraction(2,13));
//		System.out.println("Multiplication = "+ tc.multiplication(5,9));
//		System.out.println("Division = "+ tc.division(12,5));
		
		TestCalculator tc = new TestCalculator(45,12);
		
		System.out.println("Addition = "+ tc.addition());
		System.out.println("Substraction = "+ tc.substraction());
		System.out.println("Multiplication = "+ tc.multiplication());
		System.out.println("Division = "+ tc.division());

	}

}
