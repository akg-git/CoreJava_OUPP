/**
 * Bubble Sort: move largest element to the end in each pass
 * 				
 */
package gov.in.oupp.training.java.sorting;

/**
 * @author Asish Kumar Gouda
 *
 */
public class BubbleSort {


	public static void main(String[] args) {
		
		int[] arr1 = {29, 19, 10,18,12,15, 3, 24, 92, 83, 59,11, 6};
		
		bubbleSort(arr1);

	}

	private static void bubbleSort(int[] a) {

		int n = a.length;
		
		int pass_counter=0;
		//move largest element to the end in each pass
		for(int i=0; i<n; i++){
			//passes
			for(int j=1; j<n-i; j++){
				
				if(a[j]<a[j-1]){
					//swap
					int t = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
				}
				
			}
			System.out.print("Pass "+(++pass_counter)+": ");
			for(int x: a){
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
		System.out.print("Final sorted array: ");
		for(int x: a){
			System.out.print(x+" ");
		}
		
	}

}
