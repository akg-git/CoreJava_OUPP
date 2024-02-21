/**
 * 
 */
package gov.in.oupp.training.java.corejava.basics;

import java.util.Scanner;

/**
 * @author 	AKG
 *
 */
public class ReverseYourName {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your Name: ");
			char[] name = sc.nextLine().toCharArray();
			
//			//display you name
//			for(char c: name){
//				System.out.print(c+" ");
//			}
			
			char[] revname = new char[name.length];
			
			for(int x=0; x<name.length; x++){
				revname[x] = name[name.length-x-1];
			}
			System.out.print("\nReversed Name: ");
			//display reverse array
			for(char c: revname){
				System.out.print(c+"");
			}
			
	}

}
