package gov.in.oupp.training.java.corejava.myprograms;

abstract class A{
	public abstract void show();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {

//		A aic = new A(); //error
		A aic2 = new A(){
			public void show(){
				System.out.println("anonymous + abstrcat show");
			}
		};
		aic2.show();

	}

}
