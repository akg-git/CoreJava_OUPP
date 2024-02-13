/**
 * 
 */
package gov.in.oupp.training.java.string;

import java.util.StringTokenizer;

/**
 * @author Asish Kumar Gouda
 *
 */
public class StringTokenizerDemo {

	public static void main(String[] args) {

		String sampleString = "skill development center oupp keonjhar odisha";
		StringTokenizer st = new StringTokenizer(sampleString);
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		String sampleString2 = "skill development center, oupp, keonjhar, odisha";
		StringTokenizer st2 = new StringTokenizer(sampleString2, ",");
		
		System.out.println("\n\nSplit tokens by ,");
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken());
		}
	}

}
