/**
 * 
 */
package gov.in.oupp.training.java.sorting;

/**
 * @author Asish Kumar Gouda
 *
 */

public class QuickSort {
	
	
	public static void main(String[] args) {
		
		int[] arr1 = {22, 10, 15, 36, 8, 25, 18, 30, 35, 20};
		
		quickSort(arr1, 0, (arr1.length -1));
		
		//display final sorted array
		System.out.println("Final Quick Sorted Array: ");
		for(int x: arr1){
			System.out.print(x+" ");
		}
		System.out.println();

	}

	
/** quickSort()
 * 	a: arr1
 * l: left pointer
 * r: right pointer
*/
	private static void quickSort(int[] a, int l, int r) {
		int n = a.length;
		
		
		int pivot= a[n-1];
		for(int i=0; i<n-1; i++){
			
			if(l<r)
			{
				int p = partition(a, l , r);
				
				//left of pivot partition
				quickSort(a, l, p-1);
				///right of pivot partition
				quickSort(a, p+1, r);
					
			}
			
		}
		
				
	}

private static int partition(int[] a, int l, int r) {

	/**assume right most element as pivot*/
	int pivot = a[r];	
	int i = l-1;
	
	int t;
	for(int j=l; j<=r-1;j++){
		if(a[j]<pivot)
		{
			i+=1;
			
			//swap
			t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
	}
	
	t = a[i+1];
	a[i+1] = a[r];
	a[r] = t;
	
	
	return  (i+1);
}

}

