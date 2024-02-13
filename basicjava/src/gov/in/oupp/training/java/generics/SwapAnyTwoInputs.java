/**
 * 
 */
package gov.in.oupp.training.java.generics;

/**
 * @author Asish Kumar Gouda
 *
 */
public class SwapAnyTwoInputs {
	
	
	public static <T> void swapAny(T a, T b){
		
		System.out.println("Before Swapping:\ta = "+a+"  b = "+b);
		
		T tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("After Swapping:\ta = "+a+"  b = "+b);
		
	}
	
	public static void main(String[] args) {
		
		swapAny(23, 82);
		swapAny("Ashish", "Kumar");
		swapAny(3.14f, 2.71f);
		
	}

}
