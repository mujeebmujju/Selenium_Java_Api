package Com.TestNG;

import org.testng.annotations.Test;

public class PracticeTestNG2 
{
	@Test()
	public void a()
	{
		System.out.println("---a----");
	}
	
	@Test()
	public void b()
	{
		System.out.println("---b-----");
	}
	
	@Test(dependsOnMethods = "d")
	public void c()
	{
		System.out.println("---c-----");
	}
	
	@Test()
	public void d()
	{
		System.out.println("---d-----");
	}
	 
	
	 

}
