/**
 * 
 */
package gov.in.oupp.training.java.corejava.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author AKG
 *
 */
public class StreamAPIDemo3 {


	public static void main(String[] args) {
		List<String> al= new ArrayList<>();
		al.add("Mango");
		al.add("Banana");
		al.add("Jackfruit");
		al.add("Banana");
		al.add("Coconut");
		
		al = al.stream()
				.distinct()
				.map(fruit-> fruit.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(al);
		
		//sorted fruits list
		Stream<String> fruits = al.stream().sorted();
		fruits.forEach(f -> System.out.println(f));
//		
		Stream<String> fruits1 = al.stream();
//		al.collect(Collectors.toList());
		
		fruits1.forEach(String::toLowerCase);
		
		System.out.println(fruits1);
		

		        List<String> strings = Arrays.asList("apple", "banana", "orange");
		        
		        String[] array = strings.stream()
		        		.map(x->x.toUpperCase())
		                               .toArray(String[]::new);
		        
		        System.out.println("Array of strings: " + Arrays.toString(array));	
		
		
		
	}

}
