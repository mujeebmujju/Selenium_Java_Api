package Automate_Project_Test_Case1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Multiple_Browser_In_a_SingleWindow 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.open('https://www.flipkart.com');");
		
	}

}
