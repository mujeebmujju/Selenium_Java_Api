package Com.scmflex.GenericUtils;


import java.io.FileInputStream;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.POM.LoginPage;

public class Manufacturer_shouldbe_able_To_Editproduct_and_Admin_should_be_able_to_see_Edit_product  
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
	String MANUFACTURELOGINTYPE = fLib.readDataFromPropertyFile("Manufacturelogintype");
	
	

		WebDriver driver = new ChromeDriver();
		LoginPage lp=new LoginPage(driver);
        
		
		
		//driver.manage().window().maximize();
		wLib.maximizewindow(driver);
		
		//
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wLib.implicitlyWait(driver, 20);
		
		driver.get(URL);
		//lp.EnterUserNameandPassword(USERNAME, PASSWORD);
		lp.getUsername().sendKeys(USERNAME);
		lp.getPassword().sendKeys(PASSWORD);

		

//		WebElement username = driver.findElement(By.id("login:username"));
//		username.click();
//		username.sendKeys(USERNAME);
//		WebElement password = driver.findElement(By.id("login:password"));
//		password.clear();
//		password.sendKeys(PASSWORD);
//		WebElement dropdown = driver.findElement(By.id("login:type"));
//		
//		// dropdown.click();
//        //Select select = new Select(dropdown);
//		//select.selectByVisibleText("Manufacturer");
//		
//		wLib.dropdown2(dropdown, "Manufacturer");
//		WebElement loginbutton = driver.findElement(By.cssSelector("input[type='submit']"));
//		loginbutton.click();

		String actualtitle = driver.getTitle();
		String expectedtitle = "Manufacturer: Home";
		if (actualtitle.equals(expectedtitle)) {
			System.out.println("Manufacturer Homepage is displayed... and its verified with title");
		} else {
			System.out.println("Manufacturer Homepage is Not displayed...");
		}
		
//		Addpp.getAddProducts().click();
//		Addpp.EnterAllTheProductDetails(eLib.readMultipleData("Sheet1"), driver);
//		Addpp.getStockManagement().click();
//		Addpp.getSubmitButton().click();

		// Add products
		// Click On add product Link
		WebElement addProductLink = driver.findElement(By.xpath("//a[text()='Add Products']"));
		addProductLink.click();
		
		String actualaddproducttitle = driver.getTitle();
		String expectedproductpagetitle = "Add Product";
		if (actualaddproducttitle.equals(expectedproductpagetitle)) {
			System.out.println("addProduct page is displayed... and its verified with title");
		} else {
			System.out.println("addProduct page is Not displayed...");
		}

		
		
		
		// Excel Utility
		FileInputStream fis2 = new FileInputStream(".\\src\\test\\resources\\ManufacturerEditProduct.xlsx");
		HashMap<String, String> map = eLib.readMultipleData("Sheet1", driver);
		//Workbook wb = WorkbookFactory.create(fis2);
		//Sheet sh = wb.getSheet("sheet1");
     	//int count = sh.getLastRowNum();
		
		//HashMap<String, String> map = new HashMap<String, String>();

//		for (int i = 0; i <= count; i++)
//		{
//			String key = sh.getRow(i).getCell(0).getStringCellValue();
//			String value = sh.getRow(i).getCell(1).getStringCellValue();
//			map.put(key, value);

		
		for (Entry<String, String> set:map.entrySet()) 
		{
			driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
//			if (set.getKey().contains("txtProductName")) 
//			{
//				driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
//			} 
//				else if ((set.getKey().contains("txtProductPrice"))) 
//				{
//				//driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());

			//}
		}

		// Dropdown
		//String unitType =eLib.readDataFromExcel("Sheet1", 0, 4);          //sh.getRow(0).getCell(4).getStringCellValue();
		//String category = eLib.readDataFromExcel("Sheet1", 1, 4);        //sh.getRow(1).getCell(4).getStringCellValue();
		
		//String categoryUpdate = eLib.readDataFromExcel("Sheet1", 3, 1);  //sh.getRow(3).getCell(1).getStringCellValue();
		//String unitTypeUpdate = eLib.readDataFromExcel("Sheet1", 4, 1); //sh.getRow(4).getCell(1).getStringCellValue();
		

		// Enter data in description
		//String desc = eLib.readDataFromExcel("Sheet1", 0, 7);            //sh.getRow(0).getCell(7).getStringCellValue();

	
		
		//Excel Utility
		//driver.findElement(By.id(eLib.readDataFromExcel("Sheet1", 0, 0))).sendKeys(eLib.readDataFromExcel("Sheet1", 0, 1));
		//driver.findElement(By.id(eLib.readDataFromExcel("Sheet1", 1, 0))).sendKeys(eLib.readDataFromExcel("Sheet1", 1, 1));


		// Handle Unit type dropdown
		//WebElement unitdropdown = driver.findElement(By.xpath("//select[@name='cmbProductUnit']"));
		//Select select2 = new Select(unitdropdown);
		//select2.selectByVisibleText(unitType);
        // wLib.dropdown2(unitdropdown,unitType);
		
		// Handle category dropdown
		//WebElement categorydropdown = driver.findElement(By.xpath("//select[@name='cmbProductCategory']"));
		//Select select3 = new Select(categorydropdown);
		//select3.selectByVisibleText(category);
       //  wLib.dropdown2(categorydropdown, category);

		// click on Enable button
		driver.findElement(By.xpath("//input[@value='1']")).click();

		// click and enter the description
		//WebElement description = driver.findElement(By.xpath("//textarea[@id='product:description']"));
		//description.click();
		//description.sendKeys(desc);

		// click on add button
		driver.findElement(By.xpath("//input[@value='Add Product']")).click();

		// Handle alert and print the text
		String text = driver.switchTo().alert().getText();
	    System.out.println(text);
		//driver.switchTo().alert().accept();
		wLib.acceptAlert(driver);

		// click on product link
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		
		//Edit the product
		WebElement editButton = driver.findElement(By.xpath("//td[text()=' Chips ']/preceding-sibling::td[text()=' 238 ']/parent::tr/descendant::img"));
		editButton.click();
		
		// Enter the price
		WebElement priceTextField = driver.findElement(By.xpath("//input[@id='product:price']"));
		priceTextField.click();
		priceTextField.clear();
		String price = eLib.readDataFromExcel("Sheet1", 2, 1);      //sh.getRow(2).getCell(1).getStringCellValue();
		priceTextField.sendKeys(price);
		
		// click on Enable button
		driver.findElement(By.xpath("//input[@value='1']")).click();

       // Click on submit button
	   driver.findElement(By.xpath("//input[@value='Update Product']")).click();
	   
	   //Handle alert and print the text
	   String text2 = driver.switchTo().alert().getText();
	   System.out.println(text2);
	  // driver.switchTo().alert().accept();
	   wLib.acceptAlert(driver);
	   driver.close();

	}

}