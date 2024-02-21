package gov.in.oupp.training.java.corejava.myprograms;

@FunctionalInterface
interface Power{
	
	 public int power(int a);
}

public class LambdaExpressions {

	public static void main(String[] args) {
		
//		Power obj = new Power(){
//			@Override
//			public int power(int a){
//				
//				return a*a*a;
//			}
//		};
		
		Power obj = (a) ->  a*a*a;
		System.out.println(obj.power(11));
	}

}
