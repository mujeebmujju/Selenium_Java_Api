package Xpath_practice;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FetchProductWithPriceFK 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the item to be searched");
		String item = s.nextLine();
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[.='✕']")).click();
		 WebElement searchTF = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		 searchTF.sendKeys(item);
		 searchTF.sendKeys(Keys.ENTER);
		 List<WebElement> products = driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//div[@class='_4rR01T']"));
		 List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		 for (int i = 0; i < products.size(); i++) {
			String product = products.get(i).getText();
			String eachPrice = price.get(i).getText();
			System.out.println(product+"======>"+eachPrice);
		}
		 s.close();
	}
}