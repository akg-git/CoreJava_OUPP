/**
 * 
 */
package gov.in.oupp.training.java.corejava.myprograms;

/**
 * @author AKG
 *
 */

class TestClass{
	
	InstanceOfOperator ioo = new InstanceOfOperator();
	
	
}

public class InstanceOfOperator {
public static void main(String[] args) {
		
		TestClass tc = new TestClass();
		//check instance of class
		System.out.println(tc instanceof TestClass);
		
	}
}

// downcasting using instanceof operator

class Animal { }  

class Dog3 extends Animal { 
	
  static void method(Animal a) {  
	  
    if(a instanceof Dog3){  
       Dog3 d=(Dog3)a;			//downcasting  
       System.out.println("ok downcasting performed");  
    }  
    
  }  
   
  public static void main (String [] args) {  
    Animal a=new Dog3();  
    Dog3.method(a);  
  }  
    
 }  
