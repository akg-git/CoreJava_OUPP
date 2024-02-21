/**
 * 
 */
package gov.in.oupp.training.java.corejava.myprograms;

import java.util.Scanner;

/**
 * @author AKG
 *
 */

class Motorcycle{
	
	Motorcycle(){}
	
	
//	protected void vowelList(char... vowels) {		
//		//vowelList(char c1, char c2, char... vowels, char c3) : we can't pass parameter after the elipses
//			System.out.print("Vowels List: "+vowels);
//	}
	
	// atleast 1 arguments
	protected void vowelLists(char c1, char... vowels) {		
	//vowelList(char c1, char c2, char... vowels, char c3) : we can't pass parameter after the elipses
		System.out.print("Vowels List: "+c1+" ");
	     for(int v=0;v<vowels.length;v++){
	    	 System.out.print(vowels[v]+" ");
	     }
	     System.out.println();
	}

	protected int largestNumber(int... numbers) {
	     int currentLargest = numbers[0];
	     for (int number : numbers) {
	        if (number > currentLargest) {
	            currentLargest = number;
	        }
	     }
	     return currentLargest;
	}
}

public class VariableArguments {


	public static void main(String[] args) {

		Motorcycle motorcycle = new Motorcycle();

		
		int largest = motorcycle.largestNumber(5,3,8,2,0,-2,6,4,10,20,-35);
//		int[] largest = motorcycle.largestNumber({{5,3,8},{2,0,-2},{6,4,1}});	// inapplicable for 2D Array
		System.out.println("Largest Numbers are: "+ largest);
		
		motorcycle.vowelLists('a');
		motorcycle.vowelLists('a','e');
		motorcycle.vowelLists('a','e','i');
		motorcycle.vowelLists('a','e','i','o');
		motorcycle.vowelLists('a','e','i','o','u');
		
	}

}
