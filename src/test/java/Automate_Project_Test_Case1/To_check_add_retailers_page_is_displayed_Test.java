package Automate_Project_Test_Case1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.POM.AdminHomePage;
import Com.scmflex.GenericUtils.BaseClass;


//@Listeners(Com.scmflex.GenericUtils.Listeners.class)---ITest Listener to call the listeners at the class level
public class To_check_add_retailers_page_is_displayed_Test extends BaseClass 
{

	//@Test(retryAnalyzer = Com.scmflex.GenericUtils.RetryImpclass.class)---IRetryAnalyzer to call the listener at the class level
	@Test(retryAnalyzer = Com.scmflex.GenericUtils.RetryImpclass.class)
	public void test() throws InterruptedException, IOException
	{
		AdminHomePage adminhomepage=new AdminHomePage(driver); 
		
		//Verify The title
		String actualtitle = driver.getTitle();
		String expectedtitle="Admin: Home";
		
		Assert.fail();
//		if(actualtitle.equals(expectedtitle))
//		{
			System.out.println("Homepage is displayed... and its verified with title");
//		}
//		else
//		{
			System.out.println("Homepage is Not displayed...");
		//}
		// click on addretailer link
		adminhomepage.getAddRetailerslink().click();
		
		// To check Whether Add retailer page should displayed..
		String addproductactualtitle = driver.getTitle();
		String addproductexpectedtitle="Add Retailer";
		if(addproductactualtitle.equals(addproductexpectedtitle))
		{
			System.out.println("AddRetailer is displayed... and its verified with title");
		}
		else
		{
			System.out.println("AddRetailer is Not displayed...");
		}
		
				
	}
}

