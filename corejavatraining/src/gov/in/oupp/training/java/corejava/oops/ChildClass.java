package gov.in.oupp.training.java.corejava.oops;



class BaseClass{
	
	BaseClass(){
		
	}
	
	
	BaseClass(int a, int b){
		System.out.println("from base Class constructor");
		System.out.println("Sum = "+(a+b));
	}
	
	public void show(){
		System.out.println("from base class show method");
	}
	
}


public class ChildClass extends BaseClass{
	
	ChildClass(){
		
	}
	
	ChildClass(int c, int d){
		super(30,40);
		System.out.println("from child Class constructor");
		System.out.println("Sum = "+(c+d));
	}
	
	public static void main(String args[]){
		
		ChildClass cc = new ChildClass(10, 20);
		cc.show();

	}
	
	
	public void show(){
		super.show();
		System.out.println("from child class show method");
	}
	
	

}
