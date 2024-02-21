/**
 * 
 */
package gov.in.oupp.training.java.corejava.myprograms;

/**
 * @author Asish Kumar Gouda
 *
 */
public class ArrayTestClass {
	public static void main(String[] args){
		
//		int[] arr = new int[4];
//		
//		System.out.println(arr.getClass().getName());
//		System.out.println(arr.getClass().getSimpleName());
//		System.out.println(arr.getClass().getSuperclass().getSimpleName());
//		System.out.println(arr.getClass().getTypeName());
//		System.out.println(arr.getClass().getCanonicalName());
//		
//		String[] sarr = new String[4];
//		
//		System.out.println(sarr.getClass().getName());
//		System.out.println(sarr.getClass().getSimpleName());
//		System.out.println(sarr.getClass().getSuperclass().getSimpleName());
//		System.out.println(sarr.getClass().getTypeName());
//		System.out.println(sarr.getClass().getCanonicalName());
//		
		
		String x = "name is somesh";
		char[]names = x.toCharArray();
		System.out.println(names);
		for(char c: names){
			System.out.println(c);
		}
		System.out.print(names[3]+" "+names[6]);
		
		char[] apples = {'a','p','p','l','e','s'};
		System.out.println(apples);
	}

}
