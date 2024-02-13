/**
 * 
 */
package gov.in.oupp.training.java.basicjava;

/**
 * @author AKG
 *
 */

class Copy{
	
	int data=1;

	public void display() {
		System.out.println("display data: "+data);
		
	}
	
}

public class DemoTestForCopy {
	
	public static void main(String[] args) {
		
		/** SHALLOW COPY
		 * Here NO NEW memory location is created but new reference is created.
		 * Alteration of one object AFFECTS other copied object.
		 * 
		 * shallow copy is faster then deep copy.
		 */		
		Copy ob1 = new Copy();
		ob1.display();	//1
		Copy ob2 = ob1;	//1
		ob2.display();
		
		//update data
		ob1.data=30;
		ob1.display();	//30
		ob2.display();	//30
		
		
		/** DEEP COPY
		 * Here NEW memory location is created.
		 * Alteration of one object DOESN'T AFFECT other copied object.
		 */		
		/*Copy ob1 = new Copy();
		ob1.display();	//1
		Copy ob2 = ob1;	//1
		ob2.display();*/
		
		//update data
		ob1.data=30;
		ob1.display();	//30
		ob2.display();	//30
		
	}

}
