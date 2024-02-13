/**
 * 
 */
package gov.in.oupp.training.java.reflectionapi;
import java.lang.reflect.*;

/**
 * @author Asish Kumar Gouda
 *
 */
class ReflectionDemo {
	
	private int a;
	int b;
	
	ReflectionDemo()
	{
		super();
		a=0;
		b=0;
	}
	
	ReflectionDemo(int x, int y){
		a=x;
		b=y;
	}
	
	
	
	private void show(){
		System.out.println("inside show() method");
	}
	
	void display(){
		System.out.println("inside display() method");
		System.out.println("a = "+a+"b ="+b);
	}

}

public class ReflectionAPi2
{
	
	Class class1 = Class.forName("ReflectionDemo");
	Field f[] = class1.getDeclaredFields();
	
	ReflectionDemo obj = (ReflectionDemo) class1.newInstance();
	for(Field f2: f){
		System.out.println(f2);
	}
	
}
