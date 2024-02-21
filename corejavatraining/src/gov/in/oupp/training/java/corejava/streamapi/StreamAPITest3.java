package gov.in.oupp.training.java.corejava.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPITest3 {

	public static void main(String[] args) {

		List<String> arr = Arrays.asList("I", "am", "a", "list", "of", "Strings");
		List<String> result = arr.stream()
								.skip(2)
								.limit(4)
								.sorted()
								.map(ele -> ele + "->"+ele.length())
								.collect(Collectors.toList());	//terminal operation
		System.out.println(result);
		
		
		
		
	}

}
