/**
 * 
 */
package gov.in.oupp.training.java.corejava.basics;

import java.util.Scanner;

/**
 * @author AKG
 *
 */
public class SwapNumbersWithoutThirdVariable {
	
	public void swapNumbers(int num1, int num2)
	{
		num1 = num1 + num2;
		num2 =  num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After Swapping: \nNumber1 = "+num1+"\nNumber2 = "+num2);
	}
	

	public static void main(String[] args) {
		
		int num1=0;
		int num2=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number1: ");
		num1 = sc.nextInt();
		
		System.out.print("Enter Number2: ");
		num2 = sc.nextInt();
		
		System.out.println("Before Swapping: \nNumber1 = "+num1+"\nNumber2 = "+num2);
		SwapNumbersWithoutThirdVariable swtv = new SwapNumbersWithoutThirdVariable();
		swtv.swapNumbers(num1, num2);
		
		sc.close();
		
	}

}
