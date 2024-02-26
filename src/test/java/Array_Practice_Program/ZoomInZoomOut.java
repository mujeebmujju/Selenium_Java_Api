package Array_Practice_Program;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoecarnival.com/");
		Thread.sleep(1000);
		Robot r =new Robot();
		for(int i=1; i<=3; i++)
		{
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ADD);
		r.keyPress(KeyEvent.VK_ADD);
		r.keyRelease(KeyEvent.VK_CONTROL);
		}
	   Thread.sleep(1000);
	   for(int i=1; i<=3; i++)
		{
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SUBTRACT);
		r.keyPress(KeyEvent.VK_SUBTRACT);
		r.keyRelease(KeyEvent.VK_CONTROL);
		}
	}
}






