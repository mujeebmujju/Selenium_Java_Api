package Automate_Project_TestCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Manufacturer_shouldbe_able_To_Editproduct_and_Admin_should_be_able_to_see_Edit_product 
{
	
public static void main(String[] args) throws IOException 

	

	{
		// Read data from properties file
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Common_Data.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String BROWSER = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
		String USERNAME = pobj.getProperty("Manufactureusername");
		String PASSWORD = pobj.getProperty("Manufacturepassword");
		String LOGINTYPE = pobj.getProperty("Manufacturelogintype");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
		WebElement username = driver.findElement(By.id("login:username"));
		username.click();
		username.sendKeys(USERNAME);
		WebElement password = driver.findElement(By.id("login:password"));
		password.clear();
		password.sendKeys(PASSWORD);
		WebElement dropdown = driver.findElement(By.id("login:type"));
		// dropdown.click();

		Select select = new Select(dropdown);
		select.selectByVisibleText(LOGINTYPE);
		WebElement loginbutton = driver.findElement(By.cssSelector("input[type='submit']"));
		loginbutton.click();

		String actualtitle = driver.getTitle();
		String expectedtitle = "Manufacturer: Home";
		if (actualtitle.equals(expectedtitle)) {
			System.out.println("ManufacturerHomepage is displayed... and its verified with title");
		} else {
			System.out.println("ManufacturerHomepage is Not displayed...");
		}

	
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
		FileInputStream fis2 = new FileInputStream(".\\src\\test\\resources\\Exceldata.xlsx");
		Workbook wb = WorkbookFactory.create(fis2);
		Sheet sh = wb.getSheet("ManufactureeditProduct");
		int count = sh.getLastRowNum();

		// Dropdown
		String unitType = sh.getRow(2).getCell(1).getStringCellValue();
		String category = sh.getRow(3).getCell(1).getStringCellValue();
		String categoryUpdate = sh.getRow(3).getCell(1).getStringCellValue();
		String unitTypeUpdate = sh.getRow(4).getCell(1).getStringCellValue();
		

		// Enter data in description
		String desc = sh.getRow(4).getCell(1).getStringCellValue();

		HashedMap<String, String> map = new HashedMap<String, String>();

		
		for (Entry<String, String> set : map.entrySet()) 
		{
			if (set.getKey().contains("product:name")) 
			{
				driver.findElement(By.id(set.getKey())).sendKeys(set.getValue());
			} 
			else if ((set.getKey().contains("product:price"))) 
			{
				driver.findElement(By.id(set.getKey())).sendKeys(set.getValue());

			}
		}

		// Handle Unit type dropdown
		WebElement unitdropdown = driver.findElement(By.xpath("//select[@name='cmbProductUnit']"));
		Select select2 = new Select(unitdropdown);
		select2.selectByVisibleText(unitType);

		// Handle category dropdown
		WebElement categorydropdown = driver.findElement(By.xpath("//select[@name='cmbProductCategory']"));
		Select select3 = new Select(categorydropdown);
		select3.selectByVisibleText(category);

		// click on Enable button
		driver.findElement(By.xpath("//input[@value='1']")).click();

		// click and enter the description
		WebElement description = driver.findElement(By.xpath("//textarea[@id='product:description']"));
		description.click();
		description.sendKeys(desc);

		// click on add button
		driver.findElement(By.xpath("//input[@value='Add Product']")).click();

		// Handle alert and print the text
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();

		// click on product link
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		
		//Edit the product
		WebElement editButton = driver.findElement(By.xpath("//td[text()=' Chips ']/preceding-sibling::td[text()=' 238 ']/parent::tr/descendant::img"));
		editButton.click();
		
		// Enter the price
		WebElement priceTextField = driver.findElement(By.xpath("//input[@id='product:price']"));
		priceTextField.click();
		priceTextField.clear();
		String price = sh.getRow(2).getCell(1).getStringCellValue();
		priceTextField.sendKeys(price);
		
		// click on Enable button
		driver.findElement(By.xpath("//input[@value='1']")).click();

       // Click on submit button
	   driver.findElement(By.xpath("//input[@value='Update Product']")).click();
	   //Handle alert and print the text
	   String text2 = driver.switchTo().alert().getText();
	   System.out.println(text2);
	   driver.switchTo().alert().accept();
	   driver.close();

	}

}




