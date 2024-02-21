/**
 * 
 */
package gov.in.oupp.training.java.corejava.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author AKG
 *
 */
public class StreamAPITest1 {

	public static void main(String[] args) {

		int[] arr = {12,345,23,5324,-432, 84, 632, 78325, -626, 328, 0, 7280};
		
		//create stream and process it
		System.out.println("Filter Even numbers from the Array");
		Arrays.stream(arr)
		.filter( num -> num%2 ==0 && num>0)	
		.forEach(System.out::println);
		
//		List<Integer> alist = new ArrayList<>();
//		alist.add(10);
//		alist.add(230);
//		alist.add(108);
//		alist.add(1023);
//		alist.add(-310);
//		alist.add(-3160);
//		alist.add(-34);
//		alist.add(83);
//		alist.add(15);
//		alist.add(832);
		
		List<Integer> blist = Arrays.asList(110, 203, 31, 130, 645, 865, 872, 752, 367, 85, 35);
		
		System.out.println("Filter divisible of 5 from the ArrayList");
		List<Integer> result = blist.stream()
								.filter(n -> n%5 == 0)
								.collect(Collectors.toList());
//		result = getStream()
//				.filter(num -> num%2 == 1)
//				.collect(Collectors.toList());
		System.out.println(result);
		
		

	}

}
