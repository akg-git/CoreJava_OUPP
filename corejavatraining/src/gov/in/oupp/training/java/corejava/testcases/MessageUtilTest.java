/**
 * 
 */
package gov.in.oupp.training.java.corejava.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gov.in.oupp.training.java.corejava.junit.MessageUtil;
/**
 * @author AKG
 *
 */
public class MessageUtilTest {
	
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testprintMessage(){
		System.out.println("Inside testprintMessage()");
		assertEquals(message, messageUtil.printMessage());
	}

}
