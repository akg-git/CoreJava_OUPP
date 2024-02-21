/**
 * 
 */
package gov.in.oupp.training.java.corejava.streamapi;

/**
 * @author AKG
 *
 */
 class ClassForInterfaceSet implements InterfaceSet{

	@Override
	public int oneAbstractMethod(int a, int b) {

		System.out.println("ClassForInterfaceSet: oneAbstractMethod() ||  inside InterfaceSet");
		return a+b;
		
	}
	
	

}

public class TestClassForInterfaceSet{
	
	public static void main(String[] args) {
		
		//normal method call
//		InterfaceSet iset = new ClassForInterfaceSet();
//		iset.oneAbstractMethod();
		
		//lambda expression
//		System.out.println("\nImplementation using Lambda expression:");
//		InterfaceSet iset2 = () -> System.out.println("Hello oneAbstractMethod()");
//		iset2.oneAbstractMethod();
		
		//lambda expression using method parameter
//		System.out.println("\nImplementation using Lambda expression using method formal parameters:");
//		InterfaceSet iset2 = (a,b) -> System.out.println("Addition = "+(a+b));
//		iset2.oneAbstractMethod(10,20);
		
		System.out.println("\nImplementation using Lambda expression using method formal parameters with return statement:");
//		InterfaceSet iset3 = (a,b) -> (a+b);
		InterfaceSet iset3 = (a,b) -> {
			System.out.print("Result is: ");
			return (a+b);
		};	// this last ";"  is used to terminate the statement after creation of object .
		
//		like 
//		A a = new A();
//		replaced with
//		A a = ()->{
//			sop();
//		};
			
//		int x = iset3.oneAbstractMethod(30, 40);
//		System.out.println(x);
		System.out.println(iset3.oneAbstractMethod(30, 40));
		
		
		
	}
	
	
}
