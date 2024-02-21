/**
 * 
 */
package gov.in.oupp.training.java.corejava.basics;

import java.util.Scanner;

/**
 * @author AKG
 *
 */
public class GreatestBetweenTwoNumbers {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number1: ");
		num1 = sc.nextInt();
		
		System.out.print("Enter Number2: ");
		num2 = sc.nextInt();
		
		int maxNumber = num1>=num2? num1 : num2;
		
		System.out.println("Greatest Number = "+maxNumber);
		
		sc.close();

	}

}
