package Automate_Project_TestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.POM.AdminHomePage;
import Com.scmflex.GenericUtils.BaseClass;

public class To_check_add_retailers_page_is_displayedTest extends BaseClass
{
    @Test
	public void main(String[] args) throws InterruptedException, Throwable 
	{
		
//		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://rmgtestingserver/domain/Supply_Chain_Management/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.findElement(By.id("login:username")).sendKeys("admin");
//		driver.findElement(By.id("login:password")).sendKeys("admin123");
//		WebElement logintype = driver.findElement(By.id("login:type"));
//		
//		Select sel1=new Select(logintype);
//		sel1.selectByVisibleText("Admin");
//		
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
        AdminHomePage adhp=new AdminHomePage(driver);
        
        //verify the detail
		String actualtitle = driver.getTitle();
	    String expectedtitle = "Admin: Home";
		
	    if (actualtitle.equals(expectedtitle)) 
	    {
	    	System.out.println("home page is displayed...verified with tittle");
			
		}
	    else
	    {
	    	System.out.println("home page is not displayed...");
	    }
	    
		
		
		
		//driver.findElement(By.xpath("//a[.='Add Retailers']")).click();
		 //click on add retailer link
	     adhp.getAddRetailerslink().click();
		
		
	    //driver.findElement(By.xpath("//a[.='Add Retailers']")).click();
	    //to check whether add retailer page should display
	    String actualaddretailerpagetitle = driver.getTitle();
	    String expectedaddretailerpagedetail ="Add Retailer";
	    
	    if (actualaddretailerpagetitle.equalsIgnoreCase(expectedaddretailerpagedetail)) 
	    {
	    	System.out.println("Add retailer page is displayed..verified with title");
			
		}
	    else
	    {
	    	System.out.println("Add retailer page is not displayed..");
	    }
		
		
	}

}
