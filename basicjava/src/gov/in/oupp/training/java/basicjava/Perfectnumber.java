/**
 * A perfect number is a number: it is equal to the sum of its proper divisors, the numbers that divide it evenly except itself.
 */
package gov.in.oupp.training.java.basicjava;

/**
 * @author AKG
 *
 */
public class Perfectnumber {


	public static void main(String[] args) {
		
		int num = 28;	//8128, 6, 28
		int perfectSum=0;
		for(int i = 1; i< num + 1;i++){
			
			if(num%i==0)
				perfectSum += i;
			
		}
	
	if(perfectSum==num){
		System.out.println(num+" is a perfect number");
	}else{
		System.out.println(num+" is not a perfect number");
	}
	System.out.println();

}
}

