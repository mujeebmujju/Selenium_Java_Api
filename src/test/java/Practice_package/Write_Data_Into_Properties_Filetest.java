package Practice_package;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_Data_Into_Properties_Filetest
{
	public static void main(String[] args) throws IOException 
	{
		Properties pObj = new Properties();
		pObj.setProperty("browser","Chrome");
		pObj.setProperty("url","https://www.facebook.com/");
		pObj.setProperty("username","admin");
		pObj.setProperty("password","admin");
		
		//create object for FileOutputStream
		FileOutputStream fOut = new FileOutputStream(".\\src\\test\\resources\\Common_Data.properties");
		pObj.store(fOut,"Write Data");
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\Common_Data.properties");
		pObj.load(fi);
		String BROWSER = pObj.getProperty("browser");
		String URL = pObj.getProperty("url");
		String USERNAME = pObj.getProperty("username");
		String PASSWORD = pObj.getProperty("password");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(PASSWORD);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
