 package Com.POM;
    
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class AdminViewProductPage 
	{
		@FindBy(xpath = "//td[contains(.,'238')]/following-sibling::td[contains(.,'Chips')]")
		private WebElement updatedProductName;
		
		@FindBy(xpath = "//td[text()=' 238 ']/following-sibling::td[text()=' 10 ']")
		private WebElement updatedProductQuantity;
		
		public AdminViewProductPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		public WebElement getUpdatedProductName() {
			return updatedProductName;
		}

		public WebElement getUpdatedProductQuantity() {
			return updatedProductQuantity;
		}
		// Business logic
			

	}


