/**
 * 24567 --> 74562
 */
package gov.in.oupp.training.java.basicjava;

/**
 * @author AKG
 *
 */
public class SwapFirstandLastDigit {
	
	public static void main(String[] args) {
		
		int num = 924567;
		
		int tmp = num;
		int lastDigit, firstDigit;
		
		int digitCount = (int)Math.log10(num);	// log10 return: no of digits - 1
		
		lastDigit = tmp%10;
		firstDigit = (int) (num / Math.pow(10, digitCount));

		// my logic
//		int newnum = 0;
//		for(int i = digitCount; i>=0; i--){
//			while(tmp!=0){
//				int digit = tmp%10;
//				newnum += digit*Math.pow(10, digitCount);
//				tmp/=10;
//				
//			}
//		}
//		
//		System.out.println(newnum);
		
		
		
		//O(log10) logic
		int result;
		
		result = lastDigit*(int)Math.pow(10, digitCount) + (num - firstDigit*(int)Math.pow(10, digitCount) - lastDigit + firstDigit);
		
		System.out.println(result);
	}

}
