package gov.in.oupp.training.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		//binary search needs sorted array
		int arr[] = {9, 10, 11, 24, 34, 43};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the key to search: ");
		int key = sc.nextInt();
		
		int low = 0, high=arr.length-1;
		
		/*//binarySearch() is a predefined method inside Arrays class
		int x = Arrays.binarySearch(arr, key);*/
		
		int x = binarySearch(arr, key, low, high);
		
		if(x>=0){
			System.out.println(key+" found at index "+x);
		}else{
			System.out.println(key+" doesn\'t exist");
		}
		
	}

	private static int binarySearch(int[] a, int key, int l, int h) {

		int mid = (l+h)/2;
		
		//find value at mid position
		if(a[mid] == key){
			return mid;
		}
		
		else if(key>a[mid]){
			binarySearch(a, key, mid+1, h);
		}else{
			binarySearch(a, key, l, mid-1);
		}
		
		if(l>h){
			return -1;
		}
		
		
		return 0;
	}

}
