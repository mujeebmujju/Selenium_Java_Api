package Practice_package;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class spoortskeeda 
{
   public static void main(String[] args) 
   {
    
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.sportskeeda.com/go/bangladesh-premier-league/points-table");
	   List<WebElement> header = driver.findElements(By.xpath("//table[@class='keeda-data-table']/thead/tr/th"));
	   List<WebElement> teams  = driver.findElements(By.xpath("//table[@class='keeda-data-table']/tbody/tr/td[2]"));
		   
		   for(int i=0; i<teams.size(); i++)
		    {
			   String value = teams.get(i).getText();
		   
	   }
	   
	

}
}