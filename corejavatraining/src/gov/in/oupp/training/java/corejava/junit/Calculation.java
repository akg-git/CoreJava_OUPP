/**
 * 
 */
package gov.in.oupp.training.java.corejava.junit;

/**
 * @author AKG
 *
 */
public class Calculation {

	public static int findmax(int arr[]) {
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		return max;
	}
	
	public static int cube(int n){
		return n*n*n;
	}

}
