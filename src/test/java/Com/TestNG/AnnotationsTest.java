package Com.TestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class AnnotationsTest 
{
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@BeforeClass
	public void BeforeClass1()
	{
		System.out.println("BeforeClass");
	}
	
	@BeforeClass
	public void BeforeClass2()
	{
		System.out.println("BeforeClass2");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@BeforeMethod
	public void BeforeMethod1()
	{
		System.out.println("BeforeMethod1");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod1()
	{
		System.out.println("AfterMethod1");
	}
	
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
	
	@BeforeMethod
	public void BeforeMethod2()
	{
		System.out.println("BeforeMethod2");
	}
	
	@BeforeMethod
	public void BeforeMethod3()
	{
		System.out.println("BeforeMethod3");
	}
	
	@BeforeMethod
	public void BeforeMethod4()
	{
		System.out.println("BeforeMethod4");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod2()
	{
		System.out.println("AfterMethod2");
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod3()
	{
		System.out.println("AfterMethod3");
	}
	
	@org.testng.annotations.AfterClass
	public void AfterClass2()
	{
		System.out.println("AfterClass2");
	}
	
	@org.testng.annotations.AfterClass
	public void AfterClass3()
	{
		System.out.println("AfterClass3");
	}
	
	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	}


}
