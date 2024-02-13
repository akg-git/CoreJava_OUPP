package gov.in.oupp.training.java.string;
/**
 * @author Asish Kumar Gouda
 *
 */

public class StringMethods {

	public static void main(String[] args) {
		
		
		String oupp = "  \tHello   OUPP  ";
		
		System.out.println(oupp);
		
		//trim()
		System.out.println(oupp.trim());	//removes leading and trailing space including \t
		
		String oupp2 = "my_oupp";
		//stratsWith()
		System.out.println(oupp2.startsWith("m"));
		System.out.println(oupp2.startsWith("O"));
		
		
		//to character array
		String s = "new concept";
		char []newArr = s.toCharArray();
		for(char c: newArr){
			System.out.print(c+" ");
		}
		System.out.println();
		
		String play_template = "What a football match!! is organized at football ground";
		//split
		String play_words[] = play_template.split(" ");
		for(String word: play_words){
			System.out.print(word+" ");
		System.out.println(play_words);
		}
		
	}

}
