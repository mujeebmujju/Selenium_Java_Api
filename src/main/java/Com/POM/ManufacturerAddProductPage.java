package Com.POM;

	import java.util.HashMap;
	import java.util.Map.Entry;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import Com.scmflex.GenericUtils.WebDriverUtils;


	public class ManufacturerAddProductPage extends WebDriverUtils
	{
		@FindBy(id = "product:name")
		private WebElement productName;
		
		@FindBy(id="product:price")
		private WebElement productprice;
		
		@FindBy(xpath = "//select[@id='product:unit']")
		private WebElement UnitDD;
		
		@FindBy(xpath = "//select[@id='product:category']")
		private WebElement CategoryDD;
		
		@FindBy(xpath = "//input[@value='1']")
		private WebElement enableradioButton;
		
		@FindBy(name = "txtProductDescription")
		private WebElement description;
		
		@FindBy(xpath = "//input[@value='Add Product']")
		private WebElement AddButton;
		
		// intialization
		
		public ManufacturerAddProductPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		// utilization
		
		public WebElement getProductName() 
		{
			return productName;
		}

		public WebElement getProductprice() 
		{
			return productprice;
		}

		public WebElement getUnitDD() 
		{
			return UnitDD;
		}

		public WebElement getCategoryDD() 
		{
			return CategoryDD;
		}

		public WebElement getEnableradioButton() 
		{
			return enableradioButton;
		}

		public WebElement getDescription() 
		{
			return description;
		}
		public WebElement getAddButton() 
		{
			return AddButton;
		}
		
		// business logic to enter all the data
		public void EnterAlltheProductdata(String productname,String productPrice, String unittype,String category,String Description )
		{
			productName.sendKeys(productname);
			productprice.sendKeys(productPrice);
			dropdown2(UnitDD, unittype);
			UnitDD.sendKeys(unittype);
			dropdown2(CategoryDD, category);
			CategoryDD.sendKeys(category);
			enableradioButton.click();
			description.sendKeys(Description);
			
			
			
		}
	   public void EnterdataIntoAddTextField(HashMap<String, String> map,WebDriver driver)
	   {
		   for(Entry<String, String> set:map.entrySet())
			{
				driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
			}
	   }
		
		
		
		
		
		
		

	}

