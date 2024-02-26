package Com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.scmflex.GenericUtils.ExcelUtils;

public class DataProviderTest 
{
	
	@DataProvider
	public Object[][] data() 
	{
		Object[][] obj = new Object[3][2]; 
		
		
		obj[0][0]="Bangalore";
		obj[0][1]="Mysore";
		obj[0][2]=200;
				
		obj[1][0]="Mumbai";
		obj[1][1]="Mysore";
		obj[1][2]=500;
		
		return obj;
												
	} 
	
	@DataProvider
	public Object[][] store()
	{
		Object[][] obj = new Object[2][2];
		
		obj[0][0]="Bangalore";
		obj[0][1]="Mysore";
		
				
		obj[1][0]="Mumbai";
		obj[1][1]="Mysore";
        
		return obj;
	}
	
	@Test(dataProvider="store")
	public void getdata(String from,String to)
	{
		System.out.println("travelling"+"   "+"from"+"   "+from +"    "+"To"+"   "+to);
	}
	    

}
