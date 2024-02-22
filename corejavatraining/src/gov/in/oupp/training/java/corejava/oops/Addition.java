/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops;

/**
 * @author AKG
 *
 */
 class Addition {
	
	int num1;
	int num2;
	
	 Addition(){

	}
	
	
	 Addition(int n1, int n2){
		this.num1 = n1;
		this.num2 = n2;
	}
	
	public Addition add(){
		System.out.println("addition result ="+(num1+num2));
		Addition addition = new Addition();
		return addition;
	}
	

}

