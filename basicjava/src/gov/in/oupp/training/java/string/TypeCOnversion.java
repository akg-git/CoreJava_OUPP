package gov.in.oupp.training.java.string;

public class TypeCOnversion {

	public static void main(String[] args) {
		
		//primitive -> String
		
		int x = 32;
		float y =34.14f;
		char z = 'z';
		String xx = String.valueOf(x);
		System.out.println(xx);
		String yy = String.valueOf(y);
		System.out.println(yy);
		String zz = String.valueOf(z);
		System.out.println(zz);
		
		int intval = (int)z;
		System.out.println(intval);//ascii value
		
	}
}
