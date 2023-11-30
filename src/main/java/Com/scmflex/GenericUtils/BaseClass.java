package Com.scmflex.GenericUtils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Com.POM.AdminHomePage;
import Com.POM.LoginPage;
import Com.POM.ManufacturerHomePage;

public class BaseClass extends WebDriverUtils
{
	public FileUtils fLib=new FileUtils();
	public JavaUtils jLib=new JavaUtils();
	public DatabaseUtils dLib=new DatabaseUtils();
	public ExcelUtils eLib=new ExcelUtils();
	public WebDriverUtils wLib=new WebDriverUtils();
	public WebDriver driver;
	
	public static WebDriver sdriver;
	
	@BeforeSuite(alwaysRun = true)
	public void config_BS() throws Throwable
	{
		dLib.connectionDB();
		System.out.println("-----connect to DB--");
		
	}
	
	
	@BeforeClass(alwaysRun = true)
	public void config_BC() throws Throwable
	{
		String URL=fLib.readDataFromPropertyFile("url");
		String BROWSER=fLib.readDataFromPropertyFile("browser");
	    if (BROWSER.equalsIgnoreCase("chrome"))
	    {
	    	driver=new ChromeDriver();	
		}
	     
	    else if (BROWSER.equalsIgnoreCase("firefox")) 
	    {
	    	driver=new FirefoxDriver();
		}
	    
	    else 
	    {
	    	
	     System.out.println("----invalid browser----");
	    }
	    
	    sdriver=driver;
	    wLib.maximizewindow(driver);
	    driver.get(URL);
	    wLib.implicitlyWait(driver, 20);
	    System.out.println("----browser launched---");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void config_BM() throws IOException, Throwable
	{
		
		String USERNAME=fLib.readDataFromPropertyFile("Adminusername");
		String PASSWORD=fLib.readDataFromPropertyFile("Adminpassword");
		String LOGINTYPE=fLib.readDataFromPropertyFile("AdminLoginType");
		
		Thread.sleep(2000);
		
		LoginPage Lp=new LoginPage(driver);
		Lp.EnterUsernameAndPassword(USERNAME,PASSWORD);
		Lp.EnterLoginType(LOGINTYPE);
		Lp.ClickOnLoginButton();

	}
	
	@AfterMethod(alwaysRun = true)
	public void config_AM()
	{
		AdminHomePage Ahp=new AdminHomePage(driver);
		Ahp.getLogoutButton().click();
		System.out.println("--logout from application--");
 
	}
	
	@AfterClass()
	public void config_AC() 
	{
		driver.quit();
		System.out.println("----browser closed---");
	}
	
	@AfterSuite()
	public void config_AS() throws Throwable
	{
		dLib.disconnectDB();
		System.out.println("disconnect database");
	}
	
	

	

}
