package gov.in.oupp.training.java.reflectionapi;

import java.lang.reflect.Method;

public class ReflectionAPI1 {

	public static void main(String[] args) {
		
		try{
			
			System.out.println("Class of \"in\" object: "+System.in.getClass());
			System.out.println("Class of \"out\" object: "+System.out.getClass());
			
			Class c = Class.forName("SimpleA");
			System.out.println("Class of c object: "+c.getName());
			
			SimpleA sa = new SimpleA();
			System.out.println(c.isMemberClass());
			System.out.println(c.isInterface());
			System.out.println(c.isLocalClass());
			
			
			Method []m = c.getMethods(args[0]);
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
