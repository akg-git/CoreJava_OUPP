package gov.in.oupp.training.java.array;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 29, 19, 10,-32, 18,12, 231, 15,11, 6};
		
		for(int i=0; i<arr.length/2; i++){
			
			//swap
			int t= arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = t;
		}
		
		//print reverse array
		for(int x: arr){
			System.out.print(x+" ");
		}
		
	}

}
