/**
 * 
 */
package gov.in.oupp.training.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Asish Kumar Gouda
 *
 */
public class RegexClass3 {

	public static void main(String[] args) {
		
		String regex = "[a-zA-Z]+";
		String text = "asishKumAr";
		System.out.println(Pattern.matches(regex, text));

		
		//INTERESTING VARIATIONS
		regex = "[a-z A-Z]+";
		text = "asish KumAr";
		System.out.println(Pattern.matches(regex, text));	//true
		
		regex = "[ a-z A-Z ]+";
		text = " asish    KumAr ";
		System.out.println(Pattern.matches(regex, text));	//true
		
		//dog is a word or not
		Pattern p2 = Pattern.compile(".*\\sdog\\s.*");
		Matcher m2 = p2.matcher("dogisbarking");
		System.out.println(m2.matches());				//false
		
		p2 = Pattern.compile(".*\\sdog\\s.*");
		m2 = p2.matcher("the dog is barking");
		System.out.println(m2.matches());				//true
	}
	

}
