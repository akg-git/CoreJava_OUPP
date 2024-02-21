/**
 * Write a Java POrogram to calculate Simple Interest
 */
package gov.in.oupp.training.java.corejava.basics;

import java.util.Scanner;

/**
 * @author AKG
 *
 */
public class SimpleInterest {

	static float principalAmount;
	static float rate;
	static float time;
	
	
	
	public float getPrincipalAmount() {
		return principalAmount;
	}



	public void setPrincipalAmount(float principalAmount) {
		this.principalAmount = principalAmount;
	}



	public float getRate() {
		return rate;
	}



	public void setRate(float rate) {
		this.rate = rate;
	}
	
	public float getTime() {
		return time;
	}



	public void setTime(float time) {
		this.time = time;
	}





//	SimpleInterest si = new SimpleInterest();
//
//	public float interestCalculator()
//	{
//		float simpleInterest;
//		simpleInterest = (si.getPrincipalAmount() * si.getRate() * si.getTime()) / 100.00f;
//		return simpleInterest;
//	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleInterest si = new SimpleInterest();
		System.out.println("Simple Interest Calculator\n------------------------------");
		System.out.print("Enter your Priuncipal Amount: ");
		principalAmount = sc.nextFloat();
		si.setPrincipalAmount(principalAmount);
		System.out.print("Enter your Annual Rate of Interest: ");
		rate = sc.nextFloat();
		si.setRate(rate);
		System.out.print("Enter your Time of loan(in years): ");
		time = sc.nextFloat();
		si.setTime(time);
		
		float simpleInterest;
		simpleInterest = (si.getPrincipalAmount() * si.getRate() * si.getTime()) / 100.00f;
		
		System.out.println("\n\nYour Simple Interest = Rs. "+ simpleInterest);
		sc.close();
	}

}
