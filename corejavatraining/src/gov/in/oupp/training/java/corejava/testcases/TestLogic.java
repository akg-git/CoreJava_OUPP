/**
 * 
 */
package gov.in.oupp.training.java.corejava.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gov.in.oupp.training.java.corejava.junit.Calculation;

/**
 * @author AKG
 *
 */


public class TestLogic {
	
	@BeforeClass
	public static void  setUpBeforeClass() throws Exception{
		System.out.println("Before Class SetUp");
	}
	
	@Before
	public void setUp() throws Exception{
		System.out.println("before:: setuP method");
		
	}
	
	@Test
	public void testFindMax(){
		System.out.println("Print MAX Value");
		assertEquals(4, Calculation.findmax(new int[] {1,3,4,2}));
		assertEquals(0, Calculation.findmax(new int[] {-12, -1, -3, 0, -4, -2}));
	}
	
	@Test
	public void testCube(){
		System.out.println("Cube test case");
		assertEquals(27, Calculation.cube(3));
		assertEquals(512, Calculation.cube(8));
	}
	
	
	@After
	public void tearDown() throws Exception{
		System.out.println("after:: tearDown method");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("After Class TearDown");
	}
}
