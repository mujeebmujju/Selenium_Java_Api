package Automate_Project_Test_Case1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import Com.POM.LoginPage;
import Com.POM.ManufacturerAddProductPage;
import Com.POM.ManufacturerHomePage;
import Com.scmflex.GenericUtils.ExcelUtils;
import Com.scmflex.GenericUtils.FileUtils;
import Com.scmflex.GenericUtils.WebDriverUtils;

public class Manufacturer_should_be_able_to_add_products_Test 
{
	WebDriver driver;
	@Test
public void test() throws IOException
{
	// Create objects for Generic Utility			
	FileUtils fileutils = new FileUtils();		
	WebDriverUtils webdriverutils= new WebDriverUtils(); 
	ExcelUtils excelutils = new ExcelUtils();
	
	
	String BROWSER=fileutils.readDataFromPropertyFile("browser");
    String URL=fileutils.readDataFromPropertyFile("url");
	String USERNAME=fileutils.readDataFromPropertyFile("Manufacturerusername");
	String PASSWORD=fileutils.readDataFromPropertyFile("Manufacturerpassword");
	String LOGINTYPE=fileutils.readDataFromPropertyFile("Manufacturerlogintype");	
	
	//WebDriver driver= new ChromeDriver();
	if (BROWSER.equalsIgnoreCase("chrome")) 
	{
		driver=new ChromeDriver();
	}
	else if (BROWSER.equalsIgnoreCase("edge")) 
	{
		driver= new EdgeDriver();	
	}
	LoginPage loginpage= new LoginPage(driver);
	ManufacturerHomePage mHomepage = new ManufacturerHomePage(driver);
	ManufacturerAddProductPage mAddproductPage=new ManufacturerAddProductPage(driver);
	
	webdriverutils.maximizewindow(driver);
	webdriverutils.implicitlyWait(driver, 20);
	driver.get(URL);
	
	// Enter username and password and click on login button
	loginpage.EnterUsernameAndPassword(USERNAME,PASSWORD);
	loginpage.EnterLoginType(LOGINTYPE);
	loginpage.ClickOnLoginButton();
	
	// Compare the actual and expected page
	String actualtitle = driver.getTitle();
	String expectedtitle="Manufacturer: Home";
	if(actualtitle.equals(expectedtitle))
	{
		System.out.println("Homepage is displayed... and its verified with title");
	}
	else
	{
		System.out.println("Homepage is Not displayed...");
	}
	// Click on add product link
	mHomepage.ClickOnaddProductLink();
	
	String actualaddproducttitle = driver.getTitle();
	String expectedproductpagetitle= "Add Product";
	if(actualaddproducttitle.equals(expectedproductpagetitle))
	{
		System.out.println("addProduct page is displayed... and its verified with title");
	}
	else
	{
		System.out.println("addProduct page is Not displayed...");
	}
	
	
	mAddproductPage.EnterdataIntoAddTextField(excelutils.readMultipleData("Sheet2", driver), driver);
	mAddproductPage.getEnableradioButton().click();
	mAddproductPage.getAddButton().click();
	
	// Handle the confirmation popup
	String ctext= driver.switchTo().alert().getText();
	System.out.println(ctext);
	webdriverutils.acceptAlert(driver);
	
	// minimize the browser
	webdriverutils.minimizewindow(driver);
	
	// close the browser
	driver.quit();
	
	
   }

}
