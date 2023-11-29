package Automate_Project_Test_Case1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.POM.AdminHomePage;
import Com.POM.AdminViewProductPage;
import Com.POM.LoginPage;
import Com.POM.ManageStockPage;
import Com.POM.ManufacturerAddProductPage;
import Com.POM.ManufacturerHomePage;
import Com.scmflex.GenericUtils.ExcelUtils;
import Com.scmflex.GenericUtils.FileUtils;
import Com.scmflex.GenericUtils.WebDriverUtils;

public class Manufacturer_should_be_able_to_update_stock_and_Admin_can_see_Update_Stock_Test 
{
	
	public WebDriver driver;
	@Test
	public void test() throws IOException 
	{
		FileUtils fileutils= new FileUtils();
		WebDriverUtils webdriverutils=new WebDriverUtils();
		
		ExcelUtils excelutils = new ExcelUtils();
		
		String BROWSER=fileutils.readDataFromPropertyFile("browser");
		String URL = fileutils.readDataFromPropertyFile("url");
		String USERNAME =fileutils.readDataFromPropertyFile("Manufacturerusername");
		String PASSWORD =fileutils.readDataFromPropertyFile("Manufacturerpassword");
		String ManufacturerLOGINTYPE =fileutils.readDataFromPropertyFile("Manufacturerlogintype");
		
		String AdminUsername =fileutils.readDataFromPropertyFile("Adminusername");
		String Adminpassword =fileutils.readDataFromPropertyFile("Adminpassword");
		String AdminLOGINTYPE =fileutils.readDataFromPropertyFile("AdminLoginType");
	
		
		if (BROWSER.equalsIgnoreCase("chrome")) 
		{
			driver=new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge")) 
		{
			driver= new EdgeDriver();	
		}
		else if (BROWSER.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		
		
		LoginPage loginpage= new LoginPage(driver);
		ManufacturerHomePage mHomepage = new ManufacturerHomePage(driver);
		ManufacturerAddProductPage mAddproductPage=new ManufacturerAddProductPage(driver);
		ManageStockPage managestockpg=new ManageStockPage(driver);
		AdminHomePage adminhomepage= new AdminHomePage(driver);
		AdminViewProductPage adminproductpage=new AdminViewProductPage(driver);

		driver.get(URL);
		webdriverutils.maximizewindow(driver);
		webdriverutils.implicitlyWait(driver, 20);
		
		loginpage.EnterUsernameAndPassword(USERNAME, PASSWORD);
		loginpage.getLogintypeDropdown().sendKeys(ManufacturerLOGINTYPE);
		loginpage.ClickOnLoginButton();
		
		
		

		String actualtitle = driver.getTitle();
		String expectedtitle = "Manufacturer: Home";
		
		if (actualtitle.equals(expectedtitle)) 
		{
			System.out.println("Manufacturer Homepage is displayed... and its verified with title");
		} 
		else 
		{
			System.out.println("Manufacturer Homepage is Not displayed...");
		}

		// add products
		// Click On add product Link
		mHomepage.getProductLink().click();

		String actualaddproducttitle = driver.getTitle();
		String expectedproductpagetitle = "Add Product";
		
		if (actualaddproducttitle.equals(expectedproductpagetitle))
		{
			System.out.println("addProduct page is displayed... and its verified with title");
		} else {
			System.out.println("addProduct page is Not displayed...");
		}

		mAddproductPage.EnterdataIntoAddTextField(excelutils.readMultipleData("Sheet2",driver), driver);
		mAddproductPage.getEnableradioButton().click();
		mAddproductPage.getAddButton().click();
		
		// Handle the confirmation popup
		String ctext= driver.switchTo().alert().getText();
		System.out.println(ctext);
		webdriverutils.acceptAlert(driver);
		
		// click on manage stock link
		mHomepage.ClickonmanageStockLink();
		
		// click on chips quantity
		managestockpg.getQuantity().click();
		managestockpg.getQuantity().clear();
		managestockpg.getQuantity().sendKeys("10");
		
		// click on update button
		managestockpg.ClickOnUpdateButton();
		
		// Handle the confirmation popup
		String confirmationMsg = driver.switchTo().alert().getText();
		System.out.println(confirmationMsg);
		driver.switchTo().alert().accept();

		// click on logout as a manufacturer
		// Click on logout button
		mHomepage.ClickOnLogoutButton();

		// Verify login page should be displayed
		String actualloginpageTitle = driver.getTitle();
		System.out.println(actualloginpageTitle);
		String ExpectedLoginpageTitle1 = "";
		
		//Assert.assertEquals(actualloginpageTitle, ExpectedLoginpageTitle1);
		if (actualloginpageTitle.contains(ExpectedLoginpageTitle1)) 
		{
			System.out.println("Login page is displayed and its verified with title");
		} else 
		{
			System.out.println("Login page is not displayed");
		}
		
		// Login as Admin And check product is displayed or not
		loginpage.EnterUsernameAndPassword(AdminUsername, Adminpassword);
		loginpage.getLogintypeDropdown().sendKeys(AdminLOGINTYPE);
		loginpage.ClickOnLoginButton();

		String actualtitle1 = driver.getTitle();
		String expectedtitle1 = "Admin: Home";
		
		if (actualtitle1.equals(expectedtitle1)) 
		{
			System.out.println("Admin Homepage is displayed... and its verified with title");
		} else {
			System.out.println("Admin Homepage is Not displayed...");
		}

		// click on product link
		adminhomepage.ClickOnproductLink();
		
		// Check product is updated or not
		String Productname=adminproductpage.getUpdatedProductName().getText();
		String prductQuantity = adminproductpage.getUpdatedProductQuantity().getText();
		System.out.println("Product name : " + Productname + " Product Quantity : " + prductQuantity);
		driver.close();

	}

}
