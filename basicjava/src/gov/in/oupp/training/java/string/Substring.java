package gov.in.oupp.training.java.string;

public class Substring {
	
	public static void main(String[] args) {
		
		String s = "Sachin Tendulkar";
		System.out.println(s.substring(8));		// endulkar
		System.out.println(s.substring(3, 9));	//	hin Te	:: returns [3,9) -> excluding 9 
		
		//charAt() and indexOf()
		System.out.println(s.charAt(3));	//h
		System.out.println(s.indexOf("h"));	//3
		
	//replace
	String play_template = "What a football match!! is organized at football ground";
	System.out.println(play_template.replace("football", "hockey"));
		
	//ASCII Value of character
	int x = s.codePointAt(7);
	System.out.println(x);	//ascii: 84
	
	System.out.println(s.codePointCount(0, 5));	//5-0=5
	
	char c1 = 'c';
	System.out.println(s.valueOf(c1));	//c
	
	}
}
