  package Xpath_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FetchLiveScoreCBZ 
{

	public static void main(String[] args) 
	{
		
	    WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
}
		


