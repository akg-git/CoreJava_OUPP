/**
 * 
 */
package gov.in.oupp.training.java.corejava.basics;

import java.util.Scanner;

/**
 * @author AKG
 *
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Size of Fibonacci Series: ");
		int fiboSize= sc.nextInt();
		
		if(fiboSize==1)
		{
			System.out.print("Fibonacci Series: 0");
		}
		
		if(fiboSize==2)
		{
			System.out.print("Fibonacci Series: 0 1");
		}
		
		int prv=0;
		int nxt=1;
		System.out.print("Fibonacci Series: "+prv+" "+nxt+" ");
		
		for(int i=2;i<fiboSize;i++)
		{
			int fiboSum = prv + nxt;
			System.out.print(fiboSum+" ");
			prv = nxt;
			nxt = fiboSum;
		}
		
		sc.close();
	}

}
