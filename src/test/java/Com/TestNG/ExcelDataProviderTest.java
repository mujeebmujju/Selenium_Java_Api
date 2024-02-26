package Com.TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.scmflex.GenericUtils.ExcelUtils;
import Com.scmflex.GenericUtils.IPathConstants;

public class ExcelDataProviderTest 
{
	@DataProvider 
	public Object[][] data() throws Throwable
	{
		
		FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
 		Workbook wb = WorkbookFactory.create(fi);
 		Sheet sh = wb.getSheet("Sheet1");
 		int rowcount=sh.getLastRowNum();
 		int cellcount=sh.getRow(0).getLastCellNum();
 		
 		
 		 Object[][] obj=new Object[rowcount][cellcount];
 		 
 		 for (int i = 0; i <=rowcount; i++) 
 		 {
 	 		 for (int j = 0; j <cellcount; j++) 
 	 		 {
 	 			 obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
 	 		 }
 		 }
 		 return obj;
	}
	
}
