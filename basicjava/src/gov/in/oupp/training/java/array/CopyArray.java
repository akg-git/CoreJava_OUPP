/**
 * 
 */
package gov.in.oupp.training.java.array;

import java.util.Arrays;

/**
 * @author Asish Kumar Gouda
 *
 */
public class CopyArray {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5};
		System.out.println("copy upto 7th index of array");
		int arr2[] = Arrays.copyOf(arr1, 7);
		for(int x: arr2){
			System.out.print(x+" ");
		}
		
		System.out.println();
		System.out.println("range: 2nd to 7th position");
		int arr3[] = Arrays.copyOfRange(arr1, 2, 8);
		for(int x: arr3){
			System.out.print(x+" ");
		}
 		
		
	}

}
