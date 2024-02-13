/**
 * Insertion Sort: Each element will compare with its previous sub-array
 */
package gov.in.oupp.training.java.sorting;

/**
 * @author Asish Kumar Gouda
 *
 */
public class InsertionSort {

	public static void insertionSort(int[] a){
		int i,j,key;
		int n= a.length;
		int pass_counter=0;
		for(i=1; i<n;i++){
			
			key = a[i];
			j = i-1;
			
			while(j>=0 && a[j]<key){
				a[j]=a[j+1];
				j = j-1;
			}
			
			a[j+1] = key;
			
			System.out.print("Pass "+(++pass_counter)+": ");
			for(int x: a){
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
		//display
		System.out.print("Final Sorted ARray: ");
		for(int x: a){
			System.out.print(x+" ");
		}
		
	}

	public static void main(String[] args) {
		
		int[] arr = {29, 19, 10,18,12,15, 3, 24, 92, 83, 59,11, 6};
		
		insertionSort(arr);

	}

}
