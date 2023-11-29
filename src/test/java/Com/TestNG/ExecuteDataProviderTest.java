package Com.TestNG;

import org.testng.annotations.Test;

public class ExecuteDataProviderTest 
{
	@Test (dataProviderClass=DataProviderTest.class,dataProvider="store")
	public void getdata(String from,String to)
	{
		System.out.println("travelling"+"   "+"from"+"   "+from +"    "+"To"+"   "+to);
	}
}

		



