/**
 * 
 */
package gov.in.oupp.training.java.basicjava;

/**
 * @author AKG
 *
 */

class Outer1{
	
	static class StaticInnerClass{

		static int snum=10;
		public static void show() {
			int num=8;
			System.out.println("hi "+snum);
			
		}
		
		
	}
	
}

 class StaticInnerClassDemo { 
	
	public static void main(String[] args) {
		
		Outer1.StaticInnerClass obj = new Outer1.StaticInnerClass();
		obj.show();
		
		
	}

}
