package gov.in.oupp.training.java.corejava.myprograms;

public class EnumClassDemo {
	
	enum Seasons{
		ଗ୍ରୀଷ୍ମ ,
		ବର୍ଷା ,
		ଶରତ ,
		ହେମନ୍ତ ,
		ଶୀତ ,
		ବସନ୍ତ 
	}

	public static void main(String[] args) {
		System.out.println("Seasons List in Odia: ");
		for(Seasons ss: Seasons.values())
			System.out.println(ss);
			

	}

}
