package Practice_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Popuptest {

	public static void main(String[] args) {
		
		//To launch browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		// enter url
		driver.get("https://www.ksrtc.in/oprs-web/");
		
		//wait for page load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on departure date
		driver.findElement(By.xpath("//input[@name=\"txtJourneyDate\"]")).click();
		
		//Select date
		driver.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]/descendant::a[text()='7']")).click();

	}

}
