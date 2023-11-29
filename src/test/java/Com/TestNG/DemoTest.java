package Com.TestNG;

import org.testng.annotations.Test;

import Com.scmflex.GenericUtils.BaseClass2;

public class DemoTest extends BaseClass2 
{
	@Test(groups="Smoke")
	public void Demo_1test()
	{
	    System.out.println("---Demo 1---'");	
	}
	
	@Test(groups = "Regression")
	public void Demo_2test()
	{
	    System.out.println("---Demo 2---'");	
	}


}
