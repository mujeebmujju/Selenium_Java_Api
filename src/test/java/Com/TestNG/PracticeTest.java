package Com.TestNG;

import org.testng.annotations.Test;

import Com.scmflex.GenericUtils.BaseClass2;

public class PracticeTest extends BaseClass2
{
	@Test(groups= {"smoke","Regression"})
	public void Practice_1test()
	{
	    System.out.println("---Practice 1---'");	
	}
	
	@Test
	public void Practice_2test()
	{
	    System.out.println("---Practice 2---'");	
	}


}
