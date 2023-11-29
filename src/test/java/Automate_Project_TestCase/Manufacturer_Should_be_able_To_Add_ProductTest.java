package Automate_Project_TestCase;

import java.io.FileInputStream;
import java.io.IOException;
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



public class Manufacturer_Should_be_able_To_Add_ProductTest 
{

	public static void main(String[] args) throws IOException 
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
		
		
		
		WebDriver driver=new ChromeDriver();
		
		//loginto application
		driver.get(URL);
		wLib.maximizewindow(driver);
		wLib.implicitlyWait(driver, 20);
		LoginPage lp=new LoginPage(driver);
//		lp.EnterUserNameandPassword(USERNAME, PASSWORD);
//		lp.SelectLoginType(LOGINTYPE);
//		lp.clickonloginbutton();





		//		 //loginto application
		//		 WebDriver driver=new ChromeDriver();
		//		 driver.manage().window().maximize();
		//		 driver.get(URL);
		//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//		 driver.findElement(By.id("login:username")).sendKeys("admin");
		//		 driver.findElement(By.id("login:password")).sendKeys("admin123");
		//		 

		//Logintype dropdown
		WebElement logintypedd = driver.findElement(By.id("login:type"));
		Select sel1=new Select(logintypedd);
		sel1.selectByVisibleText("Admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		//click on add products
		driver.findElement(By.linkText("Add Products")).click();	

		//enter the value in the text fields
		FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\Exceldata.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Addproducts");
		int count = sh.getLastRowNum();

		HashMap<String, String> map=new HashMap<String, String>();

		for (int i = 0; i <=count; i++) 
		{
			String key = sh.getRow(i).getCell(0).getStringCellValue();
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
		WebElement unittypedd = driver.findElement(By.name("cmbProductUnit"));
		Select sel=new Select(unittypedd);
		sel.selectByVisibleText(sh.getRow(2).getCell(1).getStringCellValue());

		//to handle category type dropdown
		WebElement categorydd = driver.findElement(By.name("cmbProductCategory"));
		Select sel11=new Select(categorydd);
		sel11.selectByVisibleText(sh.getRow(3).getCell(1).getStringCellValue()); 

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






