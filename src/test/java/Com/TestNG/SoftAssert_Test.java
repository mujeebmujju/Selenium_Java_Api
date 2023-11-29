package Com.TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Test 
{
	@Test
	public void soft()
	{
		SoftAssert sa = new SoftAssert();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/Supply_Chain_Management/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String title = driver.getTitle();    
		String exp="SCM";

		
		sa.assertEquals(title, exp);
		System.out.println(title);
		sa.assertAll();
		
	}

}
