/**
 * 
 */
package gov.in.oupp.training.java.corejava.myprograms;

import java.text.DecimalFormat;

/**
 * @author AKG
 *
 */
public class FormattingJava {


	public static void main(String[] args) {
		
		double x = 123.4567 ;  
	    // printing the number  
	    System.out.printf( " \n The number is : %f \n ", x ) ;      
	    // printing only the numeric part of the floating number  
	    DecimalFormat ft = new DecimalFormat( " #### " ) ;  
	    System.out.println( " \n Without fraction part the number is : " + ft.format( x ) ) ;  
	    // printing the number only upto 2 decimal places  
	    ft = new DecimalFormat( " #.## " ) ;  
	    System.out.println( " \n Formatted number with the specified precision is = " + ft.format( x ) ) ;  

	    // automatically appends zero to the leftmost of decimal number instead of #, we use digit 0  
	    ft = new DecimalFormat( " 00000.000000 " ) ;  
	    System.out.println( " \n Appending the zeroes to the left of the number = "+ ft.format( x ) ) ;  
	    
	    
	    // formatting money in rupees  
	    double income = 550200.789 ;  
	    ft = new DecimalFormat( "###,###.## "  ) ;  
	    System.out.println( " \n Your Formatted Income in Rupees : Rs." + ft.format( income ) ) ;  

	}

}
