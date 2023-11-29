package Practice_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IccRankingtest 
{
	public static void main(String[] args) {


		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		WebElement SA = driver.findElement(By.xpath("//span[text()='South Africa']"));
		System.out.println(SA.getText());
		
		try 
		{
			SA.isDisplayed();
			System.out.println("SA is Displayed");
			
		} 
		catch (Exception e) 
		{
			System.out.println("SA is not Displayed");
		
		}
		
	}

}


// we can use if else condition
