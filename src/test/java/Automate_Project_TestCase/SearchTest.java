package Automate_Project_TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchTest {


	public static void dropdown(WebElement Element,String text) {
		Select sel=new Select( Element);
		sel.selectByVisibleText(text);

	}
	public static void main(String[] args) throws Throwable {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Properties pobj=new Properties();

		//create object for properties class
		pobj.setProperty("browser","chrome");
		pobj.setProperty("url","http://rmgtestingserver/domain/Supply_Chain_Management/index.php");
		pobj.setProperty("login:username","Divya");
		pobj.setProperty("login:password","divya");
		pobj.setProperty("logintype", "login:type");
		pobj.setProperty("type","Retailer");


//		FileOutputStream fout=new FileOutputStream(".\\src\\test\\resources\\Common_Data.properties");
//		pobj.store(fout,"write data");


		//Fetching data from property file
		FileInputStream fin=new FileInputStream(".\\src\\test\\resources\\Common_Data.properties");
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
		String actualhomepage = driver.findElement(By.xpath("//title")).getText();
		
		System.out.println(driver.getTitle() + " is displayed");
		
		FileInputStream exfile=new FileInputStream(".\\src\\test\\resources\\Exceldata.xlsx");
		Workbook wk = WorkbookFactory.create(exfile);
		Sheet sh = wk.getSheet("searchorder");


		//search with itemID
		System.out.println("//search with itemID//");
		driver.findElement(By.xpath("//a[.='My Orders']")).click();
		String actualorder= driver.findElement(By.xpath("//title")).getText();
		
		System.out.println(driver.getTitle() + " is displayed");
		
		dropdown(driver.findElement(By.id(sh.getRow(0).getCell(0).getStringCellValue())),sh.getRow(1).getCell(0).getStringCellValue());
		int id =  (int) sh.getRow(1).getCell(1).getNumericCellValue();
		String actualid=String.valueOf(id);
		driver.findElement(By.id("txtId")).sendKeys(actualid);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		String expectedid = driver.findElement(By.xpath("//table[@class='table_displayData']/tbody/tr[2]/td[1]")).getText();
		if(actualid.equals(expectedid))
		{
			System.out.println("searched with correct id");
		}
		else
		{
			String errormsg = driver.findElement(By.xpath("//span[@class='error_message']")).getText();
			System.out.println(errormsg);
		} 
	
		//search with  item order date 
		System.out.println("//search with  item order date//");
		driver.findElement(By.xpath("//a[.='My Orders']")).click();
		
		
		System.out.println(driver.getTitle() + " is displayed");
		
		dropdown(driver.findElement(By.id(sh.getRow(0).getCell(0).getStringCellValue())),sh.getRow(2).getCell(0).getStringCellValue());
		driver.findElement(By.id("datepicker")).click();
		Select sel1=new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
		sel1.selectByVisibleText("Nov");
		driver.findElement(By.xpath("//a[.='10']")).click();
		String expdate = "10-11-2023";
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		String actualdate= driver.findElement(By.xpath("//table[@class='table_displayData']/tbody/tr[2]/td[2]")).getText();
		if(actualdate.contains(expdate))
		{
			System.out.println("searched with correct date");
		}
		else
		{
			String errormsg = driver.findElement(By.xpath("//span[@class='error_message']")).getText();
			System.err.println(errormsg);
		}
	
		//search with item status as  Pending  
		System.out.println("//search with item status as  Pending//");
		driver.findElement(By.xpath("//a[.='My Orders']")).click();
		
		
		System.out.println(driver.getTitle() + " is displayed");
		
		dropdown(driver.findElement(By.id(sh.getRow(0).getCell(0).getStringCellValue())),sh.getRow(3).getCell(0).getStringCellValue());
		dropdown(driver.findElement(By.id(sh.getRow(3).getCell(1).getStringCellValue())),sh.getRow(3).getCell(2).getStringCellValue());
		String expstatus = sh.getRow(3).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		String actualstatus= driver.findElement(By.xpath("//table[@class='table_displayData']/tbody/tr[2]/td[4]")).getText();

		if(expstatus.contains(actualstatus))
		{
			System.out.println("searched with  correct pending status");
		}
		else
		{
			String errormsg = driver.findElement(By.xpath("//span[@class='error_message']")).getText();
			System.err.println(errormsg);
		}
	
		//search with item status as completed
		System.out.println("//search with item status as completed//");
		driver.findElement(By.xpath("//a[.='My Orders']")).click();
		
		System.out.println(driver.getTitle() + " is displayed");
		
		dropdown(driver.findElement(By.id(sh.getRow(0).getCell(0).getStringCellValue())),sh.getRow(3).getCell(0).getStringCellValue());
		dropdown(driver.findElement(By.id(sh.getRow(3).getCell(1).getStringCellValue())),sh.getRow(3).getCell(3).getStringCellValue());
		String exptstatus = sh.getRow(3).getCell(3).getStringCellValue();
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		String actstatus = sh.getRow(3).getCell(2).getStringCellValue();
		if(actstatus.equals(exptstatus))
		{
			System.out.println("searched with completed status");
		}
		else
		{
			String errormsg = driver.findElement(By.xpath("//span[@class='error_message']")).getText();
			System.err.println(errormsg);
		}
	
		//search with item approval as approved option
		System.out.println("//search with item approval as approved option//");
		driver.findElement(By.xpath("//a[.='My Orders']")).click();
		
		System.out.println(driver.getTitle() + " is displayed");
		
		dropdown(driver.findElement(By.id(sh.getRow(0).getCell(0).getStringCellValue())),sh.getRow(4).getCell(0).getStringCellValue());
		dropdown(driver.findElement(By.id(sh.getRow(4).getCell(1).getStringCellValue())),sh.getRow(4).getCell(3).getStringCellValue());
		String expapp = sh.getRow(4).getCell(3).getStringCellValue();
		String actapp = driver.findElement(By.xpath("//table[@class='table_displayData']/tbody/tr[2]/td[3]")).getText();
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		if(expapp.equals(actapp))
		{
			System.out.println("searched with  correct approved option");
		}
		else
		{
			String errormsg = driver.findElement(By.xpath("//span[@class='error_message']")).getText();
			System.err.println(errormsg);
		}
	
		//search with item approval as not approved option
		System.out.println("//search with item approval as not approved option//");
		driver.findElement(By.xpath("//a[.='My Orders']")).click();
		
		System.out.println(driver.getTitle() + " is displayed");

		dropdown(driver.findElement(By.id(sh.getRow(0).getCell(0).getStringCellValue())),sh.getRow(4).getCell(0).getStringCellValue());
		dropdown(driver.findElement(By.id(sh.getRow(4).getCell(1).getStringCellValue())),sh.getRow(4).getCell(2).getStringCellValue());
		String exptapp = sh.getRow(4).getCell(2).getStringCellValue();
		String actualapp = driver.findElement(By.xpath("//table[@class='table_displayData']/tbody/tr[2]/td[3]")).getText();
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		if(exptapp.contains(actualapp))
		{
			System.out.println("searched with correct not approved option");
		}
		else
		{
			String errormsg = driver.findElement(By.xpath("//span[@class='error_message']")).getText();
			System.err.println(errormsg);
		}
		driver.quit();
		}
}
		
	
