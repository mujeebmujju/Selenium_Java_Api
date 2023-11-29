package Automate_Project_TestCase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.POM.LoginPage;
import Com.scmflex.GenericUtils.DatabaseUtils;
import Com.scmflex.GenericUtils.ExcelUtils;
import Com.scmflex.GenericUtils.FileUtils;
import Com.scmflex.GenericUtils.JavaUtils;
import Com.scmflex.GenericUtils.WebDriverUtils;

public class AddRetailersPageDisplayedUtils 
{
		public static void main(String[] args) throws InterruptedException, Throwable 
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
			String USERNAME=fLib.readDataFromPropertyFile("username");
			String PASSWORD=fLib.readDataFromPropertyFile("password");
			String LOGINTYPE = fLib.readDataFromPropertyFile("LoginType");
				
			
		
			//to launch the browser
			WebDriver driver=new ChromeDriver();
			LoginPage Lp=new LoginPage(driver);
			
			
		
			//to maximize the window
		     wLib.maximizewindow(driver);
			//driver.manage().window().maximize();
			
			//to wait 
			wLib.implicitlyWait(driver, 20);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		   //Login to application
			driver.get(URL);
			
		
			
			
			//driver.findElement(By.id("login:username")).sendKeys(USERNAME);
			//driver.findElement(By.id("login:password")).sendKeys(PASSWORD);
			//WebElement logintype = driver.findElement(By.id("login:type"));
			
			//To handle dropdown2
            //wLib.dropdown2(logintype, "Admin");
            //Select sel1=new Select(logintype);
			//sel1.selectByVisibleText("Admin");
			//driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			String actualtitle = driver.getTitle();
		    String expectedtitle = "Admin: Home";
			
		    if (actualtitle.equals(expectedtitle)) 
		    {
		    	System.out.println("home page is displayed...verified with tittle");
				
			}
		    else
		    {
		    	System.out.println("home page is not displayed...");
		    }
		    
			
			
			
			driver.findElement(By.xpath("//a[.='Add Retailers']")).click();
			
			
			
		    driver.findElement(By.xpath("//a[.='Add Retailers']")).click();
		    String actualaddretailerpagetitle = driver.getTitle();
		    String expectedaddretailerpagedetail ="Add Retailer";
		    
		    if (actualaddretailerpagetitle.equalsIgnoreCase(expectedaddretailerpagedetail)) 
		    {
		    	System.out.println("Add retailer page is displayed..verified with title");
				
			}
		    else
		    {
		    	System.out.println("Add retailer page is not displayed..");
		    }
			
			
		}

	}




