package Automate_Project_TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Delete_RetailerTest {
	public static void main(String[] args) throws InterruptedException, Throwable
	{
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Properties pobj=new Properties();

		//create object for properties class
		pobj.setProperty("browser","chrome");
		pobj.setProperty("url","http://rmgtestingserver/domain/Supply_Chain_Management/index.php");
		pobj.setProperty("login:username","admin");
		pobj.setProperty("login:password","admin123");
		pobj.setProperty("logintype", "login:type");
		pobj.setProperty("type","Admin");


	//	FileOutputStream fout=new FileOutputStream(".\\src\\test\\resources\\Common_Data.properties");
		//pobj.store(fout,"write data");
		//Fetching data from property file

		FileInputStream fin=new FileInputStream(".\\src\\test\\resources\\Common_Data.properties   ");
		pobj.load(fin);
		String BROWSER=pobj.getProperty("browser");
		String URL=pobj.getProperty("url");
		String username=pobj.getProperty("login:username");
		String password=pobj.getProperty("login:password");
		String logindd=pobj.getProperty("logintype");
		String admintype=pobj.getProperty("type");

		//login to application
		driver.get(URL);
		driver.findElement(By.id("login:username")).sendKeys(username);
		driver.findElement(By.id("login:password")).sendKeys(password);
		WebElement logintype = driver.findElement(By.id(logindd));
		Select sel=new Select(logintype);
		sel.selectByVisibleText(admintype);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println(driver.getTitle()+" is dispalyed");
		
		//creating new Retailer
		driver.findElement(By.xpath("//a[.='Add Retailers']")).click();
		System.out.println(driver.getTitle()+ " is displayed");
		
		
		//fetching data from excelfile
		FileInputStream exefi=new FileInputStream(".\\src\\test\\resources\\Exceldata.xlsx");
		Workbook wk = WorkbookFactory.create(exefi);
		Sheet sh = wk.getSheet("newRetailer");
		int count=sh.getLastRowNum();
		HashMap<String, String> map=new HashMap<String,String>();
		
		//selecting dropdown
		WebElement areacoded= driver.findElement(By.name("cmbAreaCode"));
		Select sel1=new Select(areacoded);
		String areavalue=sh.getRow(1).getCell(3).getStringCellValue();
		sel1.selectByVisibleText(areavalue);

		for(int i=0;i<=count;i++)
		{
			String key=sh.getRow(i).getCell(0).getStringCellValue();
			String value=sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
		}
		for(Entry<String,String>set:map.entrySet())
		{
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		}
		
		//read phonenumber from excelfile
		long phone =(long) sh.getRow(1).getCell(4).getNumericCellValue();
		String num=String.valueOf(phone);
		driver.findElement(By.name("txtRetailerPhone")).sendKeys(num);
		driver.findElement(By.xpath("//input[@value='Add Retailer']")).click();
		
		Alert alert = driver.switchTo().alert();
		String conmessage = alert.getText();
		System.out.println(conmessage);
		alert.accept();

		//deleting retailer account
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement retailer= driver.findElement(By.xpath("//a[.='Retailers']"));
		wait.until(ExpectedConditions.elementToBeClickable(retailer));
		retailer.click();
		System.out.println(driver.getTitle()+ " is displayed");
		String name=sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//td[(.=' "+name+" ')]/..//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();

		String delmessage = alert.getText();
		System.out.println(delmessage);
		alert.accept();
		driver.quit();

	}

}