/**
 * 
 */
package gov.in.oupp.training.java.array;

/**
 * @author Asish Kumar Gouda
 *
 */
public class ReverseArrayOfSizeK {
	
	public static void reverseByGroup(int[] arr, int n, int k){
		
		
		int l,r;
		
		for(int i=0; i<n; i+=k){
			l=i;
			
			if( (i+k-1) > (n-1) ){
				r = n-1;
			}
			else{
				r = i+k-1;
			}
			
			while(l<r){
				int t = arr[l];
				arr[l] = arr[r];
				arr[r] = arr[l];
			}
			
			//print reverse array
			for(int x: arr){
				System.out.print(x+" ");
			}
		
		}
		
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		
		int n = arr.length;	//size of array
		int k = 3;	//group size
		
//		for(int j=0;j<n;j+=k){
//			
//			for(int i=j; i<j+(k/2);i++){
//				
//				//swap
//				int t= arr[i];
//				arr[i] = arr[k-i-1];
//				arr[k-i-1] = t;
//			}
//			
//		}
//		
//		//print reverse array
//		for(int x: arr){
//			System.out.print(x+" ");
//		}
		
		//alternative way
		
		ReverseArrayOfSizeK.reverseByGroup(arr, n, k);
		
	}

}
