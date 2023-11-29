package Com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageStockPage 

	{
		@FindBy(xpath = "//input[@value='Update Stock']")
		private WebElement UpdateButton;
		
		@FindBy(xpath = "//td[text()='238']/parent::tr/descendant::input[@type='text']")
		private WebElement Quantity;
		
		public ManageStockPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		public WebElement getUpdateButton()
		{
			return UpdateButton;
		}
		
		public WebElement getQuantity()
		{
			return Quantity;
		}
		
		// Business logic 
		public void ClickOnUpdateButton()
		{
			UpdateButton.click();
		}

	}


