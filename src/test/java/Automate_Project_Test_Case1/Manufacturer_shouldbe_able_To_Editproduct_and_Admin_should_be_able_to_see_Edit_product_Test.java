package Automate_Project_Test_Case1;

	import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Com.POM.AdminHomePage;
import Com.POM.AdminViewProductPage;
import Com.POM.LoginPage;
import Com.POM.ManageStockPage;
import Com.POM.ManufacturerAddProductPage;
import Com.POM.ManufacturerHomePage;
import Com.POM.ProductEditPage;
import Com.POM.ProductListPage;
import Com.scmflex.GenericUtils.ExcelUtils;
import Com.scmflex.GenericUtils.FileUtils;
import Com.scmflex.GenericUtils.WebDriverUtils;

	public class Manufacturer_shouldbe_able_To_Editproduct_and_Admin_should_be_able_to_see_Edit_product_Test {
		@Test
		public void test() throws IOException

		{
			FileUtils fileutils = new FileUtils();
			WebDriverUtils webdriverutil = new WebDriverUtils();
			WebDriverUtils webdriverutils = new WebDriverUtils();
			ExcelUtils excelutils = new ExcelUtils();

			String BROWSER=fileutils.readDataFromPropertyFile("browser");
			String URL = fileutils.readDataFromPropertyFile("url");
			String USERNAME = fileutils.readDataFromPropertyFile("Manufacturerusername");
			String PASSWORD = fileutils.readDataFromPropertyFile("Manufacturerpassword");
			String ManufacturerLOGINTYPE = fileutils.readDataFromPropertyFile("Manufacturerlogintype");
			String AdminUsername = fileutils.readDataFromPropertyFile("Adminusername");
			String Adminpassword = fileutils.readDataFromPropertyFile("Adminpassword");
			String AdminLOGINTYPE = fileutils.readDataFromPropertyFile("AdminLoginType");

			WebDriver driver = new ChromeDriver();
			LoginPage loginpage = new LoginPage(driver);
			ManufacturerHomePage mHomepage = new ManufacturerHomePage(driver);
			ManufacturerAddProductPage mAddproductPage=new ManufacturerAddProductPage(driver);
			ManageStockPage managestockpg = new ManageStockPage(driver);
			AdminHomePage adminhomepage = new AdminHomePage(driver);
			AdminViewProductPage adminproductpage = new AdminViewProductPage(driver);
			ProductListPage productlistpage = new ProductListPage(driver);
			ProductEditPage editproductpage = new ProductEditPage(driver);

			driver.get(URL); 
			webdriverutil.maximizewindow(driver);
			webdriverutil.implicitlyWait(driver, 20);

			loginpage.EnterUsernameAndPassword(USERNAME, PASSWORD);
			loginpage.getLogintypeDropdown().sendKeys(ManufacturerLOGINTYPE);
			loginpage.ClickOnLoginButton();

			String actualtitle = driver.getTitle();
			String expectedtitle = "Manufacturer: Home";
			if (actualtitle.equals(expectedtitle)) 
			{
				System.out.println("Manufacturer Homepage is displayed... and its verified with title");
			} else {
				System.out.println("Manufacturer Homepage is Not displayed...");
			}

			// add products
			// Click On add product Link
			mHomepage.getAddProductLink().click();

			String actualaddproducttitle = driver.getTitle();
			String expectedproductpagetitle = "Add Product";
			if (actualaddproducttitle.equals(expectedproductpagetitle)) 
			{
				System.out.println("addProduct page is displayed... and its verified with title");
			} 
			else 
			{
				System.out.println("addProduct page is Not displayed...");
			}

			// Enter the data inside the product name textField
			mAddproductPage.EnterdataIntoAddTextField(excelutils.readMultipleData("sheet2",driver), driver);

			mAddproductPage.getEnableradioButton().click();
			mAddproductPage.getAddButton().click();

			// Handle alert and print the text
			String text = driver.switchTo().alert().getText();
			System.out.println(text);
			driver.switchTo().alert().accept();

			// click on product link
			mHomepage.getProductLink().click();

			// Edit the product
			productlistpage.getProductEditButton().click();

			// update the product
			editproductpage.ClickAndClearPricetextField();
			editproductpage.getPricetextField().sendKeys("29");
			editproductpage.getEnableRadioButton().click();
			editproductpage.getUpdateProductButton().click();

			// Handle alert and print the text
			String text2 = driver.switchTo().alert().getText();
			System.out.println(text2);
			driver.switchTo().alert().accept();

			// Click on logout button
			mHomepage.ClickOnLogoutButton();

			// Verify login page should be displayed
			String actualloginpageTitle = driver.getTitle();
			String ExpectedLoginpageTitle = "";
			if (actualloginpageTitle.equals(actualloginpageTitle)) 
			{
				System.out.println("Login page is displayed and its verified with title");
			} 
			else 
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
			} 
			else 
			{
				System.out.println("Admin Homepage is Not displayed...");
			}

			// click on product link
			mHomepage.getProductLink().click();

			// print product name along with value

			String productname = productlistpage.getProductname().getText();

			// updated product price
			String productPrice = productlistpage.getProductprice().getText();

			System.out.println("Updated Product Name : " + productname + "  " + "Updated Product price : " + productPrice);
			driver.close();

		}

	}
