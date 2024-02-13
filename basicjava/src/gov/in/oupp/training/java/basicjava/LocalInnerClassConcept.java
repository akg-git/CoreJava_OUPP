/**
 * 
 */
package gov.in.oupp.training.java.basicjava;

/**
 * @author AKG
 *
 */


class OuterClass{
	
	int data=20;	//instance variable
	
	void display(){
		int x=10;		//local variable
		
		class LocalInner{
			void msg(){
				
				System.out.println("instance variable: "+data);
				System.out.println("local variable: "+x);
			}
			
		}
		
		LocalInner li = new LocalInner();
		li.msg();
		
		
	}
	
}

public class LocalInnerClassConcept {
	


	public static void main(String[] args) {
		
		OuterClass oc = new OuterClass();
		oc.display();
		System.out.println(oc.data);
		
		
		
		

	}

}
