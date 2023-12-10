package Automate_Project_Test_Case1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo_Test
{

	public static void main(String[] args) throws Throwable 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(20);
		driver.findElement(By.xpath("//div[text()='Decembet 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='20']")).click();
		
		
		

	}

}




















