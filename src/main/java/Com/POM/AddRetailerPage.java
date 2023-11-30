package Com.POM;

	import java.util.HashMap;
	import java.util.Map.Entry;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import Com.scmflex.GenericUtils.WebDriverUtils;

	public class AddRetailerPage extends WebDriverUtils
	{
		@FindBy(xpath = "//input[@name='txtRetailerUname']")
		private WebElement RetailerUnTBX;
		
		@FindBy(xpath = "//input[@name='txtRetailerPassword']")
		private WebElement RetailerPwdTBX;
		
		@FindBy(xpath = "//select[@name='cmbAreaCode']")
		private WebElement RetailerAreacode;
		
		@FindBy(xpath = "//input[@name='txtRetailerPhone']")
		private WebElement phoneNumberTBX;
		
		@FindBy(xpath = "//input[@name='txtRetailerEmail']")
		private WebElement RetailerEmailTBX;
		
		@FindBy(xpath = "//textarea[@name='txtRetailerAddress']")
		private WebElement RetailerAddressTBX;
		
		@FindBy(xpath = "//input[@value='Add Retailer']")
		private WebElement RetailerSubmitButton;
		
		public AddRetailerPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//Utilization

		public WebElement getRetailerUnTBX() {
			return RetailerUnTBX;
		}

		public WebElement getRetailerPwdTBX() {
			return RetailerPwdTBX;
		}

		public WebElement getRetailerAreacode() {
			return RetailerAreacode;
		}

		public WebElement getPhoneNumberTBX() {
			return phoneNumberTBX;
		}

		public WebElement getRetailerEmailTBX() {
			return RetailerEmailTBX;
		}

		public WebElement getRetailerAddressTBX() {
			return RetailerAddressTBX;
		}

		public WebElement getRetailerSubmitButton() {
			return RetailerSubmitButton;
		}
		// Business login
		public void EnterAreaCode(String AreaCode)
		{
			dropdown2(RetailerAreacode, AreaCode);
			RetailerAreacode.sendKeys(AreaCode);
			
		}
		 public void EnterdataIntoAddRetailertField(HashMap<String, String> map,WebDriver driver)
		   {
			   for(Entry<String, String> set:map.entrySet())
				{
					driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
				}
		   }
		
		

	}