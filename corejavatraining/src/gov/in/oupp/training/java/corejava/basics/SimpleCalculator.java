/**
 * Write a Java Program to create a simple calculator using switch case.
 * 
 */
package gov.in.oupp.training.java.corejava.basics;

import java.util.Scanner;

/**
 * @author AKG
 *
 */

class Calculator{
	
	public int addition(int a, int b)
	{
		return a+b;
	}
	
	public int substraction(int a, int b)
	{
		return a-b;
	}
	
	public int multiplication(int a, int b)
	{
		return a*b;
	}
	
	public float division(float a, float b)
	{
		if(b!=0)
			return a/b;
		else
		{
			System.out.println("Invalid Operation");
			return -1;
		}
	}
	
	public int modulous(int a, int b)
	{
		if(b!=0)
			return a%b;
		else
		{
			System.out.println("Invalid Operation.");
			return -1;
		}
	}
	
}

public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Calculator c = new Calculator();
		
		System.out.println("Simple Calculator\n------------------------");
		int number1;
		int number2;
		String operator;
		
		System.out.print("Enter Number1: ");
		number1 = sc.nextInt();
		System.out.print("Enter Operator: ");
		operator = sc.next();
		System.out.print("Enter Number2: ");
		number2 = sc.nextInt();
		
		System.out.println("\n\nResult Screen\n--------------");
		switch(operator)
		{
			case "+": //addition operation
						int additionResult;
						additionResult = c.addition(number1, number2);
						System.out.println(additionResult);
						break;
			case "-": //substraction operation
						int substractionResult;
						substractionResult = c.substraction(number1 , number2);
						System.out.println(substractionResult);
						break;
			case "*": //multiplication operation
						int  multiplicationResult;
						multiplicationResult = c.multiplication(number1 ,number2);
						System.out.println(multiplicationResult);
						break;
			case "/": //division operation
						float divisionResult;
						divisionResult = c.division((float)number1 ,(float)number2);
						
						if(divisionResult!=-1)
							System.out.println(divisionResult);
						break;
			case "%": //modulous operation
						int modulousResult;
						modulousResult = c.modulous(number1, number2);
						
						if(modulousResult != -1)
							System.out.println(modulousResult);
						break;
		}
		
		
	
		
		
		sc.close();

	}

}
