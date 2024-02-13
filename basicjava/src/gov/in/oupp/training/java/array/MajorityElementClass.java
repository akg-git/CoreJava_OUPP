/**
 * Majority element: If a number's frequency is more than sizeOfArray/2 times
 * 
 */

package gov.in.oupp.training.java.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementClass {
	
	//logic-2
	public static void majorityElementUsingHashMap(int[] arr, int n, int maxFreq){
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++){
			int c=1;
			if(map.containsKey(arr[i]))
				c++;
			map.put(arr[i], c);
		}
		
		for(int key: map.keySet()){
			if(map.get(key)>maxFreq){
				System.out.println(key);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {10,23,12,12,7,12,10,12,12,12};
		
		int index;
		int n = arr.length;
		int maxFreq = n/2;
		
		//logic-1
		for(int i=0; i<n; i++){
			int c=0;
			for(int j=i; j<n; j++){
				if(arr[i]==arr[j]){
					c++;
				}
			}
			
			if(c>maxFreq){
				System.out.println(arr[i]);
			}
			
		}
		
		majorityElementUsingHashMap(arr,n, maxFreq);
		
		
	}

}
