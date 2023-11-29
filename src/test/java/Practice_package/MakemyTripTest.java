package Practice_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTripTest {
	public static void main(String[] args) {
		
		        //To launch browser
				WebDriver driver=new ChromeDriver();
						
				//maximize the window
			   //driver.Window().manage().maximize();
						
				// enter url
				driver.get("https://www.ksrtc.in/oprs-web/");
						
				//wait for page load
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
