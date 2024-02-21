/**
 * 
 */
package gov.in.oupp.training.java.corejava.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author AKG
 *
 */
public class StreamAPITest2 {

	public static void main(String[] args) {

		List<String> vehicles = Arrays.asList("bus", "truck", "car", "train") ;
//		List<String> result = new ArrayList<>();
		
//		//without stream
//		
//		for(String name: vehicles){
//			result.add(name.toUpperCase());
//		}
//		System.out.println(result);
		
		//with stream

		//convert ArrayList  into stream
		Stream<String> resultStream = vehicles.stream();
		//map() is used to manipulate each element and update the list
		//collector is used to convert any type into list
		List<String> result;
		
//		result=  vehicles.stream().map(name -> name+" is a vehicle").collect(Collectors.toList());
		
		 result =  resultStream
				.map(name -> name.toUpperCase())
				.collect(Collectors.toList());
		
//		List<String> result =  vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(result);

	}

}
