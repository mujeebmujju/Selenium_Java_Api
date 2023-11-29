package Com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.scmflex.GenericUtils.ExcelUtils;

public class ExecuteDPExcelTest
{
		@Test (dataProviderClass=ExcelDataProviderTest.class,dataProvider ="data")
		public void getdata(String Org,String Loc)
		{
			System.out.println(Org+"   "+Loc);
		}
		
		/*
		 * @DataProvider public Object[][] getdatfromexcel() throws Throwable {
		 * ExcelUtils elib=new ExcelUtils(); Object[][] value =
		 * elib.getMultipleSetOfData("Sheet1"); return value; }
		 */
	}


			


