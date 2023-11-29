package Practice_package;

import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo_CalenderPopuptest {

	public static void main(String[] args) {
	
		// //To launch browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		// enter url
		driver.get("https://www.goibibo.com/");
		
		//wait for page load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on Login Page
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		//click on departure
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
         for(;;)
         {
        	 try 
        	 {
        		 driver.findElement(By.xpath(("//div[text()='November 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='15']"))).click();
        	
    
				
			 } 
        	 catch (Exception e) 
        	 {
        		 driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				
			 }
		
         }
	}
}
		

		
	    
		
         
      
	
		
		
	    
	    
	    
		
	
	

