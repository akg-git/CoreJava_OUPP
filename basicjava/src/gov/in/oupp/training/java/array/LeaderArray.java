package gov.in.oupp.training.java.array;

public class LeaderArray {

	public static void main(String[] args) {

//		int[] arr1 = {9, 10,18,12,15,11, 6};
		int[] arr1 = {29, 19, 10,18,12,15,11, 6};
		
		int leader = arr1[arr1.length-1];
		System.out.print(leader+" ");
		for(int i=arr1.length-2; i>=0;i--){
			
			if(leader < arr1[i]){
				leader = arr1[i];
				System.out.print(leader+" ");
			}
		}

	}

}
