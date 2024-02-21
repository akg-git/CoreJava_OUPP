package gov.in.oupp.training.java.corejava.myprograms;

public class SampleClass {
	//int a=3,b=5;
	SampleClass(){
		this(10);
	}
	
	SampleClass(int a){
		this(10, 20);
		System.out.println(a);
	}
	
	SampleClass(int a, int b){
		System.out.println(a+b);
	}
	
	public static void main(String args[]){
		
		SampleClass sc = new SampleClass(25);
		SampleClass sc2 = new SampleClass(25,100);
		
	}
	

}
