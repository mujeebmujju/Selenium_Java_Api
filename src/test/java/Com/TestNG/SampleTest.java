package Com.TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.scmflex.GenericUtils.BaseClass;


	public class SampleTest extends BaseClass
	{
		@Test(groups= {"smoke","Regression"})
		public void Sample_1test()
		{
		    System.out.println("---Sample 1---'");	
		    
		}
		
		@Test
		public void Sample_2test()
		{
		    System.out.println("---Sample 2---'");	
		}


	}



