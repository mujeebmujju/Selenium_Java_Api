package Com.POM;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ProductListPage 
	{
		@FindBy(xpath = "//td[text()=' Chips ']/preceding-sibling::td[text()=' 238 ']/parent::tr/descendant::img")
		private WebElement productEditButton;
		
		@FindBy(xpath = "//td[text()=' 238 ']/following-sibling::td[text()=' Chips ']")
		private WebElement productname;
		
		@FindBy(xpath ="//td[text()=' 238 ']/following-sibling::td[text()=' 29.000 ']")
		private WebElement productprice;
		
		public ProductListPage (WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		public WebElement getProductEditButton()
		{
			return productEditButton;
		}

		public WebElement getProductname() {
			return productname;
		}

		public WebElement getProductprice() {
			return productprice;
		}

		
		

	}


