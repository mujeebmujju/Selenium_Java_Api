package Com.scmflex.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcelUtils 
{ 
	/**
	 * This method is used to read data from Excel
	 * @author Mujeeb
	 * @param SheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws Throwable
	 */
	public String readDataFromExcel(String sheetName,int row,int cell) throws Throwable
	{
		FileInputStream fi=new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(sheetName);
		String value = sh.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	
	/**
	 * This method is used to get the row count
	 * @param sheetName
	 * @return
	 * @throws Throwable
	 */
    public int getLastRowNo(String sheetName) throws EncryptedDocumentException, IOException
    {
    	FileInputStream fi=new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(sheetName);
		int count = sh.getLastRowNum();
		return count;
    }
    
    
    /**This method is used to write data into excel
     * @param sheetName
     * @param row
     * @param cell
     * @param data
     * @throws IOException 
     * @throws EncryptedDocumentException 
     */
     public void writeDataIntoExcel(String sheetName,int row,int cell,String data ) throws EncryptedDocumentException, IOException
    {
    	FileInputStream fi=new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(sheetName);
		sh.createRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fout=new FileOutputStream("ExcelPath");
		//.write(fout);
		wb.close();
     
    }
     
     public HashMap<String,String> readMultipleData(String sheetName,WebDriver driver) throws EncryptedDocumentException, IOException
     {
        JavaUtils jLib = new JavaUtils();
    	FileInputStream fi=new FileInputStream(IPathConstants.ExcelPath);
 		Workbook wb = WorkbookFactory.create(fi);
 		Sheet sh = wb.getSheet(sheetName);
 		int count=sh.getLastRowNum();
 		
 		HashMap<String, String> map = new HashMap<String, String>();
 		
 	    for (int i = 0; i<=count; i++) 
 	    {
 	    	String key = sh.getRow(i).getCell(0).getStringCellValue();
 	    	String value = sh.getRow(i).getCell(1).getStringCellValue();
 	    	map.put(key, value);
 	    }
 	    
 	    return map;
     }
     
     
     
     public Object[][] getMultipleSetOfData(String sheetName) throws Throwable
     {
    	FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
  		Workbook wb = WorkbookFactory.create(fi);
  		Sheet sh = wb.getSheet(sheetName);
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
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
   