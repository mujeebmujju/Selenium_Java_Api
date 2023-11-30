package Com.POM;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class RetailersPage 
	{
		@FindBy(xpath = "//input[@value='Delete']")
		private WebElement deleteRetailer;
		
		@FindBy(xpath = "//td[contains(.,'viratkohli')]/preceding-sibling::td/child::input")
		private WebElement checkbox;
		
		public RetailersPage(WebDriver driver )
		{
			PageFactory.initElements(driver, this);
		}

		public WebElement getDeleteRetailer() {
			return deleteRetailer;
		}

		public WebElement getCheckbox() {
			return checkbox;
		}

		
		

		
	}


