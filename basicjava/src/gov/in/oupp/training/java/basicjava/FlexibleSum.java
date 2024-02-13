/**
 * 
 */
package gov.in.oupp.training.java.basicjava;

/**
 * @author AKG
 *
 */
public class FlexibleSum {
	
	public static int variableSum(int... nums){
		int sum=0;
		
		for(int i: nums){
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		
		System.out.println("result = "+FlexibleSum.variableSum(5, 6, 7));
		System.out.println("result = "+FlexibleSum.variableSum(5, 6, 7, -2, 12));
		System.out.println("result = "+FlexibleSum.variableSum(5, 6, 7, -2, 12, -21));
		System.out.println("result = "+FlexibleSum.variableSum( 12));
	}

}
