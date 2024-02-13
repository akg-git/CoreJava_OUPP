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
public class RegexClass1 {

	public static void main(String[] args) {

		
		//Way-1
		Pattern pattern = Pattern.compile(".s");
		Matcher matcher = pattern.matcher("as");
		boolean b1 = matcher.matches();
		System.out.println(b1);
		
		//Way-2
		boolean b2 = Pattern.compile(".s").matcher("as").matches();
		System.out.println(b2);
		
		//Way-3
		boolean b3 = Pattern.matches(".s", "as");
		System.out.println(b3);
		
		
		String text = "A SDC is at oupp keonjhar odisha india";
		boolean result = Pattern.matches("..s", text);	//false : small case and capital case are different
		System.out.println(result);
		result = Pattern.matches("A.*", text);	//true
		System.out.println(result);
	
	}

}
