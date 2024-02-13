/**
 * 
 */
package gov.in.oupp.training.java.sorting;

/**
 * @author Asish Kumar Gouda
 *
 */
public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] arr1 = {29, 19, 10,18,12,15, 3, 24, 92, 83, 59,11, 6};
		
		selectionSort(arr1);

	}

	private static void selectionSort(int[] a) {
		int n = a.length;
		int pass_counter=0;
		int minIndex=0;
		for(int i=0; i<n-1; i++){
			minIndex = i;
			for(int j=i+1; j<n; j++){
				if(a[j]<a[minIndex]){
					
					//swap
					int t = a[j];
					a[j] = a[minIndex];
					a[minIndex] = t;
				}
			}
			System.out.print("Pass "+(++pass_counter)+": ");
			for(int x: a){
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
		//display sorted array
		for(int x: a){
			System.out.print(x+" ");
		}
		System.out.println();
				
	}

}
