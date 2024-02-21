/**
 * 
 */
package gov.in.oupp.training.java.corejava.basics;

import java.util.ArrayList;

/**
 * @author AKG
 *
 */
public class ObjectTypeCastingTestClass2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();				//run time type information safety
		
//		ArrayList<String> al = new ArrayList<>();	//compile time type information safety
		
		al.add("Cuttack");
		al.add("Bhubaneswar");
		al.add("Keonjhar");
		al.add(new Integer(10));
		al.add(11);
		
		String city1 = (String)al.get(0);	System.out.println(city1);
		String city2 = (String)al.get(1);	System.out.println(city2);
		String city3 = (String)al.get(2);	System.out.println(city3);
		String num1 = (String)al.get(3);	System.out.println(num1);	//ClassCastException
		String num2 = (String)al.get(4);	System.out.println(num2);

	}

}
