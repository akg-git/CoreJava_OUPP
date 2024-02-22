/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops;

/**
 * @author AKG
 *
 */

class Employee2{
	static int id;
	// static int id=0;	// same 
	static String name;
	String lname;
	Employee2(){
		id++;
		System.out.println(id);
	}
	
	
	// static method can access static variables only.
	// non-static method can access both static and non-static variables.
	static void display()
	{
		System.out.println("Display method"+id+" -> "+name);
		//System.out.println(id+"-> "+lname);	// non-static  variable can't be accessed by static method
	}
}

class Employee{
	int id=0;
	String name;
	
	Employee(){
		id++;
		System.out.println(id);
	}
	
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
		//System.out.println("\nInside Employee Constructor.\nEmployee2 Details\nid: "+this.id+"\nname:"+this.name);
	}
	
	void employeeDisplay()
	{
		System.out.println("\nInside Employee Display Method.\nEmployee Details\nid: "+id+"\nname:"+name);
	}
	
	public void localVariable()
	{
		int x=0;	// static int x -> declaring static in local variable will be illegal
		System.out.println("Value of local variable  x="+x);
	}
	

}

public class StaticTest {

	public static void main(String[] args) {
		
		System.out.println("Non-static variable result:");
		Employee e1 = new Employee();	// every time it returns 1 as it's a non-static variable.
		Employee e2 = new Employee();	// every reference has its own copy of member variable.
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		
		System.out.println("\nStatic variable result:");
		Employee2 ee1 = new Employee2();	//1
		Employee2 ee2 = new Employee2();	//2
		Employee2 ee3 = new Employee2();	//3
		Employee2 ee4 = new Employee2();	//4
		
		Employee2.display();
		
		Employee e5 = new Employee(5,"somesh");
		e5.employeeDisplay();
	}

}
