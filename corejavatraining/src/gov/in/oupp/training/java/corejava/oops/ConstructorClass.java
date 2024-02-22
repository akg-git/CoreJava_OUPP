/**
 * Default and Parameterized Constructor to initialize variables
 */
package gov.in.oupp.training.java.corejava.oops;

/**
 * @author AKG
 *
 */
public class ConstructorClass {
	int customer_id;
	String name;
	short age;
	

	
	//writing default constructor and than write parameterized constructor
	public ConstructorClass()
	{
		System.out.println("Default values: "+customer_id+" "+name+" "+age);
		
	}
	
	// parameterized constructor is best practices.
	public ConstructorClass(int customer_id, String name, int age)
	{
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.age = (short)age;
		System.out.println("Customer Data: "+customer_id+" "+name+" "+age);
	}
	
	void show()
	{
		System.out.println("Customer Data: "+customer_id+" "+name+" "+age);
	}
	
	
	
	public static void main(String[] args) {
//		ConstructorClass c = new ConstructorClass();
		ConstructorClass c1 = new ConstructorClass(101, "Ajay", 22);
		c1.show(); // object messaging
		ConstructorClass c2 = new ConstructorClass(102, "Bijay", 23);
		ConstructorClass c3 = new ConstructorClass(103, "Sanjay", 25);
		ConstructorClass c4 = new ConstructorClass(104, "Jai", 22);
	}

}
