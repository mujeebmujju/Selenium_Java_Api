package Practice_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountrynameMatchesandPositiontest
{
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	List<WebElement> CountryName = driver.findElements(By.xpath("//table/tbody/tr/td[2]/span[2]"));
	List<WebElement> Position = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
	List<WebElement> Matches = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
	for(int i=0; i<Position.size(); i++)
	{
		String CN = CountryName.get(i).getText();
		String PO = Position.get(i).getText();
		String MT = Matches.get(i).getText();
		System.out.println(CN+"---"+PO+"---"+MT);
	}
	}

}
