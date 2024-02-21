/**
 * 
 */
package gov.in.oupp.training.java.corejava.collections;

import java.util.ArrayList;

/**
 * @author AKG
 *
 */
public class ArrayListTestClass {


	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("OUPP");
		al.add(50);
		al.add(30.25f);
		al.add(true);
		
		System.out.println(al);
		
		String s = (String) al.get(0);	//OK
		System.out.println(s);
		
		int val = (int) al.get(1);		//OK
		System.out.println(val);
		
		int val2 = (int) al.get(0);	//No ERROR.  But Exception: ClassCastException
		System.out.println(val2);
	}

}
