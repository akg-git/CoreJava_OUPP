package gov.in.oupp.training.java.regex;

import java.util.regex.Pattern;

public class RegexClass2 {
	
	public static void main(String[] args) {
		
		// String start with s/S and having 3 characters only
		String regex="[sS]..";
		String input = "SAP";
		String input2 = "sam";
		String input3 = "BHU";
		String input4 = "ASk";
		
		
		boolean isMatch = Pattern.matches(regex, input4);
		System.out.println(isMatch);	//false
		
		System.out.println(Pattern.matches("[abc]?", "ab"));		//false
		System.out.println(Pattern.matches("[^map]*", ""));			//true
		
		//concatenation
		System.out.println(Pattern.matches("[a-em-q]+", "ape"));	//true
		System.out.println(Pattern.matches("[a-em-q]+", "apple"));	//false
		System.out.println(Pattern.matches("[ep-t]+", "pet"));		//true
		
		System.out.println(Pattern.matches("[0-26-8]+", "77210"));	//true
		System.out.println(Pattern.matches("[0-26-8]+", "12489"));	//false
		//phone number
		System.out.println(Pattern.matches("[6789]\\d{9}", "3876543210"));		//false
		System.out.println(Pattern.matches("[6789]\\d{9}", "9876543210"));		//true
		//indian mobile number with +91
		System.out.println(Pattern.matches("+91\\s[6789]\\d{9}", "+91 7876543210"));		//true
		
		//11 digit mobile number
		System.out.println(Pattern.matches("^0[789]\\d{9}$", "07876543210"));		//true
		System.out.println(Pattern.matches("^0[789]\\d{9}$", "17876543210"));		//fasle
		
		//gmail validation
		System.out.println(Pattern.matches("[_a-z]+[@]\\w+\\.com$", "anva_hgs@gmail.com"));		//true
		System.out.println(Pattern.matches("[a-z_]+[@]\\w+\\.com$", "AIbc_Bs@gmail.com"));		//fasle
		
	}

}
