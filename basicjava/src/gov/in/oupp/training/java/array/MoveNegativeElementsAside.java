package gov.in.oupp.training.java.array;

public class MoveNegativeElementsAside {
	
	public static void printArray(int[] arr){
		//print reverse array
		for(int x: arr){
			System.out.print(x+" ");
		}
	}
	
	public static void moveNegativeAside(int[] arr){
		
		int i=0, j;
		for(j=0; j<arr.length; j++){
			if(arr[j]<0){
				
				if(i!=j){
					//swap
					int t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
				i++;
				
			}
		}
		
	}
	
public static void moveZerosAside(int[] arr){
		
		int i=0, j;
		for(j=0; j<arr.length; j++){
			if(arr[j]==0){
				
				if(i!=j){
					//swap
					int t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
				i++;
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10, 29, -19, 10,-32, 18,12, -231, 15,11, 6};
		
		moveNegativeAside(arr);
		printArray(arr);
		
		System.out.println();
		
		int[] arr2 = {0, 29, -19, 0,-32, 0,12, -231, 0,11, 6};
		
		moveZerosAside(arr2);
		printArray(arr2);
		
		
		
		
	}

}
