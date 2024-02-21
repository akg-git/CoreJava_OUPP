package gov.in.oupp.training.java.corejava.myprograms;

public class StringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x=25;
//		Integer y = new Integer(5);
//		Integer z = new Integer(y);
//		System.out.println(y.hashCode());
//		System.out.println(z.hashCode());
//		System.out.println(z==y);
//		System.out.println(z.equals(y));
		
		String s1 = "pen";
		String s3="pen";
		String s2 = new String("pen");
		String s4 = new String("pen");
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s1==s3);
		System.out.println(s4==s2);
		System.out.println(s1.equals(s3));
		System.out.println(s4.equals(s2));
		
		

	}

}
