package Automate_Project_Test_Case1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.POM.AddRetailerPage;
import Com.POM.AdminHomePage;
import Com.POM.LoginPage;
import Com.POM.RetailersPage;
import Com.scmflex.GenericUtils.ExcelUtils;
import Com.scmflex.GenericUtils.FileUtils;
import Com.scmflex.GenericUtils.WebDriverUtils;

public class DeletingRetailer_Test {
	public static void main(String[] args) throws InterruptedException, Throwable {
		
		FileUtils fileutils= new FileUtils();
		String AdminUsername =fileutils.readDataFromPropertyFile("Adminusername");
		String Adminpassword =fileutils.readDataFromPropertyFile("Adminpassword");
		String AdminLOGINTYPE=fileutils.readDataFromPropertyFile("AdminLoginType");
		String URL = fileutils.readDataFromPropertyFile("url");
		
		WebDriver driver = new ChromeDriver();
		AdminHomePage adminhomepage = new AdminHomePage(driver);
		WebDriverUtils webdriverutils= new WebDriverUtils();
		RetailersPage retailerspage= new RetailersPage(driver);
				
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
		
		// Create Object For LoginPage 
		LoginPage loginpage= new LoginPage(driver);
		loginpage.EnterUsernameAndPassword(AdminUsername, Adminpassword);
		loginpage.EnterLoginType(AdminLOGINTYPE);
		loginpage.ClickOnLoginButton();
		
		// To check Admin Home Page is displayed 
		String actualtitle1 = driver.getTitle();
		String expectedtitle1 = "Admin: Home";
		if (actualtitle1.equals(expectedtitle1)) {
			System.out.println("Admin Homepage is displayed... and its verified with title");
		} else 
		{
			System.out.println("Admin Homepage is Not displayed...");
		}
		
		// click on add retailer Button
		adminhomepage.getAddRetailerslink().click();
		
		// Enter the reatiler details
		AddRetailerPage addretailerpage= new AddRetailerPage(driver);
		ExcelUtils excelutil= new ExcelUtils();
		
		// Enter all the data
		addretailerpage.EnterdataIntoAddRetailertField(excelutil.readMultipleData("sheet3",driver), driver);
		
		// click on submit button
		addretailerpage.getRetailerSubmitButton().click();
		
		// Handle Alert popup
		String confirmationMsgtext = driver.switchTo().alert().getText();
		System.out.println(confirmationMsgtext);
		webdriverutils.acceptAlert(driver);
		
		//deleteing the retailer
		adminhomepage.getRetailerslink().click();
		retailerspage.getCheckbox().click();
		retailerspage.getDeleteRetailer().click();
		
		// check Retailer is deleted or not
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		webdriverutils.acceptAlert(driver);
		
		// close the browser
		driver.quit();
		
	}

}