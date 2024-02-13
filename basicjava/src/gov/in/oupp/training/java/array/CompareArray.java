/**
 * 
 */
package gov.in.oupp.training.java.array;

import java.util.Arrays;

/**
 * @author Asish Kumar Gouda
 *
 */
public class CompareArray {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5};
		int[] arr2 = {1,1,1,1,1,1};
		
//		System.out.println(Arrays.compare(arr1, arr2));
		
		System.out.println("Fill Array with specified value.");
		Arrays.fill(arr1, 5);
		for(int x: arr1){
			System.out.print(x+" ");
		}
		
		

	}

}
