package Com.TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Hardassert_Test 
{
	@Test
	public void HardAssert()
	{
		System.out.println("----test 1---");
		System.out.println("----test 2---");
		assertEquals("A","B");
		System.out.println("----test 3---");
		System.out.println("----test 4---");

	}
	
	@Test
	public void HardAssert1()
	{
		System.out.println("---test 5---");
		System.out.println("---test 6---");
		assertEquals("A","B");
		System.out.println("----test 7---");
		System.out.println("----test 8---");

		

	}

}
