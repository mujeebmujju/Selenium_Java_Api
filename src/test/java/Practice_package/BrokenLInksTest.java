package Practice_package;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLInksTest {

	public static void main(String[] args) throws IOException 
	{
		
		//To launch browser
		WebDriver driver=new ChromeDriver();
				
		//maximize the window
	   driver.manage().window().maximize();
				
		// enter url
		driver.get("https://www.ksrtc.in/oprs-web/");
				
		//wait for page load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//find all the links present in webpage
		List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
		int size=AllLinks.size();
		System.out.println(size);	
		
		//create an empty array to store all broken links
		ArrayList<String> ArrLinks= new ArrayList<String>();
		
		//apply for loop to get the attribute name
		for(int i=0; i<AllLinks.size();i++)
		{
			String eachLink = AllLinks.get(i).getAttribute("href");
			URL url=null;
			int StatusCode=0;
			
			try 
			{
			
				url=new URL(eachLink);
				HttpsURLConnection httpsurlconn = (HttpsURLConnection)url.openConnection();
				StatusCode=httpsurlconn.getResponseCode();
				if(StatusCode>=400)
				{
					ArrLinks.add(eachLink);
					System.out.println(eachLink+"......."+StatusCode);
				}
			}
			catch
			(MalformedURLException e)
			{
				  
					System.out.println(eachLink+"......."+StatusCode);
			}
		}
	}
}