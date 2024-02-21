package gov.in.oupp.training.java.corejava.myprograms;

/**
 * @author Asish Kumar Gouda
 *
 */

public class WrapperClassDemo1 {
	
	public static void main(String args[])
	{
		
		System.out.println("(primitive > Object) Number");
		int i=34;
		
		Integer ival = new Integer(i);
		System.out.println(ival);
		Double dval = new Double(i); 
		System.out.println(dval);
		
		System.out.println("(Object->primitive) numbers");
		Integer I = 26;
		int ivl = I.intValue();
		System.out.println(ivl);
		float fvl = I.floatValue();
		System.out.println(fvl);
		
		System.out.println("primitive number -> string");
		float f = 34.983f;
		String str = Float.toString(f);
		System.out.println(str);
		str = Double.toString(f);
		System.out.println(str);
		str = Long.toString(2423432L);
		System.out.println(str);
		
		System.out.println("String ->  numeric Objct");
		String st = "3245";
		int sx = Integer.valueOf(st);
		System.out.println(sx);
		double xs = Long.valueOf(st);
		System.out.println(xs);
		
		
	}

}
