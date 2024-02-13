/**
 * Write a Java program to generate your lucky number.
 */
package gov.in.oupp.training.java.basicjava;

import java.util.Random;

/**
 * @author AKG
 *
 */
public class LuckyNumber {
	
	public static void main(String[] args) {
		
		/** random() method
		 * 
		 * Random method can be generate using random()
		 */		
		int luckyNumber = (int) (Math.random() * 100); 
		System.out.println("My Lucky Number: "+luckyNumber);
		
		/** Random Class
		 * 
		 * Random method can be generate using random() of any type
		 */	
		
		Random random = new Random();
		System.out.println("My Lucky Number: "+random.nextInt(100));
		
	}

}
