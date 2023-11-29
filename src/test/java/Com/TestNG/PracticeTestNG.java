package Com.TestNG;

import org.testng.annotations.Test;

public class PracticeTestNG 
{
	@Test(dependsOnMethods = "edittest")
	public void createtest()
	{
		System.out.println("----create test----");
	}
	
	@Test()
	public void edittest()
	{
		System.out.println("---edit test-----");
	}
	
	@Test()
	public void deletetest()
	{
		System.out.println("---delete test-----");
	}
	
	@Test()
	public void modifytest()
	{
		System.out.println("---modify test-----");
	}
	 
	
	 

}
