package Automate_Project_TestCase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Com.POM.LoginPage;
import Com.scmflex.GenericUtils.DatabaseUtils;
import Com.scmflex.GenericUtils.ExcelUtils;
import Com.scmflex.GenericUtils.FileUtils;
import Com.scmflex.GenericUtils.JavaUtils;
import Com.scmflex.GenericUtils.WebDriverUtils;

import java.util.Map;
import java.util.Map.Entry;



public class AddProductUtils 
{
	public static void main(String[] args) throws Throwable 
	{
		//create object for generic utilities package
		FileUtils fLib=new FileUtils();
		JavaUtils jLib=new JavaUtils();
		DatabaseUtils dLib=new DatabaseUtils();
		ExcelUtils eLib=new ExcelUtils();
		WebDriverUtils wLib=new WebDriverUtils();
		
	    //fetch data from property files
		String BROWSER=fLib.readDataFromPropertyFile("browser");
		String URL=fLib.readDataFromPropertyFile("url");
		String USERNAME=fLib.readDataFromPropertyFile("Manufactureusername");
		String PASSWORD=fLib.readDataFromPropertyFile("Manufacturepassword");
		String LOGINTYPE=fLib.readDataFromPropertyFile("Manufacturelogintype");

		
		
		
		
//		// get the data from .properties file
//		 FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\AddProduct.properties");
//		 Properties pObj=new Properties();
//		 pObj.load(fis);
//		 String BROWSER = pObj.getProperty("browser");
//		 String URL = pObj.getProperty("url");
//		 String USERNAME = pObj.getProperty("username");
//		 String PASSWORD = pObj.getProperty("password");
//		 
		 //To launch the browser
		 WebDriver driver=new ChromeDriver();
		 
		 //To maximize the window
		 //driver.manage().window().maximize();
		   wLib.maximizewindow(driver);
		 
		  driver.get(URL);
		 
		 //To wait for page Load
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 wLib.implicitlyWait(driver, 20);
		 
		
//		 driver.findElement(By.id("login:username")).sendKeys(USERNAME);
//		 driver.findElement(By.id("login:password")).sendKeys(PASSWORD);		 
//		 WebElement logintype = driver.findElement(By.id("login:type"));
		 
		 //loginto application

		 
		 
		 //To handle dropdown
		 //Select sel1=new Select(logintype);
		 //sel1.selectByVisibleText("Admin");
		 //driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		
		 
		
		 //driver.findElement(By.linkText("Add Products")).click();	
		 
		 //click on add products
		 
		 
		 
		 //enter the value in the text fields
		 FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\Exceldata.xlsx");
		 Workbook wb = WorkbookFactory.create(fi);
		 Sheet sh = wb.getSheet("Sheet1");
		 int count = sh.getLastRowNum();
		 
		 HashMap<String, String> map=new HashMap<String, String>();
		 
		 for (int i = 0; i <=count; i++) 
		 {
			 String key =sh.getRow(i).getCell(0).getStringCellValue();
			 String value = sh.getRow(i).getCell(1).getStringCellValue();
			 map.put(key, value);
		 }
		 
	      for(Entry<String, String> set:map.entrySet())
	      {
	    	  if (set.getKey().contains("txtProductName")) 
	    	  {
	    		  driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
	    	  }
	    	  
	    	  else if ( (set.getKey().contains("txtProductPrice")) ) 
	    	  {
	    		  driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
			  }
	    	  
				
		   }
	      
	      // to handle unit type dropdown
	      WebElement unittypedd = driver.findElement(By.id("product:unit"));
	      Select sel=new Select(unittypedd);
	      wLib.dropdown2(unittypedd, PASSWORD);
	      sel.selectByVisibleText(sh.getRow(0).getCell(4).getStringCellValue());
	      String unitdd = eLib.readDataFromExcel("AddProducts", 0, 4);
	      
	      
	      
	      //to handle category type dropdown
	      WebElement categorydd = driver.findElement(By.id("product:category"));
	      Select sel11=new Select(categorydd);
	      sel11.selectByVisibleText(sh.getRow(1).getCell(4).getStringCellValue());
	      eLib.readDataFromExcel("", 1, 4);
	      
	      //click on enable button
	       driver.findElement(By.xpath("//input[@value='1']")).click();
	      
	      //click and enter the description
	      driver.findElement(By.xpath("//textarea[@id='product:description']")).sendKeys("available");
	      
	      //click on add button
          driver.findElement(By.xpath("//input[@value='Add Product']")).click();
	      
	      //to handle alert popup
	        String text = driver.switchTo().alert().getText();
	        System.out.println(text);
          
	      driver.switchTo().alert().accept();
	      driver.close();
	      
	      
	    	  
	      }
			 
			
		}
		 
		 
		 




